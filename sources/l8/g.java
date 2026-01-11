package l8;

import a.a;
import i8.b;
import i8.d;
import i8.e;

public final /* synthetic */ class g implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ g f8137a = new g();

    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        StringBuilder d10 = a.d("Couldn't find encoder for type ");
        d10.append(obj.getClass().getCanonicalName());
        throw new b(d10.toString());
    }
}
