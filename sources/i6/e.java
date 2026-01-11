package i6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import e6.f;
import e6.i;

public final class e extends f {
    public final RectF N;

    public e() {
        this((i) null);
    }

    public final void g(Canvas canvas) {
        if (this.N.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.N);
        } else {
            canvas.clipRect(this.N, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    public final void x(float f10, float f11, float f12, float f13) {
        RectF rectF = this.N;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(i iVar) {
        super(iVar == null ? new i() : iVar);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.N = new RectF();
    }
}
