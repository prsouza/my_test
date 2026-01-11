package io.nodle.cash.data.remote.api;

import android.util.Log;
import bb.g;
import ge.d0;
import java.util.ArrayList;
import l6.b1;
import md.m;
import org.json.JSONArray;
import org.json.JSONObject;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import sa.b;
import xd.p;

@e(c = "io.nodle.cash.data.remote.api.BlockExplorerApiKt$parseRewardsResponseBody$2", f = "BlockExplorerApi.kt", l = {114}, m = "invokeSuspend")
public final class BlockExplorerApiKt$parseRewardsResponseBody$2 extends i implements p<d0, d<? super ArrayList<b>>, Object> {
    public final /* synthetic */ String $bodyStr;
    public Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockExplorerApiKt$parseRewardsResponseBody$2(String str, d<? super BlockExplorerApiKt$parseRewardsResponseBody$2> dVar) {
        super(2, dVar);
        this.$bodyStr = str;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new BlockExplorerApiKt$parseRewardsResponseBody$2(this.$bodyStr, dVar);
    }

    public final Object invoke(d0 d0Var, d<? super ArrayList<b>> dVar) {
        return ((BlockExplorerApiKt$parseRewardsResponseBody$2) create(d0Var, dVar)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Exception e10;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b1.w(obj);
            ArrayList arrayList2 = new ArrayList();
            try {
                JSONObject optJSONObject2 = new JSONObject(this.$bodyStr).optJSONObject("data");
                if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("allocations")) == null || (optJSONArray = optJSONObject.optJSONArray("items")) == null) {
                    return arrayList2;
                }
                g gVar = g.REWARD;
                this.L$0 = arrayList2;
                this.label = 1;
                Object access$parseTransaction = BlockExplorerApiKt.parseTransaction(optJSONArray, arrayList2, gVar, this);
                if (access$parseTransaction == aVar) {
                    return aVar;
                }
                arrayList = arrayList2;
                obj = access$parseTransaction;
            } catch (Exception e11) {
                Exception exc = e11;
                arrayList = arrayList2;
                e10 = exc;
                Log.e("BlockExplorerApi", "Exception in parseRewardStatsResponseBody");
                e10.printStackTrace();
                return arrayList;
            }
        } else if (i == 1) {
            arrayList = (ArrayList) this.L$0;
            try {
                b1.w(obj);
            } catch (Exception e12) {
                e10 = e12;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m mVar = (m) obj;
        return arrayList;
    }
}
