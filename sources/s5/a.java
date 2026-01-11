package s5;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public final class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f10929a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10930b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10931c;

    /* renamed from: s  reason: collision with root package name */
    public final int f10932s;

    public a(Dialog dialog, Rect rect) {
        this.f10929a = dialog;
        this.f10930b = rect.left;
        this.f10931c = rect.top;
        this.f10932s = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f10930b;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f10931c;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f10932s;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f10929a.onTouchEvent(obtain);
    }
}
