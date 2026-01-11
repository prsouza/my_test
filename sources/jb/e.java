package jb;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import fe.o;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity;

public final /* synthetic */ class e implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImportAccountActivity f7133a;

    public /* synthetic */ e(ImportAccountActivity importAccountActivity) {
        this.f7133a = importAccountActivity;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ImportAccountActivity importAccountActivity = this.f7133a;
        int i10 = ImportAccountActivity.C;
        e6.e.D(importAccountActivity, "this$0");
        Editable text = ((EditText) importAccountActivity.k(R.id.wordEditText)).getText();
        e6.e.C(text, "wordEditText.text");
        if (!(o.D1(text).length() > 0) || i != 66 || keyEvent.getAction() != 1) {
            return false;
        }
        EditText editText = (EditText) importAccountActivity.k(R.id.wordEditText);
        importAccountActivity.n(o.D1(String.valueOf(editText != null ? editText.getText() : null)).toString());
        return true;
    }
}
