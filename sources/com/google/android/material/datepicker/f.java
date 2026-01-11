package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public final class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f3843a;

    public class a implements Parcelable.Creator<f> {
        public final Object createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), (a) null);
        }

        public final Object[] newArray(int i) {
            return new f[i];
        }
    }

    public f() {
        this.f3843a = Long.MIN_VALUE;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        if (this.f3843a == ((f) obj).f3843a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3843a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3843a);
    }

    public final boolean y(long j10) {
        return j10 >= this.f3843a;
    }

    public f(long j10, a aVar) {
        this.f3843a = j10;
    }
}
