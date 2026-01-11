package c;

import aj.c;
import ge.d0;
import hf.f;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.UUID;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;
import xe.q;
import ze.b;

@e(c = "io.nodle.sdk.core.dtn.SdkAgent$syncWithStorage$2", f = "SdkAgent.kt", l = {}, m = "invokeSuspend")
public final class a extends i implements p<d0, d<? super Long>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f3042a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ si.a f3043b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(c cVar, si.a aVar, d<? super a> dVar) {
        super(2, dVar);
        this.f3042a = cVar;
        this.f3043b = aVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f3042a, this.f3043b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        return new a(this.f3042a, this.f3043b, (d) obj2).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        b1.w(obj);
        b b10 = ((f) this.f3042a.f3047b).b();
        si.a aVar2 = this.f3043b;
        e6.e.D(aVar2, "<this>");
        e6.e.D((hf.b) ((f) this.f3042a.f3047b).i.a(), "bundleEntryFactory");
        String e10 = jc.b.e(aVar2);
        xe.f fVar = aVar2.f11148a;
        e6.e.D(fVar, "$this$fragmentedID");
        q qVar = fVar.f13195a;
        e6.e.D(qVar, "$this$fragmentedID");
        String str = qVar.f13222e.toASCIIString() + qVar.g + qVar.f13224h;
        Charset charset = fe.a.f5086b;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        e6.e.C(bytes, "(this as java.lang.String).getBytes(charset)");
        String uuid = UUID.nameUUIDFromBytes(bytes).toString();
        e6.e.C(uuid, "UUID.nameUUIDFromBytes((…toByteArray()).toString()");
        String aSCIIString = aVar2.f11148a.f13195a.f13221d.toASCIIString();
        e6.e.C(aSCIIString, "desc.bundle.primaryBlock…stination.toASCIIString()");
        String aSCIIString2 = aVar2.f11148a.f13195a.f13222e.toASCIIString();
        e6.e.C(aSCIIString2, "desc.bundle.primaryBlock.source.toASCIIString()");
        q qVar2 = aVar2.f11148a.f13195a;
        return new Long(b10.f(new c(e10, uuid, aSCIIString, aSCIIString2, qVar2.f13225j, qVar2.f13226k, aVar2.f11150c, aVar2.f11151d, aVar2.f11149b, jc.b.l(aVar2), aVar2.f11148a)));
    }
}
