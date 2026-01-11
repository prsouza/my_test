package s9;

import android.telephony.CellIdentityCdma;
import md.m;
import xd.a;
import yd.h;

public final class e extends h implements a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f11029b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f11030c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, int i) {
        super(0);
        this.f11029b = i;
        this.f11030c = obj;
    }

    public final Object c() {
        switch (this.f11029b) {
            case 0:
                b.f11022a.debug(e6.e.a0("ble-adv: invalid manufacturer id ", Integer.valueOf(((ji.a) this.f11030c).f7264w)));
                return m.f8555a;
            default:
                return Integer.valueOf(((CellIdentityCdma) this.f11030c).getNetworkId());
        }
    }
}
