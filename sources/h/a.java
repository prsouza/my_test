package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public abstract class a {

    public interface b {
        void a();
    }

    @Deprecated
    public static abstract class c {
        public abstract void a();
    }

    /* renamed from: h.a$a  reason: collision with other inner class name */
    public static class C0090a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f5519a = 8388627;

        public C0090a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.c.f337v);
            this.f5519a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0090a() {
            super(-2, -2);
        }

        public C0090a(C0090a aVar) {
            super(aVar);
            this.f5519a = aVar.f5519a;
        }

        public C0090a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
