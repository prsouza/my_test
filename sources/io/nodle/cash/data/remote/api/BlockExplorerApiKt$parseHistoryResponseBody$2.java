package io.nodle.cash.data.remote.api;

import ge.d0;
import java.util.ArrayList;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import sa.b;
import xd.p;

@e(c = "io.nodle.cash.data.remote.api.BlockExplorerApiKt$parseHistoryResponseBody$2", f = "BlockExplorerApi.kt", l = {90, 91, 92}, m = "invokeSuspend")
public final class BlockExplorerApiKt$parseHistoryResponseBody$2 extends i implements p<d0, d<? super ArrayList<b>>, Object> {
    public final /* synthetic */ String $bodyStr;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockExplorerApiKt$parseHistoryResponseBody$2(String str, d<? super BlockExplorerApiKt$parseHistoryResponseBody$2> dVar) {
        super(2, dVar);
        this.$bodyStr = str;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new BlockExplorerApiKt$parseHistoryResponseBody$2(this.$bodyStr, dVar);
    }

    public final Object invoke(d0 d0Var, d<? super ArrayList<b>> dVar) {
        return ((BlockExplorerApiKt$parseHistoryResponseBody$2) create(d0Var, dVar)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081 A[Catch:{ Exception -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086 A[Catch:{ Exception -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095 A[Catch:{ Exception -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009a A[Catch:{ Exception -> 0x00d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r0 = "data"
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r12.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004e
            if (r2 == r5) goto L_0x0037
            if (r2 == r4) goto L_0x0026
            if (r2 != r3) goto L_0x001e
            java.lang.Object r0 = r12.L$0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            l6.b1.w(r13)     // Catch:{ Exception -> 0x001b }
            goto L_0x00e2
        L_0x001b:
            r13 = move-exception
            goto L_0x00d8
        L_0x001e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0026:
            java.lang.Object r0 = r12.L$1
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            java.lang.Object r2 = r12.L$0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            l6.b1.w(r13)     // Catch:{ Exception -> 0x0033 }
            goto L_0x00c3
        L_0x0033:
            r13 = move-exception
            r0 = r2
            goto L_0x00d8
        L_0x0037:
            java.lang.Object r0 = r12.L$2
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            java.lang.Object r2 = r12.L$1
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            java.lang.Object r5 = r12.L$0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            l6.b1.w(r13)     // Catch:{ Exception -> 0x004a }
            r13 = r0
            r0 = r5
            goto L_0x00b0
        L_0x004a:
            r13 = move-exception
            r0 = r5
            goto L_0x00d8
        L_0x004e:
            l6.b1.w(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r7 = r12.$bodyStr     // Catch:{ Exception -> 0x00d4 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x00d4 }
            org.json.JSONObject r7 = r2.optJSONObject(r0)     // Catch:{ Exception -> 0x00d4 }
            java.lang.String r8 = "items"
            if (r7 == 0) goto L_0x0072
            java.lang.String r9 = "allocations"
            org.json.JSONObject r7 = r7.optJSONObject(r9)     // Catch:{ Exception -> 0x00d4 }
            if (r7 == 0) goto L_0x0072
            org.json.JSONArray r7 = r7.optJSONArray(r8)     // Catch:{ Exception -> 0x00d4 }
            goto L_0x0073
        L_0x0072:
            r7 = r6
        L_0x0073:
            org.json.JSONObject r9 = r2.optJSONObject(r0)     // Catch:{ Exception -> 0x00d4 }
            if (r9 == 0) goto L_0x0086
            java.lang.String r10 = "transfersFrom"
            org.json.JSONObject r9 = r9.optJSONObject(r10)     // Catch:{ Exception -> 0x00d4 }
            if (r9 == 0) goto L_0x0086
            org.json.JSONArray r9 = r9.optJSONArray(r8)     // Catch:{ Exception -> 0x00d4 }
            goto L_0x0087
        L_0x0086:
            r9 = r6
        L_0x0087:
            org.json.JSONObject r0 = r2.optJSONObject(r0)     // Catch:{ Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x009a
            java.lang.String r2 = "transfersTo"
            org.json.JSONObject r0 = r0.optJSONObject(r2)     // Catch:{ Exception -> 0x00d4 }
            if (r0 == 0) goto L_0x009a
            org.json.JSONArray r0 = r0.optJSONArray(r8)     // Catch:{ Exception -> 0x00d4 }
            goto L_0x009b
        L_0x009a:
            r0 = r6
        L_0x009b:
            bb.g r2 = bb.g.REWARD     // Catch:{ Exception -> 0x00d4 }
            r12.L$0 = r13     // Catch:{ Exception -> 0x00d4 }
            r12.L$1 = r9     // Catch:{ Exception -> 0x00d4 }
            r12.L$2 = r0     // Catch:{ Exception -> 0x00d4 }
            r12.label = r5     // Catch:{ Exception -> 0x00d4 }
            java.lang.Object r2 = io.nodle.cash.data.remote.api.BlockExplorerApiKt.parseTransaction(r7, r13, r2, r12)     // Catch:{ Exception -> 0x00d4 }
            if (r2 != r1) goto L_0x00ac
            return r1
        L_0x00ac:
            r2 = r9
            r11 = r0
            r0 = r13
            r13 = r11
        L_0x00b0:
            bb.g r5 = bb.g.TRANSFER     // Catch:{ Exception -> 0x001b }
            r12.L$0 = r0     // Catch:{ Exception -> 0x001b }
            r12.L$1 = r13     // Catch:{ Exception -> 0x001b }
            r12.L$2 = r6     // Catch:{ Exception -> 0x001b }
            r12.label = r4     // Catch:{ Exception -> 0x001b }
            java.lang.Object r2 = io.nodle.cash.data.remote.api.BlockExplorerApiKt.parseTransaction(r2, r0, r5, r12)     // Catch:{ Exception -> 0x001b }
            if (r2 != r1) goto L_0x00c1
            return r1
        L_0x00c1:
            r2 = r0
            r0 = r13
        L_0x00c3:
            bb.g r13 = bb.g.TRANSFER     // Catch:{ Exception -> 0x0033 }
            r12.L$0 = r2     // Catch:{ Exception -> 0x0033 }
            r12.L$1 = r6     // Catch:{ Exception -> 0x0033 }
            r12.label = r3     // Catch:{ Exception -> 0x0033 }
            java.lang.Object r13 = io.nodle.cash.data.remote.api.BlockExplorerApiKt.parseTransaction(r0, r2, r13, r12)     // Catch:{ Exception -> 0x0033 }
            if (r13 != r1) goto L_0x00d2
            return r1
        L_0x00d2:
            r0 = r2
            goto L_0x00e2
        L_0x00d4:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
        L_0x00d8:
            java.lang.String r1 = "BlockExplorerApi"
            java.lang.String r2 = "Exception in parseHistoryResponseBody"
            android.util.Log.e(r1, r2)
            r13.printStackTrace()
        L_0x00e2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.data.remote.api.BlockExplorerApiKt$parseHistoryResponseBody$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
