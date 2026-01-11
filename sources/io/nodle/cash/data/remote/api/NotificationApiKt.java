package io.nodle.cash.data.remote.api;

import e6.e;
import p002if.t;
import p002if.z;

public final class NotificationApiKt {
    public static final z getFCMTokenRequestBody(String str) {
        e.D(str, "token");
        t b10 = t.f6581f.b("application/json");
        z.a aVar = z.f6639a;
        return aVar.a("{\"Token\":\"" + str + "\"}", b10);
    }
}
