package oa;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import b9.m;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsResult;
import java.util.Objects;
import x8.d0;

public final class a implements ma.a, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener, ResultCallback<Status> {

    /* renamed from: a  reason: collision with root package name */
    public GoogleApiClient f9375a;

    /* renamed from: b  reason: collision with root package name */
    public pa.a f9376b;

    /* renamed from: c  reason: collision with root package name */
    public d0 f9377c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9378d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9379e = false;

    /* renamed from: f  reason: collision with root package name */
    public ma.b f9380f;
    public LocationRequest g;

    /* renamed from: h  reason: collision with root package name */
    public Context f9381h;
    public b i;

    /* renamed from: j  reason: collision with root package name */
    public ResultCallback<LocationSettingsResult> f9382j = new C0182a();

    /* renamed from: oa.a$a  reason: collision with other inner class name */
    public class C0182a implements ResultCallback<LocationSettingsResult> {
        public C0182a() {
        }

        public final void onResult(Result result) {
            Status status = ((LocationSettingsResult) result).getStatus();
            int statusCode = status.getStatusCode();
            if (statusCode == 0) {
                a.this.f9376b.a("All location settings are satisfied.", new Object[0]);
                a aVar = a.this;
                Objects.requireNonNull(aVar);
                aVar.c(aVar.g);
            } else if (statusCode == 6) {
                a.this.f9376b.i("Location settings are not satisfied. Show the user a dialog to upgrade location settings. You should hook into the Activity onActivityResult and call this provider's onActivityResult method for continuing this call flow. ", new Object[0]);
                a aVar2 = a.this;
                Context context = aVar2.f9381h;
                if (context instanceof Activity) {
                    try {
                        status.startResolutionForResult((Activity) context, 20001);
                    } catch (IntentSender.SendIntentException unused) {
                        a.this.f9376b.c("PendingIntent unable to execute request.", new Object[0]);
                    }
                } else {
                    aVar2.f9376b.i("Provided context is not the context of an activity, therefore we can't launch the resolution activity.", new Object[0]);
                }
            } else if (statusCode == 8502) {
                a.this.f9376b.c("Location settings are inadequate, and cannot be fixed here. Dialog not created.", new Object[0]);
                a aVar3 = a.this;
                aVar3.f9376b.a("stop", new Object[0]);
                if (aVar3.f9375a.isConnected()) {
                    LocationServices.FusedLocationApi.removeLocationUpdates(aVar3.f9375a, (LocationListener) aVar3);
                    aVar3.f9375a.disconnect();
                }
                aVar3.f9378d = false;
                aVar3.f9379e = true;
            }
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9384a;

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
                f9384a = r0
                na.a r1 = na.a.HIGH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9384a     // Catch:{ NoSuchFieldError -> 0x001d }
                na.a r1 = na.a.MEDIUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9384a     // Catch:{ NoSuchFieldError -> 0x0028 }
                na.a r1 = na.a.LOW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9384a     // Catch:{ NoSuchFieldError -> 0x0033 }
                na.a r1 = na.a.LOWEST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oa.a.b.<clinit>():void");
        }
    }

    public a(b bVar) {
        this.i = bVar;
    }

    public final void a(d0 d0Var, na.b bVar, boolean z) {
        this.f9377c = d0Var;
        if (d0Var == null) {
            this.f9376b.a("Listener is null, you sure about this?", new Object[0]);
        }
        LocationRequest smallestDisplacement = LocationRequest.create().setFastestInterval(bVar.f8932a).setInterval(bVar.f8932a).setSmallestDisplacement(bVar.f8933b);
        int i10 = b.f9384a[bVar.f8934c.ordinal()];
        if (i10 == 1) {
            smallestDisplacement.setPriority(100);
        } else if (i10 == 2) {
            smallestDisplacement.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
        } else if (i10 == 3) {
            smallestDisplacement.setPriority(LocationRequest.PRIORITY_LOW_POWER);
        } else if (i10 == 4) {
            smallestDisplacement.setPriority(LocationRequest.PRIORITY_NO_POWER);
        }
        if (z) {
            smallestDisplacement.setNumUpdates(1);
        }
        this.g = smallestDisplacement;
        if (this.f9375a.isConnected()) {
            c(this.g);
        } else if (this.f9379e) {
            this.f9378d = true;
            this.f9375a.connect();
            this.f9379e = false;
        } else {
            this.f9378d = true;
            this.f9376b.a("still not connected - scheduled start when connection is ok", new Object[0]);
        }
    }

    public final void b(Context context, pa.a aVar) {
        this.f9376b = aVar;
        this.f9381h = context;
        this.f9380f = new ma.b(context);
        if (!this.f9378d) {
            GoogleApiClient build = new GoogleApiClient.Builder(context).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
            this.f9375a = build;
            build.connect();
            return;
        }
        aVar.a("already started", new Object[0]);
    }

    public final void c(LocationRequest locationRequest) {
        if (!this.f9375a.isConnected()) {
            this.f9376b.i("startUpdating executed without the GoogleApiClient being connected!!", new Object[0]);
        } else if (d0.a.a(this.f9381h, "android.permission.ACCESS_FINE_LOCATION") == 0 || d0.a.a(this.f9381h, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            LocationServices.FusedLocationApi.requestLocationUpdates(this.f9375a, locationRequest, (LocationListener) this, Looper.getMainLooper()).setResultCallback(this);
        } else {
            this.f9376b.c("Permission check failed. Please handle it in your app before setting up location", new Object[0]);
        }
    }

    public final void onConnected(Bundle bundle) {
        this.f9376b.a("onConnected", new Object[0]);
        if (this.f9378d) {
            c(this.g);
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        pa.a aVar = this.f9376b;
        StringBuilder d10 = a.a.d("onConnectionFailed ");
        d10.append(connectionResult.toString());
        aVar.a(d10.toString(), new Object[0]);
        b bVar = this.i;
        if (bVar != null) {
            bVar.c();
        }
    }

    public final void onConnectionSuspended(int i10) {
        this.f9376b.a(m.b("onConnectionSuspended ", i10), new Object[0]);
        b bVar = this.i;
        if (bVar != null) {
            bVar.c();
        }
    }

    public final void onLocationChanged(Location location) {
        this.f9376b.a("onLocationChanged", location);
        d0 d0Var = this.f9377c;
        if (d0Var != null) {
            d0Var.a(location);
        }
        if (this.f9380f != null) {
            this.f9376b.a("Stored in SharedPreferences", new Object[0]);
            this.f9380f.b("GMS", location);
        }
    }

    public final void onResult(Result result) {
        Status status = (Status) result;
        if (status.isSuccess()) {
            this.f9376b.a("Locations update request successful", new Object[0]);
        } else if (!status.hasResolution() || !(this.f9381h instanceof Activity)) {
            pa.a aVar = this.f9376b;
            StringBuilder d10 = a.a.d("Registering failed: ");
            d10.append(status.getStatusMessage());
            aVar.h(d10.toString(), new Object[0]);
        } else {
            this.f9376b.i("Unable to register, but we can solve this - will startActivityForResult. You should hook into the Activity onActivityResult and call this provider's onActivityResult method for continuing this call flow.", new Object[0]);
            try {
                status.startResolutionForResult((Activity) this.f9381h, 10001);
            } catch (IntentSender.SendIntentException e10) {
                this.f9376b.b(e10, new Object[0]);
            }
        }
    }
}
