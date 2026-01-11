package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f739a;

    /* renamed from: b  reason: collision with root package name */
    public int f740b;

    /* renamed from: c  reason: collision with root package name */
    public int f741c;

    /* renamed from: s  reason: collision with root package name */
    public int f742s;

    /* renamed from: t  reason: collision with root package name */
    public int f743t;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f739a = parcel.readInt();
        this.f741c = parcel.readInt();
        this.f742s = parcel.readInt();
        this.f743t = parcel.readInt();
        this.f740b = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f739a);
        parcel.writeInt(this.f741c);
        parcel.writeInt(this.f742s);
        parcel.writeInt(this.f743t);
        parcel.writeInt(this.f740b);
    }
}
