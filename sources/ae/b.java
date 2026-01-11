package ae;

import e6.e;
import java.util.Random;

public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final a f341c = new a();

    public static final class a extends ThreadLocal<Random> {
        public final Object initialValue() {
            return new Random();
        }
    }

    public final Random d() {
        Object obj = this.f341c.get();
        e.C(obj, "implStorage.get()");
        return (Random) obj;
    }
}
