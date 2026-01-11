package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.Objects;
import u1.p;
import u1.r;
import v1.j;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2718a = p.e("DiagnosticsRcvr");

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            p.c().a(f2718a, "Requesting diagnostics", new Throwable[0]);
            try {
                j s22 = j.s2(context);
                Objects.requireNonNull(s22);
                s22.r2(Collections.singletonList((r) new r.a().a()));
            } catch (IllegalStateException e10) {
                p.c().b(f2718a, "WorkManager is not initialized", e10);
            }
        }
    }
}
