package of;

import com.github.mikephil.charting.BuildConfig;
import e6.e;
import fe.o;
import p002if.q;
import uf.h;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f9422a = ((long) 262144);

    /* renamed from: b  reason: collision with root package name */
    public final h f9423b;

    public a(h hVar) {
        this.f9423b = hVar;
    }

    public final q a() {
        q.a aVar = new q.a();
        while (true) {
            String W = this.f9423b.W(this.f9422a);
            this.f9422a -= (long) W.length();
            if (W.length() == 0) {
                return aVar.c();
            }
            int l12 = o.l1(W, ':', 1, false, 4);
            if (l12 != -1) {
                String substring = W.substring(0, l12);
                e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = W.substring(l12 + 1);
                e.C(substring2, "(this as java.lang.String).substring(startIndex)");
                aVar.b(substring, substring2);
            } else if (W.charAt(0) == ':') {
                String substring3 = W.substring(1);
                e.C(substring3, "(this as java.lang.String).substring(startIndex)");
                aVar.b(BuildConfig.FLAVOR, substring3);
            } else {
                aVar.b(BuildConfig.FLAVOR, W);
            }
        }
    }
}
