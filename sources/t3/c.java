package t3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.b;
import g3.l;
import java.util.Objects;
import t3.f;

public final class c extends Drawable implements f.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    public final a f11292a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11293b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11294c;

    /* renamed from: s  reason: collision with root package name */
    public boolean f11295s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11296t = true;

    /* renamed from: u  reason: collision with root package name */
    public int f11297u;

    /* renamed from: v  reason: collision with root package name */
    public int f11298v = -1;

    /* renamed from: w  reason: collision with root package name */
    public boolean f11299w;

    /* renamed from: x  reason: collision with root package name */
    public Paint f11300x;

    /* renamed from: y  reason: collision with root package name */
    public Rect f11301y;

    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final f f11302a;

        public a(f fVar) {
            this.f11302a = fVar;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new c(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c(Context context, f3.a aVar, l<Bitmap> lVar, int i, int i10, Bitmap bitmap) {
        a aVar2 = new a(new f(b.b(context), aVar, i, i10, lVar, bitmap));
        this.f11292a = aVar2;
    }

    public final void a() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        f fVar = this.f11292a.f11302a;
        f.a aVar = fVar.i;
        if ((aVar != null ? aVar.f11320t : -1) == fVar.f11304a.d() - 1) {
            this.f11297u++;
        }
        int i = this.f11298v;
        if (i != -1 && this.f11297u >= i) {
            stop();
        }
    }

    public final Bitmap b() {
        return this.f11292a.f11302a.f11313l;
    }

    public final Paint c() {
        if (this.f11300x == null) {
            this.f11300x = new Paint(2);
        }
        return this.f11300x;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<t3.f$b>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.List<t3.f$b>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List<t3.f$b>, java.util.ArrayList] */
    public final void d() {
        aa.b.r(!this.f11295s, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f11292a.f11302a.f11304a.d() == 1) {
            invalidateSelf();
        } else if (!this.f11293b) {
            this.f11293b = true;
            f fVar = this.f11292a.f11302a;
            if (fVar.f11311j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            } else if (!fVar.f11306c.contains(this)) {
                boolean isEmpty = fVar.f11306c.isEmpty();
                fVar.f11306c.add(this);
                if (isEmpty && !fVar.f11309f) {
                    fVar.f11309f = true;
                    fVar.f11311j = false;
                    fVar.a();
                }
                invalidateSelf();
            } else {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
        }
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.f11295s) {
            if (this.f11299w) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f11301y == null) {
                    this.f11301y = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f11301y);
                this.f11299w = false;
            }
            f fVar = this.f11292a.f11302a;
            f.a aVar = fVar.i;
            if (aVar != null) {
                bitmap = aVar.f11322v;
            } else {
                bitmap = fVar.f11313l;
            }
            if (this.f11301y == null) {
                this.f11301y = new Rect();
            }
            canvas.drawBitmap(bitmap, (Rect) null, this.f11301y, c());
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<t3.f$b>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<t3.f$b>, java.util.ArrayList] */
    public final void e() {
        this.f11293b = false;
        f fVar = this.f11292a.f11302a;
        fVar.f11306c.remove(this);
        if (fVar.f11306c.isEmpty()) {
            fVar.f11309f = false;
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f11292a;
    }

    public final int getIntrinsicHeight() {
        return this.f11292a.f11302a.f11318q;
    }

    public final int getIntrinsicWidth() {
        return this.f11292a.f11302a.f11317p;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f11293b;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11299w = true;
    }

    public final void setAlpha(int i) {
        c().setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z10) {
        aa.b.r(!this.f11295s, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f11296t = z;
        if (!z) {
            e();
        } else if (this.f11294c) {
            d();
        }
        return super.setVisible(z, z10);
    }

    public final void start() {
        this.f11294c = true;
        this.f11297u = 0;
        if (this.f11296t) {
            d();
        }
    }

    public final void stop() {
        this.f11294c = false;
        e();
    }

    public c(a aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f11292a = aVar;
    }
}
