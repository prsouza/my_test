package vf;

import e6.e;
import uf.r;
import uf.w;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f12469a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(fe.a.f5086b);
        e.C(bytes, "(this as java.lang.String).getBytes(charset)");
        f12469a = bytes;
    }

    public static final String a(uf.e eVar, long j10) {
        e.D(eVar, "$this$readUtf8Line");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.y(j11) == ((byte) 13)) {
                String a02 = eVar.a0(j11);
                eVar.skip(2);
                return a02;
            }
        }
        String a03 = eVar.a0(j10);
        eVar.skip(1);
        return a03;
    }

    public static final int b(uf.e eVar, r rVar, boolean z) {
        int i;
        int i10;
        int i11;
        w wVar;
        int i12;
        uf.e eVar2 = eVar;
        r rVar2 = rVar;
        e.D(eVar2, "$this$selectPrefix");
        e.D(rVar2, "options");
        w wVar2 = eVar2.f11951a;
        if (wVar2 != null) {
            byte[] bArr = wVar2.f11993a;
            int i13 = wVar2.f11994b;
            int i14 = wVar2.f11995c;
            int[] iArr = rVar2.f11977b;
            w wVar3 = wVar2;
            int i15 = -1;
            int i16 = 0;
            loop0:
            while (true) {
                int i17 = i16 + 1;
                int i18 = iArr[i16];
                int i19 = i17 + 1;
                int i20 = iArr[i17];
                if (i20 != -1) {
                    i15 = i20;
                }
                if (wVar3 == null) {
                    break;
                }
                if (i18 < 0) {
                    int i21 = (i18 * -1) + i19;
                    while (true) {
                        int i22 = i13 + 1;
                        int i23 = i19 + 1;
                        if ((bArr[i13] & 255) != iArr[i19]) {
                            return i15;
                        }
                        boolean z10 = i23 == i21;
                        if (i22 == i14) {
                            e.B(wVar3);
                            w wVar4 = wVar3.f11998f;
                            e.B(wVar4);
                            i12 = wVar4.f11994b;
                            byte[] bArr2 = wVar4.f11993a;
                            i11 = wVar4.f11995c;
                            if (wVar4 != wVar2) {
                                byte[] bArr3 = bArr2;
                                wVar = wVar4;
                                bArr = bArr3;
                            } else if (!z10) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                wVar = null;
                            }
                        } else {
                            w wVar5 = wVar3;
                            i11 = i14;
                            i12 = i22;
                            wVar = wVar5;
                        }
                        if (z10) {
                            i10 = iArr[i23];
                            i = i12;
                            i14 = i11;
                            wVar3 = wVar;
                            break;
                        }
                        i13 = i12;
                        i14 = i11;
                        i19 = i23;
                        wVar3 = wVar;
                    }
                } else {
                    i = i13 + 1;
                    byte b10 = bArr[i13] & 255;
                    int i24 = i19 + i18;
                    while (i19 != i24) {
                        if (b10 == iArr[i19]) {
                            i10 = iArr[i19 + i18];
                            if (i == i14) {
                                wVar3 = wVar3.f11998f;
                                e.B(wVar3);
                                i = wVar3.f11994b;
                                bArr = wVar3.f11993a;
                                i14 = wVar3.f11995c;
                                if (wVar3 == wVar2) {
                                    wVar3 = null;
                                }
                            }
                        } else {
                            i19++;
                        }
                    }
                    return i15;
                }
                if (i10 >= 0) {
                    return i10;
                }
                i16 = -i10;
                i13 = i;
            }
            if (z) {
                return -2;
            }
            return i15;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }
}
