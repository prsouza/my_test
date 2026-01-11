package g5;

import android.view.View;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f5254a;

    /* renamed from: b  reason: collision with root package name */
    public int f5255b;

    /* renamed from: c  reason: collision with root package name */
    public int f5256c;

    /* renamed from: d  reason: collision with root package name */
    public int f5257d;

    /* renamed from: e  reason: collision with root package name */
    public int f5258e;

    public e(View view) {
        this.f5254a = view;
    }

    public final void a() {
        View view = this.f5254a;
        int top = this.f5257d - (view.getTop() - this.f5255b);
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        view.offsetTopAndBottom(top);
        View view2 = this.f5254a;
        view2.offsetLeftAndRight(this.f5258e - (view2.getLeft() - this.f5256c));
    }
}
