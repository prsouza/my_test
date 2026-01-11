package z5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import d0.a;
import x5.j;

public final class f extends j {

    /* renamed from: b  reason: collision with root package name */
    public m.f f13880b;

    public interface a {
    }

    public static class b extends s0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Bundle f13881c;

        public class a implements Parcelable.ClassLoaderCreator<b> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new b[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13881c = parcel.readBundle(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            parcel.writeBundle(this.f13881c);
        }
    }

    private MenuInflater getMenuInflater() {
        if (this.f13880b == null) {
            this.f13880b = new m.f(getContext());
        }
        return this.f13880b;
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public MenuItem getCheckedItem() {
        throw null;
    }

    public int getDividerInsetEnd() {
        throw null;
    }

    public int getDividerInsetStart() {
        throw null;
    }

    public int getHeaderCount() {
        throw null;
    }

    public Drawable getItemBackground() {
        throw null;
    }

    public int getItemHorizontalPadding() {
        throw null;
    }

    public int getItemIconPadding() {
        throw null;
    }

    public ColorStateList getItemIconTintList() {
        throw null;
    }

    public int getItemMaxLines() {
        throw null;
    }

    public ColorStateList getItemTextColor() {
        throw null;
    }

    public int getItemVerticalPadding() {
        throw null;
    }

    public Menu getMenu() {
        return null;
    }

    public int getSubheaderInsetEnd() {
        throw null;
    }

    public int getSubheaderInsetStart() {
        throw null;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a.b.E0(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) null);
    }

    public final void onMeasure(int i, int i10) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), 0), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        }
        super.onMeasure(i, i10);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            super.onRestoreInstanceState(((b) parcelable).f10849a);
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

    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        boolean z = getParent() instanceof v0.a;
        throw null;
    }

    public void setBottomInsetScrimEnabled(boolean z) {
    }

    public void setCheckedItem(int i) {
        throw null;
    }

    public void setDividerInsetEnd(int i) {
        throw null;
    }

    public void setDividerInsetStart(int i) {
        throw null;
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a.b.D0(this, f10);
    }

    public void setItemBackground(Drawable drawable) {
        throw null;
    }

    public void setItemBackgroundResource(int i) {
        Context context = getContext();
        Object obj = d0.a.f4256a;
        setItemBackground(a.b.b(context, i));
    }

    public void setItemHorizontalPadding(int i) {
        throw null;
    }

    public void setItemHorizontalPaddingResource(int i) {
        getResources().getDimensionPixelSize(i);
        throw null;
    }

    public void setItemIconPadding(int i) {
        throw null;
    }

    public void setItemIconPaddingResource(int i) {
        getResources().getDimensionPixelSize(i);
        throw null;
    }

    public void setItemIconSize(int i) {
        throw null;
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        throw null;
    }

    public void setItemMaxLines(int i) {
        throw null;
    }

    public void setItemTextAppearance(int i) {
        throw null;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setItemVerticalPadding(int i) {
        throw null;
    }

    public void setItemVerticalPaddingResource(int i) {
        getResources().getDimensionPixelSize(i);
        throw null;
    }

    public void setNavigationItemSelectedListener(a aVar) {
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
    }

    public void setSubheaderInsetEnd(int i) {
        throw null;
    }

    public void setSubheaderInsetStart(int i) {
        throw null;
    }

    public void setTopInsetScrimEnabled(boolean z) {
    }

    public void setCheckedItem(MenuItem menuItem) {
        menuItem.getItemId();
        throw null;
    }
}
