package s9;

import android.telephony.CellSignalStrengthLte;
import e6.e;
import md.m;
import xd.a;
import yd.h;

public final class c extends h implements a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f11025b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f11026c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i) {
        super(0);
        this.f11025b = i;
        this.f11026c = obj;
    }

    public final Object c() {
        switch (this.f11025b) {
            case 0:
                b.f11022a.debug(e.a0("ble-adv: invalid advertising mode ", Integer.valueOf(((ji.a) this.f11026c).f7262u)));
                return m.f8555a;
            default:
                return Integer.valueOf(((CellSignalStrengthLte) this.f11026c).getDbm());
        }
    }
}
