package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f3998a;

    /* renamed from: b  reason: collision with root package name */
    public Button f3999b;

    /* renamed from: c  reason: collision with root package name */
    public int f4000c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(int i, int i10, int i11) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f3998a.getPaddingTop() == i10 && this.f3998a.getPaddingBottom() == i11) {
            return z;
        }
        TextView textView = this.f3998a;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.e.g(textView)) {
            x.e.k(textView, x.e.f(textView), i10, x.e.e(textView), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f3999b;
    }

    public TextView getMessageView() {
        return this.f3998a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3998a = (TextView) findViewById(R.id.snackbar_text);
        this.f3999b = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (a(1, r0, r0 - r2) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (a(0, r0, r0) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131099793(0x7f060091, float:1.781195E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131099792(0x7f060090, float:1.7811947E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f3998a
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L_0x0030
            r3 = r1
            goto L_0x0031
        L_0x0030:
            r3 = r4
        L_0x0031:
            if (r3 == 0) goto L_0x004a
            int r5 = r7.f4000c
            if (r5 <= 0) goto L_0x004a
            android.widget.Button r5 = r7.f3999b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f4000c
            if (r5 <= r6) goto L_0x004a
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x004a:
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = r4
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            super.onMeasure(r8, r9)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f4000c = i;
    }
}
