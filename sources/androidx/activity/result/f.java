package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final IntentSender f813a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f814b;

    /* renamed from: c  reason: collision with root package name */
    public final int f815c;

    /* renamed from: s  reason: collision with root package name */
    public final int f816s;

    public class a implements Parcelable.Creator<f> {
        public final Object createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        public final Object[] newArray(int i) {
            return new f[i];
        }
    }

    public f(IntentSender intentSender, Intent intent, int i, int i10) {
        this.f813a = intentSender;
        this.f814b = intent;
        this.f815c = i;
        this.f816s = i10;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f813a, i);
        parcel.writeParcelable(this.f814b, i);
        parcel.writeInt(this.f815c);
        parcel.writeInt(this.f816s);
    }

    public f(Parcel parcel) {
        this.f813a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f814b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f815c = parcel.readInt();
        this.f816s = parcel.readInt();
    }
}
