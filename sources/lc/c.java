package lc;

import com.google.gson.annotations.SerializedName;
import e6.e;
import java.util.List;
import java.util.Map;

public final class c {
    @SerializedName("runtime_id")
    private final Integer runtimeId;
    private final Map<String, Object> types;
    private final List<Object> versioning;

    public c(Integer num, Map<String, ? extends Object> map, List<Object> list) {
        e.D(map, "types");
        this.runtimeId = num;
        this.types = map;
        this.versioning = list;
    }

    public final Integer getRuntimeId() {
        return this.runtimeId;
    }

    public final Map<String, Object> getTypes() {
        return this.types;
    }

    public final List<Object> getVersioning() {
        return this.versioning;
    }
}
