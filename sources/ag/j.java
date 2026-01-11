package ag;

import ag.n;
import androidx.activity.result.d;
import b9.m;
import com.google.android.gms.maps.R;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentMap;
import zh.a;

public final class j extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final int f409a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f410b = false;

    /* renamed from: c  reason: collision with root package name */
    public final byte[][] f411c = new byte[11][];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(InputStream inputStream) {
        super(inputStream);
        int c10 = v1.c(inputStream);
        this.f409a = c10;
    }

    /* JADX WARNING: type inference failed for: r13v6, types: [java.util.concurrent.ConcurrentMap<ag.n$a, ag.n>, java.util.concurrent.ConcurrentHashMap] */
    public static s c(int i, p1 p1Var, byte[][] bArr) throws IOException {
        int i10;
        int i11 = 0;
        if (i == 10) {
            byte[] e10 = e(p1Var, bArr);
            if (e10.length > 1) {
                return new f(e10);
            }
            if (e10.length != 0) {
                byte b10 = e10[0] & 255;
                f[] fVarArr = f.f392b;
                if (b10 >= 12) {
                    return new f(e10);
                }
                f fVar = fVarArr[b10];
                if (fVar == null) {
                    fVar = new f(e10);
                    fVarArr[b10] = fVar;
                }
                return fVar;
            }
            throw new IllegalArgumentException("ENUMERATED has zero length");
        } else if (i == 12) {
            return new e1(p1Var.c());
        } else {
            if (i != 30) {
                switch (i) {
                    case 1:
                        byte[] e11 = e(p1Var, bArr);
                        if (e11.length == 1) {
                            byte b11 = e11[0];
                            if (b11 != -1) {
                                return b11 != 0 ? new c(b11) : c.f377b;
                            }
                            return c.f378c;
                        }
                        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                    case 2:
                        return new k(p1Var.c(), false);
                    case 3:
                        int i12 = p1Var.f434s;
                        if (i12 >= 1) {
                            int read = p1Var.read();
                            int i13 = i12 - 1;
                            byte[] bArr2 = new byte[i13];
                            if (i13 != 0) {
                                if (a.b(p1Var, bArr2, i13) != i13) {
                                    throw new EOFException("EOF encountered in middle of BIT STRING");
                                } else if (read > 0 && read < 8) {
                                    int i14 = i13 - 1;
                                    if (bArr2[i14] != ((byte) (bArr2[i14] & (255 << read)))) {
                                        return new i1(bArr2, read);
                                    }
                                }
                            }
                            return new n0(bArr2, read);
                        }
                        throw new IllegalArgumentException("truncated BIT STRING detected");
                    case 4:
                        return new w0(p1Var.c());
                    case 5:
                        return u0.f450a;
                    case 6:
                        byte[] e12 = e(p1Var, bArr);
                        ConcurrentMap<n.a, n> concurrentMap = n.f424c;
                        n nVar = (n) n.f424c.get(new n.a(e12));
                        return nVar == null ? new n(e12) : nVar;
                    default:
                        switch (i) {
                            case 18:
                                return new v0(p1Var.c());
                            case 19:
                                return new z0(p1Var.c());
                            case 20:
                                return new c1(p1Var.c());
                            case 21:
                                return new g1(p1Var.c());
                            case 22:
                                return new t0(p1Var.c());
                            case 23:
                                return new z(p1Var.c());
                            case 24:
                                return new i(p1Var.c());
                            case R.styleable.MapAttrs_zOrderOnTop /*25*/:
                                return new s0(p1Var.c());
                            case 26:
                                return new h1(p1Var.c());
                            case 27:
                                return new q0(p1Var.c());
                            case 28:
                                return new f1(p1Var.c());
                            default:
                                throw new IOException(a8.a.b("unknown tag ", i, " encountered"));
                        }
                }
            } else {
                int i15 = p1Var.f434s;
                if ((i15 & 1) == 0) {
                    int i16 = i15 / 2;
                    char[] cArr = new char[i16];
                    byte[] bArr3 = new byte[8];
                    int i17 = 0;
                    while (i15 >= 8) {
                        if (a.b(p1Var, bArr3, 8) == 8) {
                            cArr[i17] = (char) ((bArr3[0] << 8) | (bArr3[1] & 255));
                            cArr[i17 + 1] = (char) ((bArr3[2] << 8) | (bArr3[3] & 255));
                            cArr[i17 + 2] = (char) ((bArr3[4] << 8) | (bArr3[5] & 255));
                            cArr[i17 + 3] = (char) ((bArr3[6] << 8) | (bArr3[7] & 255));
                            i17 += 4;
                            i15 -= 8;
                        } else {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                    }
                    if (i15 > 0) {
                        if (a.b(p1Var, bArr3, i15) == i15) {
                            while (true) {
                                int i18 = i11 + 1;
                                int i19 = i18 + 1;
                                i10 = i17 + 1;
                                cArr[i17] = (char) ((bArr3[i18] & 255) | (bArr3[i11] << 8));
                                if (i19 >= i15) {
                                    break;
                                }
                                i11 = i19;
                                i17 = i10;
                            }
                            i17 = i10;
                        } else {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                    }
                    if (p1Var.f434s == 0 && i16 == i17) {
                        return new m0(cArr);
                    }
                    throw new IllegalStateException();
                }
                throw new IOException("malformed BMPString encoding encountered");
            }
        }
    }

    public static byte[] e(p1 p1Var, byte[][] bArr) throws IOException {
        int i = p1Var.f434s;
        if (i >= bArr.length) {
            return p1Var.c();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i == bArr2.length) {
            if (i != 0) {
                int i10 = p1Var.f453b;
                if (i < i10) {
                    int b10 = i - a.b(p1Var.f452a, bArr2, bArr2.length);
                    p1Var.f434s = b10;
                    if (b10 == 0) {
                        p1Var.a();
                    } else {
                        StringBuilder d10 = a.a.d("DEF length ");
                        d10.append(p1Var.f433c);
                        d10.append(" object truncated by ");
                        d10.append(p1Var.f434s);
                        throw new EOFException(d10.toString());
                    }
                } else {
                    StringBuilder d11 = a.a.d("corrupted stream - out of bounds length found: ");
                    d11.append(p1Var.f434s);
                    d11.append(" >= ");
                    d11.append(i10);
                    throw new IOException(d11.toString());
                }
            }
            return bArr2;
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    public static int f(InputStream inputStream, int i, boolean z) throws IOException {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (read == 128) {
            return -1;
        } else {
            if (read <= 127) {
                return read;
            }
            int i10 = read & 127;
            if (i10 <= 4) {
                int i11 = 0;
                int i12 = 0;
                while (i12 < i10) {
                    int read2 = inputStream.read();
                    if (read2 >= 0) {
                        i11 = (i11 << 8) + read2;
                        i12++;
                    } else {
                        throw new EOFException("EOF found reading length");
                    }
                }
                if (i11 < 0) {
                    throw new IOException("corrupted stream - negative length found");
                } else if (i11 < i || z) {
                    return i11;
                } else {
                    throw new IOException(d.b("corrupted stream - out of bounds length found: ", i11, " >= ", i));
                }
            } else {
                throw new IOException(m.b("DER length more than 4 bytes: ", i10));
            }
        }
    }

    public static int t(InputStream inputStream, int i) throws IOException {
        int i10 = i & 31;
        if (i10 != 31) {
            return i10;
        }
        int i11 = 0;
        int read = inputStream.read();
        if ((read & 127) != 0) {
            while (read >= 0 && (read & 128) != 0) {
                i11 = (i11 | (read & 127)) << 7;
                read = inputStream.read();
            }
            if (read >= 0) {
                return i11 | (read & 127);
            }
            throw new EOFException("EOF found inside tag value.");
        }
        throw new IOException("corrupted stream - invalid high tag number found");
    }

    public final s a(int i, int i10, int i11) throws IOException {
        int i12 = 0;
        boolean z = (i & 32) != 0;
        p1 p1Var = new p1(this, i11, this.f409a);
        if ((i & 64) != 0) {
            return new a0(z, i10, p1Var.c());
        }
        if ((i & 128) != 0) {
            return new x(p1Var).b(z, i10);
        }
        if (!z) {
            return c(i10, p1Var, this.f411c);
        }
        if (i10 == 4) {
            e w6 = w(p1Var);
            int i13 = w6.f388b;
            o[] oVarArr = new o[i13];
            while (i12 != i13) {
                d b10 = w6.b(i12);
                if (b10 instanceof o) {
                    oVarArr[i12] = (o) b10;
                    i12++;
                } else {
                    StringBuilder d10 = a.a.d("unknown object encountered in constructed OCTET STRING: ");
                    d10.append(b10.getClass());
                    throw new g(d10.toString());
                }
            }
            return new d0(oVarArr);
        } else if (i10 == 8) {
            return new j1(w(p1Var));
        } else {
            if (i10 != 16) {
                if (i10 == 17) {
                    e w10 = w(p1Var);
                    m1 m1Var = k1.f417a;
                    return w10.f388b < 1 ? k1.f418b : new n1(w10);
                }
                throw new IOException(a8.a.b("unknown tag ", i10, " encountered"));
            } else if (this.f410b) {
                return new t1(p1Var.c());
            } else {
                e w11 = w(p1Var);
                m1 m1Var2 = k1.f417a;
                return w11.f388b < 1 ? k1.f417a : new m1(w11);
            }
        }
    }

    public final s s() throws IOException {
        int read = read();
        if (read > 0) {
            int t10 = t(this, read);
            boolean z = (read & 32) != 0;
            int f10 = f(this, this.f409a, false);
            if (f10 >= 0) {
                try {
                    return a(read, t10, f10);
                } catch (IllegalArgumentException e10) {
                    throw new g("corrupted stream detected", e10);
                }
            } else if (z) {
                x xVar = new x(new r1(this, this.f409a), this.f409a);
                if ((read & 64) != 0) {
                    return new a0(t10, xVar.c());
                }
                if ((read & 128) != 0) {
                    return xVar.b(true, t10);
                }
                if (t10 == 4) {
                    return new d0(a.a(new l0(xVar)));
                }
                if (t10 == 8) {
                    try {
                        return new j1(xVar.c());
                    } catch (IllegalArgumentException e11) {
                        throw new g(e11.getMessage(), e11);
                    }
                } else if (t10 == 16) {
                    return new f0(xVar.c());
                } else {
                    if (t10 == 17) {
                        return new h0(xVar.c());
                    }
                    throw new IOException("unknown BER object encountered");
                }
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }

    public final e w(p1 p1Var) throws IOException {
        if (p1Var.f434s < 1) {
            return new e(0);
        }
        j jVar = new j((InputStream) p1Var);
        e eVar = new e();
        while (true) {
            s s10 = jVar.s();
            if (s10 == null) {
                return eVar;
            }
            eVar.a(s10);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(byte[] r2) {
        /*
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            int r2 = r2.length
            r1.<init>(r0)
            r1.f409a = r2
            r2 = 0
            r1.f410b = r2
            r2 = 11
            byte[][] r2 = new byte[r2][]
            r1.f411c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.j.<init>(byte[]):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(byte[] r1, boolean r2) {
        /*
            r0 = this;
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r1)
            int r1 = r1.length
            r0.<init>(r2)
            r0.f409a = r1
            r1 = 1
            r0.f410b = r1
            r1 = 11
            byte[][] r1 = new byte[r1][]
            r0.f411c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.j.<init>(byte[], boolean):void");
    }
}
