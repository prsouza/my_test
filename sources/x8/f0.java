package x8;

import java.util.Locale;
import java.util.Objects;

public final class f0 extends Exception {
    public f0(String str) {
        super(str);
        if (str != null) {
            Objects.requireNonNull(str.toLowerCase(Locale.US));
        }
    }
}
