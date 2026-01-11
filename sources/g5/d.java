package g5;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class d<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public e f5252a;

    /* renamed from: b  reason: collision with root package name */
    public int f5253b = 0;

    public d() {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i) {
        t(coordinatorLayout, v10, i);
        if (this.f5252a == null) {
            this.f5252a = new e(v10);
        }
        e eVar = this.f5252a;
        eVar.f5255b = eVar.f5254a.getTop();
        eVar.f5256c = eVar.f5254a.getLeft();
        this.f5252a.a();
        int i10 = this.f5253b;
        if (i10 == 0) {
            return true;
        }
        e eVar2 = this.f5252a;
        if (eVar2.f5257d != i10) {
            eVar2.f5257d = i10;
            eVar2.a();
        }
        this.f5253b = 0;
        return true;
    }

    public final int s() {
        e eVar = this.f5252a;
        if (eVar != null) {
            return eVar.f5257d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v10, int i) {
        coordinatorLayout.r(v10, i);
    }

    public final boolean u(int i) {
        e eVar = this.f5252a;
        if (eVar == null) {
            this.f5253b = i;
            return false;
        } else if (eVar.f5257d == i) {
            return false;
        } else {
            eVar.f5257d = i;
            eVar.a();
            return true;
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
