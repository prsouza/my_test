package z9;

import c3.k;
import di.b;
import ge.d0;
import java.util.UUID;
import l6.b1;
import md.m;
import rd.e;
import rd.i;
import xd.p;
import yi.a;

@e(c = "io.nodle.sdk.core.nvm.nasm.OpBleGattKt$BLE_WRITE$1", f = "OpBleGatt.kt", l = {112}, m = "invokeSuspend")
public final class d extends i implements p<d0, pd.d<? super Long>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14185a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f14186b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ UUID f14187c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ UUID f14188s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ byte[] f14189t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f14190u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(b bVar, UUID uuid, UUID uuid2, byte[] bArr, a aVar, pd.d<? super d> dVar) {
        super(2, dVar);
        this.f14186b = bVar;
        this.f14187c = uuid;
        this.f14188s = uuid2;
        this.f14189t = bArr;
        this.f14190u = aVar;
    }

    public final pd.d<m> create(Object obj, pd.d<?> dVar) {
        return new d(this.f14186b, this.f14187c, this.f14188s, this.f14189t, this.f14190u, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f14185a;
        if (i == 0) {
            b1.w(obj);
            b bVar = this.f14186b;
            UUID uuid = this.f14187c;
            e6.e.C(uuid, "service");
            UUID uuid2 = this.f14188s;
            e6.e.C(uuid2, "characteristic");
            byte[] bArr = this.f14189t;
            this.f14185a = 1;
            if (bVar.c(uuid, uuid2, bArr, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return new Long(k.m(this.f14190u, (long) this.f14189t.length));
    }
}
