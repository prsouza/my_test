package yf;

import java.io.IOException;
import java.io.Writer;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f13633a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public abstract int a(CharSequence charSequence, int i, Writer writer) throws IOException;

    public final void b(CharSequence charSequence, Writer writer) throws IOException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int a10 = a(charSequence, i, writer);
            if (a10 == 0) {
                char charAt = charSequence.charAt(i);
                writer.write(charAt);
                i++;
                if (Character.isHighSurrogate(charAt) && i < length) {
                    char charAt2 = charSequence.charAt(i);
                    if (Character.isLowSurrogate(charAt2)) {
                        writer.write(charAt2);
                        i++;
                    }
                }
            } else {
                for (int i10 = 0; i10 < a10; i10++) {
                    i += Character.charCount(Character.codePointAt(charSequence, i));
                }
            }
        }
    }
}
