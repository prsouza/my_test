package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzi implements Parcelable.Creator<MarkerOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        boolean z10 = false;
        boolean z11 = false;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.5f;
        float f16 = 1.0f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel2, readHeader, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 5:
                    iBinder = SafeParcelReader.readIBinder(parcel2, readHeader);
                    break;
                case 6:
                    f10 = SafeParcelReader.readFloat(parcel2, readHeader);
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
                    z11 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 11:
                    f12 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 12:
                    f15 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 13:
                    f13 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 14:
                    f16 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 15:
                    f14 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new MarkerOptions(latLng, str, str2, iBinder, f10, f11, z, z10, z11, f12, f15, f13, f16, f14);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
