package mf;

import a.b;
import androidx.lifecycle.i0;
import com.google.android.gms.common.internal.ImagesContract;
import e6.e;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import jf.c;
import nd.o;
import p002if.d;
import p002if.d0;
import p002if.n;
import p002if.r;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Proxy> f8666a;

    /* renamed from: b  reason: collision with root package name */
    public int f8667b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends InetSocketAddress> f8668c;

    /* renamed from: d  reason: collision with root package name */
    public final List<d0> f8669d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final p002if.a f8670e;

    /* renamed from: f  reason: collision with root package name */
    public final i0 f8671f;
    public final d g;

    /* renamed from: h  reason: collision with root package name */
    public final n f8672h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f8673a;

        /* renamed from: b  reason: collision with root package name */
        public final List<d0> f8674b;

        public a(List<d0> list) {
            this.f8674b = list;
        }

        public final boolean a() {
            return this.f8673a < this.f8674b.size();
        }

        public final d0 b() {
            if (a()) {
                List<d0> list = this.f8674b;
                int i = this.f8673a;
                this.f8673a = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public l(p002if.a aVar, i0 i0Var, d dVar, n nVar) {
        List<? extends Proxy> list;
        e.D(aVar, "address");
        e.D(i0Var, "routeDatabase");
        e.D(dVar, "call");
        e.D(nVar, "eventListener");
        this.f8670e = aVar;
        this.f8671f = i0Var;
        this.g = dVar;
        this.f8672h = nVar;
        o oVar = o.f8966a;
        this.f8666a = oVar;
        this.f8668c = oVar;
        r rVar = aVar.f6443a;
        Proxy proxy = aVar.f6450j;
        e.D(rVar, ImagesContract.URL);
        if (proxy != null) {
            list = b.n0(proxy);
        } else {
            URI h10 = rVar.h();
            if (h10.getHost() == null) {
                list = c.l(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = aVar.f6451k.select(h10);
                if (select == null || select.isEmpty()) {
                    list = c.l(Proxy.NO_PROXY);
                } else {
                    list = c.x(select);
                }
            }
        }
        this.f8666a = list;
        this.f8667b = 0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<if.d0>, java.util.ArrayList] */
    public final boolean a() {
        return b() || (this.f8669d.isEmpty() ^ true);
    }

    public final boolean b() {
        return this.f8667b < this.f8666a.size();
    }
}
