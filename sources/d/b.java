package d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import d.a;

public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public a f4254a;

    public class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    /* renamed from: d.b$b  reason: collision with other inner class name */
    public class C0056b extends a.C0054a {
        public C0056b() {
        }
    }

    public b(Parcel parcel) {
        a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = a.C0054a.f4252a;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                aVar = new a.C0054a.C0055a(readStrongBinder);
            } else {
                aVar = (a) queryLocalInterface;
            }
        }
        this.f4254a = aVar;
    }

    public void a(int i, Bundle bundle) {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f4254a == null) {
                this.f4254a = new C0056b();
            }
            parcel.writeStrongBinder(this.f4254a.asBinder());
        }
    }
}
