package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import bb.g;
import com.facebook.shimmer.ShimmerFrameLayout;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HistoryViewModelV2;

public final class j1 extends i1 {
    public static final SparseIntArray L;
    public final TextView J;
    public long K = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.shimmerLayout1, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j1(e eVar, View view) {
        super(eVar, view);
        Object[] l10 = ViewDataBinding.l(eVar, view, 3, (ViewDataBinding.d) null, L);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) l10[2];
        ((Toolbar) l10[0]).setTag((Object) null);
        TextView textView = (TextView) l10[1];
        this.J = textView;
        textView.setTag((Object) null);
        view.setTag(R.id.dataBinding, this);
        i();
    }

    public final void c() {
        long j10;
        synchronized (this) {
            j10 = this.K;
            this.K = 0;
        }
        int i = 0;
        HistoryViewModelV2 historyViewModelV2 = this.I;
        g gVar = null;
        int i10 = ((j10 & 3) > 0 ? 1 : ((j10 & 3) == 0 ? 0 : -1));
        if (i10 != 0) {
            if (historyViewModelV2 != null) {
                gVar = historyViewModelV2.f6761v;
            }
            if (gVar != null) {
                i = gVar.getListTitle();
            }
        }
        if (i10 != 0) {
            this.J.setText(i);
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.K != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.K = 2;
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
        v((HistoryViewModelV2) obj);
        return true;
    }

    public final void v(HistoryViewModelV2 historyViewModelV2) {
        this.I = historyViewModelV2;
        synchronized (this) {
            this.K |= 1;
        }
        b(3);
        o();
    }
}
