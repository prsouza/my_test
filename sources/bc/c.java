package bc;

import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.e;

@e(c = "io.nodle.sdk.location.LocationEngineStarted", f = "LocationSpi.kt", l = {49}, m = "waitForFix$suspendImpl")
public final class c extends rd.c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f2956a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f2957b;

    /* renamed from: c  reason: collision with root package name */
    public int f2958c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(e eVar, d<? super c> dVar) {
        super(dVar);
        this.f2957b = eVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f2956a = obj;
        this.f2958c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        return e.c(this.f2957b, 0, this);
    }
}
