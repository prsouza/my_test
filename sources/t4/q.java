package t4;

import android.util.Base64;
import com.github.mikephil.charting.BuildConfig;
import com.google.auto.value.AutoValue;
import q4.d;
import t4.i;

@AutoValue
public abstract class q {

    @AutoValue.Builder
    public static abstract class a {
        public abstract a a(String str);
    }

    public static a a() {
        i.a aVar = new i.a();
        aVar.c(d.DEFAULT);
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract d d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? BuildConfig.FLAVOR : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
