package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class y {
    public static int a(RecyclerView.y yVar, s sVar, View view, View view2, RecyclerView.n nVar, boolean z) {
        if (nVar.x() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(nVar.N(view) - nVar.N(view2)) + 1;
        }
        return Math.min(sVar.l(), sVar.b(view2) - sVar.e(view));
    }

    public static int b(RecyclerView.y yVar, s sVar, View view, View view2, RecyclerView.n nVar, boolean z, boolean z10) {
        int i;
        if (nVar.x() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(nVar.N(view), nVar.N(view2));
        int max = Math.max(nVar.N(view), nVar.N(view2));
        if (z10) {
            i = Math.max(0, (yVar.b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(sVar.b(view2) - sVar.e(view))) / ((float) (Math.abs(nVar.N(view) - nVar.N(view2)) + 1)))) + ((float) (sVar.k() - sVar.e(view))));
    }

    public static int c(RecyclerView.y yVar, s sVar, View view, View view2, RecyclerView.n nVar, boolean z) {
        if (nVar.x() == 0 || yVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return yVar.b();
        }
        return (int) ((((float) (sVar.b(view2) - sVar.e(view))) / ((float) (Math.abs(nVar.N(view) - nVar.N(view2)) + 1))) * ((float) yVar.b()));
    }
}
