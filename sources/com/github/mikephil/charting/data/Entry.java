package com.github.mikephil.charting.data;

import a.a;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;

public class Entry extends BaseEntry implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new Parcelable.Creator<Entry>() {
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        public Entry[] newArray(int i) {
            return new Entry[i];
        }
    };

    /* renamed from: x  reason: collision with root package name */
    private float f3605x;

    public Entry() {
        this.f3605x = 0.0f;
    }

    public Entry copy() {
        return new Entry(this.f3605x, getY(), getData());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equalTo(Entry entry) {
        if (entry == null || entry.getData() != getData()) {
            return false;
        }
        float abs = Math.abs(entry.f3605x - this.f3605x);
        float f10 = Utils.FLOAT_EPSILON;
        if (abs <= f10 && Math.abs(entry.getY() - getY()) <= f10) {
            return true;
        }
        return false;
    }

    public float getX() {
        return this.f3605x;
    }

    public void setX(float f10) {
        this.f3605x = f10;
    }

    public String toString() {
        StringBuilder d10 = a.d("Entry, x: ");
        d10.append(this.f3605x);
        d10.append(" y: ");
        d10.append(getY());
        return d10.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f3605x);
        parcel.writeFloat(getY());
        if (getData() == null) {
            parcel.writeInt(0);
        } else if (getData() instanceof Parcelable) {
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) getData(), i);
        } else {
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
    }

    public Entry(float f10, float f11) {
        super(f11);
        this.f3605x = f10;
    }

    public Entry(float f10, float f11, Object obj) {
        super(f11, obj);
        this.f3605x = f10;
    }

    public Entry(float f10, float f11, Drawable drawable) {
        super(f11, drawable);
        this.f3605x = f10;
    }

    public Entry(float f10, float f11, Drawable drawable, Object obj) {
        super(f11, drawable, obj);
        this.f3605x = f10;
    }

    public Entry(Parcel parcel) {
        this.f3605x = 0.0f;
        this.f3605x = parcel.readFloat();
        setY(parcel.readFloat());
        if (parcel.readInt() == 1) {
            setData(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }
}
