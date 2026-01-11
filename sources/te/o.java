package te;

import a8.a;
import e6.e;
import fe.k;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f11603a;

    static {
        String[] strArr = new String[128];
        for (int i = 0; i <= 31; i++) {
            char c10 = c(i >> 12);
            char c11 = c(i >> 8);
            char c12 = c(i >> 4);
            char c13 = c(i);
            strArr[i] = "\\u" + c10 + c11 + c12 + c13;
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f11603a = strArr;
    }

    public static final boolean a(String str) {
        e.D(str, "$this$toBooleanStrict");
        Boolean b10 = b(str);
        if (b10 != null) {
            return b10.booleanValue();
        }
        throw new IllegalStateException(a.c(str, " does not represent a Boolean"));
    }

    public static final Boolean b(String str) {
        e.D(str, "$this$toBooleanStrictOrNull");
        if (k.Y0(str, "true")) {
            return Boolean.TRUE;
        }
        if (k.Y0(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final char c(int i) {
        int i10 = i & 15;
        return (char) (i10 < 10 ? i10 + 48 : (i10 - 10) + 97);
    }
}
