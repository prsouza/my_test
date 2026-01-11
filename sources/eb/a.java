package eb;

import android.view.View;

public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0072a f4799a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4800b;

    /* renamed from: eb.a$a  reason: collision with other inner class name */
    public interface C0072a {
        void a(int i, View view);
    }

    public a(C0072a aVar, int i) {
        this.f4799a = aVar;
        this.f4800b = i;
    }

    public final void onClick(View view) {
        this.f4799a.a(this.f4800b, view);
    }
}
