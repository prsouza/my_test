package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import io.nodle.cash.R;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import o0.b;
import x5.g;
import x5.i;
import x5.o;

public class ChipGroup extends g {

    /* renamed from: t  reason: collision with root package name */
    public int f3775t;

    /* renamed from: u  reason: collision with root package name */
    public int f3776u;

    /* renamed from: v  reason: collision with root package name */
    public d f3777v;

    /* renamed from: w  reason: collision with root package name */
    public final x5.b<Chip> f3778w;

    /* renamed from: x  reason: collision with root package name */
    public final int f3779x;

    /* renamed from: y  reason: collision with root package name */
    public final e f3780y;

    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3781a;

        public a(c cVar) {
            this.f3781a = cVar;
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b() {
            super(-2, -2);
        }
    }

    @Deprecated
    public interface c {
        void a();
    }

    public interface d {
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f3783a;

        public e() {
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T>] */
        public final void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, a0> weakHashMap = x.f8842a;
                    view2.setId(x.e.a());
                }
                x5.b<Chip> bVar = ChipGroup.this.f3778w;
                Chip chip = (Chip) view2;
                bVar.f12799a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new x5.a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3783a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        /* JADX WARNING: type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T>] */
        /* JADX WARNING: type inference failed for: r0v3, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                x5.b<Chip> bVar = chipGroup.f3778w;
                Chip chip = (Chip) view2;
                Objects.requireNonNull(bVar);
                chip.setInternalOnCheckedChangeListener((i.a) null);
                bVar.f12799a.remove(Integer.valueOf(chip.getId()));
                bVar.f12800b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3783a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(j6.a.a(context, attributeSet, R.attr.chipGroupStyle, 2131821570), attributeSet, R.attr.chipGroupStyle);
        x5.b<Chip> bVar = new x5.b<>();
        this.f3778w = bVar;
        e eVar = new e();
        this.f3780y = eVar;
        TypedArray d10 = o.d(getContext(), attributeSet, e5.a.f4622f, R.attr.chipGroupStyle, 2131821570, new int[0]);
        int dimensionPixelOffset = d10.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d10.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d10.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d10.getBoolean(5, false));
        setSingleSelection(d10.getBoolean(6, false));
        setSelectionRequired(d10.getBoolean(4, false));
        this.f3779x = d10.getResourceId(0, -1);
        d10.recycle();
        bVar.f12801c = new b(this);
        super.setOnHierarchyChangeListener(eVar);
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.s(this, 1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    public final boolean a() {
        return this.f12833c;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f3778w.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f3778w.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f3775t;
    }

    public int getChipSpacingVertical() {
        return this.f3776u;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T>] */
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f3779x;
        if (i != -1) {
            x5.b<Chip> bVar = this.f3778w;
            i iVar = (i) bVar.f12799a.get(Integer.valueOf(i));
            if (iVar != null && bVar.a(iVar)) {
                bVar.d();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0175b.a(getRowCount(), this.f12833c ? getChipCount() : -1, this.f3778w.f12802d ? 1 : 2).f9186a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f3775t != i) {
            this.f3775t = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f3776u != i) {
            this.f3776u = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener((d) null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.f3777v = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3780y.f3783a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f3778w.f12803e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T>] */
    public void setSingleSelection(boolean z) {
        x5.b<Chip> bVar = this.f3778w;
        if (bVar.f12802d != z) {
            bVar.f12802d = z;
            boolean z10 = !bVar.f12800b.isEmpty();
            for (i e10 : bVar.f12799a.values()) {
                bVar.e(e10, false);
            }
            if (z10) {
                bVar.d();
            }
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
