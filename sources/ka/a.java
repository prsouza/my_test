package ka;

import android.location.Address;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0133a();

    /* renamed from: a  reason: collision with root package name */
    public Location f7487a;

    /* renamed from: b  reason: collision with root package name */
    public Address f7488b;

    /* renamed from: ka.a$a  reason: collision with other inner class name */
    public static class C0133a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(Address address) {
        this.f7488b = address;
        Location location = new Location(a.class.getCanonicalName());
        this.f7487a = location;
        location.setLatitude(address.getLatitude());
        this.f7487a.setLongitude(address.getLongitude());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7487a, i);
        parcel.writeParcelable(this.f7488b, i);
    }

    public a(Parcel parcel) {
        this.f7487a = (Location) parcel.readParcelable(Location.class.getClassLoader());
        this.f7488b = (Address) parcel.readParcelable(Address.class.getClassLoader());
    }
}
