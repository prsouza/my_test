package zb;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import zb.f;

public abstract class n extends android.support.v4.media.b {

    /* renamed from: v  reason: collision with root package name */
    public static final Logger f14346v = Logger.getLogger(n.class.getName());

    /* renamed from: w  reason: collision with root package name */
    public static final boolean f14347w = e.f14280c;

    /* renamed from: x  reason: collision with root package name */
    public static final long f14348x = e.f14281d;

    public static class b extends n {
        public int A;

        /* renamed from: y  reason: collision with root package name */
        public final byte[] f14349y;
        public final int z;

        public b(byte[] bArr, int i) {
            super((a) null);
            int i10 = i + 0;
            if ((i | 0 | (bArr.length - i10)) >= 0) {
                this.f14349y = bArr;
                this.A = 0;
                this.z = i10;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
        }

        public final void A2(int i, boolean z10) {
            W2((i << 3) | 0);
            z2(z10 ? (byte) 1 : 0);
        }

        public final void B2(byte[] bArr, int i) {
            W2(i);
            Y2(bArr, i);
        }

        public final void G2(int i, String str) {
            W2((i << 3) | 2);
            K2(str);
        }

        public final void H2(int i, h hVar) {
            W2((i << 3) | 2);
            W2(hVar.size());
            hVar.e(this);
        }

        public final void I2(int i, a0 a0Var) {
            W2((i << 3) | 2);
            W2(a0Var.a());
            a0Var.c(this);
        }

        public final void J2(long j10) {
            try {
                byte[] bArr = this.f14349y;
                int i = this.A;
                int i10 = i + 1;
                this.A = i10;
                bArr[i] = (byte) (((int) j10) & 255);
                int i11 = i10 + 1;
                this.A = i11;
                bArr[i10] = (byte) (((int) (j10 >> 8)) & 255);
                int i12 = i11 + 1;
                this.A = i12;
                bArr[i11] = (byte) (((int) (j10 >> 16)) & 255);
                int i13 = i12 + 1;
                this.A = i13;
                bArr[i12] = (byte) (((int) (j10 >> 24)) & 255);
                int i14 = i13 + 1;
                this.A = i14;
                bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
                int i15 = i14 + 1;
                this.A = i15;
                bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
                int i16 = i15 + 1;
                this.A = i16;
                bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
                this.A = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A), Integer.valueOf(this.z), 1}), e10);
            }
        }

        public final void K2(String str) {
            int i = this.A;
            try {
                int N2 = n.N2(str.length() * 3);
                int N22 = n.N2(str.length());
                if (N22 == N2) {
                    int i10 = i + N22;
                    this.A = i10;
                    int a10 = f.f14284a.a(str, this.f14349y, i10, this.z - i10);
                    this.A = i;
                    W2((a10 - i) - N22);
                    this.A = a10;
                    return;
                }
                W2(f.c(str));
                byte[] bArr = this.f14349y;
                int i11 = this.A;
                this.A = f.f14284a.a(str, bArr, i11, this.z - i11);
            } catch (f.c e10) {
                this.A = i;
                n.f14346v.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e10);
                byte[] bytes = str.getBytes(t.f14377a);
                try {
                    W2(bytes.length);
                    Y2(bytes, bytes.length);
                } catch (IndexOutOfBoundsException e11) {
                    throw new c(e11);
                } catch (c e12) {
                    throw e12;
                }
            } catch (IndexOutOfBoundsException e13) {
                throw new c(e13);
            }
        }

        public final void L2(h hVar) {
            W2(hVar.size());
            hVar.e(this);
        }

        public final void M2(a0 a0Var) {
            W2(a0Var.a());
            a0Var.c(this);
        }

        public final void O2(int i) {
            W2(45);
            R2(i);
        }

        public final void P2(int i, long j10) {
            W2((i << 3) | 1);
            J2(j10);
        }

        public final void Q2(long j10) {
            if (n.f14347w) {
                int i = this.z;
                int i10 = this.A;
                if (i - i10 >= 10) {
                    long j11 = n.f14348x + ((long) i10);
                    while ((j10 & -128) != 0) {
                        e.d(this.f14349y, j11, (byte) ((((int) j10) & 127) | 128));
                        this.A++;
                        j10 >>>= 7;
                        j11 = 1 + j11;
                    }
                    e.d(this.f14349y, j11, (byte) ((int) j10));
                    this.A++;
                    return;
                }
            }
            while ((j10 & -128) != 0) {
                byte[] bArr = this.f14349y;
                int i11 = this.A;
                this.A = i11 + 1;
                bArr[i11] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f14349y;
                int i12 = this.A;
                this.A = i12 + 1;
                bArr2[i12] = (byte) ((int) j10);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A), Integer.valueOf(this.z), 1}), e10);
            }
        }

        public final void R2(int i) {
            try {
                byte[] bArr = this.f14349y;
                int i10 = this.A;
                int i11 = i10 + 1;
                this.A = i11;
                bArr[i10] = (byte) (i & 255);
                int i12 = i11 + 1;
                this.A = i12;
                bArr[i11] = (byte) ((i >> 8) & 255);
                int i13 = i12 + 1;
                this.A = i13;
                bArr[i12] = (byte) ((i >> 16) & 255);
                this.A = i13 + 1;
                bArr[i13] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A), Integer.valueOf(this.z), 1}), e10);
            }
        }

        public final void S2(int i, int i10) {
            W2((i << 3) | 0);
            if (i10 >= 0) {
                W2(i10);
            } else {
                Q2((long) i10);
            }
        }

        public final void T2(int i, long j10) {
            W2((i << 3) | 0);
            Q2(j10);
        }

        public final void U2(int i) {
            if (i >= 0) {
                W2(i);
            } else {
                Q2((long) i);
            }
        }

        public final void V2(int i, int i10) {
            W2((i << 3) | i10);
        }

        public final void W2(int i) {
            if (n.f14347w) {
                int i10 = this.z;
                int i11 = this.A;
                if (i10 - i11 >= 10) {
                    long j10 = n.f14348x + ((long) i11);
                    while ((i & -128) != 0) {
                        e.d(this.f14349y, j10, (byte) ((i & 127) | 128));
                        this.A++;
                        i >>>= 7;
                        j10 = 1 + j10;
                    }
                    e.d(this.f14349y, j10, (byte) i);
                    this.A++;
                    return;
                }
            }
            while ((i & -128) != 0) {
                byte[] bArr = this.f14349y;
                int i12 = this.A;
                this.A = i12 + 1;
                bArr[i12] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr2 = this.f14349y;
                int i13 = this.A;
                this.A = i13 + 1;
                bArr2[i13] = (byte) i;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A), Integer.valueOf(this.z), 1}), e10);
            }
        }

        public final void X2(int i, int i10) {
            W2((i << 3) | 0);
            W2(i10);
        }

        public final void Y2(byte[] bArr, int i) {
            try {
                System.arraycopy(bArr, 0, this.f14349y, this.A, i);
                this.A += i;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A), Integer.valueOf(this.z), Integer.valueOf(i)}), e10);
            }
        }

        public final void z2(byte b10) {
            try {
                byte[] bArr = this.f14349y;
                int i = this.A;
                this.A = i + 1;
                bArr[i] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.A), Integer.valueOf(this.z), 1}), e10);
            }
        }
    }

    public static class c extends IOException {
        public c(String str, Throwable th2) {
            super(a8.a.c("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th2);
        }

        public c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    public n() {
    }

    public n(a aVar) {
    }

    public static int C2(int i) {
        if (i >= 0) {
            return N2(i);
        }
        return 10;
    }

    public static int D2(int i) {
        return N2((i << 3) | 0);
    }

    public static int E2(int i, int i10) {
        return N2(i10) + D2(i);
    }

    public static int F2(int i, long j10) {
        return x2(j10) + D2(i);
    }

    public static int N2(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int r2(int i) {
        return D2(i) + 8;
    }

    public static int s2(int i, int i10) {
        return C2(i10) + D2(i);
    }

    public static int t2(int i, long j10) {
        return x2(j10) + D2(i);
    }

    public static int u2(int i, String str) {
        return y2(str) + D2(i);
    }

    public static int v2(int i, h hVar) {
        int D2 = D2(i);
        int size = hVar.size();
        return N2(size) + size + D2;
    }

    public static int w2(int i, a0 a0Var) {
        int D2 = D2(i);
        int a10 = a0Var.a();
        return N2(a10) + a10 + D2;
    }

    public static int x2(long j10) {
        int i;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            i = 6;
            j10 >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j10) != 0) {
            i += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i + 1 : i;
    }

    public static int y2(String str) {
        int i;
        try {
            i = f.c(str);
        } catch (f.c unused) {
            i = str.getBytes(t.f14377a).length;
        }
        return N2(i) + i;
    }

    public abstract void A2(int i, boolean z);

    public abstract void B2(byte[] bArr, int i);

    public abstract void G2(int i, String str);

    public abstract void H2(int i, h hVar);

    public abstract void I2(int i, a0 a0Var);

    public abstract void J2(long j10);

    public abstract void K2(String str);

    public abstract void L2(h hVar);

    public abstract void M2(a0 a0Var);

    public abstract void O2(int i);

    public abstract void P2(int i, long j10);

    public abstract void Q2(long j10);

    public abstract void R2(int i);

    public abstract void S2(int i, int i10);

    public abstract void T2(int i, long j10);

    public abstract void U2(int i);

    public abstract void V2(int i, int i10);

    public abstract void W2(int i);

    public abstract void X2(int i, int i10);

    public abstract void z2(byte b10);
}
