package b3;

import a.a;
import java.util.ArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2858a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2859b = new b();

    /* renamed from: c  reason: collision with root package name */
    public Object f2860c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2861d;

    public c(Object obj) {
        this.f2861d = obj;
    }

    public final Object a(Object obj, Object obj2) {
        b bVar = (b) this.f2859b;
        bVar.f2856a = obj;
        bVar.f2857b = obj2;
        return this.f2861d;
    }

    public final String toString() {
        String str;
        switch (this.f2858a) {
            case 1:
                StringBuilder d10 = a.d("[ClassStack (self-refs: ");
                ArrayList arrayList = (ArrayList) this.f2861d;
                if (arrayList == null) {
                    str = "0";
                } else {
                    str = String.valueOf(arrayList.size());
                }
                d10.append(str);
                d10.append(')');
                for (c cVar = this; cVar != null; cVar = (c) cVar.f2859b) {
                    d10.append(' ');
                    d10.append(((Class) cVar.f2860c).getName());
                }
                d10.append(']');
                return d10.toString();
            default:
                return super.toString();
        }
    }
}
