package io.nlopez.smartlocation.geocoding.providers;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class AndroidGeocodingProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6672a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f6673b;

    public static class AndroidGeocodingService extends IntentService {

        /* renamed from: a  reason: collision with root package name */
        public Geocoder f6674a;

        public AndroidGeocodingService() {
            super(AndroidGeocodingService.class.getSimpleName());
        }

        public final void onHandleIntent(Intent intent) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Locale locale = (Locale) intent.getSerializableExtra("locale");
            if (locale == null) {
                this.f6674a = new Geocoder(this);
            } else {
                this.f6674a = new Geocoder(this, locale);
            }
            if (intent.hasExtra("direct")) {
                HashMap hashMap = (HashMap) intent.getSerializableExtra("direct");
                for (String str : hashMap.keySet()) {
                    try {
                        List<Address> fromLocationName = this.f6674a.getFromLocationName(str, ((Integer) hashMap.get(str)).intValue());
                        arrayList2 = new ArrayList();
                        for (Address aVar : fromLocationName) {
                            arrayList2.add(new ka.a(aVar));
                        }
                    } catch (IOException unused) {
                        arrayList2 = new ArrayList();
                    }
                    Intent intent2 = new Intent(AndroidGeocodingProvider.f6672a);
                    intent2.putExtra(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                    intent2.putExtra("result", arrayList2);
                    sendBroadcast(intent2);
                }
            }
            if (intent.hasExtra("reverse")) {
                HashMap hashMap2 = (HashMap) intent.getSerializableExtra("reverse");
                for (Location location : hashMap2.keySet()) {
                    try {
                        arrayList = new ArrayList(this.f6674a.getFromLocation(location.getLatitude(), location.getLongitude(), ((Integer) hashMap2.get(location)).intValue()));
                    } catch (IOException unused2) {
                        arrayList = new ArrayList();
                    }
                    Intent intent3 = new Intent(AndroidGeocodingProvider.f6673b);
                    intent3.putExtra("location", location);
                    intent3.putExtra("result", arrayList);
                    sendBroadcast(intent3);
                }
            }
        }
    }

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (AndroidGeocodingProvider.f6672a.equals(intent.getAction())) {
                Objects.requireNonNull(AndroidGeocodingProvider.this);
                throw null;
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (AndroidGeocodingProvider.f6673b.equals(intent.getAction())) {
                Objects.requireNonNull(AndroidGeocodingProvider.this);
                throw null;
            }
        }
    }

    static {
        Class<AndroidGeocodingProvider> cls = AndroidGeocodingProvider.class;
        f6672a = cls.getCanonicalName() + ".DIRECT_GEOCODE_ACTION";
        f6673b = cls.getCanonicalName() + ".REVERSE_GEOCODE_ACTION";
    }

    public AndroidGeocodingProvider() {
        Locale locale = Locale.getDefault();
        new a();
        new b();
        if (locale != null) {
            new HashMap();
            new HashMap();
            if (!Geocoder.isPresent()) {
                throw new RuntimeException("Android Geocoder not present. Please check if Geocoder.isPresent() before invoking the search");
            }
            return;
        }
        throw new RuntimeException("Locale is null");
    }
}
