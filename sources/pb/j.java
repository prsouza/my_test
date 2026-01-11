package pb;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.tasks.Task;
import d0.a;
import e6.e;
import ge.d0;
import ge.g;
import h1.w;
import h1.x;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import io.nodle.map_marker.MarkerView;
import java.util.LinkedHashMap;
import java.util.Map;
import je.f;
import je.l;
import l6.b1;
import md.m;
import pd.d;
import rd.i;
import x8.q0;
import xd.p;

public final class j extends Fragment {
    public static final a F = new a();
    public static final String G = j.class.getSimpleName();
    public boolean A;
    public b B = new b(this);
    public final int C = 38;
    public float D;
    public Map<Integer, View> E = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final float f9844a = 16.0f;

    /* renamed from: b  reason: collision with root package name */
    public HomeViewModelV2 f9845b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f9846c;

    /* renamed from: s  reason: collision with root package name */
    public Bitmap f9847s;

    /* renamed from: t  reason: collision with root package name */
    public FusedLocationProviderClient f9848t;

    /* renamed from: u  reason: collision with root package name */
    public LocationRequest f9849u;

    /* renamed from: v  reason: collision with root package name */
    public GoogleMap f9850v;

    /* renamed from: w  reason: collision with root package name */
    public float f9851w;

    /* renamed from: x  reason: collision with root package name */
    public float f9852x;

    /* renamed from: y  reason: collision with root package name */
    public int f9853y = 50;
    public int z = 100;

    public static final class a {
    }

    public static final class b extends LocationCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f9854a;

        public b(j jVar) {
            this.f9854a = jVar;
        }

        public final void onLocationResult(LocationResult locationResult) {
            ImageView imageView;
            e.D(locationResult, "locationResult");
            super.onLocationResult(locationResult);
            j jVar = this.f9854a;
            if (jVar.f9850v != null) {
                FusedLocationProviderClient fusedLocationProviderClient = jVar.f9848t;
                Task<Location> lastLocation = fusedLocationProviderClient != null ? fusedLocationProviderClient.getLastLocation() : null;
                if (lastLocation != null) {
                    lastLocation.addOnSuccessListener(new q0(jVar, 2));
                }
                ImageView imageView2 = (ImageView) this.f9854a.b(R.id.curtainView);
                boolean z = false;
                if (imageView2 != null) {
                    if (imageView2.getVisibility() == 0) {
                        z = true;
                    }
                }
                if (z && (imageView = (ImageView) this.f9854a.b(R.id.curtainView)) != null) {
                    imageView.postDelayed(new w(this.f9854a, 1), 3000);
                }
            }
        }
    }

    @rd.e(c = "io.nodle.cash.ui.view.fragment.home.MapFragment$onViewCreated$2", f = "MapFragment.kt", l = {85}, m = "invokeSuspend")
    public static final class c extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f9855a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j f9856b;

        public static final class a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ j f9857a;

            public a(j jVar) {
                this.f9857a = jVar;
            }

            public final Object a(Object obj, d dVar) {
                if (((Boolean) obj).booleanValue()) {
                    this.f9857a.d();
                } else {
                    this.f9857a.c();
                }
                return m.f8555a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j jVar, d<? super c> dVar) {
            super(2, dVar);
            this.f9856b = jVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new c(this.f9856b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [je.h<java.lang.Boolean>, je.l] */
        public final Object invokeSuspend(Object obj) {
            ? r12;
            Object obj2 = qd.a.COROUTINE_SUSPENDED;
            int i = this.f9855a;
            if (i == 0) {
                b1.w(obj);
                j jVar = this.f9856b;
                HomeViewModelV2 homeViewModelV2 = jVar.f9845b;
                if (homeViewModelV2 == null || (r12 = homeViewModelV2.P) == 0) {
                    return m.f8555a;
                }
                a aVar = new a(jVar);
                this.f9855a = 1;
                if (l.i(r12, aVar, this) == obj2) {
                    return obj2;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                b1.w(obj);
            }
            throw new md.b();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View b(int i) {
        View findViewById;
        ? r02 = this.E;
        View view = (View) r02.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        r02.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void c() {
        wb.c cVar;
        SensorManager sensorManager;
        FusedLocationProviderClient fusedLocationProviderClient = this.f9848t;
        if (fusedLocationProviderClient != null) {
            fusedLocationProviderClient.removeLocationUpdates((LocationCallback) this.B);
        }
        MarkerView markerView = (MarkerView) b(R.id.markerView);
        if (!(markerView == null || (cVar = markerView.f6847s) == null || (sensorManager = cVar.g) == null)) {
            sensorManager.unregisterListener(cVar);
        }
        this.A = false;
    }

    public final void d() {
        this.A = true;
        MarkerView markerView = (MarkerView) b(R.id.markerView);
        if (markerView != null) {
            markerView.post(new androidx.emoji2.text.l(this, 1));
        }
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [androidx.lifecycle.u0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r5 = "inflater"
            e6.e.D(r3, r5)
            int r5 = va.e0.I
            androidx.databinding.DataBinderMapperImpl r5 = androidx.databinding.f.f1682a
            r5 = 2131427397(0x7f0b0045, float:1.847641E38)
            r0 = 0
            r1 = 0
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.h(r3, r5, r4, r0, r1)
            va.e0 r3 = (va.e0) r3
            java.lang.String r4 = "inflate(inflater, container, false)"
            e6.e.C(r3, r4)
            androidx.lifecycle.a0 r4 = r2.getViewLifecycleOwner()
            r3.r(r4)
            androidx.fragment.app.r r4 = r2.getActivity()
            if (r4 == 0) goto L_0x0034
            androidx.lifecycle.w0 r5 = new androidx.lifecycle.w0
            r5.<init>(r4)
            java.lang.Class<io.nodle.cash.ui.viewmodel.HomeViewModelV2> r4 = io.nodle.cash.ui.viewmodel.HomeViewModelV2.class
            androidx.lifecycle.u0 r4 = r5.a(r4)
            r1 = r4
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r1 = (io.nodle.cash.ui.viewmodel.HomeViewModelV2) r1
        L_0x0034:
            r2.f9845b = r1
            r3.v(r1)
            android.view.View r3 = r3.f1668t
            java.lang.String r4 = "binding.root"
            e6.e.C(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.j.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        super.onDestroy();
        MapView mapView = (MapView) b(R.id.mapView);
        if (mapView != null) {
            mapView.onDestroy();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.E.clear();
    }

    public final void onLowMemory() {
        super.onLowMemory();
        MapView mapView = (MapView) b(R.id.mapView);
        if (mapView != null) {
            mapView.onLowMemory();
        }
    }

    public final void onPause() {
        super.onPause();
        MapView mapView = (MapView) b(R.id.mapView);
        if (mapView != null) {
            mapView.onPause();
        }
    }

    public final void onResume() {
        super.onResume();
        MapView mapView = (MapView) b(R.id.mapView);
        if (mapView != null) {
            mapView.onResume();
        }
        HomeViewModelV2 homeViewModelV2 = this.f9845b;
        if (homeViewModelV2 != null) {
            g.b(jc.b.y(homeViewModelV2), (pd.f) null, new m(this, (d<? super m>) null), 3);
        }
    }

    public final void onStart() {
        super.onStart();
        MapView mapView = (MapView) b(R.id.mapView);
        if (mapView != null) {
            mapView.onStart();
        }
        d();
    }

    public final void onStop() {
        super.onStop();
        c();
        MapView mapView = (MapView) b(R.id.mapView);
        if (mapView != null) {
            mapView.onStop();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        MapView mapView;
        e.D(view, "view");
        super.onViewCreated(view, bundle);
        MapView mapView2 = (MapView) b(R.id.mapView);
        if (mapView2 != null) {
            mapView2.onCreate(bundle);
        }
        Context context = getContext();
        if (!(context == null || (mapView = (MapView) b(R.id.mapView)) == null)) {
            Object obj = d0.a.f4256a;
            mapView.setBackgroundColor(a.c.a(context, R.color.backgroundV2));
        }
        MapView mapView3 = (MapView) b(R.id.mapView);
        if (mapView3 != null) {
            mapView3.getMapAsync(new i(this));
        }
        Context context2 = getContext();
        this.f9848t = context2 != null ? LocationServices.getFusedLocationProviderClient(context2) : null;
        LocationRequest create = LocationRequest.create();
        this.f9849u = create;
        if (create != null) {
            create.setInterval(100);
        }
        LocationRequest locationRequest = this.f9849u;
        if (locationRequest != null) {
            locationRequest.setFastestInterval(100);
        }
        LocationRequest locationRequest2 = this.f9849u;
        if (locationRequest2 != null) {
            locationRequest2.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
        }
        MarkerView markerView = (MarkerView) b(R.id.markerView);
        if (markerView != null) {
            markerView.post(new x(this, 1));
        }
        HomeViewModelV2 homeViewModelV2 = this.f9845b;
        if (homeViewModelV2 != null) {
            g.b(jc.b.y(homeViewModelV2), (pd.f) null, new c(this, (d<? super c>) null), 3);
        }
    }
}
