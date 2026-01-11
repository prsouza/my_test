package va;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import io.nodle.cash.ui.viewmodel.HistoryDetailViewModel;

public abstract class n0 extends ViewDataBinding {
    public static final /* synthetic */ int P = 0;
    public final TextView I;
    public final ImageButton J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final LinearLayout N;
    public HistoryDetailViewModel O;

    public n0(Object obj, View view, TextView textView, ImageButton imageButton, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout) {
        super(obj, view, 3);
        this.I = textView;
        this.J = imageButton;
        this.K = textView2;
        this.L = textView3;
        this.M = textView4;
        this.N = linearLayout;
    }

    public abstract void v(HistoryDetailViewModel historyDetailViewModel);
}
