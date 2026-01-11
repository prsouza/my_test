package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f725a;

    /* renamed from: b  reason: collision with root package name */
    public final float f726b;

    public static class a implements Parcelable.Creator<RatingCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public final Object[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f10) {
        this.f725a = i;
        this.f726b = f10;
    }

    public final int describeContents() {
        return this.f725a;
    }

    public final String toString() {
        String str;
        StringBuilder d10 = a.a.d("Rating:style=");
        d10.append(this.f725a);
        d10.append(" rating=");
        float f10 = this.f726b;
        if (f10 < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f10);
        }
        d10.append(str);
        return d10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f725a);
        parcel.writeFloat(this.f726b);
    }
}
