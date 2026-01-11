package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.google.android.gms.common.api.Api;
import f0.d;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import k0.l;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, d.b> f5226a = new ConcurrentHashMap<>();

    public class a implements b<l> {
        public final int a(Object obj) {
            return ((l) obj).f7379c;
        }

        public final boolean b(Object obj) {
            return ((l) obj).f7380d;
        }
    }

    public interface b<T> {
        int a(T t10);

        boolean b(T t10);
    }

    public static <T> T e(T[] tArr, int i, b<T> bVar) {
        int i10 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t10 = null;
        int i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (T t11 : tArr) {
            int abs = (Math.abs(bVar.a(t11) - i10) * 2) + (bVar.b(t11) == z ? 0 : 1);
            if (t10 == null || i11 > abs) {
                t10 = t11;
                i11 = abs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, d.b bVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, l[] lVarArr, int i) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d10 = l.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (!l.c(d10, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d10.getPath());
            d10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i10) {
        File d10 = l.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (!l.b(d10, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d10.getPath());
            d10.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public l f(l[] lVarArr, int i) {
        return (l) e(lVarArr, i, new a());
    }
}
