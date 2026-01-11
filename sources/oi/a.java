package oi;

import a5.n;
import ah.v;
import android.content.Context;
import androidx.fragment.app.m;
import c.c;
import com.github.mikephil.charting.utils.Utils;
import e6.e;
import io.nodle.cash.R;
import io.nodle.sdk.NodleContext;
import io.nodle.sdk.SdkMetricType;
import io.nodle.sdk.core.database.SdkDatabase;
import io.sentry.Sentry;
import java.net.URI;
import java.util.List;
import java.util.Objects;
import je.h;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import t9.b;
import ze.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final NodleContext f9450a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9451b;

    /* renamed from: c  reason: collision with root package name */
    public final f f9452c;

    /* renamed from: d  reason: collision with root package name */
    public final b f9453d;

    /* renamed from: e  reason: collision with root package name */
    public final c f9454e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f9455f;
    public final v g;

    /* renamed from: h  reason: collision with root package name */
    public final hi.a f9456h;
    public final aa.b i;

    /* renamed from: j  reason: collision with root package name */
    public final h<xb.b> f9457j;

    /* renamed from: k  reason: collision with root package name */
    public final Logger f9458k;

    public a(NodleContext nodleContext, String str, f fVar, b bVar, c cVar, List<String> list, v vVar, hi.a aVar, aa.b bVar2, h<xb.b> hVar) {
        URI uri;
        NodleContext nodleContext2 = nodleContext;
        String str2 = str;
        f fVar2 = fVar;
        c cVar2 = cVar;
        h<xb.b> hVar2 = hVar;
        e.D(nodleContext2, "ctx");
        e.D(str2, "devKey");
        e.D(hVar2, "eventChannel");
        this.f9450a = nodleContext2;
        this.f9451b = str2;
        this.f9452c = fVar2;
        this.f9453d = bVar;
        this.f9454e = cVar2;
        this.f9455f = list;
        this.g = vVar;
        this.f9456h = aVar;
        this.i = bVar2;
        this.f9457j = hVar2;
        Logger logger = LoggerFactory.getLogger("SdkCore");
        e.C(logger, "getLogger(\"SdkCore\")");
        this.f9458k = logger;
        Context context = (Context) ((a9.c) nodleContext.getSdkConfig()).f176b;
        kd.a.a(context, ye.a.b(context, R.raw.sdk_default_config), "default");
        ((a9.c) nodleContext.getSdkConfig()).h("devkey", str2);
        logger.debug("initializing sdk core");
        logger.debug(e.a0(">>> with configuration: ", ((a9.c) nodleContext.getSdkConfig()).f()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(">>> ");
        hf.f fVar3 = (hf.f) fVar2;
        sb2.append(fVar3.b().size());
        sb2.append(" bundles in storage");
        logger.debug(sb2.toString());
        logger.debug(e.a0(">>> current sdk id: ", cVar.g()));
        a9.c cVar3 = (a9.c) nodleContext.getSdkConfig();
        Objects.requireNonNull(cVar3);
        Sentry.configureScope(new n("SDKCommon", cVar3));
        SdkDatabase sdkDatabase = fVar3.f5949a;
        e.D(sdkDatabase, "<this>");
        if (!sdkDatabase.u().b()) {
            sdkDatabase.u().e(new aj.h(SdkMetricType.BleScanCount.getId()));
            sdkDatabase.u().e(new aj.h(SdkMetricType.DtnForwardedCount.getId()));
            sdkDatabase.u().e(new aj.h(SdkMetricType.DtnDeliveredCount.getId()));
            sdkDatabase.u().e(new aj.h(SdkMetricType.DtnRxCount.getId()));
            sdkDatabase.u().e(new aj.h(SdkMetricType.DtnTxCount.getId()));
        }
        SdkDatabase sdkDatabase2 = fVar3.f5949a;
        e.D(sdkDatabase2, "<this>");
        if (!sdkDatabase2.t().b()) {
            sdkDatabase2.t().d(new aj.f("last_l", Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 0.0f, 0));
        }
        ve.a aVar2 = cVar2.f3051f;
        URI create = URI.create("dtn://api:me/nodlecast");
        e.C(create, "create(\"dtn://api:me/nodlecast\")");
        aVar2.b(create, new n2.a(this));
        ve.a aVar3 = cVar2.f3051f;
        URI create2 = URI.create("dtn://api:me/iotee");
        e.C(create2, "create(\"dtn://api:me/iotee\")");
        aVar3.b(create2, new k2.a(this));
        ii.a aVar4 = cVar2.g;
        try {
            uri = URI.create((String) ((a9.c) cVar2.f3046a.getSdkConfig()).a("dtn.default-push-url", "https://dtn.nodle.io/outbox"));
            e.C(uri, "{\n        URI.create(ctx…ush-url\", default))\n    }");
        } catch (IllegalArgumentException unused) {
            uri = URI.create("https://dtn.nodle.io/outbox");
            e.C(uri, "{\n        URI.create(default)\n    }");
        }
        aVar4.f6669c = new q9.a(this, uri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e.r(this.f9450a, aVar.f9450a) && e.r(this.f9451b, aVar.f9451b) && e.r(this.f9452c, aVar.f9452c) && e.r(this.f9453d, aVar.f9453d) && e.r(this.f9454e, aVar.f9454e) && e.r(this.f9455f, aVar.f9455f) && e.r(this.g, aVar.g) && e.r(this.f9456h, aVar.f9456h) && e.r(this.i, aVar.i) && e.r(this.f9457j, aVar.f9457j);
    }

    public final int hashCode() {
        int a10 = m.a(this.f9451b, this.f9450a.hashCode() * 31, 31);
        int hashCode = this.f9453d.hashCode();
        int hashCode2 = this.f9454e.hashCode();
        int hashCode3 = this.f9455f.hashCode();
        int hashCode4 = this.g.hashCode();
        int hashCode5 = this.f9456h.hashCode();
        int hashCode6 = this.i.hashCode();
        return this.f9457j.hashCode() + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f9452c.hashCode() + a10) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.b.q("SdkCore(ctx=");
        q10.append(this.f9450a);
        q10.append(", devKey=");
        q10.append(this.f9451b);
        q10.append(", sdkDb=");
        q10.append(this.f9452c);
        q10.append(", sdkId=");
        q10.append(this.f9453d);
        q10.append(", dtnAgent=");
        q10.append(this.f9454e);
        q10.append(", tags=");
        q10.append(this.f9455f);
        q10.append(", sdkBluetooth=");
        q10.append(this.g);
        q10.append(", sdkCellular=");
        q10.append(this.f9456h);
        q10.append(", sdkNetwork=");
        q10.append(this.i);
        q10.append(", eventChannel=");
        q10.append(this.f9457j);
        q10.append(')');
        return q10.toString();
    }
}
