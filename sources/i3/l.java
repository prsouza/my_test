package i3;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6084a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f6085b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final c f6086c = new c();

    public class a extends l {
        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(g3.a aVar) {
            return false;
        }

        public final boolean d(boolean z, g3.a aVar, g3.c cVar) {
            return false;
        }
    }

    public class b extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(g3.a aVar) {
            return (aVar == g3.a.DATA_DISK_CACHE || aVar == g3.a.MEMORY_CACHE) ? false : true;
        }

        public final boolean d(boolean z, g3.a aVar, g3.c cVar) {
            return false;
        }
    }

    public class c extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(g3.a aVar) {
            return aVar == g3.a.REMOTE;
        }

        public final boolean d(boolean z, g3.a aVar, g3.c cVar) {
            return ((z && aVar == g3.a.DATA_DISK_CACHE) || aVar == g3.a.LOCAL) && cVar == g3.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(g3.a aVar);

    public abstract boolean d(boolean z, g3.a aVar, g3.c cVar);
}
