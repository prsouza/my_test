package u1;

public interface s {

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f11653a = new b.c((a) null);

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0227b f11654b = new b.C0227b();

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public final Throwable f11655a;

            public a(Throwable th2) {
                this.f11655a = th2;
            }

            public final String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f11655a.getMessage()});
            }
        }

        /* renamed from: u1.s$b$b  reason: collision with other inner class name */
        public static final class C0227b extends b {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            public c() {
            }

            public final String toString() {
                return "SUCCESS";
            }

            public c(a aVar) {
            }
        }
    }
}
