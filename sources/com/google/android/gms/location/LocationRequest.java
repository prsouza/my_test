package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.a;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzbf();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_PRIORITY", id = 1)
    public int zza;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_INTERVAL", id = 2)
    public long zzb;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_FASTEST_INTERVAL", id = 3)
    public long zzc;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPLICIT_FASTEST_INTERVAL", id = 4)
    public boolean zzd;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_EXPIRE_AT", id = 5)
    public long zze;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_NUM_UPDATES", id = 6)
    public int zzf;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_SMALLEST_DISPLACEMENT", id = 7)
    public float zzg;
    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequest.DEFAULT_MAX_WAIT_TIME", id = 8)
    public long zzh;
    @SafeParcelable.Field(defaultValue = "false", id = 9)
    public boolean zzi;

    @Deprecated
    public LocationRequest() {
        this.zza = PRIORITY_BALANCED_POWER_ACCURACY;
        this.zzb = 3600000;
        this.zzc = 600000;
        this.zzd = false;
        this.zze = Long.MAX_VALUE;
        this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzg = 0.0f;
        this.zzh = 0;
        this.zzi = false;
    }

    public static LocationRequest create() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setWaitForAccurateLocation(true);
        return locationRequest;
    }

    private static void zza(long j10) {
        if (j10 < 0) {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("invalid interval: ");
            sb2.append(j10);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && this.zzb == locationRequest.zzb && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.zzi == locationRequest.zzi) {
                return true;
            }
            return false;
        }
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long j10 = this.zzh;
        long j11 = this.zzb;
        return j10 < j11 ? j11 : j10;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzg), Long.valueOf(this.zzh));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    public LocationRequest setExpirationDuration(long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = Long.MAX_VALUE;
        if (j10 <= Long.MAX_VALUE - elapsedRealtime) {
            j11 = j10 + elapsedRealtime;
        }
        this.zze = j11;
        if (j11 < 0) {
            this.zze = 0;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long j10) {
        this.zze = j10;
        if (j10 < 0) {
            this.zze = 0;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long j10) {
        zza(j10);
        this.zzd = true;
        this.zzc = j10;
        return this;
    }

    public LocationRequest setInterval(long j10) {
        zza(j10);
        this.zzb = j10;
        if (!this.zzd) {
            this.zzc = (long) (((double) j10) / 6.0d);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long j10) {
        zza(j10);
        this.zzh = j10;
        return this;
    }

    public LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.zzf = i;
            return this;
        }
        throw new IllegalArgumentException(a.b(31, "invalid numUpdates: ", i));
    }

    public LocationRequest setPriority(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.zza = i;
            return this;
        }
        throw new IllegalArgumentException(a.b(28, "invalid quality: ", i));
    }

    public LocationRequest setSmallestDisplacement(float f10) {
        if (f10 >= 0.0f) {
            this.zzg = f10;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("invalid displacement: ");
        sb2.append(f10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.zzi = z;
        return this;
    }

    public String toString() {
        StringBuilder d10 = a.a.d("Request[");
        int i = this.zza;
        d10.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.zza != 105) {
            d10.append(" requested=");
            d10.append(this.zzb);
            d10.append("ms");
        }
        d10.append(" fastest=");
        d10.append(this.zzc);
        d10.append("ms");
        if (this.zzh > this.zzb) {
            d10.append(" maxWait=");
            d10.append(this.zzh);
            d10.append("ms");
        }
        if (this.zzg > 0.0f) {
            d10.append(" smallestDisplacement=");
            d10.append(this.zzg);
            d10.append("m");
        }
        long j10 = this.zze;
        if (j10 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            d10.append(" expireIn=");
            d10.append(j10 - elapsedRealtime);
            d10.append("ms");
        }
        if (this.zzf != Integer.MAX_VALUE) {
            d10.append(" num=");
            d10.append(this.zzf);
        }
        d10.append(']');
        return d10.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j10, @SafeParcelable.Param(id = 3) long j11, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) long j12, @SafeParcelable.Param(id = 6) int i10, @SafeParcelable.Param(id = 7) float f10, @SafeParcelable.Param(id = 8) long j13, @SafeParcelable.Param(id = 9) boolean z10) {
        this.zza = i;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = z;
        this.zze = j12;
        this.zzf = i10;
        this.zzg = f10;
        this.zzh = j13;
        this.zzi = z10;
    }
}
