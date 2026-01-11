package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import e6.i;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import o0.b;
import x5.o;
import x5.t;

public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int z = 0;

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f3749a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final e f3750b = new e();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<d> f3751c = new LinkedHashSet<>();

    /* renamed from: s  reason: collision with root package name */
    public final Comparator<MaterialButton> f3752s = new a();

    /* renamed from: t  reason: collision with root package name */
    public Integer[] f3753t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3754u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3755v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3756w;

    /* renamed from: x  reason: collision with root package name */
    public final int f3757x;

    /* renamed from: y  reason: collision with root package name */
    public Set<Integer> f3758y = new HashSet();

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        public final int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends n0.a {
        public b() {
        }

        public final void d(View view, o0.b bVar) {
            int i;
            this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i10 = MaterialButtonToggleGroup.z;
            Objects.requireNonNull(materialButtonToggleGroup);
            if (view instanceof MaterialButton) {
                int i11 = 0;
                i = 0;
                while (true) {
                    if (i11 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i11) == view) {
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i11) instanceof MaterialButton) && materialButtonToggleGroup.d(i11)) {
                            i++;
                        }
                        i11++;
                    }
                }
            }
            i = -1;
            bVar.q(b.c.a(0, 1, i, 1, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static final e6.a f3761e = new e6.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public e6.c f3762a;

        /* renamed from: b  reason: collision with root package name */
        public e6.c f3763b;

        /* renamed from: c  reason: collision with root package name */
        public e6.c f3764c;

        /* renamed from: d  reason: collision with root package name */
        public e6.c f3765d;

        public c(e6.c cVar, e6.c cVar2, e6.c cVar3, e6.c cVar4) {
            this.f3762a = cVar;
            this.f3763b = cVar3;
            this.f3764c = cVar4;
            this.f3765d = cVar2;
        }
    }

    public interface d {
        void a();
    }

    public class e implements MaterialButton.b {
        public e() {
        }
    }

    static {
        Class<MaterialButtonToggleGroup> cls = MaterialButtonToggleGroup.class;
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(j6.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131821584), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray d10 = o.d(getContext(), attributeSet, e5.a.f4629o, R.attr.materialButtonToggleGroupStyle, 2131821584, new int[0]);
        setSingleSelection(d10.getBoolean(2, false));
        this.f3757x = d10.getResourceId(0, -1);
        this.f3756w = d10.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d10.recycle();
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (d(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && d(i10)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            materialButton.setId(x.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f3750b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton c10 = c(i);
                int min = Math.min(c10.getStrokeWidth(), c(i - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = c10.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                c10.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$c>, java.util.ArrayList] */
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f3749a.add(new c(shapeAppearanceModel.f4688e, shapeAppearanceModel.f4690h, shapeAppearanceModel.f4689f, shapeAppearanceModel.g));
        x.p(materialButton, new b());
    }

    public final void b(int i, boolean z10) {
        if (i == -1) {
            Log.e("MaterialButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f3758y);
        if (z10 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f3755v && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i))) {
            if (!this.f3756w || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final boolean d(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3752s);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(c(i), Integer.valueOf(i));
        }
        this.f3753t = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final void e(Set<Integer> set) {
        ? r02 = this.f3758y;
        this.f3758y = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = c(i).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f3754u = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f3754u = false;
            }
            if (r02.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator<d> it = this.f3751c.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$c>, java.util.ArrayList] */
    public final void f() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton c10 = c(i);
            if (c10.getVisibility() != 8) {
                i shapeAppearanceModel = c10.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                i.a aVar = new i.a(shapeAppearanceModel);
                c cVar2 = (c) this.f3749a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z10 = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (!z10) {
                            e6.c cVar3 = cVar2.f3762a;
                            e6.a aVar2 = c.f3761e;
                            cVar = new c(cVar3, aVar2, cVar2.f3763b, aVar2);
                        } else if (t.c(this)) {
                            e6.a aVar3 = c.f3761e;
                            cVar = new c(aVar3, aVar3, cVar2.f3763b, cVar2.f3764c);
                        } else {
                            e6.c cVar4 = cVar2.f3762a;
                            e6.c cVar5 = cVar2.f3765d;
                            e6.a aVar4 = c.f3761e;
                            cVar = new c(cVar4, cVar5, aVar4, aVar4);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (!z10) {
                        e6.a aVar5 = c.f3761e;
                        cVar = new c(aVar5, cVar2.f3765d, aVar5, cVar2.f3764c);
                    } else if (t.c(this)) {
                        e6.c cVar6 = cVar2.f3762a;
                        e6.c cVar7 = cVar2.f3765d;
                        e6.a aVar6 = c.f3761e;
                        cVar = new c(cVar6, cVar7, aVar6, aVar6);
                    } else {
                        e6.a aVar7 = c.f3761e;
                        cVar = new c(aVar7, aVar7, cVar2.f3763b, cVar2.f3764c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.e(0.0f);
                    aVar.f(0.0f);
                    aVar.d(0.0f);
                    aVar.c(0.0f);
                } else {
                    aVar.f4698e = cVar2.f3762a;
                    aVar.f4700h = cVar2.f3765d;
                    aVar.f4699f = cVar2.f3763b;
                    aVar.g = cVar2.f3764c;
                }
                c10.setShapeAppearanceModel(new i(aVar));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public int getCheckedButtonId() {
        if (!this.f3755v || this.f3758y.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f3758y.iterator().next()).intValue();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = c(i).getId();
            if (this.f3758y.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i, int i10) {
        Integer[] numArr = this.f3753t;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i10;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f3757x;
        if (i != -1) {
            e(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0175b.a(1, getVisibleButtonCount(), this.f3755v ? 1 : 2).f9186a);
    }

    public final void onMeasure(int i, int i10) {
        f();
        a();
        super.onMeasure(i, i10);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$c>, java.util.ArrayList] */
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3749a.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setSelectionRequired(boolean z10) {
        this.f3756w = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f3755v != z10) {
            this.f3755v = z10;
            e(new HashSet());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
