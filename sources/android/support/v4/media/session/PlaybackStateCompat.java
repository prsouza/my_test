package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f744a;

    /* renamed from: b  reason: collision with root package name */
    public final long f745b;

    /* renamed from: c  reason: collision with root package name */
    public final long f746c;

    /* renamed from: s  reason: collision with root package name */
    public final float f747s;

    /* renamed from: t  reason: collision with root package name */
    public final long f748t;

    /* renamed from: u  reason: collision with root package name */
    public final int f749u;

    /* renamed from: v  reason: collision with root package name */
    public final CharSequence f750v;

    /* renamed from: w  reason: collision with root package name */
    public final long f751w;

    /* renamed from: x  reason: collision with root package name */
    public List<CustomAction> f752x;

    /* renamed from: y  reason: collision with root package name */
    public final long f753y;
    public final Bundle z;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final String f754a;

        /* renamed from: b  reason: collision with root package name */
        public final CharSequence f755b;

        /* renamed from: c  reason: collision with root package name */
        public final int f756c;

        /* renamed from: s  reason: collision with root package name */
        public final Bundle f757s;

        public static class a implements Parcelable.Creator<CustomAction> {
            public final Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public final Object[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f754a = parcel.readString();
            this.f755b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f756c = parcel.readInt();
            this.f757s = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("Action:mName='");
            d10.append(this.f755b);
            d10.append(", mIcon=");
            d10.append(this.f756c);
            d10.append(", mExtras=");
            d10.append(this.f757s);
            return d10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f754a);
            TextUtils.writeToParcel(this.f755b, parcel, i);
            parcel.writeInt(this.f756c);
            parcel.writeBundle(this.f757s);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public final Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f744a = parcel.readInt();
        this.f745b = parcel.readLong();
        this.f747s = parcel.readFloat();
        this.f751w = parcel.readLong();
        this.f746c = parcel.readLong();
        this.f748t = parcel.readLong();
        this.f750v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f752x = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f753y = parcel.readLong();
        this.z = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f749u = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {" + "state=" + this.f744a + ", position=" + this.f745b + ", buffered position=" + this.f746c + ", speed=" + this.f747s + ", updated=" + this.f751w + ", actions=" + this.f748t + ", error code=" + this.f749u + ", error message=" + this.f750v + ", custom actions=" + this.f752x + ", active item id=" + this.f753y + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f744a);
        parcel.writeLong(this.f745b);
        parcel.writeFloat(this.f747s);
        parcel.writeLong(this.f751w);
        parcel.writeLong(this.f746c);
        parcel.writeLong(this.f748t);
        TextUtils.writeToParcel(this.f750v, parcel, i);
        parcel.writeTypedList(this.f752x);
        parcel.writeLong(this.f753y);
        parcel.writeBundle(this.z);
        parcel.writeInt(this.f749u);
    }
}
