package androidx.fragment.app;

import androidx.lifecycle.r;
import java.util.ArrayList;

public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f1918a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f1919b;

    /* renamed from: c  reason: collision with root package name */
    public int f1920c;

    /* renamed from: d  reason: collision with root package name */
    public int f1921d;

    /* renamed from: e  reason: collision with root package name */
    public int f1922e;

    /* renamed from: f  reason: collision with root package name */
    public int f1923f;
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1924h = true;
    public String i;

    /* renamed from: j  reason: collision with root package name */
    public int f1925j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1926k;

    /* renamed from: l  reason: collision with root package name */
    public int f1927l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f1928m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f1929n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<String> f1930o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1931p = false;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1932a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f1933b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1934c;

        /* renamed from: d  reason: collision with root package name */
        public int f1935d;

        /* renamed from: e  reason: collision with root package name */
        public int f1936e;

        /* renamed from: f  reason: collision with root package name */
        public int f1937f;
        public int g;

        /* renamed from: h  reason: collision with root package name */
        public r.c f1938h;
        public r.c i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f1932a = i10;
            this.f1933b = fragment;
            this.f1934c = false;
            r.c cVar = r.c.RESUMED;
            this.f1938h = cVar;
            this.i = cVar;
        }

        public a(int i10, Fragment fragment, boolean z) {
            this.f1932a = i10;
            this.f1933b = fragment;
            this.f1934c = true;
            r.c cVar = r.c.RESUMED;
            this.f1938h = cVar;
            this.i = cVar;
        }
    }

    public final void b(a aVar) {
        this.f1918a.add(aVar);
        aVar.f1935d = this.f1919b;
        aVar.f1936e = this.f1920c;
        aVar.f1937f = this.f1921d;
        aVar.g = this.f1922e;
    }

    public final i0 c(String str) {
        if (this.f1924h) {
            this.g = true;
            this.i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract int d();

    public abstract void e(int i10, Fragment fragment, String str, int i11);

    public final i0 f(int i10, Fragment fragment) {
        if (i10 != 0) {
            e(i10, fragment, (String) null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }
}
