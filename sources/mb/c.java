package mb;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import e6.e;
import io.nodle.cash.R;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c extends Fragment {

    /* renamed from: u  reason: collision with root package name */
    public static final a f8516u = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f8517a = 1500;

    /* renamed from: b  reason: collision with root package name */
    public String f8518b = "Contacting Nodle...";

    /* renamed from: c  reason: collision with root package name */
    public AnimatorSet f8519c;

    /* renamed from: s  reason: collision with root package name */
    public b f8520s;

    /* renamed from: t  reason: collision with root package name */
    public Map<Integer, View> f8521t = new LinkedHashMap();

    public static final class a {
    }

    public interface b {
        void c();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View b(int i) {
        View findViewById;
        ? r02 = this.f8521t;
        View view = (View) r02.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        r02.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onAttach(Context context) {
        e.D(context, "context");
        super.onAttach(context);
        if (context instanceof b) {
            this.f8520s = (b) context;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f8518b = arguments.getString("ARG_STATUS_MESSAGE");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        e.D(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_progress, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.progressTextView);
        if (textView != null) {
            textView.setText(this.f8518b);
        }
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        AnimatorSet animatorSet = this.f8519c;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        super.onDestroyView();
        this.f8521t.clear();
    }

    public final void onDetach() {
        super.onDetach();
        this.f8520s = null;
    }
}
