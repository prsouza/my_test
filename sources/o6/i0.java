package o6;

public abstract class i0 extends b0 {
    public i0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r7v10, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int r6, android.os.Parcel r7) throws android.os.RemoteException {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"
            if (r6 == r0) goto L_0x0071
            r0 = 3
            r4 = 0
            if (r6 == r0) goto L_0x000c
            return r4
        L_0x000c:
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            android.os.Parcelable r6 = o6.c0.a(r7)
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.os.IBinder r6 = r7.readStrongBinder()
            if (r6 != 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            android.os.IInterface r7 = r6.queryLocalInterface(r3)
            boolean r0 = r7 instanceof o6.j0
            if (r0 == 0) goto L_0x0027
            r2 = r7
            o6.j0 r2 = (o6.j0) r2
            goto L_0x002c
        L_0x0027:
            o6.j0 r2 = new o6.j0
            r2.<init>(r6)
        L_0x002c:
            r6 = r5
            l6.v r6 = (l6.v) r6
            m3.u r7 = r6.f8046a
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r3 = "clearAssetPackStorage AIDL call"
            r7.a(r3, r0)
            android.content.Context r7 = r6.f8047b
            boolean r7 = o6.s.b(r7)
            if (r7 == 0) goto L_0x0068
            android.content.Context r7 = r6.f8047b
            boolean r7 = o6.s.a(r7)
            if (r7 != 0) goto L_0x0049
            goto L_0x0068
        L_0x0049:
            l6.a0 r6 = r6.f8048c
            java.io.File r6 = r6.g()
            l6.a0.j(r6)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            android.os.Parcel r7 = r2.m()
            int r0 = o6.c0.f9319a
            r7.writeInt(r1)
            r6.writeToParcel(r7, r4)
            r6 = 4
            r2.n(r6, r7)
            goto L_0x0097
        L_0x0068:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r2.zzd(r6)
            goto L_0x0097
        L_0x0071:
            android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
            android.os.Parcelable r6 = o6.c0.a(r7)
            android.os.Bundle r6 = (android.os.Bundle) r6
            android.os.IBinder r7 = r7.readStrongBinder()
            if (r7 != 0) goto L_0x0080
            goto L_0x0091
        L_0x0080:
            android.os.IInterface r0 = r7.queryLocalInterface(r3)
            boolean r2 = r0 instanceof o6.j0
            if (r2 == 0) goto L_0x008c
            r2 = r0
            o6.j0 r2 = (o6.j0) r2
            goto L_0x0091
        L_0x008c:
            o6.j0 r2 = new o6.j0
            r2.<init>(r7)
        L_0x0091:
            r7 = r5
            l6.v r7 = (l6.v) r7
            r7.n(r6, r2)
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.i0.m(int, android.os.Parcel):boolean");
    }
}
