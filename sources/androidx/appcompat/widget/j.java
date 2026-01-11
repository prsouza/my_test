package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f1288a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1289b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1290c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1291d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1292e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1293f;

    public j(CheckedTextView checkedTextView) {
        this.f1288a = checkedTextView;
    }

    public final void a() {
        Drawable checkMarkDrawable = this.f1288a.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f1291d || this.f1292e) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.f1291d) {
                mutate.setTintList(this.f1289b);
            }
            if (this.f1292e) {
                mutate.setTintMode(this.f1290c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1288a.getDrawableState());
            }
            this.f1288a.setCheckMarkDrawable(mutate);
        }
    }
}
