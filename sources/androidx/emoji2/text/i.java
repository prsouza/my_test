package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import c3.k;
import w0.a;

public abstract class i extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f1737a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    public final g f1738b;

    /* renamed from: c  reason: collision with root package name */
    public float f1739c = 1.0f;

    public i(g gVar) {
        k.S(gVar, "metadata cannot be null");
        this.f1738b = gVar;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i10, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f1737a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f1737a;
        this.f1739c = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f1738b.c());
        this.f1738b.c();
        a e10 = this.f1738b.e();
        int a10 = e10.a(12);
        short s10 = (short) ((int) (((float) (a10 != 0 ? e10.f12539b.getShort(a10 + e10.f12538a) : 0)) * this.f1739c));
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f1737a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s10;
    }
}
