package l6;

import android.os.Bundle;
import c3.k;
import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class m extends j {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f7925c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(r rVar, t6.m mVar) {
        super(rVar, mVar);
        this.f7925c = rVar;
    }

    public final void d(List list) {
        this.f7903b.f8004d.c(this.f7902a);
        r.g.e("onGetSessionStates", new Object[0]);
        r rVar = this.f7925c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next();
            x0 x0Var = rVar.f8002b;
            y1 y1Var = rVar.f8003c;
            ArrayList arrayList2 = new ArrayList();
            k kVar = k.C;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
            HashMap hashMap = new HashMap();
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                hashMap.put(str, AssetPackState.i(bundle, str, x0Var, y1Var, kVar));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                hashMap.put(str2, AssetPackState.h(str2, 4, 0, 0, 0, Utils.DOUBLE_EPSILON, 1, BuildConfig.FLAVOR, BuildConfig.FLAVOR));
            }
            bundle.getLong("total_bytes_to_download");
            AssetPackState assetPackState = (AssetPackState) hashMap.values().iterator().next();
            if (assetPackState == null) {
                r.g.c("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            int d10 = assetPackState.d();
            boolean z = true;
            if (!(d10 == 1 || d10 == 7 || d10 == 2 || d10 == 3)) {
                z = false;
            }
            if (z) {
                arrayList.add(assetPackState.c());
            }
        }
        this.f7902a.b(arrayList);
    }
}
