package bd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.util.List;
import zc.o;
import zc.r;

public final class h implements r {

    /* renamed from: a  reason: collision with root package name */
    public final String f2986a;

    /* renamed from: b  reason: collision with root package name */
    public final i f2987b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f2988c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2989d;

    public h(String str, o oVar, i iVar, byte[] bArr, List<String> list, String str2) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(oVar, "modifier");
        e.D(bArr, "default");
        e.D(list, "documentation");
        e.D(str2, "moduleName");
        this.f2986a = str;
        this.f2987b = iVar;
        this.f2988c = list;
        this.f2989d = str2;
    }

    public final String getName() {
        return this.f2986a;
    }
}
