package io.nodle.cash.data.remote.api;

import ki.z;
import mi.a;
import mi.f;
import mi.k;
import mi.o;
import mi.t;
import mi.y;
import p002if.b0;
import pd.d;

public interface NotificationApi {
    @k({"Content-Type: application/json"})
    @f
    Object getCustomNotification(@y String str, @t("devkey") String str2, @t("language") String str3, @t("lat") double d10, @t("lon") double d11, d<? super z<b0>> dVar);

    @k({"Content-Type: application/json"})
    @o
    Object registerFCMToken(@y String str, @a p002if.z zVar, d<? super z<b0>> dVar);
}
