package f3;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4955a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f4956b;

    /* renamed from: c  reason: collision with root package name */
    public c f4957c;

    /* renamed from: d  reason: collision with root package name */
    public int f4958d = 0;

    public final boolean a() {
        return this.f4957c.f4947b != 0;
    }

    /* JADX WARNING: type inference failed for: r6v27, types: [java.util.List<f3.b>, java.util.ArrayList] */
    public final c b() {
        if (this.f4956b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f4957c;
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb2.append((char) c());
            }
            if (!sb2.toString().startsWith("GIF")) {
                this.f4957c.f4947b = 1;
            } else {
                this.f4957c.f4951f = f();
                this.f4957c.g = f();
                int c10 = c();
                c cVar = this.f4957c;
                cVar.f4952h = (c10 & 128) != 0;
                cVar.i = (int) Math.pow(2.0d, (double) ((c10 & 7) + 1));
                this.f4957c.f4953j = c();
                c cVar2 = this.f4957c;
                c();
                Objects.requireNonNull(cVar2);
                if (this.f4957c.f4952h && !a()) {
                    c cVar3 = this.f4957c;
                    cVar3.f4946a = e(cVar3.i);
                    c cVar4 = this.f4957c;
                    cVar4.f4954k = cVar4.f4946a[cVar4.f4953j];
                }
            }
            if (!a()) {
                boolean z = false;
                while (!z && !a() && this.f4957c.f4948c <= Integer.MAX_VALUE) {
                    int c11 = c();
                    if (c11 == 33) {
                        int c12 = c();
                        if (c12 == 1) {
                            g();
                        } else if (c12 == 249) {
                            this.f4957c.f4949d = new b();
                            c();
                            int c13 = c();
                            b bVar = this.f4957c.f4949d;
                            int i10 = (c13 & 28) >> 2;
                            bVar.g = i10;
                            if (i10 == 0) {
                                bVar.g = 1;
                            }
                            bVar.f4942f = (c13 & 1) != 0;
                            int f10 = f();
                            if (f10 < 2) {
                                f10 = 10;
                            }
                            b bVar2 = this.f4957c.f4949d;
                            bVar2.i = f10 * 10;
                            bVar2.f4943h = c();
                            c();
                        } else if (c12 == 254) {
                            g();
                        } else if (c12 != 255) {
                            g();
                        } else {
                            d();
                            StringBuilder sb3 = new StringBuilder();
                            for (int i11 = 0; i11 < 11; i11++) {
                                sb3.append((char) this.f4955a[i11]);
                            }
                            if (sb3.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    byte[] bArr = this.f4955a;
                                    if (bArr[0] == 1) {
                                        byte b10 = bArr[1];
                                        byte b11 = bArr[2];
                                        Objects.requireNonNull(this.f4957c);
                                    }
                                    if (this.f4958d <= 0) {
                                        break;
                                    }
                                } while (a());
                            } else {
                                g();
                            }
                        }
                    } else if (c11 == 44) {
                        c cVar5 = this.f4957c;
                        if (cVar5.f4949d == null) {
                            cVar5.f4949d = new b();
                        }
                        cVar5.f4949d.f4937a = f();
                        this.f4957c.f4949d.f4938b = f();
                        this.f4957c.f4949d.f4939c = f();
                        this.f4957c.f4949d.f4940d = f();
                        int c14 = c();
                        boolean z10 = (c14 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c14 & 7) + 1));
                        b bVar3 = this.f4957c.f4949d;
                        bVar3.f4941e = (c14 & 64) != 0;
                        if (z10) {
                            bVar3.f4945k = e(pow);
                        } else {
                            bVar3.f4945k = null;
                        }
                        this.f4957c.f4949d.f4944j = this.f4956b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.f4957c;
                            cVar6.f4948c++;
                            cVar6.f4950e.add(cVar6.f4949d);
                        }
                    } else if (c11 != 59) {
                        this.f4957c.f4947b = 1;
                    } else {
                        z = true;
                    }
                }
                c cVar7 = this.f4957c;
                if (cVar7.f4948c < 0) {
                    cVar7.f4947b = 1;
                }
            }
            return this.f4957c;
        }
    }

    public final int c() {
        try {
            return this.f4956b.get() & 255;
        } catch (Exception unused) {
            this.f4957c.f4947b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.f4958d = c10;
        if (c10 > 0) {
            int i = 0;
            int i10 = 0;
            while (true) {
                try {
                    int i11 = this.f4958d;
                    if (i < i11) {
                        i10 = i11 - i;
                        this.f4956b.get(this.f4955a, i, i10);
                        i += i10;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i10 + " blockSize: " + this.f4958d, e10);
                    }
                    this.f4957c.f4947b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f4956b.get(bArr);
            iArr = new int[256];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i) {
                int i12 = i11 + 1;
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i10 + 1;
                iArr[i10] = ((bArr[i11] & 255) << 16) | -16777216 | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
                i11 = i14;
                i10 = i15;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f4957c.f4947b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f4956b.getShort();
    }

    public final void g() {
        int c10;
        do {
            c10 = c();
            this.f4956b.position(Math.min(this.f4956b.position() + c10, this.f4956b.limit()));
        } while (c10 > 0);
    }
}
