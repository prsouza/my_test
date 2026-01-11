package xh;

import java.security.PrivilegedAction;
import java.security.Security;

public final class e implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13292a;

    public e(String str) {
        this.f13292a = str;
    }

    public final Object run() {
        return Security.getProperty(this.f13292a);
    }
}
