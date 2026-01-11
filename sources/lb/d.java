package lb;

import ah.v;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.a0;
import androidx.recyclerview.widget.RecyclerView;
import bb.g;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HistoryDetailViewModel;
import java.util.List;
import sb.j;

public final class d extends RecyclerView.f<RecyclerView.b0> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f8168d;

    /* renamed from: e  reason: collision with root package name */
    public List<sa.b> f8169e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8170f = d.class.getSimpleName();
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final String f8171h;

    public final class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final View f8172u;

        public a(View view) {
            super(view);
            this.f8172u = view;
        }
    }

    public final class b extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final View f8174u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f8175v;

        /* renamed from: w  reason: collision with root package name */
        public final TextView f8176w;

        /* renamed from: x  reason: collision with root package name */
        public final TextView f8177x;

        /* renamed from: y  reason: collision with root package name */
        public final TextView f8178y;

        public b(View view) {
            super(view);
            this.f8174u = view;
            this.f8175v = (TextView) view.findViewById(R.id.pkTextView);
            this.f8176w = (TextView) view.findViewById(R.id.timeTextView);
            this.f8177x = (TextView) view.findViewById(R.id.amountTextView);
            this.f8178y = (TextView) view.findViewById(R.id.statusTextView);
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8179a;

        static {
            int[] iArr = new int[g.values().length];
            iArr[g.TRANSFER.ordinal()] = 1;
            f8179a = iArr;
        }
    }

    public d(Context context, List<sa.b> list) {
        e.D(context, "cxt");
        e.D(list, "transList");
        this.f8168d = context;
        this.f8169e = list;
        this.g = v.J(context, qa.e.NODLE_PUBLIC_KEY_4);
        this.f8171h = v.J(context, qa.e.NODLE_PUBLIC_KEY_5);
    }

    public final int a() {
        return this.f8169e.size();
    }

    public final int c(int i) {
        return this.f8169e.get(i).z.ordinal();
    }

    public final void g(RecyclerView.b0 b0Var, int i) {
        if (c.f8179a[this.f8169e.get(i).z.ordinal()] == 1) {
            b bVar = (b) b0Var;
            sa.b bVar2 = this.f8169e.get(i);
            e.D(bVar2, "trans");
            TextView textView = bVar.f8177x;
            Context context = bVar.f8174u.getContext();
            e.C(context, "view.context");
            textView.setText(bVar2.a(context));
            bVar.f8176w.setText(bVar2.b());
            if (e.r(bVar2.f11036a, d.this.g) || e.r(bVar2.f11036a, d.this.f8171h)) {
                bVar.f8175v.setText(bVar2.f(bVar2.f11037b));
            } else if (e.r(bVar2.f11037b, d.this.g) || e.r(bVar2.f11037b, d.this.f8171h)) {
                bVar.f8175v.setText(bVar2.f(bVar2.f11036a));
            }
            bVar.f8174u.setOnClickListener(new e(d.this, bVar2));
            if (bVar2.A) {
                bVar.f8178y.setVisibility(0);
            } else {
                bVar.f8178y.setVisibility(8);
            }
        } else {
            a aVar = (a) b0Var;
            sa.b bVar3 = this.f8169e.get(i);
            e.D(bVar3, "trans");
            if (bVar3.A) {
                ((RelativeLayout) aVar.f8172u.findViewById(R.id.rewardLayout)).setVisibility(8);
                ((RelativeLayout) aVar.f8172u.findViewById(R.id.rewardPendingLayout)).setVisibility(0);
                ((TextView) aVar.f8172u.findViewById(R.id.rPendingTextView)).setText(bVar3.B);
            } else {
                ((RelativeLayout) aVar.f8172u.findViewById(R.id.rewardLayout)).setVisibility(0);
                ((RelativeLayout) aVar.f8172u.findViewById(R.id.rewardPendingLayout)).setVisibility(8);
                Context context2 = aVar.f8172u.getContext();
                e.C(context2, "view.context");
                ((TextView) aVar.f8172u.findViewById(R.id.rAmountTextView)).setText(bVar3.a(context2));
                ((TextView) aVar.f8172u.findViewById(R.id.rTimeTextView)).setText(bVar3.b());
            }
            aVar.f8172u.setOnClickListener(new c(d.this, bVar3));
        }
    }

    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        e.D(viewGroup, "parent");
        if (i == g.TRANSFER.ordinal()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_transfer, viewGroup, false);
            e.C(inflate, "from(parent.context).inf…_transfer, parent, false)");
            return new b(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_reward, viewGroup, false);
        e.C(inflate2, "from(parent.context).inf…em_reward, parent, false)");
        return new a(inflate2);
    }

    public final void i(sa.b bVar) {
        HistoryDetailViewModel.b bVar2 = HistoryDetailViewModel.C;
        HistoryDetailViewModel.D = bVar;
        j.a aVar = j.f11071s;
        j jVar = new j();
        a0 supportFragmentManager = ((androidx.appcompat.app.c) this.f8168d).getSupportFragmentManager();
        j.a aVar2 = j.f11071s;
        jVar.show(supportFragmentManager, j.f11072t);
    }
}
