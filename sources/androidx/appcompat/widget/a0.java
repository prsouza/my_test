package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.b0;
import n.f;

public final class a0 extends n0 {

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ b0.d f1151y;
    public final /* synthetic */ b0 z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, View view, b0.d dVar) {
        super(view);
        this.z = b0Var;
        this.f1151y = dVar;
    }

    public final f b() {
        return this.f1151y;
    }

    public final boolean c() {
        if (this.z.getInternalPopup().b()) {
            return true;
        }
        this.z.b();
        return true;
    }
}
