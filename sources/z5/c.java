package z5;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import e6.i;
import h5.a;
import o0.b;

public abstract class c extends ViewGroup implements j {
    public int A;
    public int B;
    public int C;
    public i D;
    public ColorStateList E;
    public e F;

    /* renamed from: a  reason: collision with root package name */
    public int f13867a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f13868b;

    /* renamed from: c  reason: collision with root package name */
    public int f13869c;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f13870s;

    /* renamed from: t  reason: collision with root package name */
    public int f13871t;

    /* renamed from: u  reason: collision with root package name */
    public int f13872u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f13873v;

    /* renamed from: w  reason: collision with root package name */
    public int f13874w;

    /* renamed from: x  reason: collision with root package name */
    public int f13875x;

    /* renamed from: y  reason: collision with root package name */
    public int f13876y;
    public boolean z;

    private a getNewItem() {
        throw null;
    }

    private void setBadgeIfNeeded(a aVar) {
        if (aVar.getId() != -1) {
            throw null;
        }
    }

    public final void b(e eVar) {
        this.F = eVar;
    }

    public SparseArray<a> getBadgeDrawables() {
        return null;
    }

    public ColorStateList getIconTintList() {
        return this.f13868b;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.E;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.z;
    }

    public int getItemActiveIndicatorHeight() {
        return this.B;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.C;
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.D;
    }

    public int getItemActiveIndicatorWidth() {
        return this.A;
    }

    public Drawable getItemBackground() {
        return this.f13873v;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f13874w;
    }

    public int getItemIconSize() {
        return this.f13869c;
    }

    public int getItemPaddingBottom() {
        return this.f13876y;
    }

    public int getItemPaddingTop() {
        return this.f13875x;
    }

    public int getItemTextAppearanceActive() {
        return this.f13872u;
    }

    public int getItemTextAppearanceInactive() {
        return this.f13871t;
    }

    public ColorStateList getItemTextColor() {
        return this.f13870s;
    }

    public int getLabelVisibilityMode() {
        return this.f13867a;
    }

    public e getMenu() {
        return this.F;
    }

    public int getSelectedItemId() {
        return 0;
    }

    public int getSelectedItemPosition() {
        return 0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0175b.a(1, this.F.m().size(), 1).f9186a);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f13868b = colorStateList;
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.E = colorStateList;
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.z = z10;
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.B = i;
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.C = i;
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        this.D = iVar;
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.A = i;
    }

    public void setItemBackground(Drawable drawable) {
        this.f13873v = drawable;
    }

    public void setItemBackgroundRes(int i) {
        this.f13874w = i;
    }

    public void setItemIconSize(int i) {
        this.f13869c = i;
    }

    public void setItemPaddingBottom(int i) {
        this.f13876y = i;
    }

    public void setItemPaddingTop(int i) {
        this.f13875x = i;
    }

    public void setItemTextAppearanceActive(int i) {
        this.f13872u = i;
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f13871t = i;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f13870s = colorStateList;
    }

    public void setLabelVisibilityMode(int i) {
        this.f13867a = i;
    }

    public void setPresenter(d dVar) {
    }
}
