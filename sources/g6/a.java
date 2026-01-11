package g6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s.g;

public final class a extends s0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0084a();

    /* renamed from: c  reason: collision with root package name */
    public final g<String, Bundle> f5259c;

    /* renamed from: g6.a$a  reason: collision with other inner class name */
    public class C0084a implements Parcelable.ClassLoaderCreator<a> {
        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }

        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, (ClassLoader) null);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f5259c = new g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f5259c.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("ExtendableSavedState{");
        d10.append(Integer.toHexString(System.identityHashCode(this)));
        d10.append(" states=");
        d10.append(this.f5259c);
        d10.append("}");
        return d10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10849a, i);
        int i10 = this.f5259c.f10843c;
        parcel.writeInt(i10);
        String[] strArr = new String[i10];
        Bundle[] bundleArr = new Bundle[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = this.f5259c.i(i11);
            bundleArr[i11] = this.f5259c.m(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
