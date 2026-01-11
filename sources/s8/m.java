package s8;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import u8.d;
import y.c;

public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final long f11018b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f11019c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static m f11020d;

    /* renamed from: a  reason: collision with root package name */
    public final c f11021a;

    public m(c cVar) {
        this.f11021a = cVar;
    }

    public static m c() {
        if (c.f13316a == null) {
            c.f13316a = new c();
        }
        c cVar = c.f13316a;
        if (f11020d == null) {
            f11020d = new m(cVar);
        }
        return f11020d;
    }

    public final long a() {
        Objects.requireNonNull(this.f11021a);
        return System.currentTimeMillis();
    }

    public final long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public final boolean d(d dVar) {
        if (TextUtils.isEmpty(dVar.a())) {
            return true;
        }
        if (dVar.b() + dVar.g() < b() + f11018b) {
            return true;
        }
        return false;
    }
}
