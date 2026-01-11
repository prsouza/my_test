package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import org.slf4j.helpers.MessageFormatter;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f713a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaDescriptionCompat f714b;

    public static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        public final Object createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        public final Object[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f713a = parcel.readInt();
        this.f714b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{" + "mFlags=" + this.f713a + ", mDescription=" + this.f714b + MessageFormatter.DELIM_STOP;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f713a);
        this.f714b.writeToParcel(parcel, i);
    }
}
