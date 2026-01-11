package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import v.a;
import v.e;
import y.c;

public abstract class b extends View {

    /* renamed from: a  reason: collision with root package name */
    public int[] f1502a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    public int f1503b;

    /* renamed from: c  reason: collision with root package name */
    public Context f1504c;

    /* renamed from: s  reason: collision with root package name */
    public a f1505s;

    /* renamed from: t  reason: collision with root package name */
    public String f1506t;

    /* renamed from: u  reason: collision with root package name */
    public String f1507u;

    /* renamed from: v  reason: collision with root package name */
    public View[] f1508v = null;

    /* renamed from: w  reason: collision with root package name */
    public HashMap<Integer, String> f1509w = new HashMap<>();

    public b(Context context) {
        super(context);
        this.f1504c = context;
        i((AttributeSet) null);
    }

    public final void c(String str) {
        if (str != null && str.length() != 0 && this.f1504c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            int i = 0;
            if (isInEditMode() && constraintLayout2 != null) {
                Object c10 = constraintLayout2.c(trim);
                if (c10 instanceof Integer) {
                    i = ((Integer) c10).intValue();
                }
            }
            if (i == 0 && constraintLayout2 != null) {
                i = h(constraintLayout2, trim);
            }
            if (i == 0) {
                try {
                    i = c.class.getField(trim).getInt((Object) null);
                } catch (Exception unused) {
                }
            }
            if (i == 0) {
                i = this.f1504c.getResources().getIdentifier(trim, "id", this.f1504c.getPackageName());
            }
            if (i != 0) {
                this.f1509w.put(Integer.valueOf(i), trim);
                d(i);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void d(int i) {
        if (i != getId()) {
            int i10 = this.f1503b + 1;
            int[] iArr = this.f1502a;
            if (i10 > iArr.length) {
                this.f1502a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1502a;
            int i11 = this.f1503b;
            iArr2[i11] = i;
            this.f1503b = i11 + 1;
        }
    }

    public final void e(String str) {
        if (str != null && str.length() != 0 && this.f1504c != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).Y)) {
                    if (childAt.getId() == -1) {
                        StringBuilder d10 = a.a.d("to use ConstraintTag view ");
                        d10.append(childAt.getClass().getSimpleName());
                        d10.append(" must have an ID");
                        Log.w("ConstraintHelper", d10.toString());
                    } else {
                        d(childAt.getId());
                    }
                }
            }
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f1503b; i++) {
            View d10 = constraintLayout.d(this.f1502a[i]);
            if (d10 != null) {
                d10.setVisibility(visibility);
                if (elevation > 0.0f) {
                    d10.setTranslationZ(d10.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1502a, this.f1503b);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1504c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ad.c.f311f0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1506t = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1507u = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(e eVar, boolean z) {
    }

    public final void k() {
        if (this.f1505s != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).f1477q0 = this.f1505s;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1506t;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1507u;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    public final void onMeasure(int i, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1506t = str;
        if (str != null) {
            int i = 0;
            this.f1503b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    c(str.substring(i));
                    return;
                } else {
                    c(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1507u = str;
        if (str != null) {
            int i = 0;
            this.f1503b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    e(str.substring(i));
                    return;
                } else {
                    e(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1506t = null;
        this.f1503b = 0;
        for (int d10 : iArr) {
            d(d10);
        }
    }

    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f1506t == null) {
            d(i);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1504c = context;
        i(attributeSet);
    }
}
