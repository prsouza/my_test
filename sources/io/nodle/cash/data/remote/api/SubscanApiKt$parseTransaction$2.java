package io.nodle.cash.data.remote.api;

import android.content.Context;
import bb.g;
import ge.d0;
import java.math.BigDecimal;
import java.math.BigInteger;
import l6.b1;
import md.m;
import org.json.JSONObject;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import sa.b;
import xd.p;
import za.h;

@e(c = "io.nodle.cash.data.remote.api.SubscanApiKt$parseTransaction$2", f = "SubscanApi.kt", l = {}, m = "invokeSuspend")
public final class SubscanApiKt$parseTransaction$2 extends i implements p<d0, d<? super b>, Object> {
    public final /* synthetic */ Context $cxt;
    public final /* synthetic */ JSONObject $joItem;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubscanApiKt$parseTransaction$2(Context context, JSONObject jSONObject, d<? super SubscanApiKt$parseTransaction$2> dVar) {
        super(2, dVar);
        this.$cxt = context;
        this.$joItem = jSONObject;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new SubscanApiKt$parseTransaction$2(this.$cxt, this.$joItem, dVar);
    }

    public final Object invoke(d0 d0Var, d<? super b> dVar) {
        return ((SubscanApiKt$parseTransaction$2) create(d0Var, dVar)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        g gVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b1.w(obj);
            Context context = this.$cxt;
            String optString = this.$joItem.optString("from");
            e6.e.C(optString, "joItem.optString(\"from\")");
            String access$handlePolkadotTestPK = SubscanApiKt.handlePolkadotTestPK(context, optString);
            boolean z = true;
            String str = null;
            String e10 = access$handlePolkadotTestPK.length() > 0 ? h.f14215a.e(access$handlePolkadotTestPK) : null;
            Context context2 = this.$cxt;
            String optString2 = this.$joItem.optString("to");
            e6.e.C(optString2, "joItem.optString(\"to\")");
            String access$handlePolkadotTestPK2 = SubscanApiKt.handlePolkadotTestPK(context2, optString2);
            if (access$handlePolkadotTestPK2.length() <= 0) {
                z = false;
            }
            if (z) {
                str = h.f14215a.e(access$handlePolkadotTestPK2);
            }
            String str2 = str;
            if (nd.m.V0(SubscanApiKt.getRewardSourcePKs(), e10)) {
                gVar = g.REWARD;
            } else {
                gVar = g.TRANSFER;
            }
            String optString3 = this.$joItem.optString("amount");
            e6.e.C(optString3, "joItem.optString(\"amount\")");
            BigDecimal bigDecimal = new BigDecimal(optString3);
            BigDecimal pow = BigDecimal.TEN.pow(11);
            e6.e.C(pow, "TEN.pow(AMOUNT_MAX_DECIMALS)");
            BigDecimal multiply = bigDecimal.multiply(pow);
            e6.e.C(multiply, "this.multiply(other)");
            BigInteger bigInteger = multiply.toBigInteger();
            e6.e.C(bigInteger, "nodl.toBigDecimal() * Bi…DECIMALS)).toBigInteger()");
            String optString4 = this.$joItem.optString("fee");
            e6.e.C(optString4, "joItem.optString(\"fee\")");
            BigInteger bigInteger2 = new BigInteger(optString4);
            long optLong = this.$joItem.optLong("block_num");
            String optString5 = this.$joItem.optString("extrinsic_index");
            String optString6 = this.$joItem.optString("hash");
            e6.e.C(optString6, "joItem.optString(\"hash\")");
            return new b(e10, str2, bigInteger, bigInteger2, (String) null, (String) null, optLong, optString5, optString6, this.$joItem.optLong("block_timestamp") * ((long) 1000), gVar, false);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
