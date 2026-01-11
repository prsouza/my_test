package androidx.fragment.app;

import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import s7.c;
import s7.e;

public final /* synthetic */ class o implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ o f1970a = new o();

    public static int a(int i, int i10, int i11, int i12) {
        return ((i * i10) / i11) + i12;
    }

    public static String b(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String c(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public Object f(c cVar) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
    }
}
