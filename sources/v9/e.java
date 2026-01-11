package v9;

import a.b;
import c3.k;
import ge.d0;
import ge.g1;
import l6.b1;
import md.m;
import org.slf4j.Logger;
import pd.d;
import qd.a;
import rd.i;
import v9.a;
import xd.p;

@rd.e(c = "io.nodle.sdk.android.bluetooth.connect.BleGATTDevice$waitBleCallback$2", f = "BleGATTDevice.kt", l = {96}, m = "invokeSuspend")
public final class e extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12405a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f12406b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f12407c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ b f12408s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(long j10, b bVar, d<? super e> dVar) {
        super(2, dVar);
        this.f12407c = j10;
        this.f12408s = bVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        e eVar = new e(this.f12407c, this.f12408s, dVar);
        eVar.f12406b = obj;
        return eVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        e eVar = new e(this.f12407c, this.f12408s, (d) obj2);
        eVar.f12406b = (d0) obj;
        return eVar.invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f12405a;
        boolean z = true;
        if (i == 0) {
            b1.w(obj);
            d0 d0Var2 = (d0) this.f12406b;
            long j10 = this.f12407c;
            this.f12406b = d0Var2;
            this.f12405a = 1;
            if (k.f0(j10, this) == aVar) {
                return aVar;
            }
            d0Var = d0Var2;
        } else if (i == 1) {
            d0Var = (d0) this.f12406b;
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g1 g1Var = (g1) d0Var.f().get(g1.b.f5401a);
        if (g1Var != null) {
            z = g1Var.a();
        }
        if (z) {
            Logger logger = f.f12409a;
            StringBuilder q10 = b.q("device: ");
            q10.append(this.f12408s.f12370c.a());
            q10.append(" > timeout fired!");
            logger.debug(q10.toString());
            b bVar = this.f12408s;
            bVar.f12371d = a.e.f12363a;
            bVar.i = null;
        }
        return m.f8555a;
    }
}
