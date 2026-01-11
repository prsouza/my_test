package xh;

import java.security.PrivilegedAction;

public final class f implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13293a;

    public f(String str) {
        this.f13293a = str;
    }

    public final Object run() {
        return System.getProperty(this.f13293a);
    }
}
