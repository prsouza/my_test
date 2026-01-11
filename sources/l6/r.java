package l6;

import ah.v;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.u;
import o6.p;
import o6.s;
import t6.m;
import t6.q;

public final class r implements v2 {
    public static final u g = new u("AssetPackServiceImpl");

    /* renamed from: h  reason: collision with root package name */
    public static final Intent f8000h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    public final String f8001a;

    /* renamed from: b  reason: collision with root package name */
    public final x0 f8002b;

    /* renamed from: c  reason: collision with root package name */
    public final y1 f8003c;

    /* renamed from: d  reason: collision with root package name */
    public p f8004d;

    /* renamed from: e  reason: collision with root package name */
    public p f8005e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f8006f = new AtomicBoolean();

    public r(Context context, x0 x0Var, y1 y1Var) {
        this.f8001a = context.getPackageName();
        this.f8002b = x0Var;
        this.f8003c = y1Var;
        if (s.b(context)) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            u uVar = g;
            Intent intent = f8000h;
            v vVar = v.E;
            this.f8004d = new p(context2, uVar, "AssetPackService", intent, vVar);
            Context applicationContext2 = context.getApplicationContext();
            this.f8005e = new p(applicationContext2 != null ? applicationContext2 : context, uVar, "AssetPackService-keepAlive", intent, vVar);
        }
        g.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    public static q h() {
        g.c("onError(%d)", -11);
        a aVar = new a(-11);
        q qVar = new q();
        qVar.e(aVar);
        return qVar;
    }

    public static Bundle j(int i, String str, String str2, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        bundle.putString("module_name", str);
        bundle.putString("slice_id", str2);
        bundle.putInt("chunk_number", i10);
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle k(Map map) {
        Bundle g8 = g();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        g8.putParcelableArrayList("installed_asset_module", arrayList);
        return g8;
    }

    public final void a(int i, String str, String str2, int i10) {
        if (this.f8004d != null) {
            g.e("notifyChunkTransferred", new Object[0]);
            m mVar = new m();
            this.f8004d.b(new e(this, mVar, i, str, str2, i10, mVar), mVar);
            return;
        }
        throw new t0("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final void b(int i) {
        if (this.f8004d != null) {
            g.e("notifySessionFailed", new Object[0]);
            m mVar = new m();
            this.f8004d.b(new g(this, mVar, i, mVar), mVar);
            return;
        }
        throw new t0("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final void c(int i, String str) {
        i(i, str, 10);
    }

    public final q d(Map map) {
        if (this.f8004d == null) {
            return h();
        }
        g.e("syncPacks", new Object[0]);
        m mVar = new m();
        this.f8004d.b(new d(this, mVar, map, mVar), mVar);
        return mVar.f11420a;
    }

    public final q e(int i, String str, String str2, int i10) {
        if (this.f8004d == null) {
            return h();
        }
        g.e("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i10), Integer.valueOf(i));
        m mVar = new m();
        this.f8004d.b(new h(this, mVar, i, str, str2, i10, mVar), mVar);
        return mVar.f11420a;
    }

    public final void f(List list) {
        if (this.f8004d != null) {
            g.e("cancelDownloads(%s)", list);
            m mVar = new m();
            this.f8004d.b(new c(this, mVar, list, mVar), mVar);
        }
    }

    public final void i(int i, String str, int i10) {
        if (this.f8004d != null) {
            g.e("notifyModuleCompleted", new Object[0]);
            m mVar = new m();
            this.f8004d.b(new f(this, mVar, i, str, mVar, i10), mVar);
            return;
        }
        throw new t0("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final synchronized void zzf() {
        if (this.f8005e == null) {
            g.g("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        u uVar = g;
        uVar.e("keepAlive", new Object[0]);
        if (!this.f8006f.compareAndSet(false, true)) {
            uVar.e("Service is already kept alive.", new Object[0]);
            return;
        }
        m mVar = new m();
        this.f8005e.b(new i(this, mVar, mVar), mVar);
    }
}
