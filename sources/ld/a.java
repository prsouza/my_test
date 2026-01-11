package ld;

import android.location.Location;
import bc.e;
import bc.f;
import bc.i;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import io.nodle.sdk.NodleContext;
import md.m;
import xd.l;
import yd.h;
import yd.u;
import z4.q;

public final class a extends bc.a {

    /* renamed from: ld.a$a  reason: collision with other inner class name */
    public static final class C0147a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u<Location> f8223a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u<l<i, m>> f8224b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ FusedLocationProviderClient f8225c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f8226d;

        public C0147a(u<Location> uVar, u<l<i, m>> uVar2, FusedLocationProviderClient fusedLocationProviderClient, b bVar) {
            this.f8223a = uVar;
            this.f8224b = uVar2;
            this.f8225c = fusedLocationProviderClient;
            this.f8226d = bVar;
        }

        public final i a() {
            Location location = (Location) this.f8223a.f13622a;
            if (location == null) {
                return null;
            }
            return new we.a(location);
        }

        public final void stop() {
            this.f8225c.removeLocationUpdates((LocationCallback) this.f8226d);
        }
    }

    public static final class b extends LocationCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u<Location> f8227a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u<l<i, m>> f8228b;

        public b(u<Location> uVar, u<l<i, m>> uVar2) {
            this.f8227a = uVar;
            this.f8228b = uVar2;
        }

        public final void onLocationResult(LocationResult locationResult) {
            e6.e.D(locationResult, "location");
            u<Location> uVar = this.f8227a;
            u<l<i, m>> uVar2 = this.f8228b;
            uVar.f13622a = locationResult.getLastLocation();
            Location lastLocation = locationResult.getLastLocation();
            e6.e.C(lastLocation, "it.lastLocation");
            ((l) uVar2.f13622a).k(new we.a(lastLocation));
        }
    }

    public static final class c extends h implements l<i, m> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f8229b = new c();

        public c() {
            super(1);
        }

        public final Object k(Object obj) {
            e6.e.D((i) obj, "it");
            return m.f8555a;
        }
    }

    public final f a(NodleContext nodleContext) {
        e6.e.D(nodleContext, "ctx");
        ((a9.c) nodleContext.getSdkConfig()).g("LocationProviderPlay");
        LocationRequest priority = LocationRequest.create().setInterval(4000).setFastestInterval(2000).setPriority(100);
        e6.e.C(priority, "create()\n               …t.PRIORITY_HIGH_ACCURACY)");
        ac.a aVar = (ac.a) nodleContext;
        FusedLocationProviderClient fusedLocationProviderClient = new FusedLocationProviderClient(aVar.f289a);
        u uVar = new u();
        u uVar2 = new u();
        uVar2.f13622a = c.f8229b;
        fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new q(uVar));
        b bVar = new b(uVar, uVar2);
        fusedLocationProviderClient.requestLocationUpdates(priority, bVar, aVar.f289a.getMainLooper());
        return new C0147a(uVar, uVar2, fusedLocationProviderClient, bVar);
    }
}
