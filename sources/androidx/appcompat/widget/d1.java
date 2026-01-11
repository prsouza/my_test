package androidx.appcompat.widget;

import a.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import f0.f;

public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1206a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f1207b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1208c;

    public d1(Context context, TypedArray typedArray) {
        this.f1206a = context;
        this.f1207b = typedArray;
    }

    public static d1 p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new d1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static d1 q(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new d1(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final boolean a(int i, boolean z) {
        return this.f1207b.getBoolean(i, z);
    }

    public final int b() {
        return this.f1207b.getColor(14, 0);
    }

    public final ColorStateList c(int i) {
        int resourceId;
        ColorStateList Z;
        if (!this.f1207b.hasValue(i) || (resourceId = this.f1207b.getResourceId(i, 0)) == 0 || (Z = b.Z(this.f1206a, resourceId)) == null) {
            return this.f1207b.getColorStateList(i);
        }
        return Z;
    }

    public final float d(int i) {
        return this.f1207b.getDimension(i, -1.0f);
    }

    public final int e(int i, int i10) {
        return this.f1207b.getDimensionPixelOffset(i, i10);
    }

    public final int f(int i, int i10) {
        return this.f1207b.getDimensionPixelSize(i, i10);
    }

    public final Drawable g(int i) {
        int resourceId;
        if (!this.f1207b.hasValue(i) || (resourceId = this.f1207b.getResourceId(i, 0)) == 0) {
            return this.f1207b.getDrawable(i);
        }
        return b.a0(this.f1206a, resourceId);
    }

    public final Drawable h(int i) {
        int resourceId;
        Drawable g;
        if (!this.f1207b.hasValue(i) || (resourceId = this.f1207b.getResourceId(i, 0)) == 0) {
            return null;
        }
        l a10 = l.a();
        Context context = this.f1206a;
        synchronized (a10) {
            g = a10.f1313a.g(context, resourceId, true);
        }
        return g;
    }

    public final Typeface i(int i, int i10, f.c cVar) {
        int resourceId = this.f1207b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1208c == null) {
            this.f1208c = new TypedValue();
        }
        Context context = this.f1206a;
        TypedValue typedValue = this.f1208c;
        ThreadLocal<TypedValue> threadLocal = f.f4887a;
        if (context.isRestricted()) {
            return null;
        }
        return f.b(context, resourceId, typedValue, i10, cVar, true, false);
    }

    public final int j(int i, int i10) {
        return this.f1207b.getInt(i, i10);
    }

    public final int k(int i, int i10) {
        return this.f1207b.getLayoutDimension(i, i10);
    }

    public final int l(int i, int i10) {
        return this.f1207b.getResourceId(i, i10);
    }

    public final String m(int i) {
        return this.f1207b.getString(i);
    }

    public final CharSequence n(int i) {
        return this.f1207b.getText(i);
    }

    public final boolean o(int i) {
        return this.f1207b.hasValue(i);
    }

    public final void r() {
        this.f1207b.recycle();
    }
}
