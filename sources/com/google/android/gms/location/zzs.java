package com.google.android.gms.location;

import a.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "DeviceOrientationRequestCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SHOULD_USE_MAG", id = 1)
    public boolean zza;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_MINIMUM_SAMPLING_PERIOD_MS", id = 2)
    public long zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SMALLEST_ANGLE_CHANGE_RADIANS", id = 3)
    public float zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_EXPIRE_AT_MS", id = 4)
    public long zzd;
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_NUM_UPDATES", id = 5)
    public int zze;

    public zzs() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzs = (zzs) obj;
        return this.zza == zzs.zza && this.zzb == zzs.zzb && Float.compare(this.zzc, zzs.zzc) == 0 && this.zzd == zzs.zzd && this.zze == zzs.zze;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzc), Long.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        StringBuilder d10 = a.d("DeviceOrientationRequest[mShouldUseMag=");
        d10.append(this.zza);
        d10.append(" mMinimumSamplingPeriodMs=");
        d10.append(this.zzb);
        d10.append(" mSmallestAngleChangeRadians=");
        d10.append(this.zzc);
        long j10 = this.zzd;
        if (j10 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d10.append(" expireIn=");
            d10.append(j10 - elapsedRealtime);
            d10.append("ms");
        }
        if (this.zze != Integer.MAX_VALUE) {
            d10.append(" num=");
            d10.append(this.zze);
        }
        d10.append(']');
        return d10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeFloat(parcel, 3, this.zzc);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) long j10, @SafeParcelable.Param(id = 3) float f10, @SafeParcelable.Param(id = 4) long j11, @SafeParcelable.Param(id = 5) int i) {
        this.zza = z;
        this.zzb = j10;
        this.zzc = f10;
        this.zzd = j11;
        this.zze = i;
    }
}
