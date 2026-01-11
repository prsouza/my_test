package va;

import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import io.nodle.cash.R;
import jc.b;
import s1.a;

public final class p1 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ImageButton f12427a;

    public p1(ImageButton imageButton) {
        this.f12427a = imageButton;
    }

    public static p1 a(View view) {
        ImageButton imageButton = (ImageButton) b.q(view, R.id.backButton);
        if (imageButton != null) {
            Toolbar toolbar = (Toolbar) view;
            return new p1(imageButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.backButton)));
    }
}
