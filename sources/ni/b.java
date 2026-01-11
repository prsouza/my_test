package ni;

import java.net.HttpURLConnection;
import java.util.List;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;

@e(c = "io.nodle.dtn.cla.http.ConvergenceSenderHTTP", f = "ConvergenceSenderHTTP.kt", l = {56}, m = "sendBundles$suspendImpl")
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f9156a;

    /* renamed from: b  reason: collision with root package name */
    public int f9157b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f9158c;

    /* renamed from: s  reason: collision with root package name */
    public HttpURLConnection f9159s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, d dVar) {
        super(dVar);
        this.f9158c = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f9156a = obj;
        this.f9157b |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        return a.e(this.f9158c, (List) null, this);
    }
}
