package s7;

public final class q extends RuntimeException {
    public q(String str) {
        super(str);
    }

    public q(String str, Throwable th2) {
        super(str, th2);
    }
}
