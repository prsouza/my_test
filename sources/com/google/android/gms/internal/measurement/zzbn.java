package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzbn extends Binder implements IInterface {
    public zzbn(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i10)) {
            return true;
        }
        return zza(i, parcel, parcel2, i10);
    }

    public boolean zza(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        throw null;
    }
}
