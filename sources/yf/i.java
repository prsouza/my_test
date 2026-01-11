package yf;

import java.io.IOException;
import java.io.Writer;

public final class i extends b {
    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        if (charSequence.charAt(i) == '\\' && length > 0) {
            int i10 = i + 1;
            if (c(charSequence.charAt(i10))) {
                int i11 = i + 2;
                int i12 = i + 3;
                sb2.append(charSequence.charAt(i10));
                if (length > 1 && c(charSequence.charAt(i11))) {
                    sb2.append(charSequence.charAt(i11));
                    if (length > 2) {
                        char charAt = charSequence.charAt(i10);
                        if (charAt >= '0' && charAt <= '3') {
                            z = true;
                        }
                        if (z && c(charSequence.charAt(i12))) {
                            sb2.append(charSequence.charAt(i12));
                        }
                    }
                }
                writer.write(Integer.parseInt(sb2.toString(), 8));
                return sb2.length() + 1;
            }
        }
        return 0;
    }

    public final boolean c(char c10) {
        return c10 >= '0' && c10 <= '7';
    }
}
