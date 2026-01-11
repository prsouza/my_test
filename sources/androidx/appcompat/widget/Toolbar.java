package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import h.a;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;

public class Toolbar extends ViewGroup {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public v0 I;
    public int J;
    public int K;
    public int L;
    public CharSequence M;
    public CharSequence N;
    public ColorStateList O;
    public ColorStateList P;
    public boolean Q;
    public boolean R;
    public final ArrayList<View> S;
    public final ArrayList<View> T;
    public final int[] U;
    public final n0.f V;
    public ArrayList<MenuItem> W;

    /* renamed from: a  reason: collision with root package name */
    public ActionMenuView f1110a;

    /* renamed from: a0  reason: collision with root package name */
    public f f1111a0;

    /* renamed from: b  reason: collision with root package name */
    public f0 f1112b;
    public final a b0;

    /* renamed from: c  reason: collision with root package name */
    public f0 f1113c;

    /* renamed from: c0  reason: collision with root package name */
    public f1 f1114c0;

    /* renamed from: d0  reason: collision with root package name */
    public c f1115d0;

    /* renamed from: e0  reason: collision with root package name */
    public d f1116e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1117f0;

    /* renamed from: g0  reason: collision with root package name */
    public final b f1118g0;

    /* renamed from: s  reason: collision with root package name */
    public p f1119s;

    /* renamed from: t  reason: collision with root package name */
    public r f1120t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f1121u;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f1122v;

    /* renamed from: w  reason: collision with root package name */
    public p f1123w;

    /* renamed from: x  reason: collision with root package name */
    public View f1124x;

    /* renamed from: y  reason: collision with root package name */
    public Context f1125y;
    public int z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            Toolbar.this.v();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public final void onClick(View view) {
            androidx.appcompat.view.menu.g gVar;
            d dVar = Toolbar.this.f1116e0;
            if (dVar == null) {
                gVar = null;
            } else {
                gVar = dVar.f1130b;
            }
            if (gVar != null) {
                gVar.collapseActionView();
            }
        }
    }

    public class d implements i {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f1129a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.g f1130b;

        public d() {
        }

        public final void a(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        public final boolean c(androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f1124x;
            if (view instanceof m.b) {
                ((m.b) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1124x);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1123w);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1124x = null;
            int size = toolbar3.T.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.T.get(size));
                } else {
                    toolbar3.T.clear();
                    this.f1130b = null;
                    Toolbar.this.requestLayout();
                    gVar.C = false;
                    gVar.f959n.r(false);
                    return true;
                }
            }
        }

        public final void e(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1129a;
            if (!(eVar2 == null || (gVar = this.f1130b) == null)) {
                eVar2.e(gVar);
            }
            this.f1129a = eVar;
        }

        public final void f() {
            if (this.f1130b != null) {
                androidx.appcompat.view.menu.e eVar = this.f1129a;
                boolean z = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1129a.getItem(i) == this.f1130b) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z) {
                    c(this.f1130b);
                }
            }
        }

        public final boolean h(l lVar) {
            return false;
        }

        public final boolean i() {
            return false;
        }

        public final boolean k(androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f1123w.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1123w);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1123w);
            }
            Toolbar.this.f1124x = gVar.getActionView();
            this.f1130b = gVar;
            ViewParent parent2 = Toolbar.this.f1124x.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1124x);
                }
                Objects.requireNonNull(Toolbar.this);
                e eVar = new e();
                Toolbar toolbar4 = Toolbar.this;
                eVar.f5519a = 8388611 | (toolbar4.C & 112);
                eVar.f1132b = 2;
                toolbar4.f1124x.setLayoutParams(eVar);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1124x);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((e) childAt.getLayoutParams()).f1132b == 2 || childAt == toolbar6.f1110a)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.T.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            gVar.C = true;
            gVar.f959n.r(false);
            View view = Toolbar.this.f1124x;
            if (view instanceof m.b) {
                ((m.b) view).c();
            }
            return true;
        }
    }

    public interface f {
        boolean a();
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new m.f(getContext());
    }

    public final void a(List<View> list, int i) {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        boolean z10 = x.e.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, x.e.d(this));
        list.clear();
        if (z10) {
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1132b == 0 && u(childAt) && j(eVar.f5519a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1132b == 0 && u(childAt2) && j(eVar2.f5519a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z10) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f1132b = 1;
        if (!z10 || this.f1124x == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.T.add(view);
    }

    public final void c() {
        if (this.f1123w == null) {
            p pVar = new p(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f1123w = pVar;
            pVar.setImageDrawable(this.f1121u);
            this.f1123w.setContentDescription(this.f1122v);
            e eVar = new e();
            eVar.f5519a = 8388611 | (this.C & 112);
            eVar.f1132b = 2;
            this.f1123w.setLayoutParams(eVar);
            this.f1123w.setOnClickListener(new c());
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.I == null) {
            this.I = new v0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1110a;
        if (actionMenuView.E == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) actionMenuView.getMenu();
            if (this.f1116e0 == null) {
                this.f1116e0 = new d();
            }
            this.f1110a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f1116e0, this.f1125y);
        }
    }

    public final void f() {
        if (this.f1110a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f1110a = actionMenuView;
            actionMenuView.setPopupTheme(this.z);
            this.f1110a.setOnMenuItemClickListener(this.b0);
            ActionMenuView actionMenuView2 = this.f1110a;
            actionMenuView2.J = null;
            actionMenuView2.K = null;
            e eVar = new e();
            eVar.f5519a = 8388613 | (this.C & 112);
            this.f1110a.setLayoutParams(eVar);
            b(this.f1110a, false);
        }
    }

    public final void g() {
        if (this.f1119s == null) {
            this.f1119s = new p(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            e eVar = new e();
            eVar.f5519a = 8388611 | (this.C & 112);
            this.f1119s.setLayoutParams(eVar);
        }
    }

    public CharSequence getCollapseContentDescription() {
        p pVar = this.f1123w;
        if (pVar != null) {
            return pVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        p pVar = this.f1123w;
        if (pVar != null) {
            return pVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        v0 v0Var = this.I;
        if (v0Var != null) {
            return v0Var.g ? v0Var.f1406a : v0Var.f1407b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.K;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        v0 v0Var = this.I;
        if (v0Var != null) {
            return v0Var.f1406a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        v0 v0Var = this.I;
        if (v0Var != null) {
            return v0Var.f1407b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        v0 v0Var = this.I;
        if (v0Var != null) {
            return v0Var.g ? v0Var.f1407b : v0Var.f1406a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.J;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1110a
            r1 = 0
            if (r0 == 0) goto L_0x0011
            androidx.appcompat.view.menu.e r0 = r0.E
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.K
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.J, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        r rVar = this.f1120t;
        if (rVar != null) {
            return rVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        r rVar = this.f1120t;
        if (rVar != null) {
            return rVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1110a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1119s;
    }

    public CharSequence getNavigationContentDescription() {
        p pVar = this.f1119s;
        if (pVar != null) {
            return pVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        p pVar = this.f1119s;
        if (pVar != null) {
            return pVar.getDrawable();
        }
        return null;
    }

    public c getOuterActionMenuPresenter() {
        return this.f1115d0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1110a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1125y;
    }

    public int getPopupTheme() {
        return this.z;
    }

    public CharSequence getSubtitle() {
        return this.N;
    }

    public final TextView getSubtitleTextView() {
        return this.f1113c;
    }

    public CharSequence getTitle() {
        return this.M;
    }

    public int getTitleMarginBottom() {
        return this.H;
    }

    public int getTitleMarginEnd() {
        return this.F;
    }

    public int getTitleMarginStart() {
        return this.E;
    }

    public int getTitleMarginTop() {
        return this.G;
    }

    public final TextView getTitleTextView() {
        return this.f1112b;
    }

    public j0 getWrapper() {
        if (this.f1114c0 == null) {
            this.f1114c0 = new f1(this);
        }
        return this.f1114c0;
    }

    /* renamed from: h */
    public final e generateDefaultLayoutParams() {
        return new e();
    }

    /* renamed from: i */
    public final e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0090a) {
            return new e((a.C0090a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public final int j(int i) {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        int d10 = x.e.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, d10) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return d10 == 1 ? 5 : 3;
    }

    public final int k(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i11 = eVar.f5519a & 112;
        if (!(i11 == 16 || i11 == 48 || i11 == 80)) {
            i11 = this.L & 112;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = eVar.topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = eVar.bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void n(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.T.contains(view);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1118g0);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.R = false;
        }
        if (!this.R) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.R = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.R = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0294 A[LOOP:0: B:99:0x0292->B:100:0x0294, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02b6 A[LOOP:1: B:102:0x02b4->B:103:0x02b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02db A[LOOP:2: B:105:0x02d9->B:106:0x02db, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0330 A[LOOP:3: B:113:0x032e->B:114:0x0330, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = r20
            java.util.WeakHashMap<android.view.View, n0.a0> r1 = n0.x.f8842a
            int r1 = n0.x.e.d(r20)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            int r4 = r20.getWidth()
            int r5 = r20.getHeight()
            int r6 = r20.getPaddingLeft()
            int r7 = r20.getPaddingRight()
            int r8 = r20.getPaddingTop()
            int r9 = r20.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.U
            r11[r2] = r3
            r11[r3] = r3
            int r12 = n0.x.d.d(r20)
            if (r12 < 0) goto L_0x003c
            int r13 = r25 - r23
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r3
        L_0x003d:
            androidx.appcompat.widget.p r13 = r0.f1119s
            boolean r13 = r0.u(r13)
            if (r13 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0050
            androidx.appcompat.widget.p r13 = r0.f1119s
            int r13 = r0.r(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0059
        L_0x0050:
            androidx.appcompat.widget.p r13 = r0.f1119s
            int r13 = r0.q(r13, r6, r11, r12)
            goto L_0x0058
        L_0x0057:
            r13 = r6
        L_0x0058:
            r14 = r10
        L_0x0059:
            androidx.appcompat.widget.p r15 = r0.f1123w
            boolean r15 = r0.u(r15)
            if (r15 == 0) goto L_0x0070
            if (r1 == 0) goto L_0x006a
            androidx.appcompat.widget.p r15 = r0.f1123w
            int r14 = r0.r(r15, r14, r11, r12)
            goto L_0x0070
        L_0x006a:
            androidx.appcompat.widget.p r15 = r0.f1123w
            int r13 = r0.q(r15, r13, r11, r12)
        L_0x0070:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1110a
            boolean r15 = r0.u(r15)
            if (r15 == 0) goto L_0x0087
            if (r1 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1110a
            int r13 = r0.q(r15, r13, r11, r12)
            goto L_0x0087
        L_0x0081:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1110a
            int r14 = r0.r(r15, r14, r11, r12)
        L_0x0087:
            int r15 = r20.getCurrentContentInsetLeft()
            int r16 = r20.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1124x
            boolean r13 = r0.u(r13)
            if (r13 == 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00be
            android.view.View r13 = r0.f1124x
            int r10 = r0.r(r13, r10, r11, r12)
            goto L_0x00c4
        L_0x00be:
            android.view.View r13 = r0.f1124x
            int r2 = r0.q(r13, r2, r11, r12)
        L_0x00c4:
            androidx.appcompat.widget.r r13 = r0.f1120t
            boolean r13 = r0.u(r13)
            if (r13 == 0) goto L_0x00db
            if (r1 == 0) goto L_0x00d5
            androidx.appcompat.widget.r r13 = r0.f1120t
            int r10 = r0.r(r13, r10, r11, r12)
            goto L_0x00db
        L_0x00d5:
            androidx.appcompat.widget.r r13 = r0.f1120t
            int r2 = r0.q(r13, r2, r11, r12)
        L_0x00db:
            androidx.appcompat.widget.f0 r13 = r0.f1112b
            boolean r13 = r0.u(r13)
            androidx.appcompat.widget.f0 r14 = r0.f1113c
            boolean r14 = r0.u(r14)
            if (r13 == 0) goto L_0x0102
            androidx.appcompat.widget.f0 r15 = r0.f1112b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r24 = r7
            androidx.appcompat.widget.f0 r7 = r0.f1112b
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x0105
        L_0x0102:
            r24 = r7
            r7 = 0
        L_0x0105:
            if (r14 == 0) goto L_0x011f
            androidx.appcompat.widget.f0 r3 = r0.f1113c
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r15 = r3.topMargin
            r16 = r4
            androidx.appcompat.widget.f0 r4 = r0.f1113c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0121
        L_0x011f:
            r16 = r4
        L_0x0121:
            if (r13 != 0) goto L_0x012c
            if (r14 == 0) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            r18 = r6
            r23 = r12
            goto L_0x0284
        L_0x012c:
            if (r13 == 0) goto L_0x0131
            androidx.appcompat.widget.f0 r3 = r0.f1112b
            goto L_0x0133
        L_0x0131:
            androidx.appcompat.widget.f0 r3 = r0.f1113c
        L_0x0133:
            if (r14 == 0) goto L_0x0138
            androidx.appcompat.widget.f0 r4 = r0.f1113c
            goto L_0x013a
        L_0x0138:
            androidx.appcompat.widget.f0 r4 = r0.f1112b
        L_0x013a:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            if (r13 == 0) goto L_0x0150
            androidx.appcompat.widget.f0 r15 = r0.f1112b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x015a
        L_0x0150:
            if (r14 == 0) goto L_0x015d
            androidx.appcompat.widget.f0 r15 = r0.f1113c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x015a:
            r17 = 1
            goto L_0x015f
        L_0x015d:
            r17 = 0
        L_0x015f:
            int r15 = r0.L
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a1
            r6 = 80
            if (r15 == r6) goto L_0x0195
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r23 = r12
            int r12 = r0.G
            int r15 = r15 + r12
            if (r6 >= r15) goto L_0x017e
            r6 = r15
            goto L_0x0193
        L_0x017e:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r3 = r3.bottomMargin
            int r7 = r0.H
            int r3 = r3 + r7
            if (r5 >= r3) goto L_0x0193
            int r3 = r4.bottomMargin
            int r3 = r3 + r7
            int r3 = r3 - r5
            int r6 = r6 - r3
            r3 = 0
            int r6 = java.lang.Math.max(r3, r6)
        L_0x0193:
            int r8 = r8 + r6
            goto L_0x01ae
        L_0x0195:
            r23 = r12
            int r5 = r5 - r9
            int r3 = r4.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.H
            int r5 = r5 - r3
            int r8 = r5 - r7
            goto L_0x01ae
        L_0x01a1:
            r23 = r12
            int r4 = r20.getPaddingTop()
            int r3 = r3.topMargin
            int r4 = r4 + r3
            int r3 = r0.G
            int r8 = r4 + r3
        L_0x01ae:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b5
            int r1 = r0.E
            goto L_0x01b6
        L_0x01b5:
            r1 = 0
        L_0x01b6:
            r3 = 1
            r4 = r11[r3]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r10 = r10 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x01ed
            androidx.appcompat.widget.f0 r1 = r0.f1112b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            androidx.appcompat.widget.f0 r3 = r0.f1112b
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            androidx.appcompat.widget.f0 r4 = r0.f1112b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.f0 r5 = r0.f1112b
            r5.layout(r3, r8, r10, r4)
            int r5 = r0.F
            int r3 = r3 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x01ee
        L_0x01ed:
            r3 = r10
        L_0x01ee:
            if (r14 == 0) goto L_0x0214
            androidx.appcompat.widget.f0 r1 = r0.f1113c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.f0 r1 = r0.f1113c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            androidx.appcompat.widget.f0 r4 = r0.f1113c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.f0 r5 = r0.f1113c
            r5.layout(r1, r8, r10, r4)
            int r1 = r0.F
            int r1 = r10 - r1
            goto L_0x0215
        L_0x0214:
            r1 = r10
        L_0x0215:
            if (r17 == 0) goto L_0x0284
            int r1 = java.lang.Math.min(r3, r1)
            r10 = r1
            goto L_0x0284
        L_0x021d:
            if (r17 == 0) goto L_0x0222
            int r1 = r0.E
            goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            r3 = 0
            r4 = r11[r3]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r3, r1)
            int r2 = r2 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x0258
            androidx.appcompat.widget.f0 r1 = r0.f1112b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            androidx.appcompat.widget.f0 r3 = r0.f1112b
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            androidx.appcompat.widget.f0 r4 = r0.f1112b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.f0 r5 = r0.f1112b
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.F
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0259
        L_0x0258:
            r3 = r2
        L_0x0259:
            if (r14 == 0) goto L_0x027d
            androidx.appcompat.widget.f0 r1 = r0.f1113c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            androidx.appcompat.widget.f0 r1 = r0.f1113c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r2
            androidx.appcompat.widget.f0 r4 = r0.f1113c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            androidx.appcompat.widget.f0 r5 = r0.f1113c
            r5.layout(r2, r8, r1, r4)
            int r4 = r0.F
            int r1 = r1 + r4
            goto L_0x027e
        L_0x027d:
            r1 = r2
        L_0x027e:
            if (r17 == 0) goto L_0x0284
            int r2 = java.lang.Math.max(r3, r1)
        L_0x0284:
            java.util.ArrayList<android.view.View> r1 = r0.S
            r3 = 3
            r0.a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.S
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x0292:
            if (r2 >= r1) goto L_0x02a5
            java.util.ArrayList<android.view.View> r4 = r0.S
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r23
            int r3 = r0.q(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x0292
        L_0x02a5:
            r12 = r23
            java.util.ArrayList<android.view.View> r1 = r0.S
            r2 = 5
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.S
            int r1 = r1.size()
            r2 = 0
        L_0x02b4:
            if (r2 >= r1) goto L_0x02c5
            java.util.ArrayList<android.view.View> r4 = r0.S
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.r(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02b4
        L_0x02c5:
            java.util.ArrayList<android.view.View> r1 = r0.S
            r2 = 1
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.S
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02d9:
            if (r5 >= r4) goto L_0x030c
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02d9
        L_0x030c:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r24
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x031c
            goto L_0x0323
        L_0x031c:
            if (r6 <= r10) goto L_0x0322
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0323
        L_0x0322:
            r3 = r4
        L_0x0323:
            java.util.ArrayList<android.view.View> r1 = r0.S
            int r1 = r1.size()
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x032e:
            if (r3 >= r1) goto L_0x033f
            java.util.ArrayList<android.view.View> r4 = r0.S
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.q(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x032e
        L_0x033f:
            java.util.ArrayList<android.view.View> r1 = r0.S
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int[] iArr = this.U;
        char b10 = k1.b(this);
        char c10 = b10 ^ 1;
        int i18 = 0;
        if (u(this.f1119s)) {
            t(this.f1119s, i, 0, i10, this.D);
            i13 = l(this.f1119s) + this.f1119s.getMeasuredWidth();
            i12 = Math.max(0, m(this.f1119s) + this.f1119s.getMeasuredHeight());
            i11 = View.combineMeasuredStates(0, this.f1119s.getMeasuredState());
        } else {
            i13 = 0;
            i12 = 0;
            i11 = 0;
        }
        if (u(this.f1123w)) {
            t(this.f1123w, i, 0, i10, this.D);
            i13 = l(this.f1123w) + this.f1123w.getMeasuredWidth();
            i12 = Math.max(i12, m(this.f1123w) + this.f1123w.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f1123w.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i13) + 0;
        iArr[b10] = Math.max(0, currentContentInsetStart - i13);
        if (u(this.f1110a)) {
            t(this.f1110a, i, max, i10, this.D);
            i14 = l(this.f1110a) + this.f1110a.getMeasuredWidth();
            i12 = Math.max(i12, m(this.f1110a) + this.f1110a.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f1110a.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i14);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i14);
        if (u(this.f1124x)) {
            max2 += s(this.f1124x, i, max2, i10, 0, iArr);
            i12 = Math.max(i12, m(this.f1124x) + this.f1124x.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f1124x.getMeasuredState());
        }
        if (u(this.f1120t)) {
            max2 += s(this.f1120t, i, max2, i10, 0, iArr);
            i12 = Math.max(i12, m(this.f1120t) + this.f1120t.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f1120t.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (((e) childAt.getLayoutParams()).f1132b == 0 && u(childAt)) {
                max2 += s(childAt, i, max2, i10, 0, iArr);
                i12 = Math.max(i12, m(childAt) + childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
            }
        }
        int i20 = this.G + this.H;
        int i21 = this.E + this.F;
        if (u(this.f1112b)) {
            s(this.f1112b, i, max2 + i21, i10, i20, iArr);
            int l10 = l(this.f1112b) + this.f1112b.getMeasuredWidth();
            i15 = m(this.f1112b) + this.f1112b.getMeasuredHeight();
            i17 = View.combineMeasuredStates(i11, this.f1112b.getMeasuredState());
            i16 = l10;
        } else {
            i15 = 0;
            i17 = i11;
            i16 = 0;
        }
        if (u(this.f1113c)) {
            i16 = Math.max(i16, s(this.f1113c, i, max2 + i21, i10, i15 + i20, iArr));
            i15 += m(this.f1113c) + this.f1113c.getMeasuredHeight();
            i17 = View.combineMeasuredStates(i17, this.f1113c.getMeasuredState());
        } else {
            int i22 = i17;
        }
        int max3 = Math.max(i12, i15);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i16, getSuggestedMinimumWidth()), i, -16777216 & i17);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i17 << 16);
        if (this.f1117f0) {
            int childCount2 = getChildCount();
            int i23 = 0;
            while (true) {
                if (i23 >= childCount2) {
                    z10 = true;
                    break;
                }
                View childAt2 = getChildAt(i23);
                if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i23++;
            }
        }
        z10 = false;
        if (!z10) {
            i18 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i18);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f10849a);
        ActionMenuView actionMenuView = this.f1110a;
        androidx.appcompat.view.menu.e eVar = actionMenuView != null ? actionMenuView.E : null;
        int i = gVar.f1133c;
        if (!(i == 0 || this.f1116e0 == null || eVar == null || (findItem = eVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f1134s) {
            removeCallbacks(this.f1118g0);
            post(this.f1118g0);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        v0 v0Var = this.I;
        boolean z10 = true;
        if (i != 1) {
            z10 = false;
        }
        if (z10 != v0Var.g) {
            v0Var.g = z10;
            if (!v0Var.f1412h) {
                v0Var.f1406a = v0Var.f1410e;
                v0Var.f1407b = v0Var.f1411f;
            } else if (z10) {
                int i10 = v0Var.f1409d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = v0Var.f1410e;
                }
                v0Var.f1406a = i10;
                int i11 = v0Var.f1408c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = v0Var.f1411f;
                }
                v0Var.f1407b = i11;
            } else {
                int i12 = v0Var.f1408c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = v0Var.f1410e;
                }
                v0Var.f1406a = i12;
                int i13 = v0Var.f1409d;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = v0Var.f1411f;
                }
                v0Var.f1407b = i13;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.f1116e0;
        if (!(dVar == null || (gVar = dVar.f1130b) == null)) {
            gVar2.f1133c = gVar.f948a;
        }
        gVar2.f1134s = p();
        return gVar2;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Q = false;
        }
        if (!this.Q) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.Q = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.Q = false;
        }
        return true;
    }

    public final boolean p() {
        ActionMenuView actionMenuView = this.f1110a;
        if (actionMenuView != null) {
            c cVar = actionMenuView.I;
            if (cVar != null && cVar.l()) {
                return true;
            }
        }
        return false;
    }

    public final int q(View view, int i, int[] iArr, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i11) + i;
        iArr[0] = Math.max(0, -i11);
        int k10 = k(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k10, max + measuredWidth, view.getMeasuredHeight() + k10);
        return measuredWidth + eVar.rightMargin + max;
    }

    public final int r(View view, int i, int[] iArr, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int k10 = k(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k10, max, view.getMeasuredHeight() + k10);
        return max - (measuredWidth + eVar.leftMargin);
    }

    public final int s(View view, int i, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(a.b.a0(getContext(), i));
    }

    public void setCollapsible(boolean z10) {
        this.f1117f0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        }
        if (i != this.K) {
            this.K = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        }
        if (i != this.J) {
            this.J = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(a.b.a0(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(a.b.a0(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f1119s.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.f1111a0 = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1110a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.z != i) {
            this.z = i;
            if (i == 0) {
                this.f1125y = getContext();
            } else {
                this.f1125y = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.H = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.F = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.E = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.G = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        ActionMenuView actionMenuView = this.f1110a;
        if (actionMenuView != null) {
            c cVar = actionMenuView.I;
            if (cVar != null && cVar.m()) {
                return true;
            }
        }
        return false;
    }

    public static class e extends a.C0090a {

        /* renamed from: b  reason: collision with root package name */
        public int f1132b = 0;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e() {
            this.f5519a = 8388627;
        }

        public e(e eVar) {
            super((a.C0090a) eVar);
            this.f1132b = eVar.f1132b;
        }

        public e(a.C0090a aVar) {
            super(aVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.L = 8388627;
        this.S = new ArrayList<>();
        this.T = new ArrayList<>();
        this.U = new int[2];
        this.V = new n0.f();
        this.W = new ArrayList<>();
        this.b0 = new a();
        this.f1118g0 = new b();
        Context context2 = getContext();
        int[] iArr = ad.c.S;
        d1 q10 = d1.q(context2, attributeSet, iArr, R.attr.toolbarStyle);
        x.o(this, context, iArr, attributeSet, q10.f1207b, R.attr.toolbarStyle);
        this.A = q10.l(28, 0);
        this.B = q10.l(19, 0);
        this.L = q10.f1207b.getInteger(0, this.L);
        this.C = q10.f1207b.getInteger(2, 48);
        int e10 = q10.e(22, 0);
        e10 = q10.o(27) ? q10.e(27, e10) : e10;
        this.H = e10;
        this.G = e10;
        this.F = e10;
        this.E = e10;
        int e11 = q10.e(25, -1);
        if (e11 >= 0) {
            this.E = e11;
        }
        int e12 = q10.e(24, -1);
        if (e12 >= 0) {
            this.F = e12;
        }
        int e13 = q10.e(26, -1);
        if (e13 >= 0) {
            this.G = e13;
        }
        int e14 = q10.e(23, -1);
        if (e14 >= 0) {
            this.H = e14;
        }
        this.D = q10.f(13, -1);
        int e15 = q10.e(9, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
        int e16 = q10.e(5, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
        int f10 = q10.f(7, 0);
        int f11 = q10.f(8, 0);
        d();
        v0 v0Var = this.I;
        v0Var.f1412h = false;
        if (f10 != Integer.MIN_VALUE) {
            v0Var.f1410e = f10;
            v0Var.f1406a = f10;
        }
        if (f11 != Integer.MIN_VALUE) {
            v0Var.f1411f = f11;
            v0Var.f1407b = f11;
        }
        if (!(e15 == Integer.MIN_VALUE && e16 == Integer.MIN_VALUE)) {
            v0Var.a(e15, e16);
        }
        this.J = q10.e(10, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
        this.K = q10.e(6, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
        this.f1121u = q10.g(4);
        this.f1122v = q10.n(3);
        CharSequence n10 = q10.n(21);
        if (!TextUtils.isEmpty(n10)) {
            setTitle(n10);
        }
        CharSequence n11 = q10.n(18);
        if (!TextUtils.isEmpty(n11)) {
            setSubtitle(n11);
        }
        this.f1125y = getContext();
        setPopupTheme(q10.l(17, 0));
        Drawable g8 = q10.g(16);
        if (g8 != null) {
            setNavigationIcon(g8);
        }
        CharSequence n12 = q10.n(15);
        if (!TextUtils.isEmpty(n12)) {
            setNavigationContentDescription(n12);
        }
        Drawable g10 = q10.g(11);
        if (g10 != null) {
            setLogo(g10);
        }
        CharSequence n13 = q10.n(12);
        if (!TextUtils.isEmpty(n13)) {
            setLogoDescription(n13);
        }
        if (q10.o(29)) {
            setTitleTextColor(q10.c(29));
        }
        if (q10.o(20)) {
            setSubtitleTextColor(q10.c(20));
        }
        if (q10.o(14)) {
            getMenuInflater().inflate(q10.l(14, 0), getMenu());
        }
        q10.r();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        p pVar = this.f1123w;
        if (pVar != null) {
            pVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1123w.setImageDrawable(drawable);
            return;
        }
        p pVar = this.f1123w;
        if (pVar != null) {
            pVar.setImageDrawable(this.f1121u);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1120t == null) {
                this.f1120t = new r(getContext(), (AttributeSet) null);
            }
            if (!o(this.f1120t)) {
                b(this.f1120t, true);
            }
        } else {
            r rVar = this.f1120t;
            if (rVar != null && o(rVar)) {
                removeView(this.f1120t);
                this.T.remove(this.f1120t);
            }
        }
        r rVar2 = this.f1120t;
        if (rVar2 != null) {
            rVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1120t == null) {
            this.f1120t = new r(getContext(), (AttributeSet) null);
        }
        r rVar = this.f1120t;
        if (rVar != null) {
            rVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        p pVar = this.f1119s;
        if (pVar != null) {
            pVar.setContentDescription(charSequence);
            g1.a(this.f1119s, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f1119s)) {
                b(this.f1119s, true);
            }
        } else {
            p pVar = this.f1119s;
            if (pVar != null && o(pVar)) {
                removeView(this.f1119s);
                this.T.remove(this.f1119s);
            }
        }
        p pVar2 = this.f1119s;
        if (pVar2 != null) {
            pVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1113c == null) {
                Context context = getContext();
                f0 f0Var = new f0(context, (AttributeSet) null);
                this.f1113c = f0Var;
                f0Var.setSingleLine();
                this.f1113c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.B;
                if (i != 0) {
                    this.f1113c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.P;
                if (colorStateList != null) {
                    this.f1113c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1113c)) {
                b(this.f1113c, true);
            }
        } else {
            f0 f0Var2 = this.f1113c;
            if (f0Var2 != null && o(f0Var2)) {
                removeView(this.f1113c);
                this.T.remove(this.f1113c);
            }
        }
        f0 f0Var3 = this.f1113c;
        if (f0Var3 != null) {
            f0Var3.setText(charSequence);
        }
        this.N = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        f0 f0Var = this.f1113c;
        if (f0Var != null) {
            f0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1112b == null) {
                Context context = getContext();
                f0 f0Var = new f0(context, (AttributeSet) null);
                this.f1112b = f0Var;
                f0Var.setSingleLine();
                this.f1112b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A;
                if (i != 0) {
                    this.f1112b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.O;
                if (colorStateList != null) {
                    this.f1112b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1112b)) {
                b(this.f1112b, true);
            }
        } else {
            f0 f0Var2 = this.f1112b;
            if (f0Var2 != null && o(f0Var2)) {
                removeView(this.f1112b);
                this.T.remove(this.f1112b);
            }
        }
        f0 f0Var3 = this.f1112b;
        if (f0Var3 != null) {
            f0Var3.setText(charSequence);
        }
        this.M = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.O = colorStateList;
        f0 f0Var = this.f1112b;
        if (f0Var != null) {
            f0Var.setTextColor(colorStateList);
        }
    }

    public static class g extends s0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f1133c;

        /* renamed from: s  reason: collision with root package name */
        public boolean f1134s;

        public class a implements Parcelable.ClassLoaderCreator<g> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new g[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1133c = parcel.readInt();
            this.f1134s = parcel.readInt() != 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            parcel.writeInt(this.f1133c);
            parcel.writeInt(this.f1134s ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
