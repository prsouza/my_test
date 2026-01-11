package s9;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import e6.e;
import md.m;
import xd.a;
import yd.h;

public final class d extends h implements a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f11027b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f11028c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i) {
        super(0);
        this.f11027b = i;
        this.f11028c = obj;
    }

    public final Object c() {
        switch (this.f11027b) {
            case 0:
                b.f11022a.debug(e.a0("ble-adv: invalid power mode ", Integer.valueOf(((ji.a) this.f11028c).f7261t)));
                return m.f8555a;
            case 1:
                return Integer.valueOf(((CellIdentityCdma) this.f11028c).getSystemId());
            default:
                return Integer.valueOf(((CellIdentityGsm) this.f11028c).getCid());
        }
    }
}
