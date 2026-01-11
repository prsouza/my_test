package e9;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import e6.e;

public final class c extends MenuInflater {

    /* renamed from: a  reason: collision with root package name */
    public final d f4787a;

    /* renamed from: b  reason: collision with root package name */
    public final MenuInflater f4788b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, MenuInflater menuInflater) {
        super(context);
        e.D(context, "context");
        this.f4788b = menuInflater;
        this.f4787a = new d(context);
    }

    public final void inflate(int i, Menu menu) {
        e.D(menu, "menu");
        this.f4788b.inflate(i, menu);
        this.f4787a.a(i, menu);
    }
}
