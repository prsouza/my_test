package j;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class c extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f6976a;

    public c(Drawable drawable) {
        Drawable drawable2 = this.f6976a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f6976a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f6976a.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.f6976a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f6976a.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f6976a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f6976a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f6976a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f6976a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f6976a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f6976a.getPadding(rect);
    }

    public final int[] getState() {
        return this.f6976a.getState();
    }

    public final Region getTransparentRegion() {
        return this.f6976a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.f6976a.isAutoMirrored();
    }

    public final boolean isStateful() {
        return this.f6976a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f6976a.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f6976a.setBounds(rect);
    }

    public final boolean onLevelChange(int i) {
        return this.f6976a.setLevel(i);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public final void setAlpha(int i) {
        this.f6976a.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        this.f6976a.setAutoMirrored(z);
    }

    public final void setChangingConfigurations(int i) {
        this.f6976a.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6976a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.f6976a.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.f6976a.setFilterBitmap(z);
    }

    public void setHotspot(float f10, float f11) {
        this.f6976a.setHotspot(f10, f11);
    }

    public void setHotspotBounds(int i, int i10, int i11, int i12) {
        this.f6976a.setHotspotBounds(i, i10, i11, i12);
    }

    public boolean setState(int[] iArr) {
        return this.f6976a.setState(iArr);
    }

    public final void setTint(int i) {
        this.f6976a.setTint(i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f6976a.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f6976a.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z10) {
        return super.setVisible(z, z10) || this.f6976a.setVisible(z, z10);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
