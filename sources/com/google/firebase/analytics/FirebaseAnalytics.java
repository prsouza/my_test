package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzio;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n7.a;
import s8.e;

public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f4199b;

    /* renamed from: a  reason: collision with root package name */
    public final zzee f4200a;

    public FirebaseAnalytics(zzee zzee) {
        Preconditions.checkNotNull(zzee);
        this.f4200a = zzee;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f4199b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f4199b == null) {
                    f4199b = new FirebaseAnalytics(zzee.zzg(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f4199b;
    }

    @Keep
    public static zzio getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzee zzg = zzee.zzg(context, (String) null, (String) null, (String) null, bundle);
        if (zzg == null) {
            return null;
        }
        return new a(zzg);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(e.f().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new IllegalStateException(e10.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f4200a.zzG(activity, str, str2);
    }
}
