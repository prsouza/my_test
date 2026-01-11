package i7;

import java.io.IOException;

public class a0 extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f6234a = 0;

    public static class a extends a0 {
        public a() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public a0(String str) {
        super(str);
    }

    public static a0 a() {
        return new a0("Protocol message end-group tag did not match expected tag.");
    }

    public static a0 b() {
        return new a0("Protocol message contained an invalid tag (zero).");
    }

    public static a0 c() {
        return new a0("Protocol message had invalid UTF-8.");
    }

    public static a d() {
        return new a();
    }

    public static a0 e() {
        return new a0("CodedInputStream encountered a malformed varint.");
    }

    public static a0 f() {
        return new a0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static a0 g() {
        return new a0("Failed to parse the message.");
    }

    public static a0 h() {
        return new a0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
