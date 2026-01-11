package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbf implements Parcelable.Creator<LocationRequest> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        boolean z10 = false;
        int i = 102;
        long j10 = 3600000;
        long j11 = 600000;
        long j12 = Long.MAX_VALUE;
        int i10 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        long j13 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 2:
                    j10 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 3:
                    j11 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 4:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 5:
                    j12 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 6:
                    i10 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 7:
                    f10 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 8:
                    j13 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 9:
                    z10 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new LocationRequest(i, j10, j11, z, j12, i10, f10, j13, z10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
