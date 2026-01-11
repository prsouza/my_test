package vc;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.math.BigInteger;

public abstract class e extends f<BigInteger> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super(str);
        e6.e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
    }

    public final boolean e(Object obj) {
        return obj instanceof BigInteger;
    }
}
