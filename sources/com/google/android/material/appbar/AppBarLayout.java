package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e6.f;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import n0.a0;
import n0.i;
import n0.x;
import o0.b;

public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public WeakReference<View> A;
    public ValueAnimator B;
    public int[] C;
    public Drawable D;
    public Behavior E;

    /* renamed from: a  reason: collision with root package name */
    public int f3614a;

    /* renamed from: b  reason: collision with root package name */
    public int f3615b;

    /* renamed from: c  reason: collision with root package name */
    public int f3616c;

    /* renamed from: s  reason: collision with root package name */
    public int f3617s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3618t;

    /* renamed from: u  reason: collision with root package name */
    public int f3619u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3620v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3621w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3622x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3623y;
    public int z;

    public static class BaseBehavior<T extends AppBarLayout> extends g5.b<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f3624j;

        /* renamed from: k  reason: collision with root package name */
        public int f3625k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f3626l;

        /* renamed from: m  reason: collision with root package name */
        public a f3627m;

        /* renamed from: n  reason: collision with root package name */
        public WeakReference<View> f3628n;

        public BaseBehavior() {
        }

        public static boolean E(int i, int i10) {
            return (i & i10) == i10;
        }

        public final int C(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
            int i12;
            List orDefault;
            int i13;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            int i14 = i10;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int y10 = y();
            int i15 = 0;
            if (i14 == 0 || y10 < i14 || y10 > i11) {
                this.f3624j = 0;
            } else {
                int s10 = y.c.s(i, i10, i11);
                if (y10 != s10) {
                    if (appBarLayout.f3618t) {
                        int abs = Math.abs(s10);
                        int childCount = appBarLayout.getChildCount();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i16);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.f3638c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i16++;
                            } else if (interpolator != null) {
                                int i17 = cVar.f3636a;
                                if ((i17 & 1) != 0) {
                                    i13 = childAt.getHeight() + cVar.topMargin + cVar.bottomMargin + 0;
                                    if ((i17 & 2) != 0) {
                                        WeakHashMap<View, a0> weakHashMap = x.f8842a;
                                        i13 -= x.d.d(childAt);
                                    }
                                } else {
                                    i13 = 0;
                                }
                                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                                if (x.d.b(childAt)) {
                                    i13 -= appBarLayout.getTopInset();
                                }
                                if (i13 > 0) {
                                    float f10 = (float) i13;
                                    i12 = (childAt.getTop() + Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f10) * f10)) * Integer.signum(s10);
                                }
                            }
                        }
                    }
                    i12 = s10;
                    boolean u10 = u(i12);
                    int i18 = y10 - s10;
                    this.f3624j = s10 - i12;
                    if (u10) {
                        for (int i19 = 0; i19 < appBarLayout.getChildCount(); i19++) {
                            c cVar2 = (c) appBarLayout.getChildAt(i19).getLayoutParams();
                            a aVar = cVar2.f3637b;
                            if (!(aVar == null || (cVar2.f3636a & 1) == 0)) {
                                View childAt2 = appBarLayout.getChildAt(i19);
                                b bVar = (b) aVar;
                                Rect rect = bVar.f3634a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = ((float) bVar.f3634a.top) - Math.abs((float) s());
                                float f11 = 0.0f;
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / ((float) bVar.f3634a.height()));
                                    if (abs3 >= 0.0f) {
                                        f11 = abs3 > 1.0f ? 1.0f : abs3;
                                    }
                                    float f12 = 1.0f - f11;
                                    float height = (-abs2) - ((((float) bVar.f3634a.height()) * 0.3f) * (1.0f - (f12 * f12)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(bVar.f3635b);
                                    bVar.f3635b.offset(0, (int) (-height));
                                    Rect rect2 = bVar.f3635b;
                                    WeakHashMap<View, a0> weakHashMap3 = x.f8842a;
                                    x.f.c(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, a0> weakHashMap4 = x.f8842a;
                                    x.f.c(childAt2, (Rect) null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!u10 && appBarLayout.f3618t && (orDefault = coordinatorLayout2.f1608b.f13b.getOrDefault(appBarLayout, null)) != null && !orDefault.isEmpty()) {
                        while (i15 < orDefault.size()) {
                            View view2 = (View) orDefault.get(i15);
                            CoordinatorLayout.c cVar3 = ((CoordinatorLayout.f) view2.getLayoutParams()).f1619a;
                            if (cVar3 != null) {
                                cVar3.d(coordinatorLayout2, view2, appBarLayout);
                            }
                            i15++;
                        }
                    }
                    appBarLayout.f3614a = s();
                    if (!appBarLayout.willNotDraw()) {
                        WeakHashMap<View, a0> weakHashMap5 = x.f8842a;
                        x.d.k(appBarLayout);
                    }
                    K(coordinatorLayout, appBarLayout, s10, s10 < y10 ? -1 : 1, false);
                    i15 = i18;
                }
            }
            J(coordinatorLayout2, appBarLayout);
            return i15;
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int i10;
            int abs = Math.abs(y() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                i10 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i10 = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            int y10 = y();
            if (y10 == i) {
                ValueAnimator valueAnimator = this.f3626l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f3626l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f3626l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f3626l = valueAnimator3;
                valueAnimator3.setInterpolator(f5.a.f4988e);
                this.f3626l.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f3626l.setDuration((long) Math.min(i10, 600));
            this.f3626l.setIntValues(new int[]{y10, i});
            this.f3626l.start();
        }

        public final View F(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof i) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i10;
            int i11;
            if (i != 0) {
                if (i < 0) {
                    i11 = -appBarLayout.getTotalScrollRange();
                    i10 = appBarLayout.getDownNestedPreScrollRange() + i11;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    i10 = 0;
                }
                int i12 = i11;
                int i13 = i10;
                if (i12 != i13) {
                    iArr[1] = A(coordinatorLayout, appBarLayout, i, i12, i13);
                }
            }
            if (appBarLayout.f3623y) {
                appBarLayout.c(appBarLayout.d(view));
            }
        }

        public final a H(Parcelable parcelable, T t10) {
            int s10 = s();
            int childCount = t10.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t10.getChildAt(i);
                int bottom = childAt.getBottom() + s10;
                if (childAt.getTop() + s10 > 0 || bottom < 0) {
                    i++;
                } else {
                    if (parcelable == null) {
                        parcelable = s0.a.f10848b;
                    }
                    a aVar = new a(parcelable);
                    boolean z10 = s10 == 0;
                    aVar.f3630s = z10;
                    aVar.f3629c = !z10 && (-s10) >= t10.getTotalScrollRange();
                    aVar.f3631t = i;
                    WeakHashMap<View, a0> weakHashMap = x.f8842a;
                    if (bottom == t10.getTopInset() + x.d.d(childAt)) {
                        z = true;
                    }
                    aVar.f3633v = z;
                    aVar.f3632u = ((float) bottom) / ((float) childAt.getHeight());
                    return aVar;
                }
            }
            return null;
        }

        public final void I(CoordinatorLayout coordinatorLayout, T t10) {
            int paddingTop = t10.getPaddingTop() + t10.getTopInset();
            int y10 = y() - paddingTop;
            int childCount = t10.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t10.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (E(cVar.f3636a, 32)) {
                    top -= cVar.topMargin;
                    bottom += cVar.bottomMargin;
                }
                int i10 = -y10;
                if (top <= i10 && bottom >= i10) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t10.getChildAt(i);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i11 = cVar2.f3636a;
                if ((i11 & 17) == 17) {
                    int i12 = -childAt2.getTop();
                    int i13 = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap<View, a0> weakHashMap = x.f8842a;
                        if (x.d.b(t10) && x.d.b(childAt2)) {
                            i12 -= t10.getTopInset();
                        }
                    }
                    if (E(i11, 2)) {
                        WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                        i13 += x.d.d(childAt2);
                    } else if (E(i11, 5)) {
                        WeakHashMap<View, a0> weakHashMap3 = x.f8842a;
                        int d10 = x.d.d(childAt2) + i13;
                        if (y10 < d10) {
                            i12 = d10;
                        } else {
                            i13 = d10;
                        }
                    }
                    if (E(i11, 32)) {
                        i12 += cVar2.topMargin;
                        i13 -= cVar2.bottomMargin;
                    }
                    if (y10 < (i13 + i12) / 2) {
                        i12 = i13;
                    }
                    D(coordinatorLayout, t10, y.c.s(i12 + paddingTop, -t10.getTotalScrollRange(), 0));
                }
            }
        }

        public final void J(CoordinatorLayout coordinatorLayout, T t10) {
            b.a aVar = b.a.f9177f;
            x.m(aVar.a(), coordinatorLayout);
            x.j(coordinatorLayout, 0);
            b.a aVar2 = b.a.g;
            x.m(aVar2.a(), coordinatorLayout);
            x.j(coordinatorLayout, 0);
            View F = F(coordinatorLayout);
            if (F != null && t10.getTotalScrollRange() != 0 && (((CoordinatorLayout.f) F.getLayoutParams()).f1619a instanceof ScrollingViewBehavior)) {
                if (y() != (-t10.getTotalScrollRange()) && F.canScrollVertically(1)) {
                    x.n(coordinatorLayout, aVar, new c(t10, false));
                }
                if (y() == 0) {
                    return;
                }
                if (F.canScrollVertically(-1)) {
                    int i = -t10.getDownNestedPreScrollRange();
                    if (i != 0) {
                        x.n(coordinatorLayout, aVar2, new b(this, coordinatorLayout, t10, F, i));
                        return;
                    }
                    return;
                }
                x.n(coordinatorLayout, aVar2, new c(t10, true));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void K(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                if (r3 >= r1) goto L_0x0020
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L_0x001d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r4 = 0
            L_0x0021:
                r0 = 1
                if (r4 == 0) goto L_0x004b
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.f3636a
                r3 = r1 & 1
                if (r3 == 0) goto L_0x004b
                java.util.WeakHashMap<android.view.View, n0.a0> r3 = n0.x.f8842a
                int r3 = n0.x.d.d(r4)
                if (r10 <= 0) goto L_0x004d
                r10 = r1 & 12
                if (r10 == 0) goto L_0x004d
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x004b
            L_0x0049:
                r9 = r0
                goto L_0x005f
            L_0x004b:
                r9 = r2
                goto L_0x005f
            L_0x004d:
                r10 = r1 & 2
                if (r10 == 0) goto L_0x004b
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x004b
                goto L_0x0049
            L_0x005f:
                boolean r10 = r8.f3623y
                if (r10 == 0) goto L_0x006b
                android.view.View r9 = r6.F(r7)
                boolean r9 = r8.d(r9)
            L_0x006b:
                boolean r9 = r8.c(r9)
                if (r11 != 0) goto L_0x009f
                if (r9 == 0) goto L_0x00a2
                java.util.List r7 = r7.e(r8)
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                int r9 = r7.size()
                r10 = r2
            L_0x007e:
                if (r10 >= r9) goto L_0x009d
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1619a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L_0x009a
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f5251f
                if (r7 == 0) goto L_0x009d
                r2 = r0
                goto L_0x009d
            L_0x009a:
                int r10 = r10 + 1
                goto L_0x007e
            L_0x009d:
                if (r2 == 0) goto L_0x00a2
            L_0x009f:
                r8.jumpDrawablesToCurrentState()
            L_0x00a2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.K(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i10;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            a aVar = this.f3627m;
            if (aVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            D(coordinatorLayout, appBarLayout, i11);
                        } else {
                            B(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            D(coordinatorLayout, appBarLayout, 0);
                        } else {
                            B(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (aVar.f3629c) {
                B(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (aVar.f3630s) {
                B(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(aVar.f3631t);
                int i12 = -childAt.getBottom();
                if (this.f3627m.f3633v) {
                    WeakHashMap<View, a0> weakHashMap = x.f8842a;
                    i10 = appBarLayout.getTopInset() + x.d.d(childAt) + i12;
                } else {
                    i10 = Math.round(((float) childAt.getHeight()) * this.f3627m.f3632u) + i12;
                }
                B(coordinatorLayout, appBarLayout, i10);
            }
            appBarLayout.f3619u = 0;
            this.f3627m = null;
            u(y.c.s(s(), -appBarLayout.getTotalScrollRange(), 0));
            K(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f3614a = s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                x.d.k(appBarLayout);
            }
            J(coordinatorLayout, appBarLayout);
            return true;
        }

        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i, i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i10, int[] iArr, int i11) {
            G(coordinatorLayout, (AppBarLayout) view, view2, i10, iArr);
        }

        public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i11 < 0) {
                iArr[1] = A(coordinatorLayout, appBarLayout, i11, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i11 == 0) {
                J(coordinatorLayout, appBarLayout);
            }
        }

        public final void n(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof a) {
                this.f3627m = (a) parcelable;
            } else {
                this.f3627m = null;
            }
        }

        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            a H = H(absSavedState, (AppBarLayout) view);
            return H == null ? absSavedState : H;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (((r4.getTotalScrollRange() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L_0x002d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                r6 = r6 & 2
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L_0x002c
                boolean r6 = r4.f3623y
                if (r6 != 0) goto L_0x002d
                int r6 = r4.getTotalScrollRange()
                if (r6 == 0) goto L_0x0014
                r6 = r0
                goto L_0x0015
            L_0x0014:
                r6 = r1
            L_0x0015:
                if (r6 == 0) goto L_0x0028
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L_0x0028
                r3 = r0
                goto L_0x0029
            L_0x0028:
                r3 = r1
            L_0x0029:
                if (r3 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r0 = r1
            L_0x002d:
                if (r0 == 0) goto L_0x0036
                android.animation.ValueAnimator r3 = r2.f3626l
                if (r3 == 0) goto L_0x0036
                r3.cancel()
            L_0x0036:
                r3 = 0
                r2.f3628n = r3
                r2.f3625k = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int):boolean");
        }

        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f3625k == 0 || i == 1) {
                I(coordinatorLayout, appBarLayout);
                if (appBarLayout.f3623y) {
                    appBarLayout.c(appBarLayout.d(view2));
                }
            }
            this.f3628n = new WeakReference<>(view2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r2 = r2.get();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean v(android.view.View r2) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                java.lang.ref.WeakReference<android.view.View> r2 = r1.f3628n
                if (r2 == 0) goto L_0x001e
                java.lang.Object r2 = r2.get()
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x001c
                boolean r0 = r2.isShown()
                if (r0 == 0) goto L_0x001c
                r0 = -1
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 != 0) goto L_0x001c
                goto L_0x001e
            L_0x001c:
                r2 = 0
                goto L_0x001f
            L_0x001e:
                r2 = 1
            L_0x001f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.v(android.view.View):boolean");
        }

        public final int w(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        public final int x(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        public final int y() {
            return s() + this.f3624j;
        }

        public final void z(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            I(coordinatorLayout, appBarLayout);
            if (appBarLayout.f3623y) {
                appBarLayout.c(appBarLayout.d(F(coordinatorLayout)));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class a extends s0.a {
            public static final Parcelable.Creator<a> CREATOR = new C0040a();

            /* renamed from: c  reason: collision with root package name */
            public boolean f3629c;

            /* renamed from: s  reason: collision with root package name */
            public boolean f3630s;

            /* renamed from: t  reason: collision with root package name */
            public int f3631t;

            /* renamed from: u  reason: collision with root package name */
            public float f3632u;

            /* renamed from: v  reason: collision with root package name */
            public boolean f3633v;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            public class C0040a implements Parcelable.ClassLoaderCreator<a> {
                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                public final Object[] newArray(int i) {
                    return new a[i];
                }

                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel, (ClassLoader) null);
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z = true;
                this.f3629c = parcel.readByte() != 0;
                this.f3630s = parcel.readByte() != 0;
                this.f3631t = parcel.readInt();
                this.f3632u = parcel.readFloat();
                this.f3633v = parcel.readByte() == 0 ? false : z;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f10849a, i);
                parcel.writeByte(this.f3629c ? (byte) 1 : 0);
                parcel.writeByte(this.f3630s ? (byte) 1 : 0);
                parcel.writeInt(this.f3631t);
                parcel.writeFloat(this.f3632u);
                parcel.writeByte(this.f3633v ? (byte) 1 : 0);
            }

            public a(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends g5.c {
        public ScrollingViewBehavior() {
        }

        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f1619a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f3624j + this.f5250e;
                if (this.f5251f == 0) {
                    i = 0;
                } else {
                    float w6 = w(view2);
                    int i10 = this.f5251f;
                    i = y.c.s((int) (w6 * ((float) i10)), 0, i10);
                }
                int i11 = bottom - i;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                view.offsetTopAndBottom(i11);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f3623y) {
                    appBarLayout.c(appBarLayout.d(view));
                }
            }
            return false;
        }

        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                x.m(b.a.f9177f.a(), coordinatorLayout);
                x.j(coordinatorLayout, 0);
                x.m(b.a.g.a(), coordinatorLayout);
                x.j(coordinatorLayout, 0);
            }
        }

        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout y10 = v(coordinatorLayout.d(view));
            int i = 0;
            if (y10 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f5248c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    if (!z) {
                        i = 4;
                    }
                    y10.f3619u = 2 | i | 8;
                    y10.requestLayout();
                    return true;
                }
            }
            return false;
        }

        public final float w(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f1619a;
                int y10 = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).y() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + y10 > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) y10) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public final int x(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }

        /* renamed from: y */
        public final AppBarLayout v(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5.a.z);
            this.f5251f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public static abstract class a {
    }

    public static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f3634a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f3635b = new Rect();
    }

    /* renamed from: a */
    public final c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new c((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public final void b() {
        Behavior behavior = this.E;
        BaseBehavior.a H = (behavior == null || this.f3615b == -1 || this.f3619u != 0) ? null : behavior.H(s0.a.f10848b, this);
        this.f3615b = -1;
        this.f3616c = -1;
        this.f3617s = -1;
        if (H != null) {
            Behavior behavior2 = this.E;
            if (behavior2.f3627m == null) {
                behavior2.f3627m = H;
            }
        }
    }

    public final boolean c(boolean z10) {
        if (!(!this.f3620v) || this.f3622x == z10) {
            return false;
        }
        this.f3622x = z10;
        refreshDrawableState();
        if (!this.f3623y || !(getBackground() instanceof f)) {
            return true;
        }
        f fVar = (f) getBackground();
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        float f10 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f10, dimension});
        this.B = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.B.setInterpolator(f5.a.f4984a);
        this.B.addUpdateListener(new g5.a(this, fVar));
        this.B.start();
        return true;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean d(View view) {
        int i;
        View view2 = null;
        if (this.A == null && (i = this.z) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.z);
            }
            if (findViewById != null) {
                this.A = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.A;
        if (weakReference != null) {
            view2 = weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.D != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f3614a));
            this.D.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.D;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (!x.d.b(childAt)) {
            return true;
        }
        return false;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.E = behavior;
        return behavior;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f3616c
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + -1
            r1 = 0
            r2 = r1
        L_0x000e:
            if (r0 < 0) goto L_0x0060
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r4 = (com.google.android.material.appbar.AppBarLayout.c) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f3636a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x005a
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L_0x0036
            java.util.WeakHashMap<android.view.View, n0.a0> r4 = n0.x.f8842a
            int r4 = n0.x.d.d(r3)
        L_0x0034:
            int r4 = r4 + r7
            goto L_0x0045
        L_0x0036:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x0043
            java.util.WeakHashMap<android.view.View, n0.a0> r4 = n0.x.f8842a
            int r4 = n0.x.d.d(r3)
            int r4 = r5 - r4
            goto L_0x0034
        L_0x0043:
            int r4 = r7 + r5
        L_0x0045:
            if (r0 != 0) goto L_0x0058
            java.util.WeakHashMap<android.view.View, n0.a0> r6 = n0.x.f8842a
            boolean r3 = n0.x.d.b(r3)
            if (r3 == 0) goto L_0x0058
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L_0x0058:
            int r2 = r2 + r4
            goto L_0x005d
        L_0x005a:
            if (r2 <= 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            int r0 = r0 + -1
            goto L_0x000e
        L_0x0060:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f3616c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i = this.f3617s;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = cVar.topMargin + cVar.bottomMargin + childAt.getMeasuredHeight();
            int i12 = cVar.f3636a;
            if ((i12 & 1) == 0) {
                break;
            }
            i11 += measuredHeight;
            if ((i12 & 2) != 0) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                i11 -= x.d.d(childAt);
                break;
            }
            i10++;
        }
        int max = Math.max(0, i11);
        this.f3617s = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.z;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        int d10 = x.d.d(this);
        if (d10 == 0) {
            int childCount = getChildCount();
            d10 = childCount >= 1 ? x.d.d(getChildAt(childCount - 1)) : 0;
            if (d10 == 0) {
                return getHeight() / 3;
            }
        }
        return (d10 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f3619u;
    }

    public Drawable getStatusBarForeground() {
        return this.D;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f3615b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i12 = cVar.f3636a;
            if ((i12 & 1) == 0) {
                break;
            }
            int i13 = measuredHeight + cVar.topMargin + cVar.bottomMargin + i11;
            if (i10 == 0) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                if (x.d.b(childAt)) {
                    i13 -= getTopInset();
                }
            }
            i11 = i13;
            if ((i12 & 2) != 0) {
                WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                i11 -= x.d.d(childAt);
                break;
            }
            i10++;
        }
        int max = Math.max(0, i11);
        this.f3615b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a.b.E0(this);
    }

    public final int[] onCreateDrawableState(int i) {
        if (this.C == null) {
            this.C = new int[4];
        }
        int[] iArr = this.C;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z10 = this.f3621w;
        iArr[0] = z10 ? R.attr.state_liftable : -2130904045;
        iArr[1] = (!z10 || !this.f3622x) ? -2130904046 : R.attr.state_lifted;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130904043;
        iArr[3] = (!z10 || !this.f3622x) ? -2130904042 : R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.A;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A = null;
    }

    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        boolean z11;
        super.onLayout(z10, i, i10, i11, i12);
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        boolean z12 = true;
        if (x.d.b(this) && e()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        b();
        this.f3618t = false;
        int childCount2 = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount2) {
                break;
            } else if (((c) getChildAt(i13).getLayoutParams()).f3638c != null) {
                this.f3618t = true;
                break;
            } else {
                i13++;
            }
        }
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f3620v) {
            if (!this.f3623y) {
                int childCount3 = getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= childCount3) {
                        z11 = false;
                        break;
                    }
                    int i15 = ((c) getChildAt(i14).getLayoutParams()).f3636a;
                    if ((i15 & 1) == 1 && (i15 & 10) != 0) {
                        z11 = true;
                        break;
                    }
                    i14++;
                }
                if (!z11) {
                    z12 = false;
                }
            }
            if (this.f3621w != z12) {
                this.f3621w = z12;
                refreshDrawableState();
            }
        }
    }

    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 1073741824) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            if (x.d.b(this) && e()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = y.c.s(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i10));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a.b.D0(this, f10);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        boolean c10 = x.g.c(this);
        int i = z10 ? 1 : 2;
        int i10 = 0;
        if (c10) {
            i10 = 4;
        }
        this.f3619u = i | i10 | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z10) {
        this.f3623y = z10;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.z = i;
        WeakReference<View> weakReference = this.A;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f3620v = z10;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.D;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.D = drawable3;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.D.setState(getDrawableState());
                }
                Drawable drawable4 = this.D;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                drawable4.setLayoutDirection(x.e.d(this));
                this.D.setVisible(getVisibility() == 0, false);
                this.D.setCallback(this);
            }
            if (this.D != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(true ^ z10);
            WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
            x.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(a.b.a0(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = (long) integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130904046}, ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(j10));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(this, "elevation", new float[]{f10}).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(0));
        setStateListAnimator(stateListAnimator);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z10 = i == 0;
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.D;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m9generateDefaultLayoutParams() {
        return new c();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m10generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f3636a = 1;

        /* renamed from: b  reason: collision with root package name */
        public a f3637b;

        /* renamed from: c  reason: collision with root package name */
        public Interpolator f3638c;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            b bVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5.a.f4617a);
            this.f3636a = obtainStyledAttributes.getInt(1, 0);
            if (obtainStyledAttributes.getInt(0, 0) != 1) {
                bVar = null;
            } else {
                bVar = new b();
            }
            this.f3637b = bVar;
            if (obtainStyledAttributes.hasValue(2)) {
                this.f3638c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c() {
            super(-1, -2);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
