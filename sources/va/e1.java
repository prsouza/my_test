package va;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import pb.o;

public abstract class e1 extends ViewDataBinding {
    public final ImageButton I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public o M;

    public e1(Object obj, View view, ImageButton imageButton, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, 0);
        this.I = imageButton;
        this.J = textView;
        this.K = textView2;
        this.L = textView3;
    }
}
