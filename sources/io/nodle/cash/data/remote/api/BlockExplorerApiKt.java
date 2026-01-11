package io.nodle.cash.data.remote.api;

import android.content.Context;
import e6.e;
import ge.g;
import ge.o0;
import java.util.ArrayList;
import java.util.List;
import md.m;
import org.json.JSONArray;
import p002if.t;
import p002if.z;
import pd.d;
import sa.b;
import za.h;

public final class BlockExplorerApiKt {
    public static final z getBalanceRequestBody(String str) {
        e.D(str, "address");
        t b10 = t.f6581f.b("application/json");
        z.a aVar = z.f6639a;
        String e10 = h.f14215a.e(str);
        return aVar.a("{\"query\":\"query AccountInfo($address: String!) {  balance: balanceByAddress(address: $address) {   free  }}\",\"variables\":{\"address\":\"" + e10 + "\"}}", b10);
    }

    public static final z getHistoryRequestBody(String str, int i, int i10) {
        e.D(str, "address");
        t b10 = t.f6581f.b("application/json");
        z.a aVar = z.f6639a;
        String e10 = h.f14215a.e(str);
        return aVar.a("{\"query\":\"query AccountInfo($address: String!, $maxEventPerType: Int, $offset: Int) {  balance: balanceByAddress(address: $address) {   free  }  allocations: events(eventName: \\\"NewAllocation\\\", filters: { who : $address}, take: $maxEventPerType, skip: $offset) {    ...eventData  }  transfersFrom: events(eventName: \\\"Transfer\\\", filters: { from : $address}, take: $maxEventPerType, skip: $offset) {    ...eventData  }  transfersTo: events(eventName: \\\"Transfer\\\", filters: { to : $address}, , take: $maxEventPerType, skip: $offset) {    ...eventData  }}fragment eventData on EventsResponse {  items {      data      index      extrinsic {        fee        hash        index      }    block {        number        hash        timestamp      }    }}\", \"variables\":{\"address\":\"" + e10 + "\",\"maxEventPerType\":" + i + ",\"offset\":" + i10 + "}}", b10);
    }

    public static final z getRewardsRequestBody(String str, String str2, String str3) {
        e.D(str, "address");
        e.D(str2, "startTime");
        e.D(str3, "endTime");
        t b10 = t.f6581f.b("application/json");
        z.a aVar = z.f6639a;
        String e10 = h.f14215a.e(str);
        return aVar.a("{\"query\" : \"query Allocations($address: String!, $start: DateTime!, $end: DateTime!) { allocations: events( eventName: \\\"NewAllocation\\\", callModule: \\\"allocations\\\", dateStart: $start, dateEnd: $end, take: 0,  filters: { who: $address } ) { totalCount items { data index  extrinsic { fee hash index}  block { hash number timestamp } } } }\", \"variables\" : {\"address\":\"" + e10 + "\", \"start\":\"" + str2 + "\", \"end\":\"" + str3 + "\"}}", b10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r2 = r2.optJSONObject("balance");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.math.BigInteger parseBalanceResponseBody(p002if.b0 r2) {
        /*
            java.lang.String r0 = "ZERO"
            if (r2 != 0) goto L_0x000a
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
            e6.e.C(r2, r0)
            return r2
        L_0x000a:
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.String r2 = r2.f()
            r1.<init>(r2)
            java.lang.String r2 = "data"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            if (r2 == 0) goto L_0x002a
            java.lang.String r1 = "balance"
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            if (r2 == 0) goto L_0x002a
            java.lang.String r1 = "free"
            java.lang.String r2 = r2.optString(r1)
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            if (r2 == 0) goto L_0x0036
            int r1 = r2.length()
            if (r1 != 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r1 = 0
            goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            if (r1 != 0) goto L_0x0047
            java.lang.String r1 = "null"
            boolean r1 = e6.e.r(r2, r1)
            if (r1 != 0) goto L_0x0047
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            goto L_0x004d
        L_0x0047:
            java.math.BigInteger r2 = java.math.BigInteger.ZERO
            e6.e.C(r2, r0)
            r0 = r2
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.data.remote.api.BlockExplorerApiKt.parseBalanceResponseBody(if.b0):java.math.BigInteger");
    }

    public static final Object parseHistoryResponseBody(Context context, String str, d<? super List<b>> dVar) {
        return g.d(o0.f5433a, new BlockExplorerApiKt$parseHistoryResponseBody$2(str, (d<? super BlockExplorerApiKt$parseHistoryResponseBody$2>) null), dVar);
    }

    public static final Object parseRewardsResponseBody(Context context, String str, d<? super List<b>> dVar) {
        return g.d(o0.f5433a, new BlockExplorerApiKt$parseRewardsResponseBody$2(str, (d<? super BlockExplorerApiKt$parseRewardsResponseBody$2>) null), dVar);
    }

    /* access modifiers changed from: private */
    public static final Object parseTransaction(JSONArray jSONArray, ArrayList<b> arrayList, bb.g gVar, d<? super m> dVar) {
        return g.d(o0.f5433a, new BlockExplorerApiKt$parseTransaction$2(jSONArray, arrayList, gVar, (d<? super BlockExplorerApiKt$parseTransaction$2>) null), dVar);
    }
}
