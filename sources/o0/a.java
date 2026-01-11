package o0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f9169a;

    /* renamed from: b  reason: collision with root package name */
    public final b f9170b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9171c;

    public a(int i, b bVar, int i10) {
        this.f9169a = i;
        this.f9170b = bVar;
        this.f9171c = i10;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f9169a);
        b bVar = this.f9170b;
        bVar.f9173a.performAction(this.f9171c, bundle);
    }
}
