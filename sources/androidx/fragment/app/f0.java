package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new a();
    public final int A;
    public Bundle B;

    /* renamed from: a  reason: collision with root package name */
    public final String f1885a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1886b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1887c;

    /* renamed from: s  reason: collision with root package name */
    public final int f1888s;

    /* renamed from: t  reason: collision with root package name */
    public final int f1889t;

    /* renamed from: u  reason: collision with root package name */
    public final String f1890u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f1891v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f1892w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f1893x;

    /* renamed from: y  reason: collision with root package name */
    public final Bundle f1894y;
    public final boolean z;

    public class a implements Parcelable.Creator<f0> {
        public final Object createFromParcel(Parcel parcel) {
            return new f0(parcel);
        }

        public final Object[] newArray(int i) {
            return new f0[i];
        }
    }

    public f0(Fragment fragment) {
        this.f1885a = fragment.getClass().getName();
        this.f1886b = fragment.mWho;
        this.f1887c = fragment.mFromLayout;
        this.f1888s = fragment.mFragmentId;
        this.f1889t = fragment.mContainerId;
        this.f1890u = fragment.mTag;
        this.f1891v = fragment.mRetainInstance;
        this.f1892w = fragment.mRemoving;
        this.f1893x = fragment.mDetached;
        this.f1894y = fragment.mArguments;
        this.z = fragment.mHidden;
        this.A = fragment.mMaxState.ordinal();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1885a);
        sb2.append(" (");
        sb2.append(this.f1886b);
        sb2.append(")}:");
        if (this.f1887c) {
            sb2.append(" fromLayout");
        }
        if (this.f1889t != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f1889t));
        }
        String str = this.f1890u;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f1890u);
        }
        if (this.f1891v) {
            sb2.append(" retainInstance");
        }
        if (this.f1892w) {
            sb2.append(" removing");
        }
        if (this.f1893x) {
            sb2.append(" detached");
        }
        if (this.z) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1885a);
        parcel.writeString(this.f1886b);
        parcel.writeInt(this.f1887c ? 1 : 0);
        parcel.writeInt(this.f1888s);
        parcel.writeInt(this.f1889t);
        parcel.writeString(this.f1890u);
        parcel.writeInt(this.f1891v ? 1 : 0);
        parcel.writeInt(this.f1892w ? 1 : 0);
        parcel.writeInt(this.f1893x ? 1 : 0);
        parcel.writeBundle(this.f1894y);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeBundle(this.B);
        parcel.writeInt(this.A);
    }

    public f0(Parcel parcel) {
        this.f1885a = parcel.readString();
        this.f1886b = parcel.readString();
        boolean z10 = true;
        this.f1887c = parcel.readInt() != 0;
        this.f1888s = parcel.readInt();
        this.f1889t = parcel.readInt();
        this.f1890u = parcel.readString();
        this.f1891v = parcel.readInt() != 0;
        this.f1892w = parcel.readInt() != 0;
        this.f1893x = parcel.readInt() != 0;
        this.f1894y = parcel.readBundle();
        this.z = parcel.readInt() == 0 ? false : z10;
        this.B = parcel.readBundle();
        this.A = parcel.readInt();
    }
}
