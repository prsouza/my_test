package o6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class j0 extends a0 {
    public j0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void zzd(Bundle bundle) throws RemoteException {
        Parcel m10 = m();
        int i = c0.f9319a;
        m10.writeInt(1);
        bundle.writeToParcel(m10, 0);
        n(3, m10);
    }
}
