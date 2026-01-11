package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f782a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f783b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f784c;

    public c(ComponentActivity.b bVar, int i, IntentSender.SendIntentException sendIntentException) {
        this.f784c = bVar;
        this.f782a = i;
        this.f783b = sendIntentException;
    }

    public final void run() {
        this.f784c.b(this.f782a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f783b));
    }
}
