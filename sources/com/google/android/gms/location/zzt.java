package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzt implements Parcelable.Creator<zzs> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = true;
        long j10 = 50;
        float f10 = 0.0f;
        long j11 = Long.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                z = SafeParcelReader.readBoolean(parcel2, readHeader);
            } else if (fieldId == 2) {
                j10 = SafeParcelReader.readLong(parcel2, readHeader);
            } else if (fieldId == 3) {
                f10 = SafeParcelReader.readFloat(parcel2, readHeader);
            } else if (fieldId == 4) {
                j11 = SafeParcelReader.readLong(parcel2, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel2, readHeader);
            } else {
                i = SafeParcelReader.readInt(parcel2, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzs(z, j10, f10, j11, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
