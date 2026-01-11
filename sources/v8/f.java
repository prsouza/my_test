package v8;

import com.google.auto.value.AutoValue;
import v8.b;

@AutoValue
public abstract class f {

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(long j10);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        b.a aVar = new b.a();
        aVar.b(0);
        return aVar;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
