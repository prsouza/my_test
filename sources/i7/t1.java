package i7;

import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.utils.Utils;

public enum t1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(i.f6271b),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object defaultDefault;

    private t1(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
