package a5;

import a8.a;
import com.github.mikephil.charting.BuildConfig;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81a;

    static {
        Long l10 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l11 = 604800000L;
        Integer num3 = 81920;
        String str = l10 == null ? " maxStorageSizeInBytes" : BuildConfig.FLAVOR;
        if (num == null) {
            str = a.c(str, " loadBatchSize");
        }
        if (num2 == null) {
            str = a.c(str, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            str = a.c(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = a.c(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f81a = new a(l10.longValue(), num.intValue(), num2.intValue(), l11.longValue(), num3.intValue());
            return;
        }
        throw new IllegalStateException(a.c("Missing required properties:", str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
