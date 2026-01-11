package c9;

import com.google.android.gms.common.util.BiConsumer;
import java.io.IOException;
import ki.d;
import ki.i;
import ki.z;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3298a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3299b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3300c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f3301s;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i) {
        this.f3298a = i;
        this.f3299b = obj;
        this.f3300c = obj2;
        this.f3301s = obj3;
    }

    public final void run() {
        switch (this.f3298a) {
            case 0:
                ((BiConsumer) this.f3299b).accept((String) this.f3300c, (f) this.f3301s);
                return;
            default:
                i.a.C0138a aVar = (i.a.C0138a) this.f3299b;
                d dVar = (d) this.f3300c;
                z zVar = (z) this.f3301s;
                if (i.a.this.f7603b.f()) {
                    dVar.a(i.a.this, new IOException("Canceled"));
                    return;
                } else {
                    dVar.b(i.a.this, zVar);
                    return;
                }
        }
    }
}
