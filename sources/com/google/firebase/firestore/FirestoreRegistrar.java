package com.google.firebase.firestore;

import a9.g;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import k7.d;
import n8.a;
import p8.j;
import s7.b;
import s7.c;
import s7.f;
import s7.n;

@Keep
public class FirestoreRegistrar implements f {
    /* access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        Context context = (Context) cVar.a(Context.class);
        cVar.f(r7.a.class);
        cVar.f(q7.a.class);
        cVar.d(g.class);
        cVar.d(j.class);
        k7.f fVar = (k7.f) cVar.a(k7.f.class);
        return new a((d) cVar.a(d.class));
    }

    @Keep
    public List<b<?>> getComponents() {
        b.C0214b<a> a10 = b.a(a.class);
        a10.a(new n(d.class, 1, 0));
        a10.a(new n(Context.class, 1, 0));
        a10.a(new n(j.class, 0, 1));
        a10.a(new n(g.class, 0, 1));
        a10.a(new n(r7.a.class, 0, 2));
        a10.a(new n(q7.a.class, 0, 2));
        a10.a(new n(k7.f.class, 0, 0));
        a10.f10945e = n8.b.f8930a;
        return Arrays.asList(new b[]{a10.b(), a9.f.a("fire-fst", "24.1.2")});
    }
}
