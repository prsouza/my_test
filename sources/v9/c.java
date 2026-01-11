package v9;

import a.b;
import ah.v;
import android.os.Build;
import c3.k;
import io.nodle.sdk.NodleContext;
import java.io.IOException;
import l6.b1;
import md.m;
import org.slf4j.Logger;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import v9.a;
import xd.l;

@e(c = "io.nodle.sdk.android.bluetooth.connect.BleGATTDevice$connect$2", f = "BleGATTDevice.kt", l = {133}, m = "invokeSuspend")
public final class c extends i implements l<d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12398a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f12399b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ NodleContext f12400c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar, NodleContext nodleContext, d<? super c> dVar) {
        super(1, dVar);
        this.f12399b = bVar;
        this.f12400c = nodleContext;
    }

    public final d<m> create(d<?> dVar) {
        return new c(this.f12399b, this.f12400c, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f12398a;
        if (i == 0) {
            b1.w(obj);
            Logger logger = f.f12409a;
            StringBuilder q10 = b.q("device: ");
            q10.append(this.f12399b.f12370c.a());
            q10.append(" > request connect ...");
            logger.debug(q10.toString());
            b bVar = this.f12399b;
            b.h(bVar, a.f.f12364a);
            a.b bVar2 = a.b.f12360a;
            if (!e6.e.r(bVar.f12371d, a.e.f12363a)) {
                bVar.f12371d = bVar2;
            }
            if (Build.VERSION.SDK_INT < 31 || v.C(k.n(this.f12400c), "android.permission.BLUETOOTH_CONNECT") == 0) {
                di.a aVar2 = this.f12399b.f12370c;
                e6.e.D(aVar2, "<this>");
                ((y9.c) aVar2).f13556a.connectGatt(k.n(this.f12400c), false, this.f12399b.f12375j);
            } else {
                logger.debug("failed to connect BLUETOOTH_CONNECT permission");
            }
            b bVar3 = this.f12399b;
            this.f12398a = 1;
            if (b.f(bVar3, 10000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.f12399b.f12372e != null) {
            return m.f8555a;
        }
        throw new IOException();
    }

    public final Object k(Object obj) {
        return new c(this.f12399b, this.f12400c, (d) obj).invokeSuspend(m.f8555a);
    }
}
