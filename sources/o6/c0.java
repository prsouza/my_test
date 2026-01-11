package o6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f9319a = 0;

    static {
        c0.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
