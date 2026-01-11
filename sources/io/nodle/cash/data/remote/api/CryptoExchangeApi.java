package io.nodle.cash.data.remote.api;

import ah.v;
import ki.z;
import mi.f;
import mi.k;
import mi.t;
import mi.y;
import p002if.b0;
import pd.d;

public interface CryptoExchangeApi {
    public static final String API_KEY = "6882baea-6122-4a0d-8c23-b96176044836";
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String API_KEY = "6882baea-6122-4a0d-8c23-b96176044836";
        private static final int NODLE_ID = Integer.parseInt(v.K("crypto_exchange_token_id"));

        private Companion() {
        }

        public final int getNODLE_ID() {
            return NODLE_ID;
        }
    }

    public static final class DefaultImpls {
        public static /* synthetic */ Object getPrice$default(CryptoExchangeApi cryptoExchangeApi, String str, int i, d dVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    i = CryptoExchangeApi.Companion.getNODLE_ID();
                }
                return cryptoExchangeApi.getPrice(str, i, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrice");
        }
    }

    @k({"Accept: application/json", "X-CMC_PRO_API_KEY: 6882baea-6122-4a0d-8c23-b96176044836"})
    @f
    Object getPrice(@y String str, @t("id") int i, d<? super z<b0>> dVar);
}
