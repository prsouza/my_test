package io.nlopez.smartlocation.activity.providers;

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
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.Objects;

public final class ActivityGooglePlayServicesProvider implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, ResultCallback<Status> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6670a = (ActivityGooglePlayServicesProvider.class.getCanonicalName() + ".DETECTED_ACTIVITY");

    public static class ActivityRecognitionService extends IntentService {
        public ActivityRecognitionService() {
            super(ActivityRecognitionService.class.getSimpleName());
        }

        public final void onHandleIntent(Intent intent) {
            if (ActivityRecognitionResult.hasResult(intent)) {
                DetectedActivity mostProbableActivity = ActivityRecognitionResult.extractResult(intent).getMostProbableActivity();
                Intent intent2 = new Intent(ActivityGooglePlayServicesProvider.f6670a);
                intent2.putExtra("activity", mostProbableActivity);
                sendBroadcast(intent2);
            }
        }
    }

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (ActivityGooglePlayServicesProvider.f6670a.equals(intent.getAction()) && intent.hasExtra("activity")) {
                Objects.requireNonNull(ActivityGooglePlayServicesProvider.this);
                throw null;
            }
        }
    }

    public ActivityGooglePlayServicesProvider() {
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
