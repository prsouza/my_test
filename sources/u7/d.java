package u7;

import android.content.Context;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11724a;

    /* renamed from: b  reason: collision with root package name */
    public a f11725b = null;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f11726a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11727b;

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0064  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(u7.d r6) {
            /*
                r5 = this;
                r5.<init>()
                android.content.Context r0 = r6.f11724a
                java.lang.String r1 = "com.google.firebase.crashlytics.unity_version"
                java.lang.String r2 = "string"
                int r0 = x7.e.f(r0, r1, r2)
                r1 = 2
                java.lang.String r2 = "FirebaseCrashlytics"
                r3 = 0
                if (r0 == 0) goto L_0x0033
                java.lang.String r4 = "Unity"
                r5.f11726a = r4
                android.content.Context r6 = r6.f11724a
                android.content.res.Resources r6 = r6.getResources()
                java.lang.String r6 = r6.getString(r0)
                r5.f11727b = r6
                java.lang.String r0 = "Unity Editor version is: "
                java.lang.String r6 = a8.a.c(r0, r6)
                boolean r0 = android.util.Log.isLoggable(r2, r1)
                if (r0 == 0) goto L_0x0068
                android.util.Log.v(r2, r6, r3)
                goto L_0x0068
            L_0x0033:
                java.lang.String r0 = "flutter_assets/NOTICES.Z"
                android.content.Context r4 = r6.f11724a
                android.content.res.AssetManager r4 = r4.getAssets()
                if (r4 != 0) goto L_0x003e
                goto L_0x004f
            L_0x003e:
                android.content.Context r6 = r6.f11724a     // Catch:{ IOException -> 0x004f }
                android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ IOException -> 0x004f }
                java.io.InputStream r6 = r6.open(r0)     // Catch:{ IOException -> 0x004f }
                if (r6 == 0) goto L_0x004d
                r6.close()     // Catch:{ IOException -> 0x004f }
            L_0x004d:
                r6 = 1
                goto L_0x0050
            L_0x004f:
                r6 = 0
            L_0x0050:
                if (r6 == 0) goto L_0x0064
                java.lang.String r6 = "Flutter"
                r5.f11726a = r6
                r5.f11727b = r3
                boolean r6 = android.util.Log.isLoggable(r2, r1)
                if (r6 == 0) goto L_0x0068
                java.lang.String r6 = "Development platform is: Flutter"
                android.util.Log.v(r2, r6, r3)
                goto L_0x0068
            L_0x0064:
                r5.f11726a = r3
                r5.f11727b = r3
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u7.d.a.<init>(u7.d):void");
        }
    }

    public d(Context context) {
        this.f11724a = context;
    }
}
