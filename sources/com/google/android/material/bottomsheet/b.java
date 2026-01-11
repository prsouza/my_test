package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import h.m;

public class b extends m {
    public final void dismiss() {
        Dialog dialog = getDialog();
        if (dialog instanceof a) {
            boolean z = ((a) dialog).i().G;
        }
        super.dismiss();
    }

    public final void dismissAllowingStateLoss() {
        Dialog dialog = getDialog();
        if (dialog instanceof a) {
            boolean z = ((a) dialog).i().G;
        }
        super.dismissAllowingStateLoss();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new a(getContext(), getTheme());
    }
}
