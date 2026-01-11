package f9;

import android.content.Context;
import android.content.SharedPreferences;
import de.h;
import e6.e;
import java.util.Objects;
import yd.j;
import yd.v;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ h[] f5033d;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f5034a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5035b = new a(this, "PREF_LAST_UPDATE");

    /* renamed from: c  reason: collision with root package name */
    public final a f5036c = new a(this, "PREF_UNIQUE_ID");

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f5037a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f5038b;

        /* JADX WARNING: type inference failed for: r1v0, types: [f9.d, java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r1, java.lang.String r2) {
            /*
                r0 = this;
                r0.f5038b = r1
                r0.<init>()
                r0.f5037a = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f9.d.a.<init>(f9.d, java.lang.String):void");
        }

        public final void a(h hVar, String str) {
            e.D(hVar, "property");
            this.f5038b.f5034a.edit().putString(this.f5037a, str).apply();
        }
    }

    static {
        Class<d> cls = d.class;
        j jVar = new j(cls, "_lastUpdate", "get_lastUpdate()Ljava/lang/String;");
        Objects.requireNonNull(v.f13623a);
        f5033d = new h[]{jVar, new j(cls, "_uniqueId", "get_uniqueId()Ljava/lang/String;")};
    }

    public d(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("PREF_UNIQUE_ID", 0);
        e.C(sharedPreferences, "context.getSharedPrefere…D\", Context.MODE_PRIVATE)");
        this.f5034a = sharedPreferences;
    }
}
