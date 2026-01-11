package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class n0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1965a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1966b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1967c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1968s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1969t;

    public n0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1965a = i;
        this.f1966b = arrayList;
        this.f1967c = arrayList2;
        this.f1968s = arrayList3;
        this.f1969t = arrayList4;
    }

    public final void run() {
        for (int i = 0; i < this.f1965a; i++) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.i.v((View) this.f1966b.get(i), (String) this.f1967c.get(i));
            x.i.v((View) this.f1968s.get(i), (String) this.f1969t.get(i));
        }
    }
}
