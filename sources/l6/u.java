package l6;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import i3.t;
import java.util.Objects;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f8032a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f8033b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AssetPackState f8034c;

    public /* synthetic */ u(x xVar, Bundle bundle, AssetPackState assetPackState) {
        this.f8032a = xVar;
        this.f8033b = bundle;
        this.f8034c = assetPackState;
    }

    public final void run() {
        x xVar = this.f8032a;
        Bundle bundle = this.f8033b;
        AssetPackState assetPackState = this.f8034c;
        g1 g1Var = xVar.g;
        Objects.requireNonNull(g1Var);
        if (((Boolean) g1Var.c(new t(g1Var, bundle))).booleanValue()) {
            xVar.f8085o.post(new w(xVar, assetPackState, 0));
            ((v2) xVar.i.zza()).zzf();
        }
    }
}
