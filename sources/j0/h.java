package j0;

import android.os.LocaleList;
import java.util.Locale;

public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f6984a;

    public h(LocaleList localeList) {
        this.f6984a = localeList;
    }

    public final Object a() {
        return this.f6984a;
    }

    public final boolean equals(Object obj) {
        return this.f6984a.equals(((g) obj).a());
    }

    public final Locale get() {
        return this.f6984a.get(0);
    }

    public final int hashCode() {
        return this.f6984a.hashCode();
    }

    public final String toString() {
        return this.f6984a.toString();
    }
}
