package androidx.databinding;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import io.nodle.cash.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class ViewDataBinding extends a implements s1.a {
    public static final boolean E = true;
    public static final a F = new a();
    public static final ReferenceQueue<ViewDataBinding> G = new ReferenceQueue<>();
    public static final b H = new b();
    public a0 A;
    public OnStartListener B;
    public boolean C;
    public boolean D;

    /* renamed from: b  reason: collision with root package name */
    public final c f1665b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1666c;

    /* renamed from: s  reason: collision with root package name */
    public k[] f1667s;

    /* renamed from: t  reason: collision with root package name */
    public final View f1668t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1669u;

    /* renamed from: v  reason: collision with root package name */
    public Choreographer f1670v;

    /* renamed from: w  reason: collision with root package name */
    public final i f1671w;

    /* renamed from: x  reason: collision with root package name */
    public Handler f1672x;

    /* renamed from: y  reason: collision with root package name */
    public final e f1673y;
    public ViewDataBinding z;

    public static class OnStartListener implements z {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<ViewDataBinding> f1674a;

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.f1674a = new WeakReference<>(viewDataBinding);
        }

        @l0(r.b.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f1674a.get();
            if (viewDataBinding != null) {
                viewDataBinding.e();
            }
        }
    }

    public class a implements c {
        public final k c(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new e(viewDataBinding, i, referenceQueue).f1679a;
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public final void onViewAttachedToWindow(View view) {
            (view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null).f1665b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            synchronized (this) {
                ViewDataBinding.this.f1666c = false;
            }
            while (true) {
                Reference<? extends ViewDataBinding> poll = ViewDataBinding.G.poll();
                if (poll == null) {
                    break;
                } else if (poll instanceof k) {
                    ((k) poll).b();
                }
            }
            if (!ViewDataBinding.this.f1668t.isAttachedToWindow()) {
                View view = ViewDataBinding.this.f1668t;
                b bVar = ViewDataBinding.H;
                view.removeOnAttachStateChangeListener(bVar);
                ViewDataBinding.this.f1668t.addOnAttachStateChangeListener(bVar);
                return;
            }
            ViewDataBinding.this.e();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String[][] f1676a;

        /* renamed from: b  reason: collision with root package name */
        public final int[][] f1677b;

        /* renamed from: c  reason: collision with root package name */
        public final int[][] f1678c;

        public d(int i) {
            this.f1676a = new String[i][];
            this.f1677b = new int[i][];
            this.f1678c = new int[i][];
        }

        public final void a(int i, String[] strArr, int[] iArr, int[] iArr2) {
            this.f1676a[i] = strArr;
            this.f1677b[i] = iArr;
            this.f1678c[i] = iArr2;
        }
    }

    public static class e implements k0, g<LiveData<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final k<LiveData<?>> f1679a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<a0> f1680b = null;

        public e(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f1679a = new k<>(viewDataBinding, i, this, referenceQueue);
        }

        public final void a(Object obj) {
            ((LiveData) obj).i(this);
        }

        public final void b(Object obj) {
            a0 a0Var;
            LiveData liveData = (LiveData) obj;
            WeakReference<a0> weakReference = this.f1680b;
            if (weakReference == null) {
                a0Var = null;
            } else {
                a0Var = weakReference.get();
            }
            if (a0Var != null) {
                liveData.e(a0Var, this);
            }
        }

        public final void c(a0 a0Var) {
            a0 a0Var2;
            WeakReference<a0> weakReference = this.f1680b;
            if (weakReference == null) {
                a0Var2 = null;
            } else {
                a0Var2 = weakReference.get();
            }
            LiveData liveData = (LiveData) this.f1679a.f1693c;
            if (liveData != null) {
                if (a0Var2 != null) {
                    liveData.i(this);
                }
                if (a0Var != null) {
                    liveData.e(a0Var, this);
                }
            }
            if (a0Var != null) {
                this.f1680b = new WeakReference<>(a0Var);
            }
        }

        public final void d(Object obj) {
            ViewDataBinding a10 = this.f1679a.a();
            if (a10 != null) {
                k<LiveData<?>> kVar = this.f1679a;
                a10.f(kVar.f1692b, kVar.f1693c, 0);
            }
        }
    }

    public ViewDataBinding(Object obj, View view, int i) {
        e eVar;
        if (obj == null) {
            eVar = null;
        } else if (obj instanceof e) {
            eVar = (e) obj;
        } else {
            throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        this.f1665b = new c();
        this.f1666c = false;
        this.f1673y = eVar;
        this.f1667s = new k[i];
        this.f1668t = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (E) {
            this.f1670v = Choreographer.getInstance();
            this.f1671w = new i(this);
        } else {
            this.f1671w = null;
            this.f1672x = new Handler(Looper.myLooper());
        }
    }

    public static <T extends ViewDataBinding> T h(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z10, Object obj) {
        e eVar;
        if (obj == null) {
            eVar = null;
        } else if (obj instanceof e) {
            eVar = (e) obj;
        } else {
            throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        return f.c(layoutInflater, i, viewGroup, z10, eVar);
    }

    public static boolean j(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void k(androidx.databinding.e r18, android.view.View r19, java.lang.Object[] r20, androidx.databinding.ViewDataBinding.d r21, android.util.SparseIntArray r22, boolean r23) {
        /*
            r6 = r18
            r0 = r19
            r7 = r21
            r8 = r22
            if (r0 == 0) goto L_0x0014
            r1 = 2131230909(0x7f0800bd, float:1.8077884E38)
            java.lang.Object r1 = r0.getTag(r1)
            androidx.databinding.ViewDataBinding r1 = (androidx.databinding.ViewDataBinding) r1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            if (r1 == 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.Object r1 = r19.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0023
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            java.lang.String r10 = "layout"
            r11 = -1
            r13 = 1
            if (r23 == 0) goto L_0x0063
            if (r1 == 0) goto L_0x0063
            boolean r2 = r1.startsWith(r10)
            if (r2 == 0) goto L_0x0063
            r2 = 95
            int r2 = r1.lastIndexOf(r2)
            if (r2 <= 0) goto L_0x005f
            int r2 = r2 + r13
            boolean r3 = j(r1, r2)
            if (r3 == 0) goto L_0x005f
            int r3 = r1.length()
            r4 = 0
        L_0x0046:
            if (r2 >= r3) goto L_0x0054
            int r4 = r4 * 10
            char r5 = r1.charAt(r2)
            int r5 = r5 + -48
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0054:
            r1 = r20[r4]
            if (r1 != 0) goto L_0x005a
            r20[r4] = r0
        L_0x005a:
            if (r7 != 0) goto L_0x005d
            r4 = r11
        L_0x005d:
            r1 = r13
            goto L_0x0061
        L_0x005f:
            r4 = r11
            r1 = 0
        L_0x0061:
            r14 = r4
            goto L_0x0090
        L_0x0063:
            if (r1 == 0) goto L_0x008e
            java.lang.String r2 = "binding_"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x008e
            r2 = 8
            int r3 = r1.length()
            r4 = 0
        L_0x0074:
            if (r2 >= r3) goto L_0x0082
            int r4 = r4 * 10
            char r5 = r1.charAt(r2)
            int r5 = r5 + -48
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L_0x0074
        L_0x0082:
            r1 = r20[r4]
            if (r1 != 0) goto L_0x0088
            r20[r4] = r0
        L_0x0088:
            if (r7 != 0) goto L_0x008b
            r4 = r11
        L_0x008b:
            r14 = r4
            r1 = r13
            goto L_0x0090
        L_0x008e:
            r14 = r11
            r1 = 0
        L_0x0090:
            if (r1 != 0) goto L_0x00a6
            int r1 = r19.getId()
            if (r1 <= 0) goto L_0x00a6
            if (r8 == 0) goto L_0x00a6
            int r1 = r8.get(r1, r11)
            if (r1 < 0) goto L_0x00a6
            r2 = r20[r1]
            if (r2 != 0) goto L_0x00a6
            r20[r1] = r0
        L_0x00a6:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x01de
            r15 = r0
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            int r5 = r15.getChildCount()
            r0 = 0
            r1 = 0
        L_0x00b3:
            if (r0 >= r5) goto L_0x01de
            android.view.View r2 = r15.getChildAt(r0)
            if (r14 < 0) goto L_0x01b3
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x01b3
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_0"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x01b3
            boolean r4 = r3.startsWith(r10)
            if (r4 == 0) goto L_0x01b3
            r4 = 47
            int r16 = r3.indexOf(r4)
            if (r16 <= 0) goto L_0x01b3
            int r4 = r3.indexOf(r4)
            int r4 = r4 + r13
            int r16 = r3.length()
            int r9 = r16 + -2
            java.lang.CharSequence r3 = r3.subSequence(r4, r9)
            java.lang.String[][] r4 = r7.f1676a
            r4 = r4[r14]
            int r9 = r4.length
            r13 = r1
        L_0x00f4:
            if (r13 >= r9) goto L_0x0102
            r12 = r4[r13]
            boolean r12 = android.text.TextUtils.equals(r3, r12)
            if (r12 == 0) goto L_0x00ff
            goto L_0x0103
        L_0x00ff:
            int r13 = r13 + 1
            goto L_0x00f4
        L_0x0102:
            r13 = r11
        L_0x0103:
            if (r13 < 0) goto L_0x01b3
            int r1 = r13 + 1
            int[][] r3 = r7.f1677b
            r3 = r3[r14]
            r3 = r3[r13]
            int[][] r4 = r7.f1678c
            r4 = r4[r14]
            r4 = r4[r13]
            android.view.View r9 = r15.getChildAt(r0)
            java.lang.Object r9 = r9.getTag()
            java.lang.String r9 = (java.lang.String) r9
            int r12 = r9.length()
            int r12 = r12 + r11
            r13 = 0
            java.lang.String r12 = r9.substring(r13, r12)
            int r13 = r12.length()
            int r11 = r15.getChildCount()
            int r17 = r0 + 1
            r19 = r1
            r23 = r5
            r1 = r17
            r5 = r0
        L_0x0138:
            if (r1 >= r11) goto L_0x0184
            android.view.View r17 = r15.getChildAt(r1)
            java.lang.Object r7 = r17.getTag()
            boolean r7 = r7 instanceof java.lang.String
            if (r7 == 0) goto L_0x014d
            java.lang.Object r7 = r17.getTag()
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x014e
        L_0x014d:
            r7 = 0
        L_0x014e:
            if (r7 == 0) goto L_0x0179
            boolean r17 = r7.startsWith(r12)
            if (r17 == 0) goto L_0x0179
            int r8 = r7.length()
            r17 = r10
            int r10 = r9.length()
            if (r8 != r10) goto L_0x0171
            int r8 = r7.length()
            r10 = -1
            int r8 = r8 + r10
            char r8 = r7.charAt(r8)
            r10 = 48
            if (r8 != r10) goto L_0x0171
            goto L_0x0186
        L_0x0171:
            boolean r7 = j(r7, r13)
            if (r7 == 0) goto L_0x017b
            r5 = r1
            goto L_0x017b
        L_0x0179:
            r17 = r10
        L_0x017b:
            int r1 = r1 + 1
            r7 = r21
            r8 = r22
            r10 = r17
            goto L_0x0138
        L_0x0184:
            r17 = r10
        L_0x0186:
            if (r5 != r0) goto L_0x018f
            androidx.databinding.ViewDataBinding r1 = androidx.databinding.f.a(r6, r2, r4)
            r20[r3] = r1
            goto L_0x01ae
        L_0x018f:
            int r5 = r5 - r0
            r1 = 1
            int r5 = r5 + r1
            android.view.View[] r1 = new android.view.View[r5]
            r7 = 0
        L_0x0195:
            if (r7 >= r5) goto L_0x01a2
            int r8 = r0 + r7
            android.view.View r8 = r15.getChildAt(r8)
            r1[r7] = r8
            int r7 = r7 + 1
            goto L_0x0195
        L_0x01a2:
            androidx.databinding.DataBinderMapperImpl r7 = androidx.databinding.f.f1682a
            androidx.databinding.ViewDataBinding r1 = r7.c(r6, r1, r4)
            r20[r3] = r1
            int r5 = r5 + -1
            int r5 = r5 + r0
            r0 = r5
        L_0x01ae:
            r8 = r19
            r7 = r0
            r1 = 1
            goto L_0x01ba
        L_0x01b3:
            r23 = r5
            r17 = r10
            r7 = r0
            r8 = r1
            r1 = 0
        L_0x01ba:
            if (r1 != 0) goto L_0x01cc
            r5 = 0
            r0 = r18
            r1 = r2
            r2 = r20
            r3 = r21
            r4 = r22
            r9 = r23
            k(r0, r1, r2, r3, r4, r5)
            goto L_0x01ce
        L_0x01cc:
            r9 = r23
        L_0x01ce:
            r0 = 1
            int r1 = r7 + 1
            r7 = r21
            r13 = r0
            r0 = r1
            r1 = r8
            r5 = r9
            r10 = r17
            r11 = -1
            r8 = r22
            goto L_0x00b3
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.k(androidx.databinding.e, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$d, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] l(e eVar, View view, int i, d dVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        k(eVar, view, objArr, dVar, sparseIntArray, true);
        return objArr;
    }

    public static int p(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean q(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public abstract void c();

    public final void d() {
        if (this.f1669u) {
            o();
        } else if (g()) {
            this.f1669u = true;
            c();
            this.f1669u = false;
        }
    }

    public final void e() {
        ViewDataBinding viewDataBinding = this.z;
        if (viewDataBinding == null) {
            d();
        } else {
            viewDataBinding.e();
        }
    }

    public final void f(int i, Object obj, int i10) {
        if (!this.C && !this.D && m(i, obj, i10)) {
            o();
        }
    }

    public abstract boolean g();

    public abstract void i();

    public abstract boolean m(int i, Object obj, int i10);

    public final void n(int i, Object obj, c cVar) {
        if (obj != null) {
            k kVar = this.f1667s[i];
            if (kVar == null) {
                kVar = cVar.c(this, i, G);
                this.f1667s[i] = kVar;
                a0 a0Var = this.A;
                if (a0Var != null) {
                    kVar.f1691a.c(a0Var);
                }
            }
            kVar.b();
            kVar.f1693c = obj;
            kVar.f1691a.b(obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (E == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2.f1670v.postFrameCallback(r2.f1671w);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.f1672x.post(r2.f1665b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.z
            if (r0 == 0) goto L_0x0008
            r0.o()
            goto L_0x003b
        L_0x0008:
            androidx.lifecycle.a0 r0 = r2.A
            if (r0 == 0) goto L_0x001d
            androidx.lifecycle.r r0 = r0.getLifecycle()
            androidx.lifecycle.r$c r0 = r0.b()
            androidx.lifecycle.r$c r1 = androidx.lifecycle.r.c.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.f1666c     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r0 = 1
            r2.f1666c = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            boolean r0 = E
            if (r0 == 0) goto L_0x0034
            android.view.Choreographer r0 = r2.f1670v
            androidx.databinding.i r1 = r2.f1671w
            r0.postFrameCallback(r1)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r0 = r2.f1672x
            androidx.databinding.ViewDataBinding$c r1 = r2.f1665b
            r0.post(r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.o():void");
    }

    public void r(a0 a0Var) {
        if (a0Var instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        a0 a0Var2 = this.A;
        if (a0Var2 != a0Var) {
            if (a0Var2 != null) {
                a0Var2.getLifecycle().c(this.B);
            }
            this.A = a0Var;
            if (a0Var != null) {
                if (this.B == null) {
                    this.B = new OnStartListener(this);
                }
                a0Var.getLifecycle().a(this.B);
            }
            for (k kVar : this.f1667s) {
                if (kVar != null) {
                    kVar.f1691a.c(a0Var);
                }
            }
        }
    }

    public abstract boolean s(int i, Object obj);

    public final boolean t(int i, LiveData<?> liveData) {
        this.C = true;
        try {
            return u(i, liveData, F);
        } finally {
            this.C = false;
        }
    }

    public final boolean u(int i, Object obj, c cVar) {
        if (obj == null) {
            k kVar = this.f1667s[i];
            if (kVar != null) {
                return kVar.b();
            }
            return false;
        }
        k[] kVarArr = this.f1667s;
        k kVar2 = kVarArr[i];
        if (kVar2 == null) {
            n(i, obj, cVar);
            return true;
        } else if (kVar2.f1693c == obj) {
            return false;
        } else {
            k kVar3 = kVarArr[i];
            if (kVar3 != null) {
                kVar3.b();
            }
            n(i, obj, cVar);
            return true;
        }
    }
}
