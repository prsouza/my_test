package lb;

import ad.c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import d0.a;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import qa.d;

public final class o extends RecyclerView.f<a> {

    /* renamed from: d  reason: collision with root package name */
    public final List<d> f8212d;

    /* renamed from: e  reason: collision with root package name */
    public int f8213e;

    /* renamed from: f  reason: collision with root package name */
    public OptionsViewModel f8214f;

    public final class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final RadioButton f8215u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f8216v;

        public a(View view) {
            super(view);
            this.f8215u = (RadioButton) view.findViewById(R.id.modeRadio);
            this.f8216v = (TextView) view.findViewById(R.id.detailTextView);
        }
    }

    public o(List<d> list) {
        this.f8212d = list;
    }

    public final int a() {
        return this.f8212d.size();
    }

    public final void f(RecyclerView recyclerView) {
        e.D(recyclerView, "recyclerView");
        if (this.f8214f == null) {
            Context context = recyclerView.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
            OptionsViewModel optionsViewModel = (OptionsViewModel) new w0((y0) context).a(OptionsViewModel.class);
            this.f8214f = optionsViewModel;
            Integer valueOf = Integer.valueOf(c.K(optionsViewModel.f6806s).ordinal());
            e.B(valueOf);
            this.f8213e = valueOf.intValue();
        }
    }

    public final void g(RecyclerView.b0 b0Var, int i) {
        a aVar = (a) b0Var;
        aVar.f2311a.setTag(Integer.valueOf(i));
        Integer num = o.this.f8212d.get(i).f10336f;
        if (num != null) {
            int intValue = num.intValue();
            RadioButton radioButton = aVar.f8215u;
            if (radioButton != null) {
                Context context = radioButton.getContext();
                Object obj = d0.a.f4256a;
                radioButton.setButtonDrawable(a.b.b(context, intValue));
            }
        }
        RadioButton radioButton2 = aVar.f8215u;
        if (radioButton2 != null) {
            String str = o.this.f8212d.get(i).f10331a;
            Locale locale = Locale.getDefault();
            e.C(locale, "getDefault()");
            String upperCase = str.toUpperCase(locale);
            e.C(upperCase, "this as java.lang.String).toUpperCase(locale)");
            radioButton2.setText(upperCase);
        }
        TextView textView = aVar.f8216v;
        if (textView != null) {
            textView.setText(o.this.f8212d.get(i).f10332b);
        }
        RadioButton radioButton3 = aVar.f8215u;
        if (radioButton3 != null) {
            radioButton3.setChecked(i == o.this.f8213e);
        }
        aVar.f2311a.setOnClickListener(new n(o.this, aVar));
    }

    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        e.D(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_option_scanmode, viewGroup, false);
        e.C(inflate, "view");
        return new a(inflate);
    }
}
