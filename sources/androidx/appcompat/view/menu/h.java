package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import java.util.WeakHashMap;
import n.d;
import n0.a0;
import n0.x;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f972a;

    /* renamed from: b  reason: collision with root package name */
    public final e f973b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f974c;

    /* renamed from: d  reason: collision with root package name */
    public final int f975d;

    /* renamed from: e  reason: collision with root package name */
    public final int f976e;

    /* renamed from: f  reason: collision with root package name */
    public View f977f;
    public int g = 8388611;

    /* renamed from: h  reason: collision with root package name */
    public boolean f978h;
    public i.a i;

    /* renamed from: j  reason: collision with root package name */
    public d f979j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f980k;

    /* renamed from: l  reason: collision with root package name */
    public final a f981l = new a();

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public final void onDismiss() {
            h.this.c();
        }
    }

    public h(Context context, e eVar, View view, boolean z, int i10, int i11) {
        this.f972a = context;
        this.f973b = eVar;
        this.f977f = view;
        this.f974c = z;
        this.f975d = i10;
        this.f976e = i11;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [androidx.appcompat.view.menu.i, n.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n.d a() {
        /*
            r14 = this;
            n.d r0 = r14.f979j
            if (r0 != 0) goto L_0x0079
            android.content.Context r0 = r14.f972a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f972a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099670(0x7f060016, float:1.78117E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0047
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f972a
            android.view.View r3 = r14.f977f
            int r4 = r14.f975d
            int r5 = r14.f976e
            boolean r6 = r14.f974c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0059
        L_0x0047:
            androidx.appcompat.view.menu.k r0 = new androidx.appcompat.view.menu.k
            android.content.Context r8 = r14.f972a
            androidx.appcompat.view.menu.e r9 = r14.f973b
            android.view.View r10 = r14.f977f
            int r11 = r14.f975d
            int r12 = r14.f976e
            boolean r13 = r14.f974c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0059:
            androidx.appcompat.view.menu.e r1 = r14.f973b
            r0.l(r1)
            androidx.appcompat.view.menu.h$a r1 = r14.f981l
            r0.r(r1)
            android.view.View r1 = r14.f977f
            r0.n(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.i
            r0.j(r1)
            boolean r1 = r14.f978h
            r0.o(r1)
            int r1 = r14.g
            r0.p(r1)
            r14.f979j = r0
        L_0x0079:
            n.d r0 = r14.f979j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h.a():n.d");
    }

    public final boolean b() {
        d dVar = this.f979j;
        return dVar != null && dVar.b();
    }

    public void c() {
        this.f979j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f980k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(i.a aVar) {
        this.i = aVar;
        d dVar = this.f979j;
        if (dVar != null) {
            dVar.j(aVar);
        }
    }

    public final void e(int i10, int i11, boolean z, boolean z10) {
        d a10 = a();
        a10.s(z10);
        if (z) {
            int i12 = this.g;
            View view = this.f977f;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            if ((Gravity.getAbsoluteGravity(i12, x.e.d(view)) & 7) == 5) {
                i10 -= this.f977f.getWidth();
            }
            a10.q(i10);
            a10.t(i11);
            int i13 = (int) ((this.f972a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f8767a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.d();
    }
}
