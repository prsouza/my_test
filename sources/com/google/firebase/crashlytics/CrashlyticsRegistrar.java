package com.google.firebase.crashlytics;

import java.util.Arrays;
import java.util.List;
import k7.d;
import s7.b;
import s7.f;
import s7.n;
import t7.g;
import u7.a;

public class CrashlyticsRegistrar implements f {
    public final List<b<?>> getComponents() {
        b.C0214b<g> a10 = b.a(g.class);
        a10.a(new n(d.class, 1, 0));
        a10.a(new n(s8.f.class, 1, 0));
        a10.a(new n(a.class, 0, 2));
        a10.a(new n(o7.a.class, 0, 2));
        a10.f10945e = new t7.d(this);
        a10.c();
        return Arrays.asList(new b[]{a10.b(), a9.f.a("fire-cls", "18.2.10")});
    }
}
