package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

public final class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextView f1213a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f1214b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1215c;

    public e0(TextView textView, Typeface typeface, int i) {
        this.f1213a = textView;
        this.f1214b = typeface;
        this.f1215c = i;
    }

    public final void run() {
        this.f1213a.setTypeface(this.f1214b, this.f1215c);
    }
}
