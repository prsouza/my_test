package vi;

import b.e;
import b.l;
import b.m;
import bf.c;
import c.c;
import c3.r;
import ge.d0;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l6.b1;
import md.m;
import org.slf4j.Logger;
import pd.d;
import rd.e;
import rd.i;
import rg.b;
import w9.g;
import w9.h;
import w9.j;
import w9.k;
import wi.b;
import xd.p;
import xe.f;
import xe.q;
import yi.d;

public final class a {

    @e(c = "io.nodle.sdk.core.actions.iotee.ExecTxKt$execTx$1", f = "execTx.kt", l = {95}, m = "invokeSuspend")
    /* renamed from: vi.a$a  reason: collision with other inner class name */
    public static final class C0242a extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f12480a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ oi.a f12481b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f12482c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0242a(oi.a aVar, f fVar, d<? super C0242a> dVar) {
            super(2, dVar);
            this.f12481b = aVar;
            this.f12482c = fVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new C0242a(this.f12481b, this.f12482c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            d0 d0Var = (d0) obj;
            return new C0242a(this.f12481b, this.f12482c, (d) obj2).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f12480a;
            if (i == 0) {
                b1.w(obj);
                c cVar = this.f12481b.f9454e;
                f fVar = this.f12482c;
                this.f12480a = 1;
                if (cVar.f(fVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return m.f8555a;
        }
    }

    /* JADX WARNING: type inference failed for: r4v38, types: [java.util.HashMap, java.util.Map<java.lang.Integer, java.lang.Long>] */
    /* JADX WARNING: type inference failed for: r6v38, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, wi.d>] */
    public static final void a(oi.a aVar, b.i iVar, b bVar, di.b bVar2) {
        wi.a aVar2;
        int i;
        oi.a aVar3;
        URI uri;
        b bVar3 = bVar;
        e6.e.D(bVar3, "event");
        Logger logger = b.f12483a;
        byte[] B = a.b.B(iVar);
        c.a aVar4 = c.a.f3000b;
        logger.debug(e6.e.a0("iotee: executing tx ", nd.f.M(B, aVar4)));
        byte[] B2 = a.b.B(iVar);
        String M = nd.f.M(B2, aVar4);
        b.f r10 = iVar.r();
        Long c10 = ((hf.f) aVar.f9452c).a().c(M);
        long longValue = c10 == null ? 0 : c10.longValue();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[(r10.f2773s.size() + r10.r().u().f2819s)];
        Map<Integer, yi.c> a10 = yi.d.a();
        yi.d.b(a10, 144, new d.c(0, w9.c.f12614b));
        yi.d.b(a10, 145, new d.c(0, w9.d.f12615b));
        yi.d.b(a10, 146, new d.c(0, w9.e.f12616b));
        yi.d.b(a10, 147, new d.c(0, w9.f.f12617b));
        yi.d.b(a10, 128, new d.c(0, g.f12618b));
        yi.d.b(a10, 129, new d.c(0, h.f12619b));
        yi.d.b(a10, 148, new d.c(0, w9.i.f12620b));
        yi.d.b(a10, 161, new d.c(0, j.f12621b));
        yi.d.b(a10, 160, new d.c(0, k.f12622b));
        yi.d.b(a10, 108, new d.c(0, w9.b.f12613b));
        b.f fVar = r10;
        String str = " tank=";
        w9.a aVar5 = r1;
        String str2 = M;
        byte[] bArr2 = B2;
        w9.a aVar6 = new w9.a(longValue, bArr, byteArrayOutputStream, bVar2, aVar, a10);
        long j10 = aVar5.g;
        Logger logger2 = yi.b.f13676a;
        logger2.debug("~> ==========> executing event: " + bVar3 + " gas level=" + aVar5.g + " <==========");
        try {
            ad.c.k(aVar5, fVar);
            ? r42 = aVar5.f13670c;
            if (r42 != 0) {
                Long l10 = (Long) r42.get(Integer.valueOf(bVar3.f12705a));
                if (l10 != null) {
                    aVar5.f13671d = e6.e.j(aVar5, l10.longValue());
                    while (true) {
                        long j11 = aVar5.f13671d;
                        if (j11 < 0) {
                            aVar2 = wi.a.Nil;
                            break;
                        }
                        byte[] bArr3 = aVar5.f13674h;
                        aVar5.f13671d = 1 + j11;
                        byte b10 = bArr3[(int) j11] & 255;
                        Logger logger3 = yi.b.f13676a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("~> execution <");
                        Object obj = (wi.d) wi.e.f12717b.get(Integer.valueOf(b10));
                        if (obj == null) {
                            obj = "?";
                        }
                        sb2.append(obj);
                        sb2.append("> top=");
                        sb2.append(ad.c.g(aVar5));
                        logger3.debug(sb2.toString());
                        yi.c cVar = (yi.c) aVar5.f13673f.get(Integer.valueOf(b10));
                        if (cVar != null) {
                            cVar.a(aVar5);
                        } else {
                            throw y.c.m(b10);
                        }
                    }
                    Logger logger4 = yi.b.f13676a;
                    StringBuilder q10 = a.b.q("~> execution terminated: gas=");
                    q10.append(j10 - aVar5.g);
                    q10.append(str);
                    q10.append(aVar5.g);
                    logger4.debug(q10.toString());
                    if (aVar5.g <= 0 || aVar2 == wi.a.SelfDestruction) {
                        i = 0;
                        aVar3 = aVar;
                        String str3 = str2;
                        b.f12483a.debug(e6.e.a0("iotee: uninstalling sx ", str3));
                        ((hf.f) aVar3.f9452c).a().b(str3);
                    } else {
                        i = 0;
                        aVar3 = aVar;
                        String str4 = str2;
                        ((hf.f) aVar3.f9452c).a().f(str4, aVar5.g);
                        ((hf.f) aVar3.f9452c).a().g(str4, System.currentTimeMillis());
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    r a11 = aVar3.f9453d.a();
                    l.a aVar7 = (l.a) l.f2799v.c();
                    m.a aVar8 = (m.a) b.m.f2804w.c();
                    aVar8.k();
                    aVar8.f14359b.f2809v = longValue - aVar5.g;
                    int i10 = aVar2.f12701a;
                    aVar8.k();
                    aVar8.f14359b.f2807t = i10;
                    zb.h d10 = zb.h.d(byteArray);
                    aVar8.k();
                    b.m mVar = aVar8.f14359b;
                    Objects.requireNonNull(mVar);
                    mVar.f2808u = d10;
                    zb.h d11 = zb.h.d(bArr2);
                    aVar8.k();
                    b.m mVar2 = aVar8.f14359b;
                    Objects.requireNonNull(mVar2);
                    mVar2.f2806s = d11;
                    aVar7.k();
                    l lVar = aVar7.f14359b;
                    Objects.requireNonNull(lVar);
                    lVar.f2802t = (b.m) aVar8.i();
                    e.a aVar9 = (e.a) b.e.f2767u.c();
                    zb.h d12 = zb.h.d(c3.k.H(a11).getEncoded());
                    aVar9.k();
                    b.e eVar = aVar9.f14359b;
                    Objects.requireNonNull(eVar);
                    eVar.f2769s = d12;
                    qg.d s10 = c3.k.s(a11);
                    b.a aVar10 = new b.a();
                    aVar10.reset();
                    byte[] bArr4 = bArr2;
                    aVar10.write(bArr4, i, bArr4.length);
                    zb.h d13 = zb.h.d(aVar10.a(s10));
                    aVar9.k();
                    b.e eVar2 = aVar9.f14359b;
                    Objects.requireNonNull(eVar2);
                    eVar2.f2770t = d13;
                    aVar7.k();
                    l lVar2 = aVar7.f14359b;
                    Objects.requireNonNull(lVar2);
                    lVar2.f2803u = (b.e) aVar9.i();
                    l lVar3 = (l) aVar7.i();
                    long currentTimeMillis = System.currentTimeMillis();
                    URI h10 = aVar3.f9454e.h(c3.k.H(a11));
                    try {
                        URI create = URI.create((String) ((a9.c) aVar3.f9450a.getSdkConfig()).a("iotee.eid.tx-validated", "dtn://nodle.io/iotee/tx/validated"));
                        e6.e.C(create, "{\n        URI.create(ctx…lidated\", default))\n    }");
                        uri = create;
                    } catch (IllegalArgumentException unused) {
                        URI create2 = URI.create("dtn://nodle.io/iotee/tx/validated");
                        e6.e.C(create2, "{\n        URI.create(default)\n    }");
                        uri = create2;
                    }
                    f I = c3.k.I(new q(0, 0, (xe.i) null, uri, h10, jc.b.h(), currentTimeMillis, 0, 604800000, 1671));
                    xe.j i11 = aa.b.i(lVar3.e());
                    xe.i iVar2 = xe.i.NoCRC;
                    e6.e.D(iVar2, "type");
                    i11.f13211d = iVar2;
                    a.b.u(I, i11, true);
                    qg.d s11 = c3.k.s(a11);
                    Integer[] numArr = new Integer[2];
                    numArr[i] = Integer.valueOf(i);
                    numArr[1] = 1;
                    ad.c.j(I, s11, currentTimeMillis, a.b.o0(numArr));
                    ge.g.c(new C0242a(aVar3, I, (pd.d<? super C0242a>) null));
                    return;
                }
                throw y.c.a(bVar3.f12705a);
            }
            e6.e.c0("functions");
            throw null;
        } catch (wi.c e10) {
            Logger logger5 = yi.b.f13676a;
            logger5.debug("~> execution error: " + e10.getMessage());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("~> stack dump: ");
            List<Long> g1 = nd.m.g1(aVar5.f13672e);
            ArrayList arrayList = new ArrayList(nd.g.S0(g1));
            for (Long l11 : g1) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\n---| \t");
                e6.e.C(l11, "it");
                sb4.append(j2.a.b(l11.longValue()));
                sb4.append(9);
                arrayList.add(sb4.toString());
            }
            sb3.append(arrayList);
            logger5.debug(sb3.toString());
            aVar2 = e10.f12706a;
        } catch (Exception e11) {
            Logger logger6 = yi.b.f13676a;
            logger6.debug("~> execution error: " + e11.getMessage());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("~> stack dump: ");
            List<Long> g12 = nd.m.g1(aVar5.f13672e);
            ArrayList arrayList2 = new ArrayList(nd.g.S0(g12));
            for (Long l12 : g12) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("\n---| \t");
                e6.e.C(l12, "it");
                sb6.append(j2.a.b(l12.longValue()));
                sb6.append("it\t");
                arrayList2.add(sb6.toString());
            }
            sb5.append(arrayList2);
            logger6.debug(sb5.toString());
            aVar2 = wi.a.CatastrophicFailure;
        } catch (Throwable th2) {
            String str5 = str;
            Logger logger7 = yi.b.f13676a;
            StringBuilder q11 = a.b.q("~> execution terminated: gas=");
            q11.append(j10 - aVar5.g);
            q11.append(str5);
            q11.append(aVar5.g);
            logger7.debug(q11.toString());
            throw th2;
        }
    }
}
