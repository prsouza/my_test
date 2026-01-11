package te;

import e6.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import se.b;
import se.m;
import se.o;
import se.q;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11578a;

    /* renamed from: b  reason: collision with root package name */
    public final h f11579b;

    public g(c cVar, h hVar) {
        e.D(cVar, "configuration");
        e.D(hVar, "reader");
        this.f11579b = hVar;
        this.f11578a = cVar.f11571c;
    }

    public final se.e a() {
        h hVar;
        byte b10;
        h hVar2;
        byte b11;
        if (this.f11579b.f()) {
            h hVar3 = this.f11579b;
            byte b12 = hVar3.f11581b;
            boolean z = false;
            if (b12 == 0) {
                return b(false);
            }
            if (b12 == 1) {
                return b(true);
            }
            if (b12 != 6) {
                if (b12 != 8) {
                    if (b12 == 10) {
                        o oVar = o.f11123a;
                        hVar3.g();
                        return oVar;
                    }
                    hVar3.c("Can't begin reading element, unexpected token", hVar3.f11580a);
                    throw null;
                } else if (b12 == 8) {
                    hVar3.g();
                    h hVar4 = this.f11579b;
                    boolean z10 = hVar4.f11581b != 4;
                    int i = hVar4.f11580a;
                    if (z10) {
                        ArrayList arrayList = new ArrayList();
                        do {
                            boolean z11 = false;
                            while (this.f11579b.f()) {
                                arrayList.add(a());
                                hVar2 = this.f11579b;
                                b11 = hVar2.f11581b;
                                if (b11 == 4) {
                                    hVar2.g();
                                    z11 = true;
                                }
                            }
                            h hVar5 = this.f11579b;
                            boolean z12 = !z11;
                            int i10 = hVar5.f11580a;
                            if (z12) {
                                hVar5.g();
                                return new b(arrayList);
                            }
                            hVar5.c("Unexpected trailing comma", i10);
                            throw null;
                        } while (b11 == 9);
                        hVar2.c("Expected end of the array or comma", hVar2.f11582c);
                        throw null;
                    }
                    hVar4.c("Unexpected leading comma", i);
                    throw null;
                } else {
                    hVar3.c("Expected start of the array", hVar3.f11582c);
                    throw null;
                }
            } else if (b12 == 6) {
                hVar3.g();
                h hVar6 = this.f11579b;
                boolean z13 = hVar6.f11581b != 4;
                int i11 = hVar6.f11580a;
                if (z13) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    do {
                        boolean z14 = false;
                        while (this.f11579b.f()) {
                            String h10 = this.f11578a ? this.f11579b.h() : this.f11579b.j();
                            h hVar7 = this.f11579b;
                            if (hVar7.f11581b == 5) {
                                hVar7.g();
                                linkedHashMap.put(h10, a());
                                hVar = this.f11579b;
                                b10 = hVar.f11581b;
                                if (b10 == 4) {
                                    hVar.g();
                                    z14 = true;
                                }
                            } else {
                                hVar7.c("Expected ':'", hVar7.f11582c);
                                throw null;
                            }
                        }
                        h hVar8 = this.f11579b;
                        if (!z14 && hVar8.f11581b == 7) {
                            z = true;
                        }
                        int i12 = hVar8.f11580a;
                        if (z) {
                            hVar8.g();
                            return new q(linkedHashMap);
                        }
                        hVar8.c("Expected end of the object", i12);
                        throw null;
                    } while (b10 == 7);
                    hVar.c("Expected end of the object or comma", hVar.f11582c);
                    throw null;
                }
                hVar6.c("Unexpected leading comma", i11);
                throw null;
            } else {
                hVar3.c("Expected start of the object", hVar3.f11582c);
                throw null;
            }
        } else {
            h.d(this.f11579b, "Can't begin reading value from here");
            throw null;
        }
    }

    public final se.e b(boolean z) {
        String str;
        if (this.f11578a) {
            str = this.f11579b.h();
        } else {
            h hVar = this.f11579b;
            str = z ? hVar.j() : hVar.h();
        }
        return new m(str, z);
    }
}
