package nb;

import ae.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import ce.c;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8937c = new a();

    /* renamed from: a  reason: collision with root package name */
    public WalletBackupViewModel f8938a;

    /* renamed from: b  reason: collision with root package name */
    public Map<Integer, View> f8939b = new LinkedHashMap();

    public static final class a {
    }

    public b() {
        Class<b> cls = b.class;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View b(int i) {
        View findViewById;
        ? r42 = this.f8939b;
        Integer valueOf = Integer.valueOf(R.id.verifyContainerLayout);
        View view = (View) r42.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.verifyContainerLayout)) == null) {
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
            int r5 = va.t.K
            androidx.databinding.DataBinderMapperImpl r5 = androidx.databinding.f.f1682a
            r5 = 2131427391(0x7f0b003f, float:1.8476397E38)
            r0 = 0
            r1 = 0
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.h(r3, r5, r4, r0, r1)
            va.t r3 = (va.t) r3
            java.lang.String r4 = "inflate(inflater, container, false)"
            e6.e.C(r3, r4)
            androidx.lifecycle.a0 r4 = r2.getViewLifecycleOwner()
            r3.r(r4)
            androidx.fragment.app.r r4 = r2.getActivity()
            if (r4 == 0) goto L_0x0034
            androidx.lifecycle.w0 r5 = new androidx.lifecycle.w0
            r5.<init>(r4)
            java.lang.Class<io.nodle.cash.ui.viewmodel.WalletBackupViewModel> r4 = io.nodle.cash.ui.viewmodel.WalletBackupViewModel.class
            androidx.lifecycle.u0 r4 = r5.a(r4)
            r1 = r4
            io.nodle.cash.ui.viewmodel.WalletBackupViewModel r1 = (io.nodle.cash.ui.viewmodel.WalletBackupViewModel) r1
        L_0x0034:
            r2.f8938a = r1
            r3.v(r1)
            android.view.View r3 = r3.f1668t
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.b.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f8939b.clear();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int[] iArr;
        e.D(view, "view");
        super.onViewCreated(view, bundle);
        WalletBackupViewModel walletBackupViewModel = this.f8938a;
        if (walletBackupViewModel != null) {
            int i = walletBackupViewModel.f6829w;
            for (int i10 = 0; i10 < i; i10++) {
                List<String> list = walletBackupViewModel.f6827u;
                e.D(list, "<this>");
                c cVar = new c(0, list.size() - 1);
                c.a aVar = ae.c.f342a;
                int i02 = ad.c.i0(cVar);
                while (true) {
                    int[] iArr2 = walletBackupViewModel.f6830x;
                    e.D(iArr2, "<this>");
                    int length = iArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            i11 = -1;
                            break;
                        } else if (i02 == iArr2[i11]) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (!(i11 >= 0)) {
                        break;
                    }
                    List<String> list2 = walletBackupViewModel.f6827u;
                    e.D(list2, "<this>");
                    ce.c cVar2 = new ce.c(0, list2.size() - 1);
                    c.a aVar2 = ae.c.f342a;
                    i02 = ad.c.i0(cVar2);
                }
                walletBackupViewModel.f6830x[i10] = i02;
            }
            iArr = walletBackupViewModel.f6830x;
        } else {
            iArr = null;
        }
        if (iArr != null) {
            for (int i12 : iArr) {
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_verify_phrase, (LinearLayout) b(R.id.verifyContainerLayout), false);
                Integer b10 = vb.c.f12449a.b(i12 + 1);
                if (b10 != null) {
                    ((EditText) inflate.findViewById(R.id.wordEditText)).setHint(b10.intValue());
                }
                ((EditText) inflate.findViewById(R.id.wordEditText)).setTag(Integer.valueOf(i12));
                ((EditText) inflate.findViewById(R.id.wordEditText)).addTextChangedListener(new c(this, i12));
                ((LinearLayout) b(R.id.verifyContainerLayout)).addView(inflate);
            }
        }
    }
}
