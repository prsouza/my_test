package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import net.jpountz.lz4.LZ4BlockOutputStream;
import net.jpountz.lz4.LZ4FrameOutputStream;
import v.d;
import v.e;
import v.f;
import v.g;
import v.j;
import v.k;
import w.b;
import y.d;

public class ConstraintLayout extends ViewGroup {
    public static d G;
    public int A = -1;
    public HashMap<String, Integer> B = new HashMap<>();
    public SparseArray<e> C = new SparseArray<>();
    public c D = new c(this);
    public int E = 0;
    public int F = 0;

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<View> f1436a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<b> f1437b = new ArrayList<>(4);

    /* renamed from: c  reason: collision with root package name */
    public f f1438c = new f();

    /* renamed from: s  reason: collision with root package name */
    public int f1439s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f1440t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f1441u = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: v  reason: collision with root package name */
    public int f1442v = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1443w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f1444x = 257;

    /* renamed from: y  reason: collision with root package name */
    public c f1445y = null;
    public y.a z = null;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1446a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                v.e$b[] r0 = v.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1446a = r0
                v.e$b r1 = v.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1446a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.e$b r1 = v.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1446a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.e$b r1 = v.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1446a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.e$b r1 = v.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    public class c implements b.C0243b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f1487a;

        /* renamed from: b  reason: collision with root package name */
        public int f1488b;

        /* renamed from: c  reason: collision with root package name */
        public int f1489c;

        /* renamed from: d  reason: collision with root package name */
        public int f1490d;

        /* renamed from: e  reason: collision with root package name */
        public int f1491e;

        /* renamed from: f  reason: collision with root package name */
        public int f1492f;
        public int g;

        public c(ConstraintLayout constraintLayout) {
            this.f1487a = constraintLayout;
        }

        public final boolean a(int i, int i10, int i11) {
            if (i == i10) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i11 == size) {
                return true;
            }
            return false;
        }

        public final void b(e eVar, b.a aVar) {
            int i;
            int i10;
            int i11;
            int i12;
            boolean z;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            e eVar2 = eVar;
            b.a aVar2 = aVar;
            if (eVar2 != null) {
                if (eVar2.f12064i0 == 8 && !eVar2.F) {
                    aVar2.f12491e = 0;
                    aVar2.f12492f = 0;
                    aVar2.g = 0;
                } else if (eVar2.V != null) {
                    e.b bVar = aVar2.f12487a;
                    e.b bVar2 = aVar2.f12488b;
                    int i18 = aVar2.f12489c;
                    int i19 = aVar2.f12490d;
                    int i20 = this.f1488b + this.f1489c;
                    int i21 = this.f1490d;
                    View view = (View) eVar2.f12063h0;
                    int[] iArr = a.f1446a;
                    int i22 = iArr[bVar.ordinal()];
                    if (i22 == 1) {
                        i = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                    } else if (i22 == 2) {
                        i = ViewGroup.getChildMeasureSpec(this.f1492f, i21, -2);
                    } else if (i22 == 3) {
                        int i23 = this.f1492f;
                        v.d dVar = eVar2.J;
                        int i24 = dVar != null ? dVar.g + 0 : 0;
                        v.d dVar2 = eVar2.L;
                        if (dVar2 != null) {
                            i24 += dVar2.g;
                        }
                        i = ViewGroup.getChildMeasureSpec(i23, i21 + i24, -1);
                    } else if (i22 != 4) {
                        i = 0;
                    } else {
                        i = ViewGroup.getChildMeasureSpec(this.f1492f, i21, -2);
                        boolean z10 = eVar2.f12081r == 1;
                        int i25 = aVar2.f12494j;
                        if (i25 == 1 || i25 == 2) {
                            if (aVar2.f12494j == 2 || !z10 || (z10 && (view.getMeasuredHeight() == eVar.k())) || (view instanceof e) || eVar.B()) {
                                i = View.MeasureSpec.makeMeasureSpec(eVar.r(), 1073741824);
                            }
                        }
                    }
                    int i26 = iArr[bVar2.ordinal()];
                    if (i26 == 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                    } else if (i26 == 2) {
                        i10 = ViewGroup.getChildMeasureSpec(this.g, i20, -2);
                    } else if (i26 == 3) {
                        int i27 = this.g;
                        int i28 = eVar2.J != null ? eVar2.K.g + 0 : 0;
                        if (eVar2.L != null) {
                            i28 += eVar2.M.g;
                        }
                        i10 = ViewGroup.getChildMeasureSpec(i27, i20 + i28, -1);
                    } else if (i26 != 4) {
                        i10 = 0;
                    } else {
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.g, i20, -2);
                        boolean z11 = eVar2.f12082s == 1;
                        int i29 = aVar2.f12494j;
                        if (i29 == 1 || i29 == 2) {
                            if (aVar2.f12494j == 2 || !z11 || (z11 && (view.getMeasuredWidth() == eVar.r())) || (view instanceof e) || eVar.C()) {
                                i10 = View.MeasureSpec.makeMeasureSpec(eVar.k(), 1073741824);
                            }
                        }
                        i10 = childMeasureSpec;
                    }
                    f fVar = (f) eVar2.V;
                    if (fVar != null && j.b(ConstraintLayout.this.f1444x, 256) && view.getMeasuredWidth() == eVar.r() && view.getMeasuredWidth() < fVar.r() && view.getMeasuredHeight() == eVar.k() && view.getMeasuredHeight() < fVar.k() && view.getBaseline() == eVar2.f12054c0 && !eVar.A()) {
                        if (a(eVar2.H, i, eVar.r()) && a(eVar2.I, i10, eVar.k())) {
                            aVar2.f12491e = eVar.r();
                            aVar2.f12492f = eVar.k();
                            aVar2.g = eVar2.f12054c0;
                            return;
                        }
                    }
                    e.b bVar3 = e.b.MATCH_CONSTRAINT;
                    boolean z12 = bVar == bVar3;
                    boolean z13 = bVar2 == bVar3;
                    e.b bVar4 = e.b.MATCH_PARENT;
                    boolean z14 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
                    boolean z15 = bVar == bVar4 || bVar == e.b.FIXED;
                    boolean z16 = z12 && eVar2.Y > 0.0f;
                    boolean z17 = z13 && eVar2.Y > 0.0f;
                    if (view != null) {
                        b bVar5 = (b) view.getLayoutParams();
                        int i30 = aVar2.f12494j;
                        if (i30 == 1 || i30 == 2 || !z12 || eVar2.f12081r != 0 || !z13 || eVar2.f12082s != 0) {
                            if (!(view instanceof y.e) || !(eVar2 instanceof k)) {
                                view.measure(i, i10);
                            } else {
                                k kVar = (k) eVar2;
                                y.e eVar3 = (y.e) view;
                            }
                            eVar2.H = i;
                            eVar2.I = i10;
                            eVar2.g = false;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            int baseline = view.getBaseline();
                            int i31 = eVar2.f12084u;
                            i12 = i31 > 0 ? Math.max(i31, measuredWidth) : measuredWidth;
                            int i32 = eVar2.f12085v;
                            if (i32 > 0) {
                                i12 = Math.min(i32, i12);
                            }
                            int i33 = eVar2.f12087x;
                            if (i33 > 0) {
                                i11 = Math.max(i33, measuredHeight);
                                i15 = i;
                            } else {
                                i15 = i;
                                i11 = measuredHeight;
                            }
                            int i34 = eVar2.f12088y;
                            if (i34 > 0) {
                                i11 = Math.min(i34, i11);
                            }
                            if (!j.b(ConstraintLayout.this.f1444x, 1)) {
                                if (z16 && z14) {
                                    i12 = (int) ((((float) i11) * eVar2.Y) + 0.5f);
                                } else if (z17 && z15) {
                                    i11 = (int) ((((float) i12) / eVar2.Y) + 0.5f);
                                }
                            }
                            if (measuredWidth == i12 && measuredHeight == i11) {
                                i13 = baseline;
                                i14 = -1;
                                z = false;
                            } else {
                                if (measuredWidth != i12) {
                                    i17 = 1073741824;
                                    i16 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                                } else {
                                    i17 = 1073741824;
                                    i16 = i15;
                                }
                                if (measuredHeight != i11) {
                                    i10 = View.MeasureSpec.makeMeasureSpec(i11, i17);
                                }
                                view.measure(i16, i10);
                                eVar2.H = i16;
                                eVar2.I = i10;
                                z = false;
                                eVar2.g = false;
                                int measuredWidth2 = view.getMeasuredWidth();
                                int measuredHeight2 = view.getMeasuredHeight();
                                i13 = view.getBaseline();
                                i12 = measuredWidth2;
                                i11 = measuredHeight2;
                                i14 = -1;
                            }
                        } else {
                            i14 = -1;
                            i13 = 0;
                            z = false;
                            i12 = 0;
                            i11 = 0;
                        }
                        boolean z18 = i13 != i14 ? true : z;
                        aVar2.i = (i12 == aVar2.f12489c && i11 == aVar2.f12490d) ? z : true;
                        if (bVar5.f1451c0) {
                            z18 = true;
                        }
                        if (!(!z18 || i13 == -1 || eVar2.f12054c0 == i13)) {
                            aVar2.i = true;
                        }
                        aVar2.f12491e = i12;
                        aVar2.f12492f = i11;
                        aVar2.f12493h = z18;
                        aVar2.g = i13;
                    }
                }
            }
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static d getSharedValues() {
        if (G == null) {
            G = new d();
        }
        return G;
    }

    /* renamed from: b */
    public final b generateDefaultLayoutParams() {
        return new b();
    }

    public final Object c(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.B;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.B.get(str);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public final View d(int i) {
        return this.f1436a.get(i);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<b> arrayList = this.f1437b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                Objects.requireNonNull(this.f1437b.get(i));
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i11 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i12 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = (float) i11;
                        float f11 = (float) (i11 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f12 = (float) i12;
                        float f13 = f10;
                        float f14 = f10;
                        float f15 = f12;
                        Paint paint2 = paint;
                        float f16 = f11;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f13, f15, f16, f12, paint3);
                        float parseInt4 = (float) (i12 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f11;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f15, f16, f18, paint3);
                        float f19 = parseInt4;
                        float f20 = f14;
                        canvas2.drawLine(f17, f19, f20, f18, paint3);
                        float f21 = f14;
                        canvas2.drawLine(f21, f19, f20, f12, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f22 = f11;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f21, f12, f22, parseInt4, paint6);
                        canvas2.drawLine(f21, parseInt4, f22, f12, paint6);
                    }
                }
            }
        }
    }

    public final e e(View view) {
        if (view == this) {
            return this.f1438c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1477q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1477q0;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i) {
        f fVar = this.f1438c;
        fVar.f12063h0 = this;
        c cVar = this.D;
        fVar.f12094v0 = cVar;
        fVar.f12092t0.f12502f = cVar;
        this.f1436a.put(getId(), this);
        this.f1445y = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ad.c.f311f0, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.f1439s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1439s);
                } else if (index == 17) {
                    this.f1440t = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1440t);
                } else if (index == 14) {
                    this.f1441u = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1441u);
                } else if (index == 15) {
                    this.f1442v = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1442v);
                } else if (index == 113) {
                    this.f1444x = obtainStyledAttributes.getInt(index, this.f1444x);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            k(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.z = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar2 = new c();
                        this.f1445y = cVar2;
                        cVar2.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1445y = null;
                    }
                    this.A = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1438c.e0(this.f1444x);
    }

    public final void forceLayout() {
        this.f1443w = true;
        super.forceLayout();
    }

    public final boolean g() {
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f1442v;
    }

    public int getMaxWidth() {
        return this.f1441u;
    }

    public int getMinHeight() {
        return this.f1440t;
    }

    public int getMinWidth() {
        return this.f1439s;
    }

    public int getOptimizationLevel() {
        return this.f1438c.E0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1438c.f12065j == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1438c.f12065j = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1438c.f12065j = "parent";
            }
        }
        f fVar = this.f1438c;
        if (fVar.f12066j0 == null) {
            fVar.f12066j0 = fVar.f12065j;
            StringBuilder d10 = a.a.d(" setDebugName ");
            d10.append(this.f1438c.f12066j0);
            Log.v("ConstraintLayout", d10.toString());
        }
        Iterator<e> it = this.f1438c.f12108r0.iterator();
        while (it.hasNext()) {
            e next = it.next();
            View view = (View) next.f12063h0;
            if (view != null) {
                if (next.f12065j == null && (id2 = view.getId()) != -1) {
                    next.f12065j = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.f12066j0 == null) {
                    next.f12066j0 = next.f12065j;
                    StringBuilder d11 = a.a.d(" setDebugName ");
                    d11.append(next.f12066j0);
                    Log.v("ConstraintLayout", d11.toString());
                }
            }
        }
        this.f1438c.o(sb2);
        return sb2.toString();
    }

    public void k(int i) {
        this.z = new y.a(getContext(), this, i);
    }

    public final void l(int i, int i10, int i11, int i12, boolean z10, boolean z11) {
        c cVar = this.D;
        int i13 = cVar.f1491e;
        int resolveSizeAndState = View.resolveSizeAndState(i11 + cVar.f1490d, i, 0);
        int min = Math.min(this.f1441u, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1442v, View.resolveSizeAndState(i12 + i13, i10, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    public void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            b bVar = (b) childAt.getLayoutParams();
            e eVar = bVar.f1477q0;
            if ((childAt.getVisibility() != 8 || bVar.f1453d0 || bVar.f1455e0 || isInEditMode) && !bVar.f1457f0) {
                int s10 = eVar.s();
                int t10 = eVar.t();
                int r10 = eVar.r() + s10;
                int k10 = eVar.k() + t10;
                childAt.layout(s10, t10, r10, k10);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s10, t10, r10, k10);
                }
            }
        }
        int size = this.f1437b.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                Objects.requireNonNull(this.f1437b.get(i14));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x05e3  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x05e8  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x077b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0557 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ec A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r27, int r28) {
        /*
            r26 = this;
            r7 = r26
            r1 = r27
            r2 = r28
            boolean r0 = r7.f1443w
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0023
            int r0 = r26.getChildCount()
            r5 = r4
        L_0x0011:
            if (r5 >= r0) goto L_0x0023
            android.view.View r6 = r7.getChildAt(r5)
            boolean r6 = r6.isLayoutRequested()
            if (r6 == 0) goto L_0x0020
            r7.f1443w = r3
            goto L_0x0023
        L_0x0020:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0023:
            r7.E = r1
            r7.F = r2
            v.f r0 = r7.f1438c
            boolean r5 = r26.g()
            r0.f12095w0 = r5
            boolean r0 = r7.f1443w
            if (r0 == 0) goto L_0x0042
            r7.f1443w = r4
            boolean r0 = r26.r()
            if (r0 == 0) goto L_0x0042
            v.f r0 = r7.f1438c
            w.b r5 = r0.f12091s0
            r5.c(r0)
        L_0x0042:
            v.f r0 = r7.f1438c
            int r5 = r7.f1444x
            int r6 = android.view.View.MeasureSpec.getMode(r27)
            int r8 = android.view.View.MeasureSpec.getSize(r27)
            int r9 = android.view.View.MeasureSpec.getMode(r28)
            int r10 = android.view.View.MeasureSpec.getSize(r28)
            int r11 = r26.getPaddingTop()
            int r11 = java.lang.Math.max(r4, r11)
            int r12 = r26.getPaddingBottom()
            int r12 = java.lang.Math.max(r4, r12)
            int r13 = r11 + r12
            int r14 = r26.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$c r15 = r7.D
            r15.f1488b = r11
            r15.f1489c = r12
            r15.f1490d = r14
            r15.f1491e = r13
            r15.f1492f = r1
            r15.g = r2
            int r12 = r26.getPaddingStart()
            int r12 = java.lang.Math.max(r4, r12)
            int r15 = r26.getPaddingEnd()
            int r15 = java.lang.Math.max(r4, r15)
            if (r12 > 0) goto L_0x0098
            if (r15 <= 0) goto L_0x008f
            goto L_0x0098
        L_0x008f:
            int r12 = r26.getPaddingLeft()
            int r12 = java.lang.Math.max(r4, r12)
            goto L_0x009f
        L_0x0098:
            boolean r16 = r26.g()
            if (r16 == 0) goto L_0x009f
            r12 = r15
        L_0x009f:
            int r8 = r8 - r14
            int r10 = r10 - r13
            androidx.constraintlayout.widget.ConstraintLayout$c r13 = r7.D
            int r14 = r13.f1491e
            int r13 = r13.f1490d
            v.e$b r15 = v.e.b.FIXED
            int r16 = r26.getChildCount()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r6 == r3) goto L_0x00d0
            if (r6 == 0) goto L_0x00c2
            if (r6 == r4) goto L_0x00b9
            r4 = r15
            goto L_0x00ce
        L_0x00b9:
            int r4 = r7.f1441u
            int r4 = r4 - r13
            int r4 = java.lang.Math.min(r4, r8)
            r1 = r15
            goto L_0x00e5
        L_0x00c2:
            v.e$b r4 = v.e.b.WRAP_CONTENT
            if (r16 != 0) goto L_0x00ce
            int r3 = r7.f1439s
            r1 = 0
            int r3 = java.lang.Math.max(r1, r3)
            goto L_0x00db
        L_0x00ce:
            r1 = 0
            goto L_0x00de
        L_0x00d0:
            r1 = 0
            v.e$b r4 = v.e.b.WRAP_CONTENT
            if (r16 != 0) goto L_0x00dd
            int r3 = r7.f1439s
            int r3 = java.lang.Math.max(r1, r3)
        L_0x00db:
            r1 = r3
            goto L_0x00de
        L_0x00dd:
            r1 = r8
        L_0x00de:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r25 = r4
            r4 = r1
            r1 = r25
        L_0x00e5:
            if (r9 == r3) goto L_0x0107
            if (r9 == 0) goto L_0x00f6
            r3 = 1073741824(0x40000000, float:2.0)
            if (r9 == r3) goto L_0x00ee
            goto L_0x0104
        L_0x00ee:
            int r3 = r7.f1442v
            int r3 = r3 - r14
            int r3 = java.lang.Math.min(r3, r10)
            goto L_0x0114
        L_0x00f6:
            v.e$b r15 = v.e.b.WRAP_CONTENT
            if (r16 != 0) goto L_0x0104
            int r3 = r7.f1440t
            r2 = 0
            int r18 = java.lang.Math.max(r2, r3)
            r3 = r18
            goto L_0x0114
        L_0x0104:
            r2 = 0
            r3 = r2
            goto L_0x0114
        L_0x0107:
            r2 = 0
            v.e$b r15 = v.e.b.WRAP_CONTENT
            if (r16 != 0) goto L_0x0113
            int r3 = r7.f1440t
            int r3 = java.lang.Math.max(r2, r3)
            goto L_0x0114
        L_0x0113:
            r3 = r10
        L_0x0114:
            int r2 = r0.r()
            if (r4 != r2) goto L_0x0126
            int r2 = r0.k()
            if (r3 == r2) goto L_0x0121
            goto L_0x0126
        L_0x0121:
            r16 = r10
            r2 = 0
            r10 = 1
            goto L_0x012e
        L_0x0126:
            w.e r2 = r0.f12092t0
            r16 = r10
            r10 = 1
            r2.f12499c = r10
            r2 = 0
        L_0x012e:
            r0.f12051a0 = r2
            r0.b0 = r2
            int r10 = r7.f1441u
            int r10 = r10 - r13
            r20 = r8
            int[] r8 = r0.C
            r8[r2] = r10
            int r10 = r7.f1442v
            int r10 = r10 - r14
            r17 = 1
            r8[r17] = r10
            r0.O(r2)
            r0.N(r2)
            r0.M(r1)
            r0.Q(r4)
            r0.P(r15)
            r0.L(r3)
            int r1 = r7.f1439s
            int r1 = r1 - r13
            r0.O(r1)
            int r1 = r7.f1440t
            int r1 = r1 - r14
            r0.N(r1)
            r0.f12097y0 = r12
            r0.z0 = r11
            w.b r1 = r0.f12091s0
            java.util.Objects.requireNonNull(r1)
            w.b$b r2 = r0.f12094v0
            java.util.ArrayList<v.e> r3 = r0.f12108r0
            int r3 = r3.size()
            int r4 = r0.r()
            int r8 = r0.k()
            r10 = 128(0x80, float:1.794E-43)
            boolean r10 = v.j.b(r5, r10)
            r11 = 64
            if (r10 != 0) goto L_0x018c
            boolean r5 = v.j.b(r5, r11)
            if (r5 == 0) goto L_0x018a
            goto L_0x018c
        L_0x018a:
            r5 = 0
            goto L_0x018d
        L_0x018c:
            r5 = 1
        L_0x018d:
            if (r5 == 0) goto L_0x01e8
            r13 = 0
        L_0x0190:
            if (r13 >= r3) goto L_0x01e8
            java.util.ArrayList<v.e> r14 = r0.f12108r0
            java.lang.Object r14 = r14.get(r13)
            v.e r14 = (v.e) r14
            v.e$b[] r15 = r14.U
            r18 = 0
            r11 = r15[r18]
            v.e$b r12 = v.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x01a6
            r11 = 1
            goto L_0x01a7
        L_0x01a6:
            r11 = 0
        L_0x01a7:
            r17 = 1
            r15 = r15[r17]
            if (r15 != r12) goto L_0x01af
            r12 = 1
            goto L_0x01b0
        L_0x01af:
            r12 = 0
        L_0x01b0:
            if (r11 == 0) goto L_0x01bd
            if (r12 == 0) goto L_0x01bd
            float r11 = r14.Y
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x01bd
            r11 = 1
            goto L_0x01be
        L_0x01bd:
            r11 = 0
        L_0x01be:
            boolean r12 = r14.y()
            if (r12 == 0) goto L_0x01c7
            if (r11 == 0) goto L_0x01c7
            goto L_0x01e7
        L_0x01c7:
            boolean r12 = r14.z()
            if (r12 == 0) goto L_0x01d0
            if (r11 == 0) goto L_0x01d0
            goto L_0x01e7
        L_0x01d0:
            boolean r11 = r14 instanceof v.k
            if (r11 == 0) goto L_0x01d5
            goto L_0x01e7
        L_0x01d5:
            boolean r11 = r14.y()
            if (r11 != 0) goto L_0x01e7
            boolean r11 = r14.z()
            if (r11 == 0) goto L_0x01e2
            goto L_0x01e7
        L_0x01e2:
            int r13 = r13 + 1
            r11 = 64
            goto L_0x0190
        L_0x01e7:
            r5 = 0
        L_0x01e8:
            r11 = 1073741824(0x40000000, float:2.0)
            if (r6 != r11) goto L_0x01ee
            if (r9 == r11) goto L_0x01f0
        L_0x01ee:
            if (r10 == 0) goto L_0x01f2
        L_0x01f0:
            r11 = 1
            goto L_0x01f3
        L_0x01f2:
            r11 = 0
        L_0x01f3:
            r5 = r5 & r11
            if (r5 == 0) goto L_0x04a5
            int[] r12 = r0.C
            r13 = 0
            r12 = r12[r13]
            r13 = r20
            int r12 = java.lang.Math.min(r12, r13)
            int[] r13 = r0.C
            r14 = 1
            r13 = r13[r14]
            r14 = r16
            int r13 = java.lang.Math.min(r13, r14)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r6 != r14) goto L_0x021c
            int r15 = r0.r()
            if (r15 == r12) goto L_0x021c
            r0.Q(r12)
            r0.b0()
        L_0x021c:
            if (r9 != r14) goto L_0x022a
            int r12 = r0.k()
            if (r12 == r13) goto L_0x022a
            r0.L(r13)
            r0.b0()
        L_0x022a:
            if (r6 != r14) goto L_0x03fb
            if (r9 != r14) goto L_0x03fb
            w.e r12 = r0.f12092t0
            r13 = 1
            r10 = r10 & r13
            boolean r13 = r12.f12498b
            if (r13 != 0) goto L_0x023d
            boolean r13 = r12.f12499c
            if (r13 == 0) goto L_0x023b
            goto L_0x023d
        L_0x023b:
            r15 = 0
            goto L_0x027a
        L_0x023d:
            v.f r13 = r12.f12497a
            java.util.ArrayList<v.e> r13 = r13.f12108r0
            java.util.Iterator r13 = r13.iterator()
        L_0x0245:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0262
            java.lang.Object r14 = r13.next()
            v.e r14 = (v.e) r14
            r14.g()
            r15 = 0
            r14.f12050a = r15
            w.l r11 = r14.f12055d
            r11.n()
            w.n r11 = r14.f12057e
            r11.m()
            goto L_0x0245
        L_0x0262:
            r15 = 0
            v.f r11 = r12.f12497a
            r11.g()
            v.f r11 = r12.f12497a
            r11.f12050a = r15
            w.l r11 = r11.f12055d
            r11.n()
            v.f r11 = r12.f12497a
            w.n r11 = r11.f12057e
            r11.m()
            r12.f12499c = r15
        L_0x027a:
            v.f r11 = r12.f12500d
            r12.b(r11)
            v.f r11 = r12.f12497a
            r11.f12051a0 = r15
            r11.b0 = r15
            v.e$b r11 = r11.j(r15)
            v.f r13 = r12.f12497a
            r14 = 1
            v.e$b r13 = r13.j(r14)
            boolean r14 = r12.f12498b
            if (r14 == 0) goto L_0x0297
            r12.c()
        L_0x0297:
            v.f r14 = r12.f12497a
            int r14 = r14.s()
            v.f r15 = r12.f12497a
            int r15 = r15.t()
            v.f r7 = r12.f12497a
            w.l r7 = r7.f12055d
            w.f r7 = r7.f12535h
            r7.d(r14)
            v.f r7 = r12.f12497a
            w.n r7 = r7.f12057e
            w.f r7 = r7.f12535h
            r7.d(r15)
            r12.g()
            v.e$b r7 = v.e.b.WRAP_CONTENT
            if (r11 == r7) goto L_0x02c4
            if (r13 != r7) goto L_0x02bf
            goto L_0x02c4
        L_0x02bf:
            r23 = r2
            r20 = r5
            goto L_0x0330
        L_0x02c4:
            if (r10 == 0) goto L_0x02df
            java.util.ArrayList<w.p> r7 = r12.f12501e
            java.util.Iterator r7 = r7.iterator()
        L_0x02cc:
            boolean r20 = r7.hasNext()
            if (r20 == 0) goto L_0x02df
            java.lang.Object r20 = r7.next()
            w.p r20 = (w.p) r20
            boolean r20 = r20.k()
            if (r20 != 0) goto L_0x02cc
            r10 = 0
        L_0x02df:
            if (r10 == 0) goto L_0x0308
            v.e$b r7 = v.e.b.WRAP_CONTENT
            if (r11 != r7) goto L_0x0308
            v.f r7 = r12.f12497a
            r20 = r5
            v.e$b r5 = v.e.b.FIXED
            r7.M(r5)
            v.f r5 = r12.f12497a
            r23 = r2
            r7 = 0
            int r2 = r12.d(r5, r7)
            r5.Q(r2)
            v.f r2 = r12.f12497a
            w.l r5 = r2.f12055d
            w.g r5 = r5.f12533e
            int r2 = r2.r()
            r5.d(r2)
            goto L_0x030c
        L_0x0308:
            r23 = r2
            r20 = r5
        L_0x030c:
            if (r10 == 0) goto L_0x0330
            v.e$b r2 = v.e.b.WRAP_CONTENT
            if (r13 != r2) goto L_0x0330
            v.f r2 = r12.f12497a
            v.e$b r5 = v.e.b.FIXED
            r2.P(r5)
            v.f r2 = r12.f12497a
            r5 = 1
            int r7 = r12.d(r2, r5)
            r2.L(r7)
            v.f r2 = r12.f12497a
            w.n r5 = r2.f12057e
            w.g r5 = r5.f12533e
            int r2 = r2.k()
            r5.d(r2)
        L_0x0330:
            v.f r2 = r12.f12497a
            v.e$b[] r5 = r2.U
            r7 = 0
            r10 = r5[r7]
            r24 = r4
            v.e$b r4 = v.e.b.FIXED
            if (r10 == r4) goto L_0x0346
            r5 = r5[r7]
            v.e$b r7 = v.e.b.MATCH_PARENT
            if (r5 != r7) goto L_0x0344
            goto L_0x0346
        L_0x0344:
            r2 = 0
            goto L_0x038c
        L_0x0346:
            int r2 = r2.r()
            int r2 = r2 + r14
            v.f r5 = r12.f12497a
            w.l r5 = r5.f12055d
            w.f r5 = r5.i
            r5.d(r2)
            v.f r5 = r12.f12497a
            w.l r5 = r5.f12055d
            w.g r5 = r5.f12533e
            int r2 = r2 - r14
            r5.d(r2)
            r12.g()
            v.f r2 = r12.f12497a
            v.e$b[] r5 = r2.U
            r7 = 1
            r10 = r5[r7]
            if (r10 == r4) goto L_0x0370
            r4 = r5[r7]
            v.e$b r5 = v.e.b.MATCH_PARENT
            if (r4 != r5) goto L_0x0388
        L_0x0370:
            int r2 = r2.k()
            int r2 = r2 + r15
            v.f r4 = r12.f12497a
            w.n r4 = r4.f12057e
            w.f r4 = r4.i
            r4.d(r2)
            v.f r4 = r12.f12497a
            w.n r4 = r4.f12057e
            w.g r4 = r4.f12533e
            int r2 = r2 - r15
            r4.d(r2)
        L_0x0388:
            r12.g()
            r2 = 1
        L_0x038c:
            java.util.ArrayList<w.p> r4 = r12.f12501e
            java.util.Iterator r4 = r4.iterator()
        L_0x0392:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x03ad
            java.lang.Object r5 = r4.next()
            w.p r5 = (w.p) r5
            v.e r7 = r5.f12530b
            v.f r10 = r12.f12497a
            if (r7 != r10) goto L_0x03a9
            boolean r7 = r5.g
            if (r7 != 0) goto L_0x03a9
            goto L_0x0392
        L_0x03a9:
            r5.e()
            goto L_0x0392
        L_0x03ad:
            java.util.ArrayList<w.p> r4 = r12.f12501e
            java.util.Iterator r4 = r4.iterator()
        L_0x03b3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x03ea
            java.lang.Object r5 = r4.next()
            w.p r5 = (w.p) r5
            if (r2 != 0) goto L_0x03c8
            v.e r7 = r5.f12530b
            v.f r10 = r12.f12497a
            if (r7 != r10) goto L_0x03c8
            goto L_0x03b3
        L_0x03c8:
            w.f r7 = r5.f12535h
            boolean r7 = r7.f12511j
            if (r7 != 0) goto L_0x03cf
            goto L_0x03e8
        L_0x03cf:
            w.f r7 = r5.i
            boolean r7 = r7.f12511j
            if (r7 != 0) goto L_0x03da
            boolean r7 = r5 instanceof w.j
            if (r7 != 0) goto L_0x03da
            goto L_0x03e8
        L_0x03da:
            w.g r7 = r5.f12533e
            boolean r7 = r7.f12511j
            if (r7 != 0) goto L_0x03b3
            boolean r7 = r5 instanceof w.c
            if (r7 != 0) goto L_0x03b3
            boolean r5 = r5 instanceof w.j
            if (r5 != 0) goto L_0x03b3
        L_0x03e8:
            r2 = 0
            goto L_0x03eb
        L_0x03ea:
            r2 = 1
        L_0x03eb:
            v.f r4 = r12.f12497a
            r4.M(r11)
            v.f r4 = r12.f12497a
            r4.P(r13)
            r4 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            r7 = 2
            goto L_0x0495
        L_0x03fb:
            r23 = r2
            r24 = r4
            r20 = r5
            w.e r2 = r0.f12092t0
            boolean r4 = r2.f12498b
            if (r4 == 0) goto L_0x045e
            v.f r4 = r2.f12497a
            java.util.ArrayList<v.e> r4 = r4.f12108r0
            java.util.Iterator r4 = r4.iterator()
        L_0x040f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0438
            java.lang.Object r5 = r4.next()
            v.e r5 = (v.e) r5
            r5.g()
            r7 = 0
            r5.f12050a = r7
            w.l r11 = r5.f12055d
            w.g r12 = r11.f12533e
            r12.f12511j = r7
            r11.g = r7
            r11.n()
            w.n r5 = r5.f12057e
            w.g r11 = r5.f12533e
            r11.f12511j = r7
            r5.g = r7
            r5.m()
            goto L_0x040f
        L_0x0438:
            r7 = 0
            v.f r4 = r2.f12497a
            r4.g()
            v.f r4 = r2.f12497a
            r4.f12050a = r7
            w.l r4 = r4.f12055d
            w.g r5 = r4.f12533e
            r5.f12511j = r7
            r4.g = r7
            r4.n()
            v.f r4 = r2.f12497a
            w.n r4 = r4.f12057e
            w.g r5 = r4.f12533e
            r5.f12511j = r7
            r4.g = r7
            r4.m()
            r2.c()
            goto L_0x045f
        L_0x045e:
            r7 = 0
        L_0x045f:
            v.f r4 = r2.f12500d
            r2.b(r4)
            v.f r4 = r2.f12497a
            r4.f12051a0 = r7
            r4.b0 = r7
            w.l r4 = r4.f12055d
            w.f r4 = r4.f12535h
            r4.d(r7)
            v.f r2 = r2.f12497a
            w.n r2 = r2.f12057e
            w.f r2 = r2.f12535h
            r2.d(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r6 != r2) goto L_0x0489
            boolean r4 = r0.a0(r10, r7)
            r5 = 1
            r17 = r4 & 1
            r7 = r5
            r4 = r17
            goto L_0x048c
        L_0x0489:
            r5 = 1
            r4 = r5
            r7 = 0
        L_0x048c:
            if (r9 != r2) goto L_0x0495
            boolean r10 = r0.a0(r10, r5)
            r4 = r4 & r10
            int r7 = r7 + 1
        L_0x0495:
            if (r4 == 0) goto L_0x04ad
            if (r6 != r2) goto L_0x049b
            r5 = 1
            goto L_0x049c
        L_0x049b:
            r5 = 0
        L_0x049c:
            if (r9 != r2) goto L_0x04a0
            r2 = 1
            goto L_0x04a1
        L_0x04a0:
            r2 = 0
        L_0x04a1:
            r0.R(r5, r2)
            goto L_0x04ad
        L_0x04a5:
            r23 = r2
            r24 = r4
            r20 = r5
            r4 = 0
            r7 = 0
        L_0x04ad:
            if (r4 == 0) goto L_0x04b7
            r2 = 2
            if (r7 == r2) goto L_0x04b3
            goto L_0x04b7
        L_0x04b3:
            r7 = r26
            goto L_0x0784
        L_0x04b7:
            int r2 = r0.E0
            r4 = 8
            if (r3 <= 0) goto L_0x05d1
            java.util.ArrayList<v.e> r5 = r0.f12108r0
            int r5 = r5.size()
            r6 = 64
            boolean r6 = r0.d0(r6)
            w.b$b r7 = r0.f12094v0
            r9 = 0
        L_0x04cc:
            if (r9 >= r5) goto L_0x055b
            java.util.ArrayList<v.e> r10 = r0.f12108r0
            java.lang.Object r10 = r10.get(r9)
            v.e r10 = (v.e) r10
            boolean r11 = r10 instanceof v.g
            if (r11 == 0) goto L_0x04db
            goto L_0x04fb
        L_0x04db:
            boolean r11 = r10 instanceof v.a
            if (r11 == 0) goto L_0x04e0
            goto L_0x04fb
        L_0x04e0:
            boolean r11 = r10.G
            if (r11 == 0) goto L_0x04e5
            goto L_0x04fb
        L_0x04e5:
            if (r6 == 0) goto L_0x04fd
            w.l r11 = r10.f12055d
            if (r11 == 0) goto L_0x04fd
            w.n r12 = r10.f12057e
            if (r12 == 0) goto L_0x04fd
            w.g r11 = r11.f12533e
            boolean r11 = r11.f12511j
            if (r11 == 0) goto L_0x04fd
            w.g r11 = r12.f12533e
            boolean r11 = r11.f12511j
            if (r11 == 0) goto L_0x04fd
        L_0x04fb:
            r12 = 0
            goto L_0x0557
        L_0x04fd:
            r11 = 0
            v.e$b r12 = r10.j(r11)
            r11 = 1
            v.e$b r13 = r10.j(r11)
            v.e$b r14 = v.e.b.MATCH_CONSTRAINT
            if (r12 != r14) goto L_0x0517
            int r15 = r10.f12081r
            if (r15 == r11) goto L_0x0517
            if (r13 != r14) goto L_0x0517
            int r15 = r10.f12082s
            if (r15 == r11) goto L_0x0517
            r15 = r11
            goto L_0x0518
        L_0x0517:
            r15 = 0
        L_0x0518:
            if (r15 != 0) goto L_0x054f
            boolean r19 = r0.d0(r11)
            if (r19 == 0) goto L_0x054f
            boolean r11 = r10 instanceof v.k
            if (r11 != 0) goto L_0x054f
            if (r12 != r14) goto L_0x0533
            int r11 = r10.f12081r
            if (r11 != 0) goto L_0x0533
            if (r13 == r14) goto L_0x0533
            boolean r11 = r10.y()
            if (r11 != 0) goto L_0x0533
            r15 = 1
        L_0x0533:
            if (r13 != r14) goto L_0x0542
            int r11 = r10.f12082s
            if (r11 != 0) goto L_0x0542
            if (r12 == r14) goto L_0x0542
            boolean r11 = r10.y()
            if (r11 != 0) goto L_0x0542
            r15 = 1
        L_0x0542:
            if (r12 == r14) goto L_0x0546
            if (r13 != r14) goto L_0x054f
        L_0x0546:
            float r11 = r10.Y
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0550
            r15 = 1
            goto L_0x0550
        L_0x054f:
            r12 = 0
        L_0x0550:
            if (r15 == 0) goto L_0x0553
            goto L_0x0557
        L_0x0553:
            r11 = 0
            r1.a(r7, r10, r11)
        L_0x0557:
            int r9 = r9 + 1
            goto L_0x04cc
        L_0x055b:
            androidx.constraintlayout.widget.ConstraintLayout$c r7 = (androidx.constraintlayout.widget.ConstraintLayout.c) r7
            androidx.constraintlayout.widget.ConstraintLayout r5 = r7.f1487a
            int r5 = r5.getChildCount()
            r6 = 0
        L_0x0564:
            if (r6 >= r5) goto L_0x05b4
            androidx.constraintlayout.widget.ConstraintLayout r9 = r7.f1487a
            android.view.View r9 = r9.getChildAt(r6)
            boolean r10 = r9 instanceof androidx.constraintlayout.widget.e
            if (r10 == 0) goto L_0x05b1
            androidx.constraintlayout.widget.e r9 = (androidx.constraintlayout.widget.e) r9
            android.view.View r10 = r9.f1605b
            if (r10 != 0) goto L_0x0577
            goto L_0x05b1
        L_0x0577:
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r10 = (androidx.constraintlayout.widget.ConstraintLayout.b) r10
            android.view.View r9 = r9.f1605b
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r9 = (androidx.constraintlayout.widget.ConstraintLayout.b) r9
            v.e r11 = r9.f1477q0
            r12 = 0
            r11.f12064i0 = r12
            v.e r13 = r10.f1477q0
            v.e$b[] r14 = r13.U
            r14 = r14[r12]
            v.e$b r12 = v.e.b.FIXED
            if (r14 == r12) goto L_0x059b
            int r11 = r11.r()
            r13.Q(r11)
        L_0x059b:
            v.e r10 = r10.f1477q0
            v.e$b[] r11 = r10.U
            r13 = 1
            r11 = r11[r13]
            if (r11 == r12) goto L_0x05ad
            v.e r11 = r9.f1477q0
            int r11 = r11.k()
            r10.L(r11)
        L_0x05ad:
            v.e r9 = r9.f1477q0
            r9.f12064i0 = r4
        L_0x05b1:
            int r6 = r6 + 1
            goto L_0x0564
        L_0x05b4:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r7.f1487a
            java.util.ArrayList<androidx.constraintlayout.widget.b> r5 = r5.f1437b
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x05d1
            r6 = 0
        L_0x05bf:
            if (r6 >= r5) goto L_0x05d1
            androidx.constraintlayout.widget.ConstraintLayout r9 = r7.f1487a
            java.util.ArrayList<androidx.constraintlayout.widget.b> r9 = r9.f1437b
            java.lang.Object r9 = r9.get(r6)
            androidx.constraintlayout.widget.b r9 = (androidx.constraintlayout.widget.b) r9
            java.util.Objects.requireNonNull(r9)
            int r6 = r6 + 1
            goto L_0x05bf
        L_0x05d1:
            r1.c(r0)
            java.util.ArrayList<v.e> r5 = r1.f12484a
            int r5 = r5.size()
            if (r3 <= 0) goto L_0x05e3
            r3 = r24
            r6 = 0
            r1.b(r0, r6, r3, r8)
            goto L_0x05e6
        L_0x05e3:
            r3 = r24
            r6 = 0
        L_0x05e6:
            if (r5 <= 0) goto L_0x077b
            v.e$b[] r7 = r0.U
            r9 = r7[r6]
            v.e$b r6 = v.e.b.WRAP_CONTENT
            if (r9 != r6) goto L_0x05f2
            r9 = 1
            goto L_0x05f3
        L_0x05f2:
            r9 = 0
        L_0x05f3:
            r10 = 1
            r7 = r7[r10]
            if (r7 != r6) goto L_0x05fa
            r6 = 1
            goto L_0x05fb
        L_0x05fa:
            r6 = 0
        L_0x05fb:
            int r7 = r0.r()
            v.f r10 = r1.f12486c
            int r10 = r10.f12056d0
            int r7 = java.lang.Math.max(r7, r10)
            int r10 = r0.k()
            v.f r11 = r1.f12486c
            int r11 = r11.f12058e0
            int r10 = java.lang.Math.max(r10, r11)
            r11 = r7
            r12 = r10
            r7 = 0
            r10 = 0
        L_0x0617:
            if (r7 >= r5) goto L_0x069e
            java.util.ArrayList<v.e> r13 = r1.f12484a
            java.lang.Object r13 = r13.get(r7)
            v.e r13 = (v.e) r13
            boolean r14 = r13 instanceof v.k
            if (r14 != 0) goto L_0x062b
            r21 = r2
            r4 = r23
            r2 = 0
            goto L_0x0694
        L_0x062b:
            int r14 = r13.r()
            int r15 = r13.k()
            r21 = r2
            r4 = r23
            r2 = 1
            boolean r22 = r1.a(r4, r13, r2)
            r10 = r10 | r22
            int r2 = r13.r()
            r22 = r10
            int r10 = r13.k()
            if (r2 == r14) goto L_0x066b
            r13.Q(r2)
            if (r9 == 0) goto L_0x0669
            int r2 = r13.n()
            if (r2 <= r11) goto L_0x0669
            int r2 = r13.n()
            v.d$b r14 = v.d.b.RIGHT
            v.d r14 = r13.h(r14)
            int r14 = r14.d()
            int r14 = r14 + r2
            int r2 = java.lang.Math.max(r11, r14)
            r11 = r2
        L_0x0669:
            r22 = 1
        L_0x066b:
            if (r10 == r15) goto L_0x068e
            r13.L(r10)
            if (r6 == 0) goto L_0x068c
            int r2 = r13.i()
            if (r2 <= r12) goto L_0x068c
            int r2 = r13.i()
            v.d$b r10 = v.d.b.BOTTOM
            v.d r10 = r13.h(r10)
            int r10 = r10.d()
            int r10 = r10 + r2
            int r2 = java.lang.Math.max(r12, r10)
            r12 = r2
        L_0x068c:
            r10 = 1
            goto L_0x0690
        L_0x068e:
            r10 = r22
        L_0x0690:
            v.k r13 = (v.k) r13
            r2 = 0
            r10 = r10 | r2
        L_0x0694:
            int r7 = r7 + 1
            r23 = r4
            r2 = r21
            r4 = 8
            goto L_0x0617
        L_0x069e:
            r21 = r2
            r4 = r23
            r2 = 0
            r7 = r2
        L_0x06a4:
            r13 = 2
            if (r7 >= r13) goto L_0x077d
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r2
        L_0x06ab:
            if (r10 >= r5) goto L_0x0763
            java.util.ArrayList<v.e> r15 = r1.f12484a
            java.lang.Object r15 = r15.get(r10)
            v.e r15 = (v.e) r15
            boolean r2 = r15 instanceof v.h
            if (r2 == 0) goto L_0x06bd
            boolean r2 = r15 instanceof v.k
            if (r2 == 0) goto L_0x06c1
        L_0x06bd:
            boolean r2 = r15 instanceof v.g
            if (r2 == 0) goto L_0x06c4
        L_0x06c1:
            r13 = 8
            goto L_0x06e2
        L_0x06c4:
            int r2 = r15.f12064i0
            r13 = 8
            if (r2 != r13) goto L_0x06cb
            goto L_0x06e2
        L_0x06cb:
            if (r20 == 0) goto L_0x06de
            w.l r2 = r15.f12055d
            w.g r2 = r2.f12533e
            boolean r2 = r2.f12511j
            if (r2 == 0) goto L_0x06de
            w.n r2 = r15.f12057e
            w.g r2 = r2.f12533e
            boolean r2 = r2.f12511j
            if (r2 == 0) goto L_0x06de
            goto L_0x06e2
        L_0x06de:
            boolean r2 = r15 instanceof v.k
            if (r2 == 0) goto L_0x06e8
        L_0x06e2:
            r23 = r0
            r22 = r5
            goto L_0x0759
        L_0x06e8:
            int r2 = r15.r()
            int r13 = r15.k()
            r22 = r5
            int r5 = r15.f12054c0
            r23 = r0
            r0 = 1
            if (r7 != r0) goto L_0x06fa
            r0 = 2
        L_0x06fa:
            boolean r0 = r1.a(r4, r15, r0)
            r0 = r0 | r11
            int r11 = r15.r()
            r24 = r0
            int r0 = r15.k()
            if (r11 == r2) goto L_0x072b
            r15.Q(r11)
            if (r9 == 0) goto L_0x0729
            int r2 = r15.n()
            if (r2 <= r12) goto L_0x0729
            int r2 = r15.n()
            v.d$b r11 = v.d.b.RIGHT
            v.d r11 = r15.h(r11)
            int r11 = r11.d()
            int r11 = r11 + r2
            int r12 = java.lang.Math.max(r12, r11)
        L_0x0729:
            r24 = 1
        L_0x072b:
            if (r0 == r13) goto L_0x074d
            r15.L(r0)
            if (r6 == 0) goto L_0x074b
            int r0 = r15.i()
            if (r0 <= r14) goto L_0x074b
            int r0 = r15.i()
            v.d$b r2 = v.d.b.BOTTOM
            v.d r2 = r15.h(r2)
            int r2 = r2.d()
            int r2 = r2 + r0
            int r14 = java.lang.Math.max(r14, r2)
        L_0x074b:
            r24 = 1
        L_0x074d:
            boolean r0 = r15.E
            if (r0 == 0) goto L_0x0757
            int r0 = r15.f12054c0
            if (r5 == r0) goto L_0x0757
            r11 = 1
            goto L_0x0759
        L_0x0757:
            r11 = r24
        L_0x0759:
            int r10 = r10 + 1
            r5 = r22
            r0 = r23
            r2 = 0
            r13 = 2
            goto L_0x06ab
        L_0x0763:
            r23 = r0
            r22 = r5
            if (r11 == 0) goto L_0x0778
            int r7 = r7 + 1
            r0 = r23
            r1.b(r0, r7, r3, r8)
            r11 = r12
            r12 = r14
            r5 = r22
            r2 = 0
            r10 = 0
            goto L_0x06a4
        L_0x0778:
            r0 = r23
            goto L_0x077d
        L_0x077b:
            r21 = r2
        L_0x077d:
            r1 = r21
            r0.e0(r1)
            goto L_0x04b3
        L_0x0784:
            v.f r0 = r7.f1438c
            int r3 = r0.r()
            v.f r0 = r7.f1438c
            int r4 = r0.k()
            v.f r0 = r7.f1438c
            boolean r5 = r0.F0
            boolean r6 = r0.G0
            r0 = r26
            r1 = r27
            r2 = r28
            r0.l(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e e10 = e(view);
        if ((view instanceof Guideline) && !(e10 instanceof g)) {
            b bVar = (b) view.getLayoutParams();
            g gVar = new g();
            bVar.f1477q0 = gVar;
            bVar.f1453d0 = true;
            gVar.U(bVar.V);
        }
        if (view instanceof b) {
            b bVar2 = (b) view;
            bVar2.k();
            ((b) view.getLayoutParams()).f1455e0 = true;
            if (!this.f1437b.contains(bVar2)) {
                this.f1437b.add(bVar2);
            }
        }
        this.f1436a.put(view.getId(), view);
        this.f1443w = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1436a.remove(view.getId());
        e e10 = e(view);
        this.f1438c.f12108r0.remove(e10);
        e10.D();
        this.f1437b.remove(view);
        this.f1443w = true;
    }

    public final void p(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.B == null) {
                this.B = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.B.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final void q(e eVar, b bVar, SparseArray<e> sparseArray, int i, d.b bVar2) {
        View view = this.f1436a.get(i);
        e eVar2 = sparseArray.get(i);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.f1451c0 = true;
            d.b bVar3 = d.b.BASELINE;
            if (bVar2 == bVar3) {
                b bVar4 = (b) view.getLayoutParams();
                bVar4.f1451c0 = true;
                bVar4.f1477q0.E = true;
            }
            eVar.h(bVar3).a(eVar2.h(bVar2), bVar.D, bVar.C);
            eVar.E = true;
            eVar.h(d.b.TOP).h();
            eVar.h(d.b.BOTTOM).h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:256:0x04eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r() {
        /*
            r24 = this;
            r6 = r24
            int r0 = r24.getChildCount()
            r7 = 0
            r1 = r7
        L_0x0008:
            r8 = 1
            if (r1 >= r0) goto L_0x001a
            android.view.View r2 = r6.getChildAt(r1)
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x0017
            r9 = r8
            goto L_0x001b
        L_0x0017:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x001a:
            r9 = r7
        L_0x001b:
            if (r9 == 0) goto L_0x0560
            boolean r10 = r24.isInEditMode()
            int r11 = r24.getChildCount()
            r0 = r7
        L_0x0026:
            if (r0 >= r11) goto L_0x0039
            android.view.View r1 = r6.getChildAt(r0)
            v.e r1 = r6.e(r1)
            if (r1 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r1.D()
        L_0x0036:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x0039:
            r0 = 0
            r12 = -1
            if (r10 == 0) goto L_0x00a3
            r1 = r7
        L_0x003e:
            if (r1 >= r11) goto L_0x00a3
            android.view.View r2 = r6.getChildAt(r1)
            android.content.res.Resources r3 = r24.getResources()     // Catch:{ NotFoundException -> 0x00a0 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x00a0 }
            java.lang.String r3 = r3.getResourceName(r4)     // Catch:{ NotFoundException -> 0x00a0 }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x00a0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x00a0 }
            r6.p(r3, r4)     // Catch:{ NotFoundException -> 0x00a0 }
            r4 = 47
            int r4 = r3.indexOf(r4)     // Catch:{ NotFoundException -> 0x00a0 }
            if (r4 == r12) goto L_0x0069
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x0069:
            int r2 = r2.getId()     // Catch:{ NotFoundException -> 0x00a0 }
            if (r2 != 0) goto L_0x0072
            v.f r2 = r6.f1438c     // Catch:{ NotFoundException -> 0x00a0 }
            goto L_0x009e
        L_0x0072:
            android.util.SparseArray<android.view.View> r4 = r6.f1436a     // Catch:{ NotFoundException -> 0x00a0 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ NotFoundException -> 0x00a0 }
            android.view.View r4 = (android.view.View) r4     // Catch:{ NotFoundException -> 0x00a0 }
            if (r4 != 0) goto L_0x008d
            android.view.View r4 = r6.findViewById(r2)     // Catch:{ NotFoundException -> 0x00a0 }
            if (r4 == 0) goto L_0x008d
            if (r4 == r6) goto L_0x008d
            android.view.ViewParent r2 = r4.getParent()     // Catch:{ NotFoundException -> 0x00a0 }
            if (r2 != r6) goto L_0x008d
            r6.onViewAdded(r4)     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x008d:
            if (r4 != r6) goto L_0x0092
            v.f r2 = r6.f1438c     // Catch:{ NotFoundException -> 0x00a0 }
            goto L_0x009e
        L_0x0092:
            if (r4 != 0) goto L_0x0096
            r2 = r0
            goto L_0x009e
        L_0x0096:
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()     // Catch:{ NotFoundException -> 0x00a0 }
            androidx.constraintlayout.widget.ConstraintLayout$b r2 = (androidx.constraintlayout.widget.ConstraintLayout.b) r2     // Catch:{ NotFoundException -> 0x00a0 }
            v.e r2 = r2.f1477q0     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x009e:
            r2.f12066j0 = r3     // Catch:{ NotFoundException -> 0x00a0 }
        L_0x00a0:
            int r1 = r1 + 1
            goto L_0x003e
        L_0x00a3:
            int r1 = r6.A
            if (r1 == r12) goto L_0x00c5
            r1 = r7
        L_0x00a8:
            if (r1 >= r11) goto L_0x00c5
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getId()
            int r4 = r6.A
            if (r3 != r4) goto L_0x00c2
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.d
            if (r3 == 0) goto L_0x00c2
            androidx.constraintlayout.widget.d r2 = (androidx.constraintlayout.widget.d) r2
            androidx.constraintlayout.widget.c r2 = r2.getConstraintSet()
            r6.f1445y = r2
        L_0x00c2:
            int r1 = r1 + 1
            goto L_0x00a8
        L_0x00c5:
            androidx.constraintlayout.widget.c r1 = r6.f1445y
            if (r1 == 0) goto L_0x00cc
            r1.b(r6)
        L_0x00cc:
            v.f r1 = r6.f1438c
            java.util.ArrayList<v.e> r1 = r1.f12108r0
            r1.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.b> r1 = r6.f1437b
            int r1 = r1.size()
            r13 = 2
            if (r1 <= 0) goto L_0x016b
            r2 = r7
        L_0x00dd:
            if (r2 >= r1) goto L_0x016b
            java.util.ArrayList<androidx.constraintlayout.widget.b> r3 = r6.f1437b
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.widget.b r3 = (androidx.constraintlayout.widget.b) r3
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L_0x00f2
            java.lang.String r4 = r3.f1506t
            r3.setIds(r4)
        L_0x00f2:
            v.a r4 = r3.f1505s
            if (r4 != 0) goto L_0x00f7
            goto L_0x0165
        L_0x00f7:
            r4.f12106s0 = r7
            v.e[] r4 = r4.f12105r0
            java.util.Arrays.fill(r4, r0)
            r4 = r7
        L_0x00ff:
            int r5 = r3.f1503b
            if (r4 >= r5) goto L_0x0160
            int[] r5 = r3.f1502a
            r5 = r5[r4]
            android.view.View r14 = r6.d(r5)
            if (r14 != 0) goto L_0x0130
            java.util.HashMap<java.lang.Integer, java.lang.String> r15 = r3.f1509w
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r15.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r15 = r3.h(r6, r5)
            if (r15 == 0) goto L_0x0130
            int[] r14 = r3.f1502a
            r14[r4] = r15
            java.util.HashMap<java.lang.Integer, java.lang.String> r14 = r3.f1509w
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r14.put(r0, r5)
            android.view.View r14 = r6.d(r15)
        L_0x0130:
            if (r14 == 0) goto L_0x015b
            v.a r0 = r3.f1505s
            v.e r5 = r6.e(r14)
            java.util.Objects.requireNonNull(r0)
            if (r5 == r0) goto L_0x015b
            if (r5 != 0) goto L_0x0140
            goto L_0x015b
        L_0x0140:
            int r14 = r0.f12106s0
            int r14 = r14 + r8
            v.e[] r15 = r0.f12105r0
            int r7 = r15.length
            if (r14 <= r7) goto L_0x0152
            int r7 = r15.length
            int r7 = r7 * r13
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r15, r7)
            v.e[] r7 = (v.e[]) r7
            r0.f12105r0 = r7
        L_0x0152:
            v.e[] r7 = r0.f12105r0
            int r14 = r0.f12106s0
            r7[r14] = r5
            int r14 = r14 + r8
            r0.f12106s0 = r14
        L_0x015b:
            int r4 = r4 + 1
            r0 = 0
            r7 = 0
            goto L_0x00ff
        L_0x0160:
            v.a r0 = r3.f1505s
            java.util.Objects.requireNonNull(r0)
        L_0x0165:
            int r2 = r2 + 1
            r0 = 0
            r7 = 0
            goto L_0x00dd
        L_0x016b:
            r0 = 0
        L_0x016c:
            if (r0 >= r11) goto L_0x01a5
            android.view.View r1 = r6.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.e
            if (r2 == 0) goto L_0x01a2
            androidx.constraintlayout.widget.e r1 = (androidx.constraintlayout.widget.e) r1
            int r2 = r1.f1604a
            if (r2 != r12) goto L_0x0187
            boolean r2 = r1.isInEditMode()
            if (r2 != 0) goto L_0x0187
            int r2 = r1.f1606c
            r1.setVisibility(r2)
        L_0x0187:
            int r2 = r1.f1604a
            android.view.View r2 = r6.findViewById(r2)
            r1.f1605b = r2
            if (r2 == 0) goto L_0x01a2
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r2 = (androidx.constraintlayout.widget.ConstraintLayout.b) r2
            r2.f1457f0 = r8
            android.view.View r2 = r1.f1605b
            r3 = 0
            r2.setVisibility(r3)
            r1.setVisibility(r3)
        L_0x01a2:
            int r0 = r0 + 1
            goto L_0x016c
        L_0x01a5:
            android.util.SparseArray<v.e> r0 = r6.C
            r0.clear()
            android.util.SparseArray<v.e> r0 = r6.C
            v.f r1 = r6.f1438c
            r2 = 0
            r0.put(r2, r1)
            android.util.SparseArray<v.e> r0 = r6.C
            int r1 = r24.getId()
            v.f r2 = r6.f1438c
            r0.put(r1, r2)
            r0 = 0
        L_0x01be:
            if (r0 >= r11) goto L_0x01d4
            android.view.View r1 = r6.getChildAt(r0)
            v.e r2 = r6.e(r1)
            android.util.SparseArray<v.e> r3 = r6.C
            int r1 = r1.getId()
            r3.put(r1, r2)
            int r0 = r0 + 1
            goto L_0x01be
        L_0x01d4:
            r7 = 0
        L_0x01d5:
            if (r7 >= r11) goto L_0x0560
            android.view.View r0 = r6.getChildAt(r7)
            v.e r14 = r6.e(r0)
            if (r14 != 0) goto L_0x01e3
            goto L_0x0255
        L_0x01e3:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r15 = r1
            androidx.constraintlayout.widget.ConstraintLayout$b r15 = (androidx.constraintlayout.widget.ConstraintLayout.b) r15
            v.f r1 = r6.f1438c
            java.util.ArrayList<v.e> r2 = r1.f12108r0
            r2.add(r14)
            v.e r2 = r14.V
            if (r2 == 0) goto L_0x01ff
            v.l r2 = (v.l) r2
            java.util.ArrayList<v.e> r2 = r2.f12108r0
            r2.remove(r14)
            r14.D()
        L_0x01ff:
            r14.V = r1
            android.util.SparseArray<v.e> r3 = r6.C
            r15.a()
            int r1 = r0.getVisibility()
            r14.f12064i0 = r1
            boolean r1 = r15.f1457f0
            if (r1 == 0) goto L_0x0216
            r14.F = r8
            r1 = 8
            r14.f12064i0 = r1
        L_0x0216:
            r14.f12063h0 = r0
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.b
            if (r1 == 0) goto L_0x0225
            androidx.constraintlayout.widget.b r0 = (androidx.constraintlayout.widget.b) r0
            v.f r1 = r6.f1438c
            boolean r1 = r1.f12095w0
            r0.j(r14, r1)
        L_0x0225:
            boolean r0 = r15.f1453d0
            if (r0 == 0) goto L_0x025c
            v.g r14 = (v.g) r14
            int r0 = r15.f1471n0
            int r1 = r15.f1473o0
            float r2 = r15.f1475p0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0240
            if (r4 <= 0) goto L_0x0255
            r14.f12098r0 = r2
            r14.f12099s0 = r12
            r14.f12100t0 = r12
            goto L_0x0255
        L_0x0240:
            if (r0 == r12) goto L_0x024b
            if (r0 <= r12) goto L_0x0255
            r14.f12098r0 = r3
            r14.f12099s0 = r0
            r14.f12100t0 = r12
            goto L_0x0255
        L_0x024b:
            if (r1 == r12) goto L_0x0255
            if (r1 <= r12) goto L_0x0255
            r14.f12098r0 = r3
            r14.f12099s0 = r12
            r14.f12100t0 = r1
        L_0x0255:
            r2 = r8
            r22 = r11
            r0 = r13
            r3 = 0
            goto L_0x0556
        L_0x025c:
            int r0 = r15.f1458g0
            int r1 = r15.f1460h0
            int r2 = r15.f1461i0
            int r4 = r15.f1463j0
            int r5 = r15.f1465k0
            int r13 = r15.f1467l0
            float r8 = r15.f1469m0
            int r6 = r15.f1474p
            r22 = r11
            r11 = 0
            if (r6 == r12) goto L_0x0290
            java.lang.Object r0 = r3.get(r6)
            r18 = r0
            v.e r18 = (v.e) r18
            if (r18 == 0) goto L_0x03b3
            float r0 = r15.f1478r
            int r1 = r15.f1476q
            v.d$b r19 = v.d.b.CENTER
            r21 = 0
            r16 = r14
            r17 = r19
            r20 = r1
            r16.w(r17, r18, r19, r20, r21)
            r14.D = r0
            goto L_0x03b3
        L_0x0290:
            if (r0 == r12) goto L_0x02ac
            java.lang.Object r0 = r3.get(r0)
            r18 = r0
            v.e r18 = (v.e) r18
            if (r18 == 0) goto L_0x02c7
            v.d$b r19 = v.d.b.LEFT
            int r0 = r15.leftMargin
            r16 = r14
            r17 = r19
            r20 = r0
            r21 = r5
            r16.w(r17, r18, r19, r20, r21)
            goto L_0x02c7
        L_0x02ac:
            if (r1 == r12) goto L_0x02c7
            java.lang.Object r0 = r3.get(r1)
            r18 = r0
            v.e r18 = (v.e) r18
            if (r18 == 0) goto L_0x02c7
            v.d$b r17 = v.d.b.LEFT
            v.d$b r19 = v.d.b.RIGHT
            int r0 = r15.leftMargin
            r16 = r14
            r20 = r0
            r21 = r5
            r16.w(r17, r18, r19, r20, r21)
        L_0x02c7:
            if (r2 == r12) goto L_0x02e3
            java.lang.Object r0 = r3.get(r2)
            r18 = r0
            v.e r18 = (v.e) r18
            if (r18 == 0) goto L_0x02fe
            v.d$b r17 = v.d.b.RIGHT
            v.d$b r19 = v.d.b.LEFT
            int r0 = r15.rightMargin
            r16 = r14
            r20 = r0
            r21 = r13
            r16.w(r17, r18, r19, r20, r21)
            goto L_0x02fe
        L_0x02e3:
            if (r4 == r12) goto L_0x02fe
            java.lang.Object r0 = r3.get(r4)
            r18 = r0
            v.e r18 = (v.e) r18
            if (r18 == 0) goto L_0x02fe
            v.d$b r19 = v.d.b.RIGHT
            int r0 = r15.rightMargin
            r16 = r14
            r17 = r19
            r20 = r0
            r21 = r13
            r16.w(r17, r18, r19, r20, r21)
        L_0x02fe:
            int r0 = r15.i
            if (r0 == r12) goto L_0x031e
            java.lang.Object r0 = r3.get(r0)
            r18 = r0
            v.e r18 = (v.e) r18
            if (r18 == 0) goto L_0x033d
            v.d$b r19 = v.d.b.TOP
            int r0 = r15.topMargin
            int r1 = r15.f1484x
            r16 = r14
            r17 = r19
            r20 = r0
            r21 = r1
            r16.w(r17, r18, r19, r20, r21)
            goto L_0x033d
        L_0x031e:
            int r0 = r15.f1462j
            if (r0 == r12) goto L_0x033d
            java.lang.Object r0 = r3.get(r0)
            r18 = r0
            v.e r18 = (v.e) r18
            if (r18 == 0) goto L_0x033d
            v.d$b r17 = v.d.b.TOP
            v.d$b r19 = v.d.b.BOTTOM
            int r0 = r15.topMargin
            int r1 = r15.f1484x
            r16 = r14
            r20 = r0
            r21 = r1
            r16.w(r17, r18, r19, r20, r21)
        L_0x033d:
            int r0 = r15.f1464k
            if (r0 == r12) goto L_0x035d
            java.lang.Object r0 = r3.get(r0)
            r18 = r0
            v.e r18 = (v.e) r18
            if (r18 == 0) goto L_0x037c
            v.d$b r17 = v.d.b.BOTTOM
            v.d$b r19 = v.d.b.TOP
            int r0 = r15.bottomMargin
            int r1 = r15.z
            r16 = r14
            r20 = r0
            r21 = r1
            r16.w(r17, r18, r19, r20, r21)
            goto L_0x037c
        L_0x035d:
            int r0 = r15.f1466l
            if (r0 == r12) goto L_0x037c
            java.lang.Object r0 = r3.get(r0)
            r18 = r0
            v.e r18 = (v.e) r18
            if (r18 == 0) goto L_0x037c
            v.d$b r19 = v.d.b.BOTTOM
            int r0 = r15.bottomMargin
            int r1 = r15.z
            r16 = r14
            r17 = r19
            r20 = r0
            r21 = r1
            r16.w(r17, r18, r19, r20, r21)
        L_0x037c:
            int r4 = r15.f1468m
            if (r4 == r12) goto L_0x038a
            v.d$b r5 = v.d.b.BASELINE
            r0 = r24
            r1 = r14
            r2 = r15
            r0.q(r1, r2, r3, r4, r5)
            goto L_0x03a5
        L_0x038a:
            int r4 = r15.f1470n
            if (r4 == r12) goto L_0x0398
            v.d$b r5 = v.d.b.TOP
            r0 = r24
            r1 = r14
            r2 = r15
            r0.q(r1, r2, r3, r4, r5)
            goto L_0x03a5
        L_0x0398:
            int r4 = r15.f1472o
            if (r4 == r12) goto L_0x03a5
            v.d$b r5 = v.d.b.BOTTOM
            r0 = r24
            r1 = r14
            r2 = r15
            r0.q(r1, r2, r3, r4, r5)
        L_0x03a5:
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x03ab
            r14.f12060f0 = r8
        L_0x03ab:
            float r0 = r15.F
            int r1 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r1 < 0) goto L_0x03b3
            r14.f12061g0 = r0
        L_0x03b3:
            if (r10 == 0) goto L_0x03c3
            int r0 = r15.T
            if (r0 != r12) goto L_0x03bd
            int r1 = r15.U
            if (r1 == r12) goto L_0x03c3
        L_0x03bd:
            int r1 = r15.U
            r14.f12051a0 = r0
            r14.b0 = r1
        L_0x03c3:
            boolean r0 = r15.f1448a0
            r1 = -2
            if (r0 != 0) goto L_0x03fa
            int r0 = r15.width
            if (r0 != r12) goto L_0x03f0
            boolean r0 = r15.W
            if (r0 == 0) goto L_0x03d6
            v.e$b r0 = v.e.b.MATCH_CONSTRAINT
            r14.M(r0)
            goto L_0x03db
        L_0x03d6:
            v.e$b r0 = v.e.b.MATCH_PARENT
            r14.M(r0)
        L_0x03db:
            v.d$b r0 = v.d.b.LEFT
            v.d r0 = r14.h(r0)
            int r2 = r15.leftMargin
            r0.g = r2
            v.d$b r0 = v.d.b.RIGHT
            v.d r0 = r14.h(r0)
            int r2 = r15.rightMargin
            r0.g = r2
            goto L_0x040d
        L_0x03f0:
            v.e$b r0 = v.e.b.MATCH_CONSTRAINT
            r14.M(r0)
            r0 = 0
            r14.Q(r0)
            goto L_0x040d
        L_0x03fa:
            v.e$b r0 = v.e.b.FIXED
            r14.M(r0)
            int r0 = r15.width
            r14.Q(r0)
            int r0 = r15.width
            if (r0 != r1) goto L_0x040d
            v.e$b r0 = v.e.b.WRAP_CONTENT
            r14.M(r0)
        L_0x040d:
            boolean r0 = r15.b0
            if (r0 != 0) goto L_0x0443
            int r0 = r15.height
            if (r0 != r12) goto L_0x0439
            boolean r0 = r15.X
            if (r0 == 0) goto L_0x041f
            v.e$b r0 = v.e.b.MATCH_CONSTRAINT
            r14.P(r0)
            goto L_0x0424
        L_0x041f:
            v.e$b r0 = v.e.b.MATCH_PARENT
            r14.P(r0)
        L_0x0424:
            v.d$b r0 = v.d.b.TOP
            v.d r0 = r14.h(r0)
            int r1 = r15.topMargin
            r0.g = r1
            v.d$b r0 = v.d.b.BOTTOM
            v.d r0 = r14.h(r0)
            int r1 = r15.bottomMargin
            r0.g = r1
            goto L_0x0456
        L_0x0439:
            v.e$b r0 = v.e.b.MATCH_CONSTRAINT
            r14.P(r0)
            r0 = 0
            r14.L(r0)
            goto L_0x0456
        L_0x0443:
            v.e$b r0 = v.e.b.FIXED
            r14.P(r0)
            int r0 = r15.height
            r14.L(r0)
            int r0 = r15.height
            if (r0 != r1) goto L_0x0456
            v.e$b r0 = v.e.b.WRAP_CONTENT
            r14.P(r0)
        L_0x0456:
            java.lang.String r0 = r15.G
            if (r0 == 0) goto L_0x04f0
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0462
            goto L_0x04f0
        L_0x0462:
            int r1 = r0.length()
            r2 = 44
            int r2 = r0.indexOf(r2)
            if (r2 <= 0) goto L_0x0494
            int r3 = r1 + -1
            if (r2 >= r3) goto L_0x0494
            r3 = 0
            java.lang.String r4 = r0.substring(r3, r2)
            java.lang.String r3 = "W"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0481
            r3 = 0
            goto L_0x048c
        L_0x0481:
            java.lang.String r3 = "H"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x048b
            r3 = 1
            goto L_0x048c
        L_0x048b:
            r3 = r12
        L_0x048c:
            int r2 = r2 + 1
            r23 = r3
            r3 = r2
            r2 = r23
            goto L_0x0496
        L_0x0494:
            r2 = r12
            r3 = 0
        L_0x0496:
            r4 = 58
            int r4 = r0.indexOf(r4)
            if (r4 < 0) goto L_0x04d7
            int r1 = r1 + -1
            if (r4 >= r1) goto L_0x04d7
            java.lang.String r1 = r0.substring(r3, r4)
            int r4 = r4 + 1
            java.lang.String r0 = r0.substring(r4)
            int r3 = r1.length()
            if (r3 <= 0) goto L_0x04e6
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x04e6
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x04e6 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04e6 }
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x04e6
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x04e6
            r3 = 1
            if (r2 != r3) goto L_0x04d1
            float r0 = r0 / r1
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x04e6 }
            goto L_0x04e7
        L_0x04d1:
            float r1 = r1 / r0
            float r0 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x04e6 }
            goto L_0x04e7
        L_0x04d7:
            java.lang.String r0 = r0.substring(r3)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x04e6
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04e6 }
            goto L_0x04e7
        L_0x04e6:
            r0 = r11
        L_0x04e7:
            int r1 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x04f2
            r14.Y = r0
            r14.Z = r2
            goto L_0x04f2
        L_0x04f0:
            r14.Y = r11
        L_0x04f2:
            float r0 = r15.H
            float[] r1 = r14.f12072m0
            r3 = 0
            r1[r3] = r0
            float r0 = r15.I
            r2 = 1
            r1[r2] = r0
            int r0 = r15.J
            r14.f12068k0 = r0
            int r0 = r15.K
            r14.f12070l0 = r0
            int r0 = r15.Z
            if (r0 < 0) goto L_0x050f
            r1 = 3
            if (r0 > r1) goto L_0x050f
            r14.f12079q = r0
        L_0x050f:
            int r0 = r15.L
            int r1 = r15.N
            int r4 = r15.P
            float r5 = r15.R
            r14.f12081r = r0
            r14.f12084u = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r1) goto L_0x0521
            r4 = r3
        L_0x0521:
            r14.f12085v = r4
            r14.f12086w = r5
            int r4 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 <= 0) goto L_0x0534
            int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0534
            if (r0 != 0) goto L_0x0534
            r0 = 2
            r14.f12081r = r0
        L_0x0534:
            int r0 = r15.M
            int r4 = r15.O
            int r5 = r15.Q
            float r8 = r15.S
            r14.f12082s = r0
            r14.f12087x = r4
            if (r5 != r1) goto L_0x0543
            r5 = r3
        L_0x0543:
            r14.f12088y = r5
            r14.z = r8
            int r1 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x0555
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0555
            if (r0 != 0) goto L_0x0555
            r0 = 2
            r14.f12082s = r0
            goto L_0x0556
        L_0x0555:
            r0 = 2
        L_0x0556:
            int r7 = r7 + 1
            r6 = r24
            r13 = r0
            r8 = r2
            r11 = r22
            goto L_0x01d5
        L_0x0560:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r():boolean");
    }

    public void requestLayout() {
        this.f1443w = true;
        super.requestLayout();
    }

    public void setConstraintSet(c cVar) {
        this.f1445y = cVar;
    }

    public void setId(int i) {
        this.f1436a.remove(getId());
        super.setId(i);
        this.f1436a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f1442v) {
            this.f1442v = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f1441u) {
            this.f1441u = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f1440t) {
            this.f1440t = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f1439s) {
            this.f1439s = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(y.b bVar) {
    }

    public void setOptimizationLevel(int i) {
        this.f1444x = i;
        this.f1438c.e0(i);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f(attributeSet, i);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        public int B = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        public int C = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        public int D = 0;
        public float E = 0.5f;
        public float F = 0.5f;
        public String G = null;
        public float H = -1.0f;
        public float I = -1.0f;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public float R = 1.0f;
        public float S = 1.0f;
        public int T = -1;
        public int U = -1;
        public int V = -1;
        public boolean W = false;
        public boolean X = false;
        public String Y = null;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public int f1447a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f1448a0 = true;

        /* renamed from: b  reason: collision with root package name */
        public int f1449b = -1;
        public boolean b0 = true;

        /* renamed from: c  reason: collision with root package name */
        public float f1450c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f1451c0 = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1452d = true;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f1453d0 = false;

        /* renamed from: e  reason: collision with root package name */
        public int f1454e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f1455e0 = false;

        /* renamed from: f  reason: collision with root package name */
        public int f1456f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f1457f0 = false;
        public int g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f1458g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f1459h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f1460h0 = -1;
        public int i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f1461i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f1462j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f1463j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f1464k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int f1465k0 = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

        /* renamed from: l  reason: collision with root package name */
        public int f1466l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public int f1467l0 = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

        /* renamed from: m  reason: collision with root package name */
        public int f1468m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public float f1469m0 = 0.5f;

        /* renamed from: n  reason: collision with root package name */
        public int f1470n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public int f1471n0;

        /* renamed from: o  reason: collision with root package name */
        public int f1472o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public int f1473o0;

        /* renamed from: p  reason: collision with root package name */
        public int f1474p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public float f1475p0;

        /* renamed from: q  reason: collision with root package name */
        public int f1476q = 0;

        /* renamed from: q0  reason: collision with root package name */
        public e f1477q0 = new e();

        /* renamed from: r  reason: collision with root package name */
        public float f1478r = 0.0f;

        /* renamed from: s  reason: collision with root package name */
        public int f1479s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1480t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1481u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1482v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f1483w = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

        /* renamed from: x  reason: collision with root package name */
        public int f1484x = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

        /* renamed from: y  reason: collision with root package name */
        public int f1485y = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        public int z = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f1486a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1486a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(LocationRequest.PRIORITY_LOW_POWER, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(LocationRequest.PRIORITY_NO_POWER, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.c.f311f0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f1486a.get(index);
                switch (i11) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1474p);
                        this.f1474p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f1474p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f1476q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1476q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f1478r) % 360.0f;
                        this.f1478r = f10;
                        if (f10 >= 0.0f) {
                            break;
                        } else {
                            this.f1478r = (360.0f - f10) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f1447a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1447a);
                        break;
                    case 6:
                        this.f1449b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1449b);
                        break;
                    case 7:
                        this.f1450c = obtainStyledAttributes.getFloat(index, this.f1450c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1454e);
                        this.f1454e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f1454e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1456f);
                        this.f1456f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f1456f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1459h);
                        this.f1459h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f1459h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1462j);
                        this.f1462j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f1462j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1464k);
                        this.f1464k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f1464k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1466l);
                        this.f1466l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f1466l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1468m);
                        this.f1468m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f1468m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1479s);
                        this.f1479s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f1479s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1480t);
                        this.f1480t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f1480t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1481u);
                        this.f1481u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f1481u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1482v);
                        this.f1482v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f1482v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f1483w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1483w);
                        break;
                    case 22:
                        this.f1484x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1484x);
                        break;
                    case 23:
                        this.f1485y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1485y);
                        break;
                    case 24:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case R.styleable.MapAttrs_zOrderOnTop /*25*/:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        break;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        break;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        break;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        break;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i12;
                        if (i12 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case LZ4BlockOutputStream.COMPRESSION_METHOD_LZ4 /*32*/:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i13;
                        if (i13 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) != -2) {
                                break;
                            } else {
                                this.N = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) != -2) {
                                break;
                            } else {
                                this.P = -2;
                                break;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        break;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) != -2) {
                                break;
                            } else {
                                this.O = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) != -2) {
                                break;
                            } else {
                                this.Q = -2;
                                break;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                c.i(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                break;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                break;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                break;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                break;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1470n);
                                this.f1470n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f1470n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1472o);
                                this.f1472o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f1472o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                                        c.h(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        c.h(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 67:
                                        this.f1452d = obtainStyledAttributes.getBoolean(index, this.f1452d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f1453d0 = false;
            this.f1448a0 = true;
            this.b0 = true;
            int i10 = this.width;
            if (i10 == -2 && this.W) {
                this.f1448a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i11 = this.height;
            if (i11 == -2 && this.X) {
                this.b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1448a0 = false;
                if (i10 == 0 && this.L == 1) {
                    this.width = -2;
                    this.W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.b0 = false;
                if (i11 == 0 && this.M == 1) {
                    this.height = -2;
                    this.X = true;
                }
            }
            if (this.f1450c != -1.0f || this.f1447a != -1 || this.f1449b != -1) {
                this.f1453d0 = true;
                this.f1448a0 = true;
                this.b0 = true;
                if (!(this.f1477q0 instanceof g)) {
                    this.f1477q0 = new g();
                }
                ((g) this.f1477q0).U(this.V);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f1461i0 = r4
                r10.f1463j0 = r4
                r10.f1458g0 = r4
                r10.f1460h0 = r4
                int r5 = r10.f1483w
                r10.f1465k0 = r5
                int r5 = r10.f1485y
                r10.f1467l0 = r5
                float r5 = r10.E
                r10.f1469m0 = r5
                int r6 = r10.f1447a
                r10.f1471n0 = r6
                int r7 = r10.f1449b
                r10.f1473o0 = r7
                float r8 = r10.f1450c
                r10.f1475p0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0094
                int r11 = r10.f1479s
                if (r11 == r4) goto L_0x003f
                r10.f1461i0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f1480t
                if (r11 == r4) goto L_0x0046
                r10.f1463j0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f1481u
                if (r11 == r4) goto L_0x004d
                r10.f1460h0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f1482v
                if (r11 == r4) goto L_0x0054
                r10.f1458g0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.A
                if (r11 == r9) goto L_0x005a
                r10.f1467l0 = r11
            L_0x005a:
                int r11 = r10.B
                if (r11 == r9) goto L_0x0060
                r10.f1465k0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f1469m0 = r2
            L_0x0068:
                boolean r2 = r10.f1453d0
                if (r2 == 0) goto L_0x00b8
                int r2 = r10.V
                if (r2 != r3) goto L_0x00b8
                boolean r2 = r10.f1452d
                if (r2 == 0) goto L_0x00b8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f1475p0 = r11
                r10.f1471n0 = r4
                r10.f1473o0 = r4
                goto L_0x00b8
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f1473o0 = r6
                r10.f1471n0 = r4
                r10.f1475p0 = r2
                goto L_0x00b8
            L_0x008b:
                if (r7 == r4) goto L_0x00b8
                r10.f1471n0 = r7
                r10.f1473o0 = r4
                r10.f1475p0 = r2
                goto L_0x00b8
            L_0x0094:
                int r11 = r10.f1479s
                if (r11 == r4) goto L_0x009a
                r10.f1460h0 = r11
            L_0x009a:
                int r11 = r10.f1480t
                if (r11 == r4) goto L_0x00a0
                r10.f1458g0 = r11
            L_0x00a0:
                int r11 = r10.f1481u
                if (r11 == r4) goto L_0x00a6
                r10.f1461i0 = r11
            L_0x00a6:
                int r11 = r10.f1482v
                if (r11 == r4) goto L_0x00ac
                r10.f1463j0 = r11
            L_0x00ac:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00b2
                r10.f1465k0 = r11
            L_0x00b2:
                int r11 = r10.B
                if (r11 == r9) goto L_0x00b8
                r10.f1467l0 = r11
            L_0x00b8:
                int r11 = r10.f1481u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f1482v
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f1480t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f1479s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.g
                if (r11 == r4) goto L_0x00d7
                r10.f1461i0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
                goto L_0x00e5
            L_0x00d7:
                int r11 = r10.f1459h
                if (r11 == r4) goto L_0x00e5
                r10.f1463j0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
            L_0x00e5:
                int r11 = r10.f1454e
                if (r11 == r4) goto L_0x00f4
                r10.f1458g0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f4:
                int r11 = r10.f1456f
                if (r11 == r4) goto L_0x0102
                r10.f1460h0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b() {
            super(-2, -2);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
