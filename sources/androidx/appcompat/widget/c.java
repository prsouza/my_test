package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.Objects;

public final class c extends androidx.appcompat.view.menu.a {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public final SparseBooleanArray G = new SparseBooleanArray();
    public e H;
    public a I;
    public C0007c J;
    public b K;
    public final f L = new f();

    /* renamed from: x  reason: collision with root package name */
    public d f1179x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f1180y;
    public boolean z;

    public class a extends h {
        public a(Context context, l lVar, View view) {
            super(context, lVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!lVar.A.g()) {
                View view2 = c.this.f1179x;
                this.f977f = view2 == null ? (View) c.this.f888w : view2;
            }
            d(c.this.L);
        }

        public final void c() {
            c.this.I = null;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    public class C0007c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public e f1183a;

        public C0007c(e eVar) {
            this.f1183a = eVar;
        }

        public final void run() {
            e.a aVar;
            androidx.appcompat.view.menu.e eVar = c.this.f883c;
            if (!(eVar == null || (aVar = eVar.f927e) == null)) {
                aVar.b(eVar);
            }
            View view = (View) c.this.f888w;
            if (!(view == null || view.getWindowToken() == null)) {
                e eVar2 = this.f1183a;
                boolean z = true;
                if (!eVar2.b()) {
                    if (eVar2.f977f == null) {
                        z = false;
                    } else {
                        eVar2.e(0, 0, false, false);
                    }
                }
                if (z) {
                    c.this.H = this.f1183a;
                }
            }
            c.this.J = null;
        }
    }

    public class d extends r implements ActionMenuView.a {

        public class a extends n0 {
            public a(View view) {
                super(view);
            }

            public final n.f b() {
                e eVar = c.this.H;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public final boolean c() {
                c.this.m();
                return true;
            }

            public final boolean d() {
                c cVar = c.this;
                if (cVar.J != null) {
                    return false;
                }
                cVar.g();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            g1.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return false;
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.m();
            return true;
        }

        public final boolean setFrame(int i, int i10, int i11, int i12) {
            boolean frame = super.setFrame(i, i10, i11, i12);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view) {
            super(context, eVar, view, true, R.attr.actionOverflowMenuStyle, 0);
            this.g = 8388613;
            d(c.this.L);
        }

        public final void c() {
            androidx.appcompat.view.menu.e eVar = c.this.f883c;
            if (eVar != null) {
                eVar.d(true);
            }
            c.this.H = null;
            super.c();
        }
    }

    public class f implements i.a {
        public f() {
        }

        public final void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (eVar instanceof l) {
                eVar.l().d(false);
            }
            i.a aVar = c.this.f885t;
            if (aVar != null) {
                aVar.a(eVar, z);
            }
        }

        public final boolean b(androidx.appcompat.view.menu.e eVar) {
            c cVar = c.this;
            if (eVar == cVar.f883c) {
                return false;
            }
            Objects.requireNonNull(((l) eVar).A);
            Objects.requireNonNull(cVar);
            i.a aVar = c.this.f885t;
            if (aVar != null) {
                return aVar.b(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context);
    }

    public final void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        b();
        i.a aVar = this.f885t;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    public final boolean b() {
        boolean z10;
        boolean g = g();
        a aVar = this.I;
        if (aVar != null) {
            if (aVar.b()) {
                aVar.f979j.dismiss();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return g | z10;
    }

    public final View d(g gVar, View view, ViewGroup viewGroup) {
        j.a aVar;
        View actionView = gVar.getActionView();
        int i = 0;
        if (actionView == null || gVar.f()) {
            if (view instanceof j.a) {
                aVar = (j.a) view;
            } else {
                aVar = (j.a) this.f884s.inflate(this.f887v, viewGroup, false);
            }
            aVar.d(gVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f888w);
            if (this.K == null) {
                this.K = new b();
            }
            actionMenuItemView.setPopupCallback(this.K);
            actionView = (View) aVar;
        }
        if (gVar.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public final void e(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f882b = context;
        LayoutInflater.from(context);
        this.f883c = eVar;
        Resources resources = context.getResources();
        if (!this.B) {
            this.A = true;
        }
        int i = 2;
        this.C = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i = 4;
        } else if (i10 >= 360) {
            i = 3;
        }
        this.E = i;
        int i12 = this.C;
        if (this.A) {
            if (this.f1179x == null) {
                d dVar = new d(this.f881a);
                this.f1179x = dVar;
                if (this.z) {
                    dVar.setImageDrawable(this.f1180y);
                    this.f1180y = null;
                    this.z = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1179x.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.f1179x.getMeasuredWidth();
        } else {
            this.f1179x = null;
        }
        this.D = i12;
        float f10 = resources.getDisplayMetrics().density;
    }

    public final void f() {
        j jVar;
        int i;
        boolean z10;
        ViewGroup viewGroup = (ViewGroup) this.f888w;
        ArrayList<g> arrayList = null;
        boolean z11 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.e eVar = this.f883c;
            if (eVar != null) {
                eVar.j();
                ArrayList<g> m10 = this.f883c.m();
                int size = m10.size();
                i = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = m10.get(i10);
                    if (gVar.g()) {
                        View childAt = viewGroup.getChildAt(i);
                        g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                        View d10 = d(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            d10.setPressed(false);
                            d10.jumpDrawablesToCurrentState();
                        }
                        if (d10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) d10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(d10);
                            }
                            ((ViewGroup) this.f888w).addView(d10, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f1179x) {
                    z10 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z10 = true;
                }
                if (!z10) {
                    i++;
                }
            }
        }
        ((View) this.f888w).requestLayout();
        androidx.appcompat.view.menu.e eVar2 = this.f883c;
        if (eVar2 != null) {
            eVar2.j();
            ArrayList<g> arrayList2 = eVar2.i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                n0.b bVar = arrayList2.get(i11).A;
            }
        }
        androidx.appcompat.view.menu.e eVar3 = this.f883c;
        if (eVar3 != null) {
            eVar3.j();
            arrayList = eVar3.f930j;
        }
        if (this.A && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z11 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1179x == null) {
                this.f1179x = new d(this.f881a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1179x.getParent();
            if (viewGroup3 != this.f888w) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1179x);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f888w;
                d dVar = this.f1179x;
                ActionMenuView.c l10 = actionMenuView.h();
                l10.f1020a = true;
                actionMenuView.addView(dVar, l10);
            }
        } else {
            d dVar2 = this.f1179x;
            if (dVar2 != null && dVar2.getParent() == (jVar = this.f888w)) {
                ((ViewGroup) jVar).removeView(this.f1179x);
            }
        }
        ((ActionMenuView) this.f888w).setOverflowReserved(this.A);
    }

    public final boolean g() {
        j jVar;
        C0007c cVar = this.J;
        if (cVar == null || (jVar = this.f888w) == null) {
            e eVar = this.H;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.f979j.dismiss();
            }
            return true;
        }
        ((View) jVar).removeCallbacks(cVar);
        this.J = null;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(androidx.appcompat.view.menu.l r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r9
        L_0x0009:
            androidx.appcompat.view.menu.e r2 = r0.z
            androidx.appcompat.view.menu.e r3 = r8.f883c
            if (r2 == r3) goto L_0x0013
            r0 = r2
            androidx.appcompat.view.menu.l r0 = (androidx.appcompat.view.menu.l) r0
            goto L_0x0009
        L_0x0013:
            androidx.appcompat.view.menu.g r0 = r0.A
            androidx.appcompat.view.menu.j r2 = r8.f888w
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L_0x001d
            goto L_0x003a
        L_0x001d:
            int r4 = r2.getChildCount()
            r5 = r1
        L_0x0022:
            if (r5 >= r4) goto L_0x003a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.j.a
            if (r7 == 0) goto L_0x0037
            r7 = r6
            androidx.appcompat.view.menu.j$a r7 = (androidx.appcompat.view.menu.j.a) r7
            androidx.appcompat.view.menu.g r7 = r7.getItemData()
            if (r7 != r0) goto L_0x0037
            r3 = r6
            goto L_0x003a
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x003a:
            if (r3 != 0) goto L_0x003d
            return r1
        L_0x003d:
            androidx.appcompat.view.menu.g r0 = r9.A
            java.util.Objects.requireNonNull(r0)
            int r0 = r9.size()
            r2 = r1
        L_0x0047:
            r4 = 1
            if (r2 >= r0) goto L_0x005f
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L_0x005c
            r0 = r4
            goto L_0x0060
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x0047
        L_0x005f:
            r0 = r1
        L_0x0060:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r5 = r8.f882b
            r2.<init>(r5, r9, r3)
            r8.I = r2
            r2.f978h = r0
            n.d r2 = r2.f979j
            if (r2 == 0) goto L_0x0072
            r2.o(r0)
        L_0x0072:
            androidx.appcompat.widget.c$a r0 = r8.I
            boolean r2 = r0.b()
            if (r2 == 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            android.view.View r2 = r0.f977f
            if (r2 != 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            r0.e(r1, r1, r1, r1)
        L_0x0083:
            r1 = r4
        L_0x0084:
            if (r1 == 0) goto L_0x008e
            androidx.appcompat.view.menu.i$a r0 = r8.f885t
            if (r0 == 0) goto L_0x008d
            r0.b(r9)
        L_0x008d:
            return r4
        L_0x008e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.h(androidx.appcompat.view.menu.l):boolean");
    }

    public final boolean i() {
        int i;
        ArrayList<g> arrayList;
        int i10;
        boolean z10;
        androidx.appcompat.view.menu.e eVar = this.f883c;
        if (eVar != null) {
            arrayList = eVar.m();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i11 = this.E;
        int i12 = this.D;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f888w;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= i) {
                break;
            }
            g gVar = arrayList.get(i13);
            int i16 = gVar.f970y;
            if ((i16 & 2) == 2) {
                i14++;
            } else {
                if ((i16 & 1) == 1) {
                    i15++;
                } else {
                    z11 = true;
                }
            }
            if (this.F && gVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (this.A && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = this.G;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i) {
            g gVar2 = arrayList.get(i18);
            int i20 = gVar2.f970y;
            if ((i20 & 2) == i10 ? z10 : false) {
                View d10 = d(gVar2, (View) null, viewGroup);
                d10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = d10.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int i21 = gVar2.f949b;
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                gVar2.k(z10);
            } else {
                if ((i20 & true) == z10 ? z10 : false) {
                    int i22 = gVar2.f949b;
                    boolean z12 = sparseBooleanArray.get(i22);
                    boolean z13 = ((i17 > 0 || z12) && i12 > 0) ? z10 : false;
                    if (z13) {
                        View d11 = d(gVar2, (View) null, viewGroup);
                        d11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = d11.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z13 &= i12 + i19 > 0;
                    }
                    if (z13 && i22 != 0) {
                        sparseBooleanArray.put(i22, true);
                    } else if (z12) {
                        sparseBooleanArray.put(i22, false);
                        for (int i23 = 0; i23 < i18; i23++) {
                            g gVar3 = arrayList.get(i23);
                            if (gVar3.f949b == i22) {
                                if (gVar3.g()) {
                                    i17++;
                                }
                                gVar3.k(false);
                            }
                        }
                    }
                    if (z13) {
                        i17--;
                    }
                    gVar2.k(z13);
                } else {
                    gVar2.k(false);
                    i18++;
                    i10 = 2;
                    z10 = true;
                }
            }
            i18++;
            i10 = 2;
            z10 = true;
        }
        return z10;
    }

    public final boolean l() {
        e eVar = this.H;
        return eVar != null && eVar.b();
    }

    public final boolean m() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.A || l() || (eVar = this.f883c) == null || this.f888w == null || this.J != null) {
            return false;
        }
        eVar.j();
        if (eVar.f930j.isEmpty()) {
            return false;
        }
        C0007c cVar = new C0007c(new e(this.f882b, this.f883c, this.f1179x));
        this.J = cVar;
        ((View) this.f888w).post(cVar);
        return true;
    }
}
