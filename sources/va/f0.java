package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.google.android.gms.maps.MapView;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import io.nodle.map_marker.MarkerView;

public final class f0 extends e0 {
    public static final SparseIntArray K;
    public long J = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.mapView, 1);
        sparseIntArray.put(R.id.curtainView, 2);
        sparseIntArray.put(R.id.markerView, 3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(e eVar, View view) {
        super(eVar, view);
        Object[] l10 = ViewDataBinding.l(eVar, view, 4, (ViewDataBinding.d) null, K);
        ImageView imageView = (ImageView) l10[2];
        MapView mapView = (MapView) l10[1];
        MarkerView markerView = (MarkerView) l10[3];
        ((RelativeLayout) l10[0]).setTag((Object) null);
        view.setTag(R.id.dataBinding, this);
        i();
    }

    public final void c() {
        synchronized (this) {
            this.J = 0;
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.J != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.J = 2;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        return false;
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        HomeViewModelV2 homeViewModelV2 = (HomeViewModelV2) obj;
        return true;
    }

    public final void v(HomeViewModelV2 homeViewModelV2) {
    }
}
