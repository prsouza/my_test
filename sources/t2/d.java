package t2;

import androidx.fragment.app.m;
import java.util.List;
import v2.n;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<n> f11267a;

    /* renamed from: b  reason: collision with root package name */
    public final char f11268b;

    /* renamed from: c  reason: collision with root package name */
    public final double f11269c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11270d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11271e;

    public d(List list, char c10, double d10, String str, String str2) {
        this.f11267a = list;
        this.f11268b = c10;
        this.f11269c = d10;
        this.f11270d = str;
        this.f11271e = str2;
    }

    public static int a(char c10, String str, String str2) {
        return str2.hashCode() + m.a(str, (c10 + 0) * 31, 31);
    }

    public final int hashCode() {
        return a(this.f11268b, this.f11271e, this.f11270d);
    }
}
