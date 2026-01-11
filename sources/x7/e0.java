package x7;

public enum e0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f12910id;

    private e0(int i) {
        this.f12910id = i;
    }

    public static e0 determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f12910id;
    }

    public String toString() {
        return Integer.toString(this.f12910id);
    }
}
