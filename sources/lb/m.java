package lb;

import ad.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import java.util.List;
import java.util.Objects;
import qa.d;

public final class m extends RecyclerView.f<a> {

    /* renamed from: d  reason: collision with root package name */
    public final List<d> f8201d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8202e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8203f = m.class.getSimpleName();
    public int g = -1;

    /* renamed from: h  reason: collision with root package name */
    public OptionsViewModel f8204h;

    public final class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f8205u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f8206v;

        /* renamed from: w  reason: collision with root package name */
        public final ImageView f8207w;

        /* renamed from: x  reason: collision with root package name */
        public final TextView f8208x;

        /* renamed from: y  reason: collision with root package name */
        public final RecyclerView f8209y;
        public final View z;

        public a(View view) {
            super(view);
            this.f8205u = (TextView) view.findViewById(R.id.titleTextView);
            this.f8206v = (LinearLayout) view.findViewById(R.id.iconLayout);
            this.f8207w = (ImageView) view.findViewById(R.id.iconImageView);
            this.f8208x = (TextView) view.findViewById(R.id.iconTextView);
            this.f8209y = (RecyclerView) view.findViewById(R.id.childRecyclerView);
            this.z = view.findViewById(R.id.dividerView);
        }
    }

    public m(List<d> list, String str) {
        this.f8201d = list;
        this.f8202e = str;
    }

    public final int a() {
        return this.f8201d.size();
    }

    public final void f(RecyclerView recyclerView) {
        e.D(recyclerView, "recyclerView");
        if (this.f8204h == null) {
            Context context = recyclerView.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
            this.f8204h = (OptionsViewModel) new w0((y0) context).a(OptionsViewModel.class);
        }
    }

    public final void g(RecyclerView.b0 b0Var, int i) {
        a aVar = (a) b0Var;
        d dVar = this.f8201d.get(i);
        e.D(dVar, "option");
        aVar.f2311a.setTag(Integer.valueOf(i));
        TextView textView = aVar.f8205u;
        if (textView != null) {
            textView.setText(dVar.f10331a);
        }
        if (e.r(dVar.f10331a, aVar.f2311a.getContext().getResources().getString(R.string.settingsMode))) {
            Context context = aVar.f2311a.getContext();
            e.C(context, "itemView.context");
            bb.e K = c.K(context);
            ImageView imageView = aVar.f8207w;
            if (imageView != null) {
                imageView.setImageResource(K.getScanModeIcon());
            }
            TextView textView2 = aVar.f8208x;
            if (textView2 != null) {
                textView2.setText(K.name());
            }
            LinearLayout linearLayout = aVar.f8206v;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        } else {
            ImageView imageView2 = aVar.f8207w;
            if (imageView2 != null) {
                imageView2.setImageDrawable((Drawable) null);
            }
            TextView textView3 = aVar.f8208x;
            if (textView3 != null) {
                textView3.setText(BuildConfig.FLAVOR);
            }
            LinearLayout linearLayout2 = aVar.f8206v;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
        if (dVar.f10335e) {
            String str = m.this.f8203f;
            Log.d(str, "BIND: show position: " + i);
            LinearLayout linearLayout3 = aVar.f8206v;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            View view = aVar.f2311a;
            e.C(view, "itemView");
            TextView textView4 = aVar.f8205u;
            e.C(textView4, "titleTextView");
            RecyclerView recyclerView = aVar.f8209y;
            e.C(recyclerView, "childRecyclerView");
            List<d> list = dVar.f10333c;
            if (list != null) {
                view.setBackgroundResource(R.drawable.background_listitem_expand);
                textView4.setTextSize(0, textView4.getContext().getResources().getDimension(R.dimen.primary_highlight_text));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                switch (list.get(0).f10334d) {
                    case R.layout.item_option_app_setting /*2131427415*/:
                        recyclerView.setAdapter(new b(list));
                        break;
                    case R.layout.item_option_scanmode /*2131427416*/:
                        recyclerView.setAdapter(new o(list));
                        break;
                    default:
                        recyclerView.setAdapter(new m(list, textView4.getText().toString()));
                        break;
                }
                recyclerView.setVisibility(0);
            }
        } else {
            String str2 = m.this.f8203f;
            Log.d(str2, "BIND: hide position: " + i);
            View view2 = aVar.f2311a;
            e.C(view2, "itemView");
            TextView textView5 = aVar.f8205u;
            e.C(textView5, "titleTextView");
            RecyclerView recyclerView2 = aVar.f8209y;
            e.C(recyclerView2, "childRecyclerView");
            view2.setBackgroundResource(R.drawable.background_listitem);
            textView5.setTextSize(0, textView5.getContext().getResources().getDimension(R.dimen.primary_text));
            recyclerView2.removeAllViews();
            recyclerView2.setVisibility(8);
        }
        if (dVar.g) {
            aVar.z.setVisibility(0);
        } else {
            aVar.z.setVisibility(8);
        }
        aVar.f2311a.setOnClickListener(new l(aVar, m.this));
    }

    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        e.D(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_option, viewGroup, false);
        e.C(inflate, "view");
        return new a(inflate);
    }
}
