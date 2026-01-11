package lb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d0.a;
import e6.e;
import fe.o;
import io.nodle.cash.R;
import java.util.List;

public final class h extends RecyclerView.f<a> {

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f8187d;

    public final class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f8188u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f8189v;

        public a(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.countTextView);
            e.C(textView, "view.countTextView");
            this.f8188u = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.wordTextView);
            e.C(textView2, "view.wordTextView");
            this.f8189v = textView2;
        }
    }

    public h(List<String> list) {
        this.f8187d = list;
    }

    public final int a() {
        return this.f8187d.size();
    }

    public final void g(RecyclerView.b0 b0Var, int i) {
        a aVar = (a) b0Var;
        aVar.f8188u.setText(String.valueOf(i + 1));
        aVar.f8189v.setText(this.f8187d.get(i));
        if (o.D1(this.f8187d.get(i)).toString().length() == 0) {
            TextView textView = aVar.f8188u;
            Context context = textView.getContext();
            Object obj = d0.a.f4256a;
            textView.setTextColor(a.c.a(context, R.color.colorErrorText));
            return;
        }
        TextView textView2 = aVar.f8188u;
        Context context2 = textView2.getContext();
        Object obj2 = d0.a.f4256a;
        textView2.setTextColor(a.c.a(context2, R.color.colorPrimaryText));
    }

    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        e.D(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mnemonics, viewGroup, false);
        e.C(inflate, "view");
        return new a(inflate);
    }
}
