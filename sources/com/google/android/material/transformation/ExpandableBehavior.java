package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f4172a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f4173a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f4174b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ v5.a f4175c;

        public a(View view, int i, v5.a aVar) {
            this.f4173a = view;
            this.f4174b = i;
            this.f4175c = aVar;
        }

        public final boolean onPreDraw() {
            this.f4173a.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f4172a == this.f4174b) {
                v5.a aVar = this.f4175c;
                expandableBehavior.s((View) aVar, this.f4173a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public abstract boolean b(View view, View view2);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = r3.f4172a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.View r6) {
        /*
            r3 = this;
            v5.a r6 = (v5.a) r6
            boolean r4 = r6.a()
            r0 = 1
            r1 = 2
            r2 = 0
            if (r4 == 0) goto L_0x0012
            int r4 = r3.f4172a
            if (r4 == 0) goto L_0x0016
            if (r4 != r1) goto L_0x0018
            goto L_0x0016
        L_0x0012:
            int r4 = r3.f4172a
            if (r4 != r0) goto L_0x0018
        L_0x0016:
            r4 = r0
            goto L_0x0019
        L_0x0018:
            r4 = r2
        L_0x0019:
            if (r4 == 0) goto L_0x002f
            boolean r4 = r6.a()
            if (r4 == 0) goto L_0x0022
            r1 = r0
        L_0x0022:
            r3.f4172a = r1
            r4 = r6
            android.view.View r4 = (android.view.View) r4
            boolean r6 = r6.a()
            r3.s(r4, r5, r6, r0)
            return r0
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.d(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r5 = r4.f4172a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, int r7) {
        /*
            r4 = this;
            java.util.WeakHashMap<android.view.View, n0.a0> r7 = n0.x.f8842a
            boolean r7 = n0.x.g.c(r6)
            r0 = 0
            if (r7 != 0) goto L_0x0058
            java.util.List r5 = r5.d(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r7 = r5.size()
            r1 = r0
        L_0x0014:
            if (r1 >= r7) goto L_0x0028
            java.lang.Object r2 = r5.get(r1)
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r4.b(r6, r2)
            if (r3 == 0) goto L_0x0025
            v5.a r2 = (v5.a) r2
            goto L_0x0029
        L_0x0025:
            int r1 = r1 + 1
            goto L_0x0014
        L_0x0028:
            r2 = 0
        L_0x0029:
            if (r2 == 0) goto L_0x0058
            boolean r5 = r2.a()
            r7 = 2
            r1 = 1
            if (r5 == 0) goto L_0x003a
            int r5 = r4.f4172a
            if (r5 == 0) goto L_0x003e
            if (r5 != r7) goto L_0x0040
            goto L_0x003e
        L_0x003a:
            int r5 = r4.f4172a
            if (r5 != r1) goto L_0x0040
        L_0x003e:
            r5 = r1
            goto L_0x0041
        L_0x0040:
            r5 = r0
        L_0x0041:
            if (r5 == 0) goto L_0x0058
            boolean r5 = r2.a()
            if (r5 == 0) goto L_0x004a
            r7 = r1
        L_0x004a:
            r4.f4172a = r7
            android.view.ViewTreeObserver r5 = r6.getViewTreeObserver()
            com.google.android.material.transformation.ExpandableBehavior$a r1 = new com.google.android.material.transformation.ExpandableBehavior$a
            r1.<init>(r6, r7, r2)
            r5.addOnPreDrawListener(r1)
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public abstract void s(View view, View view2, boolean z, boolean z10);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
