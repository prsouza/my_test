package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.R;
import java.util.ArrayList;
import java.util.List;

public final class zzq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z = true;
        boolean z10 = true;
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        boolean z11 = false;
        int i = 0;
        boolean z12 = false;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str10 = null;
        String str11 = null;
        long j15 = -2147483648L;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 3:
                    str4 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 4:
                    str5 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 5:
                    str6 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 6:
                    j10 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 7:
                    j11 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 8:
                    str7 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 9:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 10:
                    z11 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 11:
                    j15 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 12:
                    str8 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 13:
                    j12 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 14:
                    j13 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 15:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 16:
                    z10 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 18:
                    z12 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 19:
                    str9 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 21:
                    bool = SafeParcelReader.readBooleanObject(parcel2, readHeader);
                    break;
                case 22:
                    j14 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 23:
                    arrayList = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 24:
                    str10 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case R.styleable.MapAttrs_zOrderOnTop:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 26:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 27:
                    str11 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzp(str3, str4, str5, str6, j10, j11, str7, z, z11, j15, str8, j12, j13, i, z10, z12, str9, bool, j14, (List) arrayList, str10, str, str2, str11);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzp[i];
    }
}
