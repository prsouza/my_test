package fe;

import e6.e;
import java.io.Serializable;
import java.util.regex.Pattern;

public final class c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f5100a;

    public c(String str) {
        e.D(str, "pattern");
        Pattern compile = Pattern.compile(str);
        e.C(compile, "compile(pattern)");
        this.f5100a = compile;
    }

    public final boolean a(CharSequence charSequence) {
        e.D(charSequence, "input");
        return this.f5100a.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        e.D(charSequence, "input");
        e.D(str, "replacement");
        String replaceAll = this.f5100a.matcher(charSequence).replaceAll(str);
        e.C(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f5100a.toString();
        e.C(pattern, "nativePattern.toString()");
        return pattern;
    }
}
