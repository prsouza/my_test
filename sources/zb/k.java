package zb;

import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.utils.Utils;

public enum k {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(h.f14304b),
    ENUM((String) null),
    MESSAGE((String) null);
    

    /* renamed from: a  reason: collision with root package name */
    public final Object f14335a;

    /* access modifiers changed from: public */
    k(Object obj) {
        this.f14335a = obj;
    }
}
