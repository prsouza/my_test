package com.google.firebase.messaging;

import a9.g;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.List;
import k7.d;
import p8.j;
import q8.a;
import s7.b;
import s7.c;
import s7.f;
import s7.n;
import x8.s;

@KeepForSdk
@Keep
public class FirebaseMessagingRegistrar implements f {
    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(c cVar) {
        return new FirebaseMessaging((d) cVar.a(d.class), (a) cVar.a(a.class), cVar.d(g.class), cVar.d(j.class), (s8.f) cVar.a(s8.f.class), (q4.g) cVar.a(q4.g.class), (m8.d) cVar.a(m8.d.class));
    }

    @Keep
    public List<b<?>> getComponents() {
        b[] bVarArr = new b[2];
        b.C0214b<FirebaseMessaging> a10 = b.a(FirebaseMessaging.class);
        a10.a(new n(d.class, 1, 0));
        a10.a(new n(a.class, 0, 0));
        a10.a(new n(g.class, 0, 1));
        a10.a(new n(j.class, 0, 1));
        a10.a(new n(q4.g.class, 0, 0));
        a10.a(new n(s8.f.class, 1, 0));
        a10.a(new n(m8.d.class, 1, 0));
        a10.f10945e = s.f13127b;
        if (a10.f10943c == 0) {
            a10.f10943c = 1;
            bVarArr[0] = a10.b();
            bVarArr[1] = a9.f.a("fire-fcm", "23.0.4");
            return Arrays.asList(bVarArr);
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
