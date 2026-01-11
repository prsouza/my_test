package l5;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o0.d;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7779a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f7780b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f7780b = bottomSheetBehavior;
        this.f7779a = i;
    }

    public final boolean a(View view) {
        this.f7780b.E(this.f7779a);
        return true;
    }
}
