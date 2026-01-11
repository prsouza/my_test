package lb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import e6.e;
import io.nodle.cash.R;
import io.sentry.SentryClient;
import md.m;
import xd.l;

public final class g extends RecyclerView.f<a> {

    /* renamed from: d  reason: collision with root package name */
    public final l<String, m> f8184d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f8185e = {"1", "2", "3", "4", "5", "6", SentryClient.SENTRY_PROTOCOL_VERSION, "8", "9", "•", "0", "<"};

    public final class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final Button f8186u;

        public a(g gVar, View view) {
            super(view);
            Button button = (Button) view.findViewById(R.id.keypadButton);
            e.C(button, "view.keypadButton");
            this.f8186u = button;
            button.setOnClickListener(new f(gVar, this));
        }
    }

    public g(l<? super String, m> lVar) {
        this.f8184d = lVar;
    }

    public final int a() {
        return this.f8185e.length;
    }

    public final void g(RecyclerView.b0 b0Var, int i) {
        ((a) b0Var).f8186u.setText(this.f8185e[i]);
    }

    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        e.D(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_keypad, viewGroup, false);
        e.C(inflate, "view");
        return new a(this, inflate);
    }
}
