package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.i0;
import java.util.ArrayList;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final ArrayList<String> A;
    public final ArrayList<String> B;
    public final boolean C;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f1837a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f1838b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f1839c;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f1840s;

    /* renamed from: t  reason: collision with root package name */
    public final int f1841t;

    /* renamed from: u  reason: collision with root package name */
    public final String f1842u;

    /* renamed from: v  reason: collision with root package name */
    public final int f1843v;

    /* renamed from: w  reason: collision with root package name */
    public final int f1844w;

    /* renamed from: x  reason: collision with root package name */
    public final CharSequence f1845x;

    /* renamed from: y  reason: collision with root package name */
    public final int f1846y;
    public final CharSequence z;

    public class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public b(a aVar) {
        int size = aVar.f1918a.size();
        this.f1837a = new int[(size * 6)];
        if (aVar.g) {
            this.f1838b = new ArrayList<>(size);
            this.f1839c = new int[size];
            this.f1840s = new int[size];
            int i = 0;
            int i10 = 0;
            while (i < size) {
                i0.a aVar2 = aVar.f1918a.get(i);
                int i11 = i10 + 1;
                this.f1837a[i10] = aVar2.f1932a;
                ArrayList<String> arrayList = this.f1838b;
                Fragment fragment = aVar2.f1933b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f1837a;
                int i12 = i11 + 1;
                iArr[i11] = aVar2.f1934c;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f1935d;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f1936e;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f1937f;
                iArr[i15] = aVar2.g;
                this.f1839c[i] = aVar2.f1938h.ordinal();
                this.f1840s[i] = aVar2.i.ordinal();
                i++;
                i10 = i15 + 1;
            }
            this.f1841t = aVar.f1923f;
            this.f1842u = aVar.i;
            this.f1843v = aVar.f1801s;
            this.f1844w = aVar.f1925j;
            this.f1845x = aVar.f1926k;
            this.f1846y = aVar.f1927l;
            this.z = aVar.f1928m;
            this.A = aVar.f1929n;
            this.B = aVar.f1930o;
            this.C = aVar.f1931p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1837a);
        parcel.writeStringList(this.f1838b);
        parcel.writeIntArray(this.f1839c);
        parcel.writeIntArray(this.f1840s);
        parcel.writeInt(this.f1841t);
        parcel.writeString(this.f1842u);
        parcel.writeInt(this.f1843v);
        parcel.writeInt(this.f1844w);
        TextUtils.writeToParcel(this.f1845x, parcel, 0);
        parcel.writeInt(this.f1846y);
        TextUtils.writeToParcel(this.z, parcel, 0);
        parcel.writeStringList(this.A);
        parcel.writeStringList(this.B);
        parcel.writeInt(this.C ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f1837a = parcel.createIntArray();
        this.f1838b = parcel.createStringArrayList();
        this.f1839c = parcel.createIntArray();
        this.f1840s = parcel.createIntArray();
        this.f1841t = parcel.readInt();
        this.f1842u = parcel.readString();
        this.f1843v = parcel.readInt();
        this.f1844w = parcel.readInt();
        this.f1845x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1846y = parcel.readInt();
        this.z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A = parcel.createStringArrayList();
        this.B = parcel.createStringArrayList();
        this.C = parcel.readInt() != 0;
    }
}
