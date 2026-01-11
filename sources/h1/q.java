package h1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import h1.p;

public abstract class q extends Binder implements IInterface {
    public q() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int n10 = ((MultiInstanceInvalidationService.b) this).n(p.a.m(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(n10);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            p m10 = p.a.m(parcel.readStrongBinder());
            int readInt = parcel.readInt();
            MultiInstanceInvalidationService.b bVar = (MultiInstanceInvalidationService.b) this;
            synchronized (MultiInstanceInvalidationService.this.f2599c) {
                MultiInstanceInvalidationService.this.f2599c.unregister(m10);
                MultiInstanceInvalidationService.this.f2598b.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.b) this).m(parcel.readInt(), parcel.createStringArray());
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i10);
        } else {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }
}
