package l6;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import o6.r;
import o6.z;
import y.c;

public class t2 implements z {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8030a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8031b;

    public /* synthetic */ t2() {
        this.f8030a = new AtomicInteger();
        this.f8031b = new AtomicInteger();
    }

    public /* synthetic */ t2(z zVar, z zVar2) {
        this.f8030a = zVar;
        this.f8031b = zVar2;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        Object zza = ((z) this.f8030a).zza();
        Context a10 = ((u2) ((z) this.f8031b)).a();
        o2 o2Var = (o2) zza;
        r.a(a10.getPackageManager(), new ComponentName(a10.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
        r.a(a10.getPackageManager(), new ComponentName(a10.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"));
        c.s0(o2Var);
        return o2Var;
    }
}
