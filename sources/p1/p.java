package p1;

import a.a;
import android.view.View;
import b9.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f9555a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f9556b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<i> f9557c = new ArrayList<>();

    @Deprecated
    public p() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f9556b == pVar.f9556b && this.f9555a.equals(pVar.f9555a);
    }

    public final int hashCode() {
        return this.f9555a.hashCode() + (this.f9556b.hashCode() * 31);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final String toString() {
        StringBuilder d10 = a.d("TransitionValues@");
        d10.append(Integer.toHexString(hashCode()));
        d10.append(":\n");
        StringBuilder c10 = m.c(d10.toString(), "    view = ");
        c10.append(this.f9556b);
        c10.append("\n");
        String c11 = a8.a.c(c10.toString(), "    values:");
        for (String str : this.f9555a.keySet()) {
            c11 = c11 + "    " + str + ": " + this.f9555a.get(str) + "\n";
        }
        return c11;
    }

    public p(View view) {
        this.f9556b = view;
    }
}
