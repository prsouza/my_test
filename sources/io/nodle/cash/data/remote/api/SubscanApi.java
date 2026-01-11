package io.nodle.cash.data.remote.api;

import io.nodle.cash.data.remote.api.request.SubscanTransfersRequest;
import io.nodle.cash.data.remote.api.response.SubscanTransfersResponse;
import mi.a;
import mi.k;
import mi.o;
import mi.y;
import p002if.b0;
import p002if.z;
import pd.d;

public interface SubscanApi {
    @k({"Content-Type: application/json"})
    @o
    Object getHistory(@y String str, @a z zVar, d<? super ki.z<b0>> dVar);

    @k({"Content-Type: application/json"})
    @o
    Object getTransfers(@y String str, @a SubscanTransfersRequest subscanTransfersRequest, d<? super SubscanTransfersResponse> dVar);
}
