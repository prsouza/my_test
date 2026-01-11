package p1;

import android.view.View;
import java.util.ArrayList;

public final class e extends l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f9516a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f9517b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9518c = null;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ ArrayList f9519s = null;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f9520t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ArrayList f9521u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f9522v;

    public e(d dVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f9522v = dVar;
        this.f9516a = obj;
        this.f9517b = arrayList;
        this.f9520t = obj2;
        this.f9521u = arrayList2;
    }

    public final void a(i iVar) {
        iVar.z(this);
    }

    public final void e(i iVar) {
        Object obj = this.f9516a;
        if (obj != null) {
            this.f9522v.t(obj, this.f9517b, (ArrayList<View>) null);
        }
        Object obj2 = this.f9518c;
        if (obj2 != null) {
            this.f9522v.t(obj2, this.f9519s, (ArrayList<View>) null);
        }
        Object obj3 = this.f9520t;
        if (obj3 != null) {
            this.f9522v.t(obj3, this.f9521u, (ArrayList<View>) null);
        }
    }
}
