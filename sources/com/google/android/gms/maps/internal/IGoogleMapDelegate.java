package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzaa;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzag;
import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.internal.maps.zzo;
import com.google.android.gms.internal.maps.zzr;
import com.google.android.gms.internal.maps.zzx;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;

public interface IGoogleMapDelegate extends IInterface {
    zzl addCircle(CircleOptions circleOptions) throws RemoteException;

    zzo addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException;

    zzx addMarker(MarkerOptions markerOptions) throws RemoteException;

    zzaa addPolygon(PolygonOptions polygonOptions) throws RemoteException;

    zzad addPolyline(PolylineOptions polylineOptions) throws RemoteException;

    zzag addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException;

    void animateCamera(IObjectWrapper iObjectWrapper) throws RemoteException;

    void animateCameraWithCallback(IObjectWrapper iObjectWrapper, zzd zzd) throws RemoteException;

    void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i, zzd zzd) throws RemoteException;

    void clear() throws RemoteException;

    CameraPosition getCameraPosition() throws RemoteException;

    zzr getFocusedBuilding() throws RemoteException;

    void getMapAsync(zzar zzar) throws RemoteException;

    int getMapType() throws RemoteException;

    float getMaxZoomLevel() throws RemoteException;

    float getMinZoomLevel() throws RemoteException;

    Location getMyLocation() throws RemoteException;

    IProjectionDelegate getProjection() throws RemoteException;

    IUiSettingsDelegate getUiSettings() throws RemoteException;

    boolean isBuildingsEnabled() throws RemoteException;

    boolean isIndoorEnabled() throws RemoteException;

    boolean isMyLocationEnabled() throws RemoteException;

    boolean isTrafficEnabled() throws RemoteException;

    void moveCamera(IObjectWrapper iObjectWrapper) throws RemoteException;

    void onCreate(Bundle bundle) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onEnterAmbient(Bundle bundle) throws RemoteException;

    void onExitAmbient() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle bundle) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;

    void resetMinMaxZoomPreference() throws RemoteException;

    void setBuildingsEnabled(boolean z) throws RemoteException;

    void setContentDescription(String str) throws RemoteException;

    boolean setIndoorEnabled(boolean z) throws RemoteException;

    void setInfoWindowAdapter(zzi zzi) throws RemoteException;

    void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) throws RemoteException;

    void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException;

    boolean setMapStyle(MapStyleOptions mapStyleOptions) throws RemoteException;

    void setMapType(int i) throws RemoteException;

    void setMaxZoomPreference(float f10) throws RemoteException;

    void setMinZoomPreference(float f10) throws RemoteException;

    void setMyLocationEnabled(boolean z) throws RemoteException;

    void setOnCameraChangeListener(zzn zzn) throws RemoteException;

    void setOnCameraIdleListener(zzp zzp) throws RemoteException;

    void setOnCameraMoveCanceledListener(zzr zzr) throws RemoteException;

    void setOnCameraMoveListener(zzt zzt) throws RemoteException;

    void setOnCameraMoveStartedListener(zzv zzv) throws RemoteException;

    void setOnCircleClickListener(zzx zzx) throws RemoteException;

    void setOnGroundOverlayClickListener(zzz zzz) throws RemoteException;

    void setOnIndoorStateChangeListener(zzab zzab) throws RemoteException;

    void setOnInfoWindowClickListener(zzad zzad) throws RemoteException;

    void setOnInfoWindowCloseListener(zzaf zzaf) throws RemoteException;

    void setOnInfoWindowLongClickListener(zzah zzah) throws RemoteException;

    void setOnMapClickListener(zzal zzal) throws RemoteException;

    void setOnMapLoadedCallback(zzan zzan) throws RemoteException;

    void setOnMapLongClickListener(zzap zzap) throws RemoteException;

    void setOnMarkerClickListener(zzat zzat) throws RemoteException;

    void setOnMarkerDragListener(zzav zzav) throws RemoteException;

    void setOnMyLocationButtonClickListener(zzax zzax) throws RemoteException;

    void setOnMyLocationChangeListener(zzaz zzaz) throws RemoteException;

    void setOnMyLocationClickListener(zzbb zzbb) throws RemoteException;

    void setOnPoiClickListener(zzbd zzbd) throws RemoteException;

    void setOnPolygonClickListener(zzbf zzbf) throws RemoteException;

    void setOnPolylineClickListener(zzbh zzbh) throws RemoteException;

    void setPadding(int i, int i10, int i11, int i12) throws RemoteException;

    void setTrafficEnabled(boolean z) throws RemoteException;

    void setWatermarkEnabled(boolean z) throws RemoteException;

    void snapshot(zzbu zzbu, IObjectWrapper iObjectWrapper) throws RemoteException;

    void snapshotForTest(zzbu zzbu) throws RemoteException;

    void stopAnimation() throws RemoteException;

    boolean useViewLifecycleWhenInFragment() throws RemoteException;
}
