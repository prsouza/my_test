package r;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import e6.e;

public class a extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final e f10501c = new e();

    /* renamed from: a  reason: collision with root package name */
    public boolean f10502a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10503b;

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        throw null;
    }

    public boolean getPreventCornerOverlap() {
        return this.f10503b;
    }

    public float getRadius() {
        throw null;
    }

    public boolean getUseCompatPadding() {
        return this.f10502a;
    }

    public void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCardElevation(float f10) {
        throw null;
    }

    public void setMaxCardElevation(float f10) {
        throw null;
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public final void setPadding(int i, int i10, int i11, int i12) {
    }

    public final void setPaddingRelative(int i, int i10, int i11, int i12) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f10503b) {
            this.f10503b = z;
            throw null;
        }
    }

    public void setRadius(float f10) {
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f10502a != z) {
            this.f10502a = z;
            throw null;
        }
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }
}
