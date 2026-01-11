package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class u implements Comparable<u>, Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f3894a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3895b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3896c;

    /* renamed from: s  reason: collision with root package name */
    public final int f3897s;

    /* renamed from: t  reason: collision with root package name */
    public final int f3898t;

    /* renamed from: u  reason: collision with root package name */
    public final long f3899u;

    /* renamed from: v  reason: collision with root package name */
    public String f3900v;

    public class a implements Parcelable.Creator<u> {
        public final Object createFromParcel(Parcel parcel) {
            return u.h(parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new u[i];
        }
    }

    public u(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = d0.b(calendar);
        this.f3894a = b10;
        this.f3895b = b10.get(2);
        this.f3896c = b10.get(1);
        this.f3897s = b10.getMaximum(7);
        this.f3898t = b10.getActualMaximum(5);
        this.f3899u = b10.getTimeInMillis();
    }

    public static u h(int i, int i10) {
        Calendar e10 = d0.e((Calendar) null);
        e10.set(1, i);
        e10.set(2, i10);
        return new u(e10);
    }

    public static u i(long j10) {
        Calendar e10 = d0.e((Calendar) null);
        e10.setTimeInMillis(j10);
        return new u(e10);
    }

    /* renamed from: d */
    public final int compareTo(u uVar) {
        return this.f3894a.compareTo(uVar.f3894a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f3895b == uVar.f3895b && this.f3896c == uVar.f3896c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3895b), Integer.valueOf(this.f3896c)});
    }

    public final int k() {
        int firstDayOfWeek = this.f3894a.get(7) - this.f3894a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f3897s : firstDayOfWeek;
    }

    public final String l() {
        if (this.f3900v == null) {
            this.f3900v = DateUtils.formatDateTime((Context) null, this.f3894a.getTimeInMillis(), 8228);
        }
        return this.f3900v;
    }

    public final u o(int i) {
        Calendar b10 = d0.b(this.f3894a);
        b10.add(2, i);
        return new u(b10);
    }

    public final int p(u uVar) {
        if (this.f3894a instanceof GregorianCalendar) {
            return (uVar.f3895b - this.f3895b) + ((uVar.f3896c - this.f3896c) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3896c);
        parcel.writeInt(this.f3895b);
    }
}
