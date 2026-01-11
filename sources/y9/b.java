package y9;

import android.bluetooth.le.ScanRecord;
import android.os.Build;
import android.os.ParcelUuid;
import android.util.SparseArray;
import di.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final List<UUID> f13552a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ParcelUuid> f13553b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Integer, byte[]> f13554c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f13555d;

    public b(ScanRecord scanRecord) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f13553b = scanRecord.getServiceSolicitationUuids();
        } else {
            new ArrayList(0);
        }
        this.f13552a = (ArrayList) d(scanRecord.getServiceUuids());
        this.f13554c = (HashMap) e(scanRecord.getManufacturerSpecificData());
        scanRecord.getServiceData();
        scanRecord.getDeviceName();
        scanRecord.getAdvertiseFlags();
        scanRecord.getTxPowerLevel();
        this.f13555d = scanRecord.getBytes();
    }

    public final List<UUID> a() {
        return this.f13552a;
    }

    public final byte[] b() {
        return this.f13555d;
    }

    public final Map<Integer, byte[]> c() {
        return this.f13554c;
    }

    public final List<UUID> d(List<ParcelUuid> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ParcelUuid uuid : list) {
            arrayList.add(uuid.getUuid());
        }
        return arrayList;
    }

    public final Map<Integer, byte[]> e(SparseArray<byte[]> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < sparseArray.size(); i++) {
            hashMap.put(Integer.valueOf(sparseArray.keyAt(i)), sparseArray.valueAt(i));
        }
        return hashMap;
    }
}
