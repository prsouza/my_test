package d4;

public abstract class d {

    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f4337a;

        public final void a() {
            if (this.f4337a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
