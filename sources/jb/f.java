package jb;

import android.text.Editable;
import android.text.TextWatcher;
import io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity;

public final class f implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImportAccountActivity f7134a;

    public f(ImportAccountActivity importAccountActivity) {
        this.f7134a = importAccountActivity;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010e, code lost:
        if ((fe.o.D1(r9).length() > 0) != false) goto L_0x0110;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0114
            io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity r9 = r7.f7134a
            int r10 = io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity.C
            io.nodle.cash.ui.viewmodel.ImportAccountViewModel r9 = r9.m()
            java.lang.String r10 = r8.toString()
            java.lang.String r11 = "inputStr"
            e6.e.D(r10, r11)
            int r11 = r9.f6786u
            java.lang.String r0 = "compile(pattern)"
            r1 = 0
            r2 = 1
            if (r11 != r2) goto L_0x007b
            int r11 = r10.length()
            if (r11 != 0) goto L_0x0023
            r11 = r2
            goto L_0x0024
        L_0x0023:
            r11 = r1
        L_0x0024:
            if (r11 != 0) goto L_0x007b
            java.lang.String r11 = "[a-zA-Z ]+"
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)
            e6.e.C(r11, r0)
            java.util.regex.Matcher r11 = r11.matcher(r10)
            boolean r11 = r11.matches()
            if (r11 != 0) goto L_0x003a
            goto L_0x007b
        L_0x003a:
            java.util.List r10 = ub.f.d(r10)
            java.lang.String r11 = r9.f6784s
            int r3 = r10.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "size:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.d(r11, r3)
            int r11 = r10.size()
            int r3 = r9.f6785t
            if (r11 != r3) goto L_0x007b
            r11 = r1
        L_0x0061:
            if (r11 >= r3) goto L_0x0074
            java.util.HashMap<java.lang.Integer, java.lang.String> r4 = r9.f6787v
            int r5 = r11 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r11 = r10.get(r11)
            r4.put(r6, r11)
            r11 = r5
            goto L_0x0061
        L_0x0074:
            int r10 = r9.f6785t
            int r10 = r10 + r2
            r9.f6786u = r10
            r9 = r2
            goto L_0x007c
        L_0x007b:
            r9 = r1
        L_0x007c:
            r10 = 2131231419(0x7f0802bb, float:1.8078918E38)
            if (r9 == 0) goto L_0x0087
            io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity r8 = r7.f7134a
            r8.o()
            goto L_0x00d2
        L_0x0087:
            int r9 = r8.length()
            if (r9 <= 0) goto L_0x008f
            r9 = r2
            goto L_0x0090
        L_0x008f:
            r9 = r1
        L_0x0090:
            if (r9 == 0) goto L_0x00d2
            java.lang.String r9 = "[a-zA-Z]+"
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)
            e6.e.C(r9, r0)
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r9 = r9.matches()
            if (r9 != 0) goto L_0x00d2
            io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity r9 = r7.f7134a
            android.view.View r9 = r9.k(r10)
            android.widget.EditText r9 = (android.widget.EditText) r9
            int r11 = r8.length()
            int r11 = r11 - r2
            java.lang.CharSequence r8 = r8.subSequence(r1, r11)
            android.text.Editable r8 = (android.text.Editable) r8
            r9.setText(r8)
            io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity r8 = r7.f7134a
            android.view.View r8 = r8.k(r10)
            android.widget.EditText r8 = (android.widget.EditText) r8
            io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity r9 = r7.f7134a
            android.view.View r9 = r9.k(r10)
            android.widget.EditText r9 = (android.widget.EditText) r9
            int r9 = r9.length()
            r8.setSelection(r9)
        L_0x00d2:
            io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity r8 = r7.f7134a
            r9 = 2131231148(0x7f0801ac, float:1.8078369E38)
            android.view.View r8 = r8.k(r9)
            android.widget.Button r8 = (android.widget.Button) r8
            io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity r9 = r7.f7134a
            io.nodle.cash.ui.viewmodel.ImportAccountViewModel r9 = r9.m()
            int r9 = r9.f6786u
            io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity r11 = r7.f7134a
            io.nodle.cash.ui.viewmodel.ImportAccountViewModel r11 = r11.m()
            int r11 = r11.f6785t
            int r11 = r11 + r2
            if (r9 == r11) goto L_0x0110
            io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity r9 = r7.f7134a
            android.view.View r9 = r9.k(r10)
            android.widget.EditText r9 = (android.widget.EditText) r9
            android.text.Editable r9 = r9.getText()
            java.lang.String r10 = "wordEditText.text"
            e6.e.C(r9, r10)
            java.lang.CharSequence r9 = fe.o.D1(r9)
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x010d
            r9 = r2
            goto L_0x010e
        L_0x010d:
            r9 = r1
        L_0x010e:
            if (r9 == 0) goto L_0x0111
        L_0x0110:
            r1 = r2
        L_0x0111:
            r8.setEnabled(r1)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.f.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
