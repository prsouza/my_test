package r1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.github.mikephil.charting.BuildConfig;
import java.lang.reflect.Method;
import s.a;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f10520d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f10521e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10522f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public final String f10523h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f10524j;

    /* renamed from: k  reason: collision with root package name */
    public int f10525k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new a(), new a(), new a());
    }

    public final void a() {
        int i10 = this.i;
        if (i10 >= 0) {
            int i11 = this.f10520d.get(i10);
            int dataPosition = this.f10521e.dataPosition();
            this.f10521e.setDataPosition(i11);
            this.f10521e.writeInt(dataPosition - i11);
            this.f10521e.setDataPosition(dataPosition);
        }
    }

    public final a b() {
        Parcel parcel = this.f10521e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f10524j;
        if (i10 == this.f10522f) {
            i10 = this.g;
        }
        return new b(parcel, dataPosition, i10, android.support.v4.media.a.e(new StringBuilder(), this.f10523h, "  "), this.f10517a, this.f10518b, this.f10519c);
    }

    public final boolean f() {
        return this.f10521e.readInt() != 0;
    }

    public final byte[] g() {
        int readInt = this.f10521e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f10521e.readByteArray(bArr);
        return bArr;
    }

    public final CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f10521e);
    }

    public final boolean i(int i10) {
        while (this.f10524j < this.g) {
            int i11 = this.f10525k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f10521e.setDataPosition(this.f10524j);
            int readInt = this.f10521e.readInt();
            this.f10525k = this.f10521e.readInt();
            this.f10524j += readInt;
        }
        if (this.f10525k == i10) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f10521e.readInt();
    }

    public final <T extends Parcelable> T l() {
        return this.f10521e.readParcelable(b.class.getClassLoader());
    }

    public final String n() {
        return this.f10521e.readString();
    }

    public final void p(int i10) {
        a();
        this.i = i10;
        this.f10520d.put(i10, this.f10521e.dataPosition());
        t(0);
        t(i10);
    }

    public final void q(boolean z) {
        this.f10521e.writeInt(z ? 1 : 0);
    }

    public final void r(byte[] bArr) {
        if (bArr != null) {
            this.f10521e.writeInt(bArr.length);
            this.f10521e.writeByteArray(bArr);
            return;
        }
        this.f10521e.writeInt(-1);
    }

    public final void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f10521e, 0);
    }

    public final void t(int i10) {
        this.f10521e.writeInt(i10);
    }

    public final void v(Parcelable parcelable) {
        this.f10521e.writeParcelable(parcelable, 0);
    }

    public final void x(String str) {
        this.f10521e.writeString(str);
    }

    public b(Parcel parcel, int i10, int i11, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f10520d = new SparseIntArray();
        this.i = -1;
        this.f10525k = -1;
        this.f10521e = parcel;
        this.f10522f = i10;
        this.g = i11;
        this.f10524j = i10;
        this.f10523h = str;
    }
}
