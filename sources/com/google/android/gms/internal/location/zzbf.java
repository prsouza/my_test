package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbf implements Parcelable.Creator<zzbe> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i = 0;
        short s10 = 0;
        int i10 = 0;
        String str = null;
        float f10 = 0.0f;
        long j10 = 0;
        int i11 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 2:
                    j10 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 3:
                    s10 = SafeParcelReader.readShort(parcel2, readHeader);
                    break;
                case 4:
                    d10 = SafeParcelReader.readDouble(parcel2, readHeader);
                    break;
                case 5:
                    d11 = SafeParcelReader.readDouble(parcel2, readHeader);
                    break;
                case 6:
                    f10 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 7:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 8:
                    i10 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 9:
                    i11 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzbe(str, i, s10, d10, d11, f10, j10, i10, i11);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbe[i];
    }
}
