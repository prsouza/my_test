package uf;

import com.google.android.gms.common.api.Api;
import e6.e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

public final class v implements h {

    /* renamed from: a  reason: collision with root package name */
    public final e f11989a = new e();

    /* renamed from: b  reason: collision with root package name */
    public boolean f11990b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f11991c;

    public v(b0 b0Var) {
        e.D(b0Var, "source");
        this.f11991c = b0Var;
    }

    public final long C(z zVar) {
        long j10 = 0;
        while (this.f11991c.I(this.f11989a, (long) LZ4Constants.HASH_TABLE_SIZE_64K) != -1) {
            long c10 = this.f11989a.c();
            if (c10 > 0) {
                j10 += c10;
                ((e) zVar).H(this.f11989a, c10);
            }
        }
        e eVar = this.f11989a;
        long j11 = eVar.f11952b;
        if (j11 <= 0) {
            return j10;
        }
        long j12 = j10 + j11;
        ((e) zVar).H(eVar, j11);
        return j12;
    }

    public final String F() {
        return W(Long.MAX_VALUE);
    }

    public final long I(e eVar, long j10) {
        e.D(eVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.d("byteCount < 0: ", j10).toString());
        } else if (!this.f11990b) {
            e eVar2 = this.f11989a;
            if (eVar2.f11952b == 0 && this.f11991c.I(eVar2, (long) LZ4Constants.HASH_TABLE_SIZE_64K) == -1) {
                return -1;
            }
            return this.f11989a.I(eVar, Math.min(j10, this.f11989a.f11952b));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final boolean J() {
        if (!(!this.f11990b)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f11989a.J() || this.f11991c.I(this.f11989a, (long) LZ4Constants.HASH_TABLE_SIZE_64K) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public final byte[] L(long j10) {
        i0(j10);
        return this.f11989a.L(j10);
    }

    public final String W(long j10) {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            byte b10 = (byte) 10;
            long a10 = a(b10, 0, j11);
            if (a10 != -1) {
                return vf.a.a(this.f11989a, a10);
            }
            if (j11 < Long.MAX_VALUE && v(j11) && this.f11989a.y(j11 - 1) == ((byte) 13) && v(1 + j11) && this.f11989a.y(j11) == b10) {
                return vf.a.a(this.f11989a, j11);
            }
            e eVar = new e();
            e eVar2 = this.f11989a;
            eVar2.w(eVar, 0, Math.min((long) 32, eVar2.f11952b));
            StringBuilder d10 = a.a.d("\\n not found: limit=");
            d10.append(Math.min(this.f11989a.f11952b, j10));
            d10.append(" content=");
            d10.append(eVar.O().i());
            d10.append("…");
            throw new EOFException(d10.toString());
        }
        throw new IllegalArgumentException(android.support.v4.media.a.d("limit < 0: ", j10).toString());
    }

    public final long a(byte b10, long j10, long j11) {
        boolean z = true;
        if (!this.f11990b) {
            long j12 = 0;
            if (j11 < 0) {
                z = false;
            }
            if (z) {
                while (j12 < j11) {
                    long B = this.f11989a.B(b10, j12, j11);
                    if (B != -1) {
                        return B;
                    }
                    e eVar = this.f11989a;
                    long j13 = eVar.f11952b;
                    if (j13 >= j11 || this.f11991c.I(eVar, (long) LZ4Constants.HASH_TABLE_SIZE_64K) == -1) {
                        return -1;
                    }
                    j12 = Math.max(j12, j13);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + 0 + " toIndex=" + j11).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final e b() {
        return this.f11989a;
    }

    public final h c() {
        return p.b(new t(this));
    }

    public final void close() {
        if (!this.f11990b) {
            this.f11990b = true;
            this.f11991c.close();
            this.f11989a.a();
        }
    }

    public final c0 d() {
        return this.f11991c.d();
    }

    public final long d0(i iVar) {
        e.D(iVar, "targetBytes");
        if (!this.f11990b) {
            long j10 = 0;
            while (true) {
                long E = this.f11989a.E(iVar, j10);
                if (E != -1) {
                    return E;
                }
                e eVar = this.f11989a;
                long j11 = eVar.f11952b;
                if (this.f11991c.I(eVar, (long) LZ4Constants.HASH_TABLE_SIZE_64K) == -1) {
                    return -1;
                }
                j10 = Math.max(j10, j11);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final int e() {
        i0(4);
        int readInt = this.f11989a.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final void i0(long j10) {
        if (!v(j10)) {
            throw new EOFException();
        }
    }

    public final boolean isOpen() {
        return !this.f11990b;
    }

    public final int l(r rVar) {
        e.D(rVar, "options");
        if (!this.f11990b) {
            while (true) {
                int b10 = vf.a.b(this.f11989a, rVar, true);
                if (b10 == -2) {
                    if (this.f11991c.I(this.f11989a, (long) LZ4Constants.HASH_TABLE_SIZE_64K) == -1) {
                        break;
                    }
                } else if (b10 != -1) {
                    this.f11989a.skip((long) rVar.f11976a[b10].h());
                    return b10;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final i p(long j10) {
        i0(j10);
        return this.f11989a.p(j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long q0() {
        /*
            r5 = this;
            r0 = 1
            r5.i0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.v(r2)
            if (r2 == 0) goto L_0x0062
            uf.e r2 = r5.f11989a
            long r3 = (long) r0
            byte r2 = r2.y(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            c3.k.T(r3)
            c3.k.T(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            e6.e.C(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            uf.e r0 = r5.f11989a
            long r0 = r0.q0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.v.q0():long");
    }

    public final String r0(Charset charset) {
        this.f11989a.x0(this.f11991c);
        e eVar = this.f11989a;
        Objects.requireNonNull(eVar);
        return eVar.S(eVar.f11952b, charset);
    }

    public final int read(ByteBuffer byteBuffer) {
        e.D(byteBuffer, "sink");
        e eVar = this.f11989a;
        if (eVar.f11952b == 0 && this.f11991c.I(eVar, (long) LZ4Constants.HASH_TABLE_SIZE_64K) == -1) {
            return -1;
        }
        return this.f11989a.read(byteBuffer);
    }

    public final byte readByte() {
        i0(1);
        return this.f11989a.readByte();
    }

    public final int readInt() {
        i0(4);
        return this.f11989a.readInt();
    }

    public final short readShort() {
        i0(2);
        return this.f11989a.readShort();
    }

    public final InputStream s0() {
        return new a(this);
    }

    public final void skip(long j10) {
        if (!this.f11990b) {
            while (j10 > 0) {
                e eVar = this.f11989a;
                if (eVar.f11952b == 0 && this.f11991c.I(eVar, (long) LZ4Constants.HASH_TABLE_SIZE_64K) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f11989a.f11952b);
                this.f11989a.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("buffer(");
        d10.append(this.f11991c);
        d10.append(')');
        return d10.toString();
    }

    public final boolean v(long j10) {
        e eVar;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.d("byteCount < 0: ", j10).toString());
        } else if (!this.f11990b) {
            do {
                eVar = this.f11989a;
                if (eVar.f11952b >= j10) {
                    return true;
                }
            } while (this.f11991c.I(eVar, (long) LZ4Constants.HASH_TABLE_SIZE_64K) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public static final class a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v f11992a;

        public a(v vVar) {
            this.f11992a = vVar;
        }

        public final int available() {
            v vVar = this.f11992a;
            if (!vVar.f11990b) {
                return (int) Math.min(vVar.f11989a.f11952b, (long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
            throw new IOException("closed");
        }

        public final void close() {
            this.f11992a.close();
        }

        public final int read() {
            v vVar = this.f11992a;
            if (!vVar.f11990b) {
                e eVar = vVar.f11989a;
                if (eVar.f11952b == 0 && vVar.f11991c.I(eVar, (long) LZ4Constants.HASH_TABLE_SIZE_64K) == -1) {
                    return -1;
                }
                return this.f11992a.f11989a.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return this.f11992a + ".inputStream()";
        }

        public final int read(byte[] bArr, int i, int i10) {
            e.D(bArr, "data");
            if (!this.f11992a.f11990b) {
                ah.v.B((long) bArr.length, (long) i, (long) i10);
                v vVar = this.f11992a;
                e eVar = vVar.f11989a;
                if (eVar.f11952b == 0 && vVar.f11991c.I(eVar, (long) LZ4Constants.HASH_TABLE_SIZE_64K) == -1) {
                    return -1;
                }
                return this.f11992a.f11989a.read(bArr, i, i10);
            }
            throw new IOException("closed");
        }
    }
}
