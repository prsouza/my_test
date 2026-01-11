package dc;

import java.security.Security;
import md.h;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final h f4430a = new h(b.f4434b);

    /* renamed from: b  reason: collision with root package name */
    public static final h f4431b = new h(a.f4433b);

    /* renamed from: c  reason: collision with root package name */
    public static final d f4432c = new d();

    public static final class a extends yd.h implements xd.a<Integer> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f4433b = new a();

        public a() {
            super(0);
        }

        public final Object c() {
            return Integer.valueOf(Security.addProvider(new wg.a()));
        }
    }

    public static final class b extends yd.h implements xd.a<Integer> {

        /* renamed from: b  reason: collision with root package name */
        public static final b f4434b = new b();

        public b() {
            super(0);
        }

        public final Object c() {
            return Integer.valueOf(Security.addProvider(new cf.d()));
        }
    }
}
