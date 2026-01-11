package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.s0;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class b extends n.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final c A = new c();
    public int B;
    public int C;
    public View D;
    public View E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public i.a M;
    public ViewTreeObserver N;
    public PopupWindow.OnDismissListener O;
    public boolean P;

    /* renamed from: b  reason: collision with root package name */
    public final Context f889b;

    /* renamed from: c  reason: collision with root package name */
    public final int f890c;

    /* renamed from: s  reason: collision with root package name */
    public final int f891s;

    /* renamed from: t  reason: collision with root package name */
    public final int f892t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f893u;

    /* renamed from: v  reason: collision with root package name */
    public final Handler f894v;

    /* renamed from: w  reason: collision with root package name */
    public final List<e> f895w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    public final List<d> f896x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public final a f897y = new a();
    public final C0005b z = new C0005b();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r0v6, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r0v16, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        public final void onGlobalLayout() {
            if (b.this.b() && b.this.f896x.size() > 0 && !((d) b.this.f896x.get(0)).f905a.M) {
                View view = b.this.E;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                    return;
                }
                Iterator it = b.this.f896x.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f905a.d();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    public class C0005b implements View.OnAttachStateChangeListener {
        public C0005b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.N;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.N = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.N.removeGlobalOnLayoutListener(bVar.f897y);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements r0 {

        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f901a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ MenuItem f902b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ e f903c;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f901a = dVar;
                this.f902b = menuItem;
                this.f903c = eVar;
            }

            public final void run() {
                d dVar = this.f901a;
                if (dVar != null) {
                    b.this.P = true;
                    dVar.f906b.d(false);
                    b.this.P = false;
                }
                if (this.f902b.isEnabled() && this.f902b.hasSubMenu()) {
                    this.f903c.s(this.f902b, 4);
                }
            }
        }

        public c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.b$d} */
        /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r0v6, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r0v10, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(androidx.appcompat.view.menu.e r6, android.view.MenuItem r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                android.os.Handler r0 = r0.f894v
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f896x
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.b r4 = androidx.appcompat.view.menu.b.this
                java.util.List<androidx.appcompat.view.menu.b$d> r4 = r4.f896x
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.b.d) r4
                androidx.appcompat.view.menu.e r4 = r4.f906b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = r3
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f896x
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.b.this
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f896x
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.b.d) r1
            L_0x0041:
                androidx.appcompat.view.menu.b$c$a r0 = new androidx.appcompat.view.menu.b$c$a
                r0.<init>(r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.b r7 = androidx.appcompat.view.menu.b.this
                android.os.Handler r7 = r7.f894v
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.c.a(androidx.appcompat.view.menu.e, android.view.MenuItem):void");
        }

        public final void e(e eVar, MenuItem menuItem) {
            b.this.f894v.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final s0 f905a;

        /* renamed from: b  reason: collision with root package name */
        public final e f906b;

        /* renamed from: c  reason: collision with root package name */
        public final int f907c;

        public d(s0 s0Var, e eVar, int i) {
            this.f905a = s0Var;
            this.f906b = eVar;
            this.f907c = i;
        }
    }

    public b(Context context, View view, int i, int i10, boolean z10) {
        int i11 = 0;
        this.B = 0;
        this.C = 0;
        this.f889b = context;
        this.D = view;
        this.f891s = i;
        this.f892t = i10;
        this.f893u = z10;
        this.K = false;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        this.F = x.e.d(view) != 1 ? 1 : i11;
        Resources resources = context.getResources();
        this.f890c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f894v = new Handler();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    public final void a(e eVar, boolean z10) {
        int size = this.f896x.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (eVar == ((d) this.f896x.get(i)).f906b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i10 = i + 1;
            if (i10 < this.f896x.size()) {
                ((d) this.f896x.get(i10)).f906b.d(false);
            }
            d dVar = (d) this.f896x.remove(i);
            dVar.f906b.v(this);
            if (this.P) {
                dVar.f905a.N.setExitTransition((Transition) null);
                dVar.f905a.N.setAnimationStyle(0);
            }
            dVar.f905a.dismiss();
            int size2 = this.f896x.size();
            if (size2 > 0) {
                this.F = ((d) this.f896x.get(size2 - 1)).f907c;
            } else {
                View view = this.D;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                this.F = x.e.d(view) == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                i.a aVar = this.M;
                if (aVar != null) {
                    aVar.a(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.N;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.N.removeGlobalOnLayoutListener(this.f897y);
                    }
                    this.N = null;
                }
                this.E.removeOnAttachStateChangeListener(this.z);
                this.O.onDismiss();
            } else if (z10) {
                ((d) this.f896x.get(0)).f906b.d(false);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    public final boolean b() {
        return this.f896x.size() > 0 && ((d) this.f896x.get(0)).f905a.b();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<androidx.appcompat.view.menu.e>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<androidx.appcompat.view.menu.e>, java.util.ArrayList] */
    public final void d() {
        if (!b()) {
            Iterator it = this.f895w.iterator();
            while (it.hasNext()) {
                v((e) it.next());
            }
            this.f895w.clear();
            View view = this.D;
            this.E = view;
            if (view != null) {
                boolean z10 = this.N == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.N = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f897y);
                }
                this.E.addOnAttachStateChangeListener(this.z);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    public final void dismiss() {
        int size = this.f896x.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f896x.toArray(new d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    d dVar = dVarArr[size];
                    if (dVar.f905a.b()) {
                        dVar.f905a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    public final void f() {
        Iterator it = this.f896x.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f905a.f1371c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((d) adapter).notifyDataSetChanged();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    public final ListView g() {
        if (this.f896x.isEmpty()) {
            return null;
        }
        ? r02 = this.f896x;
        return ((d) r02.get(r02.size() - 1)).f905a.f1371c;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    public final boolean h(l lVar) {
        Iterator it = this.f896x.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (lVar == dVar.f906b) {
                dVar.f905a.f1371c.requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l(lVar);
        i.a aVar = this.M;
        if (aVar != null) {
            aVar.b(lVar);
        }
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final void j(i.a aVar) {
        this.M = aVar;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<androidx.appcompat.view.menu.e>, java.util.ArrayList] */
    public final void l(e eVar) {
        eVar.c(this, this.f889b);
        if (b()) {
            v(eVar);
        } else {
            this.f895w.add(eVar);
        }
    }

    public final void n(View view) {
        if (this.D != view) {
            this.D = view;
            int i = this.B;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            this.C = Gravity.getAbsoluteGravity(i, x.e.d(view));
        }
    }

    public final void o(boolean z10) {
        this.K = z10;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    public final void onDismiss() {
        d dVar;
        int size = this.f896x.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f896x.get(i);
            if (!dVar.f905a.b()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f906b.d(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i) {
        if (this.B != i) {
            this.B = i;
            View view = this.D;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            this.C = Gravity.getAbsoluteGravity(i, x.e.d(view));
        }
    }

    public final void q(int i) {
        this.G = true;
        this.I = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.O = onDismissListener;
    }

    public final void s(boolean z10) {
        this.L = z10;
    }

    public final void t(int i) {
        this.H = true;
        this.J = i;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v12, types: [java.util.List<androidx.appcompat.view.menu.b$d>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011d, code lost:
        if (((r9.getWidth() + r11[0]) + r4) > r12.right) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0124, code lost:
        if ((r11[0] - r4) < 0) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0128, code lost:
        r9 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(androidx.appcompat.view.menu.e r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f889b
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.d r3 = new androidx.appcompat.view.menu.d
            boolean r4 = r0.f893u
            r5 = 2131427339(0x7f0b000b, float:1.8476291E38)
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.b()
            r5 = 1
            if (r4 != 0) goto L_0x0022
            boolean r4 = r0.K
            if (r4 == 0) goto L_0x0022
            r3.f918c = r5
            goto L_0x002e
        L_0x0022:
            boolean r4 = r16.b()
            if (r4 == 0) goto L_0x002e
            boolean r4 = n.d.u(r17)
            r3.f918c = r4
        L_0x002e:
            android.content.Context r4 = r0.f889b
            int r6 = r0.f890c
            r7 = 0
            int r4 = n.d.m(r3, r4, r6)
            androidx.appcompat.widget.s0 r6 = new androidx.appcompat.widget.s0
            android.content.Context r8 = r0.f889b
            int r9 = r0.f891s
            int r10 = r0.f892t
            r6.<init>(r8, r9, r10)
            androidx.appcompat.view.menu.b$c r8 = r0.A
            r6.R = r8
            r6.E = r0
            r6.u(r0)
            android.view.View r8 = r0.D
            r6.D = r8
            int r8 = r0.C
            r6.A = r8
            r6.t()
            r6.s()
            r6.p(r3)
            r6.r(r4)
            int r3 = r0.C
            r6.A = r3
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f896x
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x00e1
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f896x
            int r9 = r3.size()
            int r9 = r9 - r5
            java.lang.Object r3 = r3.get(r9)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.b.d) r3
            androidx.appcompat.view.menu.e r9 = r3.f906b
            int r10 = r9.size()
            r11 = 0
        L_0x007f:
            if (r11 >= r10) goto L_0x0095
            android.view.MenuItem r12 = r9.getItem(r11)
            boolean r13 = r12.hasSubMenu()
            if (r13 == 0) goto L_0x0092
            android.view.SubMenu r13 = r12.getSubMenu()
            if (r1 != r13) goto L_0x0092
            goto L_0x0096
        L_0x0092:
            int r11 = r11 + 1
            goto L_0x007f
        L_0x0095:
            r12 = r7
        L_0x0096:
            if (r12 != 0) goto L_0x0099
            goto L_0x00df
        L_0x0099:
            androidx.appcompat.widget.s0 r9 = r3.f905a
            androidx.appcompat.widget.l0 r9 = r9.f1371c
            android.widget.ListAdapter r10 = r9.getAdapter()
            boolean r11 = r10 instanceof android.widget.HeaderViewListAdapter
            if (r11 == 0) goto L_0x00b2
            android.widget.HeaderViewListAdapter r10 = (android.widget.HeaderViewListAdapter) r10
            int r11 = r10.getHeadersCount()
            android.widget.ListAdapter r10 = r10.getWrappedAdapter()
            androidx.appcompat.view.menu.d r10 = (androidx.appcompat.view.menu.d) r10
            goto L_0x00b5
        L_0x00b2:
            androidx.appcompat.view.menu.d r10 = (androidx.appcompat.view.menu.d) r10
            r11 = 0
        L_0x00b5:
            int r13 = r10.getCount()
            r14 = 0
        L_0x00ba:
            r15 = -1
            if (r14 >= r13) goto L_0x00c7
            androidx.appcompat.view.menu.g r8 = r10.getItem(r14)
            if (r12 != r8) goto L_0x00c4
            goto L_0x00c8
        L_0x00c4:
            int r14 = r14 + 1
            goto L_0x00ba
        L_0x00c7:
            r14 = r15
        L_0x00c8:
            if (r14 != r15) goto L_0x00cb
            goto L_0x00df
        L_0x00cb:
            int r14 = r14 + r11
            int r8 = r9.getFirstVisiblePosition()
            int r14 = r14 - r8
            if (r14 < 0) goto L_0x00df
            int r8 = r9.getChildCount()
            if (r14 < r8) goto L_0x00da
            goto L_0x00df
        L_0x00da:
            android.view.View r8 = r9.getChildAt(r14)
            goto L_0x00e3
        L_0x00df:
            r8 = r7
            goto L_0x00e3
        L_0x00e1:
            r3 = r7
            r8 = r3
        L_0x00e3:
            if (r8 == 0) goto L_0x0192
            r6.v()
            androidx.appcompat.widget.t r9 = r6.N
            r9.setEnterTransition(r7)
            java.util.List<androidx.appcompat.view.menu.b$d> r9 = r0.f896x
            int r10 = r9.size()
            int r10 = r10 - r5
            java.lang.Object r9 = r9.get(r10)
            androidx.appcompat.view.menu.b$d r9 = (androidx.appcompat.view.menu.b.d) r9
            androidx.appcompat.widget.s0 r9 = r9.f905a
            androidx.appcompat.widget.l0 r9 = r9.f1371c
            r10 = 2
            int[] r11 = new int[r10]
            r9.getLocationOnScreen(r11)
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            android.view.View r13 = r0.E
            r13.getWindowVisibleDisplayFrame(r12)
            int r13 = r0.F
            if (r13 != r5) goto L_0x0120
            r13 = 0
            r11 = r11[r13]
            int r9 = r9.getWidth()
            int r9 = r9 + r11
            int r9 = r9 + r4
            int r11 = r12.right
            if (r9 <= r11) goto L_0x0126
            goto L_0x0128
        L_0x0120:
            r13 = 0
            r9 = r11[r13]
            int r9 = r9 - r4
            if (r9 >= 0) goto L_0x0128
        L_0x0126:
            r9 = r5
            goto L_0x0129
        L_0x0128:
            r9 = 0
        L_0x0129:
            if (r9 != r5) goto L_0x012d
            r13 = r5
            goto L_0x012e
        L_0x012d:
            r13 = 0
        L_0x012e:
            r0.F = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r12 = 5
            if (r9 < r11) goto L_0x013c
            r6.D = r8
            r9 = 0
            r11 = 0
            goto L_0x0171
        L_0x013c:
            int[] r9 = new int[r10]
            android.view.View r11 = r0.D
            r11.getLocationOnScreen(r9)
            int[] r10 = new int[r10]
            r8.getLocationOnScreen(r10)
            int r11 = r0.C
            r11 = r11 & 7
            if (r11 != r12) goto L_0x0164
            r11 = 0
            r14 = r9[r11]
            android.view.View r15 = r0.D
            int r15 = r15.getWidth()
            int r15 = r15 + r14
            r9[r11] = r15
            r14 = r10[r11]
            int r15 = r8.getWidth()
            int r15 = r15 + r14
            r10[r11] = r15
            goto L_0x0165
        L_0x0164:
            r11 = 0
        L_0x0165:
            r14 = r10[r11]
            r15 = r9[r11]
            int r11 = r14 - r15
            r10 = r10[r5]
            r9 = r9[r5]
            int r9 = r10 - r9
        L_0x0171:
            int r10 = r0.C
            r10 = r10 & r12
            if (r10 != r12) goto L_0x017f
            if (r13 == 0) goto L_0x017a
            int r11 = r11 + r4
            goto L_0x0188
        L_0x017a:
            int r4 = r8.getWidth()
            goto L_0x0187
        L_0x017f:
            if (r13 == 0) goto L_0x0187
            int r4 = r8.getWidth()
            int r11 = r11 + r4
            goto L_0x0188
        L_0x0187:
            int r11 = r11 - r4
        L_0x0188:
            r6.f1374u = r11
            r6.z = r5
            r6.f1378y = r5
            r6.j(r9)
            goto L_0x01b0
        L_0x0192:
            boolean r4 = r0.G
            if (r4 == 0) goto L_0x019a
            int r4 = r0.I
            r6.f1374u = r4
        L_0x019a:
            boolean r4 = r0.H
            if (r4 == 0) goto L_0x01a3
            int r4 = r0.J
            r6.j(r4)
        L_0x01a3:
            android.graphics.Rect r4 = r0.f8767a
            if (r4 == 0) goto L_0x01ad
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L_0x01ae
        L_0x01ad:
            r5 = r7
        L_0x01ae:
            r6.L = r5
        L_0x01b0:
            androidx.appcompat.view.menu.b$d r4 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.F
            r4.<init>(r6, r1, r5)
            java.util.List<androidx.appcompat.view.menu.b$d> r5 = r0.f896x
            r5.add(r4)
            r6.d()
            androidx.appcompat.widget.l0 r4 = r6.f1371c
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x01ef
            boolean r3 = r0.L
            if (r3 == 0) goto L_0x01ef
            java.lang.CharSequence r3 = r1.f933m
            if (r3 == 0) goto L_0x01ef
            r3 = 2131427346(0x7f0b0012, float:1.8476306E38)
            r5 = 0
            android.view.View r2 = r2.inflate(r3, r4, r5)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r5)
            java.lang.CharSequence r1 = r1.f933m
            r3.setText(r1)
            r4.addHeaderView(r2, r7, r5)
            r6.d()
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.v(androidx.appcompat.view.menu.e):void");
    }
}
