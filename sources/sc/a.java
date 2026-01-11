package sc;

public final class a extends Exception {
    public a(String str) {
        super(str);
    }

    public a(Exception exc) {
        super(exc.getMessage());
    }
}
