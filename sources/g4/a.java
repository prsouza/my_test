package g4;

import android.bluetooth.BluetoothGattService;
import ca.d;
import e6.e;
import g9.b;
import g9.h;
import java.util.ArrayDeque;
import v3.m;

public final class a implements m, h, d {
    public /* synthetic */ a() {
    }

    public /* synthetic */ a(BluetoothGattService bluetoothGattService) {
        e.D(bluetoothGattService, "bluetoothGattService");
        bluetoothGattService.getUuid();
    }

    public /* synthetic */ a(b bVar) {
    }

    public final Object a() {
        return new ArrayDeque();
    }
}
