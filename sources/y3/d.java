package y3;

public interface d {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        private a(boolean z) {
            this.isComplete = z;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a();

    boolean c(c cVar);

    boolean d(c cVar);

    boolean e(c cVar);

    d g();

    void k(c cVar);

    void l(c cVar);
}
