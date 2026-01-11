package lb;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import e6.e;
import gb.f;
import io.nodle.cash.R;
import java.util.List;
import nd.o;

public final class k extends RecyclerView.f<a> {

    /* renamed from: d  reason: collision with root package name */
    public final String f8194d = k.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    public List<f> f8195e = o.f8966a;

    public final class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f8196u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f8197v;

        /* renamed from: w  reason: collision with root package name */
        public final ImageView f8198w;

        public a(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.titleTextView);
            e.C(textView, "view.titleTextView");
            this.f8196u = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.timeTextView);
            e.C(textView2, "view.timeTextView");
            this.f8197v = textView2;
            ImageView imageView = (ImageView) view.findViewById(R.id.seenBadgeImageView);
            e.C(imageView, "view.seenBadgeImageView");
            this.f8198w = imageView;
        }
    }

    public final int a() {
        return this.f8195e.size();
    }

    public final void g(RecyclerView.b0 b0Var, int i) {
        a aVar = (a) b0Var;
        Log.d(this.f8194d, "onBindViewHolder");
        f fVar = this.f8195e.get(i);
        int i10 = fVar.f5320a;
        aVar.f8196u.setText(fVar.f5321b);
        aVar.f8197v.setText(fVar.f5323d);
        aVar.f2311a.setOnClickListener(new i(fVar, 0));
        if (fVar.f5325f) {
            aVar.f8198w.setVisibility(8);
            return;
        }
        aVar.f8198w.setVisibility(0);
        aVar.f8198w.postDelayed(new j(aVar, fVar), 2000);
    }

    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        e.D(viewGroup, "parent");
        Log.d(this.f8194d, "onCreateViewHolder");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_notification, viewGroup, false);
        e.C(inflate, "view");
        return new a(inflate);
    }
}
