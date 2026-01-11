package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class o extends RecyclerView.x {
    public final LinearInterpolator i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f2577j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    public PointF f2578k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f2579l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2580m = false;

    /* renamed from: n  reason: collision with root package name */
    public float f2581n;

    /* renamed from: o  reason: collision with root package name */
    public int f2582o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f2583p = 0;

    public o(Context context) {
        this.f2579l = context.getResources().getDisplayMetrics();
    }

    public void c(View view, RecyclerView.x.a aVar) {
        int i10;
        int i11;
        int i12;
        PointF pointF = this.f2578k;
        int i13 = 0;
        int i14 = (pointF == null || pointF.x == 0.0f) ? 0 : i12 > 0 ? 1 : -1;
        RecyclerView.n nVar = this.f2384c;
        if (nVar == null || !nVar.e()) {
            i10 = 0;
        } else {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            i10 = e(nVar.C(view) - oVar.leftMargin, nVar.D(view) + oVar.rightMargin, nVar.K(), nVar.f2355p - nVar.L(), i14);
        }
        PointF pointF2 = this.f2578k;
        int i15 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : i11 > 0 ? 1 : -1;
        RecyclerView.n nVar2 = this.f2384c;
        if (nVar2 != null && nVar2.f()) {
            RecyclerView.o oVar2 = (RecyclerView.o) view.getLayoutParams();
            i13 = e(nVar2.E(view) - oVar2.topMargin, nVar2.A(view) + oVar2.bottomMargin, nVar2.M(), nVar2.f2356q - nVar2.J(), i15);
        }
        int ceil = (int) Math.ceil(((double) g((int) Math.sqrt((double) ((i13 * i13) + (i10 * i10))))) / 0.3356d);
        if (ceil > 0) {
            aVar.b(-i10, -i13, ceil, this.f2577j);
        }
    }

    public final int e(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 == 0) {
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        } else if (i14 == 1) {
            return i13 - i11;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int g(int i10) {
        float abs = (float) Math.abs(i10);
        if (!this.f2580m) {
            this.f2581n = f(this.f2579l);
            this.f2580m = true;
        }
        return (int) Math.ceil((double) (abs * this.f2581n));
    }
}
