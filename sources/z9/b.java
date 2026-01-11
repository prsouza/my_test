package z9;

import c3.k;
import ge.d0;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;
import yi.a;

@e(c = "io.nodle.sdk.core.nvm.nasm.OpBleGattKt$BLE_MTU$1", f = "OpBleGatt.kt", l = {42}, m = "invokeSuspend")
public final class b extends i implements p<d0, d<? super Long>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public a f14174a;

    /* renamed from: b  reason: collision with root package name */
    public int f14175b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f14176c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ di.b f14177s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f14178t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, di.b bVar, int i, d<? super b> dVar) {
        super(2, dVar);
        this.f14176c = aVar;
        this.f14177s = bVar;
        this.f14178t = i;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f14176c, this.f14177s, this.f14178t, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        return new b(this.f14176c, this.f14177s, this.f14178t, (d) obj2).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar;
        qd.a aVar2 = qd.a.COROUTINE_SUSPENDED;
        int i = this.f14175b;
        if (i == 0) {
            b1.w(obj);
            a aVar3 = this.f14176c;
            di.b bVar = this.f14177s;
            int i10 = this.f14178t;
            this.f14174a = aVar3;
            this.f14175b = 1;
            Object a10 = bVar.a(i10, this);
            if (a10 == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj = a10;
        } else if (i == 1) {
            aVar = this.f14174a;
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return new Long(k.m(aVar, (long) ((Number) obj).intValue()));
    }
}
