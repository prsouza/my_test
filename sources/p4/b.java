package p4;

import h4.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import n4.a;
import n4.g;
import p4.c;
import p4.d;

public final class b extends c {
    public static final int B = d.a.collectDefaults();
    public static final int C = c.a.collectDefaults();
    public int A = C;
    public int z = B;

    public b() {
        super((android.support.v4.media.b) null);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.Map<java.lang.ref.SoftReference<n4.a>, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.Map<java.lang.ref.SoftReference<n4.a>, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    public final k4.b a(Object obj, boolean z10) {
        a aVar;
        SoftReference softReference;
        if (c.a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this.f5820b)) {
            SoftReference softReference2 = n4.b.f8904b.get();
            if (softReference2 == null) {
                aVar = null;
            } else {
                aVar = (a) softReference2.get();
            }
            if (aVar == null) {
                aVar = new a();
                g gVar = n4.b.f8903a;
                if (gVar != null) {
                    softReference = new SoftReference(aVar, gVar.f8921b);
                    gVar.f8920a.put(softReference, Boolean.TRUE);
                    while (true) {
                        SoftReference softReference3 = (SoftReference) gVar.f8921b.poll();
                        if (softReference3 == null) {
                            break;
                        }
                        gVar.f8920a.remove(softReference3);
                    }
                } else {
                    softReference = new SoftReference(aVar);
                }
                n4.b.f8904b.set(softReference);
            }
        } else {
            aVar = new a();
        }
        return new k4.b(aVar, obj, z10);
    }

    public final c b(OutputStream outputStream) throws IOException {
        k4.b a10 = a(outputStream, false);
        int i = this.f5822s;
        int i10 = this.A;
        c cVar = new c(a10, i, i10, this.f5823t, outputStream);
        if (c.a.WRITE_TYPE_HEADER.enabledIn(i10)) {
            cVar.p0(192, 55799);
        }
        return cVar;
    }

    public final d c(InputStream inputStream) throws IOException {
        return new e(a(inputStream, false), inputStream).a(this.f5820b, this.f5821c, this.z, this.f5823t, this.f5819a);
    }
}
