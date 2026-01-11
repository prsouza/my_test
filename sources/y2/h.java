package y2;

import java.io.IOException;
import t2.b;
import z2.c;

public final class h implements h0<b> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f13392a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f13393b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    public final Object a(c cVar, float f10) throws IOException {
        b.a aVar = b.a.CENTER;
        cVar.c();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        boolean z = true;
        while (cVar.s()) {
            switch (cVar.S(f13393b)) {
                case 0:
                    str = cVar.E();
                    break;
                case 1:
                    str2 = cVar.E();
                    break;
                case 2:
                    f11 = (float) cVar.w();
                    break;
                case 3:
                    int y10 = cVar.y();
                    aVar2 = b.a.CENTER;
                    if (y10 <= aVar2.ordinal() && y10 >= 0) {
                        aVar2 = b.a.values()[y10];
                        break;
                    }
                case 4:
                    i = cVar.y();
                    break;
                case 5:
                    f12 = (float) cVar.w();
                    break;
                case 6:
                    f13 = (float) cVar.w();
                    break;
                case 7:
                    i10 = p.a(cVar);
                    break;
                case 8:
                    i11 = p.a(cVar);
                    break;
                case 9:
                    f14 = (float) cVar.w();
                    break;
                case 10:
                    z = cVar.t();
                    break;
                default:
                    cVar.T();
                    cVar.a0();
                    break;
            }
        }
        c cVar2 = cVar;
        cVar.f();
        return new b(str, str2, f11, aVar2, i, f12, f13, i10, i11, f14, z);
    }
}
