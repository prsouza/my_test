package i2;

public class t extends RuntimeException {
    public t(String str) {
        super(str);
    }

    public t(String str, Throwable th2) {
        super(str, th2);
    }

    public t(Throwable th2) {
        super(th2);
    }
}
