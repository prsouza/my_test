package com.google.firebase.abt.component;

import android.content.Context;
import androidx.activity.result.d;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import m7.a;
import s7.b;
import s7.c;
import s7.f;
import s7.n;

@Keep
public class AbtRegistrar implements f {
    /* access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.a(Context.class), cVar.d(o7.a.class));
    }

    public List<b<?>> getComponents() {
        b.C0214b<a> a10 = b.a(a.class);
        a10.a(new n(Context.class, 1, 0));
        a10.a(new n(o7.a.class, 0, 1));
        a10.f10945e = d.f812a;
        return Arrays.asList(new b[]{a10.b(), a9.f.a("fire-abt", "21.0.1")});
    }
}
