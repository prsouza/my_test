package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

public final class zzbb implements Parcelable.Creator<zzba> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList<ClientIdentity> arrayList = zzba.zza;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 5:
                        arrayList = SafeParcelReader.createTypedList(parcel2, readHeader, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.createString(parcel2, readHeader);
                        break;
                    case 7:
                        z = SafeParcelReader.readBoolean(parcel2, readHeader);
                        break;
                    case 8:
                        z10 = SafeParcelReader.readBoolean(parcel2, readHeader);
                        break;
                    case 9:
                        z11 = SafeParcelReader.readBoolean(parcel2, readHeader);
                        break;
                    case 10:
                        str2 = SafeParcelReader.createString(parcel2, readHeader);
                        break;
                    case 11:
                        z12 = SafeParcelReader.readBoolean(parcel2, readHeader);
                        break;
                    case 12:
                        z13 = SafeParcelReader.readBoolean(parcel2, readHeader);
                        break;
                    case 13:
                        str3 = SafeParcelReader.createString(parcel2, readHeader);
                        break;
                    case 14:
                        j10 = SafeParcelReader.readLong(parcel2, readHeader);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel2, readHeader);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.createParcelable(parcel2, readHeader, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzba(locationRequest, arrayList, str, z, z10, z11, str2, z12, z13, str3, j10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzba[i];
    }
}
