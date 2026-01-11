package o7;

import android.os.Bundle;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o7.a;
import p7.c;
import p7.e;

public final class b implements a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile b f9366c;
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    public final AppMeasurementSdk f9367a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f9368b = new ConcurrentHashMap();

    public class a implements a.C0181a {
    }

    public b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f9367a = appMeasurementSdk;
    }

    @KeepForSdk
    public final void a(String str) {
        this.f9367a.clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    @KeepForSdk
    public final a.C0181a b(String str, a.b bVar) {
        Object obj;
        Preconditions.checkNotNull(bVar);
        if (!p7.a.c(str)) {
            return null;
        }
        if (!str.isEmpty() && this.f9368b.containsKey(str) && this.f9368b.get(str) != null) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f9367a;
        if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
            obj = new c(appMeasurementSdk, bVar);
        } else if (AppMeasurement.CRASH_ORIGIN.equals(str) || "clx".equals(str)) {
            obj = new e(appMeasurementSdk, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f9368b.put(str, obj);
        return new a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        r1 = r6.f9361k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        r1 = r6.f9359h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r1 = r6.f9358f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r1 = r6.f9355c;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(o7.a.c r6) {
        /*
            r5 = this;
            java.util.HashSet r0 = p7.a.f9700a
            java.lang.String r0 = r6.f9353a
            if (r0 == 0) goto L_0x0070
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000e
            goto L_0x0070
        L_0x000e:
            java.lang.Object r1 = r6.f9355c
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzit.zza(r1)
            if (r1 == 0) goto L_0x0070
        L_0x0018:
            boolean r1 = p7.a.c(r0)
            if (r1 != 0) goto L_0x001f
            goto L_0x0070
        L_0x001f:
            java.lang.String r1 = r6.f9354b
            boolean r1 = p7.a.d(r0, r1)
            if (r1 != 0) goto L_0x0028
            goto L_0x0070
        L_0x0028:
            java.lang.String r1 = r6.f9361k
            if (r1 == 0) goto L_0x003f
            android.os.Bundle r2 = r6.f9362l
            boolean r1 = p7.a.b(r1, r2)
            if (r1 != 0) goto L_0x0035
            goto L_0x0070
        L_0x0035:
            java.lang.String r1 = r6.f9361k
            android.os.Bundle r2 = r6.f9362l
            boolean r1 = p7.a.a(r0, r1, r2)
            if (r1 == 0) goto L_0x0070
        L_0x003f:
            java.lang.String r1 = r6.f9359h
            if (r1 == 0) goto L_0x0056
            android.os.Bundle r2 = r6.i
            boolean r1 = p7.a.b(r1, r2)
            if (r1 != 0) goto L_0x004c
            goto L_0x0070
        L_0x004c:
            java.lang.String r1 = r6.f9359h
            android.os.Bundle r2 = r6.i
            boolean r1 = p7.a.a(r0, r1, r2)
            if (r1 == 0) goto L_0x0070
        L_0x0056:
            java.lang.String r1 = r6.f9358f
            if (r1 == 0) goto L_0x006e
            android.os.Bundle r2 = r6.g
            boolean r1 = p7.a.b(r1, r2)
            if (r1 != 0) goto L_0x0063
            goto L_0x0070
        L_0x0063:
            java.lang.String r1 = r6.f9358f
            android.os.Bundle r2 = r6.g
            boolean r0 = p7.a.a(r0, r1, r2)
            if (r0 != 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r0 = 1
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r0 != 0) goto L_0x0074
            return
        L_0x0074:
            com.google.android.gms.measurement.api.AppMeasurementSdk r0 = r5.f9367a
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = r6.f9353a
            if (r2 == 0) goto L_0x0084
            java.lang.String r3 = "origin"
            r1.putString(r3, r2)
        L_0x0084:
            java.lang.String r2 = r6.f9354b
            if (r2 == 0) goto L_0x008d
            java.lang.String r3 = "name"
            r1.putString(r3, r2)
        L_0x008d:
            java.lang.Object r2 = r6.f9355c
            if (r2 == 0) goto L_0x0094
            com.google.android.gms.measurement.internal.zzhe.zzb(r1, r2)
        L_0x0094:
            java.lang.String r2 = r6.f9356d
            if (r2 == 0) goto L_0x009d
            java.lang.String r3 = "trigger_event_name"
            r1.putString(r3, r2)
        L_0x009d:
            long r2 = r6.f9357e
            java.lang.String r4 = "trigger_timeout"
            r1.putLong(r4, r2)
            java.lang.String r2 = r6.f9358f
            if (r2 == 0) goto L_0x00ad
            java.lang.String r3 = "timed_out_event_name"
            r1.putString(r3, r2)
        L_0x00ad:
            android.os.Bundle r2 = r6.g
            if (r2 == 0) goto L_0x00b6
            java.lang.String r3 = "timed_out_event_params"
            r1.putBundle(r3, r2)
        L_0x00b6:
            java.lang.String r2 = r6.f9359h
            if (r2 == 0) goto L_0x00bf
            java.lang.String r3 = "triggered_event_name"
            r1.putString(r3, r2)
        L_0x00bf:
            android.os.Bundle r2 = r6.i
            if (r2 == 0) goto L_0x00c8
            java.lang.String r3 = "triggered_event_params"
            r1.putBundle(r3, r2)
        L_0x00c8:
            long r2 = r6.f9360j
            java.lang.String r4 = "time_to_live"
            r1.putLong(r4, r2)
            java.lang.String r2 = r6.f9361k
            if (r2 == 0) goto L_0x00d8
            java.lang.String r3 = "expired_event_name"
            r1.putString(r3, r2)
        L_0x00d8:
            android.os.Bundle r2 = r6.f9362l
            if (r2 == 0) goto L_0x00e1
            java.lang.String r3 = "expired_event_params"
            r1.putBundle(r3, r2)
        L_0x00e1:
            long r2 = r6.f9363m
            java.lang.String r4 = "creation_timestamp"
            r1.putLong(r4, r2)
            boolean r2 = r6.f9364n
            java.lang.String r3 = "active"
            r1.putBoolean(r3, r2)
            long r2 = r6.f9365o
            java.lang.String r6 = "triggered_timestamp"
            r1.putLong(r6, r2)
            r0.setConditionalUserProperty(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.b.c(o7.a$c):void");
    }

    @KeepForSdk
    public final void d(Object obj) {
        if (p7.a.c(AppMeasurement.FCM_ORIGIN) && p7.a.d(AppMeasurement.FCM_ORIGIN, "_ln")) {
            this.f9367a.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", obj);
        }
    }

    @KeepForSdk
    public final Map e() {
        return this.f9367a.getUserProperties((String) null, (String) null, false);
    }

    @KeepForSdk
    public final List f(String str) {
        ArrayList arrayList = new ArrayList();
        for (Bundle next : this.f9367a.getConditionalUserProperties(str, BuildConfig.FLAVOR)) {
            HashSet hashSet = p7.a.f9700a;
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            Preconditions.checkNotNull(next);
            a.c cVar = new a.c();
            cVar.f9353a = (String) Preconditions.checkNotNull((String) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, cls2, (Object) null));
            cVar.f9354b = (String) Preconditions.checkNotNull((String) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.NAME, cls2, (Object) null));
            cVar.f9355c = zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, (Object) null);
            cVar.f9356d = (String) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, cls2, (Object) null);
            cVar.f9357e = ((Long) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cls, 0L)).longValue();
            cVar.f9358f = (String) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, cls2, (Object) null);
            cVar.g = (Bundle) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, (Object) null);
            cVar.f9359h = (String) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, cls2, (Object) null);
            cVar.i = (Bundle) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, (Object) null);
            cVar.f9360j = ((Long) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cls, 0L)).longValue();
            cVar.f9361k = (String) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, cls2, (Object) null);
            cVar.f9362l = (Bundle) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, (Object) null);
            cVar.f9364n = ((Boolean) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f9363m = ((Long) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cls, 0L)).longValue();
            cVar.f9365o = ((Long) zzhe.zza(next, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cls, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @KeepForSdk
    public final void g(String str, String str2, Bundle bundle) {
        if (p7.a.c(str) && p7.a.b(str2, bundle) && p7.a.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            this.f9367a.logEvent(str, str2, bundle);
        }
    }

    @KeepForSdk
    public final int h(String str) {
        return this.f9367a.getMaxUserProperties(str);
    }
}
