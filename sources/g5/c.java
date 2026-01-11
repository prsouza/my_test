package g5;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;
import n0.a0;
import n0.e0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;

public abstract class c extends d<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f5248c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f5249d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public int f5250e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f5251f;

    public c() {
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11) {
        View v10;
        e0 lastWindowInsets;
        int i12 = view.getLayoutParams().height;
        if ((i12 != -1 && i12 != -2) || (v10 = v(coordinatorLayout.d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (size > 0) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            if (x.d.b(v10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.c() + lastWindowInsets.f();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.s(view, i, i10, View.MeasureSpec.makeMeasureSpec((x(v10) + size) - v10.getMeasuredHeight(), i12 == -1 ? 1073741824 : LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK));
        return true;
    }

    public final void t(CoordinatorLayout coordinatorLayout, View view, int i) {
        View v10 = v(coordinatorLayout.d(view));
        int i10 = 0;
        if (v10 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f5248c;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, v10.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((v10.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            e0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                if (x.d.b(coordinatorLayout) && !x.d.b(view)) {
                    rect.left = lastWindowInsets.d() + rect.left;
                    rect.right -= lastWindowInsets.e();
                }
            }
            Rect rect2 = this.f5249d;
            int i11 = fVar.f1621c;
            if (i11 == 0) {
                i11 = 8388659;
            }
            Gravity.apply(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            if (this.f5251f != 0) {
                float w6 = w(v10);
                int i12 = this.f5251f;
                i10 = y.c.s((int) (w6 * ((float) i12)), 0, i12);
            }
            view.layout(rect2.left, rect2.top - i10, rect2.right, rect2.bottom - i10);
            this.f5250e = rect2.top - v10.getBottom();
            return;
        }
        coordinatorLayout.r(view, i);
        this.f5250e = 0;
    }

    public abstract View v(List<View> list);

    public float w(View view) {
        return 1.0f;
    }

    public int x(View view) {
        return view.getMeasuredHeight();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
