package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final MediaDescriptionCompat f734a;

        /* renamed from: b  reason: collision with root package name */
        public final long f735b;

        public static class a implements Parcelable.Creator<QueueItem> {
            public final Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public final Object[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f734a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f735b = parcel.readLong();
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("MediaSession.QueueItem {Description=");
            d10.append(this.f734a);
            d10.append(", Id=");
            d10.append(this.f735b);
            d10.append(" }");
            return d10.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f734a.writeToParcel(parcel, i);
            parcel.writeLong(this.f735b);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public ResultReceiver f736a;

        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            public final Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public final Object[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f736a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f736a.writeToParcel(parcel, i);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Object f737a;

        /* renamed from: b  reason: collision with root package name */
        public a f738b = null;

        public static class a implements Parcelable.Creator<Token> {
            public final Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            public final Object[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this.f737a = obj;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f737a;
            if (obj2 != null) {
                Object obj3 = token.f737a;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f737a == null) {
                return true;
            } else {
                return false;
            }
        }

        public final int hashCode() {
            Object obj = this.f737a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.f737a, i);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
