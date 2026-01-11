package s0;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final C0212a f10848b = new C0212a();

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f10849a;

    /* renamed from: s0.a$a  reason: collision with other inner class name */
    public class C0212a extends a {
    }

    public a() {
        this.f10849a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10849a, i);
    }

    public class b implements Parcelable.ClassLoaderCreator<a> {
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return a.f10848b;
            }
            throw new IllegalStateException("superState must be null");
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }

        public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f10848b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f10849a = parcelable == f10848b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f10849a = readParcelable == null ? f10848b : readParcelable;
    }
}
