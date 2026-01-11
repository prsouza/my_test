package yf;

import a.a;
import java.io.IOException;
import java.io.Writer;

public final class j extends b {
    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
        int i10;
        int i11;
        if (charSequence.charAt(i) != '\\' || (i10 = i + 1) >= charSequence.length() || charSequence.charAt(i10) != 'u') {
            return 0;
        }
        int i12 = 2;
        while (true) {
            i11 = i + i12;
            if (i11 < charSequence.length() && charSequence.charAt(i11) == 'u') {
                i12++;
            }
        }
        if (i11 < charSequence.length() && charSequence.charAt(i11) == '+') {
            i12++;
        }
        int i13 = i + i12;
        int i14 = i13 + 4;
        if (i14 <= charSequence.length()) {
            CharSequence subSequence = charSequence.subSequence(i13, i14);
            try {
                writer.write((char) Integer.parseInt(subSequence.toString(), 16));
                return i12 + 4;
            } catch (NumberFormatException e10) {
                throw new IllegalArgumentException("Unable to parse unicode value: " + subSequence, e10);
            }
        } else {
            StringBuilder d10 = a.d("Less than 4 hex digits in unicode value: '");
            d10.append(charSequence.subSequence(i, charSequence.length()));
            d10.append("' due to end of CharSequence");
            throw new IllegalArgumentException(d10.toString());
        }
    }
}
