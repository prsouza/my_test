package t4;

import android.content.Context;
import c5.a;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import q4.b;
import q4.g;
import t4.i;
import t4.q;
import y4.e;
import z4.o;
import z4.r;
import z4.s;

public final class v implements u {

    /* renamed from: e  reason: collision with root package name */
    public static volatile j f11394e;

    /* renamed from: a  reason: collision with root package name */
    public final a f11395a;

    /* renamed from: b  reason: collision with root package name */
    public final a f11396b;

    /* renamed from: c  reason: collision with root package name */
    public final e f11397c;

    /* renamed from: d  reason: collision with root package name */
    public final o f11398d;

    public v(a aVar, a aVar2, e eVar, o oVar, s sVar) {
        this.f11395a = aVar;
        this.f11396b = aVar2;
        this.f11397c = eVar;
        this.f11398d = oVar;
        sVar.f13845a.execute(new r(sVar));
    }

    public static v a() {
        j jVar = f11394e;
        if (jVar != null) {
            return jVar.B.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f11394e == null) {
            synchronized (v.class) {
                if (f11394e == null) {
                    Objects.requireNonNull(context);
                    Class<Context> cls = Context.class;
                    f11394e = new j(context);
                }
            }
        }
    }

    public final g c(k kVar) {
        Set<T> set;
        if (kVar instanceof k) {
            Objects.requireNonNull((r4.a) kVar);
            set = Collections.unmodifiableSet(r4.a.f10566d);
        } else {
            set = Collections.singleton(new b("proto"));
        }
        q.a a10 = q.a();
        Objects.requireNonNull(kVar);
        i.a aVar = (i.a) a10;
        aVar.f11366a = "cct";
        aVar.f11367b = ((r4.a) kVar).b();
        return new r(set, aVar.b(), this);
    }
}
