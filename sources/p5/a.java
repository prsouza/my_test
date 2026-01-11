package p5;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

public final class a extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f9692a;

    public a(Chip chip) {
        this.f9692a = chip;
    }

    public final void getOutline(View view, Outline outline) {
        com.google.android.material.chip.a aVar = this.f9692a.f3767t;
        if (aVar != null) {
            aVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
