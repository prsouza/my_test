package com.google.firebase.installations;

import ah.v;
import androidx.annotation.Keep;
import androidx.fragment.app.o;
import java.util.Arrays;
import java.util.List;
import k7.d;
import p8.h;
import p8.i;
import s7.a;
import s7.b;
import s7.c;
import s7.f;
import s7.n;
import s8.e;

@Keep
public class FirebaseInstallationsRegistrar implements f {
    /* access modifiers changed from: private */
    public static /* synthetic */ s8.f lambda$getComponents$0(c cVar) {
        return new e((d) cVar.a(d.class), cVar.d(i.class));
    }

    public List<b<?>> getComponents() {
        b.C0214b<s8.f> a10 = b.a(s8.f.class);
        a10.a(new n(d.class, 1, 0));
        a10.a(new n(i.class, 0, 1));
        a10.f10945e = o.f1970a;
        v vVar = new v();
        b.C0214b<h> a11 = b.a(h.class);
        a11.f10944d = 1;
        a11.f10945e = new a(vVar);
        return Arrays.asList(new b[]{a10.b(), a11.b(), a9.f.a("fire-installations", "17.0.1")});
    }
}
