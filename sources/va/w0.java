package va;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.google.android.material.tabs.TabLayout;
import io.nodle.cash.R;
import tb.c;

public final class w0 extends v0 {
    public static final SparseIntArray K;
    public long J = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.simTitleTextView, 1);
        sparseIntArray.put(R.id.learnMoreButton, 2);
        sparseIntArray.put(R.id.balanceLayout, 3);
        sparseIntArray.put(R.id.balanceTitleTextView, 4);
        sparseIntArray.put(R.id.balanceDetailTextView, 5);
        sparseIntArray.put(R.id.dollarBalanceTextView, 6);
        sparseIntArray.put(R.id.nodlTextView, 7);
        sparseIntArray.put(R.id.tabLayout, 8);
        sparseIntArray.put(R.id.tokenPriceLayout, 9);
        sparseIntArray.put(R.id.tokenPriceTextView, 10);
        sparseIntArray.put(R.id.dollarMktPriceTextView, 11);
        sparseIntArray.put(R.id.resetButton, 12);
        sparseIntArray.put(R.id.simSeekbar, 13);
        sparseIntArray.put(R.id.simDisclaimerTextView, 14);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w0(e eVar, View view) {
        super(eVar, view);
        Object[] l10 = ViewDataBinding.l(eVar, view, 15, (ViewDataBinding.d) null, K);
        TextView textView = (TextView) l10[5];
        RelativeLayout relativeLayout = (RelativeLayout) l10[3];
        TextView textView2 = (TextView) l10[4];
        TextView textView3 = (TextView) l10[6];
        TextView textView4 = (TextView) l10[11];
        Button button = (Button) l10[2];
        TextView textView5 = (TextView) l10[7];
        Button button2 = (Button) l10[12];
        TextView textView6 = (TextView) l10[14];
        SeekBar seekBar = (SeekBar) l10[13];
        TextView textView7 = (TextView) l10[1];
        TabLayout tabLayout = (TabLayout) l10[8];
        RelativeLayout relativeLayout2 = (RelativeLayout) l10[9];
        TextView textView8 = (TextView) l10[10];
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
        c cVar = (c) obj;
        return true;
    }

    public final void v(c cVar) {
    }
}
