package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class t extends o {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ u f2588q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.f2588q = uVar;
    }

    public final void c(View view, RecyclerView.x.a aVar) {
        u uVar = this.f2588q;
        int[] a10 = uVar.a(uVar.f2455a.getLayoutManager(), view);
        int i = a10[0];
        int i10 = a10[1];
        int ceil = (int) Math.ceil(((double) g(Math.max(Math.abs(i), Math.abs(i10)))) / 0.3356d);
        if (ceil > 0) {
            aVar.b(i, i10, ceil, this.f2577j);
        }
    }

    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public final int g(int i) {
        return Math.min(100, super.g(i));
    }
}
