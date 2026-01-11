package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import io.nodle.cash.R;
import x5.n;
import x5.q;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    public final Chip f4150a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f4151b;

    /* renamed from: c  reason: collision with root package name */
    public a f4152c;

    public class a extends n {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f4150a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.f4150a.setText(ChipTextInputComboView.a(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f4150a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f4151b = editText;
        editText.setVisibility(4);
        a aVar = new a();
        this.f4152c = aVar;
        editText.addTextChangedListener(aVar);
        b();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4151b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public final boolean isChecked() {
        return this.f4150a.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public final void setChecked(boolean z) {
        this.f4150a.setChecked(z);
        int i = 0;
        this.f4151b.setVisibility(z ? 0 : 4);
        Chip chip = this.f4150a;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            EditText editText = this.f4151b;
            editText.requestFocus();
            editText.post(new q(editText));
            if (!TextUtils.isEmpty(this.f4151b.getText())) {
                EditText editText2 = this.f4151b;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f4150a.setOnClickListener(onClickListener);
    }

    public final void setTag(int i, Object obj) {
        this.f4150a.setTag(i, obj);
    }

    public final void toggle() {
        this.f4150a.toggle();
    }
}
