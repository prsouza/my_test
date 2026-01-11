package androidx.databinding;

import android.view.Choreographer;

public final class i implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewDataBinding f1683a;

    public i(ViewDataBinding viewDataBinding) {
        this.f1683a = viewDataBinding;
    }

    public final void doFrame(long j10) {
        this.f1683a.f1665b.run();
    }
}
