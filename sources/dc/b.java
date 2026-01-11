package dc;

public enum b {
    ED25519("ed25519", 0),
    SR25519("sr25519", 1),
    ECDSA("ecdsa", 2);
    
    public static final a Companion = null;
    private final String rawName;
    private final int signatureVersion;

    public static final class a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a();
    }

    private b(String str, int i) {
        this.rawName = str;
        this.signatureVersion = i;
    }

    public final String getRawName() {
        return this.rawName;
    }

    public final int getSignatureVersion() {
        return this.signatureVersion;
    }
}
