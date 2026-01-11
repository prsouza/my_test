package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import d.b;
import java.util.Objects;

public interface a extends IInterface {

    /* renamed from: d.a$a  reason: collision with other inner class name */
    public static abstract class C0054a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f4252a = 0;

        /* renamed from: d.a$a$a  reason: collision with other inner class name */
        public static class C0055a implements a {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f4253a;

            public C0055a(IBinder iBinder) {
                this.f4253a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f4253a;
            }
        }

        public C0054a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public final IBinder asBinder() {
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                int readInt = parcel.readInt();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                b.C0056b bVar = (b.C0056b) this;
                Objects.requireNonNull(b.this);
                b.this.a(readInt, bundle);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i10);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }
}
