package za;

import ah.v;
import android.content.Context;
import c3.k;
import ge.d0;
import io.nodle.sdk.SdkMetricType;
import io.nodle.sdk.android.Nodle;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.i;
import xd.p;
import yd.t;

@rd.e(c = "io.nodle.cash.domain.helper.NodleHelper$computePacketRate$1", f = "NodleHelper.kt", l = {225}, m = "invokeSuspend")
public final class e extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public long f14201a;

    /* renamed from: b  reason: collision with root package name */
    public int f14202b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f14203c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Context f14204s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ t f14205t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ t f14206u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(t tVar, Context context, t tVar2, t tVar3, d<? super e> dVar) {
        super(2, dVar);
        this.f14203c = tVar;
        this.f14204s = context;
        this.f14205t = tVar2;
        this.f14206u = tVar3;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new e(this.f14203c, this.f14204s, this.f14205t, this.f14206u, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        long j10;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f14202b;
        if (i == 0) {
            b1.w(obj);
            j10 = 1000;
        } else if (i == 1) {
            j10 = this.f14201a;
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            d dVar = d.f14195a;
            if (!Nodle.Nodle().isStarted()) {
                return m.f8555a;
            }
            this.f14203c.f13621a = Nodle.Nodle().getMetric(SdkMetricType.BleScanCount);
            d.f14196b.k(new Long(this.f14203c.f13621a));
            if (Nodle.Nodle().isScanning()) {
                d.f14198d.k(new Long(this.f14203c.f13621a - this.f14205t.f13621a));
                t tVar = this.f14205t;
                t tVar2 = this.f14203c;
                tVar.f13621a = tVar2.f13621a;
                d dVar2 = d.f14195a;
                j10 += 100;
                if (j10 >= 1000) {
                    v.f0(this.f14204s, qa.e.PACKET_COUNT, new Long(tVar2.f13621a));
                    d.f14197c.k(new Long(Math.abs(this.f14203c.f13621a - this.f14206u.f13621a)));
                    this.f14206u.f13621a = this.f14203c.f13621a;
                    j10 = 0;
                }
            } else {
                v.f0(this.f14204s, qa.e.PACKET_COUNT, new Long(this.f14203c.f13621a));
                d.f14198d.k(new Long(0));
                d.f14197c.k(new Long(0));
            }
            d dVar3 = d.f14195a;
            this.f14201a = j10;
            this.f14202b = 1;
        } while (k.f0(100, this) != aVar);
        return aVar;
    }
}
