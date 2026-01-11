package i7;

import i7.q1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class l extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f6317b = Logger.getLogger(l.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f6318c = p1.f6348f;

    /* renamed from: a  reason: collision with root package name */
    public m f6319a;

    public static class b extends l {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f6320d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6321e;

        /* renamed from: f  reason: collision with root package name */
        public int f6322f;

        public b(byte[] bArr, int i) {
            super((a) null);
            int i10 = i + 0;
            if ((i | 0 | (bArr.length - i10)) >= 0) {
                this.f6320d = bArr;
                this.f6322f = 0;
                this.f6321e = i10;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
        }

        public final void C(byte b10) throws IOException {
            try {
                byte[] bArr = this.f6320d;
                int i = this.f6322f;
                this.f6322f = i + 1;
                bArr[i] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), 1}), e10);
            }
        }

        public final void D(int i, boolean z) throws IOException {
            P(i, 0);
            C(z ? (byte) 1 : 0);
        }

        public final void E(int i, i iVar) throws IOException {
            P(i, 2);
            V(iVar);
        }

        public final void F(int i, int i10) throws IOException {
            P(i, 5);
            G(i10);
        }

        public final void G(int i) throws IOException {
            try {
                byte[] bArr = this.f6320d;
                int i10 = this.f6322f;
                int i11 = i10 + 1;
                this.f6322f = i11;
                bArr[i10] = (byte) (i & 255);
                int i12 = i11 + 1;
                this.f6322f = i12;
                bArr[i11] = (byte) ((i >> 8) & 255);
                int i13 = i12 + 1;
                this.f6322f = i13;
                bArr[i12] = (byte) ((i >> 16) & 255);
                this.f6322f = i13 + 1;
                bArr[i13] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), 1}), e10);
            }
        }

        public final void H(int i, long j10) throws IOException {
            P(i, 1);
            I(j10);
        }

        public final void I(long j10) throws IOException {
            try {
                byte[] bArr = this.f6320d;
                int i = this.f6322f;
                int i10 = i + 1;
                this.f6322f = i10;
                bArr[i] = (byte) (((int) j10) & 255);
                int i11 = i10 + 1;
                this.f6322f = i11;
                bArr[i10] = (byte) (((int) (j10 >> 8)) & 255);
                int i12 = i11 + 1;
                this.f6322f = i12;
                bArr[i11] = (byte) (((int) (j10 >> 16)) & 255);
                int i13 = i12 + 1;
                this.f6322f = i13;
                bArr[i12] = (byte) (((int) (j10 >> 24)) & 255);
                int i14 = i13 + 1;
                this.f6322f = i14;
                bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
                int i15 = i14 + 1;
                this.f6322f = i15;
                bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
                int i16 = i15 + 1;
                this.f6322f = i16;
                bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
                this.f6322f = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), 1}), e10);
            }
        }

        public final void J(int i, int i10) throws IOException {
            P(i, 0);
            K(i10);
        }

        public final void K(int i) throws IOException {
            if (i >= 0) {
                R(i);
            } else {
                T((long) i);
            }
        }

        public final void L(int i, q0 q0Var, f1 f1Var) throws IOException {
            P(i, 2);
            R(((a) q0Var).f(f1Var));
            f1Var.b(q0Var, this.f6319a);
        }

        public final void M(int i, q0 q0Var) throws IOException {
            P(1, 3);
            Q(2, i);
            P(3, 2);
            R(q0Var.b());
            q0Var.a(this);
            P(1, 4);
        }

        public final void N(int i, i iVar) throws IOException {
            P(1, 3);
            Q(2, i);
            E(3, iVar);
            P(1, 4);
        }

        public final void O(int i, String str) throws IOException {
            P(i, 2);
            W(str);
        }

        public final void P(int i, int i10) throws IOException {
            R((i << 3) | i10);
        }

        public final void Q(int i, int i10) throws IOException {
            P(i, 0);
            R(i10);
        }

        public final void R(int i) throws IOException {
            if (l.f6318c && !d.a()) {
                int i10 = this.f6321e;
                int i11 = this.f6322f;
                if (i10 - i11 >= 5) {
                    if ((i & -128) == 0) {
                        byte[] bArr = this.f6320d;
                        this.f6322f = i11 + 1;
                        p1.q(bArr, (long) i11, (byte) i);
                        return;
                    }
                    byte[] bArr2 = this.f6320d;
                    this.f6322f = i11 + 1;
                    p1.q(bArr2, (long) i11, (byte) (i | 128));
                    int i12 = i >>> 7;
                    if ((i12 & -128) == 0) {
                        byte[] bArr3 = this.f6320d;
                        int i13 = this.f6322f;
                        this.f6322f = i13 + 1;
                        p1.q(bArr3, (long) i13, (byte) i12);
                        return;
                    }
                    byte[] bArr4 = this.f6320d;
                    int i14 = this.f6322f;
                    this.f6322f = i14 + 1;
                    p1.q(bArr4, (long) i14, (byte) (i12 | 128));
                    int i15 = i12 >>> 7;
                    if ((i15 & -128) == 0) {
                        byte[] bArr5 = this.f6320d;
                        int i16 = this.f6322f;
                        this.f6322f = i16 + 1;
                        p1.q(bArr5, (long) i16, (byte) i15);
                        return;
                    }
                    byte[] bArr6 = this.f6320d;
                    int i17 = this.f6322f;
                    this.f6322f = i17 + 1;
                    p1.q(bArr6, (long) i17, (byte) (i15 | 128));
                    int i18 = i15 >>> 7;
                    if ((i18 & -128) == 0) {
                        byte[] bArr7 = this.f6320d;
                        int i19 = this.f6322f;
                        this.f6322f = i19 + 1;
                        p1.q(bArr7, (long) i19, (byte) i18);
                        return;
                    }
                    byte[] bArr8 = this.f6320d;
                    int i20 = this.f6322f;
                    this.f6322f = i20 + 1;
                    p1.q(bArr8, (long) i20, (byte) (i18 | 128));
                    byte[] bArr9 = this.f6320d;
                    int i21 = this.f6322f;
                    this.f6322f = i21 + 1;
                    p1.q(bArr9, (long) i21, (byte) (i18 >>> 7));
                    return;
                }
            }
            while ((i & -128) != 0) {
                byte[] bArr10 = this.f6320d;
                int i22 = this.f6322f;
                this.f6322f = i22 + 1;
                bArr10[i22] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr11 = this.f6320d;
                int i23 = this.f6322f;
                this.f6322f = i23 + 1;
                bArr11[i23] = (byte) i;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), 1}), e10);
            }
        }

        public final void S(int i, long j10) throws IOException {
            P(i, 0);
            T(j10);
        }

        public final void T(long j10) throws IOException {
            if (!l.f6318c || this.f6321e - this.f6322f < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f6320d;
                    int i = this.f6322f;
                    this.f6322f = i + 1;
                    bArr[i] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f6320d;
                    int i10 = this.f6322f;
                    this.f6322f = i10 + 1;
                    bArr2[i10] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f6320d;
                    int i11 = this.f6322f;
                    this.f6322f = i11 + 1;
                    p1.q(bArr3, (long) i11, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f6320d;
                int i12 = this.f6322f;
                this.f6322f = i12 + 1;
                p1.q(bArr4, (long) i12, (byte) ((int) j10));
            }
        }

        public final void U(byte[] bArr, int i, int i10) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f6320d, this.f6322f, i10);
                this.f6322f += i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f6322f), Integer.valueOf(this.f6321e), Integer.valueOf(i10)}), e10);
            }
        }

        public final void V(i iVar) throws IOException {
            R(iVar.size());
            iVar.o(this);
        }

        public final void W(String str) throws IOException {
            int i = this.f6322f;
            try {
                int y10 = l.y(str.length() * 3);
                int y11 = l.y(str.length());
                if (y11 == y10) {
                    int i10 = i + y11;
                    this.f6322f = i10;
                    int b10 = q1.f6351a.b(str, this.f6320d, i10, this.f6321e - i10);
                    this.f6322f = i;
                    R((b10 - i) - y11);
                    this.f6322f = b10;
                    return;
                }
                R(q1.d(str));
                byte[] bArr = this.f6320d;
                int i11 = this.f6322f;
                this.f6322f = q1.f6351a.b(str, bArr, i11, this.f6321e - i11);
            } catch (q1.d e10) {
                this.f6322f = i;
                l.f6317b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e10);
                byte[] bytes = str.getBytes(z.f6396a);
                try {
                    R(bytes.length);
                    a(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e11) {
                    throw new c(e11);
                } catch (c e12) {
                    throw e12;
                }
            } catch (IndexOutOfBoundsException e13) {
                throw new c(e13);
            }
        }

        public final void a(byte[] bArr, int i, int i10) throws IOException {
            U(bArr, i, i10);
        }
    }

    public l() {
    }

    public static int A(long j10) {
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

    public static long B(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int b(int i) {
        return w(i) + 1;
    }

    public static int c(int i, i iVar) {
        int w6 = w(i);
        int size = iVar.size();
        return y(size) + size + w6;
    }

    public static int d(i iVar) {
        int size = iVar.size();
        return y(size) + size;
    }

    public static int e(int i) {
        return w(i) + 8;
    }

    public static int f(int i, int i10) {
        return l(i10) + w(i);
    }

    public static int g(int i) {
        return w(i) + 4;
    }

    public static int h(int i) {
        return w(i) + 8;
    }

    public static int i(int i) {
        return w(i) + 4;
    }

    @Deprecated
    public static int j(int i, q0 q0Var, f1 f1Var) {
        return ((a) q0Var).f(f1Var) + (w(i) * 2);
    }

    public static int k(int i, int i10) {
        return l(i10) + w(i);
    }

    public static int l(int i) {
        if (i >= 0) {
            return y(i);
        }
        return 10;
    }

    public static int m(int i, long j10) {
        return A(j10) + w(i);
    }

    public static int n(d0 d0Var) {
        int i;
        if (d0Var.f6247b != null) {
            i = d0Var.f6247b.size();
        } else {
            i = d0Var.f6246a != null ? d0Var.f6246a.b() : 0;
        }
        return y(i) + i;
    }

    public static int o(int i) {
        return w(i) + 4;
    }

    public static int p(int i) {
        return w(i) + 8;
    }

    public static int q(int i, int i10) {
        return r(i10) + w(i);
    }

    public static int r(int i) {
        return y((i >> 31) ^ (i << 1));
    }

    public static int s(int i, long j10) {
        return t(j10) + w(i);
    }

    public static int t(long j10) {
        return A(B(j10));
    }

    public static int u(int i, String str) {
        return v(str) + w(i);
    }

    public static int v(String str) {
        int i;
        try {
            i = q1.d(str);
        } catch (q1.d unused) {
            i = str.getBytes(z.f6396a).length;
        }
        return y(i) + i;
    }

    public static int w(int i) {
        return y((i << 3) | 0);
    }

    public static int x(int i, int i10) {
        return y(i10) + w(i);
    }

    public static int y(int i) {
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

    public static int z(int i, long j10) {
        return A(j10) + w(i);
    }

    public abstract void C(byte b10) throws IOException;

    public abstract void D(int i, boolean z) throws IOException;

    public abstract void E(int i, i iVar) throws IOException;

    public abstract void F(int i, int i10) throws IOException;

    public abstract void G(int i) throws IOException;

    public abstract void H(int i, long j10) throws IOException;

    public abstract void I(long j10) throws IOException;

    public abstract void J(int i, int i10) throws IOException;

    public abstract void K(int i) throws IOException;

    public abstract void L(int i, q0 q0Var, f1 f1Var) throws IOException;

    public abstract void M(int i, q0 q0Var) throws IOException;

    public abstract void N(int i, i iVar) throws IOException;

    public abstract void O(int i, String str) throws IOException;

    public abstract void P(int i, int i10) throws IOException;

    public abstract void Q(int i, int i10) throws IOException;

    public abstract void R(int i) throws IOException;

    public abstract void S(int i, long j10) throws IOException;

    public abstract void T(long j10) throws IOException;

    public l(a aVar) {
    }

    public static class c extends IOException {
        public c(String str, Throwable th2) {
            super(a8.a.c("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th2);
        }

        public c(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }
}
