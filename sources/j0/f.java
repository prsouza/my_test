package j0;

import a8.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public final class f implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final Locale[] f6982b = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f6983a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i = e.f6980b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f6983a = f6982b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    locale2.getLanguage();
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        locale2.getCountry();
                    }
                    hashSet.add(locale2);
                }
                i++;
            } else {
                throw new NullPointerException(a.b("list[", i, "] is null"));
            }
        }
        this.f6983a = (Locale[]) arrayList.toArray(new Locale[arrayList.size()]);
    }

    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).f6983a;
        if (this.f6983a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f6983a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public final Locale get() {
        Locale[] localeArr = this.f6983a;
        if (localeArr.length > 0) {
            return localeArr[0];
        }
        return null;
    }

    public final int hashCode() {
        int i = 1;
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f6983a;
            if (i10 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i10].hashCode();
            i10++;
        }
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f6983a;
            if (i < localeArr.length) {
                d10.append(localeArr[i]);
                if (i < this.f6983a.length - 1) {
                    d10.append(',');
                }
                i++;
            } else {
                d10.append("]");
                return d10.toString();
            }
        }
    }
}
