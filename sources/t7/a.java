package t7;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import androidx.lifecycle.k0;
import c3.k;
import com.google.android.gms.measurement.AppMeasurement;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.LauncherActivity;
import io.nodle.cash.ui.view.activity.OptionsActivity;
import io.nodle.cash.ui.view.activity.WalletBackupActivity;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l6.a2;
import o7.a;
import r8.a;
import r8.b;
import rb.b;
import rb.c;
import rb.d;
import rb.g;
import v7.c;
import v7.d;

public final /* synthetic */ class a implements a.C0207a, k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f11428a;

    public /* synthetic */ a(Object obj) {
        this.f11428a = obj;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<w7.a>, java.util.ArrayList] */
    public final void b(b bVar) {
        b bVar2 = (b) this.f11428a;
        Objects.requireNonNull(bVar2);
        k kVar = k.E;
        kVar.e0("AnalyticsConnector now available.");
        o7.a aVar = (o7.a) bVar.get();
        a2 a2Var = new a2((Object) aVar);
        c cVar = new c();
        a.C0181a b10 = aVar.b("clx", cVar);
        if (b10 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", (Throwable) null);
            }
            b10 = aVar.b(AppMeasurement.CRASH_ORIGIN, cVar);
            if (b10 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", (Throwable) null);
            }
        }
        if (b10 != null) {
            kVar.e0("Registered Firebase Analytics listener.");
            d dVar = new d();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c cVar2 = new c(a2Var);
            synchronized (bVar2) {
                Iterator it = bVar2.f11431c.iterator();
                while (it.hasNext()) {
                    dVar.b((w7.a) it.next());
                }
                cVar.f11433b = dVar;
                cVar.f11432a = cVar2;
                bVar2.f11430b = dVar;
                bVar2.f11429a = cVar2;
            }
            return;
        }
        kVar.d1("Could not register Firebase Analytics listener; a listener is already registered.", (Throwable) null);
    }

    public final void d(Object obj) {
        int i;
        OptionsActivity optionsActivity = (OptionsActivity) this.f11428a;
        OptionsViewModel.a aVar = (OptionsViewModel.a) obj;
        int i10 = OptionsActivity.A;
        e.D(optionsActivity, "this$0");
        String str = optionsActivity.f6717v;
        Log.d(str, "Activity Action: " + aVar);
        if (aVar == null) {
            i = -1;
        } else {
            i = OptionsActivity.a.f6721a[aVar.ordinal()];
        }
        switch (i) {
            case 1:
                Log.d(optionsActivity.f6717v, "load settings");
                d.a aVar2 = rb.d.f10646c;
                rb.d dVar = new rb.d();
                optionsActivity.f6719x = dVar;
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(optionsActivity.getSupportFragmentManager());
                aVar3.f(R.id.fragmentContainerLayout, dVar);
                aVar3.d();
                return;
            case 2:
                optionsActivity.startActivity(new Intent(optionsActivity, WalletBackupActivity.class));
                return;
            case 3:
                String obj2 = aVar.toString();
                Log.d(optionsActivity.f6717v, "load privacy");
                Objects.requireNonNull(g.f10651s);
                g gVar = new g();
                optionsActivity.f6720y = gVar;
                androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(optionsActivity.getSupportFragmentManager());
                aVar4.e(R.id.fragmentContainerLayout, gVar, (String) null, 1);
                aVar4.c(obj2);
                aVar4.d();
                return;
            case 4:
                String obj3 = aVar.toString();
                Log.d(optionsActivity.f6717v, "load info");
                androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(optionsActivity.getSupportFragmentManager());
                b.a aVar6 = rb.b.f10641c;
                aVar5.e(R.id.fragmentContainerLayout, new rb.b(), (String) null, 1);
                aVar5.c(obj3);
                aVar5.d();
                return;
            case 6:
                Intent intent = new Intent();
                intent.setAction("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                optionsActivity.startActivity(intent);
                return;
            case 7:
                String obj4 = aVar.toString();
                Log.d(optionsActivity.f6717v, "load logout");
                androidx.fragment.app.a aVar7 = new androidx.fragment.app.a(optionsActivity.getSupportFragmentManager());
                c.a aVar8 = rb.c.f10644b;
                aVar7.e(R.id.fragmentContainerLayout, new rb.c(), (String) null, 1);
                aVar7.c(obj4);
                aVar7.d();
                return;
            case 8:
                Intent intent2 = new Intent(optionsActivity, LauncherActivity.class);
                intent2.setFlags(268468224);
                optionsActivity.startActivity(intent2);
                Toast.makeText(optionsActivity, R.string.confirmLogout, 0).show();
                return;
            case 9:
                optionsActivity.onBackPressed();
                return;
            default:
                return;
        }
    }
}
