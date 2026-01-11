package q6;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import t6.m;

public final class c extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f10313a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Handler handler, m mVar) {
        super(handler);
        this.f10313a = mVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.f10313a.b((Object) null);
    }
}
