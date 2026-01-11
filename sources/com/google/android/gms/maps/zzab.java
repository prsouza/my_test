package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class zzab implements Parcelable.Creator<GoogleMapOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        CameraPosition cameraPosition = null;
        Float f10 = null;
        Float f11 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        byte b14 = -1;
        byte b15 = -1;
        byte b16 = -1;
        byte b17 = -1;
        byte b18 = -1;
        byte b19 = -1;
        byte b20 = -1;
        byte b21 = -1;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    b10 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 3:
                    b11 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 4:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.createParcelable(parcel2, readHeader, CameraPosition.CREATOR);
                    break;
                case 6:
                    b12 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 7:
                    b13 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 8:
                    b14 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 9:
                    b15 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 10:
                    b16 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 11:
                    b17 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 12:
                    b18 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 14:
                    b19 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 15:
                    b20 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 16:
                    f10 = SafeParcelReader.readFloatObject(parcel2, readHeader);
                    break;
                case 17:
                    f11 = SafeParcelReader.readFloatObject(parcel2, readHeader);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel2, readHeader, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b21 = SafeParcelReader.readByte(parcel2, readHeader);
                    break;
                case 20:
                    num = SafeParcelReader.readIntegerObject(parcel2, readHeader);
                    break;
                case 21:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new GoogleMapOptions(b10, b11, i, cameraPosition, b12, b13, b14, b15, b16, b17, b18, b19, b20, f10, f11, latLngBounds, b21, num, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
