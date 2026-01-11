package oa;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import ma.b;
import x8.d0;

public final class c implements ma.a, LocationListener {

    /* renamed from: a  reason: collision with root package name */
    public LocationManager f9391a;

    /* renamed from: b  reason: collision with root package name */
    public d0 f9392b;

    /* renamed from: c  reason: collision with root package name */
    public b f9393c;

    /* renamed from: d  reason: collision with root package name */
    public pa.a f9394d;

    /* renamed from: e  reason: collision with root package name */
    public Context f9395e;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9396a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                na.a[] r0 = na.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9396a = r0
                na.a r1 = na.a.HIGH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9396a     // Catch:{ NoSuchFieldError -> 0x001d }
                na.a r1 = na.a.MEDIUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9396a     // Catch:{ NoSuchFieldError -> 0x0028 }
                na.a r1 = na.a.LOW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9396a     // Catch:{ NoSuchFieldError -> 0x0033 }
                na.a r1 = na.a.LOWEST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oa.c.a.<clinit>():void");
        }
    }

    public final void a(d0 d0Var, na.b bVar, boolean z) {
        this.f9392b = d0Var;
        if (d0Var == null) {
            this.f9394d.a("Listener is null, you sure about this?", new Object[0]);
        }
        na.a aVar = bVar.f8934c;
        Criteria criteria = new Criteria();
        int i = a.f9396a[aVar.ordinal()];
        if (i == 1) {
            criteria.setAccuracy(1);
            criteria.setHorizontalAccuracy(3);
            criteria.setVerticalAccuracy(3);
            criteria.setBearingAccuracy(3);
            criteria.setSpeedAccuracy(3);
            criteria.setPowerRequirement(3);
        } else if (i != 2) {
            criteria.setAccuracy(2);
            criteria.setHorizontalAccuracy(1);
            criteria.setVerticalAccuracy(1);
            criteria.setBearingAccuracy(1);
            criteria.setSpeedAccuracy(1);
            criteria.setPowerRequirement(1);
        } else {
            criteria.setAccuracy(2);
            criteria.setHorizontalAccuracy(2);
            criteria.setVerticalAccuracy(2);
            criteria.setBearingAccuracy(2);
            criteria.setSpeedAccuracy(2);
            criteria.setPowerRequirement(2);
        }
        if (!z) {
            this.f9391a.requestLocationUpdates(bVar.f8932a, bVar.f8933b, criteria, this, Looper.getMainLooper());
        } else if (d0.a.a(this.f9395e, "android.permission.ACCESS_FINE_LOCATION") == 0 || d0.a.a(this.f9395e, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f9391a.requestSingleUpdate(criteria, this, Looper.getMainLooper());
        } else {
            this.f9394d.c("Permission check failed. Please handle it in your app before setting up location", new Object[0]);
        }
    }

    public final void b(Context context, pa.a aVar) {
        this.f9391a = (LocationManager) context.getSystemService("location");
        this.f9394d = aVar;
        this.f9395e = context;
        this.f9393c = new b(context);
    }

    public final void onLocationChanged(Location location) {
        this.f9394d.a("onLocationChanged", location);
        d0 d0Var = this.f9392b;
        if (d0Var != null) {
            d0Var.a(location);
        }
        if (this.f9393c != null) {
            this.f9394d.a("Stored in SharedPreferences", new Object[0]);
            this.f9393c.b("LMP", location);
        }
    }

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
