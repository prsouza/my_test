package io.nodle.cash.data.remote.api;

import ah.v;
import mi.a;
import mi.k;
import mi.o;
import mi.y;
import p002if.b0;
import p002if.z;
import pd.d;

public interface BlockExplorerApi {

    public static final class DefaultImpls {
        public static Object getStats$default(BlockExplorerApi blockExplorerApi, String str, z zVar, d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = v.K("blockexplorer_api_url");
                }
                return blockExplorerApi.getStats(str, zVar, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStats");
        }
    }

    @k({"Content-Type: application/json"})
    @o
    Object getBalance(@y String str, @a z zVar, d<? super ki.z<b0>> dVar);

    @k({"Content-Type: application/json"})
    @o
    Object getHistory(@y String str, @a z zVar, d<? super ki.z<b0>> dVar);

    @k({"Content-Type: application/json"})
    @o
    Object getStats(@y String str, @a z zVar, d<? super ki.z<b0>> dVar);
}
