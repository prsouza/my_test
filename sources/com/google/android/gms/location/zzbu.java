package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbu implements Parcelable.Creator<SleepClassifyEvent> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z = false;
        int i16 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    i10 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    i14 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    i15 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    i16 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new SleepClassifyEvent(i, i10, i11, i12, i13, i14, i15, z, i16);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SleepClassifyEvent[i];
    }
}
