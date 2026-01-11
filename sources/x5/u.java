package x5;

import android.widget.ImageButton;

public class u extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public int f12869a;

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f12869a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f12869a;
    }

    public void setVisibility(int i) {
        b(i, true);
    }
}
