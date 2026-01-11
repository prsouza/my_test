package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.p;
import io.nodle.cash.R;
import n0.x;
import x5.c;

public class CheckableImageButton extends p implements Checkable {

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f3980v = {16842912};

    /* renamed from: s  reason: collision with root package name */
    public boolean f3981s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3982t = true;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3983u = true;

    public static class a extends s0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0046a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f3984c;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        public class C0046a implements Parcelable.ClassLoaderCreator<a> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new a[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            parcel.writeInt(this.f3984c ? 1 : 0);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3984c = parcel.readInt() != 1 ? false : true;
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        x.p(this, new c(this));
    }

    public final boolean isChecked() {
        return this.f3981s;
    }

    public final int[] onCreateDrawableState(int i) {
        if (!this.f3981s) {
            return super.onCreateDrawableState(i);
        }
        return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f3980v);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f10849a);
        setChecked(aVar.f3984c);
    }

    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f3984c = this.f3981s;
        return aVar;
    }

    public void setCheckable(boolean z) {
        if (this.f3982t != z) {
            this.f3982t = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f3982t && this.f3981s != z) {
            this.f3981s = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f3983u = z;
    }

    public void setPressed(boolean z) {
        if (this.f3983u) {
            super.setPressed(z);
        }
    }

    public final void toggle() {
        setChecked(!this.f3981s);
    }
}
