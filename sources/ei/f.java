package ei;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import ei.c;

public final class f extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public c.a f4858a;

    /* renamed from: b  reason: collision with root package name */
    public c.b f4859b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4860c = false;

    public final void a(FragmentManager fragmentManager) {
        if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !this.f4860c) {
            show(fragmentManager, "RationaleDialogFragment");
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof c.a) {
                this.f4858a = (c.a) getParentFragment();
            }
            if (getParentFragment() instanceof c.b) {
                this.f4859b = (c.b) getParentFragment();
            }
        }
        if (context instanceof c.a) {
            this.f4858a = (c.a) context;
        }
        if (context instanceof c.b) {
            this.f4859b = (c.b) context;
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder;
        setCancelable(false);
        e eVar = new e(getArguments());
        d dVar = new d(this, eVar, this.f4858a, this.f4859b);
        Activity activity = getActivity();
        if (eVar.f4854c > 0) {
            builder = new AlertDialog.Builder(activity, eVar.f4854c);
        } else {
            builder = new AlertDialog.Builder(activity);
        }
        return builder.setCancelable(false).setPositiveButton(eVar.f4852a, dVar).setNegativeButton(eVar.f4853b, dVar).setMessage(eVar.f4856e).create();
    }

    public final void onDetach() {
        super.onDetach();
        this.f4858a = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f4860c = true;
        super.onSaveInstanceState(bundle);
    }
}
