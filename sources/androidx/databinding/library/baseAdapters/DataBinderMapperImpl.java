package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.e;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f1694a = new SparseIntArray(0);

    public final List<d> a() {
        return new ArrayList(0);
    }

    public final ViewDataBinding b(e eVar, View view, int i) {
        if (f1694a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public final ViewDataBinding c(e eVar, View[] viewArr, int i) {
        if (viewArr.length == 0 || f1694a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
