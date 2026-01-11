package io.nodle.map_marker;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import e6.e;
import java.util.ArrayList;
import java.util.Iterator;
import wb.b;
import wb.c;

public final class MarkerView extends View {

    /* renamed from: t  reason: collision with root package name */
    public static final a f6841t = new a();

    /* renamed from: u  reason: collision with root package name */
    public static float f6842u;

    /* renamed from: v  reason: collision with root package name */
    public static ArrayList<b> f6843v = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public long f6844a;

    /* renamed from: b  reason: collision with root package name */
    public long f6845b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<wb.a> f6846c = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    public c f6847s;

    public static final class a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e.D(context, "context");
        e.D(attributeSet, "attrs");
        long currentTimeMillis = System.currentTimeMillis();
        this.f6844a = currentTimeMillis;
        this.f6845b = currentTimeMillis;
    }

    public final void onDraw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f6844a = currentTimeMillis;
        f6842u = ((float) (currentTimeMillis - this.f6845b)) / 1000.0f;
        Iterator<wb.a> it = this.f6846c.iterator();
        while (it.hasNext()) {
            it.next().a(canvas);
        }
        if (this.f6846c.removeAll(f6843v)) {
            f6843v.clear();
        }
        invalidate();
        this.f6845b = this.f6844a;
    }

    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
    }
}
