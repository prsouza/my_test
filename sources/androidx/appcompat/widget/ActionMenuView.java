package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.o0;
import com.google.android.gms.common.api.Api;
import java.util.Iterator;
import n0.h;
import net.jpountz.lz4.LZ4FrameOutputStream;

public class ActionMenuView extends o0 implements e.b, j {
    public androidx.appcompat.view.menu.e E;
    public Context F;
    public int G = 0;
    public boolean H;
    public c I;
    public i.a J;
    public e.a K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public e P;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements i.a {
        public final void a(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        public final boolean b(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends o0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f1020a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f1021b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f1022c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f1023d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f1024e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1025f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1020a = cVar.f1020a;
        }

        public c() {
            super(-2, -2);
            this.f1020a = false;
        }
    }

    public class d implements e.a {
        public d() {
        }

        public final boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            boolean z;
            boolean z10;
            e eVar2 = ActionMenuView.this.P;
            if (eVar2 != null) {
                Toolbar.a aVar = (Toolbar.a) eVar2;
                Iterator<h> it = Toolbar.this.V.f8825a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().a()) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    z10 = true;
                } else {
                    Toolbar.f fVar = Toolbar.this.f1111a0;
                    z10 = fVar != null ? fVar.a() : false;
                }
                if (z10) {
                    return true;
                }
            }
            return false;
        }

        public final void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.K;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.N = (int) (56.0f * f10);
        this.O = (int) (f10 * 4.0f);
        this.F = context;
    }

    public static int o(View view, int i, int i10, int i11, int i12) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) - i12, View.MeasureSpec.getMode(i11));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z10 = actionMenuItemView != null && actionMenuItemView.c();
        int i13 = 2;
        if (i10 <= 0 || (z10 && i10 < 2)) {
            i13 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i14 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i14++;
            }
            if (!z10 || i14 >= 2) {
                i13 = i14;
            }
        }
        if (!cVar.f1020a && z10) {
            z = true;
        }
        cVar.f1023d = z;
        cVar.f1021b = i13;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i13, 1073741824), makeMeasureSpec);
        return i13;
    }

    public final boolean a(g gVar) {
        return this.E.t(gVar, (i) null, 0);
    }

    public final void b(androidx.appcompat.view.menu.e eVar) {
        this.E = eVar;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.E == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.E = eVar;
            eVar.y(new d());
            c cVar = new c(context);
            this.I = cVar;
            cVar.A = true;
            cVar.B = true;
            i.a aVar = this.J;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f885t = aVar;
            this.E.c(cVar, this.F);
            c cVar2 = this.I;
            cVar2.f888w = this;
            this.E = cVar2.f883c;
        }
        return this.E;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        c cVar = this.I;
        c.d dVar = cVar.f1179x;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.z) {
            return cVar.f1180y;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.G;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final o0.a i(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: l */
    public final c h() {
        c cVar = new c();
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: m */
    public final c j(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof c) {
            cVar = new c((c) layoutParams);
        } else {
            cVar = new c(layoutParams);
        }
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    public final boolean n(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).b();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.I;
        if (cVar != null) {
            cVar.f();
            if (this.I.l()) {
                this.I.g();
                this.I.m();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.I;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (!this.L) {
            super.onLayout(z, i, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i11 - i;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = k1.b(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1020a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i13 = getPaddingLeft() + cVar.leftMargin;
                        i14 = i13 + measuredWidth;
                    } else {
                        i14 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i13 = i14 - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i13, i20, i14, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    n(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int i24 = 0;
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (b10) {
            int width = getWidth() - getPaddingRight();
            while (i24 < childCount) {
                View childAt3 = getChildAt(i24);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1020a) {
                    int i25 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width = i25 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i24++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i24 < childCount) {
            View childAt4 = getChildAt(i24);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1020a) {
                int i27 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft = d.a(measuredWidth4, cVar3.rightMargin, max, i27);
            }
            i24++;
        }
    }

    public final void onMeasure(int i, int i10) {
        int i11;
        boolean z;
        int i12;
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        androidx.appcompat.view.menu.e eVar;
        boolean z12 = this.L;
        boolean z13 = View.MeasureSpec.getMode(i) == 1073741824;
        this.L = z13;
        if (z12 != z13) {
            this.M = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.L || (eVar = this.E) == null || size == this.M)) {
            this.M = size;
            eVar.r(true);
        }
        int childCount = getChildCount();
        if (!this.L || childCount <= 0) {
            int i15 = i10;
            for (int i16 = 0; i16 < childCount; i16++) {
                c cVar = (c) getChildAt(i16).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.N;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z14 = false;
        long j10 = 0;
        while (i26 < childCount2) {
            View childAt = getChildAt(i26);
            int i27 = size3;
            int i28 = i17;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i29 = i22 + 1;
                if (z15) {
                    int i30 = this.O;
                    i14 = i29;
                    z11 = false;
                    childAt.setPadding(i30, 0, i30, 0);
                } else {
                    i14 = i29;
                    z11 = false;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f1025f = z11;
                cVar2.f1022c = z11 ? 1 : 0;
                cVar2.f1021b = z11;
                cVar2.f1023d = z11;
                cVar2.leftMargin = z11;
                cVar2.rightMargin = z11;
                cVar2.f1024e = z15 && ((ActionMenuItemView) childAt).c();
                int o4 = o(childAt, i21, cVar2.f1020a ? 1 : i19, childMeasureSpec, paddingBottom);
                i24 = Math.max(i24, o4);
                if (cVar2.f1023d) {
                    i25++;
                }
                if (cVar2.f1020a) {
                    z14 = true;
                }
                i19 -= o4;
                i23 = Math.max(i23, childAt.getMeasuredHeight());
                if (o4 == 1) {
                    j10 |= (long) (1 << i26);
                }
                i22 = i14;
            }
            i26++;
            size3 = i27;
            i17 = i28;
        }
        int i31 = i17;
        int i32 = size3;
        boolean z16 = z14 && i22 == 2;
        boolean z17 = false;
        while (true) {
            if (i25 <= 0 || i19 <= 0) {
                i11 = i23;
                z = z17;
            } else {
                int i33 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                int i34 = 0;
                int i35 = 0;
                long j11 = 0;
                while (i34 < childCount2) {
                    int i36 = i23;
                    c cVar3 = (c) getChildAt(i34).getLayoutParams();
                    boolean z18 = z17;
                    if (cVar3.f1023d) {
                        int i37 = cVar3.f1021b;
                        if (i37 < i33) {
                            j11 = 1 << i34;
                            i33 = i37;
                            i35 = 1;
                        } else if (i37 == i33) {
                            i35++;
                            j11 |= 1 << i34;
                        }
                    }
                    i34++;
                    z17 = z18;
                    i23 = i36;
                }
                i11 = i23;
                z = z17;
                j10 |= j11;
                if (i35 > i19) {
                    break;
                }
                int i38 = i33 + 1;
                int i39 = 0;
                while (i39 < childCount2) {
                    View childAt2 = getChildAt(i39);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i40 = i25;
                    long j12 = (long) (1 << i39);
                    if ((j11 & j12) == 0) {
                        if (cVar4.f1021b == i38) {
                            j10 |= j12;
                        }
                        z10 = z16;
                    } else {
                        if (!z16 || !cVar4.f1024e || i19 != 1) {
                            z10 = z16;
                        } else {
                            int i41 = this.O;
                            z10 = z16;
                            childAt2.setPadding(i41 + i21, 0, i41, 0);
                        }
                        cVar4.f1021b++;
                        cVar4.f1025f = true;
                        i19--;
                    }
                    i39++;
                    i25 = i40;
                    z16 = z10;
                }
                i23 = i11;
                z17 = true;
            }
        }
        i11 = i23;
        z = z17;
        boolean z19 = !z14 && i22 == 1;
        if (i19 > 0 && j10 != 0 && (i19 < i22 - 1 || z19 || i24 > 1)) {
            float bitCount = (float) Long.bitCount(j10);
            if (!z19) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1024e) {
                    bitCount -= 0.5f;
                }
                int i42 = childCount2 - 1;
                if ((j10 & ((long) (1 << i42))) != 0 && !((c) getChildAt(i42).getLayoutParams()).f1024e) {
                    bitCount -= 0.5f;
                }
            }
            int i43 = bitCount > 0.0f ? (int) (((float) (i19 * i21)) / bitCount) : 0;
            for (int i44 = 0; i44 < childCount2; i44++) {
                if ((j10 & ((long) (1 << i44))) != 0) {
                    View childAt3 = getChildAt(i44);
                    c cVar5 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f1022c = i43;
                        cVar5.f1025f = true;
                        if (i44 == 0 && !cVar5.f1024e) {
                            cVar5.leftMargin = (-i43) / 2;
                        }
                        z = true;
                    } else if (cVar5.f1020a) {
                        cVar5.f1022c = i43;
                        cVar5.f1025f = true;
                        cVar5.rightMargin = (-i43) / 2;
                        z = true;
                    } else {
                        if (i44 != 0) {
                            cVar5.leftMargin = i43 / 2;
                        }
                        if (i44 != childCount2 - 1) {
                            cVar5.rightMargin = i43 / 2;
                        }
                    }
                }
            }
        }
        if (z) {
            for (int i45 = 0; i45 < childCount2; i45++) {
                View childAt4 = getChildAt(i45);
                c cVar6 = (c) childAt4.getLayoutParams();
                if (cVar6.f1025f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f1021b * i21) + cVar6.f1022c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i13 = i31;
            i12 = i11;
        } else {
            i12 = i32;
            i13 = i31;
        }
        setMeasuredDimension(i13, i12);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.I.F = z;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.P = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        c cVar = this.I;
        c.d dVar = cVar.f1179x;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.z = true;
        cVar.f1180y = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.H = z;
    }

    public void setPopupTheme(int i) {
        if (this.G != i) {
            this.G = i;
            if (i == 0) {
                this.F = getContext();
            } else {
                this.F = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.I = cVar;
        cVar.f888w = this;
        this.E = cVar.f883c;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
