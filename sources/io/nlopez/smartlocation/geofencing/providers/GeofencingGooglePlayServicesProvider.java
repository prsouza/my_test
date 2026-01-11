package io.nlopez.smartlocation.geofencing.providers;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class GeofencingGooglePlayServicesProvider implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, ResultCallback<Status> {

    /* renamed from: c  reason: collision with root package name */
    public static final String f6677c = (GeofencingGooglePlayServicesProvider.class.getCanonicalName() + ".GEOFENCE_TRANSITION");

    /* renamed from: a  reason: collision with root package name */
    public final List<Geofence> f6678a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f6679b = Collections.synchronizedList(new ArrayList());

    public static class GeofencingService extends IntentService {
        public GeofencingService() {
            super(GeofencingService.class.getSimpleName());
        }

        public final void onHandleIntent(Intent intent) {
            GeofencingEvent fromIntent = GeofencingEvent.fromIntent(intent);
            if (fromIntent != null && !fromIntent.hasError()) {
                int geofenceTransition = fromIntent.getGeofenceTransition();
                Intent intent2 = new Intent(GeofencingGooglePlayServicesProvider.f6677c);
                intent2.putExtra("transition", geofenceTransition);
                intent2.putExtra("location", fromIntent.getTriggeringLocation());
                ArrayList arrayList = new ArrayList();
                for (Geofence requestId : fromIntent.getTriggeringGeofences()) {
                    arrayList.add(requestId.getRequestId());
                }
                intent2.putStringArrayListExtra("geofences", arrayList);
                sendBroadcast(intent2);
            }
        }
    }

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (GeofencingGooglePlayServicesProvider.f6677c.equals(intent.getAction()) && intent.hasExtra("geofences")) {
                Objects.requireNonNull(GeofencingGooglePlayServicesProvider.this);
                throw null;
            }
        }
    }

    public GeofencingGooglePlayServicesProvider() {
        new a();
    }

    public final void onConnected(Bundle bundle) {
        throw null;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        throw null;
    }

    public final void onConnectionSuspended(int i) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onConnectionSuspended ");
        sb2.append(i);
        throw null;
    }

    public final void onResult(Result result) {
        Status status = (Status) result;
        if (!status.isSuccess()) {
            status.hasResolution();
            status.getStatusMessage();
            throw null;
        }
        throw null;
    }
}
