package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class e extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f1604a;

    /* renamed from: b  reason: collision with root package name */
    public View f1605b;

    /* renamed from: c  reason: collision with root package name */
    public int f1606c;

    public View getContent() {
        return this.f1605b;
    }

    public int getEmptyVisibility() {
        return this.f1606c;
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) rect.height()) / 2.0f) + (((float) height) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f1604a != i) {
            View view = this.f1605b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.b) this.f1605b.getLayoutParams()).f1457f0 = false;
                this.f1605b = null;
            }
            this.f1604a = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1606c = i;
    }
}
