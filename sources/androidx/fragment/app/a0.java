package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.i0;
import androidx.lifecycle.r;
import androidx.lifecycle.y0;
import io.nodle.cash.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ArrayList<a> E;
    public ArrayList<Boolean> F;
    public ArrayList<Fragment> G;
    public d0 H;
    public d I = new d();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<k> f1802a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1803b;

    /* renamed from: c  reason: collision with root package name */
    public final h0 f1804c = new h0();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f1805d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f1806e;

    /* renamed from: f  reason: collision with root package name */
    public final x f1807f = new x(this);
    public OnBackPressedDispatcher g;

    /* renamed from: h  reason: collision with root package name */
    public final a f1808h = new a();
    public final AtomicInteger i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, c> f1809j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Bundle> f1810k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, Object> f1811l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final y f1812m = new y(this);

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList<e0> f1813n = new CopyOnWriteArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public int f1814o = -1;

    /* renamed from: p  reason: collision with root package name */
    public w<?> f1815p;

    /* renamed from: q  reason: collision with root package name */
    public t f1816q;

    /* renamed from: r  reason: collision with root package name */
    public Fragment f1817r;

    /* renamed from: s  reason: collision with root package name */
    public Fragment f1818s;

    /* renamed from: t  reason: collision with root package name */
    public b f1819t = new b();

    /* renamed from: u  reason: collision with root package name */
    public c f1820u = new c();

    /* renamed from: v  reason: collision with root package name */
    public androidx.activity.result.c<Intent> f1821v;

    /* renamed from: w  reason: collision with root package name */
    public androidx.activity.result.c<androidx.activity.result.f> f1822w;

    /* renamed from: x  reason: collision with root package name */
    public androidx.activity.result.c<String[]> f1823x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayDeque<j> f1824y = new ArrayDeque<>();
    public boolean z;

    public class a extends androidx.activity.d {
        public a() {
        }

        public final void a() {
            a0 a0Var = a0.this;
            a0Var.A(true);
            if (a0Var.f1808h.f785a) {
                a0Var.S();
            } else {
                a0Var.g.b();
            }
        }
    }

    public class b extends v {
        public b() {
        }

        public final Fragment a(ClassLoader classLoader, String str) {
            return Fragment.instantiate(a0.this.f1815p.f2010b, str, (Bundle) null);
        }
    }

    public class c implements s0 {
    }

    public class d implements Runnable {
        public d() {
        }

        public final void run() {
            a0.this.A(true);
        }
    }

    public class e implements e0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f1828a;

        public e(Fragment fragment) {
            this.f1828a = fragment;
        }

        public final void a(Fragment fragment) {
            this.f1828a.onAttachFragment(fragment);
        }
    }

    public class f implements androidx.activity.result.b<androidx.activity.result.a> {
        public f() {
        }

        public final void a(Object obj) {
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            j pollFirst = a0.this.f1824y.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f1832a;
            int i = pollFirst.f1833b;
            Fragment d10 = a0.this.f1804c.d(str);
            if (d10 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            d10.onActivityResult(i, aVar.f810a, aVar.f811b);
        }
    }

    public class g implements androidx.activity.result.b<androidx.activity.result.a> {
        public g() {
        }

        public final void a(Object obj) {
            androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
            j pollFirst = a0.this.f1824y.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f1832a;
            int i = pollFirst.f1833b;
            Fragment d10 = a0.this.f1804c.d(str);
            if (d10 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            d10.onActivityResult(i, aVar.f810a, aVar.f811b);
        }
    }

    public class h implements androidx.activity.result.b<Map<String, Boolean>> {
        public h() {
        }

        public final void a(Object obj) {
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            j pollFirst = a0.this.f1824y.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f1832a;
            int i10 = pollFirst.f1833b;
            Fragment d10 = a0.this.f1804c.d(str);
            if (d10 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            d10.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    public static class i extends f.a<androidx.activity.result.f, androidx.activity.result.a> {
        public final Intent a(Object obj) {
            Bundle bundleExtra;
            androidx.activity.result.f fVar = (androidx.activity.result.f) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = fVar.f814b;
            if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    fVar = new androidx.activity.result.f(fVar.f813a, (Intent) null, fVar.f815c, fVar.f816s);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", fVar);
            if (a0.K(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        public final Object c(int i, Intent intent) {
            return new androidx.activity.result.a(i, intent);
        }
    }

    public interface k {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class l implements k {

        /* renamed from: a  reason: collision with root package name */
        public final int f1834a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1835b = 1;

        public l(int i) {
            this.f1834a = i;
        }

        public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = a0.this.f1818s;
            if (fragment == null || this.f1834a >= 0 || !fragment.getChildFragmentManager().S()) {
                return a0.this.T(arrayList, arrayList2, this.f1834a, this.f1835b);
            }
            return false;
        }
    }

    public static boolean K(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    /* JADX INFO: finally extract failed */
    public final boolean A(boolean z10) {
        boolean z11;
        z(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<a> arrayList = this.E;
            ArrayList<Boolean> arrayList2 = this.F;
            synchronized (this.f1802a) {
                if (this.f1802a.isEmpty()) {
                    z11 = false;
                } else {
                    try {
                        int size = this.f1802a.size();
                        z11 = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            z11 |= this.f1802a.get(i10).a(arrayList, arrayList2);
                        }
                    } finally {
                        this.f1802a.clear();
                        this.f1815p.f2011c.removeCallbacks(this.I);
                    }
                }
            }
            if (z11) {
                this.f1803b = true;
                try {
                    V(this.E, this.F);
                    d();
                    z12 = true;
                } catch (Throwable th2) {
                    d();
                    throw th2;
                }
            } else {
                f0();
                v();
                this.f1804c.b();
                return z12;
            }
        }
    }

    public final void B(k kVar, boolean z10) {
        if (!z10 || (this.f1815p != null && !this.C)) {
            z(z10);
            if (kVar.a(this.E, this.F)) {
                this.f1803b = true;
                try {
                    V(this.E, this.F);
                } finally {
                    d();
                }
            }
            f0();
            v();
            this.f1804c.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0151, code lost:
        r6 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Object r5 = r1.get(r3)
            androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
            boolean r5 = r5.f1931p
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r0.G
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.G = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r0.G
            androidx.fragment.app.h0 r7 = r0.f1804c
            java.util.List r7 = r7.h()
            r6.addAll(r7)
            androidx.fragment.app.Fragment r6 = r0.f1818s
            r7 = 0
            r8 = r3
        L_0x0030:
            r9 = 1
            if (r8 >= r4) goto L_0x0179
            java.lang.Object r10 = r1.get(r8)
            androidx.fragment.app.a r10 = (androidx.fragment.app.a) r10
            java.lang.Object r11 = r2.get(r8)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r12 = 3
            if (r11 != 0) goto L_0x012a
            java.util.ArrayList<androidx.fragment.app.Fragment> r11 = r0.G
            r13 = 0
        L_0x0049:
            java.util.ArrayList<androidx.fragment.app.i0$a> r14 = r10.f1918a
            int r14 = r14.size()
            if (r13 >= r14) goto L_0x0162
            java.util.ArrayList<androidx.fragment.app.i0$a> r14 = r10.f1918a
            java.lang.Object r14 = r14.get(r13)
            androidx.fragment.app.i0$a r14 = (androidx.fragment.app.i0.a) r14
            int r15 = r14.f1932a
            if (r15 == r9) goto L_0x0119
            r9 = 2
            r3 = 9
            if (r15 == r9) goto L_0x00a0
            if (r15 == r12) goto L_0x0086
            r9 = 6
            if (r15 == r9) goto L_0x0086
            r9 = 7
            if (r15 == r9) goto L_0x0083
            r9 = 8
            if (r15 == r9) goto L_0x0070
            goto L_0x010d
        L_0x0070:
            java.util.ArrayList<androidx.fragment.app.i0$a> r9 = r10.f1918a
            androidx.fragment.app.i0$a r12 = new androidx.fragment.app.i0$a
            r15 = 1
            r12.<init>(r3, r6, r15)
            r9.add(r13, r12)
            r14.f1934c = r15
            int r13 = r13 + 1
            androidx.fragment.app.Fragment r6 = r14.f1933b
            goto L_0x010d
        L_0x0083:
            r9 = 1
            goto L_0x0119
        L_0x0086:
            androidx.fragment.app.Fragment r9 = r14.f1933b
            r11.remove(r9)
            androidx.fragment.app.Fragment r9 = r14.f1933b
            if (r9 != r6) goto L_0x010d
            java.util.ArrayList<androidx.fragment.app.i0$a> r6 = r10.f1918a
            androidx.fragment.app.i0$a r12 = new androidx.fragment.app.i0$a
            r12.<init>(r3, r9)
            r6.add(r13, r12)
            int r13 = r13 + 1
            r3 = 1
            r6 = 0
            r9 = r3
            goto L_0x011e
        L_0x00a0:
            androidx.fragment.app.Fragment r3 = r14.f1933b
            int r9 = r3.mContainerId
            int r12 = r11.size()
            int r12 = r12 + -1
            r15 = 0
        L_0x00ab:
            if (r12 < 0) goto L_0x0104
            java.lang.Object r16 = r11.get(r12)
            r2 = r16
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            int r1 = r2.mContainerId
            if (r1 != r9) goto L_0x00f7
            if (r2 != r3) goto L_0x00be
            r1 = 1
            r15 = r1
            goto L_0x00f7
        L_0x00be:
            if (r2 != r6) goto L_0x00d3
            java.util.ArrayList<androidx.fragment.app.i0$a> r1 = r10.f1918a
            androidx.fragment.app.i0$a r6 = new androidx.fragment.app.i0$a
            r16 = r9
            r9 = 1
            r4 = 9
            r6.<init>(r4, r2, r9)
            r1.add(r13, r6)
            int r13 = r13 + 1
            r6 = 0
            goto L_0x00d6
        L_0x00d3:
            r16 = r9
            r9 = 1
        L_0x00d6:
            androidx.fragment.app.i0$a r1 = new androidx.fragment.app.i0$a
            r4 = 3
            r1.<init>(r4, r2, r9)
            int r4 = r14.f1935d
            r1.f1935d = r4
            int r4 = r14.f1937f
            r1.f1937f = r4
            int r4 = r14.f1936e
            r1.f1936e = r4
            int r4 = r14.g
            r1.g = r4
            java.util.ArrayList<androidx.fragment.app.i0$a> r4 = r10.f1918a
            r4.add(r13, r1)
            r11.remove(r2)
            int r13 = r13 + 1
            goto L_0x00f9
        L_0x00f7:
            r16 = r9
        L_0x00f9:
            int r12 = r12 + -1
            r1 = r18
            r2 = r19
            r4 = r21
            r9 = r16
            goto L_0x00ab
        L_0x0104:
            if (r15 == 0) goto L_0x0110
            java.util.ArrayList<androidx.fragment.app.i0$a> r1 = r10.f1918a
            r1.remove(r13)
            int r13 = r13 + -1
        L_0x010d:
            r1 = 1
        L_0x010e:
            r9 = r1
            goto L_0x011e
        L_0x0110:
            r1 = 1
            r14.f1932a = r1
            r14.f1934c = r1
            r11.add(r3)
            goto L_0x010e
        L_0x0119:
            androidx.fragment.app.Fragment r1 = r14.f1933b
            r11.add(r1)
        L_0x011e:
            int r13 = r13 + r9
            r12 = 3
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            goto L_0x0049
        L_0x012a:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r0.G
            java.util.ArrayList<androidx.fragment.app.i0$a> r2 = r10.f1918a
            int r2 = r2.size()
            int r2 = r2 - r9
        L_0x0133:
            if (r2 < 0) goto L_0x0162
            java.util.ArrayList<androidx.fragment.app.i0$a> r3 = r10.f1918a
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.i0$a r3 = (androidx.fragment.app.i0.a) r3
            int r4 = r3.f1932a
            if (r4 == r9) goto L_0x0159
            r9 = 3
            if (r4 == r9) goto L_0x0153
            switch(r4) {
                case 6: goto L_0x0153;
                case 7: goto L_0x0159;
                case 8: goto L_0x0150;
                case 9: goto L_0x014d;
                case 10: goto L_0x0148;
                default: goto L_0x0147;
            }
        L_0x0147:
            goto L_0x015e
        L_0x0148:
            androidx.lifecycle.r$c r4 = r3.f1938h
            r3.i = r4
            goto L_0x015e
        L_0x014d:
            androidx.fragment.app.Fragment r3 = r3.f1933b
            goto L_0x0151
        L_0x0150:
            r3 = 0
        L_0x0151:
            r6 = r3
            goto L_0x015e
        L_0x0153:
            androidx.fragment.app.Fragment r3 = r3.f1933b
            r1.add(r3)
            goto L_0x015e
        L_0x0159:
            androidx.fragment.app.Fragment r3 = r3.f1933b
            r1.remove(r3)
        L_0x015e:
            int r2 = r2 + -1
            r9 = 1
            goto L_0x0133
        L_0x0162:
            if (r7 != 0) goto L_0x016b
            boolean r1 = r10.g
            if (r1 == 0) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            r1 = 0
            goto L_0x016c
        L_0x016b:
            r1 = 1
        L_0x016c:
            r7 = r1
            int r8 = r8 + 1
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            goto L_0x0030
        L_0x0179:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r0.G
            r1.clear()
            if (r5 != 0) goto L_0x01ba
            int r1 = r0.f1814o
            r2 = 1
            if (r1 < r2) goto L_0x01ba
            r2 = r20
            r1 = r21
        L_0x0189:
            r3 = r18
            if (r2 >= r1) goto L_0x01be
            java.lang.Object r4 = r3.get(r2)
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            java.util.ArrayList<androidx.fragment.app.i0$a> r4 = r4.f1918a
            java.util.Iterator r4 = r4.iterator()
        L_0x0199:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01b7
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.i0$a r5 = (androidx.fragment.app.i0.a) r5
            androidx.fragment.app.Fragment r5 = r5.f1933b
            if (r5 == 0) goto L_0x0199
            androidx.fragment.app.a0 r6 = r5.mFragmentManager
            if (r6 == 0) goto L_0x0199
            androidx.fragment.app.g0 r5 = r0.f(r5)
            androidx.fragment.app.h0 r6 = r0.f1804c
            r6.i(r5)
            goto L_0x0199
        L_0x01b7:
            int r2 = r2 + 1
            goto L_0x0189
        L_0x01ba:
            r3 = r18
            r1 = r21
        L_0x01be:
            r2 = r20
        L_0x01c0:
            r4 = -1
            if (r2 >= r1) goto L_0x03a7
            java.lang.Object r5 = r3.get(r2)
            androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
            r6 = r19
            java.lang.Object r7 = r6.get(r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r8 = "Unknown cmd: "
            if (r7 == 0) goto L_0x02cd
            r5.g(r4)
            java.util.ArrayList<androidx.fragment.app.i0$a> r4 = r5.f1918a
            int r4 = r4.size()
            r7 = 1
            int r4 = r4 - r7
        L_0x01e4:
            if (r4 < 0) goto L_0x03a3
            java.util.ArrayList<androidx.fragment.app.i0$a> r9 = r5.f1918a
            java.lang.Object r9 = r9.get(r4)
            androidx.fragment.app.i0$a r9 = (androidx.fragment.app.i0.a) r9
            androidx.fragment.app.Fragment r10 = r9.f1933b
            if (r10 == 0) goto L_0x0221
            r11 = 0
            r10.mBeingSaved = r11
            r10.setPopDirection(r7)
            int r7 = r5.f1923f
            r11 = 4100(0x1004, float:5.745E-42)
            r12 = 4099(0x1003, float:5.744E-42)
            r13 = 8197(0x2005, float:1.1486E-41)
            r14 = 8194(0x2002, float:1.1482E-41)
            r15 = 4097(0x1001, float:5.741E-42)
            if (r7 == r15) goto L_0x0216
            if (r7 == r14) goto L_0x0214
            if (r7 == r13) goto L_0x0217
            if (r7 == r12) goto L_0x0212
            if (r7 == r11) goto L_0x0210
            r11 = 0
            goto L_0x0217
        L_0x0210:
            r11 = r13
            goto L_0x0217
        L_0x0212:
            r11 = r12
            goto L_0x0217
        L_0x0214:
            r11 = r15
            goto L_0x0217
        L_0x0216:
            r11 = r14
        L_0x0217:
            r10.setNextTransition(r11)
            java.util.ArrayList<java.lang.String> r7 = r5.f1930o
            java.util.ArrayList<java.lang.String> r11 = r5.f1929n
            r10.setSharedElementNames(r7, r11)
        L_0x0221:
            int r7 = r9.f1932a
            switch(r7) {
                case 1: goto L_0x02b2;
                case 2: goto L_0x0226;
                case 3: goto L_0x02a1;
                case 4: goto L_0x0290;
                case 5: goto L_0x0279;
                case 6: goto L_0x0268;
                case 7: goto L_0x0251;
                case 8: goto L_0x0249;
                case 9: goto L_0x0242;
                case 10: goto L_0x0239;
                default: goto L_0x0226;
            }
        L_0x0226:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = a.a.d(r8)
            int r3 = r9.f1932a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0239:
            androidx.fragment.app.a0 r7 = r5.f1799q
            androidx.lifecycle.r$c r9 = r9.f1938h
            r7.a0(r10, r9)
            goto L_0x02c8
        L_0x0242:
            androidx.fragment.app.a0 r7 = r5.f1799q
            r7.b0(r10)
            goto L_0x02c8
        L_0x0249:
            androidx.fragment.app.a0 r7 = r5.f1799q
            r9 = 0
            r7.b0(r9)
            goto L_0x02c8
        L_0x0251:
            int r7 = r9.f1935d
            int r11 = r9.f1936e
            int r12 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r7, r11, r12, r9)
            androidx.fragment.app.a0 r7 = r5.f1799q
            r9 = 1
            r7.Z(r10, r9)
            androidx.fragment.app.a0 r7 = r5.f1799q
            r7.g(r10)
            goto L_0x02c8
        L_0x0268:
            int r7 = r9.f1935d
            int r11 = r9.f1936e
            int r12 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r7, r11, r12, r9)
            androidx.fragment.app.a0 r7 = r5.f1799q
            r7.c(r10)
            goto L_0x02c8
        L_0x0279:
            int r7 = r9.f1935d
            int r11 = r9.f1936e
            int r12 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r7, r11, r12, r9)
            androidx.fragment.app.a0 r7 = r5.f1799q
            r9 = 1
            r7.Z(r10, r9)
            androidx.fragment.app.a0 r7 = r5.f1799q
            r7.J(r10)
            goto L_0x02c8
        L_0x0290:
            int r7 = r9.f1935d
            int r11 = r9.f1936e
            int r12 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r7, r11, r12, r9)
            androidx.fragment.app.a0 r7 = r5.f1799q
            r7.d0(r10)
            goto L_0x02c8
        L_0x02a1:
            int r7 = r9.f1935d
            int r11 = r9.f1936e
            int r12 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r7, r11, r12, r9)
            androidx.fragment.app.a0 r7 = r5.f1799q
            r7.a(r10)
            goto L_0x02c8
        L_0x02b2:
            int r7 = r9.f1935d
            int r11 = r9.f1936e
            int r12 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r7, r11, r12, r9)
            androidx.fragment.app.a0 r7 = r5.f1799q
            r9 = 1
            r7.Z(r10, r9)
            androidx.fragment.app.a0 r7 = r5.f1799q
            r7.U(r10)
        L_0x02c8:
            int r4 = r4 + -1
            r7 = 1
            goto L_0x01e4
        L_0x02cd:
            r4 = 1
            r5.g(r4)
            java.util.ArrayList<androidx.fragment.app.i0$a> r4 = r5.f1918a
            int r4 = r4.size()
            r7 = 0
        L_0x02d8:
            if (r7 >= r4) goto L_0x03a3
            java.util.ArrayList<androidx.fragment.app.i0$a> r9 = r5.f1918a
            java.lang.Object r9 = r9.get(r7)
            androidx.fragment.app.i0$a r9 = (androidx.fragment.app.i0.a) r9
            androidx.fragment.app.Fragment r10 = r9.f1933b
            if (r10 == 0) goto L_0x02f8
            r11 = 0
            r10.mBeingSaved = r11
            r10.setPopDirection(r11)
            int r11 = r5.f1923f
            r10.setNextTransition(r11)
            java.util.ArrayList<java.lang.String> r11 = r5.f1929n
            java.util.ArrayList<java.lang.String> r12 = r5.f1930o
            r10.setSharedElementNames(r11, r12)
        L_0x02f8:
            int r11 = r9.f1932a
            switch(r11) {
                case 1: goto L_0x0389;
                case 2: goto L_0x02fd;
                case 3: goto L_0x0378;
                case 4: goto L_0x0367;
                case 5: goto L_0x0350;
                case 6: goto L_0x033f;
                case 7: goto L_0x0328;
                case 8: goto L_0x0321;
                case 9: goto L_0x0319;
                case 10: goto L_0x0310;
                default: goto L_0x02fd;
            }
        L_0x02fd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = a.a.d(r8)
            int r3 = r9.f1932a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0310:
            androidx.fragment.app.a0 r11 = r5.f1799q
            androidx.lifecycle.r$c r9 = r9.i
            r11.a0(r10, r9)
            goto L_0x039f
        L_0x0319:
            androidx.fragment.app.a0 r9 = r5.f1799q
            r10 = 0
            r9.b0(r10)
            goto L_0x039f
        L_0x0321:
            androidx.fragment.app.a0 r9 = r5.f1799q
            r9.b0(r10)
            goto L_0x039f
        L_0x0328:
            int r11 = r9.f1935d
            int r12 = r9.f1936e
            int r13 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r11, r12, r13, r9)
            androidx.fragment.app.a0 r9 = r5.f1799q
            r11 = 0
            r9.Z(r10, r11)
            androidx.fragment.app.a0 r9 = r5.f1799q
            r9.c(r10)
            goto L_0x039f
        L_0x033f:
            int r11 = r9.f1935d
            int r12 = r9.f1936e
            int r13 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r11, r12, r13, r9)
            androidx.fragment.app.a0 r9 = r5.f1799q
            r9.g(r10)
            goto L_0x039f
        L_0x0350:
            int r11 = r9.f1935d
            int r12 = r9.f1936e
            int r13 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r11, r12, r13, r9)
            androidx.fragment.app.a0 r9 = r5.f1799q
            r11 = 0
            r9.Z(r10, r11)
            androidx.fragment.app.a0 r9 = r5.f1799q
            r9.d0(r10)
            goto L_0x039f
        L_0x0367:
            int r11 = r9.f1935d
            int r12 = r9.f1936e
            int r13 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r11, r12, r13, r9)
            androidx.fragment.app.a0 r9 = r5.f1799q
            r9.J(r10)
            goto L_0x039f
        L_0x0378:
            int r11 = r9.f1935d
            int r12 = r9.f1936e
            int r13 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r11, r12, r13, r9)
            androidx.fragment.app.a0 r9 = r5.f1799q
            r9.U(r10)
            goto L_0x039f
        L_0x0389:
            int r11 = r9.f1935d
            int r12 = r9.f1936e
            int r13 = r9.f1937f
            int r9 = r9.g
            r10.setAnimations(r11, r12, r13, r9)
            androidx.fragment.app.a0 r9 = r5.f1799q
            r11 = 0
            r9.Z(r10, r11)
            androidx.fragment.app.a0 r9 = r5.f1799q
            r9.a(r10)
        L_0x039f:
            int r7 = r7 + 1
            goto L_0x02d8
        L_0x03a3:
            int r2 = r2 + 1
            goto L_0x01c0
        L_0x03a7:
            r6 = r19
            int r2 = r1 + -1
            java.lang.Object r2 = r6.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r5 = r20
        L_0x03b7:
            if (r5 >= r1) goto L_0x0402
            java.lang.Object r7 = r3.get(r5)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            if (r2 == 0) goto L_0x03e1
            java.util.ArrayList<androidx.fragment.app.i0$a> r8 = r7.f1918a
            int r8 = r8.size()
            int r8 = r8 + -1
        L_0x03c9:
            if (r8 < 0) goto L_0x03ff
            java.util.ArrayList<androidx.fragment.app.i0$a> r9 = r7.f1918a
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.i0$a r9 = (androidx.fragment.app.i0.a) r9
            androidx.fragment.app.Fragment r9 = r9.f1933b
            if (r9 == 0) goto L_0x03de
            androidx.fragment.app.g0 r9 = r0.f(r9)
            r9.k()
        L_0x03de:
            int r8 = r8 + -1
            goto L_0x03c9
        L_0x03e1:
            java.util.ArrayList<androidx.fragment.app.i0$a> r7 = r7.f1918a
            java.util.Iterator r7 = r7.iterator()
        L_0x03e7:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x03ff
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.i0$a r8 = (androidx.fragment.app.i0.a) r8
            androidx.fragment.app.Fragment r8 = r8.f1933b
            if (r8 == 0) goto L_0x03e7
            androidx.fragment.app.g0 r8 = r0.f(r8)
            r8.k()
            goto L_0x03e7
        L_0x03ff:
            int r5 = r5 + 1
            goto L_0x03b7
        L_0x0402:
            int r5 = r0.f1814o
            r7 = 1
            r0.P(r5, r7)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r7 = r20
        L_0x040f:
            if (r7 >= r1) goto L_0x0440
            java.lang.Object r8 = r3.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.a) r8
            java.util.ArrayList<androidx.fragment.app.i0$a> r8 = r8.f1918a
            java.util.Iterator r8 = r8.iterator()
        L_0x041d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x043d
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.i0$a r9 = (androidx.fragment.app.i0.a) r9
            androidx.fragment.app.Fragment r9 = r9.f1933b
            if (r9 == 0) goto L_0x041d
            android.view.ViewGroup r9 = r9.mContainer
            if (r9 == 0) goto L_0x041d
            androidx.fragment.app.s0 r10 = r17.I()
            androidx.fragment.app.r0 r9 = androidx.fragment.app.r0.g(r9, r10)
            r5.add(r9)
            goto L_0x041d
        L_0x043d:
            int r7 = r7 + 1
            goto L_0x040f
        L_0x0440:
            java.util.Iterator r5 = r5.iterator()
        L_0x0444:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0459
            java.lang.Object r7 = r5.next()
            androidx.fragment.app.r0 r7 = (androidx.fragment.app.r0) r7
            r7.f1984d = r2
            r7.h()
            r7.c()
            goto L_0x0444
        L_0x0459:
            r2 = r20
        L_0x045b:
            if (r2 >= r1) goto L_0x047b
            java.lang.Object r5 = r3.get(r2)
            androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
            java.lang.Object r7 = r6.get(r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0475
            int r7 = r5.f1801s
            if (r7 < 0) goto L_0x0475
            r5.f1801s = r4
        L_0x0475:
            java.util.Objects.requireNonNull(r5)
            int r2 = r2 + 1
            goto L_0x045b
        L_0x047b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.C(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final Fragment D(String str) {
        return this.f1804c.c(str);
    }

    public final Fragment E(int i10) {
        h0 h0Var = this.f1804c;
        int size = ((ArrayList) h0Var.f1911a).size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) ((ArrayList) h0Var.f1911a).get(size);
                if (fragment != null && fragment.mFragmentId == i10) {
                    return fragment;
                }
            } else {
                for (g0 g0Var : ((HashMap) h0Var.f1912b).values()) {
                    if (g0Var != null) {
                        Fragment fragment2 = g0Var.f1902c;
                        if (fragment2.mFragmentId == i10) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final Fragment F(String str) {
        h0 h0Var = this.f1804c;
        Objects.requireNonNull(h0Var);
        if (str != null) {
            int size = ((ArrayList) h0Var.f1911a).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = (Fragment) ((ArrayList) h0Var.f1911a).get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (g0 g0Var : ((HashMap) h0Var.f1912b).values()) {
                if (g0Var != null) {
                    Fragment fragment2 = g0Var.f1902c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        }
        return null;
    }

    public final ViewGroup G(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f1816q.c()) {
            View b10 = this.f1816q.b(fragment.mContainerId);
            if (b10 instanceof ViewGroup) {
                return (ViewGroup) b10;
            }
        }
        return null;
    }

    public final v H() {
        Fragment fragment = this.f1817r;
        if (fragment != null) {
            return fragment.mFragmentManager.H();
        }
        return this.f1819t;
    }

    public final s0 I() {
        Fragment fragment = this.f1817r;
        if (fragment != null) {
            return fragment.mFragmentManager.I();
        }
        return this.f1820u;
    }

    public final void J(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            c0(fragment);
        }
    }

    public final boolean L(Fragment fragment) {
        boolean z10;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        a0 a0Var = fragment.mChildFragmentManager;
        Iterator it = ((ArrayList) a0Var.f1804c.f()).iterator();
        boolean z11 = false;
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z11 = a0Var.L(fragment2);
                continue;
            }
            if (z11) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public final boolean M(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public final boolean N(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        a0 a0Var = fragment.mFragmentManager;
        if (!fragment.equals(a0Var.f1818s) || !N(a0Var.f1817r)) {
            return false;
        }
        return true;
    }

    public final boolean O() {
        return this.A || this.B;
    }

    public final void P(int i10, boolean z10) {
        w<?> wVar;
        if (this.f1815p == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z10 || i10 != this.f1814o) {
            this.f1814o = i10;
            h0 h0Var = this.f1804c;
            Iterator it = ((ArrayList) h0Var.f1911a).iterator();
            while (it.hasNext()) {
                g0 g0Var = (g0) ((HashMap) h0Var.f1912b).get(((Fragment) it.next()).mWho);
                if (g0Var != null) {
                    g0Var.k();
                }
            }
            Iterator it2 = ((HashMap) h0Var.f1912b).values().iterator();
            while (true) {
                boolean z11 = false;
                if (!it2.hasNext()) {
                    break;
                }
                g0 g0Var2 = (g0) it2.next();
                if (g0Var2 != null) {
                    g0Var2.k();
                    Fragment fragment = g0Var2.f1902c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        z11 = true;
                    }
                    if (z11) {
                        if (fragment.mBeingSaved && !((HashMap) h0Var.f1913c).containsKey(fragment.mWho)) {
                            g0Var2.o();
                        }
                        h0Var.j(g0Var2);
                    }
                }
            }
            e0();
            if (this.z && (wVar = this.f1815p) != null && this.f1814o == 7) {
                wVar.g();
                this.z = false;
            }
        }
    }

    public final void Q() {
        if (this.f1815p != null) {
            this.A = false;
            this.B = false;
            this.H.f1877w = false;
            for (Fragment fragment : this.f1804c.h()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    public final void R(g0 g0Var) {
        Fragment fragment = g0Var.f1902c;
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.f1803b) {
            this.D = true;
            return;
        }
        fragment.mDeferStart = false;
        g0Var.k();
    }

    public final boolean S() {
        A(false);
        z(true);
        Fragment fragment = this.f1818s;
        if (fragment != null && fragment.getChildFragmentManager().S()) {
            return true;
        }
        boolean T = T(this.E, this.F, -1, 0);
        if (T) {
            this.f1803b = true;
            try {
                V(this.E, this.F);
            } finally {
                d();
            }
        }
        f0();
        v();
        this.f1804c.b();
        return T;
    }

    public final boolean T(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        ArrayList<a> arrayList3 = this.f1805d;
        int i12 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i10 < 0) {
                i12 = z10 ? 0 : -1 + this.f1805d.size();
            } else {
                int size = this.f1805d.size() - 1;
                while (size >= 0) {
                    a aVar = this.f1805d.get(size);
                    if (i10 >= 0 && i10 == aVar.f1801s) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z10) {
                        while (size > 0) {
                            int i13 = size - 1;
                            a aVar2 = this.f1805d.get(i13);
                            if (i10 < 0 || i10 != aVar2.f1801s) {
                                break;
                            }
                            size = i13;
                        }
                    } else if (size != this.f1805d.size() - 1) {
                        size++;
                    }
                }
                i12 = size;
            }
        }
        if (i12 < 0) {
            return false;
        }
        for (int size2 = this.f1805d.size() - 1; size2 >= i12; size2--) {
            arrayList.add(this.f1805d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            h0 h0Var = this.f1804c;
            synchronized (((ArrayList) h0Var.f1911a)) {
                ((ArrayList) h0Var.f1911a).remove(fragment);
            }
            fragment.mAdded = false;
            if (L(fragment)) {
                this.z = true;
            }
            fragment.mRemoving = true;
            c0(fragment);
        }
    }

    public final void V(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).f1931p) {
                        if (i11 != i10) {
                            C(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f1931p) {
                                i11++;
                            }
                        }
                        C(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    C(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void W(Parcelable parcelable) {
        c0 c0Var;
        ArrayList<f0> arrayList;
        int i10;
        g0 g0Var;
        if (parcelable != null && (arrayList = c0Var.f1849a) != null) {
            h0 h0Var = this.f1804c;
            ((HashMap) h0Var.f1913c).clear();
            Iterator<f0> it = arrayList.iterator();
            while (it.hasNext()) {
                f0 next = it.next();
                ((HashMap) h0Var.f1913c).put(next.f1886b, next);
            }
            ((HashMap) this.f1804c.f1912b).clear();
            Iterator<String> it2 = (c0Var = (c0) parcelable).f1850b.iterator();
            while (it2.hasNext()) {
                f0 k10 = this.f1804c.k(it2.next(), (f0) null);
                if (k10 != null) {
                    Fragment fragment = this.H.f1872c.get(k10.f1886b);
                    if (fragment != null) {
                        if (K(2)) {
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                        }
                        g0Var = new g0(this.f1812m, this.f1804c, fragment, k10);
                    } else {
                        g0Var = new g0(this.f1812m, this.f1804c, this.f1815p.f2010b.getClassLoader(), H(), k10);
                    }
                    Fragment fragment2 = g0Var.f1902c;
                    fragment2.mFragmentManager = this;
                    if (K(2)) {
                        StringBuilder d10 = a.a.d("restoreSaveState: active (");
                        d10.append(fragment2.mWho);
                        d10.append("): ");
                        d10.append(fragment2);
                        Log.v("FragmentManager", d10.toString());
                    }
                    g0Var.m(this.f1815p.f2010b.getClassLoader());
                    this.f1804c.i(g0Var);
                    g0Var.f1904e = this.f1814o;
                }
            }
            d0 d0Var = this.H;
            Objects.requireNonNull(d0Var);
            Iterator it3 = new ArrayList(d0Var.f1872c.values()).iterator();
            while (true) {
                i10 = 0;
                if (!it3.hasNext()) {
                    break;
                }
                Fragment fragment3 = (Fragment) it3.next();
                if (((HashMap) this.f1804c.f1912b).get(fragment3.mWho) != null) {
                    i10 = 1;
                }
                if (i10 == 0) {
                    if (K(2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + c0Var.f1850b);
                    }
                    this.H.l(fragment3);
                    fragment3.mFragmentManager = this;
                    g0 g0Var2 = new g0(this.f1812m, this.f1804c, fragment3);
                    g0Var2.f1904e = 1;
                    g0Var2.k();
                    fragment3.mRemoving = true;
                    g0Var2.k();
                }
            }
            h0 h0Var2 = this.f1804c;
            ArrayList<String> arrayList2 = c0Var.f1851c;
            ((ArrayList) h0Var2.f1911a).clear();
            if (arrayList2 != null) {
                for (String next2 : arrayList2) {
                    Fragment c10 = h0Var2.c(next2);
                    if (c10 != null) {
                        if (K(2)) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + c10);
                        }
                        h0Var2.a(c10);
                    } else {
                        throw new IllegalStateException(o.c("No instantiated fragment for (", next2, ")"));
                    }
                }
            }
            if (c0Var.f1852s != null) {
                this.f1805d = new ArrayList<>(c0Var.f1852s.length);
                int i11 = 0;
                while (true) {
                    b[] bVarArr = c0Var.f1852s;
                    if (i11 >= bVarArr.length) {
                        break;
                    }
                    b bVar = bVarArr[i11];
                    Objects.requireNonNull(bVar);
                    a aVar = new a(this);
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        int[] iArr = bVar.f1837a;
                        if (i12 >= iArr.length) {
                            break;
                        }
                        i0.a aVar2 = new i0.a();
                        int i14 = i12 + 1;
                        aVar2.f1932a = iArr[i12];
                        if (K(2)) {
                            Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i13 + " base fragment #" + bVar.f1837a[i14]);
                        }
                        aVar2.f1938h = r.c.values()[bVar.f1839c[i13]];
                        aVar2.i = r.c.values()[bVar.f1840s[i13]];
                        int[] iArr2 = bVar.f1837a;
                        int i15 = i14 + 1;
                        aVar2.f1934c = iArr2[i14] != 0;
                        int i16 = i15 + 1;
                        int i17 = iArr2[i15];
                        aVar2.f1935d = i17;
                        int i18 = i16 + 1;
                        int i19 = iArr2[i16];
                        aVar2.f1936e = i19;
                        int i20 = i18 + 1;
                        int i21 = iArr2[i18];
                        aVar2.f1937f = i21;
                        int i22 = iArr2[i20];
                        aVar2.g = i22;
                        aVar.f1919b = i17;
                        aVar.f1920c = i19;
                        aVar.f1921d = i21;
                        aVar.f1922e = i22;
                        aVar.b(aVar2);
                        i13++;
                        i12 = i20 + 1;
                    }
                    aVar.f1923f = bVar.f1841t;
                    aVar.i = bVar.f1842u;
                    aVar.g = true;
                    aVar.f1925j = bVar.f1844w;
                    aVar.f1926k = bVar.f1845x;
                    aVar.f1927l = bVar.f1846y;
                    aVar.f1928m = bVar.z;
                    aVar.f1929n = bVar.A;
                    aVar.f1930o = bVar.B;
                    aVar.f1931p = bVar.C;
                    aVar.f1801s = bVar.f1843v;
                    for (int i23 = 0; i23 < bVar.f1838b.size(); i23++) {
                        String str = bVar.f1838b.get(i23);
                        if (str != null) {
                            aVar.f1918a.get(i23).f1933b = D(str);
                        }
                    }
                    aVar.g(1);
                    if (K(2)) {
                        StringBuilder d11 = a8.a.d("restoreAllState: back stack #", i11, " (index ");
                        d11.append(aVar.f1801s);
                        d11.append("): ");
                        d11.append(aVar);
                        Log.v("FragmentManager", d11.toString());
                        PrintWriter printWriter = new PrintWriter(new q0());
                        aVar.k("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f1805d.add(aVar);
                    i11++;
                }
            } else {
                this.f1805d = null;
            }
            this.i.set(c0Var.f1853t);
            String str2 = c0Var.f1854u;
            if (str2 != null) {
                Fragment D2 = D(str2);
                this.f1818s = D2;
                r(D2);
            }
            ArrayList<String> arrayList3 = c0Var.f1855v;
            if (arrayList3 != null) {
                for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                    this.f1809j.put(arrayList3.get(i24), c0Var.f1856w.get(i24));
                }
            }
            ArrayList<String> arrayList4 = c0Var.f1857x;
            if (arrayList4 != null) {
                while (i10 < arrayList4.size()) {
                    Bundle bundle = c0Var.f1858y.get(i10);
                    bundle.setClassLoader(this.f1815p.f2010b.getClassLoader());
                    this.f1810k.put(arrayList4.get(i10), bundle);
                    i10++;
                }
            }
            this.f1824y = new ArrayDeque<>(c0Var.z);
        }
    }

    public final Parcelable X() {
        int i10;
        ArrayList<String> arrayList;
        int size;
        Iterator it = ((HashSet) e()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r0 r0Var = (r0) it.next();
            if (r0Var.f1985e) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                r0Var.f1985e = false;
                r0Var.c();
            }
        }
        x();
        A(true);
        this.A = true;
        this.H.f1877w = true;
        h0 h0Var = this.f1804c;
        Objects.requireNonNull(h0Var);
        ArrayList<String> arrayList2 = new ArrayList<>(((HashMap) h0Var.f1912b).size());
        for (g0 g0Var : ((HashMap) h0Var.f1912b).values()) {
            if (g0Var != null) {
                Fragment fragment = g0Var.f1902c;
                g0Var.o();
                arrayList2.add(fragment.mWho);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        h0 h0Var2 = this.f1804c;
        Objects.requireNonNull(h0Var2);
        ArrayList<f0> arrayList3 = new ArrayList<>(((HashMap) h0Var2.f1913c).values());
        b[] bVarArr = null;
        if (arrayList3.isEmpty()) {
            if (K(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        h0 h0Var3 = this.f1804c;
        synchronized (((ArrayList) h0Var3.f1911a)) {
            if (((ArrayList) h0Var3.f1911a).isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(((ArrayList) h0Var3.f1911a).size());
                Iterator it2 = ((ArrayList) h0Var3.f1911a).iterator();
                while (it2.hasNext()) {
                    Fragment fragment2 = (Fragment) it2.next();
                    arrayList.add(fragment2.mWho);
                    if (K(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                    }
                }
            }
        }
        ArrayList<a> arrayList4 = this.f1805d;
        if (arrayList4 != null && (size = arrayList4.size()) > 0) {
            bVarArr = new b[size];
            for (i10 = 0; i10 < size; i10++) {
                bVarArr[i10] = new b(this.f1805d.get(i10));
                if (K(2)) {
                    StringBuilder d10 = a8.a.d("saveAllState: adding back stack #", i10, ": ");
                    d10.append(this.f1805d.get(i10));
                    Log.v("FragmentManager", d10.toString());
                }
            }
        }
        c0 c0Var = new c0();
        c0Var.f1849a = arrayList3;
        c0Var.f1850b = arrayList2;
        c0Var.f1851c = arrayList;
        c0Var.f1852s = bVarArr;
        c0Var.f1853t = this.i.get();
        Fragment fragment3 = this.f1818s;
        if (fragment3 != null) {
            c0Var.f1854u = fragment3.mWho;
        }
        c0Var.f1855v.addAll(this.f1809j.keySet());
        c0Var.f1856w.addAll(this.f1809j.values());
        c0Var.f1857x.addAll(this.f1810k.keySet());
        c0Var.f1858y.addAll(this.f1810k.values());
        c0Var.z = new ArrayList<>(this.f1824y);
        return c0Var;
    }

    public final void Y() {
        synchronized (this.f1802a) {
            boolean z10 = true;
            if (this.f1802a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f1815p.f2011c.removeCallbacks(this.I);
                this.f1815p.f2011c.post(this.I);
                f0();
            }
        }
    }

    public final void Z(Fragment fragment, boolean z10) {
        ViewGroup G2 = G(fragment);
        if (G2 != null && (G2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) G2).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final g0 a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            a1.d.d(fragment, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        g0 f10 = f(fragment);
        fragment.mFragmentManager = this;
        this.f1804c.i(f10);
        if (!fragment.mDetached) {
            this.f1804c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (L(fragment)) {
                this.z = true;
            }
        }
        return f10;
    }

    public final void a0(Fragment fragment, r.c cVar) {
        if (!fragment.equals(D(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: androidx.activity.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.fragment.app.w<?> r3, androidx.fragment.app.t r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.w<?> r0 = r2.f1815p
            if (r0 != 0) goto L_0x0126
            r2.f1815p = r3
            r2.f1816q = r4
            r2.f1817r = r5
            if (r5 == 0) goto L_0x0017
            androidx.fragment.app.a0$e r4 = new androidx.fragment.app.a0$e
            r4.<init>(r5)
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.e0> r0 = r2.f1813n
            r0.add(r4)
            goto L_0x0023
        L_0x0017:
            boolean r4 = r3 instanceof androidx.fragment.app.e0
            if (r4 == 0) goto L_0x0023
            r4 = r3
            androidx.fragment.app.e0 r4 = (androidx.fragment.app.e0) r4
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.e0> r0 = r2.f1813n
            r0.add(r4)
        L_0x0023:
            androidx.fragment.app.Fragment r4 = r2.f1817r
            if (r4 == 0) goto L_0x002a
            r2.f0()
        L_0x002a:
            boolean r4 = r3 instanceof androidx.activity.e
            if (r4 == 0) goto L_0x003f
            r4 = r3
            androidx.activity.e r4 = (androidx.activity.e) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.g = r0
            if (r5 == 0) goto L_0x003a
            r4 = r5
        L_0x003a:
            androidx.fragment.app.a0$a r1 = r2.f1808h
            r0.a(r4, r1)
        L_0x003f:
            if (r5 == 0) goto L_0x0062
            androidx.fragment.app.a0 r3 = r5.mFragmentManager
            androidx.fragment.app.d0 r3 = r3.H
            java.util.HashMap<java.lang.String, androidx.fragment.app.d0> r4 = r3.f1873s
            java.lang.String r0 = r5.mWho
            java.lang.Object r4 = r4.get(r0)
            androidx.fragment.app.d0 r4 = (androidx.fragment.app.d0) r4
            if (r4 != 0) goto L_0x005f
            androidx.fragment.app.d0 r4 = new androidx.fragment.app.d0
            boolean r0 = r3.f1875u
            r4.<init>(r0)
            java.util.HashMap<java.lang.String, androidx.fragment.app.d0> r3 = r3.f1873s
            java.lang.String r0 = r5.mWho
            r3.put(r0, r4)
        L_0x005f:
            r2.H = r4
            goto L_0x0086
        L_0x0062:
            boolean r4 = r3 instanceof androidx.lifecycle.y0
            if (r4 == 0) goto L_0x007e
            androidx.lifecycle.y0 r3 = (androidx.lifecycle.y0) r3
            androidx.lifecycle.x0 r3 = r3.getViewModelStore()
            androidx.lifecycle.w0 r4 = new androidx.lifecycle.w0
            androidx.fragment.app.d0$a r0 = androidx.fragment.app.d0.f1871x
            r4.<init>(r3, r0)
            java.lang.Class<androidx.fragment.app.d0> r3 = androidx.fragment.app.d0.class
            androidx.lifecycle.u0 r3 = r4.a(r3)
            androidx.fragment.app.d0 r3 = (androidx.fragment.app.d0) r3
            r2.H = r3
            goto L_0x0086
        L_0x007e:
            androidx.fragment.app.d0 r3 = new androidx.fragment.app.d0
            r4 = 0
            r3.<init>(r4)
            r2.H = r3
        L_0x0086:
            androidx.fragment.app.d0 r3 = r2.H
            boolean r4 = r2.O()
            r3.f1877w = r4
            androidx.fragment.app.h0 r3 = r2.f1804c
            androidx.fragment.app.d0 r4 = r2.H
            r3.f1914d = r4
            androidx.fragment.app.w<?> r3 = r2.f1815p
            boolean r4 = r3 instanceof androidx.savedstate.c
            if (r4 == 0) goto L_0x00b9
            if (r5 != 0) goto L_0x00b9
            androidx.savedstate.c r3 = (androidx.savedstate.c) r3
            androidx.savedstate.a r3 = r3.getSavedStateRegistry()
            androidx.fragment.app.z r4 = new androidx.fragment.app.z
            r4.<init>(r2)
            java.lang.String r0 = "android:support:fragments"
            r3.b(r0, r4)
            android.os.Bundle r3 = r3.a(r0)
            if (r3 == 0) goto L_0x00b9
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r2.W(r3)
        L_0x00b9:
            androidx.fragment.app.w<?> r3 = r2.f1815p
            boolean r4 = r3 instanceof androidx.activity.result.e
            if (r4 == 0) goto L_0x0125
            androidx.activity.result.e r3 = (androidx.activity.result.e) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L_0x00d5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            java.lang.String r0 = ":"
            java.lang.String r4 = android.support.v4.media.a.e(r4, r5, r0)
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r4 = ""
        L_0x00d7:
            java.lang.String r5 = "FragmentManager:"
            java.lang.String r4 = a8.a.c(r5, r4)
            java.lang.String r5 = "StartActivityForResult"
            java.lang.String r5 = a8.a.c(r4, r5)
            f.c r0 = new f.c
            r0.<init>()
            androidx.fragment.app.a0$f r1 = new androidx.fragment.app.a0$f
            r1.<init>()
            androidx.activity.result.c r5 = r3.e(r5, r0, r1)
            androidx.activity.result.ActivityResultRegistry$b r5 = (androidx.activity.result.ActivityResultRegistry.b) r5
            r2.f1821v = r5
            java.lang.String r5 = "StartIntentSenderForResult"
            java.lang.String r5 = a8.a.c(r4, r5)
            androidx.fragment.app.a0$i r0 = new androidx.fragment.app.a0$i
            r0.<init>()
            androidx.fragment.app.a0$g r1 = new androidx.fragment.app.a0$g
            r1.<init>()
            androidx.activity.result.c r5 = r3.e(r5, r0, r1)
            androidx.activity.result.ActivityResultRegistry$b r5 = (androidx.activity.result.ActivityResultRegistry.b) r5
            r2.f1822w = r5
            java.lang.String r5 = "RequestPermissions"
            java.lang.String r4 = a8.a.c(r4, r5)
            f.b r5 = new f.b
            r5.<init>()
            androidx.fragment.app.a0$h r0 = new androidx.fragment.app.a0$h
            r0.<init>()
            androidx.activity.result.c r3 = r3.e(r4, r5, r0)
            androidx.activity.result.ActivityResultRegistry$b r3 = (androidx.activity.result.ActivityResultRegistry.b) r3
            r2.f1823x = r3
        L_0x0125:
            return
        L_0x0126:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.b(androidx.fragment.app.w, androidx.fragment.app.t, androidx.fragment.app.Fragment):void");
    }

    public final void b0(Fragment fragment) {
        if (fragment == null || (fragment.equals(D(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f1818s;
            this.f1818s = fragment;
            r(fragment2);
            r(this.f1818s);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.f1804c.a(fragment);
                if (K(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (L(fragment)) {
                    this.z = true;
                }
            }
        }
    }

    public final void c0(Fragment fragment) {
        ViewGroup G2 = G(fragment);
        if (G2 != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (G2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G2.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) G2.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void d() {
        this.f1803b = false;
        this.F.clear();
        this.E.clear();
    }

    public final void d0(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final Set<r0> e() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f1804c.e()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((g0) it.next()).f1902c.mContainer;
            if (viewGroup != null) {
                hashSet.add(r0.g(viewGroup, I()));
            }
        }
        return hashSet;
    }

    public final void e0() {
        Iterator it = ((ArrayList) this.f1804c.e()).iterator();
        while (it.hasNext()) {
            R((g0) it.next());
        }
    }

    public final g0 f(Fragment fragment) {
        g0 g8 = this.f1804c.g(fragment.mWho);
        if (g8 != null) {
            return g8;
        }
        g0 g0Var = new g0(this.f1812m, this.f1804c, fragment);
        g0Var.m(this.f1815p.f2010b.getClassLoader());
        g0Var.f1904e = this.f1814o;
        return g0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (N(r4.f1817r) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0.f785a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.f1808h;
        r1 = r4.f1805d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f0() {
        /*
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.a0$k> r0 = r4.f1802a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.a0$k> r1 = r4.f1802a     // Catch:{ all -> 0x002f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            androidx.fragment.app.a0$a r1 = r4.f1808h     // Catch:{ all -> 0x002f }
            r1.f785a = r2     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            androidx.fragment.app.a0$a r0 = r4.f1808h
            java.util.ArrayList<androidx.fragment.app.a> r1 = r4.f1805d
            r3 = 0
            if (r1 == 0) goto L_0x001f
            int r1 = r1.size()
            goto L_0x0020
        L_0x001f:
            r1 = r3
        L_0x0020:
            if (r1 <= 0) goto L_0x002b
            androidx.fragment.app.Fragment r1 = r4.f1817r
            boolean r1 = r4.N(r1)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = r3
        L_0x002c:
            r0.f785a = r2
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.f0():void");
    }

    public final void g(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (K(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                h0 h0Var = this.f1804c;
                synchronized (((ArrayList) h0Var.f1911a)) {
                    ((ArrayList) h0Var.f1911a).remove(fragment);
                }
                fragment.mAdded = false;
                if (L(fragment)) {
                    this.z = true;
                }
                c0(fragment);
            }
        }
    }

    public final void h(Configuration configuration) {
        for (Fragment fragment : this.f1804c.h()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.f1814o < 1) {
            return false;
        }
        for (Fragment fragment : this.f1804c.h()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        this.A = false;
        this.B = false;
        this.H.f1877w = false;
        u(1);
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f1814o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f1804c.h()) {
            if (fragment != null && M(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f1806e != null) {
            for (int i10 = 0; i10 < this.f1806e.size(); i10++) {
                Fragment fragment2 = this.f1806e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f1806e = arrayList;
        return z10;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.activity.result.ActivityResultRegistry$b, androidx.activity.result.c<android.content.Intent>] */
    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.activity.result.ActivityResultRegistry$b, androidx.activity.result.c<androidx.activity.result.f>] */
    /* JADX WARNING: type inference failed for: r0v6, types: [androidx.activity.result.ActivityResultRegistry$b, androidx.activity.result.c<java.lang.String[]>] */
    public final void l() {
        boolean z10 = true;
        this.C = true;
        A(true);
        x();
        w<?> wVar = this.f1815p;
        if (wVar instanceof y0) {
            z10 = ((d0) this.f1804c.f1914d).f1876v;
        } else {
            Context context = wVar.f2010b;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z10) {
            for (c cVar : this.f1809j.values()) {
                for (String next : cVar.f1847a) {
                    d0 d0Var = (d0) this.f1804c.f1914d;
                    Objects.requireNonNull(d0Var);
                    if (K(3)) {
                        m.g("Clearing non-config state for saved state of Fragment ", next, "FragmentManager");
                    }
                    d0Var.k(next);
                }
            }
        }
        u(-1);
        this.f1815p = null;
        this.f1816q = null;
        this.f1817r = null;
        if (this.g != null) {
            Iterator<androidx.activity.a> it = this.f1808h.f786b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.g = null;
        }
        ? r02 = this.f1821v;
        if (r02 != 0) {
            r02.b();
            this.f1822w.b();
            this.f1823x.b();
        }
    }

    public final void m() {
        for (Fragment fragment : this.f1804c.h()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public final void n(boolean z10) {
        for (Fragment fragment : this.f1804c.h()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
            }
        }
    }

    public final void o() {
        Iterator it = ((ArrayList) this.f1804c.f()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f1814o < 1) {
            return false;
        }
        for (Fragment fragment : this.f1804c.h()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f1814o >= 1) {
            for (Fragment fragment : this.f1804c.h()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null && fragment.equals(D(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    public final void s(boolean z10) {
        for (Fragment fragment : this.f1804c.h()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z10 = false;
        if (this.f1814o < 1) {
            return false;
        }
        for (Fragment fragment : this.f1804c.h()) {
            if (fragment != null && M(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f1817r;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f1817r)));
            sb2.append("}");
        } else {
            w<?> wVar = this.f1815p;
            if (wVar != null) {
                sb2.append(wVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f1815p)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* JADX INFO: finally extract failed */
    public final void u(int i10) {
        try {
            this.f1803b = true;
            for (g0 g0Var : ((HashMap) this.f1804c.f1912b).values()) {
                if (g0Var != null) {
                    g0Var.f1904e = i10;
                }
            }
            P(i10, false);
            Iterator it = ((HashSet) e()).iterator();
            while (it.hasNext()) {
                ((r0) it.next()).e();
            }
            this.f1803b = false;
            A(true);
        } catch (Throwable th2) {
            this.f1803b = false;
            throw th2;
        }
    }

    public final void v() {
        if (this.D) {
            this.D = false;
            e0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String c10 = a8.a.c(str, "    ");
        h0 h0Var = this.f1804c;
        Objects.requireNonNull(h0Var);
        String str2 = str + "    ";
        if (!((HashMap) h0Var.f1912b).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (g0 g0Var : ((HashMap) h0Var.f1912b).values()) {
                printWriter.print(str);
                if (g0Var != null) {
                    Fragment fragment = g0Var.f1902c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = ((ArrayList) h0Var.f1911a).size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((Fragment) ((ArrayList) h0Var.f1911a).get(i10)).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f1806e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f1806e.get(i11).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f1805d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                a aVar = this.f1805d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.k(c10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f1802a) {
            int size4 = this.f1802a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println(this.f1802a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1815p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1816q);
        if (this.f1817r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1817r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1814o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.A);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.C);
        if (this.z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.z);
        }
    }

    public final void x() {
        Iterator it = ((HashSet) e()).iterator();
        while (it.hasNext()) {
            ((r0) it.next()).e();
        }
    }

    public final void y(k kVar, boolean z10) {
        if (!z10) {
            if (this.f1815p == null) {
                if (this.C) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (O()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1802a) {
            if (this.f1815p != null) {
                this.f1802a.add(kVar);
                Y();
            } else if (!z10) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void z(boolean z10) {
        if (this.f1803b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1815p == null) {
            if (this.C) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f1815p.f2011c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z10 && O()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.E == null) {
            this.E = new ArrayList<>();
            this.F = new ArrayList<>();
        }
    }

    public static class j implements Parcelable {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public String f1832a;

        /* renamed from: b  reason: collision with root package name */
        public int f1833b;

        public class a implements Parcelable.Creator<j> {
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel);
            }

            public final Object[] newArray(int i) {
                return new j[i];
            }
        }

        public j(String str, int i) {
            this.f1832a = str;
            this.f1833b = i;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1832a);
            parcel.writeInt(this.f1833b);
        }

        public j(Parcel parcel) {
            this.f1832a = parcel.readString();
            this.f1833b = parcel.readInt();
        }
    }
}
