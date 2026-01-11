package l6;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import o6.f;
import o6.f0;
import t6.m;

public final class c extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f7796b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f7797c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ r f7798s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(r rVar, m mVar, List list, m mVar2) {
        super(mVar);
        this.f7798s = rVar;
        this.f7796b = list;
        this.f7797c = mVar2;
    }

    public final void a() {
        List<String> list = this.f7796b;
        ArrayList arrayList = new ArrayList(list.size());
        for (String putString : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", putString);
            arrayList.add(bundle);
        }
        try {
            r rVar = this.f7798s;
            ((f0) rVar.f8004d.f9344n).h(rVar.f8001a, arrayList, r.g(), new k(this.f7798s, this.f7797c));
        } catch (RemoteException e10) {
            r.g.d(e10, "cancelDownloads(%s)", this.f7796b);
        }
    }
}
