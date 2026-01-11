package qa;

public enum b {
    COMMUNITY("community"),
    SOCIAL("social");
    
    private final String value;

    private b(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
