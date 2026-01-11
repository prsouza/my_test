package j3;

import android.graphics.Bitmap;
import android.os.Build;
import c4.j;
import com.github.mikephil.charting.BuildConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import u2.n;

public final class l implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f7038d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f7039e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f7040f = {Bitmap.Config.RGB_565};
    public static final Bitmap.Config[] g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f7041h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    public final c f7042a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final f<b, Bitmap> f7043b = new f<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f7044c = new HashMap();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7045a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7045a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7045a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7045a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7045a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j3.l.a.<clinit>():void");
        }
    }

    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public final c f7046a;

        /* renamed from: b  reason: collision with root package name */
        public int f7047b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f7048c;

        public b(c cVar) {
            this.f7046a = cVar;
        }

        public final void a() {
            this.f7046a.f(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f7047b != bVar.f7047b || !j.b(this.f7048c, bVar.f7048c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.f7047b * 31;
            Bitmap.Config config = this.f7048c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return l.c(this.f7047b, this.f7048c);
        }
    }

    public static class c extends n {
        public c() {
            super(1);
        }

        public final k d() {
            return new b(this);
        }

        public final b g(int i, Bitmap.Config config) {
            b bVar = (b) e();
            bVar.f7047b = i;
            bVar.f7048c = config;
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f7038d = configArr;
        f7039e = configArr;
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num2 = d10.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            d10.remove(num);
        } else {
            d10.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final Bitmap b(int i, int i10, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int c10 = j.c(i, i10, config);
        b g8 = this.f7042a.g(c10, config);
        int i11 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i12 = a.f7045a[config.ordinal()];
            if (i12 == 1) {
                configArr = f7038d;
            } else if (i12 == 2) {
                configArr = f7040f;
            } else if (i12 != 3) {
                configArr = i12 != 4 ? new Bitmap.Config[]{config} : f7041h;
            } else {
                configArr = g;
            }
        } else {
            configArr = f7039e;
        }
        int length = configArr.length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i11];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(c10));
            if (ceilingKey == null || ceilingKey.intValue() > c10 * 8) {
                i11++;
            } else if (ceilingKey.intValue() != c10 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f7042a.f(g8);
                g8 = this.f7042a.g(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a10 = this.f7043b.a(g8);
        if (a10 != null) {
            a(Integer.valueOf(g8.f7047b), a10);
            a10.reconfigure(i, i10, config);
        }
        return a10;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f7044c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f7044c.put(config, treeMap);
        return treeMap;
    }

    public final String e(Bitmap bitmap) {
        return c(j.d(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        b g8 = this.f7042a.g(j.d(bitmap), bitmap.getConfig());
        this.f7043b.b(g8, bitmap);
        NavigableMap<Integer, Integer> d10 = d(bitmap.getConfig());
        Integer num = d10.get(Integer.valueOf(g8.f7047b));
        Integer valueOf = Integer.valueOf(g8.f7047b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        d10.put(valueOf, Integer.valueOf(i));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.HashMap, java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    public final String toString() {
        StringBuilder d10 = a.a.d("SizeConfigStrategy{groupedMap=");
        d10.append(this.f7043b);
        d10.append(", sortedSizes=(");
        for (Map.Entry entry : this.f7044c.entrySet()) {
            d10.append(entry.getKey());
            d10.append('[');
            d10.append(entry.getValue());
            d10.append("], ");
        }
        if (!this.f7044c.isEmpty()) {
            d10.replace(d10.length() - 2, d10.length(), BuildConfig.FLAVOR);
        }
        d10.append(")}");
        return d10.toString();
    }
}
