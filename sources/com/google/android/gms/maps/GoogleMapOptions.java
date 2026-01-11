package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzab();
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZOrderOnTopForParcel", id = 2, type = "byte")
    private Boolean zza;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", id = 3, type = "byte")
    private Boolean zzb;
    @SafeParcelable.Field(getter = "getMapType", id = 4)
    private int zzc = -1;
    @SafeParcelable.Field(getter = "getCamera", id = 5)
    private CameraPosition zzd;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", id = 6, type = "byte")
    private Boolean zze;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getCompassEnabledForParcel", id = 7, type = "byte")
    private Boolean zzf;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzg;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzh;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", id = 10, type = "byte")
    private Boolean zzi;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", id = 11, type = "byte")
    private Boolean zzj;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLiteModeForParcel", id = 12, type = "byte")
    private Boolean zzk;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", id = 14, type = "byte")
    private Boolean zzl;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getAmbientEnabledForParcel", id = 15, type = "byte")
    private Boolean zzm;
    @SafeParcelable.Field(getter = "getMinZoomPreference", id = 16)
    private Float zzn = null;
    @SafeParcelable.Field(getter = "getMaxZoomPreference", id = 17)
    private Float zzo = null;
    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", id = 18)
    private LatLngBounds zzp = null;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", id = 19, type = "byte")
    private Boolean zzq;
    @SafeParcelable.Field(getter = "getBackgroundColor", id = 20)
    private Integer zzr = null;
    @SafeParcelable.Field(getter = "getMapId", id = 21)
    private String zzs = null;

    public GoogleMapOptions() {
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = R.styleable.MapAttrs_mapType;
        if (obtainAttributes.hasValue(i)) {
            googleMapOptions.mapType(obtainAttributes.getInt(i, -1));
        }
        int i10 = R.styleable.MapAttrs_zOrderOnTop;
        if (obtainAttributes.hasValue(i10)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(i10, false));
        }
        int i11 = R.styleable.MapAttrs_useViewLifecycle;
        if (obtainAttributes.hasValue(i11)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(i11, false));
        }
        int i12 = R.styleable.MapAttrs_uiCompass;
        if (obtainAttributes.hasValue(i12)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(i12, true));
        }
        int i13 = R.styleable.MapAttrs_uiRotateGestures;
        if (obtainAttributes.hasValue(i13)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(i13, true));
        }
        int i14 = R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (obtainAttributes.hasValue(i14)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(obtainAttributes.getBoolean(i14, true));
        }
        int i15 = R.styleable.MapAttrs_uiScrollGestures;
        if (obtainAttributes.hasValue(i15)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(i15, true));
        }
        int i16 = R.styleable.MapAttrs_uiTiltGestures;
        if (obtainAttributes.hasValue(i16)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(i16, true));
        }
        int i17 = R.styleable.MapAttrs_uiZoomGestures;
        if (obtainAttributes.hasValue(i17)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(i17, true));
        }
        int i18 = R.styleable.MapAttrs_uiZoomControls;
        if (obtainAttributes.hasValue(i18)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(i18, true));
        }
        int i19 = R.styleable.MapAttrs_liteMode;
        if (obtainAttributes.hasValue(i19)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(i19, false));
        }
        int i20 = R.styleable.MapAttrs_uiMapToolbar;
        if (obtainAttributes.hasValue(i20)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(i20, true));
        }
        int i21 = R.styleable.MapAttrs_ambientEnabled;
        if (obtainAttributes.hasValue(i21)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(i21, false));
        }
        int i22 = R.styleable.MapAttrs_cameraMinZoomPreference;
        if (obtainAttributes.hasValue(i22)) {
            googleMapOptions.minZoomPreference(obtainAttributes.getFloat(i22, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(i22)) {
            googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        TypedArray obtainAttributes2 = context.getResources().obtainAttributes(attributeSet, new int[]{zzc(context, "backgroundColor"), zzc(context, "mapId")});
        if (obtainAttributes2.hasValue(0)) {
            googleMapOptions.backgroundColor(Integer.valueOf(obtainAttributes2.getColor(0, 0)));
        }
        if (obtainAttributes2.hasValue(1) && (string = obtainAttributes2.getString(1)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        obtainAttributes2.recycle();
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public static CameraPosition zza(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i = R.styleable.MapAttrs_cameraTargetLat;
        float f10 = obtainAttributes.hasValue(i) ? obtainAttributes.getFloat(i, 0.0f) : 0.0f;
        int i10 = R.styleable.MapAttrs_cameraTargetLng;
        LatLng latLng = new LatLng((double) f10, (double) (obtainAttributes.hasValue(i10) ? obtainAttributes.getFloat(i10, 0.0f) : 0.0f));
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        int i11 = R.styleable.MapAttrs_cameraZoom;
        if (obtainAttributes.hasValue(i11)) {
            builder.zoom(obtainAttributes.getFloat(i11, 0.0f));
        }
        int i12 = R.styleable.MapAttrs_cameraBearing;
        if (obtainAttributes.hasValue(i12)) {
            builder.bearing(obtainAttributes.getFloat(i12, 0.0f));
        }
        int i13 = R.styleable.MapAttrs_cameraTilt;
        if (obtainAttributes.hasValue(i13)) {
            builder.tilt(obtainAttributes.getFloat(i13, 0.0f));
        }
        obtainAttributes.recycle();
        return builder.build();
    }

    public static LatLngBounds zzb(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i = R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        Float valueOf = obtainAttributes.hasValue(i) ? Float.valueOf(obtainAttributes.getFloat(i, 0.0f)) : null;
        int i10 = R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float valueOf2 = obtainAttributes.hasValue(i10) ? Float.valueOf(obtainAttributes.getFloat(i10, 0.0f)) : null;
        int i11 = R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float valueOf3 = obtainAttributes.hasValue(i11) ? Float.valueOf(obtainAttributes.getFloat(i11, 0.0f)) : null;
        int i12 = R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float valueOf4 = obtainAttributes.hasValue(i12) ? Float.valueOf(obtainAttributes.getFloat(i12, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    private static int zzc(Context context, String str) {
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    public GoogleMapOptions ambientEnabled(boolean z) {
        this.zzm = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions backgroundColor(Integer num) {
        this.zzr = num;
        return this;
    }

    public GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zzd = cameraPosition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean z) {
        this.zzf = Boolean.valueOf(z);
        return this;
    }

    public Boolean getAmbientEnabled() {
        return this.zzm;
    }

    public Integer getBackgroundColor() {
        return this.zzr;
    }

    public CameraPosition getCamera() {
        return this.zzd;
    }

    public Boolean getCompassEnabled() {
        return this.zzf;
    }

    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzp;
    }

    public Boolean getLiteMode() {
        return this.zzk;
    }

    public String getMapId() {
        return this.zzs;
    }

    public Boolean getMapToolbarEnabled() {
        return this.zzl;
    }

    public int getMapType() {
        return this.zzc;
    }

    public Float getMaxZoomPreference() {
        return this.zzo;
    }

    public Float getMinZoomPreference() {
        return this.zzn;
    }

    public Boolean getRotateGesturesEnabled() {
        return this.zzj;
    }

    public Boolean getScrollGesturesEnabled() {
        return this.zzg;
    }

    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzq;
    }

    public Boolean getTiltGesturesEnabled() {
        return this.zzi;
    }

    public Boolean getUseViewLifecycleInFragment() {
        return this.zzb;
    }

    public Boolean getZOrderOnTop() {
        return this.zza;
    }

    public Boolean getZoomControlsEnabled() {
        return this.zze;
    }

    public Boolean getZoomGesturesEnabled() {
        return this.zzh;
    }

    public GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.zzp = latLngBounds;
        return this;
    }

    public GoogleMapOptions liteMode(boolean z) {
        this.zzk = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapId(String str) {
        this.zzs = str;
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzl = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions mapType(int i) {
        this.zzc = i;
        return this;
    }

    public GoogleMapOptions maxZoomPreference(float f10) {
        this.zzo = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions minZoomPreference(float f10) {
        this.zzn = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzj = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzg = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z) {
        this.zzq = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzi = Boolean.valueOf(z);
        return this;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.zzc)).add("LiteMode", this.zzk).add("Camera", this.zzd).add("CompassEnabled", this.zzf).add("ZoomControlsEnabled", this.zze).add("ScrollGesturesEnabled", this.zzg).add("ZoomGesturesEnabled", this.zzh).add("TiltGesturesEnabled", this.zzi).add("RotateGesturesEnabled", this.zzj).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzq).add("MapToolbarEnabled", this.zzl).add("AmbientEnabled", this.zzm).add("MinZoomPreference", this.zzn).add("MaxZoomPreference", this.zzo).add("BackgroundColor", this.zzr).add("LatLngBoundsForCameraTarget", this.zzp).add("ZOrderOnTop", this.zza).add("UseViewLifecycleInFragment", this.zzb).toString();
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzb = Boolean.valueOf(z);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, zza.zza(this.zza));
        SafeParcelWriter.writeByte(parcel, 3, zza.zza(this.zzb));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i, false);
        SafeParcelWriter.writeByte(parcel, 6, zza.zza(this.zze));
        SafeParcelWriter.writeByte(parcel, 7, zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 8, zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 9, zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 10, zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 11, zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 12, zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 14, zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 15, zza.zza(this.zzm));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i, false);
        SafeParcelWriter.writeByte(parcel, 19, zza.zza(this.zzq));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public GoogleMapOptions zOrderOnTop(boolean z) {
        this.zza = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zze = Boolean.valueOf(z);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzh = Boolean.valueOf(z);
        return this;
    }

    @SafeParcelable.Constructor
    public GoogleMapOptions(@SafeParcelable.Param(id = 2) byte b10, @SafeParcelable.Param(id = 3) byte b11, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(id = 6) byte b12, @SafeParcelable.Param(id = 7) byte b13, @SafeParcelable.Param(id = 8) byte b14, @SafeParcelable.Param(id = 9) byte b15, @SafeParcelable.Param(id = 10) byte b16, @SafeParcelable.Param(id = 11) byte b17, @SafeParcelable.Param(id = 12) byte b18, @SafeParcelable.Param(id = 14) byte b19, @SafeParcelable.Param(id = 15) byte b20, @SafeParcelable.Param(id = 16) Float f10, @SafeParcelable.Param(id = 17) Float f11, @SafeParcelable.Param(id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 19) byte b21, @SafeParcelable.Param(id = 20) Integer num, @SafeParcelable.Param(id = 21) String str) {
        this.zza = zza.zzb(b10);
        this.zzb = zza.zzb(b11);
        this.zzc = i;
        this.zzd = cameraPosition;
        this.zze = zza.zzb(b12);
        this.zzf = zza.zzb(b13);
        this.zzg = zza.zzb(b14);
        this.zzh = zza.zzb(b15);
        this.zzi = zza.zzb(b16);
        this.zzj = zza.zzb(b17);
        this.zzk = zza.zzb(b18);
        this.zzl = zza.zzb(b19);
        this.zzm = zza.zzb(b20);
        this.zzn = f10;
        this.zzo = f11;
        this.zzp = latLngBounds;
        this.zzq = zza.zzb(b21);
        this.zzr = num;
        this.zzs = str;
    }
}
