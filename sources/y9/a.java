package y9;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import di.c;
import e6.e;
import java.util.List;
import md.m;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xd.q;

public final class a extends ScanCallback {

    /* renamed from: a  reason: collision with root package name */
    public final q<di.a, Integer, c, m> f13550a;

    /* renamed from: b  reason: collision with root package name */
    public final Logger f13551b = LoggerFactory.getLogger((Class<?>) d.class);

    public a(q<? super di.a, ? super Integer, ? super c, m> qVar) {
        e.D(qVar, "upstream");
        this.f13550a = qVar;
    }

    public final void onBatchScanResults(List<ScanResult> list) {
        e.D(list, "results");
        super.onBatchScanResults(list);
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i10 = i + 1;
            ScanResult scanResult = list.get(i);
            q<di.a, Integer, c, m> qVar = this.f13550a;
            BluetoothDevice device = scanResult.getDevice();
            e.C(device, "result.device");
            qVar.h(new c(device), Integer.valueOf(scanResult.getRssi()), new b(scanResult.getScanRecord()));
            i = i10;
        }
    }

    public final void onScanFailed(int i) {
        super.onScanFailed(i);
        this.f13551b.warn(e.a0("scan error: ", Integer.valueOf(i)));
    }

    public final void onScanResult(int i, ScanResult scanResult) {
        e.D(scanResult, "result");
        super.onScanResult(i, scanResult);
        q<di.a, Integer, c, m> qVar = this.f13550a;
        BluetoothDevice device = scanResult.getDevice();
        e.C(device, "result.device");
        qVar.h(new c(device), Integer.valueOf(scanResult.getRssi()), new b(scanResult.getScanRecord()));
    }
}
