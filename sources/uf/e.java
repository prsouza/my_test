package uf;

import ah.v;
import androidx.activity.result.d;
import b9.m;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.api.Api;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import y.c;

public final class e implements h, g, Cloneable, ByteChannel {

    /* renamed from: a  reason: collision with root package name */
    public w f11951a;

    /* renamed from: b  reason: collision with root package name */
    public long f11952b;

    public final /* bridge */ /* synthetic */ g A(int i) {
        B0(i);
        return this;
    }

    /* renamed from: A0 */
    public final e n(long j10) {
        if (j10 == 0) {
            y0(48);
        } else {
            long j11 = (j10 >>> 1) | j10;
            long j12 = j11 | (j11 >>> 2);
            long j13 = j12 | (j12 >>> 4);
            long j14 = j13 | (j13 >>> 8);
            long j15 = j14 | (j14 >>> 16);
            long j16 = j15 | (j15 >>> 32);
            long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
            long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
            long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
            long j20 = j19 + (j19 >>> 8);
            long j21 = j20 + (j20 >>> 16);
            int i = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            w f02 = f0(i);
            byte[] bArr = f02.f11993a;
            int i10 = f02.f11995c;
            for (int i11 = (i10 + i) - 1; i11 >= i10; i11--) {
                bArr[i11] = vf.a.f12469a[(int) (15 & j10)];
                j10 >>>= 4;
            }
            f02.f11995c += i;
            this.f11952b += (long) i;
        }
        return this;
    }

    public final long B(byte b10, long j10, long j11) {
        w wVar;
        long j12 = 0;
        if (0 <= j10 && j11 >= j10) {
            long j13 = this.f11952b;
            if (j11 > j13) {
                j11 = j13;
            }
            if (!(j10 == j11 || (wVar = this.f11951a) == null)) {
                if (j13 - j10 < j10) {
                    while (j13 > j10) {
                        wVar = wVar.g;
                        e6.e.B(wVar);
                        j13 -= (long) (wVar.f11995c - wVar.f11994b);
                    }
                    while (j13 < j11) {
                        byte[] bArr = wVar.f11993a;
                        int min = (int) Math.min((long) wVar.f11995c, (((long) wVar.f11994b) + j11) - j13);
                        for (int i = (int) ((((long) wVar.f11994b) + j10) - j13); i < min; i++) {
                            if (bArr[i] == b10) {
                                return ((long) (i - wVar.f11994b)) + j13;
                            }
                        }
                        j13 += (long) (wVar.f11995c - wVar.f11994b);
                        wVar = wVar.f11998f;
                        e6.e.B(wVar);
                        j10 = j13;
                    }
                } else {
                    while (true) {
                        long j14 = ((long) (wVar.f11995c - wVar.f11994b)) + j12;
                        if (j14 > j10) {
                            break;
                        }
                        wVar = wVar.f11998f;
                        e6.e.B(wVar);
                        j12 = j14;
                    }
                    while (j12 < j11) {
                        byte[] bArr2 = wVar.f11993a;
                        int min2 = (int) Math.min((long) wVar.f11995c, (((long) wVar.f11994b) + j11) - j12);
                        for (int i10 = (int) ((((long) wVar.f11994b) + j10) - j12); i10 < min2; i10++) {
                            if (bArr2[i10] == b10) {
                                return ((long) (i10 - wVar.f11994b)) + j12;
                            }
                        }
                        j12 += (long) (wVar.f11995c - wVar.f11994b);
                        wVar = wVar.f11998f;
                        e6.e.B(wVar);
                        j10 = j12;
                    }
                }
            }
            return -1;
        }
        StringBuilder d10 = a.a.d("size=");
        d10.append(this.f11952b);
        d10.append(" fromIndex=");
        d10.append(j10);
        d10.append(" toIndex=");
        d10.append(j11);
        throw new IllegalArgumentException(d10.toString().toString());
    }

    public final e B0(int i) {
        w f02 = f0(4);
        byte[] bArr = f02.f11993a;
        int i10 = f02.f11995c;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((i >>> 24) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i >>> 16) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i >>> 8) & 255);
        bArr[i13] = (byte) (i & 255);
        f02.f11995c = i13 + 1;
        this.f11952b += 4;
        return this;
    }

    public final long C(z zVar) throws IOException {
        long j10 = this.f11952b;
        if (j10 > 0) {
            ((e) zVar).H(this, j10);
        }
        return j10;
    }

    public final e C0(int i) {
        w f02 = f0(2);
        byte[] bArr = f02.f11993a;
        int i10 = f02.f11995c;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((i >>> 8) & 255);
        bArr[i11] = (byte) (i & 255);
        f02.f11995c = i11 + 1;
        this.f11952b += 2;
        return this;
    }

    public final e D0(String str) {
        e6.e.D(str, "string");
        E0(str, 0, str.length());
        return this;
    }

    public final long E(i iVar, long j10) {
        int i;
        int i10;
        int i11;
        int i12;
        e6.e.D(iVar, "targetBytes");
        long j11 = 0;
        if (j10 >= 0) {
            w wVar = this.f11951a;
            if (wVar == null) {
                return -1;
            }
            long j12 = this.f11952b;
            if (j12 - j10 < j10) {
                while (j12 > j10) {
                    wVar = wVar.g;
                    e6.e.B(wVar);
                    j12 -= (long) (wVar.f11995c - wVar.f11994b);
                }
                if (iVar.h() == 2) {
                    byte l10 = iVar.l(0);
                    byte l11 = iVar.l(1);
                    while (j12 < this.f11952b) {
                        byte[] bArr = wVar.f11993a;
                        i11 = (int) ((((long) wVar.f11994b) + j10) - j12);
                        int i13 = wVar.f11995c;
                        while (i11 < i13) {
                            byte b10 = bArr[i11];
                            if (b10 == l10 || b10 == l11) {
                                i12 = wVar.f11994b;
                            } else {
                                i11++;
                            }
                        }
                        j12 += (long) (wVar.f11995c - wVar.f11994b);
                        wVar = wVar.f11998f;
                        e6.e.B(wVar);
                        j10 = j12;
                    }
                    return -1;
                }
                byte[] k10 = iVar.k();
                while (j12 < this.f11952b) {
                    byte[] bArr2 = wVar.f11993a;
                    int i14 = (int) ((((long) wVar.f11994b) + j10) - j12);
                    int i15 = wVar.f11995c;
                    while (i11 < i15) {
                        byte b11 = bArr2[i11];
                        int length = k10.length;
                        int i16 = 0;
                        while (i16 < length) {
                            if (b11 == k10[i16]) {
                                i12 = wVar.f11994b;
                            } else {
                                i16++;
                            }
                        }
                        i14 = i11 + 1;
                    }
                    j12 += (long) (wVar.f11995c - wVar.f11994b);
                    wVar = wVar.f11998f;
                    e6.e.B(wVar);
                    j10 = j12;
                }
                return -1;
                return ((long) (i11 - i12)) + j12;
            }
            while (true) {
                long j13 = ((long) (wVar.f11995c - wVar.f11994b)) + j11;
                if (j13 > j10) {
                    break;
                }
                wVar = wVar.f11998f;
                e6.e.B(wVar);
                j11 = j13;
            }
            if (iVar.h() == 2) {
                byte l12 = iVar.l(0);
                byte l13 = iVar.l(1);
                while (j11 < this.f11952b) {
                    byte[] bArr3 = wVar.f11993a;
                    i = (int) ((((long) wVar.f11994b) + j10) - j11);
                    int i17 = wVar.f11995c;
                    while (i < i17) {
                        byte b12 = bArr3[i];
                        if (b12 == l12 || b12 == l13) {
                            i10 = wVar.f11994b;
                        } else {
                            i++;
                        }
                    }
                    j11 += (long) (wVar.f11995c - wVar.f11994b);
                    wVar = wVar.f11998f;
                    e6.e.B(wVar);
                    j10 = j11;
                }
                return -1;
            }
            byte[] k11 = iVar.k();
            while (j11 < this.f11952b) {
                byte[] bArr4 = wVar.f11993a;
                int i18 = (int) ((((long) wVar.f11994b) + j10) - j11);
                int i19 = wVar.f11995c;
                while (i < i19) {
                    byte b13 = bArr4[i];
                    int length2 = k11.length;
                    int i20 = 0;
                    while (i20 < length2) {
                        if (b13 == k11[i20]) {
                            i10 = wVar.f11994b;
                        } else {
                            i20++;
                        }
                    }
                    i18 = i + 1;
                }
                j11 += (long) (wVar.f11995c - wVar.f11994b);
                wVar = wVar.f11998f;
                e6.e.B(wVar);
                j10 = j11;
            }
            return -1;
            return ((long) (i - i10)) + j11;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.d("fromIndex < 0: ", j10).toString());
    }

    public final e E0(String str, int i, int i10) {
        char charAt;
        e6.e.D(str, "string");
        if (i >= 0) {
            if (i10 >= i) {
                if (i10 <= str.length()) {
                    while (i < i10) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            w f02 = f0(1);
                            byte[] bArr = f02.f11993a;
                            int i11 = f02.f11995c - i;
                            int min = Math.min(i10, 8192 - i11);
                            int i12 = i + 1;
                            bArr[i + i11] = (byte) charAt2;
                            while (true) {
                                i = i12;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    int i13 = f02.f11995c;
                                    int i14 = (i11 + i) - i13;
                                    f02.f11995c = i13 + i14;
                                    this.f11952b += (long) i14;
                                } else {
                                    i12 = i + 1;
                                    bArr[i + i11] = (byte) charAt;
                                }
                            }
                            int i132 = f02.f11995c;
                            int i142 = (i11 + i) - i132;
                            f02.f11995c = i132 + i142;
                            this.f11952b += (long) i142;
                        } else {
                            if (charAt2 < 2048) {
                                w f03 = f0(2);
                                byte[] bArr2 = f03.f11993a;
                                int i15 = f03.f11995c;
                                bArr2[i15] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                                f03.f11995c = i15 + 2;
                                this.f11952b += 2;
                            } else if (charAt2 < 55296 || charAt2 > 57343) {
                                w f04 = f0(3);
                                byte[] bArr3 = f04.f11993a;
                                int i16 = f04.f11995c;
                                bArr3[i16] = (byte) ((charAt2 >> 12) | 224);
                                bArr3[i16 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr3[i16 + 2] = (byte) ((charAt2 & '?') | 128);
                                f04.f11995c = i16 + 3;
                                this.f11952b += 3;
                            } else {
                                int i17 = i + 1;
                                char charAt3 = i17 < i10 ? str.charAt(i17) : 0;
                                if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    y0(63);
                                    i = i17;
                                } else {
                                    int i18 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + LZ4Constants.MAX_DISTANCE;
                                    w f05 = f0(4);
                                    byte[] bArr4 = f05.f11993a;
                                    int i19 = f05.f11995c;
                                    bArr4[i19] = (byte) ((i18 >> 18) | 240);
                                    bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                    bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                    bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                                    f05.f11995c = i19 + 4;
                                    this.f11952b += 4;
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                StringBuilder d10 = a8.a.d("endIndex > string.length: ", i10, " > ");
                d10.append(str.length());
                throw new IllegalArgumentException(d10.toString().toString());
            }
            throw new IllegalArgumentException(d.b("endIndex < beginIndex: ", i10, " < ", i).toString());
        }
        throw new IllegalArgumentException(m.b("beginIndex < 0: ", i).toString());
    }

    public final String F() throws EOFException {
        return W(Long.MAX_VALUE);
    }

    public final e F0(int i) {
        String str;
        if (i < 128) {
            y0(i);
        } else if (i < 2048) {
            w f02 = f0(2);
            byte[] bArr = f02.f11993a;
            int i10 = f02.f11995c;
            bArr[i10] = (byte) ((i >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i & 63) | 128);
            f02.f11995c = i10 + 2;
            this.f11952b += 2;
        } else if (55296 <= i && 57343 >= i) {
            y0(63);
        } else if (i < 65536) {
            w f03 = f0(3);
            byte[] bArr2 = f03.f11993a;
            int i11 = f03.f11995c;
            bArr2[i11] = (byte) ((i >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i & 63) | 128);
            f03.f11995c = i11 + 3;
            this.f11952b += 3;
        } else if (i <= 1114111) {
            w f04 = f0(4);
            byte[] bArr3 = f04.f11993a;
            int i12 = f04.f11995c;
            bArr3[i12] = (byte) ((i >> 18) | 240);
            bArr3[i12 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i12 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i12 + 3] = (byte) ((i & 63) | 128);
            f04.f11995c = i12 + 4;
            this.f11952b += 4;
        } else {
            StringBuilder d10 = a.a.d("Unexpected code point: 0x");
            if (i != 0) {
                char[] cArr = c.f13324x;
                int i13 = 0;
                char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                while (i13 < 8 && cArr2[i13] == '0') {
                    i13++;
                }
                str = new String(cArr2, i13, 8 - i13);
            } else {
                str = "0";
            }
            d10.append(str);
            throw new IllegalArgumentException(d10.toString());
        }
        return this;
    }

    public final void H(e eVar, long j10) {
        int i;
        w wVar;
        e6.e.D(eVar, "source");
        if (eVar != this) {
            v.B(eVar.f11952b, 0, j10);
            while (j10 > 0) {
                w wVar2 = eVar.f11951a;
                e6.e.B(wVar2);
                int i10 = wVar2.f11995c;
                w wVar3 = eVar.f11951a;
                e6.e.B(wVar3);
                if (j10 < ((long) (i10 - wVar3.f11994b))) {
                    w wVar4 = this.f11951a;
                    w wVar5 = wVar4 != null ? wVar4.g : null;
                    if (wVar5 != null && wVar5.f11997e) {
                        if ((((long) wVar5.f11995c) + j10) - ((long) (wVar5.f11996d ? 0 : wVar5.f11994b)) <= ((long) LZ4Constants.HASH_TABLE_SIZE_64K)) {
                            w wVar6 = eVar.f11951a;
                            e6.e.B(wVar6);
                            wVar6.d(wVar5, (int) j10);
                            eVar.f11952b -= j10;
                            this.f11952b += j10;
                            return;
                        }
                    }
                    w wVar7 = eVar.f11951a;
                    e6.e.B(wVar7);
                    int i11 = (int) j10;
                    if (i11 > 0 && i11 <= wVar7.f11995c - wVar7.f11994b) {
                        if (i11 >= 1024) {
                            wVar = wVar7.c();
                        } else {
                            wVar = x.c();
                            byte[] bArr = wVar7.f11993a;
                            byte[] bArr2 = wVar.f11993a;
                            int i12 = wVar7.f11994b;
                            nd.d.F(bArr, bArr2, 0, i12, i12 + i11, 2);
                        }
                        wVar.f11995c = wVar.f11994b + i11;
                        wVar7.f11994b += i11;
                        w wVar8 = wVar7.g;
                        e6.e.B(wVar8);
                        wVar8.b(wVar);
                        eVar.f11951a = wVar;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                w wVar9 = eVar.f11951a;
                e6.e.B(wVar9);
                long j11 = (long) (wVar9.f11995c - wVar9.f11994b);
                eVar.f11951a = wVar9.a();
                w wVar10 = this.f11951a;
                if (wVar10 == null) {
                    this.f11951a = wVar9;
                    wVar9.g = wVar9;
                    wVar9.f11998f = wVar9;
                } else {
                    w wVar11 = wVar10.g;
                    e6.e.B(wVar11);
                    wVar11.b(wVar9);
                    w wVar12 = wVar9.g;
                    if (wVar12 != wVar9) {
                        e6.e.B(wVar12);
                        if (wVar12.f11997e) {
                            int i13 = wVar9.f11995c - wVar9.f11994b;
                            w wVar13 = wVar9.g;
                            e6.e.B(wVar13);
                            int i14 = LZ4Constants.HASH_TABLE_SIZE_64K - wVar13.f11995c;
                            w wVar14 = wVar9.g;
                            e6.e.B(wVar14);
                            if (wVar14.f11996d) {
                                i = 0;
                            } else {
                                w wVar15 = wVar9.g;
                                e6.e.B(wVar15);
                                i = wVar15.f11994b;
                            }
                            if (i13 <= i14 + i) {
                                w wVar16 = wVar9.g;
                                e6.e.B(wVar16);
                                wVar9.d(wVar16, i13);
                                wVar9.a();
                                x.b(wVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                eVar.f11952b -= j11;
                this.f11952b += j11;
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final long I(e eVar, long j10) {
        e6.e.D(eVar, "sink");
        if (j10 >= 0) {
            long j11 = this.f11952b;
            if (j11 == 0) {
                return -1;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            eVar.H(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.d("byteCount < 0: ", j10).toString());
    }

    public final boolean J() {
        return this.f11952b == 0;
    }

    public final /* bridge */ /* synthetic */ g K(int i) {
        y0(i);
        return this;
    }

    public final byte[] L(long j10) throws EOFException {
        int i = 0;
        if (!(j10 >= 0 && j10 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(android.support.v4.media.a.d("byteCount: ", j10).toString());
        } else if (this.f11952b >= j10) {
            int i10 = (int) j10;
            byte[] bArr = new byte[i10];
            while (i < i10) {
                int read = read(bArr, i, i10 - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final i O() {
        return p(this.f11952b);
    }

    public final /* bridge */ /* synthetic */ g Q(byte[] bArr) {
        v0(bArr);
        return this;
    }

    public final short R() throws EOFException {
        short readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final String S(long j10, Charset charset) throws EOFException {
        e6.e.D(charset, "charset");
        int i = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (!(i >= 0 && j10 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(android.support.v4.media.a.d("byteCount: ", j10).toString());
        } else if (this.f11952b < j10) {
            throw new EOFException();
        } else if (i == 0) {
            return BuildConfig.FLAVOR;
        } else {
            w wVar = this.f11951a;
            e6.e.B(wVar);
            int i10 = wVar.f11994b;
            if (((long) i10) + j10 > ((long) wVar.f11995c)) {
                return new String(L(j10), charset);
            }
            int i11 = (int) j10;
            String str = new String(wVar.f11993a, i10, i11, charset);
            int i12 = wVar.f11994b + i11;
            wVar.f11994b = i12;
            this.f11952b -= j10;
            if (i12 == wVar.f11995c) {
                this.f11951a = wVar.a();
                x.b(wVar);
            }
            return str;
        }
    }

    public final String T() {
        return S(this.f11952b, fe.a.f5086b);
    }

    public final String W(long j10) throws EOFException {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long B = B(b10, 0, j11);
            if (B != -1) {
                return vf.a.a(this, B);
            }
            if (j11 < this.f11952b && y(j11 - 1) == ((byte) 13) && y(j11) == b10) {
                return vf.a.a(this, j11);
            }
            e eVar = new e();
            w(eVar, 0, Math.min((long) 32, this.f11952b));
            StringBuilder d10 = a.a.d("\\n not found: limit=");
            d10.append(Math.min(this.f11952b, j10));
            d10.append(" content=");
            d10.append(eVar.O().i());
            d10.append(8230);
            throw new EOFException(d10.toString());
        }
        throw new IllegalArgumentException(android.support.v4.media.a.d("limit < 0: ", j10).toString());
    }

    public final void a() {
        skip(this.f11952b);
    }

    public final String a0(long j10) throws EOFException {
        return S(j10, fe.a.f5086b);
    }

    public final e b() {
        return this;
    }

    public final i b0(int i) {
        if (i == 0) {
            return i.f11955s;
        }
        v.B(this.f11952b, 0, (long) i);
        w wVar = this.f11951a;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i) {
            e6.e.B(wVar);
            int i13 = wVar.f11995c;
            int i14 = wVar.f11994b;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                wVar = wVar.f11998f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[(i12 * 2)];
        w wVar2 = this.f11951a;
        int i15 = 0;
        while (i10 < i) {
            e6.e.B(wVar2);
            bArr[i15] = wVar2.f11993a;
            i10 += wVar2.f11995c - wVar2.f11994b;
            iArr[i15] = Math.min(i10, i);
            iArr[i15 + i12] = wVar2.f11994b;
            wVar2.f11996d = true;
            i15++;
            wVar2 = wVar2.f11998f;
        }
        return new y(bArr, iArr);
    }

    public final long c() {
        long j10 = this.f11952b;
        if (j10 == 0) {
            return 0;
        }
        w wVar = this.f11951a;
        e6.e.B(wVar);
        w wVar2 = wVar.g;
        e6.e.B(wVar2);
        int i = wVar2.f11995c;
        if (i < 8192 && wVar2.f11997e) {
            j10 -= (long) (i - wVar2.f11994b);
        }
        return j10;
    }

    public final Object clone() {
        e eVar = new e();
        if (this.f11952b != 0) {
            w wVar = this.f11951a;
            e6.e.B(wVar);
            w c10 = wVar.c();
            eVar.f11951a = c10;
            c10.g = c10;
            c10.f11998f = c10;
            for (w wVar2 = wVar.f11998f; wVar2 != wVar; wVar2 = wVar2.f11998f) {
                w wVar3 = c10.g;
                e6.e.B(wVar3);
                e6.e.B(wVar2);
                wVar3.b(wVar2.c());
            }
            eVar.f11952b = this.f11952b;
        }
        return eVar;
    }

    public final void close() {
    }

    public final c0 d() {
        return c0.f11945d;
    }

    public final long d0(i iVar) {
        e6.e.D(iVar, "targetBytes");
        return E(iVar, 0);
    }

    public final /* bridge */ /* synthetic */ g e0(i iVar) {
        p0(iVar);
        return this;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = r3
            goto L_0x0078
        L_0x000b:
            boolean r4 = r1 instanceof uf.e
            if (r4 != 0) goto L_0x0011
            goto L_0x0078
        L_0x0011:
            long r4 = r0.f11952b
            uf.e r1 = (uf.e) r1
            long r6 = r1.f11952b
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x001c
            goto L_0x0078
        L_0x001c:
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0023
            goto L_0x0008
        L_0x0023:
            uf.w r4 = r0.f11951a
            e6.e.B(r4)
            uf.w r1 = r1.f11951a
            e6.e.B(r1)
            int r5 = r4.f11994b
            int r8 = r1.f11994b
            r9 = r6
        L_0x0032:
            long r11 = r0.f11952b
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0008
            int r11 = r4.f11995c
            int r11 = r11 - r5
            int r12 = r1.f11995c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x0044:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0060
            byte[] r15 = r4.f11993a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f11993a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x0044
        L_0x0060:
            int r13 = r4.f11995c
            if (r5 != r13) goto L_0x006b
            uf.w r4 = r4.f11998f
            e6.e.B(r4)
            int r5 = r4.f11994b
        L_0x006b:
            int r13 = r1.f11995c
            if (r8 != r13) goto L_0x0076
            uf.w r1 = r1.f11998f
            e6.e.B(r1)
            int r8 = r1.f11994b
        L_0x0076:
            long r9 = r9 + r11
            goto L_0x0032
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.e.equals(java.lang.Object):boolean");
    }

    public final w f0(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            w wVar = this.f11951a;
            if (wVar == null) {
                w c10 = x.c();
                this.f11951a = c10;
                c10.g = c10;
                c10.f11998f = c10;
                return c10;
            }
            e6.e.B(wVar);
            w wVar2 = wVar.g;
            e6.e.B(wVar2);
            if (wVar2.f11995c + i <= 8192 && wVar2.f11997e) {
                return wVar2;
            }
            w c11 = x.c();
            wVar2.b(c11);
            return c11;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void flush() {
    }

    public final /* bridge */ /* synthetic */ g g(byte[] bArr, int i, int i10) {
        w0(bArr, i, i10);
        return this;
    }

    public final int hashCode() {
        w wVar = this.f11951a;
        if (wVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i10 = wVar.f11995c;
            for (int i11 = wVar.f11994b; i11 < i10; i11++) {
                i = (i * 31) + wVar.f11993a[i11];
            }
            wVar = wVar.f11998f;
            e6.e.B(wVar);
        } while (wVar != this.f11951a);
        return i;
    }

    public final void i0(long j10) throws EOFException {
        if (this.f11952b < j10) {
            throw new EOFException();
        }
    }

    public final boolean isOpen() {
        return true;
    }

    public final /* bridge */ /* synthetic */ g j0(String str) {
        D0(str);
        return this;
    }

    public final int l(r rVar) {
        e6.e.D(rVar, "options");
        int b10 = vf.a.b(this, rVar, false);
        if (b10 == -1) {
            return -1;
        }
        skip((long) rVar.f11976a[b10].h());
        return b10;
    }

    public final i p(long j10) throws EOFException {
        if (!(j10 >= 0 && j10 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER))) {
            throw new IllegalArgumentException(android.support.v4.media.a.d("byteCount: ", j10).toString());
        } else if (this.f11952b < j10) {
            throw new EOFException();
        } else if (j10 < ((long) LZ4Constants.HASH_TABLE_SIZE)) {
            return new i(L(j10));
        } else {
            i b0 = b0((int) j10);
            skip(j10);
            return b0;
        }
    }

    public final e p0(i iVar) {
        e6.e.D(iVar, "byteString");
        iVar.s(this, iVar.h());
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        if (r9 != r10) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r15.f11951a = r7.a();
        uf.x.b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        r7.f11994b = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        if (r6 != false) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0079 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long q0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f11952b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00bf
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        L_0x000c:
            uf.w r7 = r15.f11951a
            e6.e.B(r7)
            byte[] r8 = r7.f11993a
            int r9 = r7.f11994b
            int r10 = r7.f11995c
        L_0x0017:
            r11 = 1
            if (r9 >= r10) goto L_0x00a4
            byte r12 = r8[r9]
            r13 = 48
            byte r13 = (byte) r13
            if (r12 < r13) goto L_0x0029
            r14 = 57
            byte r14 = (byte) r14
            if (r12 > r14) goto L_0x0029
            int r11 = r12 - r13
            goto L_0x0042
        L_0x0029:
            r13 = 97
            byte r13 = (byte) r13
            if (r12 < r13) goto L_0x0034
            r14 = 102(0x66, float:1.43E-43)
            byte r14 = (byte) r14
            if (r12 > r14) goto L_0x0034
            goto L_0x003e
        L_0x0034:
            r13 = 65
            byte r13 = (byte) r13
            if (r12 < r13) goto L_0x0075
            r14 = 70
            byte r14 = (byte) r14
            if (r12 > r14) goto L_0x0075
        L_0x003e:
            int r11 = r12 - r13
            int r11 = r11 + 10
        L_0x0042:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0052
            r12 = 4
            long r4 = r4 << r12
            long r11 = (long) r11
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0052:
            uf.e r0 = new uf.e
            r0.<init>()
            uf.e r0 = r0.n(r4)
            r0.y0(r12)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = a.a.d(r2)
            java.lang.String r0 = r0.T()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0075:
            if (r1 == 0) goto L_0x0079
            r6 = r11
            goto L_0x00a4
        L_0x0079:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r2 = a.a.d(r2)
            r3 = 2
            char[] r3 = new char[r3]
            char[] r4 = y.c.f13324x
            int r5 = r12 >> 4
            r5 = r5 & 15
            char r5 = r4[r5]
            r3[r0] = r5
            r0 = r12 & 15
            char r0 = r4[r0]
            r3[r11] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x00a4:
            if (r9 != r10) goto L_0x00b0
            uf.w r8 = r7.a()
            r15.f11951a = r8
            uf.x.b(r7)
            goto L_0x00b2
        L_0x00b0:
            r7.f11994b = r9
        L_0x00b2:
            if (r6 != 0) goto L_0x00b8
            uf.w r7 = r15.f11951a
            if (r7 != 0) goto L_0x000c
        L_0x00b8:
            long r2 = r15.f11952b
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f11952b = r2
            return r4
        L_0x00bf:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.e.q0():long");
    }

    public final String r0(Charset charset) {
        return S(this.f11952b, charset);
    }

    public final int read(ByteBuffer byteBuffer) throws IOException {
        e6.e.D(byteBuffer, "sink");
        w wVar = this.f11951a;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), wVar.f11995c - wVar.f11994b);
        byteBuffer.put(wVar.f11993a, wVar.f11994b, min);
        int i = wVar.f11994b + min;
        wVar.f11994b = i;
        this.f11952b -= (long) min;
        if (i == wVar.f11995c) {
            this.f11951a = wVar.a();
            x.b(wVar);
        }
        return min;
    }

    public final byte readByte() throws EOFException {
        if (this.f11952b != 0) {
            w wVar = this.f11951a;
            e6.e.B(wVar);
            int i = wVar.f11994b;
            int i10 = wVar.f11995c;
            int i11 = i + 1;
            byte b10 = wVar.f11993a[i];
            this.f11952b--;
            if (i11 == i10) {
                this.f11951a = wVar.a();
                x.b(wVar);
            } else {
                wVar.f11994b = i11;
            }
            return b10;
        }
        throw new EOFException();
    }

    public final int readInt() throws EOFException {
        if (this.f11952b >= 4) {
            w wVar = this.f11951a;
            e6.e.B(wVar);
            int i = wVar.f11994b;
            int i10 = wVar.f11995c;
            if (((long) (i10 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = wVar.f11993a;
            int i11 = i + 1;
            int i12 = i11 + 1;
            byte b10 = ((bArr[i] & 255) << 24) | ((bArr[i11] & 255) << 16);
            int i13 = i12 + 1;
            byte b11 = b10 | ((bArr[i12] & 255) << 8);
            int i14 = i13 + 1;
            byte b12 = b11 | (bArr[i13] & 255);
            this.f11952b -= 4;
            if (i14 == i10) {
                this.f11951a = wVar.a();
                x.b(wVar);
            } else {
                wVar.f11994b = i14;
            }
            return b12;
        }
        throw new EOFException();
    }

    public final short readShort() throws EOFException {
        if (this.f11952b >= 2) {
            w wVar = this.f11951a;
            e6.e.B(wVar);
            int i = wVar.f11994b;
            int i10 = wVar.f11995c;
            if (i10 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = wVar.f11993a;
            int i11 = i + 1;
            int i12 = i11 + 1;
            byte b10 = ((bArr[i] & 255) << 8) | (bArr[i11] & 255);
            this.f11952b -= 2;
            if (i12 == i10) {
                this.f11951a = wVar.a();
                x.b(wVar);
            } else {
                wVar.f11994b = i12;
            }
            return (short) b10;
        }
        throw new EOFException();
    }

    public final InputStream s0() {
        return new a(this);
    }

    public final void skip(long j10) throws EOFException {
        while (j10 > 0) {
            w wVar = this.f11951a;
            if (wVar != null) {
                int min = (int) Math.min(j10, (long) (wVar.f11995c - wVar.f11994b));
                long j11 = (long) min;
                this.f11952b -= j11;
                j10 -= j11;
                int i = wVar.f11994b + min;
                wVar.f11994b = i;
                if (i == wVar.f11995c) {
                    this.f11951a = wVar.a();
                    x.b(wVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final String toString() {
        long j10 = this.f11952b;
        if (j10 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            return b0((int) j10).toString();
        }
        StringBuilder d10 = a.a.d("size > Int.MAX_VALUE: ");
        d10.append(this.f11952b);
        throw new IllegalStateException(d10.toString().toString());
    }

    public final /* bridge */ /* synthetic */ g u(int i) {
        C0(i);
        return this;
    }

    public final boolean v(long j10) {
        return this.f11952b >= j10;
    }

    public final e v0(byte[] bArr) {
        e6.e.D(bArr, "source");
        w0(bArr, 0, bArr.length);
        return this;
    }

    public final e w(e eVar, long j10, long j11) {
        e6.e.D(eVar, "out");
        v.B(this.f11952b, j10, j11);
        if (j11 != 0) {
            eVar.f11952b += j11;
            w wVar = this.f11951a;
            while (true) {
                e6.e.B(wVar);
                int i = wVar.f11995c;
                int i10 = wVar.f11994b;
                if (j10 < ((long) (i - i10))) {
                    break;
                }
                j10 -= (long) (i - i10);
                wVar = wVar.f11998f;
            }
            while (j11 > 0) {
                e6.e.B(wVar);
                w c10 = wVar.c();
                int i11 = c10.f11994b + ((int) j10);
                c10.f11994b = i11;
                c10.f11995c = Math.min(i11 + ((int) j11), c10.f11995c);
                w wVar2 = eVar.f11951a;
                if (wVar2 == null) {
                    c10.g = c10;
                    c10.f11998f = c10;
                    eVar.f11951a = c10;
                } else {
                    e6.e.B(wVar2);
                    w wVar3 = wVar2.g;
                    e6.e.B(wVar3);
                    wVar3.b(c10);
                }
                j11 -= (long) (c10.f11995c - c10.f11994b);
                wVar = wVar.f11998f;
                j10 = 0;
            }
        }
        return this;
    }

    public final e w0(byte[] bArr, int i, int i10) {
        e6.e.D(bArr, "source");
        long j10 = (long) i10;
        v.B((long) bArr.length, (long) i, j10);
        int i11 = i10 + i;
        while (i < i11) {
            w f02 = f0(1);
            int min = Math.min(i11 - i, 8192 - f02.f11995c);
            int i12 = i + min;
            nd.d.E(bArr, f02.f11993a, f02.f11995c, i, i12);
            f02.f11995c += min;
            i = i12;
        }
        this.f11952b += j10;
        return this;
    }

    public final int write(ByteBuffer byteBuffer) throws IOException {
        e6.e.D(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            w f02 = f0(1);
            int min = Math.min(i, 8192 - f02.f11995c);
            byteBuffer.get(f02.f11993a, f02.f11995c, min);
            i -= min;
            f02.f11995c += min;
        }
        this.f11952b += (long) remaining;
        return remaining;
    }

    public final long x0(b0 b0Var) throws IOException {
        e6.e.D(b0Var, "source");
        long j10 = 0;
        while (true) {
            long I = b0Var.I(this, (long) LZ4Constants.HASH_TABLE_SIZE_64K);
            if (I == -1) {
                return j10;
            }
            j10 += I;
        }
    }

    public final byte y(long j10) {
        v.B(this.f11952b, j10, 1);
        w wVar = this.f11951a;
        if (wVar != null) {
            long j11 = this.f11952b;
            if (j11 - j10 < j10) {
                while (j11 > j10) {
                    wVar = wVar.g;
                    e6.e.B(wVar);
                    j11 -= (long) (wVar.f11995c - wVar.f11994b);
                }
                return wVar.f11993a[(int) ((((long) wVar.f11994b) + j10) - j11)];
            }
            long j12 = 0;
            while (true) {
                int i = wVar.f11995c;
                int i10 = wVar.f11994b;
                long j13 = ((long) (i - i10)) + j12;
                if (j13 > j10) {
                    return wVar.f11993a[(int) ((((long) i10) + j10) - j12)];
                }
                wVar = wVar.f11998f;
                e6.e.B(wVar);
                j12 = j13;
            }
        } else {
            e6.e.B((Object) null);
            throw null;
        }
    }

    public final e y0(int i) {
        w f02 = f0(1);
        byte[] bArr = f02.f11993a;
        int i10 = f02.f11995c;
        f02.f11995c = i10 + 1;
        bArr[i10] = (byte) i;
        this.f11952b++;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f0 A[LOOP:0: B:67:0x00ec->B:69:0x00f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0100  */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uf.e l0(long r13) {
        /*
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000d
            r13 = 48
            r12.y0(r13)
            goto L_0x0112
        L_0x000d:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L_0x001e
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x001d
            java.lang.String r13 = "-9223372036854775808"
            r12.D0(r13)
            goto L_0x0112
        L_0x001d:
            r3 = r4
        L_0x001e:
            r5 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r5 = 10
            if (r2 >= 0) goto L_0x0068
            r6 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x004a
            r6 = 100
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003e
            r6 = 10
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003b
            goto L_0x00df
        L_0x003b:
            r4 = 2
            goto L_0x00df
        L_0x003e:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0046
            r2 = 3
            goto L_0x0047
        L_0x0046:
            r2 = 4
        L_0x0047:
            r4 = r2
            goto L_0x00df
        L_0x004a:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005c
            r6 = 100000(0x186a0, double:4.94066E-319)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005a
            r2 = 5
            goto L_0x0047
        L_0x005a:
            r2 = 6
            goto L_0x0047
        L_0x005c:
            r6 = 10000000(0x989680, double:4.9406565E-317)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0065
            r2 = 7
            goto L_0x0047
        L_0x0065:
            r2 = 8
            goto L_0x0047
        L_0x0068:
            r6 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0095
            r6 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0086
            r6 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0084
            r4 = 9
            goto L_0x00df
        L_0x0084:
            r4 = r5
            goto L_0x00df
        L_0x0086:
            r6 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0092
            r2 = 11
            goto L_0x0047
        L_0x0092:
            r2 = 12
            goto L_0x0047
        L_0x0095:
            r6 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b9
            r6 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00aa
            r4 = 13
            goto L_0x00df
        L_0x00aa:
            r6 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b6
            r2 = 14
            goto L_0x0047
        L_0x00b6:
            r2 = 15
            goto L_0x0047
        L_0x00b9:
            r6 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d1
            r6 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ce
            r4 = 16
            goto L_0x00df
        L_0x00ce:
            r4 = 17
            goto L_0x00df
        L_0x00d1:
            r6 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00dd
            r4 = 18
            goto L_0x00df
        L_0x00dd:
            r4 = 19
        L_0x00df:
            if (r3 == 0) goto L_0x00e3
            int r4 = r4 + 1
        L_0x00e3:
            uf.w r2 = r12.f0(r4)
            byte[] r6 = r2.f11993a
            int r7 = r2.f11995c
            int r7 = r7 + r4
        L_0x00ec:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x00fe
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + -1
            byte[] r11 = vf.a.f12469a
            byte r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto L_0x00ec
        L_0x00fe:
            if (r3 == 0) goto L_0x0107
            int r7 = r7 + -1
            r13 = 45
            byte r13 = (byte) r13
            r6[r7] = r13
        L_0x0107:
            int r13 = r2.f11995c
            int r13 = r13 + r4
            r2.f11995c = r13
            long r13 = r12.f11952b
            long r0 = (long) r4
            long r13 = r13 + r0
            r12.f11952b = r13
        L_0x0112:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.e.l0(long):uf.e");
    }

    public static final class a extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f11953a;

        public a(e eVar) {
            this.f11953a = eVar;
        }

        public final int available() {
            return (int) Math.min(this.f11953a.f11952b, (long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        public final void close() {
        }

        public final int read() {
            e eVar = this.f11953a;
            if (eVar.f11952b > 0) {
                return eVar.readByte() & 255;
            }
            return -1;
        }

        public final String toString() {
            return this.f11953a + ".inputStream()";
        }

        public final int read(byte[] bArr, int i, int i10) {
            e6.e.D(bArr, "sink");
            return this.f11953a.read(bArr, i, i10);
        }
    }

    public final int read(byte[] bArr, int i, int i10) {
        e6.e.D(bArr, "sink");
        v.B((long) bArr.length, (long) i, (long) i10);
        w wVar = this.f11951a;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(i10, wVar.f11995c - wVar.f11994b);
        byte[] bArr2 = wVar.f11993a;
        int i11 = wVar.f11994b;
        nd.d.E(bArr2, bArr, i, i11, i11 + min);
        int i12 = wVar.f11994b + min;
        wVar.f11994b = i12;
        this.f11952b -= (long) min;
        if (i12 != wVar.f11995c) {
            return min;
        }
        this.f11951a = wVar.a();
        x.b(wVar);
        return min;
    }
}
