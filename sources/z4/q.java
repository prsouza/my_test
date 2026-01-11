package z4;

import android.app.AlertDialog;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.k0;
import b5.b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import de.h;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import java.io.IOException;
import java.util.Objects;
import m.c;
import sb.e;
import v7.a;
import x8.t;
import yd.u;

public final /* synthetic */ class q implements b.a, a, Continuation, k0, ScopeCallback, OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f13843a;

    public /* synthetic */ q(Object obj) {
        this.f13843a = obj;
    }

    public final Object a() {
        s sVar = (s) this.f13843a;
        for (t4.q b10 : sVar.f13846b.P()) {
            sVar.f13847c.b(b10, 1);
        }
        return null;
    }

    public final void c(Bundle bundle) {
        ((t7.b) this.f13843a).f11429a.c(bundle);
    }

    public final void d(Object obj) {
        int i;
        e eVar = (e) this.f13843a;
        TransactViewModel.a aVar = (TransactViewModel.a) obj;
        h<Object>[] hVarArr = e.f11050w;
        e6.e.D(eVar, "this$0");
        if (aVar == null) {
            i = -1;
        } else {
            i = e.a.f11054a[aVar.ordinal()];
        }
        if (i == 1) {
            AlertDialog.Builder builder = new AlertDialog.Builder(new c(eVar.getContext(), (int) R.style.AlertDialogAppearance));
            builder.setTitle(R.string.pkFormatChangeTitle);
            builder.setMessage(R.string.pkFormatChangeMessage);
            builder.setPositiveButton(R.string.okay, new sb.a(eVar));
            builder.setNegativeButton(R.string.cancel, sb.b.f11047a);
            builder.show();
        }
    }

    public final void onSuccess(Object obj) {
        u uVar = (u) this.f13843a;
        e6.e.D(uVar, "$lastLocation");
        uVar.f13622a = (Location) obj;
    }

    public final void run(Scope scope) {
        ac.b bVar = (ac.b) this.f13843a;
        e6.e.D(bVar, "this$0");
        e6.e.D(scope, "scope");
        scope.setTag("CoroutineName", bVar.f296a);
        scope.setTag("NodleKey", (String) ((a9.c) bVar.f297b.getSdkConfig()).a("devkey", "default"));
        scope.setTag("App Name", bVar.f297b.getApplicationName());
        scope.setTag("Phone Model", bVar.f297b.getPhoneModel());
        scope.setContexts("DevKey", (String) ((a9.c) bVar.f297b.getSdkConfig()).a("devkey", "default"));
        scope.setContexts("NodleSdk Version", bVar.f297b.getGitSHA());
        scope.setContexts("App Name", bVar.f297b.getApplicationName());
        scope.setContexts("Phone Model", bVar.f297b.getPhoneModel());
        Integer batteryLevel = bVar.f297b.batteryLevel();
        if (batteryLevel != null) {
            scope.setContexts("Battery", (Number) Integer.valueOf(batteryLevel.intValue()));
        }
    }

    public final Object then(Task task) {
        Objects.requireNonNull((t) this.f13843a);
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
