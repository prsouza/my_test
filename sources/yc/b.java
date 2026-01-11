package yc;

import dc.c;
import dc.e;
import dc.f;
import io.sentry.protocol.SentryRuntime;
import java.math.BigInteger;
import java.security.Signature;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import jp.co.soramitsu.fearless_utils.encrypt.Sr25519;
import kc.a;
import nd.g;
import nd.m;
import nd.p;
import nd.q;
import nd.x;
import qc.a;
import tc.d;
import tc.f;
import tc.h;
import tc.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<j.a> f13589a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final f f13590b;

    /* renamed from: c  reason: collision with root package name */
    public final a f13591c;

    /* renamed from: d  reason: collision with root package name */
    public final fc.a f13592d;

    /* renamed from: e  reason: collision with root package name */
    public final BigInteger f13593e;

    /* renamed from: f  reason: collision with root package name */
    public final hd.a f13594f;
    public final byte[] g;

    /* renamed from: h  reason: collision with root package name */
    public final c f13595h;
    public final Object i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f13596j;

    /* renamed from: k  reason: collision with root package name */
    public final d f13597k;

    /* renamed from: l  reason: collision with root package name */
    public final BigInteger f13598l;

    /* renamed from: m  reason: collision with root package name */
    public final Map<d, Object> f13599m;

    /* renamed from: n  reason: collision with root package name */
    public final a.C0200a<e> f13600n;

    public b(kc.a aVar, fc.a aVar2, BigInteger bigInteger, hd.a aVar3, byte[] bArr, c cVar, Object obj) {
        d.a aVar4 = d.a.f11533a;
        BigInteger bigInteger2 = c.f13601a;
        e6.e.C(bigInteger2, "DEFAULT_TIP");
        p pVar = p.f8967a;
        e6.e eVar = e6.e.f4652y;
        e6.e.D(aVar, SentryRuntime.TYPE);
        e6.e.D(aVar2, "keypair");
        e6.e.D(bigInteger, "nonce");
        e6.e.D(aVar3, "runtimeVersion");
        this.f13591c = aVar;
        this.f13592d = aVar2;
        this.f13593e = bigInteger;
        this.f13594f = aVar3;
        this.g = bArr;
        this.f13595h = cVar;
        this.i = obj;
        this.f13596j = bArr;
        this.f13597k = aVar4;
        this.f13598l = bigInteger2;
        this.f13599m = pVar;
        this.f13600n = eVar;
        f.a aVar5 = f.f11537d;
        int P = aa.b.P(g.S0(q.f8968a));
        LinkedHashMap linkedHashMap = new LinkedHashMap(P < 16 ? 16 : P);
        tc.p pVar2 = tc.p.f11564b;
        Map<String, qc.a<?, ?>> map = tc.p.f11563a.f11548c;
        e6.e.D(map, "<this>");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        linkedHashMap2.putAll(linkedHashMap);
        this.f13590b = new f(new h(linkedHashMap2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<tc.j$a>, java.util.ArrayList] */
    public static String a(b bVar) {
        j.a aVar;
        Object obj;
        if (bVar.f13589a.size() == 1) {
            aVar = (j.a) m.X0(bVar.f13589a);
        } else {
            bd.f P = y.c.P(bVar.f13591c.f7498b, "Utility");
            aVar = new j.a(P, y.c.o(P, "batch"), aa.b.Q(new md.f("calls", bVar.f13589a)));
        }
        f.c.a.b bVar2 = new f.c.a.b(aVar);
        Map<String, Object> b10 = bVar.b();
        BigInteger valueOf = BigInteger.valueOf((long) bVar.f13594f.f5934a);
        e6.e.C(valueOf, "BigInteger.valueOf(this.toLong())");
        BigInteger valueOf2 = BigInteger.valueOf((long) bVar.f13594f.f5935b);
        e6.e.C(valueOf2, "BigInteger.valueOf(this.toLong())");
        byte[] D0 = ad.c.D0(new a(bVar, bVar2, b10, x.u0(new md.f("CheckMortality", bVar.f13596j), new md.f("CheckGenesis", bVar.g), new md.f("CheckSpecVersion", valueOf), new md.f("CheckTxVersion", valueOf2))));
        if (D0.length > 256) {
            D0 = jc.c.f7149h.a(D0);
        }
        dc.f fVar = dc.f.f4442a;
        c cVar = bVar.f13595h;
        e6.e.C(D0, "messageToSign");
        fc.a aVar2 = bVar.f13592d;
        e6.e.D(cVar, "multiChainEncryption");
        e6.e.D(aVar2, "keypair");
        if (cVar instanceof c.a) {
            int i10 = dc.g.f4445a[cVar.f4429a.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    ff.a aVar3 = ff.b.f5111b.get("Ed25519".toLowerCase(Locale.ENGLISH));
                    e6.e.C(aVar3, "EdDSANamedCurveTable.get…NamedCurveTable.ED_25519)");
                    Signature instance = Signature.getInstance("NONEwithEdDSA", "EdDSA");
                    e6.e.C(instance, "Signature.getInstance(\n …r.PROVIDER_NAME\n        )");
                    instance.initSign(new cf.b(new ff.d(aVar2.b(), aVar3)));
                    instance.update(D0);
                    byte[] sign = instance.sign();
                    e6.e.C(sign, "sgr.sign()");
                    obj = new e.b(sign);
                } else if (i10 == 3) {
                    obj = fVar.a(D0, aVar2, f.a.SUBSTRATE.getHasher());
                } else {
                    throw new md.e();
                }
            } else if (aVar2 instanceof gc.e) {
                gc.e eVar = (gc.e) aVar2;
                byte[] sign2 = Sr25519.sign(eVar.f5354b, nd.d.J(eVar.f5353a, eVar.f5355c), D0);
                e6.e.C(sign2, "sign");
                obj = new e.c(sign2);
            } else {
                throw new IllegalArgumentException("Sr25519Keypair is needed to sign with SR25519".toString());
            }
            f.c cVar2 = new f.c(new f.d(bVar.i, bVar.f13600n.d(bVar.f13591c.f7497a, obj), bVar.b()), bVar2);
            tc.f fVar2 = bVar.f13590b;
            kc.a aVar4 = bVar.f13591c;
            e6.e.D(fVar2, "$this$toHex");
            e6.e.D(aVar4, SentryRuntime.TYPE);
            return jc.b.B(ad.c.A0(fVar2, aVar4, cVar2), true);
        }
        throw new md.e();
    }

    public final Map<String, Object> b() {
        Map u02 = x.u0(new md.f("CheckMortality", this.f13597k), new md.f("ChargeTransactionPayment", this.f13598l), new md.f("CheckNonce", this.f13593e));
        Map<d, Object> map = this.f13599m;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aa.b.P(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Objects.requireNonNull((d) entry.getKey());
            linkedHashMap.put((Object) null, entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(u02);
        linkedHashMap2.putAll(linkedHashMap);
        return linkedHashMap2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<tc.j$a>, java.util.ArrayList] */
    public final b c(Map map) {
        bd.f P = y.c.P(this.f13591c.f7498b, "Balances");
        this.f13589a.add(new j.a(P, y.c.o(P, "transfer"), map));
        return this;
    }
}
