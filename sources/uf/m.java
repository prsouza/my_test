package uf;

import android.support.v4.media.a;
import e6.e;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class m implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public byte f11963a;

    /* renamed from: b  reason: collision with root package name */
    public final v f11964b;

    /* renamed from: c  reason: collision with root package name */
    public final Inflater f11965c;

    /* renamed from: s  reason: collision with root package name */
    public final n f11966s;

    /* renamed from: t  reason: collision with root package name */
    public final CRC32 f11967t = new CRC32();

    public m(b0 b0Var) {
        e.D(b0Var, "source");
        v vVar = new v(b0Var);
        this.f11964b = vVar;
        Inflater inflater = new Inflater(true);
        this.f11965c = inflater;
        this.f11966s = new n(vVar, inflater);
    }

    public final long I(e eVar, long j10) throws IOException {
        long j11;
        e eVar2 = eVar;
        long j12 = j10;
        e.D(eVar2, "sink");
        int i = (j12 > 0 ? 1 : (j12 == 0 ? 0 : -1));
        boolean z = false;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(a.d("byteCount < 0: ", j12).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f11963a == 0) {
                this.f11964b.i0(10);
                byte y10 = this.f11964b.f11989a.y(3);
                boolean z10 = ((y10 >> 1) & 1) == 1;
                if (z10) {
                    c(this.f11964b.f11989a, 0, 10);
                }
                v vVar = this.f11964b;
                vVar.i0(2);
                a("ID1ID2", 8075, vVar.f11989a.readShort());
                this.f11964b.skip(8);
                if (((y10 >> 2) & 1) == 1) {
                    this.f11964b.i0(2);
                    if (z10) {
                        c(this.f11964b.f11989a, 0, 2);
                    }
                    long R = (long) this.f11964b.f11989a.R();
                    this.f11964b.i0(R);
                    if (z10) {
                        j11 = R;
                        c(this.f11964b.f11989a, 0, R);
                    } else {
                        j11 = R;
                    }
                    this.f11964b.skip(j11);
                }
                if (((y10 >> 3) & 1) == 1) {
                    long a10 = this.f11964b.a((byte) 0, 0, Long.MAX_VALUE);
                    if (a10 != -1) {
                        if (z10) {
                            c(this.f11964b.f11989a, 0, a10 + 1);
                        }
                        this.f11964b.skip(a10 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((y10 >> 4) & 1) == 1) {
                    z = true;
                }
                if (z) {
                    long a11 = this.f11964b.a((byte) 0, 0, Long.MAX_VALUE);
                    if (a11 != -1) {
                        if (z10) {
                            c(this.f11964b.f11989a, 0, a11 + 1);
                        }
                        this.f11964b.skip(a11 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z10) {
                    v vVar2 = this.f11964b;
                    vVar2.i0(2);
                    a("FHCRC", vVar2.f11989a.R(), (short) ((int) this.f11967t.getValue()));
                    this.f11967t.reset();
                }
                this.f11963a = 1;
            }
            if (this.f11963a == 1) {
                long j13 = eVar2.f11952b;
                long I = this.f11966s.I(eVar2, j12);
                if (I != -1) {
                    c(eVar, j13, I);
                    return I;
                }
                this.f11963a = 2;
            }
            if (this.f11963a == 2) {
                a("CRC", this.f11964b.e(), (int) this.f11967t.getValue());
                a("ISIZE", this.f11964b.e(), (int) this.f11965c.getBytesWritten());
                this.f11963a = 3;
                if (!this.f11964b.J()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final void a(String str, int i, int i10) {
        if (i10 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i)}, 3));
            e.C(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    public final void c(e eVar, long j10, long j11) {
        w wVar = eVar.f11951a;
        e.B(wVar);
        while (true) {
            int i = wVar.f11995c;
            int i10 = wVar.f11994b;
            if (j10 < ((long) (i - i10))) {
                break;
            }
            j10 -= (long) (i - i10);
            wVar = wVar.f11998f;
            e.B(wVar);
        }
        while (j11 > 0) {
            int i11 = (int) (((long) wVar.f11994b) + j10);
            int min = (int) Math.min((long) (wVar.f11995c - i11), j11);
            this.f11967t.update(wVar.f11993a, i11, min);
            j11 -= (long) min;
            wVar = wVar.f11998f;
            e.B(wVar);
            j10 = 0;
        }
    }

    public final void close() throws IOException {
        this.f11966s.close();
    }

    public final c0 d() {
        return this.f11964b.d();
    }
}
