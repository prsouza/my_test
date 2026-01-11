package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.i;
import io.nodle.cash.R;

public abstract class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public Context f881a;

    /* renamed from: b  reason: collision with root package name */
    public Context f882b;

    /* renamed from: c  reason: collision with root package name */
    public e f883c;

    /* renamed from: s  reason: collision with root package name */
    public LayoutInflater f884s;

    /* renamed from: t  reason: collision with root package name */
    public i.a f885t;

    /* renamed from: u  reason: collision with root package name */
    public int f886u = R.layout.abc_action_menu_layout;

    /* renamed from: v  reason: collision with root package name */
    public int f887v = R.layout.abc_action_menu_item_layout;

    /* renamed from: w  reason: collision with root package name */
    public j f888w;

    public a(Context context) {
        this.f881a = context;
        this.f884s = LayoutInflater.from(context);
    }

    public final boolean c(g gVar) {
        return false;
    }

    public final void j(i.a aVar) {
        this.f885t = aVar;
    }

    public final boolean k(g gVar) {
        return false;
    }
}
