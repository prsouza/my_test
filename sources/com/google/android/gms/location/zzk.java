package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzk implements Parcelable.Creator<ActivityRecognitionResult> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = 0;
        long j11 = 0;
        ArrayList<DetectedActivity> arrayList = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, DetectedActivity.CREATOR);
            } else if (fieldId == 2) {
                j10 = SafeParcelReader.readLong(parcel, readHeader);
            } else if (fieldId == 3) {
                j11 = SafeParcelReader.readLong(parcel, readHeader);
            } else if (fieldId == 4) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bundle = SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new ActivityRecognitionResult(arrayList, j10, j11, i, bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
