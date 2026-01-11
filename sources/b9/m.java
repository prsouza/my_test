package b9;

import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.List;
import s7.c;
import s7.e;

public final /* synthetic */ class m implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ m f2936a = new m();

    public static Object a(zzbl zzbl, int i, List list, int i10) {
        zzh.zzh(zzbl.name(), i, list);
        return list.get(i10);
    }

    public static String b(String str, int i) {
        return str + i;
    }

    public static StringBuilder c(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public Object f(c cVar) {
        return RemoteConfigRegistrar.lambda$getComponents$0(cVar);
    }
}
