package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f1847a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f1848b;

    public class a implements Parcelable.Creator<c> {
        public final Object createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        public final Object[] newArray(int i) {
            return new c[i];
        }
    }

    public c(Parcel parcel) {
        this.f1847a = parcel.createStringArrayList();
        this.f1848b = parcel.createTypedArrayList(b.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1847a);
        parcel.writeTypedList(this.f1848b);
    }
}
