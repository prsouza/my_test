package h1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface p extends IInterface {

    public static abstract class a extends Binder implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f5759a = 0;

        /* renamed from: h1.p$a$a  reason: collision with other inner class name */
        public static class C0092a implements p {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f5760a;

            public C0092a(IBinder iBinder) {
                this.f5760a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f5760a;
            }

            public final void g(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    if (!this.f5760a.transact(1, obtain, (Parcel) null, 1)) {
                        int i = a.f5759a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static p m(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof p)) {
                return new C0092a(iBinder);
            }
            return (p) queryLocalInterface;
        }
    }

    void g(String[] strArr) throws RemoteException;
}
