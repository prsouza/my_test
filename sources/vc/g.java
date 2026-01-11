package vc;

import ca.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import ed.l;
import io.sentry.protocol.SentryRuntime;
import java.math.BigInteger;
import kc.a;

public final class g extends e {

    /* renamed from: c  reason: collision with root package name */
    public final l f12455c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(int r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 117(0x75, float:1.64E-43)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            int r0 = r3 % 8
            if (r0 != 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0027
            int r3 = r3 / 8
            ed.l r0 = new ed.l
            r0.<init>(r3)
            r2.f12455c = r0
            return
        L_0x0027:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.g.<init>(int):void");
    }

    public final Object a(b bVar, a aVar) {
        e.D(bVar, "scaleCodecReader");
        e.D(aVar, SentryRuntime.TYPE);
        return this.f12455c.g(bVar);
    }

    public final void b(c cVar, a aVar, Object obj) {
        BigInteger bigInteger = (BigInteger) obj;
        e.D(cVar, "scaleCodecWriter");
        e.D(aVar, SentryRuntime.TYPE);
        e.D(bigInteger, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f12455c.b(cVar, bigInteger);
    }
}
