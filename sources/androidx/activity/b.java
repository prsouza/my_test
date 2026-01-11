package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import f.a;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f779a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.C0073a f780b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f781c;

    public b(ComponentActivity.b bVar, int i, a.C0073a aVar) {
        this.f781c = bVar;
        this.f779a = i;
        this.f780b = aVar;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$c<?>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final void run() {
        androidx.activity.result.b<O> bVar;
        ComponentActivity.b bVar2 = this.f781c;
        int i = this.f779a;
        T t10 = this.f780b.f4863a;
        String str = (String) bVar2.f788b.get(Integer.valueOf(i));
        if (str != null) {
            bVar2.f791e.remove(str);
            ActivityResultRegistry.c cVar = (ActivityResultRegistry.c) bVar2.f792f.get(str);
            if (cVar == null || (bVar = cVar.f806a) == null) {
                bVar2.f793h.remove(str);
                bVar2.g.put(str, t10);
                return;
            }
            bVar.a(t10);
        }
    }
}
