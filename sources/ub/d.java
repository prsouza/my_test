package ub;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import e6.e;
import java.util.Objects;

public final class d extends RecyclerView.m {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f11927a;

    public d(Drawable drawable) {
        this.f11927a = drawable;
    }

    public final void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        e.D(canvas, "canvas");
        e.D(recyclerView, "parent");
        e.D(yVar, "state");
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount() - 2;
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                View childAt = recyclerView.getChildAt(i);
                e.C(childAt, "parent.getChildAt(i)");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int bottom = childAt.getBottom() + ((RecyclerView.o) layoutParams).bottomMargin;
                Drawable drawable = this.f11927a;
                e.B(drawable);
                this.f11927a.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                this.f11927a.draw(canvas);
                if (i != childCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
