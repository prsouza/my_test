package z5;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.j;
import e6.i;
import java.util.Objects;
import m.f;

public abstract class e extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public ColorStateList f13877a;

    /* renamed from: b  reason: collision with root package name */
    public f f13878b;

    public interface a {
    }

    public interface b {
    }

    public static class c extends s0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Bundle f13879c;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new c[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13879c = parcel.readBundle(classLoader == null ? c.class.getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            parcel.writeBundle(this.f13879c);
        }
    }

    private MenuInflater getMenuInflater() {
        if (this.f13878b == null) {
            this.f13878b = new f(getContext());
        }
        return this.f13878b;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        throw null;
    }

    public int getItemActiveIndicatorHeight() {
        throw null;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        throw null;
    }

    public i getItemActiveIndicatorShapeAppearance() {
        throw null;
    }

    public int getItemActiveIndicatorWidth() {
        throw null;
    }

    public Drawable getItemBackground() {
        throw null;
    }

    @Deprecated
    public int getItemBackgroundResource() {
        throw null;
    }

    public int getItemIconSize() {
        throw null;
    }

    public ColorStateList getItemIconTintList() {
        throw null;
    }

    public int getItemPaddingBottom() {
        throw null;
    }

    public int getItemPaddingTop() {
        throw null;
    }

    public ColorStateList getItemRippleColor() {
        return this.f13877a;
    }

    public int getItemTextAppearanceActive() {
        throw null;
    }

    public int getItemTextAppearanceInactive() {
        throw null;
    }

    public ColorStateList getItemTextColor() {
        throw null;
    }

    public int getLabelVisibilityMode() {
        throw null;
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return null;
    }

    public j getMenuView() {
        return null;
    }

    public d getPresenter() {
        return null;
    }

    public int getSelectedItemId() {
        throw null;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a.b.E0(this);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            super.onRestoreInstanceState(((c) parcelable).f10849a);
            throw null;
        }
    }

    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() != null) {
            new Bundle();
            throw null;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a.b.D0(this, f10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        throw null;
    }

    public void setItemActiveIndicatorHeight(int i) {
        throw null;
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        throw null;
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        throw null;
    }

    public void setItemActiveIndicatorWidth(int i) {
        throw null;
    }

    public void setItemBackground(Drawable drawable) {
        throw null;
    }

    public void setItemBackgroundResource(int i) {
        throw null;
    }

    public void setItemIconSize(int i) {
        throw null;
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        throw null;
    }

    public void setItemPaddingBottom(int i) {
        throw null;
    }

    public void setItemPaddingTop(int i) {
        throw null;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f13877a == colorStateList) {
            Objects.requireNonNull(colorStateList);
            return;
        }
        this.f13877a = colorStateList;
        Objects.requireNonNull(colorStateList);
        new RippleDrawable(c6.a.a(colorStateList), (Drawable) null, (Drawable) null);
        throw null;
    }

    public void setItemTextAppearanceActive(int i) {
        throw null;
    }

    public void setItemTextAppearanceInactive(int i) {
        throw null;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setLabelVisibilityMode(int i) {
        throw null;
    }

    public void setOnItemReselectedListener(a aVar) {
    }

    public void setOnItemSelectedListener(b bVar) {
    }

    public void setSelectedItemId(int i) {
        throw null;
    }
}
