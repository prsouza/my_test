package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzc implements Parcelable.Creator<CircleOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        LatLng latLng = null;
        ArrayList<PatternItem> arrayList = null;
        int i = 0;
        int i10 = 0;
        boolean z = false;
        boolean z10 = false;
        double d10 = 0.0d;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel2, readHeader, LatLng.CREATOR);
                    break;
                case 3:
                    d10 = SafeParcelReader.readDouble(parcel2, readHeader);
                    break;
                case 4:
                    f10 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 5:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 6:
                    i10 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 7:
                    f11 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 8:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 9:
                    z10 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 10:
                    arrayList = SafeParcelReader.createTypedList(parcel2, readHeader, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new CircleOptions(latLng, d10, f10, i, i10, f11, z, z10, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }
}
