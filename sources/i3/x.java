package i3;

import c4.i;
import com.bumptech.glide.load.data.d;
import g3.f;
import g3.l;
import i3.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m3.o;
import m3.q;
import s.a;

public final class x implements h, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final h.a f6159a;

    /* renamed from: b  reason: collision with root package name */
    public final i<?> f6160b;

    /* renamed from: c  reason: collision with root package name */
    public int f6161c;

    /* renamed from: s  reason: collision with root package name */
    public int f6162s = -1;

    /* renamed from: t  reason: collision with root package name */
    public f f6163t;

    /* renamed from: u  reason: collision with root package name */
    public List<o<File, ?>> f6164u;

    /* renamed from: v  reason: collision with root package name */
    public int f6165v;

    /* renamed from: w  reason: collision with root package name */
    public volatile o.a<?> f6166w;

    /* renamed from: x  reason: collision with root package name */
    public File f6167x;

    /* renamed from: y  reason: collision with root package name */
    public y f6168y;

    public x(i<?> iVar, h.a aVar) {
        this.f6160b = iVar;
        this.f6159a = aVar;
    }

    public final boolean a() {
        List list;
        List<Class<?>> d10;
        ArrayList arrayList = (ArrayList) this.f6160b.a();
        if (arrayList.isEmpty()) {
            return false;
        }
        i<?> iVar = this.f6160b;
        com.bumptech.glide.h hVar = iVar.f6044c.f3517b;
        Class<?> cls = iVar.f6045d.getClass();
        Class<?> cls2 = iVar.g;
        Class<Transcode> cls3 = iVar.f6050k;
        x3.d dVar = hVar.f3532h;
        i iVar2 = (i) ((AtomicReference) dVar.f12768a).getAndSet((Object) null);
        if (iVar2 == null) {
            iVar2 = new i(cls, cls2, cls3);
        } else {
            iVar2.a(cls, cls2, cls3);
        }
        synchronized (((a) dVar.f12769b)) {
            list = (List) ((a) dVar.f12769b).getOrDefault(iVar2, null);
        }
        ((AtomicReference) dVar.f12768a).set(iVar2);
        ArrayList arrayList2 = list;
        if (list == null) {
            ArrayList arrayList3 = new ArrayList();
            q qVar = hVar.f3526a;
            synchronized (qVar) {
                d10 = qVar.f8429a.d(cls);
            }
            Iterator it = ((ArrayList) d10).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hVar.f3528c.b((Class) it.next(), cls2)).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((ArrayList) hVar.f3531f.a(cls4, cls3)).isEmpty() && !arrayList3.contains(cls4)) {
                        arrayList3.add(cls4);
                    }
                }
            }
            x3.d dVar2 = hVar.f3532h;
            List unmodifiableList = Collections.unmodifiableList(arrayList3);
            synchronized (((a) dVar2.f12769b)) {
                ((a) dVar2.f12769b).put(new i(cls, cls2, cls3), unmodifiableList);
            }
            arrayList2 = arrayList3;
        }
        if (!arrayList2.isEmpty()) {
            while (true) {
                List<o<File, ?>> list2 = this.f6164u;
                if (list2 != null) {
                    if (this.f6165v < list2.size()) {
                        this.f6166w = null;
                        boolean z = false;
                        while (!z) {
                            if (!(this.f6165v < this.f6164u.size())) {
                                break;
                            }
                            List<o<File, ?>> list3 = this.f6164u;
                            int i = this.f6165v;
                            this.f6165v = i + 1;
                            File file = this.f6167x;
                            i<?> iVar3 = this.f6160b;
                            this.f6166w = list3.get(i).a(file, iVar3.f6046e, iVar3.f6047f, iVar3.i);
                            if (this.f6166w != null && this.f6160b.g(this.f6166w.f8428c.a())) {
                                this.f6166w.f8428c.f(this.f6160b.f6054o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                }
                int i10 = this.f6162s + 1;
                this.f6162s = i10;
                if (i10 >= arrayList2.size()) {
                    int i11 = this.f6161c + 1;
                    this.f6161c = i11;
                    if (i11 >= arrayList.size()) {
                        return false;
                    }
                    this.f6162s = 0;
                }
                f fVar = (f) arrayList.get(this.f6161c);
                Class cls5 = (Class) arrayList2.get(this.f6162s);
                l<Z> f10 = this.f6160b.f(cls5);
                i<?> iVar4 = this.f6160b;
                this.f6168y = new y(iVar4.f6044c.f3516a, fVar, iVar4.f6053n, iVar4.f6046e, iVar4.f6047f, f10, cls5, iVar4.i);
                File b10 = iVar4.b().b(this.f6168y);
                this.f6167x = b10;
                if (b10 != null) {
                    this.f6163t = fVar;
                    this.f6164u = this.f6160b.f6044c.f3517b.f(b10);
                    this.f6165v = 0;
                }
            }
        } else if (File.class.equals(this.f6160b.f6050k)) {
            return false;
        } else {
            StringBuilder d11 = a.a.d("Failed to find any load path from ");
            d11.append(this.f6160b.f6045d.getClass());
            d11.append(" to ");
            d11.append(this.f6160b.f6050k);
            throw new IllegalStateException(d11.toString());
        }
    }

    public final void c(Exception exc) {
        this.f6159a.e(this.f6168y, exc, this.f6166w.f8428c, g3.a.RESOURCE_DISK_CACHE);
    }

    public final void cancel() {
        o.a<?> aVar = this.f6166w;
        if (aVar != null) {
            aVar.f8428c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f6159a.i(this.f6163t, obj, this.f6166w.f8428c, g3.a.RESOURCE_DISK_CACHE, this.f6168y);
    }
}
