package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.v;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import h.n;
import o5.a;

public class MaterialComponentsViewInflater extends n {
    public final e a(Context context, AttributeSet attributeSet) {
        return new i6.n(context, attributeSet);
    }

    public final g b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final h c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    public final v d(Context context, AttributeSet attributeSet) {
        return new a6.a(context, attributeSet);
    }

    public final f0 e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
