package io.nodle.cash.ui.view.activity.comm;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.RecyclerView;
import e6.e;
import hb.a;
import io.nodle.cash.R;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.b;
import lb.k;
import pd.d;
import tb.p;
import tb.r;
import va.g;

public final class NotificationsActivity extends a {

    /* renamed from: v  reason: collision with root package name */
    public final String f6727v = "NotificationsActivity";

    /* renamed from: w  reason: collision with root package name */
    public r f6728w;

    /* renamed from: x  reason: collision with root package name */
    public Map<Integer, View> f6729x = new LinkedHashMap();

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View k(int i) {
        ? r42 = this.f6729x;
        Integer valueOf = Integer.valueOf(R.id.notificationRecyclerView);
        View view = (View) r42.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.notificationRecyclerView);
        if (findViewById == null) {
            return null;
        }
        r42.put(valueOf, findViewById);
        return findViewById;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_notifications);
        this.f6728w = (r) new w0(this).a(r.class);
        ViewDataBinding d10 = f.d(this, R.layout.activity_notifications);
        e.C(d10, "setContentView(this, R.l…t.activity_notifications)");
        g gVar = (g) d10;
        gVar.r(this);
        gVar.v(this.f6728w);
        ((RecyclerView) k(R.id.notificationRecyclerView)).setAdapter(new k());
        r rVar = this.f6728w;
        if (rVar != null) {
            ge.g.b(b.y(rVar), (pd.f) null, new ib.a(this, (d<? super ib.a>) null), 3);
        }
        r rVar2 = this.f6728w;
        if (rVar2 != null) {
            ge.g.b(b.y(rVar2), (pd.f) null, new p(rVar2, (d<? super p>) null), 3);
        }
    }
}
