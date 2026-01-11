package io.nodle.cash.data.remote.api;

import bb.g;
import ge.d0;
import java.util.ArrayList;
import md.m;
import org.json.JSONArray;
import pd.d;
import rd.e;
import rd.i;
import sa.b;
import xd.p;

@e(c = "io.nodle.cash.data.remote.api.BlockExplorerApiKt$parseTransaction$2", f = "BlockExplorerApi.kt", l = {}, m = "invokeSuspend")
public final class BlockExplorerApiKt$parseTransaction$2 extends i implements p<d0, d<? super m>, Object> {
    public final /* synthetic */ JSONArray $jaTrans;
    public final /* synthetic */ ArrayList<b> $transList;
    public final /* synthetic */ g $type;
    public int label;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[g.values().length];
            iArr[g.TRANSFER.ordinal()] = 1;
            iArr[g.REWARD.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockExplorerApiKt$parseTransaction$2(JSONArray jSONArray, ArrayList<b> arrayList, g gVar, d<? super BlockExplorerApiKt$parseTransaction$2> dVar) {
        super(2, dVar);
        this.$jaTrans = jSONArray;
        this.$transList = arrayList;
        this.$type = gVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new BlockExplorerApiKt$parseTransaction$2(this.$jaTrans, this.$transList, this.$type, dVar);
    }

    public final Object invoke(d0 d0Var, d<? super m> dVar) {
        return ((BlockExplorerApiKt$parseTransaction$2) create(d0Var, dVar)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0165 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r1 = r0.label
            if (r1 != 0) goto L_0x0196
            l6.b1.w(r26)
            org.json.JSONArray r1 = r0.$jaTrans
            if (r1 == 0) goto L_0x0194
            java.util.ArrayList<sa.b> r3 = r0.$transList
            bb.g r15 = r0.$type
            int r14 = r1.length()
            r19 = 0
            r13 = r19
        L_0x001b:
            if (r13 >= r14) goto L_0x0191
            org.json.JSONObject r4 = r1.optJSONObject(r13)
            if (r4 == 0) goto L_0x002a
            java.lang.String r5 = "block"
            org.json.JSONObject r4 = r4.optJSONObject(r5)
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            org.json.JSONObject r5 = r1.optJSONObject(r13)
            if (r5 == 0) goto L_0x0038
            java.lang.String r6 = "data"
            org.json.JSONObject r5 = r5.optJSONObject(r6)
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            org.json.JSONObject r6 = r1.optJSONObject(r13)
            if (r6 == 0) goto L_0x0046
            java.lang.String r7 = "extrinsic"
            org.json.JSONObject r6 = r6.optJSONObject(r7)
            goto L_0x0047
        L_0x0046:
            r6 = 0
        L_0x0047:
            if (r6 == 0) goto L_0x0058
            java.lang.String r7 = "fee"
            org.json.JSONObject r7 = r6.optJSONObject(r7)
            if (r7 == 0) goto L_0x0058
            java.lang.String r8 = "inclusionFee"
            org.json.JSONObject r7 = r7.optJSONObject(r8)
            goto L_0x0059
        L_0x0058:
            r7 = 0
        L_0x0059:
            org.json.JSONObject r8 = r1.optJSONObject(r13)
            java.lang.String r9 = "index"
            if (r8 == 0) goto L_0x006b
            long r10 = r8.optLong(r9)
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r10)
            goto L_0x006c
        L_0x006b:
            r8 = 0
        L_0x006c:
            r10 = 1
            if (r5 == 0) goto L_0x008a
            java.lang.String r11 = "from"
            java.lang.String r11 = r5.optString(r11)
            if (r11 == 0) goto L_0x008a
            int r12 = r11.length()
            if (r12 <= 0) goto L_0x007f
            r12 = r10
            goto L_0x0081
        L_0x007f:
            r12 = r19
        L_0x0081:
            if (r12 == 0) goto L_0x008a
            za.h r12 = za.h.f14215a
            java.lang.String r11 = r12.e(r11)
            goto L_0x008b
        L_0x008a:
            r11 = 0
        L_0x008b:
            int[] r12 = io.nodle.cash.data.remote.api.BlockExplorerApiKt$parseTransaction$2.WhenMappings.$EnumSwitchMapping$0
            int r16 = r15.ordinal()
            r12 = r12[r16]
            if (r12 == r10) goto L_0x00b6
            r2 = 2
            if (r12 == r2) goto L_0x009a
        L_0x0098:
            r2 = 0
            goto L_0x00d1
        L_0x009a:
            if (r5 == 0) goto L_0x0098
            java.lang.String r2 = "who"
            java.lang.String r2 = r5.optString(r2)
            if (r2 == 0) goto L_0x0098
            int r12 = r2.length()
            if (r12 <= 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r10 = r19
        L_0x00ad:
            if (r10 == 0) goto L_0x0098
            za.h r10 = za.h.f14215a
            java.lang.String r2 = r10.e(r2)
            goto L_0x00d1
        L_0x00b6:
            if (r5 == 0) goto L_0x0098
            java.lang.String r2 = "to"
            java.lang.String r2 = r5.optString(r2)
            if (r2 == 0) goto L_0x0098
            int r12 = r2.length()
            if (r12 <= 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r10 = r19
        L_0x00c9:
            if (r10 == 0) goto L_0x0098
            za.h r10 = za.h.f14215a
            java.lang.String r2 = r10.e(r2)
        L_0x00d1:
            if (r5 == 0) goto L_0x00e1
            java.lang.String r10 = "value"
            java.lang.String r5 = r5.optString(r10)
            if (r5 == 0) goto L_0x00e1
            java.math.BigInteger r10 = new java.math.BigInteger
            r10.<init>(r5)
            goto L_0x00e4
        L_0x00e1:
            java.math.BigInteger r5 = java.math.BigInteger.ZERO
            r10 = r5
        L_0x00e4:
            java.lang.String r5 = "joData?.optString(\"value…       ?: BigInteger.ZERO"
            e6.e.C(r10, r5)
            r16 = 0
            if (r7 == 0) goto L_0x00f4
            java.lang.String r5 = "lenFee"
            long r20 = r7.optLong(r5)
            goto L_0x00f6
        L_0x00f4:
            r20 = r16
        L_0x00f6:
            if (r7 == 0) goto L_0x00ff
            java.lang.String r5 = "baseFee"
            long r22 = r7.optLong(r5)
            goto L_0x0101
        L_0x00ff:
            r22 = r16
        L_0x0101:
            long r20 = r20 + r22
            java.math.BigInteger r12 = java.math.BigInteger.valueOf(r20)
            java.lang.String r5 = "valueOf(this)"
            e6.e.C(r12, r5)
            r18 = 0
            java.lang.String r5 = "hash"
            if (r4 == 0) goto L_0x0117
            java.lang.String r7 = r4.optString(r5)
            goto L_0x0118
        L_0x0117:
            r7 = 0
        L_0x0118:
            java.lang.String r20 = ""
            if (r7 != 0) goto L_0x011f
            r21 = r20
            goto L_0x0121
        L_0x011f:
            r21 = r7
        L_0x0121:
            if (r4 == 0) goto L_0x012a
            java.lang.String r7 = "number"
            long r22 = r4.optLong(r7)
            goto L_0x012c
        L_0x012a:
            r22 = r16
        L_0x012c:
            r24 = r1
            if (r6 == 0) goto L_0x013a
            long r0 = r6.optLong(r9)
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
            goto L_0x013b
        L_0x013a:
            r7 = 0
        L_0x013b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            if (r6 == 0) goto L_0x0156
            java.lang.String r1 = r6.optString(r5)
            goto L_0x0157
        L_0x0156:
            r1 = 0
        L_0x0157:
            if (r1 != 0) goto L_0x015b
            r1 = r20
        L_0x015b:
            if (r4 == 0) goto L_0x0165
            java.lang.String r5 = "timestamp"
            long r4 = r4.optLong(r5)
            r16 = r4
        L_0x0165:
            sa.b r9 = new sa.b
            r20 = 0
            r4 = r9
            r5 = r11
            r6 = r2
            r7 = r10
            r8 = r12
            r2 = r9
            r9 = r18
            r10 = r21
            r11 = r22
            r21 = r13
            r13 = r0
            r0 = r14
            r14 = r1
            r1 = r15
            r15 = r16
            r17 = r1
            r18 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r17, r18)
            r3.add(r2)
            int r13 = r21 + 1
            r14 = r0
            r15 = r1
            r1 = r24
            r0 = r25
            goto L_0x001b
        L_0x0191:
            md.m r2 = md.m.f8555a
            goto L_0x0195
        L_0x0194:
            r2 = 0
        L_0x0195:
            return r2
        L_0x0196:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.data.remote.api.BlockExplorerApiKt$parseTransaction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
