package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class r0 {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f2166e = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f2167a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a.b> f2168b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Object> f2169c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2170d;

    public class a implements a.b {
        public a() {
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r4v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r4v2, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r3v7, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
        public final Bundle a() {
            for (Map.Entry entry : new HashMap(r0.this.f2168b).entrySet()) {
                Bundle a10 = ((a.b) entry.getValue()).a();
                r0 r0Var = r0.this;
                String str = (String) entry.getKey();
                Objects.requireNonNull(r0Var);
                if (a10 != null) {
                    Class[] clsArr = r0.f2166e;
                    int i = 0;
                    while (i < 29) {
                        if (!clsArr[i].isInstance(a10)) {
                            i++;
                        }
                    }
                    StringBuilder d10 = a.a.d("Can't put value with type ");
                    d10.append(a10.getClass());
                    d10.append(" into saved state");
                    throw new IllegalArgumentException(d10.toString());
                }
                j0 j0Var = (j0) r0Var.f2169c.get(str);
                if (j0Var != null) {
                    j0Var.j(a10);
                } else {
                    r0Var.f2167a.put(str, a10);
                }
            }
            Set<String> keySet = r0.this.f2167a.keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (String str2 : keySet) {
                arrayList.add(str2);
                arrayList2.add(r0.this.f2167a.get(str2));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    public r0(Map<String, Object> map) {
        this.f2168b = new HashMap();
        this.f2169c = new HashMap();
        this.f2170d = new a();
        this.f2167a = new HashMap(map);
    }

    public r0() {
        this.f2168b = new HashMap();
        this.f2169c = new HashMap();
        this.f2170d = new a();
        this.f2167a = new HashMap();
    }
}
