package c3;

import android.content.Context;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public Context f3190a;

    /* renamed from: b  reason: collision with root package name */
    public a f3191b;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f3192a;

        /* renamed from: b  reason: collision with root package name */
        public String f3193b;

        /* renamed from: c  reason: collision with root package name */
        public String f3194c;

        /* renamed from: d  reason: collision with root package name */
        public String f3195d;

        /* renamed from: e  reason: collision with root package name */
        public String f3196e;

        /* renamed from: f  reason: collision with root package name */
        public String f3197f;
        public String g;

        /* renamed from: h  reason: collision with root package name */
        public String f3198h;
        public String i;

        /* renamed from: j  reason: collision with root package name */
        public String f3199j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3200k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f3201l;

        /* JADX WARNING: Removed duplicated region for block: B:70:0x01ab  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a() {
            /*
                r14 = this;
                java.lang.String r0 = "phone"
                c3.o.this = r15
                r14.<init>()
                java.lang.String r1 = android.os.Build.MANUFACTURER
                java.lang.String r2 = "Amazon"
                boolean r1 = r2.equals(r1)
                java.lang.String r2 = "Google Play Services not available"
                java.lang.String r3 = "com.amplitude.api.DeviceInfo"
                r4 = 1
                r5 = 0
                r6 = 0
                if (r1 == 0) goto L_0x0035
                android.content.Context r15 = r15.f3190a
                android.content.ContentResolver r15 = r15.getContentResolver()
                java.lang.String r1 = "limit_ad_tracking"
                int r1 = android.provider.Settings.Secure.getInt(r15, r1, r5)
                if (r1 != r4) goto L_0x0028
                r1 = r4
                goto L_0x0029
            L_0x0028:
                r1 = r5
            L_0x0029:
                r14.f3200k = r1
                java.lang.String r1 = "advertising_id"
                java.lang.String r15 = android.provider.Settings.Secure.getString(r15, r1)
                r14.f3192a = r15
                goto L_0x00b0
            L_0x0035:
                java.lang.String r1 = "Failed to get ADID"
                java.lang.Class<com.google.android.gms.ads.identifier.AdvertisingIdClient> r7 = com.google.android.gms.ads.identifier.AdvertisingIdClient.class
                java.lang.String r8 = "getAdvertisingIdInfo"
                java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.Class<android.content.Context> r10 = android.content.Context.class
                r9[r5] = r10     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                android.content.Context r15 = r15.f3190a     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                r8[r5] = r15     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.Object r15 = r7.invoke(r6, r8)     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.Class r7 = r15.getClass()     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.String r8 = "isLimitAdTrackingEnabled"
                java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.Object r7 = r7.invoke(r15, r8)     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                if (r7 == 0) goto L_0x006d
                boolean r7 = r7.booleanValue()     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                if (r7 == 0) goto L_0x006d
                r7 = r4
                goto L_0x006e
            L_0x006d:
                r7 = r5
            L_0x006e:
                r14.f3200k = r7     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.Class r7 = r15.getClass()     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.String r8 = "getId"
                java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.Object r15 = r7.invoke(r15, r8)     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                java.lang.String r15 = (java.lang.String) r15     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                r14.f3192a = r15     // Catch:{ ClassNotFoundException -> 0x00a1, InvocationTargetException -> 0x0095, Exception -> 0x0087 }
                goto L_0x00ae
            L_0x0087:
                r15 = move-exception
                java.lang.String r7 = "Encountered an error connecting to Google Play Services"
                android.util.Log.e(r3, r7, r15)
                c3.p r7 = c3.p.a()
                r7.b(r1, r15)
                goto L_0x00ae
            L_0x0095:
                r15 = move-exception
                android.util.Log.w(r3, r2)
                c3.p r7 = c3.p.a()
                r7.b(r1, r15)
                goto L_0x00ae
            L_0x00a1:
                r15 = move-exception
                java.lang.String r7 = "Google Play Services SDK not found!"
                android.util.Log.w(r3, r7)
                c3.p r7 = c3.p.a()
                r7.b(r1, r15)
            L_0x00ae:
                java.lang.String r15 = r14.f3192a
            L_0x00b0:
                r14.f3192a = r15
                c3.o r15 = c3.o.this     // Catch:{ NameNotFoundException -> 0x00c9 }
                android.content.Context r15 = r15.f3190a     // Catch:{ NameNotFoundException -> 0x00c9 }
                android.content.pm.PackageManager r15 = r15.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00c9 }
                c3.o r1 = c3.o.this     // Catch:{ NameNotFoundException -> 0x00c9 }
                android.content.Context r1 = r1.f3190a     // Catch:{ NameNotFoundException -> 0x00c9 }
                java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c9 }
                android.content.pm.PackageInfo r15 = r15.getPackageInfo(r1, r5)     // Catch:{ NameNotFoundException -> 0x00c9 }
                java.lang.String r15 = r15.versionName     // Catch:{ NameNotFoundException -> 0x00c9 }
                goto L_0x00d4
            L_0x00c9:
                r15 = move-exception
                c3.p r1 = c3.p.a()
                java.lang.String r7 = "Failed to get version name"
                r1.b(r7, r15)
                r15 = r6
            L_0x00d4:
                r14.f3194c = r15
                java.lang.String r15 = "android"
                r14.f3195d = r15
                java.lang.String r15 = android.os.Build.VERSION.RELEASE
                r14.f3196e = r15
                java.lang.String r15 = android.os.Build.BRAND
                r14.f3197f = r15
                java.lang.String r15 = android.os.Build.MANUFACTURER
                r14.g = r15
                java.lang.String r15 = android.os.Build.MODEL
                r14.f3198h = r15
                c3.o r15 = c3.o.this     // Catch:{ Exception -> 0x00f9 }
                android.content.Context r15 = r15.f3190a     // Catch:{ Exception -> 0x00f9 }
                java.lang.Object r15 = r15.getSystemService(r0)     // Catch:{ Exception -> 0x00f9 }
                android.telephony.TelephonyManager r15 = (android.telephony.TelephonyManager) r15     // Catch:{ Exception -> 0x00f9 }
                java.lang.String r15 = r15.getNetworkOperatorName()     // Catch:{ Exception -> 0x00f9 }
                goto L_0x0104
            L_0x00f9:
                r15 = move-exception
                c3.p r1 = c3.p.a()
                java.lang.String r7 = "Failed to get carrier"
                r1.b(r7, r15)
                r15 = r6
            L_0x0104:
                r14.i = r15
                java.lang.String r15 = "Failed to get country from location"
                c3.o r1 = c3.o.this
                java.util.Objects.requireNonNull(r1)
                c3.o r1 = c3.o.this
                android.location.Location r1 = r1.d()
                if (r1 == 0) goto L_0x0173
                boolean r7 = android.location.Geocoder.isPresent()     // Catch:{ IOException -> 0x016b, NullPointerException -> 0x0162, NoSuchMethodError -> 0x0159, IllegalArgumentException -> 0x0150, IllegalStateException -> 0x0147 }
                if (r7 == 0) goto L_0x0173
                c3.o r7 = c3.o.this     // Catch:{ IOException -> 0x016b, NullPointerException -> 0x0162, NoSuchMethodError -> 0x0159, IllegalArgumentException -> 0x0150, IllegalStateException -> 0x0147 }
                android.location.Geocoder r8 = r7.c()     // Catch:{ IOException -> 0x016b, NullPointerException -> 0x0162, NoSuchMethodError -> 0x0159, IllegalArgumentException -> 0x0150, IllegalStateException -> 0x0147 }
                double r9 = r1.getLatitude()     // Catch:{ IOException -> 0x016b, NullPointerException -> 0x0162, NoSuchMethodError -> 0x0159, IllegalArgumentException -> 0x0150, IllegalStateException -> 0x0147 }
                double r11 = r1.getLongitude()     // Catch:{ IOException -> 0x016b, NullPointerException -> 0x0162, NoSuchMethodError -> 0x0159, IllegalArgumentException -> 0x0150, IllegalStateException -> 0x0147 }
                r13 = 1
                java.util.List r1 = r8.getFromLocation(r9, r11, r13)     // Catch:{ IOException -> 0x016b, NullPointerException -> 0x0162, NoSuchMethodError -> 0x0159, IllegalArgumentException -> 0x0150, IllegalStateException -> 0x0147 }
                if (r1 == 0) goto L_0x0173
                java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x016b, NullPointerException -> 0x0162, NoSuchMethodError -> 0x0159, IllegalArgumentException -> 0x0150, IllegalStateException -> 0x0147 }
            L_0x0134:
                boolean r7 = r1.hasNext()     // Catch:{ IOException -> 0x016b, NullPointerException -> 0x0162, NoSuchMethodError -> 0x0159, IllegalArgumentException -> 0x0150, IllegalStateException -> 0x0147 }
                if (r7 == 0) goto L_0x0173
                java.lang.Object r7 = r1.next()     // Catch:{ IOException -> 0x016b, NullPointerException -> 0x0162, NoSuchMethodError -> 0x0159, IllegalArgumentException -> 0x0150, IllegalStateException -> 0x0147 }
                android.location.Address r7 = (android.location.Address) r7     // Catch:{ IOException -> 0x016b, NullPointerException -> 0x0162, NoSuchMethodError -> 0x0159, IllegalArgumentException -> 0x0150, IllegalStateException -> 0x0147 }
                if (r7 == 0) goto L_0x0134
                java.lang.String r15 = r7.getCountryCode()     // Catch:{ IOException -> 0x016b, NullPointerException -> 0x0162, NoSuchMethodError -> 0x0159, IllegalArgumentException -> 0x0150, IllegalStateException -> 0x0147 }
                goto L_0x0174
            L_0x0147:
                r1 = move-exception
                c3.p r7 = c3.p.a()
                r7.b(r15, r1)
                goto L_0x0173
            L_0x0150:
                r1 = move-exception
                c3.p r7 = c3.p.a()
                r7.b(r15, r1)
                goto L_0x0173
            L_0x0159:
                r1 = move-exception
                c3.p r7 = c3.p.a()
                r7.b(r15, r1)
                goto L_0x0173
            L_0x0162:
                r1 = move-exception
                c3.p r7 = c3.p.a()
                r7.b(r15, r1)
                goto L_0x0173
            L_0x016b:
                r1 = move-exception
                c3.p r7 = c3.p.a()
                r7.b(r15, r1)
            L_0x0173:
                r15 = r6
            L_0x0174:
                boolean r1 = c3.t.c(r15)
                if (r1 != 0) goto L_0x017b
                goto L_0x01b3
            L_0x017b:
                c3.o r15 = c3.o.this     // Catch:{ Exception -> 0x0199 }
                android.content.Context r15 = r15.f3190a     // Catch:{ Exception -> 0x0199 }
                java.lang.Object r15 = r15.getSystemService(r0)     // Catch:{ Exception -> 0x0199 }
                android.telephony.TelephonyManager r15 = (android.telephony.TelephonyManager) r15     // Catch:{ Exception -> 0x0199 }
                int r0 = r15.getPhoneType()     // Catch:{ Exception -> 0x0199 }
                r1 = 2
                if (r0 == r1) goto L_0x01a3
                java.lang.String r15 = r15.getNetworkCountryIso()     // Catch:{ Exception -> 0x0199 }
                if (r15 == 0) goto L_0x01a3
                java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x0199 }
                java.lang.String r15 = r15.toUpperCase(r0)     // Catch:{ Exception -> 0x0199 }
                goto L_0x01a4
            L_0x0199:
                r15 = move-exception
                c3.p r0 = c3.p.a()
                java.lang.String r1 = "Failed to get country from network"
                r0.b(r1, r15)
            L_0x01a3:
                r15 = r6
            L_0x01a4:
                boolean r0 = c3.t.c(r15)
                if (r0 != 0) goto L_0x01ab
                goto L_0x01b3
            L_0x01ab:
                java.util.Locale r15 = java.util.Locale.getDefault()
                java.lang.String r15 = r15.getCountry()
            L_0x01b3:
                r14.f3193b = r15
                java.util.Locale r15 = java.util.Locale.getDefault()
                java.lang.String r15 = r15.getLanguage()
                r14.f3199j = r15
                java.lang.String r15 = "Google Play Services Util not found!"
                java.lang.String r0 = "Failed to check GPS enabled"
                java.lang.Class<com.google.android.gms.common.GooglePlayServicesUtil> r1 = com.google.android.gms.common.GooglePlayServicesUtil.class
                java.lang.String r7 = com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG     // Catch:{ NoClassDefFoundError -> 0x023a, ClassNotFoundException -> 0x022e, NoSuchMethodException -> 0x0222, InvocationTargetException -> 0x0216, IllegalAccessException -> 0x020a, Exception -> 0x01ed }
                java.lang.String r7 = "isGooglePlayServicesAvailable"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ NoClassDefFoundError -> 0x023a, ClassNotFoundException -> 0x022e, NoSuchMethodException -> 0x0222, InvocationTargetException -> 0x0216, IllegalAccessException -> 0x020a, Exception -> 0x01ed }
                java.lang.Class<android.content.Context> r9 = android.content.Context.class
                r8[r5] = r9     // Catch:{ NoClassDefFoundError -> 0x023a, ClassNotFoundException -> 0x022e, NoSuchMethodException -> 0x0222, InvocationTargetException -> 0x0216, IllegalAccessException -> 0x020a, Exception -> 0x01ed }
                java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch:{ NoClassDefFoundError -> 0x023a, ClassNotFoundException -> 0x022e, NoSuchMethodException -> 0x0222, InvocationTargetException -> 0x0216, IllegalAccessException -> 0x020a, Exception -> 0x01ed }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ NoClassDefFoundError -> 0x023a, ClassNotFoundException -> 0x022e, NoSuchMethodException -> 0x0222, InvocationTargetException -> 0x0216, IllegalAccessException -> 0x020a, Exception -> 0x01ed }
                c3.o r8 = c3.o.this     // Catch:{ NoClassDefFoundError -> 0x023a, ClassNotFoundException -> 0x022e, NoSuchMethodException -> 0x0222, InvocationTargetException -> 0x0216, IllegalAccessException -> 0x020a, Exception -> 0x01ed }
                android.content.Context r8 = r8.f3190a     // Catch:{ NoClassDefFoundError -> 0x023a, ClassNotFoundException -> 0x022e, NoSuchMethodException -> 0x0222, InvocationTargetException -> 0x0216, IllegalAccessException -> 0x020a, Exception -> 0x01ed }
                r7[r5] = r8     // Catch:{ NoClassDefFoundError -> 0x023a, ClassNotFoundException -> 0x022e, NoSuchMethodException -> 0x0222, InvocationTargetException -> 0x0216, IllegalAccessException -> 0x020a, Exception -> 0x01ed }
                java.lang.Object r1 = r1.invoke(r6, r7)     // Catch:{ NoClassDefFoundError -> 0x023a, ClassNotFoundException -> 0x022e, NoSuchMethodException -> 0x0222, InvocationTargetException -> 0x0216, IllegalAccessException -> 0x020a, Exception -> 0x01ed }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ NoClassDefFoundError -> 0x023a, ClassNotFoundException -> 0x022e, NoSuchMethodException -> 0x0222, InvocationTargetException -> 0x0216, IllegalAccessException -> 0x020a, Exception -> 0x01ed }
                if (r1 == 0) goto L_0x01ea
                int r15 = r1.intValue()     // Catch:{ NoClassDefFoundError -> 0x023a, ClassNotFoundException -> 0x022e, NoSuchMethodException -> 0x0222, InvocationTargetException -> 0x0216, IllegalAccessException -> 0x020a, Exception -> 0x01ed }
                if (r15 != 0) goto L_0x01ea
                goto L_0x01eb
            L_0x01ea:
                r4 = r5
            L_0x01eb:
                r5 = r4
                goto L_0x0245
            L_0x01ed:
                r15 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Error when checking for Google Play Services: "
                r1.append(r2)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                android.util.Log.w(r3, r1)
                c3.p r1 = c3.p.a()
                r1.b(r0, r15)
                goto L_0x0245
            L_0x020a:
                r15 = move-exception
                android.util.Log.w(r3, r2)
                c3.p r1 = c3.p.a()
                r1.b(r0, r15)
                goto L_0x0245
            L_0x0216:
                r15 = move-exception
                android.util.Log.w(r3, r2)
                c3.p r1 = c3.p.a()
                r1.b(r0, r15)
                goto L_0x0245
            L_0x0222:
                r15 = move-exception
                android.util.Log.w(r3, r2)
                c3.p r1 = c3.p.a()
                r1.b(r0, r15)
                goto L_0x0245
            L_0x022e:
                r1 = move-exception
                android.util.Log.w(r3, r15)
                c3.p r15 = c3.p.a()
                r15.b(r0, r1)
                goto L_0x0245
            L_0x023a:
                r1 = move-exception
                android.util.Log.w(r3, r15)
                c3.p r15 = c3.p.a()
                r15.b(r0, r1)
            L_0x0245:
                r14.f3201l = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c3.o.a.<init>(c3.o):void");
        }
    }

    public o(Context context) {
        this.f3190a = context;
    }

    public final String a() {
        return b().f3192a;
    }

    public final a b() {
        if (this.f3191b == null) {
            this.f3191b = new a();
        }
        return this.f3191b;
    }

    public final Geocoder c() {
        return new Geocoder(this.f3190a, Locale.ENGLISH);
    }

    public final Location d() {
        List<String> list;
        Location location;
        LocationManager locationManager = (LocationManager) this.f3190a.getSystemService("location");
        Location location2 = null;
        if (locationManager == null) {
            return null;
        }
        try {
            list = locationManager.getProviders(true);
        } catch (SecurityException e10) {
            p.a().b("Failed to get most recent location", e10);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String lastKnownLocation : list) {
            try {
                location = locationManager.getLastKnownLocation(lastKnownLocation);
            } catch (Exception e11) {
                Log.w("com.amplitude.api.DeviceInfo", "Failed to get most recent location");
                p.a().b("Failed to get most recent location", e11);
                location = null;
            }
            if (location != null) {
                arrayList.add(location);
            }
        }
        long j10 = -1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Location location3 = (Location) it.next();
            if (location3.getTime() > j10) {
                j10 = location3.getTime();
                location2 = location3;
            }
        }
        return location2;
    }
}
