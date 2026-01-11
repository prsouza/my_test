package h1;

import android.content.Context;
import h1.e0;
import i1.a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import l1.b;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final b.c f5747a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f5748b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5749c;

    /* renamed from: d  reason: collision with root package name */
    public final e0.d f5750d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e0.b> f5751e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Object> f5752f;
    public final List<a> g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5753h;
    public final e0.c i;

    /* renamed from: j  reason: collision with root package name */
    public final Executor f5754j;

    /* renamed from: k  reason: collision with root package name */
    public final Executor f5755k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f5756l = false;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f5757m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f5758n;

    public m(Context context, String str, b.c cVar, e0.d dVar, List list, boolean z, e0.c cVar2, Executor executor, Executor executor2, boolean z10, boolean z11) {
        this.f5747a = cVar;
        this.f5748b = context;
        this.f5749c = str;
        this.f5750d = dVar;
        this.f5751e = list;
        this.f5753h = z;
        this.i = cVar2;
        this.f5754j = executor;
        this.f5755k = executor2;
        this.f5757m = z10;
        this.f5758n = z11;
        this.f5752f = Collections.emptyList();
        this.g = Collections.emptyList();
    }

    public final boolean a(int i10, int i11) {
        if ((i10 > i11) && this.f5758n) {
            return false;
        }
        if (this.f5757m) {
            return true;
        }
        return false;
    }
}
