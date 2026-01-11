package io.nodle.cash.data.remote.api;

import android.content.Context;
import ge.d0;
import java.util.ArrayList;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import sa.b;
import xd.p;

@e(c = "io.nodle.cash.data.remote.api.SubscanApiKt$parseSubscanHistoryResponseBody$2", f = "SubscanApi.kt", l = {63}, m = "invokeSuspend")
public final class SubscanApiKt$parseSubscanHistoryResponseBody$2 extends i implements p<d0, d<? super ArrayList<b>>, Object> {
    public final /* synthetic */ String $bodyStr;
    public final /* synthetic */ Context $cxt;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubscanApiKt$parseSubscanHistoryResponseBody$2(String str, Context context, d<? super SubscanApiKt$parseSubscanHistoryResponseBody$2> dVar) {
        super(2, dVar);
        this.$bodyStr = str;
        this.$cxt = context;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new SubscanApiKt$parseSubscanHistoryResponseBody$2(this.$bodyStr, this.$cxt, dVar);
    }

    public final Object invoke(d0 d0Var, d<? super ArrayList<b>> dVar) {
        return ((SubscanApiKt$parseSubscanHistoryResponseBody$2) create(d0Var, dVar)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092 A[Catch:{ Exception -> 0x00c6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r0 = "data"
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r11.label
            java.lang.String r3 = "SubscanApi"
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x002e
            if (r2 != r5) goto L_0x0026
            int r0 = r11.I$1
            int r2 = r11.I$0
            java.lang.Object r4 = r11.L$2
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.lang.Object r6 = r11.L$1
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r7 = r11.L$0
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            l6.b1.w(r12)     // Catch:{ Exception -> 0x00c6 }
            r8 = r7
            r7 = r6
            r6 = r11
            goto L_0x00b5
        L_0x0026:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x002e:
            l6.b1.w(r12)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r2 = r11.$bodyStr     // Catch:{ Exception -> 0x00c6 }
            r12.<init>(r2)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r2 = "message"
            java.lang.String r2 = r12.optString(r2)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r6 = "Success"
            boolean r2 = e6.e.r(r2, r6)     // Catch:{ Exception -> 0x00c6 }
            if (r2 == 0) goto L_0x00cf
            org.json.JSONObject r2 = r12.optJSONObject(r0)     // Catch:{ Exception -> 0x00c6 }
            if (r2 == 0) goto L_0x0060
            java.lang.String r6 = "count"
            int r2 = r2.optInt(r6)     // Catch:{ Exception -> 0x00c6 }
            if (r2 <= 0) goto L_0x005b
            r2 = r5
            goto L_0x005c
        L_0x005b:
            r2 = r4
        L_0x005c:
            if (r2 != r5) goto L_0x0060
            r2 = r5
            goto L_0x0061
        L_0x0060:
            r2 = r4
        L_0x0061:
            if (r2 == 0) goto L_0x00cf
            org.json.JSONObject r12 = r12.getJSONObject(r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = "transfers"
            org.json.JSONArray r12 = r12.optJSONArray(r0)     // Catch:{ Exception -> 0x00c6 }
            if (r12 == 0) goto L_0x00cf
            android.content.Context r0 = r11.$cxt     // Catch:{ Exception -> 0x00c6 }
            int r2 = r12.length()     // Catch:{ Exception -> 0x00c6 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            r6.<init>()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r8 = "History "
            r6.append(r8)     // Catch:{ Exception -> 0x00c6 }
            r6.append(r2)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x00c6 }
            android.util.Log.d(r3, r2)     // Catch:{ Exception -> 0x00c6 }
            int r2 = r12.length()     // Catch:{ Exception -> 0x00c6 }
            r6 = r0
            r0 = r2
            r2 = r11
        L_0x0090:
            if (r4 >= r0) goto L_0x00cf
            org.json.JSONObject r8 = r12.getJSONObject(r4)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r9 = "jaHistory.getJSONObject(i)"
            e6.e.C(r8, r9)     // Catch:{ Exception -> 0x00c6 }
            r2.L$0 = r7     // Catch:{ Exception -> 0x00c6 }
            r2.L$1 = r6     // Catch:{ Exception -> 0x00c6 }
            r2.L$2 = r12     // Catch:{ Exception -> 0x00c6 }
            r2.I$0 = r4     // Catch:{ Exception -> 0x00c6 }
            r2.I$1 = r0     // Catch:{ Exception -> 0x00c6 }
            r2.label = r5     // Catch:{ Exception -> 0x00c6 }
            java.lang.Object r8 = io.nodle.cash.data.remote.api.SubscanApiKt.parseTransaction(r6, r8, r2)     // Catch:{ Exception -> 0x00c6 }
            if (r8 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            r10 = r4
            r4 = r12
            r12 = r8
            r8 = r7
            r7 = r6
            r6 = r2
            r2 = r10
        L_0x00b5:
            sa.b r12 = (sa.b) r12     // Catch:{ Exception -> 0x00c3 }
            r8.add(r12)     // Catch:{ Exception -> 0x00c3 }
            int r12 = r2 + 1
            r2 = r6
            r6 = r7
            r7 = r8
            r10 = r4
            r4 = r12
            r12 = r10
            goto L_0x0090
        L_0x00c3:
            r12 = move-exception
            r7 = r8
            goto L_0x00c7
        L_0x00c6:
            r12 = move-exception
        L_0x00c7:
            java.lang.String r0 = "Exception in parseSubscanHistoryResponseBody"
            android.util.Log.e(r3, r0)
            r12.printStackTrace()
        L_0x00cf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.data.remote.api.SubscanApiKt$parseSubscanHistoryResponseBody$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
