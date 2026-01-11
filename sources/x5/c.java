package x5;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import n0.a;
import o0.b;

public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f12804d;

    public c(CheckableImageButton checkableImageButton) {
        this.f12804d = checkableImageButton;
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f12804d.isChecked());
    }

    public final void d(View view, b bVar) {
        this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
        bVar.m(this.f12804d.f3982t);
        bVar.f9173a.setChecked(this.f12804d.isChecked());
    }
}
