package h;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.n;

public class m extends n {
    public Dialog onCreateDialog(Bundle bundle) {
        return new l(getContext(), getTheme());
    }

    public final void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof l) {
            l lVar = (l) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            lVar.g();
            return;
        }
        super.setupDialog(dialog, i);
    }
}
