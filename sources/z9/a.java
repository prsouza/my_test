package z9;

import di.b;
import ge.d0;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.sdk.core.nvm.nasm.OpBleGattKt$BLE_CLOSE$1", f = "OpBleGatt.kt", l = {123}, m = "invokeSuspend")
public final class a extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14172a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f14173b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar, d<? super a> dVar) {
        super(2, dVar);
        this.f14173b = bVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f14173b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        return new a(this.f14173b, (d) obj2).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f14172a;
        if (i == 0) {
            b1.w(obj);
            b bVar = this.f14173b;
            this.f14172a = 1;
            if (bVar.b(this) == aVar) {
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
