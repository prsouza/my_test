package qf;

import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p002if.w;

public final class f extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f10439d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f10440e = new a();

    public static final class a {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0.intValue() >= 9) goto L_0x002d;
     */
    static {
        /*
            qf.f$a r0 = new qf.f$a
            r0.<init>()
            f10440e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x0014
            java.lang.Integer r0 = fe.k.f1(r0)
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L_0x0022
            goto L_0x002d
        L_0x0022:
            r1 = r2
            goto L_0x002d
        L_0x0024:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0022 }
            r0.getMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0022 }
        L_0x002d:
            f10439d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.f.<clinit>():void");
    }

    public final void d(SSLSocket sSLSocket, String str, List<w> list) {
        e.D(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> a10 = h.f10446c.a(list);
        e.C(sSLParameters, "sslParameters");
        Object[] array = ((ArrayList) a10).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (applicationProtocol.hashCode() != 0) {
                    return applicationProtocol;
                }
                if (applicationProtocol.equals(BuildConfig.FLAVOR)) {
                    return null;
                }
                return applicationProtocol;
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }
}
