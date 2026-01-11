package yf;

import a.a;
import java.io.Writer;
import java.util.Locale;

public final class e extends c {

    /* renamed from: c  reason: collision with root package name */
    public final int f13643c = 32;

    /* renamed from: d  reason: collision with root package name */
    public final int f13644d;

    public e(int i) {
        super(0);
        this.f13644d = i;
    }

    public final boolean c(int i, Writer writer) {
        if (i >= this.f13643c && i <= this.f13644d) {
            return false;
        }
        if (i > 65535) {
            char[] chars = Character.toChars(i);
            StringBuilder d10 = a.d("\\u");
            String hexString = Integer.toHexString(chars[0]);
            Locale locale = Locale.ENGLISH;
            d10.append(hexString.toUpperCase(locale));
            d10.append("\\u");
            d10.append(Integer.toHexString(chars[1]).toUpperCase(locale));
            writer.write(d10.toString());
        } else {
            writer.write("\\u");
            char[] cArr = b.f13633a;
            writer.write(cArr[(i >> 12) & 15]);
            writer.write(cArr[(i >> 8) & 15]);
            writer.write(cArr[(i >> 4) & 15]);
            writer.write(cArr[i & 15]);
        }
        return true;
    }
}
