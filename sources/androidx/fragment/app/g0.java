package androidx.fragment.app;

import a1.d;
import a1.n;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.r0;
import androidx.lifecycle.r;
import e6.e;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final y f1900a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f1901b;

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f1902c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1903d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f1904e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1905a;

        public a(View view) {
            this.f1905a = view;
        }

        public final void onViewAttachedToWindow(View view) {
            this.f1905a.removeOnAttachStateChangeListener(this);
            View view2 = this.f1905a;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.h.c(view2);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1906a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.r$c[] r0 = androidx.lifecycle.r.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1906a = r0
                androidx.lifecycle.r$c r1 = androidx.lifecycle.r.c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1906a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.r$c r1 = androidx.lifecycle.r.c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1906a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.r$c r1 = androidx.lifecycle.r.c.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1906a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.r$c r1 = androidx.lifecycle.r.c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g0.b.<clinit>():void");
        }
    }

    public g0(y yVar, h0 h0Var, Fragment fragment) {
        this.f1900a = yVar;
        this.f1901b = h0Var;
        this.f1902c = fragment;
    }

    public final void a() {
        if (a0.K(3)) {
            StringBuilder d10 = a.a.d("moveto ACTIVITY_CREATED: ");
            d10.append(this.f1902c);
            Log.d("FragmentManager", d10.toString());
        }
        Fragment fragment = this.f1902c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        y yVar = this.f1900a;
        Fragment fragment2 = this.f1902c;
        yVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public final void b() {
        int i;
        View view;
        View view2;
        h0 h0Var = this.f1901b;
        Fragment fragment = this.f1902c;
        Objects.requireNonNull(h0Var);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int indexOf = ((ArrayList) h0Var.f1911a).indexOf(fragment);
            int i10 = indexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= ((ArrayList) h0Var.f1911a).size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) ((ArrayList) h0Var.f1911a).get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) ((ArrayList) h0Var.f1911a).get(i10);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
            Fragment fragment4 = this.f1902c;
            fragment4.mContainer.addView(fragment4.mView, i);
        }
        i = -1;
        Fragment fragment42 = this.f1902c;
        fragment42.mContainer.addView(fragment42.mView, i);
    }

    public final void c() {
        if (a0.K(3)) {
            StringBuilder d10 = a.a.d("moveto ATTACHED: ");
            d10.append(this.f1902c);
            Log.d("FragmentManager", d10.toString());
        }
        Fragment fragment = this.f1902c;
        Fragment fragment2 = fragment.mTarget;
        g0 g0Var = null;
        if (fragment2 != null) {
            g0 g = this.f1901b.g(fragment2.mWho);
            if (g != null) {
                Fragment fragment3 = this.f1902c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                g0Var = g;
            } else {
                StringBuilder d11 = a.a.d("Fragment ");
                d11.append(this.f1902c);
                d11.append(" declared target fragment ");
                d11.append(this.f1902c.mTarget);
                d11.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(d11.toString());
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (g0Var = this.f1901b.g(str)) == null) {
                StringBuilder d12 = a.a.d("Fragment ");
                d12.append(this.f1902c);
                d12.append(" declared target fragment ");
                throw new IllegalStateException(android.support.v4.media.a.e(d12, this.f1902c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (g0Var != null) {
            g0Var.k();
        }
        Fragment fragment4 = this.f1902c;
        a0 a0Var = fragment4.mFragmentManager;
        fragment4.mHost = a0Var.f1815p;
        fragment4.mParentFragment = a0Var.f1817r;
        this.f1900a.g(fragment4, false);
        this.f1902c.performAttach();
        this.f1900a.b(this.f1902c, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.fragment.app.r0$e$b} */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r9v4, types: [androidx.fragment.app.r0$e$b] */
    /* JADX WARNING: type inference failed for: r8v6, types: [androidx.fragment.app.r0$e$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d() {
        /*
            r13 = this;
            androidx.fragment.app.Fragment r0 = r13.f1902c
            androidx.fragment.app.a0 r1 = r0.mFragmentManager
            if (r1 != 0) goto L_0x0009
            int r0 = r0.mState
            return r0
        L_0x0009:
            int r1 = r13.f1904e
            int[] r2 = androidx.fragment.app.g0.b.f1906a
            androidx.lifecycle.r$c r0 = r0.mMaxState
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = -1
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L_0x0037
            if (r0 == r6) goto L_0x0033
            if (r0 == r4) goto L_0x002e
            if (r0 == r5) goto L_0x0028
            int r1 = java.lang.Math.min(r1, r2)
            goto L_0x0037
        L_0x0028:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0037
        L_0x002e:
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x0037
        L_0x0033:
            int r1 = java.lang.Math.min(r1, r3)
        L_0x0037:
            androidx.fragment.app.Fragment r0 = r13.f1902c
            boolean r8 = r0.mFromLayout
            if (r8 == 0) goto L_0x0067
            boolean r8 = r0.mInLayout
            if (r8 == 0) goto L_0x0058
            int r0 = r13.f1904e
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.Fragment r0 = r13.f1902c
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L_0x0067
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0067
            int r1 = java.lang.Math.min(r1, r6)
            goto L_0x0067
        L_0x0058:
            int r8 = r13.f1904e
            if (r8 >= r5) goto L_0x0063
            int r0 = r0.mState
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0067
        L_0x0063:
            int r1 = java.lang.Math.min(r1, r7)
        L_0x0067:
            androidx.fragment.app.Fragment r0 = r13.f1902c
            boolean r0 = r0.mAdded
            if (r0 != 0) goto L_0x0071
            int r1 = java.lang.Math.min(r1, r7)
        L_0x0071:
            androidx.fragment.app.Fragment r0 = r13.f1902c
            android.view.ViewGroup r8 = r0.mContainer
            r9 = 0
            if (r8 == 0) goto L_0x00bc
            androidx.fragment.app.a0 r0 = r0.getParentFragmentManager()
            androidx.fragment.app.r0 r0 = androidx.fragment.app.r0.f(r8, r0)
            java.util.Objects.requireNonNull(r0)
            androidx.fragment.app.Fragment r8 = r13.f1902c
            androidx.fragment.app.r0$e r8 = r0.d(r8)
            if (r8 == 0) goto L_0x008e
            androidx.fragment.app.r0$e$b r8 = r8.f1994b
            goto L_0x008f
        L_0x008e:
            r8 = r9
        L_0x008f:
            androidx.fragment.app.Fragment r10 = r13.f1902c
            java.util.ArrayList<androidx.fragment.app.r0$e> r0 = r0.f1983c
            java.util.Iterator r0 = r0.iterator()
        L_0x0097:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00b0
            java.lang.Object r11 = r0.next()
            androidx.fragment.app.r0$e r11 = (androidx.fragment.app.r0.e) r11
            androidx.fragment.app.Fragment r12 = r11.f1995c
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x0097
            boolean r12 = r11.f1998f
            if (r12 != 0) goto L_0x0097
            r9 = r11
        L_0x00b0:
            if (r9 == 0) goto L_0x00bb
            if (r8 == 0) goto L_0x00b8
            androidx.fragment.app.r0$e$b r0 = androidx.fragment.app.r0.e.b.NONE
            if (r8 != r0) goto L_0x00bb
        L_0x00b8:
            androidx.fragment.app.r0$e$b r9 = r9.f1994b
            goto L_0x00bc
        L_0x00bb:
            r9 = r8
        L_0x00bc:
            androidx.fragment.app.r0$e$b r0 = androidx.fragment.app.r0.e.b.ADDING
            if (r9 != r0) goto L_0x00c6
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x00e4
        L_0x00c6:
            androidx.fragment.app.r0$e$b r0 = androidx.fragment.app.r0.e.b.REMOVING
            if (r9 != r0) goto L_0x00cf
            int r1 = java.lang.Math.max(r1, r4)
            goto L_0x00e4
        L_0x00cf:
            androidx.fragment.app.Fragment r0 = r13.f1902c
            boolean r4 = r0.mRemoving
            if (r4 == 0) goto L_0x00e4
            boolean r0 = r0.isInBackStack()
            if (r0 == 0) goto L_0x00e0
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x00e4
        L_0x00e0:
            int r1 = java.lang.Math.min(r1, r2)
        L_0x00e4:
            androidx.fragment.app.Fragment r0 = r13.f1902c
            boolean r2 = r0.mDeferStart
            if (r2 == 0) goto L_0x00f2
            int r0 = r0.mState
            if (r0 >= r3) goto L_0x00f2
            int r1 = java.lang.Math.min(r1, r5)
        L_0x00f2:
            boolean r0 = androidx.fragment.app.a0.K(r6)
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "computeExpectedState() of "
            java.lang.String r2 = " for "
            java.lang.StringBuilder r0 = a8.a.d(r0, r1, r2)
            androidx.fragment.app.Fragment r2 = r13.f1902c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        L_0x010e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g0.d():int");
    }

    public final void e() {
        if (a0.K(3)) {
            StringBuilder d10 = a.a.d("moveto CREATED: ");
            d10.append(this.f1902c);
            Log.d("FragmentManager", d10.toString());
        }
        Fragment fragment = this.f1902c;
        if (!fragment.mIsCreated) {
            this.f1900a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f1902c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            y yVar = this.f1900a;
            Fragment fragment3 = this.f1902c;
            yVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f1902c.mState = 1;
    }

    public final void f() {
        String str;
        if (!this.f1902c.mFromLayout) {
            if (a0.K(3)) {
                StringBuilder d10 = a.a.d("moveto CREATE_VIEW: ");
                d10.append(this.f1902c);
                Log.d("FragmentManager", d10.toString());
            }
            Fragment fragment = this.f1902c;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f1902c;
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.mContainerId;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.mFragmentManager.f1816q.b(i);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f1902c;
                            if (!fragment3.mRestored) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.f1902c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder d11 = a.a.d("No view found for id 0x");
                                d11.append(Integer.toHexString(this.f1902c.mContainerId));
                                d11.append(" (");
                                d11.append(str);
                                d11.append(") for fragment ");
                                d11.append(this.f1902c);
                                throw new IllegalArgumentException(d11.toString());
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            Fragment fragment4 = this.f1902c;
                            d dVar = d.f23a;
                            e.D(fragment4, "fragment");
                            n nVar = new n(fragment4, viewGroup);
                            d dVar2 = d.f23a;
                            d.c(nVar);
                            d.c a10 = d.a(fragment4);
                            if (a10.f26a.contains(d.a.DETECT_WRONG_FRAGMENT_CONTAINER) && d.f(a10, fragment4.getClass(), n.class)) {
                                d.b(a10, nVar);
                            }
                        }
                    } else {
                        StringBuilder d12 = a.a.d("Cannot create fragment ");
                        d12.append(this.f1902c);
                        d12.append(" for a container view with no id");
                        throw new IllegalArgumentException(d12.toString());
                    }
                }
            }
            Fragment fragment5 = this.f1902c;
            fragment5.mContainer = viewGroup;
            fragment5.performCreateView(performGetLayoutInflater, viewGroup, fragment5.mSavedFragmentState);
            View view = this.f1902c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment6 = this.f1902c;
                fragment6.mView.setTag(R.id.fragment_container_view_tag, fragment6);
                if (viewGroup != null) {
                    b();
                }
                Fragment fragment7 = this.f1902c;
                if (fragment7.mHidden) {
                    fragment7.mView.setVisibility(8);
                }
                View view2 = this.f1902c.mView;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                if (x.g.b(view2)) {
                    x.h.c(this.f1902c.mView);
                } else {
                    View view3 = this.f1902c.mView;
                    view3.addOnAttachStateChangeListener(new a(view3));
                }
                this.f1902c.performViewCreated();
                y yVar = this.f1900a;
                Fragment fragment8 = this.f1902c;
                yVar.m(fragment8, fragment8.mView, fragment8.mSavedFragmentState, false);
                int visibility = this.f1902c.mView.getVisibility();
                this.f1902c.setPostOnViewCreatedAlpha(this.f1902c.mView.getAlpha());
                Fragment fragment9 = this.f1902c;
                if (fragment9.mContainer != null && visibility == 0) {
                    View findFocus = fragment9.mView.findFocus();
                    if (findFocus != null) {
                        this.f1902c.setFocusedView(findFocus);
                        if (a0.K(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f1902c);
                        }
                    }
                    this.f1902c.mView.setAlpha(0.0f);
                }
            }
            this.f1902c.mState = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.a0.K(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "movefrom CREATED: "
            java.lang.StringBuilder r0 = a.a.d(r0)
            androidx.fragment.app.Fragment r1 = r7.f1902c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L_0x001b:
            androidx.fragment.app.Fragment r0 = r7.f1902c
            boolean r1 = r0.mRemoving
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002b
            boolean r0 = r0.isInBackStack()
            if (r0 != 0) goto L_0x002b
            r0 = r3
            goto L_0x002c
        L_0x002b:
            r0 = r2
        L_0x002c:
            r1 = 0
            if (r0 == 0) goto L_0x003c
            androidx.fragment.app.Fragment r4 = r7.f1902c
            boolean r5 = r4.mBeingSaved
            if (r5 != 0) goto L_0x003c
            androidx.fragment.app.h0 r5 = r7.f1901b
            java.lang.String r4 = r4.mWho
            r5.k(r4, r1)
        L_0x003c:
            if (r0 != 0) goto L_0x005e
            androidx.fragment.app.h0 r4 = r7.f1901b
            java.lang.Object r4 = r4.f1914d
            androidx.fragment.app.d0 r4 = (androidx.fragment.app.d0) r4
            androidx.fragment.app.Fragment r5 = r7.f1902c
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r6 = r4.f1872c
            java.lang.String r5 = r5.mWho
            boolean r5 = r6.containsKey(r5)
            if (r5 != 0) goto L_0x0051
            goto L_0x0058
        L_0x0051:
            boolean r5 = r4.f1875u
            if (r5 == 0) goto L_0x0058
            boolean r4 = r4.f1876v
            goto L_0x0059
        L_0x0058:
            r4 = r3
        L_0x0059:
            if (r4 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r4 = r2
            goto L_0x005f
        L_0x005e:
            r4 = r3
        L_0x005f:
            if (r4 == 0) goto L_0x00e3
            androidx.fragment.app.Fragment r4 = r7.f1902c
            androidx.fragment.app.w<?> r4 = r4.mHost
            boolean r5 = r4 instanceof androidx.lifecycle.y0
            if (r5 == 0) goto L_0x0072
            androidx.fragment.app.h0 r3 = r7.f1901b
            java.lang.Object r3 = r3.f1914d
            androidx.fragment.app.d0 r3 = (androidx.fragment.app.d0) r3
            boolean r3 = r3.f1876v
            goto L_0x007f
        L_0x0072:
            android.content.Context r4 = r4.f2010b
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L_0x007f
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r4 = r4.isChangingConfigurations()
            r3 = r3 ^ r4
        L_0x007f:
            if (r0 == 0) goto L_0x0087
            androidx.fragment.app.Fragment r0 = r7.f1902c
            boolean r0 = r0.mBeingSaved
            if (r0 == 0) goto L_0x0089
        L_0x0087:
            if (r3 == 0) goto L_0x0094
        L_0x0089:
            androidx.fragment.app.h0 r0 = r7.f1901b
            java.lang.Object r0 = r0.f1914d
            androidx.fragment.app.d0 r0 = (androidx.fragment.app.d0) r0
            androidx.fragment.app.Fragment r3 = r7.f1902c
            r0.j(r3)
        L_0x0094:
            androidx.fragment.app.Fragment r0 = r7.f1902c
            r0.performDestroy()
            androidx.fragment.app.y r0 = r7.f1900a
            androidx.fragment.app.Fragment r3 = r7.f1902c
            r0.d(r3, r2)
            androidx.fragment.app.h0 r0 = r7.f1901b
            java.util.List r0 = r0.e()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00ac:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00cf
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.g0 r2 = (androidx.fragment.app.g0) r2
            if (r2 == 0) goto L_0x00ac
            androidx.fragment.app.Fragment r2 = r2.f1902c
            androidx.fragment.app.Fragment r3 = r7.f1902c
            java.lang.String r3 = r3.mWho
            java.lang.String r4 = r2.mTargetWho
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ac
            androidx.fragment.app.Fragment r3 = r7.f1902c
            r2.mTarget = r3
            r2.mTargetWho = r1
            goto L_0x00ac
        L_0x00cf:
            androidx.fragment.app.Fragment r0 = r7.f1902c
            java.lang.String r1 = r0.mTargetWho
            if (r1 == 0) goto L_0x00dd
            androidx.fragment.app.h0 r2 = r7.f1901b
            androidx.fragment.app.Fragment r1 = r2.c(r1)
            r0.mTarget = r1
        L_0x00dd:
            androidx.fragment.app.h0 r0 = r7.f1901b
            r0.j(r7)
            goto L_0x00fd
        L_0x00e3:
            androidx.fragment.app.Fragment r0 = r7.f1902c
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L_0x00f9
            androidx.fragment.app.h0 r1 = r7.f1901b
            androidx.fragment.app.Fragment r0 = r1.c(r0)
            if (r0 == 0) goto L_0x00f9
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto L_0x00f9
            androidx.fragment.app.Fragment r1 = r7.f1902c
            r1.mTarget = r0
        L_0x00f9:
            androidx.fragment.app.Fragment r0 = r7.f1902c
            r0.mState = r2
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.g0.g():void");
    }

    public final void h() {
        View view;
        if (a0.K(3)) {
            StringBuilder d10 = a.a.d("movefrom CREATE_VIEW: ");
            d10.append(this.f1902c);
            Log.d("FragmentManager", d10.toString());
        }
        Fragment fragment = this.f1902c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f1902c.performDestroyView();
        this.f1900a.n(this.f1902c, false);
        Fragment fragment2 = this.f1902c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.j(null);
        this.f1902c.mInLayout = false;
    }

    public final void i() {
        if (a0.K(3)) {
            StringBuilder d10 = a.a.d("movefrom ATTACHED: ");
            d10.append(this.f1902c);
            Log.d("FragmentManager", d10.toString());
        }
        this.f1902c.performDetach();
        boolean z = false;
        this.f1900a.e(this.f1902c, false);
        Fragment fragment = this.f1902c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z10 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (!z) {
            d0 d0Var = (d0) this.f1901b.f1914d;
            if (d0Var.f1872c.containsKey(this.f1902c.mWho) && d0Var.f1875u) {
                z10 = d0Var.f1876v;
            }
            if (!z10) {
                return;
            }
        }
        if (a0.K(3)) {
            StringBuilder d11 = a.a.d("initState called for fragment: ");
            d11.append(this.f1902c);
            Log.d("FragmentManager", d11.toString());
        }
        this.f1902c.initState();
    }

    public final void j() {
        Fragment fragment = this.f1902c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (a0.K(3)) {
                StringBuilder d10 = a.a.d("moveto CREATE_VIEW: ");
                d10.append(this.f1902c);
                Log.d("FragmentManager", d10.toString());
            }
            Fragment fragment2 = this.f1902c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.f1902c.mSavedFragmentState);
            View view = this.f1902c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f1902c;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f1902c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f1902c.performViewCreated();
                y yVar = this.f1900a;
                Fragment fragment5 = this.f1902c;
                yVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f1902c.mState = 2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f1903d) {
            try {
                this.f1903d = true;
                boolean z = false;
                while (true) {
                    int d10 = d();
                    Fragment fragment = this.f1902c;
                    int i = fragment.mState;
                    if (d10 != i) {
                        if (d10 <= i) {
                            switch (i - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    if (fragment.mBeingSaved) {
                                        if (((f0) ((HashMap) this.f1901b.f1913c).get(fragment.mWho)) == null) {
                                            o();
                                        }
                                    }
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f1902c.mState = 1;
                                    break;
                                case 2:
                                    fragment.mInLayout = false;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (a0.K(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f1902c);
                                    }
                                    Fragment fragment2 = this.f1902c;
                                    if (fragment2.mBeingSaved) {
                                        o();
                                    } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        p();
                                    }
                                    Fragment fragment3 = this.f1902c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        r0 f10 = r0.f(viewGroup2, fragment3.getParentFragmentManager());
                                        Objects.requireNonNull(f10);
                                        if (a0.K(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f1902c);
                                        }
                                        f10.a(r0.e.c.REMOVED, r0.e.b.REMOVING, this);
                                    }
                                    this.f1902c.mState = 3;
                                    break;
                                case 4:
                                    r();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        r0 f11 = r0.f(viewGroup3, fragment.getParentFragmentManager());
                                        r0.e.c from = r0.e.c.from(this.f1902c.mView.getVisibility());
                                        Objects.requireNonNull(f11);
                                        if (a0.K(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f1902c);
                                        }
                                        f11.a(from, r0.e.b.ADDING, this);
                                    }
                                    this.f1902c.mState = 4;
                                    break;
                                case 5:
                                    q();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                        z = true;
                    } else {
                        if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f1902c.mBeingSaved) {
                            if (a0.K(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f1902c);
                            }
                            ((d0) this.f1901b.f1914d).j(this.f1902c);
                            this.f1901b.j(this);
                            if (a0.K(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f1902c);
                            }
                            this.f1902c.initState();
                        }
                        Fragment fragment4 = this.f1902c;
                        if (fragment4.mHiddenChanged) {
                            if (!(fragment4.mView == null || (viewGroup = fragment4.mContainer) == null)) {
                                r0 f12 = r0.f(viewGroup, fragment4.getParentFragmentManager());
                                if (this.f1902c.mHidden) {
                                    Objects.requireNonNull(f12);
                                    if (a0.K(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f1902c);
                                    }
                                    f12.a(r0.e.c.GONE, r0.e.b.NONE, this);
                                } else {
                                    Objects.requireNonNull(f12);
                                    if (a0.K(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f1902c);
                                    }
                                    f12.a(r0.e.c.VISIBLE, r0.e.b.NONE, this);
                                }
                            }
                            Fragment fragment5 = this.f1902c;
                            a0 a0Var = fragment5.mFragmentManager;
                            if (a0Var != null && fragment5.mAdded && a0Var.L(fragment5)) {
                                a0Var.z = true;
                            }
                            Fragment fragment6 = this.f1902c;
                            fragment6.mHiddenChanged = false;
                            fragment6.onHiddenChanged(fragment6.mHidden);
                            this.f1902c.mChildFragmentManager.o();
                        }
                        this.f1903d = false;
                        return;
                    }
                }
            } catch (Throwable th2) {
                this.f1903d = false;
                throw th2;
            }
        } else if (a0.K(2)) {
            StringBuilder d11 = a.a.d("Ignoring re-entrant call to moveToExpectedState() for ");
            d11.append(this.f1902c);
            Log.v("FragmentManager", d11.toString());
        }
    }

    public final void l() {
        if (a0.K(3)) {
            StringBuilder d10 = a.a.d("movefrom RESUMED: ");
            d10.append(this.f1902c);
            Log.d("FragmentManager", d10.toString());
        }
        this.f1902c.performPause();
        this.f1900a.f(this.f1902c, false);
    }

    public final void m(ClassLoader classLoader) {
        Bundle bundle = this.f1902c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f1902c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f1902c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f1902c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.f1902c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f1902c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f1902c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f1902c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    public final void n() {
        if (a0.K(3)) {
            StringBuilder d10 = a.a.d("moveto RESUMED: ");
            d10.append(this.f1902c);
            Log.d("FragmentManager", d10.toString());
        }
        View focusedView = this.f1902c.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != this.f1902c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == this.f1902c.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z) {
                boolean requestFocus = focusedView.requestFocus();
                if (a0.K(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("requestFocus: Restoring focused view ");
                    sb2.append(focusedView);
                    sb2.append(" ");
                    sb2.append(requestFocus ? "succeeded" : "failed");
                    sb2.append(" on Fragment ");
                    sb2.append(this.f1902c);
                    sb2.append(" resulting in focused view ");
                    sb2.append(this.f1902c.mView.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
        this.f1902c.setFocusedView((View) null);
        this.f1902c.performResume();
        this.f1900a.i(this.f1902c, false);
        Fragment fragment = this.f1902c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final void o() {
        f0 f0Var = new f0(this.f1902c);
        Fragment fragment = this.f1902c;
        if (fragment.mState <= -1 || f0Var.B != null) {
            f0Var.B = fragment.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            this.f1902c.performSaveInstanceState(bundle);
            this.f1900a.j(this.f1902c, bundle, false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (this.f1902c.mView != null) {
                p();
            }
            if (this.f1902c.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", this.f1902c.mSavedViewState);
            }
            if (this.f1902c.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", this.f1902c.mSavedViewRegistryState);
            }
            if (!this.f1902c.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", this.f1902c.mUserVisibleHint);
            }
            f0Var.B = bundle;
            if (this.f1902c.mTargetWho != null) {
                if (bundle == null) {
                    f0Var.B = new Bundle();
                }
                f0Var.B.putString("android:target_state", this.f1902c.mTargetWho);
                int i = this.f1902c.mTargetRequestCode;
                if (i != 0) {
                    f0Var.B.putInt("android:target_req_state", i);
                }
            }
        }
        this.f1901b.k(this.f1902c.mWho, f0Var);
    }

    public final void p() {
        if (this.f1902c.mView != null) {
            if (a0.K(2)) {
                StringBuilder d10 = a.a.d("Saving view state for fragment ");
                d10.append(this.f1902c);
                d10.append(" with view ");
                d10.append(this.f1902c.mView);
                Log.v("FragmentManager", d10.toString());
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1902c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f1902c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f1902c.mViewLifecycleOwner.f1976t.b(bundle);
            if (!bundle.isEmpty()) {
                this.f1902c.mSavedViewRegistryState = bundle;
            }
        }
    }

    public final void q() {
        if (a0.K(3)) {
            StringBuilder d10 = a.a.d("moveto STARTED: ");
            d10.append(this.f1902c);
            Log.d("FragmentManager", d10.toString());
        }
        this.f1902c.performStart();
        this.f1900a.k(this.f1902c, false);
    }

    public final void r() {
        if (a0.K(3)) {
            StringBuilder d10 = a.a.d("movefrom STARTED: ");
            d10.append(this.f1902c);
            Log.d("FragmentManager", d10.toString());
        }
        this.f1902c.performStop();
        this.f1900a.l(this.f1902c, false);
    }

    public g0(y yVar, h0 h0Var, ClassLoader classLoader, v vVar, f0 f0Var) {
        this.f1900a = yVar;
        this.f1901b = h0Var;
        Fragment a10 = vVar.a(classLoader, f0Var.f1885a);
        Bundle bundle = f0Var.f1894y;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.setArguments(f0Var.f1894y);
        a10.mWho = f0Var.f1886b;
        a10.mFromLayout = f0Var.f1887c;
        a10.mRestored = true;
        a10.mFragmentId = f0Var.f1888s;
        a10.mContainerId = f0Var.f1889t;
        a10.mTag = f0Var.f1890u;
        a10.mRetainInstance = f0Var.f1891v;
        a10.mRemoving = f0Var.f1892w;
        a10.mDetached = f0Var.f1893x;
        a10.mHidden = f0Var.z;
        a10.mMaxState = r.c.values()[f0Var.A];
        Bundle bundle2 = f0Var.B;
        if (bundle2 != null) {
            a10.mSavedFragmentState = bundle2;
        } else {
            a10.mSavedFragmentState = new Bundle();
        }
        this.f1902c = a10;
        if (a0.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public g0(y yVar, h0 h0Var, Fragment fragment, f0 f0Var) {
        this.f1900a = yVar;
        this.f1901b = h0Var;
        this.f1902c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = f0Var.B;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
