package k7;

import com.google.android.gms.common.internal.Preconditions;

public class e extends Exception {
    @Deprecated
    public e() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str, Throwable th2) {
        super(str, th2);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
