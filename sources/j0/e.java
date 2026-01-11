package j0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f6980b = 0;

    /* renamed from: a  reason: collision with root package name */
    public g f6981a;

    static {
        a(new Locale[0]);
    }

    public e(g gVar) {
        this.f6981a = gVar;
    }

    public static e a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new e(new h(new LocaleList(localeArr)));
        }
        return new e(new f(localeArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && this.f6981a.equals(((e) obj).f6981a);
    }

    public final int hashCode() {
        return this.f6981a.hashCode();
    }

    public final String toString() {
        return this.f6981a.toString();
    }
}
