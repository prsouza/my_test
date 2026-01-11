package i3;

import com.bumptech.glide.load.data.d;
import g3.a;
import g3.f;
import i3.h;
import java.io.File;
import java.util.List;
import m3.o;

public final class e implements h, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f6028a;

    /* renamed from: b  reason: collision with root package name */
    public final i<?> f6029b;

    /* renamed from: c  reason: collision with root package name */
    public final h.a f6030c;

    /* renamed from: s  reason: collision with root package name */
    public int f6031s = -1;

    /* renamed from: t  reason: collision with root package name */
    public f f6032t;

    /* renamed from: u  reason: collision with root package name */
    public List<o<File, ?>> f6033u;

    /* renamed from: v  reason: collision with root package name */
    public int f6034v;

    /* renamed from: w  reason: collision with root package name */
    public volatile o.a<?> f6035w;

    /* renamed from: x  reason: collision with root package name */
    public File f6036x;

    public e(i<?> iVar, h.a aVar) {
        List<f> a10 = iVar.a();
        this.f6028a = a10;
        this.f6029b = iVar;
        this.f6030c = aVar;
    }

    public final boolean a() {
        while (true) {
            List<o<File, ?>> list = this.f6033u;
            if (list != null) {
                if (this.f6034v < list.size()) {
                    this.f6035w = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f6034v < this.f6033u.size())) {
                            break;
                        }
                        List<o<File, ?>> list2 = this.f6033u;
                        int i = this.f6034v;
                        this.f6034v = i + 1;
                        File file = this.f6036x;
                        i<?> iVar = this.f6029b;
                        this.f6035w = list2.get(i).a(file, iVar.f6046e, iVar.f6047f, iVar.i);
                        if (this.f6035w != null && this.f6029b.g(this.f6035w.f8428c.a())) {
                            this.f6035w.f8428c.f(this.f6029b.f6054o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i10 = this.f6031s + 1;
            this.f6031s = i10;
            if (i10 >= this.f6028a.size()) {
                return false;
            }
            f fVar = this.f6028a.get(this.f6031s);
            i<?> iVar2 = this.f6029b;
            File b10 = iVar2.b().b(new f(fVar, iVar2.f6053n));
            this.f6036x = b10;
            if (b10 != null) {
                this.f6032t = fVar;
                this.f6033u = this.f6029b.f6044c.f3517b.f(b10);
                this.f6034v = 0;
            }
        }
    }

    public final void c(Exception exc) {
        this.f6030c.e(this.f6032t, exc, this.f6035w.f8428c, a.DATA_DISK_CACHE);
    }

    public final void cancel() {
        o.a<?> aVar = this.f6035w;
        if (aVar != null) {
            aVar.f8428c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f6030c.i(this.f6032t, obj, this.f6035w.f8428c, a.DATA_DISK_CACHE, this.f6032t);
    }

    public e(List<f> list, i<?> iVar, h.a aVar) {
        this.f6028a = list;
        this.f6029b = iVar;
        this.f6030c = aVar;
    }
}
