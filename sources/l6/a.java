package l6;

import t6.n;

public final class a extends n {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a() {
        /*
            r7 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.util.HashMap r3 = r6.a.f10584a
            boolean r4 = r3.containsKey(r2)
            if (r4 != 0) goto L_0x001a
            java.lang.String r2 = ""
            goto L_0x0054
        L_0x001a:
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.util.HashMap r4 = r6.a.f10585b
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 106
            int r4 = r4 + r5
            r6.<init>(r4)
            r6.append(r3)
            java.lang.String r3 = " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#"
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
        L_0x0054:
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "Review Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r7.<init>((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.a.<init>():void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(int r7) {
        /*
            r6 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            java.util.HashMap r1 = m6.a.f8505a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L_0x0019
            java.lang.String r1 = ""
            goto L_0x0053
        L_0x0019:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap r3 = m6.a.f8506b
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 113
            int r3 = r3 + r4
            r5.<init>(r3)
            r5.append(r1)
            java.lang.String r1 = " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#"
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = ")"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
        L_0x0053:
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Asset Pack Download Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>((java.lang.String) r0)
            if (r7 == 0) goto L_0x0062
            return
        L_0x0062:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.a.<init>(int):void");
    }
}
