package i7;

import i7.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static volatile p f6338b;

    /* renamed from: c  reason: collision with root package name */
    public static final p f6339c = new p(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, x.e<?, ?>> f6340a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f6341a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6342b;

        public a(Object obj, int i) {
            this.f6341a = obj;
            this.f6342b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f6341a == aVar.f6341a && this.f6342b == aVar.f6342b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f6341a) * 65535) + this.f6342b;
        }
    }

    public p() {
        this.f6340a = new HashMap();
    }

    public static p a() {
        p pVar = f6338b;
        if (pVar == null) {
            synchronized (p.class) {
                pVar = f6338b;
                if (pVar == null) {
                    Class<?> cls = o.f6334a;
                    p pVar2 = null;
                    if (cls != null) {
                        try {
                            pVar2 = (p) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (pVar2 == null) {
                        pVar2 = f6339c;
                    }
                    f6338b = pVar2;
                    pVar = pVar2;
                }
            }
        }
        return pVar;
    }

    public p(boolean z) {
        this.f6340a = Collections.emptyMap();
    }
}
