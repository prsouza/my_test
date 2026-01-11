package lb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import java.util.List;
import java.util.Objects;
import qa.d;

public final class b extends RecyclerView.f<a> {

    /* renamed from: d  reason: collision with root package name */
    public final List<d> f8159d;

    /* renamed from: e  reason: collision with root package name */
    public OptionsViewModel f8160e;

    public final class a extends RecyclerView.b0 {

        /* renamed from: y  reason: collision with root package name */
        public static final /* synthetic */ int f8161y = 0;

        /* renamed from: u  reason: collision with root package name */
        public final SwitchMaterial f8162u;

        /* renamed from: v  reason: collision with root package name */
        public final TextView f8163v;

        /* renamed from: w  reason: collision with root package name */
        public final TextView f8164w;

        public a(View view) {
            super(view);
            this.f8162u = (SwitchMaterial) view.findViewById(R.id.settingSwitch);
            this.f8163v = (TextView) view.findViewById(R.id.labelTextView);
            this.f8164w = (TextView) view.findViewById(R.id.detailTextView);
        }
    }

    public b(List<d> list) {
        this.f8159d = list;
    }

    public final int a() {
        return this.f8159d.size();
    }

    public final void f(RecyclerView recyclerView) {
        e.D(recyclerView, "recyclerView");
        if (this.f8160e == null) {
            Context context = recyclerView.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
            this.f8160e = (OptionsViewModel) new w0((y0) context).a(OptionsViewModel.class);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r10.j() != true) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r3.isIgnoringBatteryOptimizations(r10.getPackageName()) == true) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        if (r10.k() == true) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(androidx.recyclerview.widget.RecyclerView.b0 r9, int r10) {
        /*
            r8 = this;
            lb.b$a r9 = (lb.b.a) r9
            android.view.View r0 = r9.f2311a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0.setTag(r1)
            android.widget.TextView r0 = r9.f8163v
            if (r0 != 0) goto L_0x0010
            goto L_0x001f
        L_0x0010:
            lb.b r1 = lb.b.this
            java.util.List<qa.d> r1 = r1.f8159d
            java.lang.Object r1 = r1.get(r10)
            qa.d r1 = (qa.d) r1
            java.lang.String r1 = r1.f10331a
            r0.setText(r1)
        L_0x001f:
            android.widget.TextView r0 = r9.f8164w
            if (r0 != 0) goto L_0x0024
            goto L_0x0033
        L_0x0024:
            lb.b r1 = lb.b.this
            java.util.List<qa.d> r1 = r1.f8159d
            java.lang.Object r1 = r1.get(r10)
            qa.d r1 = (qa.d) r1
            java.lang.String r1 = r1.f10332b
            r0.setText(r1)
        L_0x0033:
            com.google.android.material.switchmaterial.SwitchMaterial r0 = r9.f8162u
            if (r0 != 0) goto L_0x0039
            goto L_0x00ad
        L_0x0039:
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L_0x009c
            if (r10 == r1) goto L_0x0059
            r3 = 2
            if (r10 == r3) goto L_0x0053
            r3 = 3
            if (r10 == r3) goto L_0x0046
            goto L_0x00a9
        L_0x0046:
            lb.b r10 = lb.b.this
            io.nodle.cash.ui.viewmodel.OptionsViewModel r10 = r10.f8160e
            if (r10 == 0) goto L_0x00a9
            boolean r10 = r10.j()
            if (r10 != r1) goto L_0x00a9
            goto L_0x00aa
        L_0x0053:
            r10 = 8
            r0.setVisibility(r10)
            goto L_0x00a9
        L_0x0059:
            lb.b r10 = lb.b.this
            io.nodle.cash.ui.viewmodel.OptionsViewModel r10 = r10.f8160e
            if (r10 == 0) goto L_0x00a9
            android.app.Application r10 = r10.f6806s
            java.lang.String r3 = "context"
            e6.e.D(r10, r3)
            java.lang.String r3 = "power"
            java.lang.Object r3 = r10.getSystemService(r3)
            java.lang.String r4 = "null cannot be cast to non-null type android.os.PowerManager"
            java.util.Objects.requireNonNull(r3, r4)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            java.lang.String r4 = "c"
            java.lang.String r5 = r10.getPackageName()
            boolean r5 = r3.isIgnoringBatteryOptimizations(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "isIgnoringBatteryOptimizations: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.d(r4, r5)
            java.lang.String r10 = r10.getPackageName()
            boolean r10 = r3.isIgnoringBatteryOptimizations(r10)
            if (r10 != r1) goto L_0x00a9
            goto L_0x00aa
        L_0x009c:
            lb.b r10 = lb.b.this
            io.nodle.cash.ui.viewmodel.OptionsViewModel r10 = r10.f8160e
            if (r10 == 0) goto L_0x00a9
            boolean r10 = r10.k()
            if (r10 != r1) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r1 = r2
        L_0x00aa:
            r0.setChecked(r1)
        L_0x00ad:
            android.view.View r10 = r9.f2311a
            lb.b r0 = lb.b.this
            lb.a r1 = new lb.a
            r1.<init>(r9, r0)
            r10.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.b.g(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        e.D(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_option_app_setting, viewGroup, false);
        e.C(inflate, "view");
        return new a(inflate);
    }
}
