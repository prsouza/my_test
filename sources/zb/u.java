package zb;

import java.io.IOException;

public final class u extends IOException {
    public u(String str) {
        super(str);
    }

    public static u a() {
        return new u("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static u b() {
        return new u("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
