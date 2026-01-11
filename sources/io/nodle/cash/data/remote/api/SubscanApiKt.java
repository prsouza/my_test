package io.nodle.cash.data.remote.api;

import ah.v;
import android.content.Context;
import ge.g;
import ge.o0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import p002if.t;
import p002if.z;
import pd.d;
import qa.e;
import sa.b;

public final class SubscanApiKt {
    private static String nodlePk;
    private static List<String> rewardSources;

    private static final String getNodlePK(Context context) {
        String str = nodlePk;
        if (str == null || str.length() == 0) {
            nodlePk = v.J(context, e.NODLE_PUBLIC_KEY_4);
        }
        String str2 = nodlePk;
        e6.e.B(str2);
        return str2;
    }

    public static final String getNodlePk() {
        return nodlePk;
    }

    /* access modifiers changed from: private */
    public static final List<String> getRewardSourcePKs() {
        if (rewardSources == null) {
            JSONArray jSONArray = new JSONArray(v.K("reward_source_accounts"));
            rewardSources = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                List<String> list = rewardSources;
                Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ((ArrayList) list).add(jSONArray.getString(i));
            }
        }
        List<String> list2 = rewardSources;
        e6.e.B(list2);
        return list2;
    }

    public static final z getSubscanHistoryRequestBody(String str, int i, int i10) {
        e6.e.D(str, "address");
        t b10 = t.f6581f.b("application/json");
        z.a aVar = z.f6639a;
        return aVar.a("{\"address\":\"" + str + "\", \"row\": " + i + ", \"page\": " + i10 + " }", b10);
    }

    /* access modifiers changed from: private */
    public static final String handlePolkadotTestPK(Context context, String str) {
        return e6.e.r(str, "12ZDX4xDZ7We32GUVhPjaxaN4d2Ci2yb9LPDEU91uQCVJfyU") ? getNodlePK(context) : str;
    }

    public static final Object parseSubscanHistoryResponseBody(Context context, String str, d<? super List<b>> dVar) {
        return g.d(o0.f5433a, new SubscanApiKt$parseSubscanHistoryResponseBody$2(str, context, (d<? super SubscanApiKt$parseSubscanHistoryResponseBody$2>) null), dVar);
    }

    /* access modifiers changed from: private */
    public static final Object parseTransaction(Context context, JSONObject jSONObject, d<? super b> dVar) {
        return g.d(o0.f5433a, new SubscanApiKt$parseTransaction$2(context, jSONObject, (d<? super SubscanApiKt$parseTransaction$2>) null), dVar);
    }

    public static final void setNodlePk(String str) {
        nodlePk = str;
    }
}
