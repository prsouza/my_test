package yd;

import e6.e;
import java.io.Serializable;

public abstract class h<R> implements e<R>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final int f13616a;

    public h(int i) {
        this.f13616a = i;
    }

    public final int getArity() {
        return this.f13616a;
    }

    public final String toString() {
        String a10 = v.f13623a.a(this);
        e.C(a10, "renderLambdaToString(this)");
        return a10;
    }
}
