package d6;

import android.graphics.Paint;
import android.graphics.Path;

public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f4340j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4341k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f4342l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f4343a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f4344b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f4345c;

    /* renamed from: d  reason: collision with root package name */
    public int f4346d;

    /* renamed from: e  reason: collision with root package name */
    public int f4347e;

    /* renamed from: f  reason: collision with root package name */
    public int f4348f;
    public final Path g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public Paint f4349h = new Paint();

    public a() {
        a(-16777216);
        this.f4349h.setColor(0);
        Paint paint = new Paint(4);
        this.f4344b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f4345c = new Paint(paint);
    }

    public final void a(int i10) {
        this.f4346d = g0.a.e(i10, 68);
        this.f4347e = g0.a.e(i10, 20);
        this.f4348f = g0.a.e(i10, 0);
        this.f4343a.setColor(this.f4346d);
    }
}
