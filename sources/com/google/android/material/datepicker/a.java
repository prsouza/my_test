package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0044a();

    /* renamed from: a  reason: collision with root package name */
    public final u f3812a;

    /* renamed from: b  reason: collision with root package name */
    public final u f3813b;

    /* renamed from: c  reason: collision with root package name */
    public final c f3814c;

    /* renamed from: s  reason: collision with root package name */
    public u f3815s;

    /* renamed from: t  reason: collision with root package name */
    public final int f3816t;

    /* renamed from: u  reason: collision with root package name */
    public final int f3817u;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    public class C0044a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            return new a((u) parcel.readParcelable(u.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()));
        }

        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final long f3818e = d0.a(u.h(1900, 0).f3899u);

        /* renamed from: f  reason: collision with root package name */
        public static final long f3819f = d0.a(u.h(2100, 11).f3899u);

        /* renamed from: a  reason: collision with root package name */
        public long f3820a = f3818e;

        /* renamed from: b  reason: collision with root package name */
        public long f3821b = f3819f;

        /* renamed from: c  reason: collision with root package name */
        public Long f3822c;

        /* renamed from: d  reason: collision with root package name */
        public c f3823d = new f();

        public b(a aVar) {
            this.f3820a = aVar.f3812a.f3899u;
            this.f3821b = aVar.f3813b.f3899u;
            this.f3822c = Long.valueOf(aVar.f3815s.f3899u);
            this.f3823d = aVar.f3814c;
        }
    }

    public interface c extends Parcelable {
        boolean y(long j10);
    }

    public a(u uVar, u uVar2, c cVar, u uVar3) {
        this.f3812a = uVar;
        this.f3813b = uVar2;
        this.f3815s = uVar3;
        this.f3814c = cVar;
        if (uVar3 != null && uVar.f3894a.compareTo(uVar3.f3894a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (uVar3 == null || uVar3.f3894a.compareTo(uVar2.f3894a) <= 0) {
            this.f3817u = uVar.p(uVar2) + 1;
            this.f3816t = (uVar2.f3896c - uVar.f3896c) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f3812a.equals(aVar.f3812a) || !this.f3813b.equals(aVar.f3813b) || !Objects.equals(this.f3815s, aVar.f3815s) || !this.f3814c.equals(aVar.f3814c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3812a, this.f3813b, this.f3815s, this.f3814c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3812a, 0);
        parcel.writeParcelable(this.f3813b, 0);
        parcel.writeParcelable(this.f3815s, 0);
        parcel.writeParcelable(this.f3814c, 0);
    }
}
