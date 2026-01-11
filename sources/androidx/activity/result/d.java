package androidx.activity.result;

import com.google.android.gms.measurement.internal.zzgi;
import com.google.firebase.abt.component.AbtRegistrar;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidDispatcherFactory;
import le.k;
import s7.c;
import s7.e;

public final /* synthetic */ class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ d f812a = new d();

    public static String a(Class cls, StringBuilder sb2) {
        sb2.append(cls.getName());
        return sb2.toString();
    }

    public static String b(String str, int i, String str2, int i10) {
        return str + i + str2 + i10;
    }

    public static String c(StringBuilder sb2, int i, String str) {
        sb2.append(i);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder d(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static /* synthetic */ Iterator e() {
        try {
            return Arrays.asList(new k[]{new AndroidDispatcherFactory()}).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static void g(zzgi zzgi, String str) {
        zzgi.zzaz().zzj().zza(str);
    }

    public static void h(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
    }

    public Object f(c cVar) {
        return AbtRegistrar.lambda$getComponents$0(cVar);
    }
}
