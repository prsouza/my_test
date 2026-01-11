package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a0;
import java.util.ArrayList;

public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<f0> f1849a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f1850b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f1851c;

    /* renamed from: s  reason: collision with root package name */
    public b[] f1852s;

    /* renamed from: t  reason: collision with root package name */
    public int f1853t;

    /* renamed from: u  reason: collision with root package name */
    public String f1854u = null;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<String> f1855v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<c> f1856w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<String> f1857x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<Bundle> f1858y = new ArrayList<>();
    public ArrayList<a0.j> z;

    public class a implements Parcelable.Creator<c0> {
        public final Object createFromParcel(Parcel parcel) {
            return new c0(parcel);
        }

        public final Object[] newArray(int i) {
            return new c0[i];
        }
    }

    public c0() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1849a);
        parcel.writeStringList(this.f1850b);
        parcel.writeStringList(this.f1851c);
        parcel.writeTypedArray(this.f1852s, i);
        parcel.writeInt(this.f1853t);
        parcel.writeString(this.f1854u);
        parcel.writeStringList(this.f1855v);
        parcel.writeTypedList(this.f1856w);
        parcel.writeStringList(this.f1857x);
        parcel.writeTypedList(this.f1858y);
        parcel.writeTypedList(this.z);
    }

    public c0(Parcel parcel) {
        this.f1849a = parcel.createTypedArrayList(f0.CREATOR);
        this.f1850b = parcel.createStringArrayList();
        this.f1851c = parcel.createStringArrayList();
        this.f1852s = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1853t = parcel.readInt();
        this.f1854u = parcel.readString();
        this.f1855v = parcel.createStringArrayList();
        this.f1856w = parcel.createTypedArrayList(c.CREATOR);
        this.f1857x = parcel.createStringArrayList();
        this.f1858y = parcel.createTypedArrayList(Bundle.CREATOR);
        this.z = parcel.createTypedArrayList(a0.j.CREATOR);
    }
}
