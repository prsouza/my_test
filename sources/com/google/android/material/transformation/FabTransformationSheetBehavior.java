package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import e6.e;
import f5.g;
import io.nodle.cash.R;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map<View, Integer> i;

    public FabTransformationSheetBehavior() {
    }

    public final FabTransformationBehavior.b A(Context context, boolean z) {
        int i10 = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f4186a = g.a(context, i10);
        bVar.f4187b = new e();
        return bVar;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.Map<android.view.View, java.lang.Integer>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.Map<android.view.View, java.lang.Integer>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.util.Map<android.view.View, java.lang.Integer>, java.util.HashMap] */
    public final void s(View view, View view2, boolean z, boolean z10) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f1619a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z11) {
                    if (!z) {
                        ? r52 = this.i;
                        if (r52 != 0 && r52.containsKey(childAt)) {
                            int intValue = ((Integer) this.i.get(childAt)).intValue();
                            WeakHashMap<View, a0> weakHashMap = x.f8842a;
                            x.d.s(childAt, intValue);
                        }
                    } else {
                        this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                        x.d.s(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.i = null;
            }
        }
        super.s(view, view2, z, z10);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
