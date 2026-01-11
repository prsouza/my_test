package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.s0;
import io.nodle.cash.R;
import java.util.Objects;
import n.d;

public final class k extends d implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public PopupWindow.OnDismissListener A;
    public View B;
    public View C;
    public i.a D;
    public ViewTreeObserver E;
    public boolean F;
    public boolean G;
    public int H;
    public int I = 0;
    public boolean J;

    /* renamed from: b  reason: collision with root package name */
    public final Context f983b;

    /* renamed from: c  reason: collision with root package name */
    public final e f984c;

    /* renamed from: s  reason: collision with root package name */
    public final d f985s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f986t;

    /* renamed from: u  reason: collision with root package name */
    public final int f987u;

    /* renamed from: v  reason: collision with root package name */
    public final int f988v;

    /* renamed from: w  reason: collision with root package name */
    public final int f989w;

    /* renamed from: x  reason: collision with root package name */
    public final s0 f990x;

    /* renamed from: y  reason: collision with root package name */
    public final a f991y = new a();
    public final b z = new b();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            if (k.this.b()) {
                k kVar = k.this;
                if (!kVar.f990x.M) {
                    View view = kVar.C;
                    if (view == null || !view.isShown()) {
                        k.this.dismiss();
                    } else {
                        k.this.f990x.d();
                    }
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.E;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.E = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.E.removeGlobalOnLayoutListener(kVar.f991y);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i, int i10, boolean z10) {
        this.f983b = context;
        this.f984c = eVar;
        this.f986t = z10;
        this.f985s = new d(eVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f988v = i;
        this.f989w = i10;
        Resources resources = context.getResources();
        this.f987u = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.B = view;
        this.f990x = new s0(context, i, i10);
        eVar.c(this, context);
    }

    public final void a(e eVar, boolean z10) {
        if (eVar == this.f984c) {
            dismiss();
            i.a aVar = this.D;
            if (aVar != null) {
                aVar.a(eVar, z10);
            }
        }
    }

    public final boolean b() {
        return !this.F && this.f990x.b();
    }

    public final void d() {
        View view;
        boolean z10 = true;
        if (!b()) {
            if (this.F || (view = this.B) == null) {
                z10 = false;
            } else {
                this.C = view;
                this.f990x.u(this);
                s0 s0Var = this.f990x;
                s0Var.E = this;
                s0Var.t();
                View view2 = this.C;
                boolean z11 = this.E == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.E = viewTreeObserver;
                if (z11) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f991y);
                }
                view2.addOnAttachStateChangeListener(this.z);
                s0 s0Var2 = this.f990x;
                s0Var2.D = view2;
                s0Var2.A = this.I;
                if (!this.G) {
                    this.H = d.m(this.f985s, this.f983b, this.f987u);
                    this.G = true;
                }
                this.f990x.r(this.H);
                this.f990x.s();
                s0 s0Var3 = this.f990x;
                Rect rect = this.f8767a;
                Objects.requireNonNull(s0Var3);
                s0Var3.L = rect != null ? new Rect(rect) : null;
                this.f990x.d();
                l0 l0Var = this.f990x.f1371c;
                l0Var.setOnKeyListener(this);
                if (this.J && this.f984c.f933m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f983b).inflate(R.layout.abc_popup_menu_header_item_layout, l0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f984c.f933m);
                    }
                    frameLayout.setEnabled(false);
                    l0Var.addHeaderView(frameLayout, (Object) null, false);
                }
                this.f990x.p(this.f985s);
                this.f990x.d();
            }
        }
        if (!z10) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void dismiss() {
        if (b()) {
            this.f990x.dismiss();
        }
    }

    public final void f() {
        this.G = false;
        d dVar = this.f985s;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public final ListView g() {
        return this.f990x.f1371c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(androidx.appcompat.view.menu.l r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0079
            androidx.appcompat.view.menu.h r0 = new androidx.appcompat.view.menu.h
            android.content.Context r3 = r9.f983b
            android.view.View r5 = r9.C
            boolean r6 = r9.f986t
            int r7 = r9.f988v
            int r8 = r9.f989w
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.i$a r2 = r9.D
            r0.d(r2)
            boolean r2 = n.d.u(r10)
            r0.f978h = r2
            n.d r3 = r0.f979j
            if (r3 == 0) goto L_0x002a
            r3.o(r2)
        L_0x002a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.A
            r0.f980k = r2
            r2 = 0
            r9.A = r2
            androidx.appcompat.view.menu.e r2 = r9.f984c
            r2.d(r1)
            androidx.appcompat.widget.s0 r2 = r9.f990x
            int r3 = r2.f1374u
            boolean r4 = r2.f1377x
            if (r4 != 0) goto L_0x0040
            r2 = r1
            goto L_0x0042
        L_0x0040:
            int r2 = r2.f1375v
        L_0x0042:
            int r4 = r9.I
            android.view.View r5 = r9.B
            java.util.WeakHashMap<android.view.View, n0.a0> r6 = n0.x.f8842a
            int r5 = n0.x.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005c
            android.view.View r4 = r9.B
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0065
        L_0x0063:
            r0 = r5
            goto L_0x006f
        L_0x0065:
            android.view.View r4 = r0.f977f
            if (r4 != 0) goto L_0x006b
            r0 = r1
            goto L_0x006f
        L_0x006b:
            r0.e(r3, r2, r5, r5)
            goto L_0x0063
        L_0x006f:
            if (r0 == 0) goto L_0x0079
            androidx.appcompat.view.menu.i$a r0 = r9.D
            if (r0 == 0) goto L_0x0078
            r0.b(r10)
        L_0x0078:
            return r5
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k.h(androidx.appcompat.view.menu.l):boolean");
    }

    public final boolean i() {
        return false;
    }

    public final void j(i.a aVar) {
        this.D = aVar;
    }

    public final void l(e eVar) {
    }

    public final void n(View view) {
        this.B = view;
    }

    public final void o(boolean z10) {
        this.f985s.f918c = z10;
    }

    public final void onDismiss() {
        this.F = true;
        this.f984c.d(true);
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.E = this.C.getViewTreeObserver();
            }
            this.E.removeGlobalOnLayoutListener(this.f991y);
            this.E = null;
        }
        this.C.removeOnAttachStateChangeListener(this.z);
        PopupWindow.OnDismissListener onDismissListener = this.A;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.I = i;
    }

    public final void q(int i) {
        this.f990x.f1374u = i;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    public final void s(boolean z10) {
        this.J = z10;
    }

    public final void t(int i) {
        this.f990x.j(i);
    }
}
