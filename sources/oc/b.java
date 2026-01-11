package oc;

import ah.v;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.util.Map;
import qc.d;
import xd.l;
import yd.h;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, d> f9414a;

    /* renamed from: b  reason: collision with root package name */
    public final mc.b f9415b;

    public static final class a extends h implements l<String, d> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f9416b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(1);
            this.f9416b = bVar;
        }

        public final Object k(Object obj) {
            String str = (String) obj;
            e.D(str, "it");
            d b10 = this.f9416b.b(str);
            return b10 != null ? b10 : new d((qc.a<?, ?>) null);
        }
    }

    public b(Map<String, d> map, mc.b bVar) {
        e.D(map, "types");
        this.f9414a = map;
        this.f9415b = bVar;
    }

    public final qc.a<?, ?> a(String str) {
        e.D(str, "definition");
        d b10 = b(str);
        if (b10 != null) {
            return b10.f10406b;
        }
        return null;
    }

    public final d b(String str) {
        pc.a aVar = pc.a.f9872b;
        e.D(str, "definition");
        String b10 = pc.a.f9871a.b(str, BuildConfig.FLAVOR);
        d dVar = this.f9414a.get(str);
        if (dVar == null) {
            dVar = this.f9414a.get(b10);
        }
        if (dVar == null && ((dVar = c(b10)) == null || !dVar.a())) {
            dVar = null;
        }
        if (dVar == null) {
            dVar = c(str);
        }
        if (dVar != null) {
            return v.p0(dVar);
        }
        return null;
    }

    public final d c(String str) {
        qc.a<?, ?> a10 = this.f9415b.a(str, str, new a(this));
        if (a10 != null) {
            return new d(a10);
        }
        return null;
    }
}
