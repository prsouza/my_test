package androidx.fragment.app;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import ge.a0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;
import nh.d;
import s7.c;
import s7.e;
import t4.v;

public final /* synthetic */ class m implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ m f1957a = new m();

    public static int a(String str, int i, int i10) {
        return (str.hashCode() + i) * i10;
    }

    public static IObjectWrapper b(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static String c(String str, Object obj) {
        return str + obj;
    }

    public static /* synthetic */ Iterator d() {
        try {
            return Arrays.asList(new a0[]{new AndroidExceptionPreHandler()}).iterator();
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static void e(int i, String str, HashMap hashMap, String str2) {
        hashMap.put(str2, new d(i, str));
    }

    public static void g(String str, String str2, String str3) {
        Log.d(str3, str + str2);
    }

    public Object f(c cVar) {
        return v.b((Context) cVar.a(Context.class));
    }
}
