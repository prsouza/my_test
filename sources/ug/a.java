package ug;

import java.security.PrivilegedAction;

public final class a implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12005a;

    public a(String str) {
        this.f12005a = str;
    }

    public final Object run() {
        try {
            return Class.forName(this.f12005a);
        } catch (Exception unused) {
            return null;
        }
    }
}
