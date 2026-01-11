package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;

public final class y extends x {
    public static final SparseIntArray K;
    public long J = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.mainTextView, 1);
        sparseIntArray.put(R.id.infoImageView, 2);
        sparseIntArray.put(R.id.subTextView, 3);
        sparseIntArray.put(R.id.pendingRewardLayout, 4);
        sparseIntArray.put(R.id.pendingImageView, 5);
        sparseIntArray.put(R.id.pendingTextView, 6);
        sparseIntArray.put(R.id.alertTextView, 7);
        sparseIntArray.put(R.id.alertButton, 8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(e eVar, View view) {
        super(eVar, view);
        Object[] l10 = ViewDataBinding.l(eVar, view, 9, (ViewDataBinding.d) null, K);
        Button button = (Button) l10[8];
        TextView textView = (TextView) l10[7];
        ImageView imageView = (ImageView) l10[2];
        TextView textView2 = (TextView) l10[1];
        ImageView imageView2 = (ImageView) l10[5];
        LinearLayout linearLayout = (LinearLayout) l10[4];
        TextView textView3 = (TextView) l10[6];
        TextView textView4 = (TextView) l10[3];
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
