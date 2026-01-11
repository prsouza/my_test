package ya;

import a.b;
import android.content.Context;
import com.google.gson.Gson;
import java.util.List;
import nd.o;
import qa.f;
import qa.g;
import u2.e;
import ub.a;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final f f13570a;

    /* renamed from: b  reason: collision with root package name */
    public final Gson f13571b;

    /* renamed from: c  reason: collision with root package name */
    public a f13572c;

    /* renamed from: d  reason: collision with root package name */
    public List<? extends c> f13573d;

    public d(e eVar, f fVar, Gson gson) {
        List<? extends c> list;
        this.f13570a = fVar;
        this.f13571b = gson;
        if (((g) fVar).d(qa.e.APP_ANALYTICS) == 901) {
            list = b.o0(new a((Context) eVar.f11663a), new e());
        } else {
            list = o.f8966a;
        }
        this.f13573d = list;
    }

    public final void a(h hVar) {
        for (c a10 : this.f13573d) {
            a10.a(hVar);
        }
    }

    public final void b(f fVar) {
        for (c b10 : this.f13573d) {
            b10.b(fVar);
        }
    }

    public final void c() {
        this.f13572c = null;
    }

    public final void d(a aVar) {
        if (aVar != null) {
            f fVar = this.f13570a;
            qa.e eVar = qa.e.APP_METADATA;
            String json = this.f13571b.toJson((Object) aVar);
            e6.e.C(json, "gson.toJson(it)");
            fVar.a(eVar, json);
        }
        this.f13572c = aVar;
    }

    public final a getMetadata() {
        String a10;
        if (this.f13572c == null && (a10 = this.f13570a.c(qa.e.APP_METADATA)) != null) {
            this.f13572c = (a) this.f13571b.fromJson(a10, a.class);
        }
        return this.f13572c;
    }
}
