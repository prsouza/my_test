package sg;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import xh.h;

public final class a extends BasicPermission {

    /* renamed from: a  reason: collision with root package name */
    public final String f11136a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11137b;

    public a(String str) {
        super("BC", str);
        this.f11136a = str;
        StringTokenizer stringTokenizer = new StringTokenizer(h.c(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            this.f11137b = i;
            return;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11137b == aVar.f11137b && getName().equals(aVar.getName());
    }

    public final String getActions() {
        return this.f11136a;
    }

    public final int hashCode() {
        return getName().hashCode() + this.f11137b;
    }

    public final boolean implies(Permission permission) {
        if (!(permission instanceof a) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = this.f11137b;
        int i10 = ((a) permission).f11137b;
        return (i & i10) == i10;
    }
}
