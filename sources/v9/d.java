package v9;

import net.jpountz.lz4.LZ4FrameOutputStream;
import rd.c;
import rd.e;

@e(c = "io.nodle.sdk.android.bluetooth.connect.BleGATTDevice", f = "BleGATTDevice.kt", l = {106}, m = "waitBleCallback")
public final class d extends c {

    /* renamed from: a  reason: collision with root package name */
    public b f12401a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f12402b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f12403c;

    /* renamed from: s  reason: collision with root package name */
    public int f12404s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(b bVar, pd.d<? super d> dVar) {
        super(dVar);
        this.f12403c = bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f12402b = obj;
        this.f12404s |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        return b.f(this.f12403c, 0, this);
    }
}
