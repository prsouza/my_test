package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static DataBinderMapperImpl f1682a = new DataBinderMapperImpl();

    public static <T extends ViewDataBinding> T a(e eVar, View view, int i) {
        return f1682a.b(eVar, view, i);
    }

    public static <T extends ViewDataBinding> T b(e eVar, ViewGroup viewGroup, int i, int i10) {
        int childCount = viewGroup.getChildCount();
        int i11 = childCount - i;
        if (i11 == 1) {
            return a(eVar, viewGroup.getChildAt(childCount - 1), i10);
        }
        View[] viewArr = new View[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            viewArr[i12] = viewGroup.getChildAt(i12 + i);
        }
        return f1682a.c(eVar, viewArr, i10);
    }

    public static <T extends ViewDataBinding> T c(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, e eVar) {
        int i10 = 0;
        boolean z10 = viewGroup != null && z;
        if (z10) {
            i10 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        if (z10) {
            return b(eVar, viewGroup, i10, i);
        }
        return a(eVar, inflate, i);
    }

    public static <T extends ViewDataBinding> T d(Activity activity, int i) {
        activity.setContentView(i);
        return b((e) null, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i);
    }
}
