package rb;

import android.view.View;
import androidx.fragment.app.Fragment;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public static final a f10641c = new a();

    /* renamed from: a  reason: collision with root package name */
    public OptionsViewModel f10642a;

    /* renamed from: b  reason: collision with root package name */
    public Map<Integer, View> f10643b = new LinkedHashMap();

    public static final class a {
    }

    public b() {
        Class<b> cls = b.class;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View b(int i) {
        View findViewById;
        ? r42 = this.f10643b;
        Integer valueOf = Integer.valueOf(R.id.socialLayout);
        View view = (View) r42.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.socialLayout)) == null) {
            return null;
        }
        r42.put(valueOf, findViewById);
        return findViewById;
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [androidx.lifecycle.u0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r5 = "inflater"
            e6.e.D(r3, r5)
            int r5 = va.z.K
            androidx.databinding.DataBinderMapperImpl r5 = androidx.databinding.f.f1682a
            r5 = 2131427394(0x7f0b0042, float:1.8476403E38)
            r0 = 0
            r1 = 0
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.h(r3, r5, r4, r0, r1)
            va.z r3 = (va.z) r3
            java.lang.String r4 = "inflate(inflater, container, false)"
            e6.e.C(r3, r4)
            androidx.lifecycle.a0 r4 = r2.getViewLifecycleOwner()
            r3.r(r4)
            androidx.fragment.app.r r4 = r2.getActivity()
            if (r4 == 0) goto L_0x0034
            androidx.lifecycle.w0 r5 = new androidx.lifecycle.w0
            r5.<init>(r4)
            java.lang.Class<io.nodle.cash.ui.viewmodel.OptionsViewModel> r4 = io.nodle.cash.ui.viewmodel.OptionsViewModel.class
            androidx.lifecycle.u0 r4 = r5.a(r4)
            r1 = r4
            io.nodle.cash.ui.viewmodel.OptionsViewModel r1 = (io.nodle.cash.ui.viewmodel.OptionsViewModel) r1
        L_0x0034:
            r2.f10642a = r1
            r3.v(r1)
            android.view.View r3 = r3.f1668t
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.b.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f10643b.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r14 = r14.A;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0164 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            java.lang.String r0 = "view"
            e6.e.D(r14, r0)
            super.onViewCreated(r14, r15)
            io.nodle.cash.ui.viewmodel.OptionsViewModel r14 = r13.f10642a
            r15 = 0
            if (r14 == 0) goto L_0x0014
            qa.a r14 = r14.A
            if (r14 == 0) goto L_0x0014
            java.lang.String r14 = r14.f10325a
            goto L_0x0015
        L_0x0014:
            r14 = r15
        L_0x0015:
            r0 = 2131755407(0x7f10018f, float:1.9141692E38)
            java.lang.String r0 = r13.getString(r0)
            boolean r14 = e6.e.r(r14, r0)
            if (r14 == 0) goto L_0x016e
            io.nodle.cash.ui.viewmodel.OptionsViewModel r14 = r13.f10642a
            if (r14 == 0) goto L_0x00cd
            java.lang.String r14 = "socialMedia"
            java.lang.String r0 = ah.v.K(r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SOCIAL_MEDIA "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "OptionsViewModel"
            android.util.Log.d(r1, r0)
            java.lang.String r14 = ah.v.K(r14)
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x00c1 }
            r0.<init>(r14)     // Catch:{ Exception -> 0x00c1 }
            int r14 = r0.length()     // Catch:{ Exception -> 0x00c1 }
            r1 = 0
            r2 = r15
        L_0x0051:
            if (r1 >= r14) goto L_0x00c6
            if (r2 != 0) goto L_0x005b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00bf }
            r3.<init>()     // Catch:{ Exception -> 0x00bf }
            r2 = r3
        L_0x005b:
            qa.h r3 = new qa.h     // Catch:{ Exception -> 0x00bf }
            org.json.JSONObject r4 = r0.getJSONObject(r1)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r5 = "name"
            java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r5 = "jaData.getJSONObject(i).getString(\"name\")"
            e6.e.C(r4, r5)     // Catch:{ Exception -> 0x00bf }
            org.json.JSONObject r5 = r0.getJSONObject(r1)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r6 = "link"
            java.lang.String r5 = r5.getString(r6)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r6 = "jaData.getJSONObject(i).getString(\"link\")"
            e6.e.C(r5, r6)     // Catch:{ Exception -> 0x00bf }
            org.json.JSONObject r6 = r0.getJSONObject(r1)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r7 = "package_adx"
            java.lang.String r6 = r6.getString(r7)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r7 = "jaData.getJSONObject(i).getString(\"package_adx\")"
            e6.e.C(r6, r7)     // Catch:{ Exception -> 0x00bf }
            org.json.JSONObject r7 = r0.getJSONObject(r1)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r8 = "type"
            java.lang.String r7 = r7.getString(r8)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r8 = "jaData.getJSONObject(i).getString(\"type\")"
            e6.e.C(r7, r8)     // Catch:{ Exception -> 0x00bf }
            qa.b[] r8 = qa.b.values()     // Catch:{ Exception -> 0x00bf }
            int r9 = r8.length     // Catch:{ Exception -> 0x00bf }
            r10 = 0
        L_0x009f:
            if (r10 >= r9) goto L_0x00b1
            r11 = r8[r10]     // Catch:{ Exception -> 0x00bf }
            java.lang.String r12 = r11.getValue()     // Catch:{ Exception -> 0x00bf }
            boolean r12 = e6.e.r(r12, r7)     // Catch:{ Exception -> 0x00bf }
            if (r12 == 0) goto L_0x00ae
            goto L_0x00b2
        L_0x00ae:
            int r10 = r10 + 1
            goto L_0x009f
        L_0x00b1:
            r11 = r15
        L_0x00b2:
            if (r11 != 0) goto L_0x00b6
            qa.b r11 = qa.b.COMMUNITY     // Catch:{ Exception -> 0x00bf }
        L_0x00b6:
            r3.<init>(r4, r5, r6, r11)     // Catch:{ Exception -> 0x00bf }
            r2.add(r3)     // Catch:{ Exception -> 0x00bf }
            int r1 = r1 + 1
            goto L_0x0051
        L_0x00bf:
            r14 = move-exception
            goto L_0x00c3
        L_0x00c1:
            r14 = move-exception
            r2 = r15
        L_0x00c3:
            r14.printStackTrace()
        L_0x00c6:
            if (r2 == 0) goto L_0x00cd
            java.util.Iterator r14 = r2.iterator()
            goto L_0x00ce
        L_0x00cd:
            r14 = r15
        L_0x00ce:
            r0 = 1
            if (r14 == 0) goto L_0x00d8
            boolean r1 = r14.hasNext()
            if (r1 != r0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            r1 = 2131231283(0x7f080233, float:1.8078643E38)
            if (r0 == 0) goto L_0x0164
            java.lang.Object r0 = r14.next()
            qa.h r0 = (qa.h) r0
            android.content.Context r2 = r13.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131427418(0x7f0b005a, float:1.8476452E38)
            android.view.View r2 = r2.inflate(r3, r15)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            android.content.res.Resources r5 = r13.getResources()
            r6 = 2131100256(0x7f060260, float:1.7812888E38)
            float r5 = r5.getDimension(r6)
            int r5 = (int) r5
            r3.<init>(r4, r5)
            r2.setLayoutParams(r3)
            r3 = 2131231284(0x7f080234, float:1.8078645E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r4 = r0.f10339a
            r3.setText(r4)
            r3 = 2131231282(0x7f080232, float:1.807864E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            int r4 = r0.f10343e
            r3.setImageResource(r4)
            java.lang.String r3 = r0.f10340b
            java.lang.String r0 = r0.f10341c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "#"
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.setTag(r0)
            rb.a r0 = new rb.a
            r0.<init>(r13)
            r2.setOnClickListener(r0)
            boolean r0 = r14.hasNext()
            if (r0 != 0) goto L_0x0159
            r0 = 2131230934(0x7f0800d6, float:1.8077935E38)
            android.view.View r0 = r2.findViewById(r0)
            r3 = 8
            r0.setVisibility(r3)
        L_0x0159:
            android.view.View r0 = r13.b(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.addView(r2)
            goto L_0x00ce
        L_0x0164:
            android.view.View r14 = r13.b(r1)
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r15 = 0
            r14.setVisibility(r15)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.b.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
