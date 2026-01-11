package bd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.math.BigInteger;
import java.util.Map;
import zc.r;

public final class f implements r {

    /* renamed from: a  reason: collision with root package name */
    public final String f2979a;

    /* renamed from: b  reason: collision with root package name */
    public final g f2980b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, e> f2981c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, c> f2982d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, a> f2983e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, b> f2984f;
    public final BigInteger g;

    public f(String str, g gVar, Map<String, e> map, Map<String, c> map2, Map<String, a> map3, Map<String, b> map4, BigInteger bigInteger) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f2979a = str;
        this.f2980b = gVar;
        this.f2981c = map;
        this.f2982d = map2;
        this.f2983e = map3;
        this.f2984f = map4;
        this.g = bigInteger;
    }

    public final String getName() {
        return this.f2979a;
    }
}
