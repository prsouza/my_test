package io.nodle.cash.data.remote.api;

import mi.a;
import mi.k;
import mi.o;
import mi.y;
import p002if.b0;
import p002if.z;
import pd.d;

public interface SubstrateApi {
    @k({"Content-Type: application/json"})
    @o
    Object requestSubstrate(@y String str, @a z zVar, d<? super ki.z<b0>> dVar);
}
