package l6;

import a.b;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import m3.u;
import o6.w;
import p6.c;

public final class x extends c {
    public final g1 g;

    /* renamed from: h  reason: collision with root package name */
    public final u0 f8079h;
    public final w i;

    /* renamed from: j  reason: collision with root package name */
    public final l0 f8080j;

    /* renamed from: k  reason: collision with root package name */
    public final x0 f8081k;

    /* renamed from: l  reason: collision with root package name */
    public final w f8082l;

    /* renamed from: m  reason: collision with root package name */
    public final w f8083m;

    /* renamed from: n  reason: collision with root package name */
    public final y1 f8084n;

    /* renamed from: o  reason: collision with root package name */
    public final Handler f8085o = new Handler(Looper.getMainLooper());

    public x(Context context, g1 g1Var, u0 u0Var, w wVar, x0 x0Var, l0 l0Var, w wVar2, w wVar3, y1 y1Var) {
        super(new u("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.g = g1Var;
        this.f8079h = u0Var;
        this.i = wVar;
        this.f8081k = x0Var;
        this.f8080j = l0Var;
        this.f8082l = wVar2;
        this.f8083m = wVar3;
        this.f8084n = y1Var;
    }

    public final void a(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f9694a.c("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState i10 = AssetPackState.i(bundleExtra, stringArrayList.get(0), this.f8081k, this.f8084n, b.f11y);
            this.f9694a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", i10);
            if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
                Objects.requireNonNull(this.f8080j);
            }
            ((Executor) this.f8083m.zza()).execute(new u(this, bundleExtra, i10));
            ((Executor) this.f8082l.zza()).execute(new t(this, bundleExtra));
            return;
        }
        this.f9694a.c("Empty bundle received from broadcast.", new Object[0]);
    }
}
