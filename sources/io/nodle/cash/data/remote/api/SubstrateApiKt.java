package io.nodle.cash.data.remote.api;

import e6.e;
import p002if.t;
import p002if.z;

public final class SubstrateApiKt {
    public static final z getAccountBalanceRequestBody(String str) {
        e.D(str, "key");
        t b10 = t.f6581f.b("application/json");
        z.a aVar = z.f6639a;
        return aVar.a("{\"id\":1, \"jsonrpc\": \"2.0\", \"method\": \"state_getStorage\", \"params\": [\"" + str + "\"]}", b10);
    }

    public static final z getGenesisHashRequestBody() {
        return z.f6639a.a("{\"id\":1, \"jsonrpc\": \"2.0\", \"method\": \"chain_getBlockHash\", \"params\": [0]}", t.f6581f.b("application/json"));
    }

    public static final z getMetadataRequestBody() {
        return z.f6639a.a("{\"id\":1, \"jsonrpc\": \"2.0\", \"method\": \"state_getMetadata\" }", t.f6581f.b("application/json"));
    }

    public static final z getNonceRequestBody(String str) {
        e.D(str, "pk");
        t b10 = t.f6581f.b("application/json");
        z.a aVar = z.f6639a;
        return aVar.a("{\"id\":1, \"jsonrpc\": \"2.0\", \"method\": \"system_accountNextIndex\", \"params\": [\"" + str + "\"]}", b10);
    }

    public static final z getPaymentQueryInfoRequestBody(String str) {
        e.D(str, "extrinsic");
        t b10 = t.f6581f.b("application/json");
        z.a aVar = z.f6639a;
        return aVar.a("{\"id\":1, \"jsonrpc\": \"2.0\", \"method\": \"payment_queryInfo\", \"params\": [\"" + str + "\"]}", b10);
    }

    public static final z getRuntimeVersionRequestBody() {
        return z.f6639a.a("{\"id\":1, \"jsonrpc\": \"2.0\", \"method\": \"state_getRuntimeVersion\" }", t.f6581f.b("application/json"));
    }

    public static final z getSubmitExtrinsicRequestBody(String str) {
        e.D(str, "extrinsic");
        t b10 = t.f6581f.b("application/json");
        z.a aVar = z.f6639a;
        return aVar.a("{\"id\":1, \"jsonrpc\": \"2.0\", \"method\": \"author_submitExtrinsic\", \"params\": [\"" + str + "\"]}", b10);
    }
}
