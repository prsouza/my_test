package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.r;
import androidx.lifecycle.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry {

    /* renamed from: a  reason: collision with root package name */
    public Random f787a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, String> f788b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f789c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, d> f790d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f791e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map<String, c<?>> f792f = new HashMap();
    public final Map<String, Object> g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f793h = new Bundle();

    public class a extends c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f798a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f799b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f.a f800c;

        public a(String str, int i, f.a aVar) {
            this.f798a = str;
            this.f799b = i;
            this.f800c = aVar;
        }
    }

    public class b extends c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f802a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f803b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f.a f804c;

        public b(String str, int i, f.a aVar) {
            this.f802a = str;
            this.f803b = i;
            this.f804c = aVar;
        }

        /* JADX WARNING: type inference failed for: r4v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        public final void a(I i, c0.c cVar) {
            ActivityResultRegistry.this.f791e.add(this.f802a);
            Integer num = (Integer) ActivityResultRegistry.this.f789c.get(this.f802a);
            ActivityResultRegistry.this.c(num != null ? num.intValue() : this.f803b, this.f804c, i);
        }

        public final void b() {
            ActivityResultRegistry.this.g(this.f802a);
        }
    }

    public static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        public final b<O> f806a;

        /* renamed from: b  reason: collision with root package name */
        public final f.a<?, O> f807b;

        public c(b<O> bVar, f.a<?, O> aVar) {
            this.f806a = bVar;
            this.f807b = aVar;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final r f808a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<y> f809b = new ArrayList<>();

        public d(r rVar) {
            this.f808a = rVar;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public final void a(int i, String str) {
        this.f788b.put(Integer.valueOf(i), str);
        this.f789c.put(str, Integer.valueOf(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$c<?>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final boolean b(int i, int i10, Intent intent) {
        b<O> bVar;
        String str = (String) this.f788b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f791e.remove(str);
        c cVar = (c) this.f792f.get(str);
        if (cVar == null || (bVar = cVar.f806a) == null) {
            this.g.remove(str);
            this.f793h.putParcelable(str, new a(i10, intent));
            return true;
        }
        bVar.a(cVar.f807b.c(i10, intent));
        return true;
    }

    public abstract <I, O> void c(int i, f.a aVar, Object obj);

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$d>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r7v4, types: [java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$d>, java.util.HashMap] */
    public final <I, O> c<I> d(final String str, a0 a0Var, final f.a<I, O> aVar, final b<O> bVar) {
        r lifecycle = a0Var.getLifecycle();
        if (!lifecycle.b().isAtLeast(r.c.STARTED)) {
            int f10 = f(str);
            d dVar = (d) this.f790d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            AnonymousClass1 r02 = new y() {
                /* JADX WARNING: type inference failed for: r4v9, types: [java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$c<?>>, java.util.HashMap] */
                /* JADX WARNING: type inference failed for: r4v11, types: [java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$c<?>>, java.util.HashMap] */
                /* JADX WARNING: type inference failed for: r4v13, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
                /* JADX WARNING: type inference failed for: r4v22, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
                /* JADX WARNING: type inference failed for: r5v11, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
                public final void c(a0 a0Var, r.b bVar) {
                    if (r.b.ON_START.equals(bVar)) {
                        ActivityResultRegistry.this.f792f.put(str, new c(bVar, aVar));
                        if (ActivityResultRegistry.this.g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.g.get(str);
                            ActivityResultRegistry.this.g.remove(str);
                            bVar.a(obj);
                        }
                        a aVar = (a) ActivityResultRegistry.this.f793h.getParcelable(str);
                        if (aVar != null) {
                            ActivityResultRegistry.this.f793h.remove(str);
                            bVar.a(aVar.c(aVar.f810a, aVar.f811b));
                        }
                    } else if (r.b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f792f.remove(str);
                    } else if (r.b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.g(str);
                    }
                }
            };
            dVar.f808a.a(r02);
            dVar.f809b.add(r02);
            this.f790d.put(str, dVar);
            return new a(str, f10, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + a0Var + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$c<?>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final <I, O> c<I> e(String str, f.a<I, O> aVar, b<O> bVar) {
        int f10 = f(str);
        this.f792f.put(str, new c(bVar, aVar));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            bVar.a(obj);
        }
        a aVar2 = (a) this.f793h.getParcelable(str);
        if (aVar2 != null) {
            this.f793h.remove(str);
            bVar.a(aVar.c(aVar2.f810a, aVar2.f811b));
        }
        return new b(str, f10, aVar);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    public final int f(String str) {
        Integer num = (Integer) this.f789c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int nextInt = this.f787a.nextInt(2147418112);
        while (true) {
            int i = nextInt + LZ4Constants.MAX_DISTANCE;
            if (this.f788b.containsKey(Integer.valueOf(i))) {
                nextInt = this.f787a.nextInt(2147418112);
            } else {
                a(i, str);
                return i;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$c<?>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$d>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$d>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v17, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    public final void g(String str) {
        Integer num;
        if (!this.f791e.contains(str) && (num = (Integer) this.f789c.remove(str)) != null) {
            this.f788b.remove(num);
        }
        this.f792f.remove(str);
        if (this.g.containsKey(str)) {
            StringBuilder d10 = d.d("Dropping pending result for request ", str, ": ");
            d10.append(this.g.get(str));
            Log.w("ActivityResultRegistry", d10.toString());
            this.g.remove(str);
        }
        if (this.f793h.containsKey(str)) {
            StringBuilder d11 = d.d("Dropping pending result for request ", str, ": ");
            d11.append(this.f793h.getParcelable(str));
            Log.w("ActivityResultRegistry", d11.toString());
            this.f793h.remove(str);
        }
        d dVar = (d) this.f790d.get(str);
        if (dVar != null) {
            Iterator<y> it = dVar.f809b.iterator();
            while (it.hasNext()) {
                dVar.f808a.c(it.next());
            }
            dVar.f809b.clear();
            this.f790d.remove(str);
        }
    }
}
