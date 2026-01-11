package p4;

import b9.m;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.maps.R;
import h4.g;
import h4.h;
import h4.k;
import i4.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import m4.a;
import n4.c;
import n4.e;
import n4.f;

public final class d extends b {
    public static final Charset X = Charset.forName("UTF-8");
    public static final int[] Y = a.f9653a;
    public static final double Z = Math.pow(2.0d, 10.0d);

    /* renamed from: a0  reason: collision with root package name */
    public static final double f9661a0 = Math.pow(2.0d, -14.0d);
    public static final BigInteger b0;

    /* renamed from: c0  reason: collision with root package name */
    public static final BigInteger f9662c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final BigInteger f9663d0;

    /* renamed from: e0  reason: collision with root package name */
    public static final BigInteger f9664e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final BigDecimal f9665f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final BigDecimal f9666g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final BigDecimal f9667h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final BigDecimal f9668i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final BigInteger f9669j0 = BigInteger.ONE.shiftLeft(63);
    public final f A;
    public c B = null;
    public byte[] C;
    public int D = -1;
    public InputStream E;
    public byte[] F;
    public boolean G;
    public boolean H = false;
    public int I;
    public int J;
    public int K;
    public final m4.a L;
    public int[] M = b.f6182s;
    public int N;
    public int O;
    public int P;
    public int Q = 0;
    public int R;
    public long S;
    public float T;
    public double U;
    public BigInteger V;
    public BigDecimal W;

    /* renamed from: t  reason: collision with root package name */
    public final k4.b f9670t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9671u;

    /* renamed from: v  reason: collision with root package name */
    public int f9672v;

    /* renamed from: w  reason: collision with root package name */
    public int f9673w;

    /* renamed from: x  reason: collision with root package name */
    public long f9674x = 0;

    /* renamed from: y  reason: collision with root package name */
    public long f9675y = 0;
    public f z;

    public enum a {
        ;
        
        public final boolean _defaultState;
        public final int _mask;

        private a(boolean z) {
            this._defaultState = z;
            this._mask = 1 << ordinal();
        }

        public static int collectDefaults() {
            int i = 0;
            for (a aVar : values()) {
                if (aVar.enabledByDefault()) {
                    i |= aVar.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        b0 = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        f9662c0 = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f9663d0 = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        f9664e0 = valueOf4;
        f9665f0 = new BigDecimal(valueOf3);
        f9666g0 = new BigDecimal(valueOf4);
        f9667h0 = new BigDecimal(valueOf);
        f9668i0 = new BigDecimal(valueOf2);
    }

    public d(k4.b bVar, int i, m4.a aVar, InputStream inputStream, byte[] bArr, int i10, int i11, boolean z10) {
        super(i);
        this.f9670t = bVar;
        this.L = aVar;
        this.E = inputStream;
        this.F = bArr;
        this.f9672v = i10;
        this.f9673w = i11;
        this.G = z10;
        this.A = new f(bVar.f7439c);
        this.z = new f((f) null, h.a.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? new l4.a(this) : null, 0, -1);
    }

    public final void A0() throws IOException {
        int i;
        int i10;
        byte b10;
        char[] c10 = this.A.c();
        int[] iArr = Y;
        int length = c10.length;
        byte[] bArr = this.F;
        this.K = this.f9672v;
        this.J = 0;
        int i11 = 0;
        while (true) {
            if (this.f9672v >= this.K) {
                if (this.J == 0) {
                    int p02 = p0(3);
                    if (p02 < 0) {
                        this.A.g = i11;
                        return;
                    }
                    this.J = p02;
                    int i12 = this.f9672v + p02;
                    int i13 = this.f9673w;
                    if (i12 <= i13) {
                        this.J = 0;
                        this.K = i12;
                    } else {
                        this.J = i12 - i13;
                        this.K = i13;
                    }
                }
                if (this.f9672v >= this.f9673w) {
                    U0();
                    int i14 = this.f9672v + this.J;
                    int i15 = this.f9673w;
                    if (i14 <= i15) {
                        this.J = 0;
                        this.K = i14;
                    } else {
                        this.J = i14 - i15;
                        this.K = i15;
                    }
                }
            }
            int i16 = this.f9672v;
            this.f9672v = i16 + 1;
            byte b11 = bArr[i16] & 255;
            int i17 = iArr[b11];
            if (i17 != 0 || i11 >= length) {
                if (i17 != 0) {
                    if (i17 == 1) {
                        i10 = I0();
                        if ((i10 & 192) == 128) {
                            b10 = b11 & 31;
                        } else {
                            N0(i10 & 255, this.f9672v);
                            throw null;
                        }
                    } else if (i17 == 2) {
                        byte b12 = b11 & 15;
                        int I0 = I0();
                        if ((I0 & 192) == 128) {
                            b10 = (b12 << 6) | (I0 & 63);
                            i10 = I0();
                            if ((i10 & 192) != 128) {
                                N0(i10 & 255, this.f9672v);
                                throw null;
                            }
                        } else {
                            N0(I0 & 255, this.f9672v);
                            throw null;
                        }
                    } else if (i17 == 3) {
                        int I02 = I0();
                        if ((I02 & 192) == 128) {
                            int i18 = ((b11 & 7) << 6) | (I02 & 63);
                            int I03 = I0();
                            if ((I03 & 192) == 128) {
                                int i19 = (i18 << 6) | (I03 & 63);
                                int I04 = I0();
                                if ((I04 & 192) == 128) {
                                    int i20 = ((i19 << 6) | (I04 & 63)) - LZ4Constants.MAX_DISTANCE;
                                    if (i11 >= c10.length) {
                                        c10 = this.A.d();
                                        length = c10.length;
                                        i11 = 0;
                                    }
                                    c10[i11] = (char) (55296 | (i20 >> 10));
                                    b11 = (i20 & 1023) | 56320;
                                    i11++;
                                } else {
                                    N0(I04 & 255, this.f9672v);
                                    throw null;
                                }
                            } else {
                                N0(I03 & 255, this.f9672v);
                                throw null;
                            }
                        } else {
                            N0(I02 & 255, this.f9672v);
                            throw null;
                        }
                    } else {
                        M0(b11);
                        throw null;
                    }
                    b11 = (b10 << 6) | (i10 & 63);
                }
                if (i11 >= length) {
                    c10 = this.A.d();
                    length = c10.length;
                    i11 = 0;
                }
                i = i11 + 1;
                c10[i11] = (char) b11;
            } else {
                i = i11 + 1;
                c10[i11] = (char) b11;
            }
            i11 = i;
        }
    }

    public final String B(int i, String str) {
        if (i < 5) {
            m4.a aVar = this.L;
            int i10 = this.N;
            aVar.f();
            if (aVar.f8472d) {
                str = e.f8911b.a(str);
            }
            int c10 = aVar.c(aVar.h(i10));
            int[] iArr = aVar.f8474f;
            iArr[c10] = i10;
            iArr[c10 + 3] = 1;
            aVar.f8478l[c10 >> 2] = str;
            aVar.f8477k++;
            return str;
        } else if (i < 9) {
            m4.a aVar2 = this.L;
            int i11 = this.N;
            int i12 = this.O;
            aVar2.f();
            if (aVar2.f8472d) {
                str = e.f8911b.a(str);
            }
            int c11 = aVar2.c(i12 == 0 ? aVar2.h(i11) : aVar2.i(i11, i12));
            int[] iArr2 = aVar2.f8474f;
            iArr2[c11] = i11;
            iArr2[c11 + 1] = i12;
            iArr2[c11 + 3] = 2;
            aVar2.f8478l[c11 >> 2] = str;
            aVar2.f8477k++;
            return str;
        } else if (i < 13) {
            m4.a aVar3 = this.L;
            int i13 = this.N;
            int i14 = this.O;
            int i15 = this.P;
            aVar3.f();
            if (aVar3.f8472d) {
                str = e.f8911b.a(str);
            }
            int c12 = aVar3.c(aVar3.j(i13, i14, i15));
            int[] iArr3 = aVar3.f8474f;
            iArr3[c12] = i13;
            iArr3[c12 + 1] = i14;
            iArr3[c12 + 2] = i15;
            iArr3[c12 + 3] = 3;
            aVar3.f8478l[c12 >> 2] = str;
            aVar3.f8477k++;
            return str;
        } else {
            return this.L.g(str, this.M, (i + 3) >> 2);
        }
    }

    public final void B0(int i) throws IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char[] c10 = this.A.c();
        int[] iArr = Y;
        int length = c10.length;
        int i16 = 0;
        while (true) {
            i--;
            if (i >= 0) {
                int H0 = H0() & 255;
                int i17 = iArr[H0];
                if (i17 != 0 || i10 >= length) {
                    i -= i17;
                    if (i >= 0) {
                        if (i17 != 0) {
                            if (i17 == 1) {
                                i14 = H0();
                                if ((i14 & 192) == 128) {
                                    i15 = H0 & 31;
                                } else {
                                    N0(i14 & 255, this.f9672v);
                                    throw null;
                                }
                            } else if (i17 == 2) {
                                int i18 = H0 & 15;
                                int H02 = H0();
                                if ((H02 & 192) == 128) {
                                    i15 = (i18 << 6) | (H02 & 63);
                                    i14 = H0();
                                    if ((i14 & 192) != 128) {
                                        N0(i14 & 255, this.f9672v);
                                        throw null;
                                    }
                                } else {
                                    N0(H02 & 255, this.f9672v);
                                    throw null;
                                }
                            } else if (i17 == 3) {
                                int H03 = H0();
                                if ((H03 & 192) == 128) {
                                    int i19 = ((H0 & 7) << 6) | (H03 & 63);
                                    int H04 = H0();
                                    if ((H04 & 192) == 128) {
                                        int i20 = (i19 << 6) | (H04 & 63);
                                        int H05 = H0();
                                        if ((H05 & 192) == 128) {
                                            int i21 = ((i20 << 6) | (H05 & 63)) - LZ4Constants.MAX_DISTANCE;
                                            int i22 = i10 + 1;
                                            c10[i10] = (char) (55296 | (i21 >> 10));
                                            if (i22 >= c10.length) {
                                                c10 = this.A.d();
                                                length = c10.length;
                                                i10 = 0;
                                            } else {
                                                i10 = i22;
                                            }
                                            i12 = 56320;
                                            i13 = i21 & 1023;
                                            H0 = i13 | i12;
                                        } else {
                                            N0(H05 & 255, this.f9672v);
                                            throw null;
                                        }
                                    } else {
                                        N0(H04 & 255, this.f9672v);
                                        throw null;
                                    }
                                } else {
                                    N0(H03 & 255, this.f9672v);
                                    throw null;
                                }
                            } else {
                                M0(H0);
                                throw null;
                            }
                            i13 = i15 << 6;
                            i12 = i14 & 63;
                            H0 = i13 | i12;
                        }
                        if (i10 >= length) {
                            c10 = this.A.d();
                            length = c10.length;
                            i10 = 0;
                        }
                        i11 = i10 + 1;
                        c10[i10] = (char) H0;
                    } else {
                        throw new g((h) this, "Malformed UTF-8 character at end of long (non-chunked) text segment");
                    }
                } else {
                    i11 = i10 + 1;
                    c10[i10] = (char) H0;
                }
                i16 = i11;
            } else {
                this.A.g = i10;
                return;
            }
        }
    }

    public final String C0(int i) throws IOException {
        int i10;
        char[] c10 = this.A.c();
        if (c10.length < i) {
            f fVar = this.A;
            char[] cArr = fVar.f8918f;
            if (cArr.length < i) {
                cArr = Arrays.copyOf(cArr, i);
                fVar.f8918f = cArr;
            }
            c10 = cArr;
        }
        int i11 = 0;
        int i12 = this.f9672v;
        this.f9672v = i12 + i;
        byte[] bArr = this.F;
        int i13 = i + i12;
        while (true) {
            byte b10 = bArr[i12];
            if (b10 >= 0) {
                int i14 = i11 + 1;
                c10[i11] = (char) b10;
                i12++;
                if (i12 == i13) {
                    return this.A.f(i14);
                }
                i11 = i14;
            } else {
                int[] iArr = Y;
                while (true) {
                    int i15 = i12 + 1;
                    byte b11 = bArr[i12] & 255;
                    int i16 = iArr[b11];
                    if (i16 != 0) {
                        if (i16 == 1) {
                            i10 = i15 + 1;
                            b11 = ((b11 & 31) << 6) | (bArr[i15] & 63);
                        } else if (i16 == 2) {
                            int i17 = i15 + 1;
                            byte b12 = ((b11 & 15) << 12) | ((bArr[i15] & 63) << 6);
                            i15 = i17 + 1;
                            b11 = b12 | (bArr[i17] & 63);
                        } else if (i16 == 3) {
                            int i18 = i15 + 1;
                            byte b13 = ((b11 & 7) << 18) | ((bArr[i15] & 63) << 12);
                            int i19 = i18 + 1;
                            byte b14 = b13 | ((bArr[i18] & 63) << 6);
                            i10 = i19 + 1;
                            int i20 = (b14 | (bArr[i19] & 63)) - LZ4Constants.MAX_DISTANCE;
                            c10[i11] = (char) (55296 | (i20 >> 10));
                            b11 = 56320 | (i20 & 1023);
                            i11++;
                        } else {
                            StringBuilder d10 = a.a.d("Invalid byte ");
                            d10.append(Integer.toHexString(b11));
                            d10.append(" in Unicode text block");
                            e(d10.toString());
                            throw null;
                        }
                        i15 = i10;
                    }
                    int i21 = i11 + 1;
                    c10[i11] = (char) b11;
                    if (i15 >= i13) {
                        return this.A.f(i21);
                    }
                    i12 = i15;
                    i11 = i21;
                }
            }
        }
    }

    public final void D0() throws IOException {
        this.D = -1;
        close();
        this.f6183b = null;
    }

    public final BigInteger E(long j10) {
        return BigInteger.valueOf((j10 << 1) >>> 1).or(f9669j0);
    }

    public final k E0(int i) throws IOException {
        boolean z10;
        if (i == 2) {
            z10 = false;
        } else if (i == 3) {
            z10 = true;
        } else {
            k kVar = k.VALUE_EMBEDDED_OBJECT;
            this.f6183b = kVar;
            return kVar;
        }
        this.H = false;
        int i10 = this.I;
        int i11 = (i10 >> 5) & 7;
        int i12 = i10 & 31;
        if (i11 == 3) {
            int v02 = v0(i12);
            if (v02 > 0) {
                if (v02 > this.f9673w - this.f9672v) {
                    if (v02 >= this.F.length) {
                        B0(v02);
                    } else {
                        G0(v02);
                    }
                }
                C0(v02);
            } else if (v02 < 0) {
                A0();
            } else {
                this.A.e();
            }
        } else if (i11 == 2) {
            this.C = z0(v0(i12));
        } else {
            s();
            throw null;
        }
        BigInteger bigInteger = new BigInteger(this.C);
        if (z10) {
            bigInteger = bigInteger.negate();
        }
        this.V = bigInteger;
        this.Q = 4;
        this.D = -1;
        k kVar2 = k.VALUE_NUMBER_INT;
        this.f6183b = kVar2;
        return kVar2;
    }

    public final void F0(int i) throws g {
        int i10 = i & 255;
        if (i10 == 255) {
            throw new g((h) this, "Mismatched BREAK byte (0xFF): encountered where value expected");
        }
        StringBuilder d10 = a.a.d("Invalid CBOR value token (first byte): 0x");
        d10.append(Integer.toHexString(i10));
        throw new g((h) this, d10.toString());
    }

    public final void G0(int i) throws IOException {
        if (this.E != null) {
            int i10 = this.f9673w;
            int i11 = this.f9672v;
            int i12 = i10 - i11;
            if (i12 <= 0 || i11 <= 0) {
                this.f9673w = 0;
            } else {
                byte[] bArr = this.F;
                System.arraycopy(bArr, i11, bArr, 0, i12);
                this.f9673w = i12;
            }
            this.f9674x += (long) this.f9672v;
            this.f9672v = 0;
            while (true) {
                int i13 = this.f9673w;
                if (i13 < i) {
                    InputStream inputStream = this.E;
                    byte[] bArr2 = this.F;
                    int read = inputStream.read(bArr2, i13, bArr2.length - i13);
                    if (read < 1) {
                        S();
                        if (read == 0) {
                            throw new IOException(a8.a.b("InputStream.read() returned 0 characters when trying to read ", i12, " bytes"));
                        }
                        throw new g((h) this, "Needed to read " + i + " bytes, missed " + i + " before end-of-input");
                    }
                    this.f9673w += read;
                } else {
                    return;
                }
            }
        } else {
            throw new g((h) this, a8.a.b("Needed to read ", i, " bytes, reached end-of-input"));
        }
    }

    public final int H0() throws IOException {
        int i = this.f9672v;
        if (i < this.f9673w) {
            byte b10 = this.F[i];
            this.f9672v = i + 1;
            return b10;
        }
        U0();
        byte[] bArr = this.F;
        int i10 = this.f9672v;
        this.f9672v = i10 + 1;
        return bArr[i10];
    }

    public final int I0() throws IOException {
        int i = this.f9672v;
        if (i >= this.K) {
            if (i >= this.f9673w) {
                U0();
                int i10 = this.J;
                if (i10 > 0) {
                    int i11 = this.f9672v;
                    int i12 = i10 + i11;
                    int i13 = this.f9673w;
                    if (i12 <= i13) {
                        this.J = 0;
                        this.K = i12;
                    } else {
                        this.J = i12 - i13;
                        this.K = i13;
                    }
                    byte[] bArr = this.F;
                    this.f9672v = i11 + 1;
                    return bArr[i11];
                }
            }
            int p02 = p0(3);
            if (p02 >= 0) {
                int i14 = this.f9672v;
                int i15 = p02 + i14;
                int i16 = this.f9673w;
                if (i15 <= i16) {
                    this.J = 0;
                    this.K = i15;
                } else {
                    this.J = i15 - i16;
                    this.K = i16;
                }
                byte[] bArr2 = this.F;
                this.f9672v = i14 + 1;
                return bArr2[i14];
            }
            f(": chunked Text ends with partial UTF-8 character", k.VALUE_STRING);
            throw null;
        }
        byte b10 = this.F[i];
        this.f9672v = i + 1;
        return b10;
    }

    public final String J0(int i, boolean z10) throws IOException {
        int i10 = i & 31;
        if (i10 > 23) {
            switch (i10) {
                case 24:
                    i10 = f0();
                    break;
                case R.styleable.MapAttrs_zOrderOnTop:
                    i10 = T();
                    break;
                case 26:
                    i10 = a0();
                    break;
                case 27:
                    long b02 = b0();
                    if (z10) {
                        b02 = (-b02) - 1;
                    }
                    return String.valueOf(b02);
                default:
                    StringBuilder d10 = a8.a.d("Invalid length indicator for ints (", i10, "), token 0x");
                    d10.append(Integer.toHexString(i));
                    throw new g((h) this, d10.toString());
            }
        }
        if (z10) {
            i10 = (-i10) - 1;
        }
        return String.valueOf(i10);
    }

    public final int K0(OutputStream outputStream, int i) throws IOException {
        int i10 = i;
        while (i10 > 0) {
            int i11 = this.f9673w;
            int i12 = this.f9672v;
            int i13 = i11 - i12;
            if (i12 >= i11) {
                U0();
                i13 = this.f9673w - this.f9672v;
            }
            int min = Math.min(i13, i10);
            outputStream.write(this.F, this.f9672v, min);
            this.f9672v += min;
            i10 -= min;
        }
        this.H = false;
        return i;
    }

    public final void L0() throws IOException {
        char[] cArr;
        byte[] bArr;
        if (this.G && (bArr = this.F) != null) {
            this.F = null;
            k4.b bVar = this.f9670t;
            Objects.requireNonNull(bVar);
            byte[] bArr2 = bVar.f7440d;
            if (bArr == bArr2 || bArr.length >= bArr2.length) {
                bVar.f7440d = null;
                bVar.f7439c.f8901a.set(0, bArr);
            } else {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
        }
        f fVar = this.A;
        fVar.f8914b = -1;
        fVar.g = 0;
        if (fVar.f8916d) {
            fVar.a();
        }
        n4.a aVar = fVar.f8913a;
        if (aVar != null && (cArr = fVar.f8918f) != null) {
            fVar.f8918f = null;
            aVar.c(2, cArr);
        }
    }

    public final void M0(int i) throws g {
        String str;
        if (i < 32) {
            char c10 = (char) i;
            StringBuilder d10 = a.a.d("Illegal character (");
            char c11 = (char) c10;
            if (Character.isISOControl(c11)) {
                str = a8.a.b("(CTRL-CHAR, code ", c10, ")");
            } else if (c10 > 255) {
                str = "'" + c11 + "' (code " + c10 + " / 0x" + Integer.toHexString(c10) + ")";
            } else {
                str = "'" + c11 + "' (code " + c10 + ")";
            }
            d10.append(str);
            d10.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
            e(d10.toString());
            throw null;
        }
        StringBuilder d11 = a.a.d("Invalid UTF-8 start byte 0x");
        d11.append(Integer.toHexString(i));
        e(d11.toString());
        throw null;
    }

    public final void N0(int i, int i10) throws g {
        this.f9672v = i10;
        StringBuilder d10 = a.a.d("Invalid UTF-8 middle byte 0x");
        d10.append(Integer.toHexString(i));
        e(d10.toString());
        throw null;
    }

    public final boolean O() throws IOException {
        int i = -1;
        if (!this.z.f()) {
            this.D = -1;
            this.z = this.z.f9682c;
            this.f6183b = k.END_ARRAY;
            return false;
        } else if (this.f9672v < this.f9673w || T0()) {
            byte[] bArr = this.F;
            int i10 = this.f9672v;
            this.f9672v = i10 + 1;
            byte b10 = bArr[i10];
            int i11 = (b10 >> 5) & 7;
            if (i11 == 6) {
                i = x0(b10 & 31);
                if (this.f9672v < this.f9673w || T0()) {
                    byte[] bArr2 = this.F;
                    int i12 = this.f9672v;
                    this.f9672v = i12 + 1;
                    b10 = bArr2[i12];
                    i11 = (b10 >> 5) & 7;
                } else {
                    D0();
                    return false;
                }
            }
            byte b11 = b10 & 31;
            if (i11 == 0) {
                this.Q = 1;
                if (b11 <= 23) {
                    this.R = b11;
                } else {
                    int i13 = b11 - 24;
                    if (i13 == 0) {
                        this.R = f0();
                    } else if (i13 == 1) {
                        this.R = T();
                    } else if (i13 == 2) {
                        int a02 = a0();
                        if (a02 >= 0) {
                            this.R = a02;
                        } else {
                            this.S = ((long) a02) & 4294967295L;
                            this.Q = 2;
                        }
                    } else if (i13 == 3) {
                        long b02 = b0();
                        if (b02 >= 0) {
                            this.S = b02;
                            this.Q = 2;
                        } else {
                            this.V = E(b02);
                            this.Q = 4;
                        }
                    } else {
                        F0(b10);
                        throw null;
                    }
                }
                this.f6183b = k.VALUE_NUMBER_INT;
                return true;
            } else if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 6) {
                        e("Multiple tags not allowed per value (first tag: " + i + ")");
                        throw null;
                    }
                } else if (i >= 0) {
                    this.I = b10;
                    this.H = true;
                    k E0 = E0(i);
                    this.f6183b = E0;
                    if (E0 == k.VALUE_NUMBER_INT) {
                        return true;
                    }
                    return false;
                }
                this.f9672v--;
                V0();
                return false;
            } else {
                this.Q = 1;
                if (b11 <= 23) {
                    this.R = (-b11) - 1;
                } else {
                    int i14 = b11 - 24;
                    if (i14 == 0) {
                        this.R = (-f0()) - 1;
                    } else if (i14 == 1) {
                        this.R = (-T()) - 1;
                    } else if (i14 == 2) {
                        int a03 = a0();
                        if (a03 < 0) {
                            this.S = (-(((long) a03) & 4294967295L)) - 1;
                            this.Q = 2;
                        } else {
                            this.R = (-a03) - 1;
                        }
                    } else if (i14 == 3) {
                        long b03 = b0();
                        if (b03 >= 0) {
                            this.S = (-b03) - 1;
                            this.Q = 2;
                        } else {
                            this.V = E(b03).negate().subtract(BigInteger.ONE);
                            this.Q = 4;
                        }
                    } else {
                        F0(b10);
                        throw null;
                    }
                }
                this.f6183b = k.VALUE_NUMBER_INT;
                return true;
            }
        } else {
            D0();
            return false;
        }
    }

    public final void O0() throws IOException {
        if (!(this.z.f5834a == 0)) {
            StringBuilder d10 = a.a.d("Unexpected Break (0xFF) token in definite length (");
            d10.append(this.z.f9684e);
            d10.append(") ");
            d10.append(this.z.c() ? "Object" : "Array");
            throw new g((h) this, d10.toString());
        }
        throw new g((h) this, "Unexpected Break (0xFF) token in Root context");
    }

    public final void P0(int i) throws IOException {
        while (true) {
            int min = Math.min(i, this.f9673w - this.f9672v);
            this.f9672v += min;
            i -= min;
            if (i > 0) {
                U0();
            } else {
                return;
            }
        }
    }

    public final String Q0() throws IOException {
        k kVar = this.f6183b;
        if (kVar == k.START_OBJECT || kVar == k.START_ARRAY) {
            return this.z.f9682c.f9685f;
        }
        return this.z.f9685f;
    }

    public final void R() throws IOException {
        k kVar = this.f6183b;
        if (kVar != k.VALUE_NUMBER_INT && kVar != k.VALUE_NUMBER_FLOAT) {
            StringBuilder d10 = a.a.d("Current token (");
            d10.append(this.f6183b);
            d10.append(") not numeric, can not use numeric value accessors");
            e(d10.toString());
            throw null;
        }
    }

    public final int R0() throws IOException {
        int i = this.Q;
        if ((i & 1) == 0) {
            if (i == 0) {
                R();
            }
            int i10 = this.Q;
            if ((i10 & 1) == 0) {
                if ((i10 & 2) != 0) {
                    long j10 = this.S;
                    int i11 = (int) j10;
                    if (((long) i11) == j10) {
                        this.R = i11;
                    } else {
                        StringBuilder d10 = a.a.d("Numeric value (");
                        d10.append(t());
                        d10.append(") out of range of int");
                        e(d10.toString());
                        throw null;
                    }
                } else if ((i10 & 4) != 0) {
                    if (b0.compareTo(this.V) > 0 || f9662c0.compareTo(this.V) < 0) {
                        w();
                        throw null;
                    }
                    this.R = this.V.intValue();
                } else if ((i10 & 8) != 0) {
                    double d11 = this.U;
                    if (d11 < -2.147483648E9d || d11 > 2.147483647E9d) {
                        w();
                        throw null;
                    }
                    this.R = (int) d11;
                } else if ((i10 & 32) != 0) {
                    float f10 = this.T;
                    double d12 = (double) f10;
                    if (d12 < -2.147483648E9d || d12 > 2.147483647E9d) {
                        w();
                        throw null;
                    }
                    this.R = (int) f10;
                } else if ((i10 & 16) == 0) {
                    s();
                    throw null;
                } else if (f9667h0.compareTo(this.W) > 0 || f9668i0.compareTo(this.W) < 0) {
                    w();
                    throw null;
                } else {
                    this.R = this.W.intValue();
                }
                this.Q |= 1;
            }
        }
        return this.R;
    }

    public final void S() throws IOException {
        if (this.E != null) {
            if (this.f9670t.f7438b || h.a.AUTO_CLOSE_SOURCE.enabledIn(this.f5832a)) {
                this.E.close();
            }
            this.E = null;
        }
    }

    public final long S0() throws IOException {
        int i = this.Q;
        if ((i & 2) == 0) {
            if (i == 0) {
                R();
            }
            int i10 = this.Q;
            if ((i10 & 2) == 0) {
                if ((i10 & 1) != 0) {
                    this.S = (long) this.R;
                } else if ((i10 & 4) != 0) {
                    if (f9663d0.compareTo(this.V) > 0 || f9664e0.compareTo(this.V) < 0) {
                        y();
                        throw null;
                    }
                    this.S = this.V.longValue();
                } else if ((i10 & 8) != 0) {
                    double d10 = this.U;
                    if (d10 < -9.223372036854776E18d || d10 > 9.223372036854776E18d) {
                        y();
                        throw null;
                    }
                    this.S = (long) d10;
                } else if ((i10 & 32) != 0) {
                    float f10 = this.T;
                    double d11 = (double) f10;
                    if (d11 < -9.223372036854776E18d || d11 > 9.223372036854776E18d) {
                        w();
                        throw null;
                    }
                    this.S = (long) f10;
                } else if ((i10 & 16) == 0) {
                    s();
                    throw null;
                } else if (f9665f0.compareTo(this.W) > 0 || f9666g0.compareTo(this.W) < 0) {
                    y();
                    throw null;
                } else {
                    this.S = this.W.longValue();
                }
                this.Q |= 2;
            }
        }
        return this.S;
    }

    public final int T() throws IOException {
        int i = this.f9672v;
        int i10 = i + 1;
        int i11 = this.f9673w;
        if (i10 >= i11) {
            if (i >= i11) {
                U0();
            }
            byte[] bArr = this.F;
            int i12 = this.f9672v;
            int i13 = i12 + 1;
            this.f9672v = i13;
            byte b10 = bArr[i12] & 255;
            if (i13 >= this.f9673w) {
                U0();
            }
            byte[] bArr2 = this.F;
            int i14 = this.f9672v;
            this.f9672v = i14 + 1;
            return (b10 << 8) + (bArr2[i14] & 255);
        }
        byte[] bArr3 = this.F;
        int i15 = ((bArr3[i] & 255) << 8) + (bArr3[i10] & 255);
        this.f9672v = i + 2;
        return i15;
    }

    public final boolean T0() throws IOException {
        InputStream inputStream = this.E;
        if (inputStream != null) {
            this.f9674x += (long) this.f9673w;
            byte[] bArr = this.F;
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read > 0) {
                this.f9672v = 0;
                this.f9673w = read;
                return true;
            }
            S();
            if (read == 0) {
                throw new IOException(androidx.activity.result.d.c(a.a.d("InputStream.read() returned 0 characters when trying to read "), this.F.length, " bytes"));
            }
        }
        return false;
    }

    public final void U0() throws IOException {
        if (!T0()) {
            StringBuilder d10 = a.a.d(" in ");
            d10.append(this.f6183b);
            f(d10.toString(), this.f6183b);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03d8, code lost:
        if (V0() == h4.k.END_ARRAY) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0592, code lost:
        if (r11 != false) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05b6, code lost:
        if (r11 != false) goto L_0x05b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h4.k V0() throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r0.Q = r1
            boolean r2 = r0.H
            r3 = 255(0xff, float:3.57E-43)
            r4 = 3
            r5 = 23
            r6 = 31
            r7 = 0
            java.lang.String r8 = ")"
            if (r2 == 0) goto L_0x00e0
            r0.H = r1
            int r2 = r0.I
            int r9 = r2 >> 5
            r9 = r9 & 7
            if (r9 == r4) goto L_0x0024
            if (r9 == r4) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            r16.s()
            throw r7
        L_0x0024:
            r10 = r2 & 31
            if (r10 > r5) goto L_0x002f
            if (r10 <= 0) goto L_0x00e0
            r0.P0(r10)
            goto L_0x00e0
        L_0x002f:
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r10 == r6) goto L_0x006c
            switch(r10) {
                case 24: goto L_0x0063;
                case 25: goto L_0x005a;
                case 26: goto L_0x0051;
                case 27: goto L_0x003e;
                default: goto L_0x003a;
            }
        L_0x003a:
            r0.F0(r2)
            throw r7
        L_0x003e:
            long r9 = r16.b0()
        L_0x0042:
            int r2 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x004b
            r0.P0(r11)
            long r9 = r9 - r12
            goto L_0x0042
        L_0x004b:
            int r2 = (int) r9
            r0.P0(r2)
            goto L_0x00e0
        L_0x0051:
            int r2 = r16.a0()
            r0.P0(r2)
            goto L_0x00e0
        L_0x005a:
            int r2 = r16.T()
            r0.P0(r2)
            goto L_0x00e0
        L_0x0063:
            int r2 = r16.f0()
            r0.P0(r2)
            goto L_0x00e0
        L_0x006c:
            int r2 = r0.f9672v
            int r10 = r0.f9673w
            if (r2 < r10) goto L_0x0075
            r16.U0()
        L_0x0075:
            byte[] r2 = r0.F
            int r10 = r0.f9672v
            int r14 = r10 + 1
            r0.f9672v = r14
            byte r2 = r2[r10]
            r2 = r2 & r3
            if (r2 != r3) goto L_0x0083
            goto L_0x00e0
        L_0x0083:
            int r10 = r2 >> 5
            if (r10 != r9) goto L_0x00d2
            r2 = r2 & 31
            if (r2 > r5) goto L_0x0091
            if (r2 <= 0) goto L_0x006c
            r0.P0(r2)
            goto L_0x006c
        L_0x0091:
            if (r2 == r6) goto L_0x00c6
            switch(r2) {
                case 24: goto L_0x00be;
                case 25: goto L_0x00b6;
                case 26: goto L_0x00ae;
                case 27: goto L_0x009c;
                default: goto L_0x0096;
            }
        L_0x0096:
            int r1 = r0.I
            r0.F0(r1)
            throw r7
        L_0x009c:
            long r14 = r16.b0()
        L_0x00a0:
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a9
            r0.P0(r11)
            long r14 = r14 - r12
            goto L_0x00a0
        L_0x00a9:
            int r2 = (int) r14
            r0.P0(r2)
            goto L_0x006c
        L_0x00ae:
            int r2 = r16.a0()
            r0.P0(r2)
            goto L_0x006c
        L_0x00b6:
            int r2 = r16.T()
            r0.P0(r2)
            goto L_0x006c
        L_0x00be:
            int r2 = r16.f0()
            r0.P0(r2)
            goto L_0x006c
        L_0x00c6:
            java.lang.String r1 = "Illegal chunked-length indicator within chunked-length value (type "
            java.lang.String r1 = a8.a.b(r1, r9, r8)
            h4.g r2 = new h4.g
            r2.<init>((h4.h) r0, (java.lang.String) r1)
            throw r2
        L_0x00d2:
            java.lang.String r1 = "Mismatched chunk in chunked content: expected "
            java.lang.String r2 = " but encountered "
            java.lang.String r1 = androidx.activity.result.d.b(r1, r9, r2, r10)
            h4.g r2 = new h4.g
            r2.<init>((h4.h) r0, (java.lang.String) r1)
            throw r2
        L_0x00e0:
            long r9 = r0.f9674x
            int r2 = r0.f9672v
            long r11 = (long) r2
            long r9 = r9 + r11
            r0.f9675y = r9
            r0.C = r7
            p4.f r2 = r0.z
            boolean r2 = r2.c()
            r9 = -1
            r10 = 2
            r11 = 1
            if (r2 == 0) goto L_0x01e3
            h4.k r2 = r0.f6183b
            h4.k r12 = h4.k.FIELD_NAME
            if (r2 == r12) goto L_0x01f8
            r0.D = r9
            p4.f r2 = r0.z
            boolean r2 = r2.f()
            if (r2 != 0) goto L_0x0110
            p4.f r1 = r0.z
            p4.f r1 = r1.f9682c
            r0.z = r1
            h4.k r1 = h4.k.END_OBJECT
            r0.f6183b = r1
            return r1
        L_0x0110:
            int r2 = r0.f9672v
            int r6 = r0.f9673w
            if (r2 < r6) goto L_0x0119
            r16.U0()
        L_0x0119:
            byte[] r2 = r0.F
            int r6 = r0.f9672v
            int r8 = r6 + 1
            r0.f9672v = r8
            byte r2 = r2[r6]
            int r6 = r2 >> 5
            r6 = r6 & 7
            if (r6 == r4) goto L_0x017f
            if (r2 != r9) goto L_0x0140
            p4.f r2 = r0.z
            int r3 = r2.f9684e
            if (r3 < 0) goto L_0x0132
            r1 = r11
        L_0x0132:
            if (r1 != 0) goto L_0x013c
            p4.f r1 = r2.f9682c
            r0.z = r1
            h4.k r12 = h4.k.END_OBJECT
            goto L_0x01e0
        L_0x013c:
            r16.O0()
            throw r7
        L_0x0140:
            if (r6 != 0) goto L_0x0147
            java.lang.String r1 = r0.J0(r2, r1)
            goto L_0x0162
        L_0x0147:
            if (r6 != r11) goto L_0x014e
            java.lang.String r1 = r0.J0(r2, r11)
            goto L_0x0162
        L_0x014e:
            if (r6 != r10) goto L_0x0169
            r1 = r2 & 31
            int r1 = r0.v0(r1)
            byte[] r1 = r0.z0(r1)
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = X
            r2.<init>(r1, r3)
            r1 = r2
        L_0x0162:
            p4.f r2 = r0.z
            r2.h(r1)
            goto L_0x01e0
        L_0x0169:
            r1 = r2 & 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L_0x0171
            r16.O0()
            throw r7
        L_0x0171:
            java.lang.String r1 = "Unsupported major type ("
            java.lang.String r2 = ") for CBOR Objects, not (yet?) supported, only Strings"
            java.lang.String r1 = a8.a.b(r1, r6, r2)
            h4.g r2 = new h4.g
            r2.<init>((h4.h) r0, (java.lang.String) r1)
            throw r2
        L_0x017f:
            r1 = r2 & 31
            if (r1 > r5) goto L_0x019e
            if (r1 != 0) goto L_0x0188
            java.lang.String r1 = ""
            goto L_0x01db
        L_0x0188:
            java.lang.String r2 = r0.y0(r1)
            if (r2 == 0) goto L_0x0195
            int r3 = r0.f9672v
            int r3 = r3 + r1
            r0.f9672v = r3
        L_0x0193:
            r1 = r2
            goto L_0x01db
        L_0x0195:
            java.lang.String r2 = r0.w0(r1)
            java.lang.String r1 = r0.B(r1, r2)
            goto L_0x01db
        L_0x019e:
            int r1 = r0.v0(r1)
            if (r1 >= 0) goto L_0x01ae
            r16.A0()
            n4.f r1 = r0.A
            java.lang.String r1 = r1.b()
            goto L_0x01db
        L_0x01ae:
            int r2 = r0.f9673w
            int r3 = r0.f9672v
            int r2 = r2 - r3
            if (r2 >= r1) goto L_0x01c7
            byte[] r2 = r0.F
            int r2 = r2.length
            if (r1 < r2) goto L_0x01c4
            r0.B0(r1)
            n4.f r1 = r0.A
            java.lang.String r1 = r1.b()
            goto L_0x01db
        L_0x01c4:
            r0.G0(r1)
        L_0x01c7:
            java.lang.String r2 = r0.y0(r1)
            if (r2 == 0) goto L_0x01d3
            int r3 = r0.f9672v
            int r3 = r3 + r1
            r0.f9672v = r3
            goto L_0x0193
        L_0x01d3:
            java.lang.String r2 = r0.w0(r1)
            java.lang.String r1 = r0.B(r1, r2)
        L_0x01db:
            p4.f r2 = r0.z
            r2.h(r1)
        L_0x01e0:
            r0.f6183b = r12
            return r12
        L_0x01e3:
            p4.f r1 = r0.z
            boolean r1 = r1.f()
            if (r1 != 0) goto L_0x01f8
            r0.D = r9
            p4.f r1 = r0.z
            p4.f r1 = r1.f9682c
            r0.z = r1
            h4.k r1 = h4.k.END_ARRAY
            r0.f6183b = r1
            return r1
        L_0x01f8:
            int r1 = r0.f9672v
            int r2 = r0.f9673w
            if (r1 < r2) goto L_0x0208
            boolean r1 = r16.T0()
            if (r1 != 0) goto L_0x0208
            r16.D0()
            return r7
        L_0x0208:
            byte[] r1 = r0.F
            int r2 = r0.f9672v
            int r3 = r2 + 1
            r0.f9672v = r3
            byte r1 = r1[r2]
            int r2 = r1 >> 5
            r2 = r2 & 7
            r3 = 6
            if (r2 != r3) goto L_0x0248
            r1 = r1 & 31
            int r1 = r0.x0(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            r0.D = r1
            int r1 = r0.f9672v
            int r2 = r0.f9673w
            if (r1 < r2) goto L_0x0239
            boolean r1 = r16.T0()
            if (r1 != 0) goto L_0x0239
            r16.D0()
            return r7
        L_0x0239:
            byte[] r1 = r0.F
            int r2 = r0.f9672v
            int r4 = r2 + 1
            r0.f9672v = r4
            byte r1 = r1[r2]
            int r2 = r1 >> 5
            r2 = r2 & 7
            goto L_0x024a
        L_0x0248:
            r0.D = r9
        L_0x024a:
            r4 = r1 & 31
            java.lang.String r12 = "Multiple tags not allowed per value (first tag: "
            r13 = 32
            r14 = 8
            r15 = 4
            switch(r2) {
                case 0: goto L_0x04da;
                case 1: goto L_0x046d;
                case 2: goto L_0x045b;
                case 3: goto L_0x0452;
                case 4: goto L_0x0293;
                case 5: goto L_0x026c;
                case 6: goto L_0x0258;
                default: goto L_0x0256;
            }
        L_0x0256:
            goto L_0x052f
        L_0x0258:
            java.lang.StringBuilder r1 = a.a.d(r12)
            int r2 = r0.D
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.e(r1)
            throw r7
        L_0x026c:
            h4.k r1 = h4.k.START_OBJECT
            r0.f6183b = r1
            int r1 = r0.v0(r4)
            p4.f r2 = r0.z
            p4.f r3 = r2.f9686h
            if (r3 != 0) goto L_0x028b
            p4.f r3 = new p4.f
            l4.a r4 = r2.f9683d
            if (r4 != 0) goto L_0x0281
            goto L_0x0285
        L_0x0281:
            l4.a r7 = r4.a()
        L_0x0285:
            r3.<init>(r2, r7, r10, r1)
            r2.f9686h = r3
            goto L_0x028e
        L_0x028b:
            r3.g(r10, r1)
        L_0x028e:
            r0.z = r3
            h4.k r1 = r0.f6183b
            return r1
        L_0x0293:
            int r1 = r0.v0(r4)
            int r2 = r0.D
            if (r2 < 0) goto L_0x0445
            p4.f r4 = r0.z
            p4.f r4 = r4.e(r1)
            r0.z = r4
            if (r2 == r15) goto L_0x02ab
            h4.k r1 = h4.k.START_ARRAY
            r0.f6183b = r1
            goto L_0x03e8
        L_0x02ab:
            h4.k r2 = h4.k.START_ARRAY
            r0.f6183b = r2
            if (r1 != r10) goto L_0x042b
            boolean r1 = r16.O()
            java.lang.String r2 = "Unexpected token ("
            if (r1 == 0) goto L_0x0415
            int r1 = r16.R0()
            int r1 = -r1
            boolean r4 = r16.O()
            if (r4 == 0) goto L_0x03ff
            int r4 = r0.Q
            if (r4 != 0) goto L_0x02cb
            r16.R()
        L_0x02cb:
            h4.k r4 = r0.f6183b
            h4.k r5 = h4.k.VALUE_NUMBER_INT
            if (r4 != r5) goto L_0x02e3
            int r4 = r0.Q
            r5 = r4 & 1
            if (r5 == 0) goto L_0x02da
            h4.h$b r4 = h4.h.b.INT
            goto L_0x02f4
        L_0x02da:
            r4 = r4 & r10
            if (r4 == 0) goto L_0x02e0
            h4.h$b r4 = h4.h.b.LONG
            goto L_0x02f4
        L_0x02e0:
            h4.h$b r4 = h4.h.b.BIG_INTEGER
            goto L_0x02f4
        L_0x02e3:
            int r4 = r0.Q
            r5 = r4 & 16
            if (r5 == 0) goto L_0x02ec
            h4.h$b r4 = h4.h.b.BIG_DECIMAL
            goto L_0x02f4
        L_0x02ec:
            r4 = r4 & r14
            if (r4 == 0) goto L_0x02f2
            h4.h$b r4 = h4.h.b.DOUBLE
            goto L_0x02f4
        L_0x02f2:
            h4.h$b r4 = h4.h.b.FLOAT
        L_0x02f4:
            h4.h$b r5 = h4.h.b.BIG_INTEGER
            if (r4 != r5) goto L_0x0364
            java.math.BigDecimal r4 = new java.math.BigDecimal
            int r5 = r0.Q
            r10 = r5 & 4
            if (r10 != 0) goto L_0x035e
            if (r5 != 0) goto L_0x0305
            r16.R()
        L_0x0305:
            int r5 = r0.Q
            r10 = r5 & 4
            if (r10 != 0) goto L_0x035e
            r10 = r5 & 16
            if (r10 == 0) goto L_0x0318
            java.math.BigDecimal r5 = r0.W
            java.math.BigInteger r5 = r5.toBigInteger()
            r0.V = r5
            goto L_0x0354
        L_0x0318:
            r10 = r5 & 2
            if (r10 == 0) goto L_0x0325
            long r13 = r0.S
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r13)
            r0.V = r5
            goto L_0x0354
        L_0x0325:
            r10 = r5 & 1
            if (r10 == 0) goto L_0x0333
            int r5 = r0.R
            long r13 = (long) r5
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r13)
            r0.V = r5
            goto L_0x0354
        L_0x0333:
            r10 = r5 & 8
            if (r10 == 0) goto L_0x0344
            double r13 = r0.U
            java.math.BigDecimal r5 = java.math.BigDecimal.valueOf(r13)
            java.math.BigInteger r5 = r5.toBigInteger()
            r0.V = r5
            goto L_0x0354
        L_0x0344:
            r5 = r5 & r13
            if (r5 == 0) goto L_0x035a
            float r5 = r0.T
            double r13 = (double) r5
            java.math.BigDecimal r5 = java.math.BigDecimal.valueOf(r13)
            java.math.BigInteger r5 = r5.toBigInteger()
            r0.V = r5
        L_0x0354:
            int r5 = r0.Q
            r5 = r5 | r15
            r0.Q = r5
            goto L_0x035e
        L_0x035a:
            r16.s()
            throw r7
        L_0x035e:
            java.math.BigInteger r5 = r0.V
            r4.<init>(r5, r1)
            goto L_0x036c
        L_0x0364:
            long r4 = r16.S0()
            java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r4, r1)
        L_0x036c:
            p4.f r1 = r0.z
            boolean r1 = r1.f()
            if (r1 != 0) goto L_0x0381
            r0.D = r9
            p4.f r1 = r0.z
            p4.f r1 = r1.f9682c
            r0.z = r1
            h4.k r1 = h4.k.END_ARRAY
            r0.f6183b = r1
            goto L_0x03dc
        L_0x0381:
            byte[] r1 = r0.F
            int r5 = r0.f9672v
            int r9 = r5 + 1
            r0.f9672v = r9
            byte r1 = r1[r5]
            int r5 = r1 >> 5
            r5 = r5 & 7
            if (r5 != r3) goto L_0x03cd
            r1 = r1 & r6
            int r1 = r0.x0(r1)
            int r5 = r0.f9672v
            int r6 = r0.f9673w
            if (r5 < r6) goto L_0x03a6
            boolean r5 = r16.T0()
            if (r5 != 0) goto L_0x03a6
            r16.D0()
            goto L_0x03db
        L_0x03a6:
            byte[] r5 = r0.F
            int r6 = r0.f9672v
            int r9 = r6 + 1
            r0.f9672v = r9
            byte r5 = r5[r6]
            int r5 = r5 >> 5
            r5 = r5 & 7
            if (r5 == r3) goto L_0x03b7
            goto L_0x03cd
        L_0x03b7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = r2.toString()
            r0.e(r1)
            throw r7
        L_0x03cd:
            int r1 = r0.f9672v
            int r1 = r1 - r11
            r0.f9672v = r1
            h4.k r1 = r16.V0()
            h4.k r3 = h4.k.END_ARRAY
            if (r1 != r3) goto L_0x03db
            goto L_0x03dc
        L_0x03db:
            r11 = 0
        L_0x03dc:
            if (r11 == 0) goto L_0x03e9
            r0.W = r4
            r1 = 16
            r0.Q = r1
            h4.k r1 = h4.k.VALUE_NUMBER_FLOAT
            r0.f6183b = r1
        L_0x03e8:
            return r1
        L_0x03e9:
            java.lang.StringBuilder r1 = a.a.d(r2)
            h4.k r2 = r0.f6183b
            r1.append(r2)
            java.lang.String r2 = ") after 2 elements of 'bigfloat' value"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.e(r1)
            throw r7
        L_0x03ff:
            java.lang.StringBuilder r1 = a.a.d(r2)
            h4.k r2 = r0.f6183b
            r1.append(r2)
            java.lang.String r2 = ") as the second part of 'bigfloat' value: should get VALUE_NUMBER_INT"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.e(r1)
            throw r7
        L_0x0415:
            java.lang.StringBuilder r1 = a.a.d(r2)
            h4.k r2 = r0.f6183b
            r1.append(r2)
            java.lang.String r2 = ") as the first part of 'bigfloat' value: should get VALUE_NUMBER_INT"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.e(r1)
            throw r7
        L_0x042b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected array size ("
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ") for tagged 'bigfloat' value; should have exactly 2 number elements"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.e(r1)
            throw r7
        L_0x0445:
            p4.f r2 = r0.z
            p4.f r1 = r2.e(r1)
            r0.z = r1
            h4.k r1 = h4.k.START_ARRAY
            r0.f6183b = r1
            return r1
        L_0x0452:
            r0.I = r1
            r0.H = r11
            h4.k r1 = h4.k.VALUE_STRING
            r0.f6183b = r1
            return r1
        L_0x045b:
            r0.I = r1
            r0.H = r11
            int r1 = r0.D
            if (r1 < 0) goto L_0x0468
            h4.k r1 = r0.E0(r1)
            return r1
        L_0x0468:
            h4.k r1 = h4.k.VALUE_EMBEDDED_OBJECT
            r0.f6183b = r1
            return r1
        L_0x046d:
            r0.Q = r11
            if (r4 > r5) goto L_0x0476
            int r1 = -r4
            int r1 = r1 - r11
            r0.R = r1
            goto L_0x04d5
        L_0x0476:
            int r4 = r4 + -24
            if (r4 == 0) goto L_0x04cd
            if (r4 == r11) goto L_0x04c4
            r2 = 1
            if (r4 == r10) goto L_0x04ab
            r5 = 3
            if (r4 != r5) goto L_0x04a7
            long r4 = r16.b0()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0494
            long r4 = -r4
            long r4 = r4 - r2
            r0.S = r4
            r0.Q = r10
            goto L_0x04d5
        L_0x0494:
            java.math.BigInteger r1 = r0.E(r4)
            java.math.BigInteger r1 = r1.negate()
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            java.math.BigInteger r1 = r1.subtract(r2)
            r0.V = r1
            r0.Q = r15
            goto L_0x04d5
        L_0x04a7:
            r0.F0(r1)
            throw r7
        L_0x04ab:
            int r1 = r16.a0()
            if (r1 >= 0) goto L_0x04bf
            long r4 = (long) r1
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r4 = -r4
            long r4 = r4 - r2
            r0.S = r4
            r0.Q = r10
            goto L_0x04d5
        L_0x04bf:
            int r1 = -r1
            int r1 = r1 - r11
            r0.R = r1
            goto L_0x04d5
        L_0x04c4:
            int r1 = r16.T()
            int r1 = -r1
            int r1 = r1 - r11
            r0.R = r1
            goto L_0x04d5
        L_0x04cd:
            int r1 = r16.f0()
            int r1 = -r1
            int r1 = r1 - r11
            r0.R = r1
        L_0x04d5:
            h4.k r1 = h4.k.VALUE_NUMBER_INT
            r0.f6183b = r1
            return r1
        L_0x04da:
            r0.Q = r11
            if (r4 > r5) goto L_0x04e1
            r0.R = r4
            goto L_0x052a
        L_0x04e1:
            int r4 = r4 + -24
            if (r4 == 0) goto L_0x0524
            if (r4 == r11) goto L_0x051d
            if (r4 == r10) goto L_0x0508
            r2 = 3
            if (r4 != r2) goto L_0x0504
            long r1 = r16.b0()
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x04fb
            r0.S = r1
            r0.Q = r10
            goto L_0x052a
        L_0x04fb:
            java.math.BigInteger r1 = r0.E(r1)
            r0.V = r1
            r0.Q = r15
            goto L_0x052a
        L_0x0504:
            r0.F0(r1)
            throw r7
        L_0x0508:
            int r1 = r16.a0()
            if (r1 < 0) goto L_0x0511
            r0.R = r1
            goto L_0x052a
        L_0x0511:
            long r1 = (long) r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r0.S = r1
            r0.Q = r10
            goto L_0x052a
        L_0x051d:
            int r1 = r16.T()
            r0.R = r1
            goto L_0x052a
        L_0x0524:
            int r1 = r16.f0()
            r0.R = r1
        L_0x052a:
            h4.k r1 = h4.k.VALUE_NUMBER_INT
            r0.f6183b = r1
            return r1
        L_0x052f:
            switch(r4) {
                case 20: goto L_0x05d1;
                case 21: goto L_0x05cc;
                case 22: goto L_0x05c7;
                case 23: goto L_0x05c2;
                case 24: goto L_0x0532;
                case 25: goto L_0x0575;
                case 26: goto L_0x0564;
                case 27: goto L_0x0553;
                case 28: goto L_0x0532;
                case 29: goto L_0x0532;
                case 30: goto L_0x0532;
                case 31: goto L_0x0534;
                default: goto L_0x0532;
            }
        L_0x0532:
            goto L_0x05d6
        L_0x0534:
            p4.f r1 = r0.z
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x054f
            p4.f r1 = r0.z
            int r2 = r1.f9684e
            if (r2 < 0) goto L_0x0543
            goto L_0x0544
        L_0x0543:
            r11 = 0
        L_0x0544:
            if (r11 != 0) goto L_0x054f
            p4.f r1 = r1.f9682c
            r0.z = r1
            h4.k r1 = h4.k.END_ARRAY
            r0.f6183b = r1
            return r1
        L_0x054f:
            r16.O0()
            throw r7
        L_0x0553:
            long r1 = r16.b0()
            double r1 = java.lang.Double.longBitsToDouble(r1)
            r0.U = r1
            r0.Q = r14
            h4.k r1 = h4.k.VALUE_NUMBER_FLOAT
            r0.f6183b = r1
            return r1
        L_0x0564:
            int r1 = r16.a0()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.T = r1
            r0.Q = r13
            h4.k r1 = h4.k.VALUE_NUMBER_FLOAT
            r0.f6183b = r1
            return r1
        L_0x0575:
            int r1 = r16.T()
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            int r2 = r1 >> 15
            if (r2 == 0) goto L_0x0582
            goto L_0x0583
        L_0x0582:
            r11 = 0
        L_0x0583:
            int r2 = r1 >> 10
            r2 = r2 & r6
            r1 = r1 & 1023(0x3ff, float:1.434E-42)
            if (r2 != 0) goto L_0x0595
            double r2 = f9661a0
            double r4 = (double) r1
            double r6 = Z
            double r4 = r4 / r6
            double r4 = r4 * r2
            float r1 = (float) r4
            if (r11 == 0) goto L_0x05b9
            goto L_0x05b8
        L_0x0595:
            if (r2 != r6) goto L_0x05a4
            if (r1 == 0) goto L_0x059c
            r1 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x05b9
        L_0x059c:
            if (r11 == 0) goto L_0x05a1
            r1 = -8388608(0xffffffffff800000, float:-Infinity)
            goto L_0x05b9
        L_0x05a1:
            r1 = 2139095040(0x7f800000, float:Infinity)
            goto L_0x05b9
        L_0x05a4:
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r2 = r2 + -15
            double r5 = (double) r2
            double r2 = java.lang.Math.pow(r3, r5)
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = (double) r1
            double r8 = Z
            double r6 = r6 / r8
            double r6 = r6 + r4
            double r6 = r6 * r2
            float r1 = (float) r6
            if (r11 == 0) goto L_0x05b9
        L_0x05b8:
            float r1 = -r1
        L_0x05b9:
            r0.T = r1
            r0.Q = r13
            h4.k r1 = h4.k.VALUE_NUMBER_FLOAT
            r0.f6183b = r1
            return r1
        L_0x05c2:
            h4.k r1 = h4.k.VALUE_NULL
            r0.f6183b = r1
            return r1
        L_0x05c7:
            h4.k r1 = h4.k.VALUE_NULL
            r0.f6183b = r1
            return r1
        L_0x05cc:
            h4.k r1 = h4.k.VALUE_TRUE
            r0.f6183b = r1
            return r1
        L_0x05d1:
            h4.k r1 = h4.k.VALUE_FALSE
            r0.f6183b = r1
            return r1
        L_0x05d6:
            r0.F0(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.d.V0():h4.k");
    }

    public final int W0(h4.a aVar, OutputStream outputStream) throws IOException {
        if (this.f6183b == k.VALUE_EMBEDDED_OBJECT) {
            int i = 0;
            if (!this.H) {
                byte[] bArr = this.C;
                if (bArr == null) {
                    return 0;
                }
                int length = bArr.length;
                outputStream.write(bArr, 0, length);
                return length;
            }
            this.H = false;
            int v02 = v0(this.I & 31);
            if (v02 >= 0) {
                K0(outputStream, v02);
                return v02;
            }
            while (true) {
                int p02 = p0(2);
                if (p02 < 0) {
                    return i;
                }
                K0(outputStream, p02);
                i += p02;
            }
        } else {
            StringBuilder d10 = a.a.d("Current token (");
            d10.append(this.f6183b);
            d10.append(") not VALUE_EMBEDDED_OBJECT, can not access as binary");
            e(d10.toString());
            throw null;
        }
    }

    public final h4.f a() {
        long j10 = this.f9674x + ((long) this.f9672v);
        return new h4.f(this.f9670t.f7437a, j10, (int) j10);
    }

    public final int a0() throws IOException {
        int i = this.f9672v;
        int i10 = i + 3;
        int i11 = this.f9673w;
        if (i10 >= i11) {
            if (i >= i11) {
                U0();
            }
            byte[] bArr = this.F;
            int i12 = this.f9672v;
            int i13 = i12 + 1;
            this.f9672v = i13;
            byte b10 = bArr[i12];
            if (i13 >= this.f9673w) {
                U0();
            }
            byte[] bArr2 = this.F;
            int i14 = this.f9672v;
            int i15 = i14 + 1;
            this.f9672v = i15;
            int i16 = (b10 << 8) + (bArr2[i14] & 255);
            if (i15 >= this.f9673w) {
                U0();
            }
            byte[] bArr3 = this.F;
            int i17 = this.f9672v;
            int i18 = i17 + 1;
            this.f9672v = i18;
            int i19 = (i16 << 8) + (bArr3[i17] & 255);
            if (i18 >= this.f9673w) {
                U0();
            }
            byte[] bArr4 = this.F;
            int i20 = this.f9672v;
            this.f9672v = i20 + 1;
            return (i19 << 8) + (bArr4[i20] & 255);
        }
        byte[] bArr5 = this.F;
        int i21 = i + 1;
        int i22 = i21 + 1;
        int i23 = (bArr5[i] << 24) + ((bArr5[i21] & 255) << 16);
        int i24 = i22 + 1;
        int i25 = i23 + ((bArr5[i22] & 255) << 8) + (bArr5[i24] & 255);
        this.f9672v = i24 + 1;
        return i25;
    }

    public final long b0() throws IOException {
        int i = this.f9672v;
        if (i + 7 >= this.f9673w) {
            return (((long) a0()) << 32) + ((((long) a0()) << 32) >>> 32);
        }
        byte[] bArr = this.F;
        int i10 = i + 1;
        int i11 = i10 + 1;
        int i12 = (bArr[i] << 24) + ((bArr[i10] & 255) << 16);
        int i13 = i11 + 1;
        int i14 = i12 + ((bArr[i11] & 255) << 8);
        int i15 = i13 + 1;
        int i16 = i14 + (bArr[i13] & 255);
        int i17 = i15 + 1;
        int i18 = i17 + 1;
        int i19 = (bArr[i15] << 24) + ((bArr[i17] & 255) << 16);
        int i20 = i18 + 1;
        int i21 = i19 + ((bArr[i18] & 255) << 8);
        this.f9672v = i20 + 1;
        return (((long) i16) << 32) + ((((long) (i21 + (bArr[i20] & 255))) << 32) >>> 32);
    }

    public final void close() throws IOException {
        if (!this.f9671u) {
            this.f9671u = true;
            m4.a aVar = this.L;
            m4.a aVar2 = aVar.f8469a;
            if (aVar2 != null && (!aVar.f8481o)) {
                a.C0156a aVar3 = new a.C0156a(aVar);
                int i = aVar3.f8483b;
                a.C0156a aVar4 = aVar2.f8470b.get();
                if (i != aVar4.f8483b) {
                    if (i > 6000) {
                        aVar3 = a.C0156a.a(64);
                    }
                    aVar2.f8470b.compareAndSet(aVar4, aVar3);
                }
                aVar.f8481o = true;
            }
            try {
                S();
            } finally {
                L0();
            }
        }
    }

    public final int f0() throws IOException {
        if (this.f9672v >= this.f9673w) {
            U0();
        }
        byte[] bArr = this.F;
        int i = this.f9672v;
        this.f9672v = i + 1;
        return bArr[i] & 255;
    }

    public final int p0(int i) throws IOException {
        if (this.f9672v >= this.f9673w) {
            U0();
        }
        byte[] bArr = this.F;
        int i10 = this.f9672v;
        this.f9672v = i10 + 1;
        byte b10 = bArr[i10] & 255;
        if (b10 == 255) {
            return -1;
        }
        int i11 = b10 >> 5;
        if (i11 == i) {
            int v02 = v0(b10 & 31);
            if (v02 >= 0) {
                return v02;
            }
            throw new g((h) this, a8.a.b("Illegal chunked-length indicator within chunked-length value (type ", i, ")"));
        }
        throw new g((h) this, "Mismatched chunk in chunked content: expected " + i + " but encountered " + i11 + " (byte 0x" + Integer.toHexString(b10) + ")");
    }

    public final String t() throws IOException {
        Object obj;
        k kVar = this.f6183b;
        if (this.H && kVar == k.VALUE_STRING) {
            int i = this.I;
            this.H = false;
            int i10 = (i >> 5) & 7;
            int i11 = i & 31;
            if (i10 == 3) {
                int v02 = v0(i11);
                if (v02 > 0) {
                    if (v02 > this.f9673w - this.f9672v) {
                        if (v02 >= this.F.length) {
                            B0(v02);
                            return this.A.b();
                        }
                        G0(v02);
                    }
                    return C0(v02);
                } else if (v02 == 0) {
                    this.A.e();
                    return BuildConfig.FLAVOR;
                } else {
                    A0();
                    return this.A.b();
                }
            } else {
                s();
                throw null;
            }
        } else if (kVar == k.VALUE_STRING) {
            return this.A.b();
        } else {
            if (kVar == null) {
                return null;
            }
            if (kVar == k.FIELD_NAME) {
                return this.z.f9685f;
            }
            if (!kVar.isNumeric()) {
                return this.f6183b.asString();
            }
            if (this.Q == 0) {
                R();
            }
            if (this.f6183b == k.VALUE_NUMBER_INT) {
                int i12 = this.Q;
                if ((i12 & 1) != 0) {
                    obj = Integer.valueOf(this.R);
                } else if ((i12 & 2) != 0) {
                    obj = Long.valueOf(this.S);
                } else if ((i12 & 4) != 0) {
                    obj = this.V;
                } else {
                    obj = this.W;
                }
            } else {
                int i13 = this.Q;
                if ((i13 & 16) != 0) {
                    obj = this.W;
                } else if ((i13 & 8) != 0) {
                    obj = Double.valueOf(this.U);
                } else if ((i13 & 32) != 0) {
                    obj = Float.valueOf(this.T);
                } else {
                    s();
                    throw null;
                }
            }
            return obj.toString();
        }
    }

    public final int v0(int i) throws IOException {
        if (i == 31) {
            return -1;
        }
        if (i <= 23) {
            return i;
        }
        int i10 = i - 24;
        if (i10 == 0) {
            return f0();
        }
        if (i10 == 1) {
            return T();
        }
        if (i10 == 2) {
            return a0();
        }
        if (i10 == 3) {
            long b02 = b0();
            if (b02 >= 0 && b02 <= 2147483647L) {
                return (int) b02;
            }
            StringBuilder d10 = a.a.d("Illegal length for ");
            d10.append(this.f6183b);
            d10.append(": ");
            d10.append(b02);
            throw new g((h) this, d10.toString());
        }
        StringBuilder d11 = a.a.d("Invalid length for ");
        d11.append(this.f6183b);
        d11.append(": 0x");
        d11.append(Integer.toHexString(i));
        throw new g((h) this, d11.toString());
    }

    public final String w0(int i) throws IOException {
        int i10;
        char[] c10 = this.A.c();
        if (c10.length < i) {
            f fVar = this.A;
            char[] cArr = fVar.f8918f;
            if (cArr.length < i) {
                cArr = Arrays.copyOf(cArr, i);
                fVar.f8918f = cArr;
            }
            c10 = cArr;
        }
        int i11 = this.f9672v;
        this.f9672v = i11 + i;
        int[] iArr = Y;
        byte[] bArr = this.F;
        int i12 = i + i11;
        int i13 = 0;
        while (true) {
            byte b10 = bArr[i11] & 255;
            if (iArr[b10] != 0) {
                while (i11 < i12) {
                    int i14 = i11 + 1;
                    byte b11 = bArr[i11] & 255;
                    int i15 = iArr[b11];
                    if (i15 != 0) {
                        if (i15 == 1) {
                            i10 = i14 + 1;
                            b11 = ((b11 & 31) << 6) | (bArr[i14] & 63);
                        } else if (i15 == 2) {
                            int i16 = i14 + 1;
                            byte b12 = ((b11 & 15) << 12) | ((bArr[i14] & 63) << 6);
                            i14 = i16 + 1;
                            b11 = b12 | (bArr[i16] & 63);
                        } else if (i15 == 3) {
                            int i17 = i14 + 1;
                            byte b13 = ((b11 & 7) << 18) | ((bArr[i14] & 63) << 12);
                            int i18 = i17 + 1;
                            byte b14 = b13 | ((bArr[i17] & 63) << 6);
                            i10 = i18 + 1;
                            int i19 = (b14 | (bArr[i18] & 63)) - LZ4Constants.MAX_DISTANCE;
                            c10[i13] = (char) (55296 | (i19 >> 10));
                            b11 = (i19 & 1023) | 56320;
                            i13++;
                        } else {
                            StringBuilder d10 = a.a.d("Invalid byte ");
                            d10.append(Integer.toHexString(b11));
                            d10.append(" in Object name");
                            e(d10.toString());
                            throw null;
                        }
                        i14 = i10;
                    }
                    c10[i13] = (char) b11;
                    i11 = i14;
                    i13++;
                }
                return this.A.f(i13);
            }
            int i20 = i13 + 1;
            c10[i13] = (char) b10;
            i11++;
            if (i11 == i12) {
                return this.A.f(i20);
            }
            i13 = i20;
        }
    }

    public final int x0(int i) throws IOException {
        if (i <= 23) {
            return i;
        }
        int i10 = i - 24;
        if (i10 == 0) {
            return f0();
        }
        if (i10 == 1) {
            return T();
        }
        if (i10 == 2) {
            return a0();
        }
        if (i10 == 3) {
            long b02 = b0();
            if (b02 >= -2147483648L && b02 <= 2147483647L) {
                return (int) b02;
            }
            e("Illegal Tag value: " + b02);
            throw null;
        }
        StringBuilder d10 = a.a.d("Invalid low bits for Tag token: 0x");
        d10.append(Integer.toHexString(i));
        throw new g((h) this, d10.toString());
    }

    public final String y0(int i) throws IOException {
        int i10;
        int[] iArr;
        int i11;
        if (this.f9673w - this.f9672v < i) {
            G0(i);
        }
        if (i < 5) {
            int i12 = this.f9672v;
            byte[] bArr = this.F;
            int i13 = bArr[i12] & 255;
            if (i > 1) {
                int i14 = i12 + 1;
                i13 = (i13 << 8) + (bArr[i14] & 255);
                if (i > 2) {
                    int i15 = i14 + 1;
                    i13 = (bArr[i15] & 255) + (i13 << 8);
                    if (i > 3) {
                        i13 = (i13 << 8) + (bArr[i15 + 1] & 255);
                    }
                }
            }
            this.N = i13;
            return this.L.l(i13);
        }
        byte[] bArr2 = this.F;
        int i16 = this.f9672v;
        int i17 = i16 + 1;
        int i18 = i17 + 1;
        int i19 = i18 + 1;
        int i20 = i19 + 1;
        int i21 = ((((((bArr2[i16] & 255) << 8) | (bArr2[i17] & 255)) << 8) | (bArr2[i18] & 255)) << 8) | (bArr2[i19] & 255);
        if (i < 9) {
            int i22 = i20 + 1;
            int i23 = bArr2[i20] & 255;
            int i24 = i - 5;
            if (i24 > 0) {
                int i25 = i23 << 8;
                int i26 = i22 + 1;
                int i27 = i25 + (bArr2[i22] & 255);
                if (i24 > 1) {
                    int i28 = i26 + 1;
                    i23 = (i27 << 8) + (bArr2[i26] & 255);
                    if (i24 > 2) {
                        i23 = (i23 << 8) + (bArr2[i28] & 255);
                    }
                } else {
                    i23 = i27;
                }
            }
            this.N = i21;
            this.O = i23;
            return this.L.m(i21, i23);
        }
        int i29 = i20 + 1;
        int i30 = i29 + 1;
        int i31 = i30 + 1;
        int i32 = i31 + 1;
        int i33 = (((((bArr2[i29] & 255) | ((bArr2[i20] & 255) << 8)) << 8) | (bArr2[i30] & 255)) << 8) | (bArr2[i31] & 255);
        if (i < 13) {
            int i34 = i32 + 1;
            int i35 = bArr2[i32] & 255;
            int i36 = i - 9;
            if (i36 > 0) {
                int i37 = i35 << 8;
                int i38 = i34 + 1;
                int i39 = (bArr2[i34] & 255) + i37;
                if (i36 > 1) {
                    int i40 = i38 + 1;
                    i35 = (i39 << 8) + (bArr2[i38] & 255);
                    if (i36 > 2) {
                        i35 = (i35 << 8) + (bArr2[i40] & 255);
                    }
                } else {
                    i35 = i39;
                }
            }
            this.N = i21;
            this.O = i33;
            this.P = i35;
            return this.L.n(i21, i33, i35);
        }
        int i41 = (i + 3) >> 2;
        int[] iArr2 = this.M;
        if (i41 > iArr2.length) {
            this.M = Arrays.copyOf(iArr2, i41 + 4);
        }
        int[] iArr3 = this.M;
        iArr3[0] = i21;
        iArr3[1] = i33;
        int i42 = this.f9672v + 8;
        int i43 = i - 8;
        byte[] bArr3 = this.F;
        int i44 = 2;
        while (true) {
            int i45 = i42 + 1;
            int i46 = i45 + 1;
            int i47 = i46 + 1;
            i10 = i47 + 1;
            int i48 = ((((((bArr3[i42] & 255) << 8) | (bArr3[i45] & 255)) << 8) | (bArr3[i46] & 255)) << 8) | (bArr3[i47] & 255);
            iArr = this.M;
            i11 = i44 + 1;
            iArr[i44] = i48;
            i43 -= 4;
            if (i43 <= 3) {
                break;
            }
            i42 = i10;
            i44 = i11;
        }
        if (i43 > 0) {
            int i49 = bArr3[i10] & 255;
            if (i43 > 1) {
                int i50 = i10 + 1;
                i49 = (i49 << 8) + (bArr3[i50] & 255);
                if (i43 > 2) {
                    i49 = (bArr3[i50 + 1] & 255) + (i49 << 8);
                }
            }
            iArr[i11] = i49;
            i11++;
        }
        m4.a aVar = this.L;
        Objects.requireNonNull(aVar);
        if (i11 >= 4) {
            int k10 = aVar.k(iArr, i11);
            int a10 = aVar.a(k10);
            int[] iArr4 = aVar.f8474f;
            int i51 = iArr4[a10 + 3];
            if (k10 == iArr4[a10] && i51 == i11 && aVar.e(iArr, i11, iArr4[a10 + 1])) {
                return aVar.f8478l[a10 >> 2];
            }
            if (i51 != 0) {
                int i52 = aVar.f8475h + ((a10 >> 3) << 2);
                int i53 = iArr4[i52 + 3];
                if (k10 == iArr4[i52] && i53 == i11 && aVar.e(iArr, i11, iArr4[i52 + 1])) {
                    return aVar.f8478l[i52 >> 2];
                }
                int i54 = aVar.i;
                int i55 = aVar.f8476j;
                int i56 = i54 + ((a10 >> (i55 + 2)) << i55);
                int[] iArr5 = aVar.f8474f;
                int i57 = (1 << i55) + i56;
                while (true) {
                    if (i56 < i57) {
                        int i58 = iArr5[i56 + 3];
                        if (k10 == iArr5[i56] && i11 == i58 && aVar.e(iArr, i11, iArr5[i56 + 1])) {
                            return aVar.f8478l[i56 >> 2];
                        }
                        if (i58 == 0) {
                            break;
                        }
                        i56 += 4;
                    } else {
                        int i59 = aVar.g;
                        for (int i60 = (i59 << 3) - i59; i60 < aVar.f8479m; i60 += 4) {
                            if (k10 == iArr5[i60] && i11 == iArr5[i60 + 3] && aVar.e(iArr, i11, iArr5[i60 + 1])) {
                                return aVar.f8478l[i60 >> 2];
                            }
                        }
                    }
                }
            }
            return null;
        } else if (i11 == 1) {
            return aVar.l(iArr[0]);
        } else {
            if (i11 == 2) {
                return aVar.m(iArr[0], iArr[1]);
            }
            if (i11 != 3) {
                return BuildConfig.FLAVOR;
            }
            return aVar.n(iArr[0], iArr[1], iArr[2]);
        }
    }

    public final byte[] z0(int i) throws IOException {
        if (i < 0) {
            c cVar = this.B;
            if (cVar == null) {
                this.B = new c(500);
            } else {
                cVar.e();
            }
            c cVar2 = this.B;
            while (true) {
                if (this.f9672v >= this.f9673w) {
                    U0();
                }
                byte[] bArr = this.F;
                int i10 = this.f9672v;
                this.f9672v = i10 + 1;
                byte b10 = bArr[i10] & 255;
                if (b10 == 255) {
                    return cVar2.f();
                }
                int i11 = b10 >> 5;
                if (i11 == 2) {
                    int v02 = v0(b10 & 31);
                    if (v02 >= 0) {
                        while (v02 > 0) {
                            int i12 = this.f9673w;
                            int i13 = this.f9672v;
                            int i14 = i12 - i13;
                            if (i13 >= i12) {
                                U0();
                                i14 = this.f9673w - this.f9672v;
                            }
                            int min = Math.min(i14, v02);
                            cVar2.write(this.F, this.f9672v, min);
                            this.f9672v += min;
                            v02 -= min;
                        }
                    } else {
                        throw new g((h) this, "Illegal chunked-length indicator within chunked-length value (type 2)");
                    }
                } else {
                    throw new g((h) this, m.b("Mismatched chunk in chunked content: expected 2 but encountered ", i11));
                }
            }
        } else if (i == 0) {
            return b.f6181c;
        } else {
            byte[] bArr2 = new byte[i];
            if (this.f9672v >= this.f9673w) {
                U0();
            }
            int i15 = 0;
            while (true) {
                int min2 = Math.min(i, this.f9673w - this.f9672v);
                System.arraycopy(this.F, this.f9672v, bArr2, i15, min2);
                this.f9672v += min2;
                i15 += min2;
                i -= min2;
                if (i <= 0) {
                    return bArr2;
                }
                U0();
            }
        }
    }
}
