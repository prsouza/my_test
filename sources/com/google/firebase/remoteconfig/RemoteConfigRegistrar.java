package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import b9.l;
import b9.m;
import java.util.Arrays;
import java.util.List;
import k7.d;
import m7.a;
import s7.b;
import s7.c;
import s7.f;
import s7.n;

@Keep
public class RemoteConfigRegistrar implements f {
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Map<java.lang.String, l7.c>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.Map<java.lang.String, l7.c>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.util.Map<java.lang.String, l7.c>, java.util.HashMap] */
    /* access modifiers changed from: private */
    public static l lambda$getComponents$0(c cVar) {
        l7.c cVar2;
        Context context = (Context) cVar.a(Context.class);
        d dVar = (d) cVar.a(d.class);
        s8.f fVar = (s8.f) cVar.a(s8.f.class);
        a aVar = (a) cVar.a(a.class);
        synchronized (aVar) {
            if (!aVar.f8507a.containsKey("frc")) {
                aVar.f8507a.put("frc", new l7.c(aVar.f8509c));
            }
            cVar2 = (l7.c) aVar.f8507a.get("frc");
        }
        return new l(context, dVar, fVar, cVar2, cVar.d(o7.a.class));
    }

    public List<b<?>> getComponents() {
        b.C0214b<l> a10 = b.a(l.class);
        a10.a(new n(Context.class, 1, 0));
        a10.a(new n(d.class, 1, 0));
        a10.a(new n(s8.f.class, 1, 0));
        a10.a(new n(a.class, 1, 0));
        a10.a(new n(o7.a.class, 0, 1));
        a10.f10945e = m.f2936a;
        a10.c();
        return Arrays.asList(new b[]{a10.b(), a9.f.a("fire-rc", "21.0.2")});
    }
}
