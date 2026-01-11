package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzj();
    private static final String zza = "PatternItem";
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getLength", id = 3)
    private final Float zzc;

    static {
        Class<PatternItem> cls = PatternItem.class;
    }

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) Float f10) {
        boolean z = false;
        if (i == 1 || (f10 != null && f10.floatValue() >= 0.0f)) {
            z = true;
        }
        String valueOf = String.valueOf(f10);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 45);
        sb2.append("Invalid PatternItem: type=");
        sb2.append(i);
        sb2.append(" length=");
        sb2.append(valueOf);
        Preconditions.checkArgument(z, sb2.toString());
        this.zzb = i;
        this.zzc = f10;
    }

    public static List<PatternItem> zza(List<PatternItem> list) {
        PatternItem patternItem;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (PatternItem next : list) {
            if (next == null) {
                next = null;
            } else {
                int i = next.zzb;
                boolean z = false;
                if (i == 0) {
                    if (next.zzc != null) {
                        z = true;
                    }
                    Preconditions.checkState(z, "length must not be null.");
                    patternItem = new Dash(next.zzc.floatValue());
                } else if (i == 1) {
                    next = new Dot();
                } else if (i != 2) {
                    String str = zza;
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unknown PatternItem type: ");
                    sb2.append(i);
                    Log.w(str, sb2.toString());
                } else {
                    if (next.zzc != null) {
                        z = true;
                    }
                    Preconditions.checkState(z, "length must not be null.");
                    patternItem = new Gap(next.zzc.floatValue());
                }
                next = patternItem;
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.zzb == patternItem.zzb && Objects.equal(this.zzc, patternItem.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc);
    }

    public String toString() {
        int i = this.zzb;
        String valueOf = String.valueOf(this.zzc);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
        sb2.append("[PatternItem: type=");
        sb2.append(i);
        sb2.append(" length=");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
