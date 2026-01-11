package yf;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.EnumSet;

public final class h extends b {

    /* renamed from: b  reason: collision with root package name */
    public final EnumSet<a> f13651b;

    public enum a {
        semiColonRequired,
        semiColonOptional,
        errorIfNoSemiColon
    }

    public h(a... aVarArr) {
        if (aVarArr.length > 0) {
            this.f13651b = EnumSet.copyOf(Arrays.asList(aVarArr));
            return;
        }
        this.f13651b = EnumSet.copyOf(Arrays.asList(new a[]{a.semiColonRequired}));
    }

    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
        int i10;
        int i11;
        int length = charSequence.length();
        if (charSequence.charAt(i) == '&' && i < length - 2 && charSequence.charAt(i + 1) == '#') {
            int i12 = i + 2;
            char charAt = charSequence.charAt(i12);
            if (charAt == 'x' || charAt == 'X') {
                i12++;
                if (i12 == length) {
                    return 0;
                }
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i13 = i12;
            while (i13 < length && ((charSequence.charAt(i13) >= '0' && charSequence.charAt(i13) <= '9') || ((charSequence.charAt(i13) >= 'a' && charSequence.charAt(i13) <= 'f') || (charSequence.charAt(i13) >= 'A' && charSequence.charAt(i13) <= 'F')))) {
                i13++;
            }
            int i14 = (i13 == length || charSequence.charAt(i13) != ';') ? 0 : 1;
            if (i14 == 0) {
                a aVar = a.semiColonRequired;
                EnumSet<a> enumSet = this.f13651b;
                if (enumSet != null && enumSet.contains(aVar)) {
                    return 0;
                }
                a aVar2 = a.errorIfNoSemiColon;
                EnumSet<a> enumSet2 = this.f13651b;
                if (enumSet2 != null && enumSet2.contains(aVar2)) {
                    throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }
            if (i10 != 0) {
                try {
                    i11 = Integer.parseInt(charSequence.subSequence(i12, i13).toString(), 16);
                } catch (NumberFormatException unused) {
                }
            } else {
                i11 = Integer.parseInt(charSequence.subSequence(i12, i13).toString(), 10);
            }
            if (i11 > 65535) {
                char[] chars = Character.toChars(i11);
                writer.write(chars[0]);
                writer.write(chars[1]);
            } else {
                writer.write(i11);
            }
            return ((i13 + 2) - i12) + i10 + i14;
        }
        return 0;
    }
}
