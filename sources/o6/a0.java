package o6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class a0 implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f9316a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9317b;

    public a0(IBinder iBinder, String str) {
        this.f9316a = iBinder;
        this.f9317b = str;
    }

    public final IBinder asBinder() {
        return this.f9316a;
    }

    public final Parcel m() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9317b);
        return obtain;
    }

    public final void n(int i, Parcel parcel) throws RemoteException {
        try {
            this.f9316a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
