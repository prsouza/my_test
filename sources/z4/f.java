package z4;

import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import q4.d;
import z4.c;

@AutoValue
public abstract class f {

    @AutoValue
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: z4.f$a$a  reason: collision with other inner class name */
        public static abstract class C0265a {
            public abstract a a();

            public abstract C0265a b(long j10);

            public abstract C0265a c();
        }

        public static C0265a a() {
            c.b bVar = new c.b();
            Set<b> emptySet = Collections.emptySet();
            Objects.requireNonNull(emptySet, "Null flags");
            bVar.f13801c = emptySet;
            return bVar;
        }

        public abstract long b();

        public abstract Set<b> c();

        public abstract long d();
    }

    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract c5.a a();

    public final long b(d dVar, long j10, int i) {
        long a10 = j10 - a().a();
        a aVar = c().get(dVar);
        long b10 = aVar.b();
        int i10 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i10) * ((double) b10) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((b10 > 1 ? b10 : 2) * ((long) i10))))), a10), aVar.d());
    }

    public abstract Map<d, a> c();
}
