package ye;

import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import e6.e;
import java.io.StringWriter;
import java.util.Objects;
import md.m;
import xd.l;
import yd.h;

public final class a {

    /* renamed from: ye.a$a  reason: collision with other inner class name */
    public static final class C0262a extends h implements l<String, m> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StringWriter f13631b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0262a(StringWriter stringWriter) {
            super(1);
            this.f13631b = stringWriter;
        }

        public final Object k(Object obj) {
            String str = (String) obj;
            e.D(str, "it");
            this.f13631b.write(str, 0, str.length());
            return m.f8555a;
        }
    }

    public static final String a(Context context) {
        e.D(context, "<this>");
        String packageName = context.getPackageName();
        e.C(packageName, "packageName");
        return packageName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        ad.c.z(r3, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String b(android.content.Context r3, int r4) {
        /*
            java.lang.String r0 = "<this>"
            e6.e.D(r3, r0)
            android.content.res.Resources r3 = r3.getResources()
            java.io.InputStream r3 = r3.openRawResource(r4)
            java.lang.String r4 = "resources.openRawResource(id)"
            e6.e.C(r3, r4)
            java.io.StringWriter r4 = new java.io.StringWriter
            r4.<init>()
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0039 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = "UTF-8"
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0039 }
            r0.<init>(r1)     // Catch:{ all -> 0x0039 }
            ye.a$a r1 = new ye.a$a     // Catch:{ all -> 0x0039 }
            r1.<init>(r4)     // Catch:{ all -> 0x0039 }
            ah.v.F(r0, r1)     // Catch:{ all -> 0x0039 }
            r0 = 0
            ad.c.z(r3, r0)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "writer.toString()"
            e6.e.C(r3, r4)
            return r3
        L_0x0039:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            ad.c.z(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.a.b(android.content.Context, int):java.lang.String");
    }

    public static final Integer c(Context context) {
        e.D(context, "<this>");
        Object systemService = context.getSystemService("batterymanager");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        return Integer.valueOf(((BatteryManager) systemService).getIntProperty(4));
    }

    public static final void d(Context context) {
        e.D(context, "<this>");
        e.C(Build.MODEL, "MODEL");
    }
}
