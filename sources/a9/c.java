package a9;

import a3.g;
import a5.n;
import ah.v;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.graphics.PathMeasure;
import dd.d;
import e6.e;
import ed.f;
import io.sentry.Sentry;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m2.a;
import q2.r;
import vb.b;

public final class c implements b, a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f174c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f175a;

    /* renamed from: b  reason: collision with root package name */
    public Object f176b;

    public c(Context context) {
        this.f175a = 5;
        e.D(context, "context");
        this.f176b = context;
    }

    public static c l() {
        return new c(6);
    }

    public final Object a(String str, Object obj) {
        SharedPreferences sharedPreferences = ((Context) this.f176b).getSharedPreferences("nodle-prefs", 0);
        if (obj instanceof Boolean) {
            e.C(sharedPreferences, "this");
            return Boolean.valueOf(sharedPreferences.getBoolean(b(sharedPreferences, str), ((Boolean) obj).booleanValue()));
        }
        boolean z = true;
        if (!(obj instanceof Integer ? true : obj instanceof Long ? true : obj instanceof Double)) {
            z = obj instanceof Float;
        }
        e.C(sharedPreferences, "this");
        String b10 = b(sharedPreferences, str);
        if (!z) {
            return sharedPreferences.getString(b10, String.valueOf(obj));
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
        return Float.valueOf(sharedPreferences.getFloat(b10, ((Float) obj).floatValue()));
    }

    public final String b(SharedPreferences sharedPreferences, String str) {
        String str2 = "static.";
        if (!sharedPreferences.contains(e.a0(str2, str))) {
            str2 = "remote.";
            if (!sharedPreferences.contains(e.a0(str2, str))) {
                str2 = "default.";
                if (!sharedPreferences.contains(e.a0(str2, str))) {
                    return str;
                }
            }
        }
        return e.a0(str2, str);
    }

    public final String c(BigInteger bigInteger) {
        e.D(bigInteger, "rawNodle");
        return ((v) this.f176b).c(bigInteger);
    }

    public final void d(r rVar) {
        ((List) this.f176b).add(rVar);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [r2.c, r2.a<?, java.lang.Float>] */
    /* JADX WARNING: type inference failed for: r3v0, types: [r2.c, r2.a<?, java.lang.Float>] */
    /* JADX WARNING: type inference failed for: r1v4, types: [r2.c, r2.a<?, java.lang.Float>] */
    public final void e(Path path) {
        int size = ((List) this.f176b).size();
        while (true) {
            size--;
            if (size >= 0) {
                r rVar = (r) ((List) this.f176b).get(size);
                ThreadLocal<PathMeasure> threadLocal = g.f50a;
                if (rVar != null && !rVar.f10292a) {
                    g.a(path, rVar.f10295d.k() / 100.0f, rVar.f10296e.k() / 100.0f, rVar.f10297f.k() / 360.0f);
                }
            } else {
                return;
            }
        }
    }

    public final String f() {
        SharedPreferences sharedPreferences = ((Context) this.f176b).getSharedPreferences("nodle-prefs", 0);
        e.C(sharedPreferences, "context.getSharedPrefere…EF_NAME, NODLE_PREF_MODE)");
        Map<String, ?> all = sharedPreferences.getAll();
        e.C(all, "prefs.all");
        String str = "\n";
        for (Map.Entry next : all.entrySet()) {
            str = str + ((String) next.getKey()) + "  -> " + next.getValue() + 10;
        }
        return str;
    }

    public final void g(String str) {
        Sentry.configureScope(new n(str, this));
    }

    public final void h(String str, Object obj) {
        e.D(str, "key");
        SharedPreferences.Editor edit = ((Context) this.f176b).getSharedPreferences("nodle-prefs", 0).edit();
        if (obj instanceof Boolean) {
            edit.putBoolean(e.a0("static.", str), ((Boolean) obj).booleanValue());
        } else {
            boolean z = true;
            if (!(obj instanceof Integer ? true : obj instanceof Long ? true : obj instanceof Double)) {
                z = obj instanceof Float;
            }
            String a02 = e.a0("static.", str);
            if (z) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
                edit.putFloat(a02, ((Float) obj).floatValue());
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                edit.putString(a02, (String) obj);
            }
        }
        edit.apply();
    }

    public final byte[] i() {
        return ((ByteArrayOutputStream) this.f176b).toByteArray();
    }

    public final c j(xh.c cVar) {
        try {
            ((ByteArrayOutputStream) this.f176b).write(cVar.getEncoded());
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public final c k(byte[] bArr) {
        try {
            ((ByteArrayOutputStream) this.f176b).write(bArr);
            return this;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public final c m(int i) {
        ((ByteArrayOutputStream) this.f176b).write((byte) (i >>> 24));
        ((ByteArrayOutputStream) this.f176b).write((byte) (i >>> 16));
        ((ByteArrayOutputStream) this.f176b).write((byte) (i >>> 8));
        ((ByteArrayOutputStream) this.f176b).write((byte) i);
        return this;
    }

    public final String toString() {
        switch (this.f175a) {
            case 2:
                HashMap hashMap = (HashMap) this.f176b;
                if (hashMap == null) {
                    return "[null]";
                }
                return hashMap.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<dd.b<?>>, java.util.ArrayList] */
    public c(f fVar, d dVar, Object obj) {
        this.f175a = 4;
        e.D(dVar, "schema");
        dd.b bVar = new dd.b(fVar, obj);
        dVar.f4454a.add(bVar);
        this.f176b = bVar;
    }

    public c(int i) {
        this.f175a = i;
        if (i == 1) {
            this.f176b = new ArrayList();
        } else if (i == 2) {
        } else {
            if (i == 3) {
                this.f176b = v.G;
            } else if (i != 6) {
                this.f176b = new HashSet();
            } else {
                this.f176b = new ByteArrayOutputStream();
            }
        }
    }
}
