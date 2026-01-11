package androidx.lifecycle;

import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;

@e(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {236}, m = "clearSource$lifecycle_livedata_ktx_release")
public final class i extends c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f2121a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h<Object> f2122b;

    /* renamed from: c  reason: collision with root package name */
    public int f2123c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(h<Object> hVar, d<? super i> dVar) {
        super(dVar);
        this.f2122b = hVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f2121a = obj;
        this.f2123c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        this.f2122b.l(this);
        return m.f8555a;
    }
}
