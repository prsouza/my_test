package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Objects;

public final class q extends i {
    public q(g gVar) {
        super(gVar);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        Paint paint2 = paint;
        Objects.requireNonNull(d.a());
        g gVar = this.f1738b;
        Typeface typeface = gVar.f1724b.f1757d;
        Typeface typeface2 = paint.getTypeface();
        paint2.setTypeface(typeface);
        int i14 = gVar.f1723a * 2;
        char[] cArr = gVar.f1724b.f1755b;
        canvas.drawText(cArr, i14, 2, f10, (float) i12, paint);
        paint2.setTypeface(typeface2);
    }
}
