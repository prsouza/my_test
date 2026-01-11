package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import org.slf4j.helpers.MessageFormatter;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0004a();

    /* renamed from: a  reason: collision with root package name */
    public final int f810a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f811b;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    public class C0004a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(int i, Intent intent) {
        this.f810a = i;
        this.f811b = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("ActivityResult{resultCode=");
        int i = this.f810a;
        d10.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        d10.append(", data=");
        d10.append(this.f811b);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f810a);
        parcel.writeInt(this.f811b == null ? 0 : 1);
        Intent intent = this.f811b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public a(Parcel parcel) {
        this.f810a = parcel.readInt();
        this.f811b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
