package ei;

import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f4841a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4842b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4843c;

    /* renamed from: s  reason: collision with root package name */
    public final String f4844s;

    /* renamed from: t  reason: collision with root package name */
    public final String f4845t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4846u;

    /* renamed from: v  reason: collision with root package name */
    public final int f4847v;

    public static class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public b(Parcel parcel) {
        this.f4841a = parcel.readInt();
        this.f4842b = parcel.readString();
        this.f4843c = parcel.readString();
        this.f4844s = parcel.readString();
        this.f4845t = parcel.readString();
        this.f4846u = parcel.readInt();
        this.f4847v = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4841a);
        parcel.writeString(this.f4842b);
        parcel.writeString(this.f4843c);
        parcel.writeString(this.f4844s);
        parcel.writeString(this.f4845t);
        parcel.writeInt(this.f4846u);
        parcel.writeInt(this.f4847v);
    }
}
