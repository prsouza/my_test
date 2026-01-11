package y9;

import android.bluetooth.BluetoothDevice;
import di.a;
import e6.e;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final BluetoothDevice f13556a;

    public c(BluetoothDevice bluetoothDevice) {
        e.D(bluetoothDevice, "bluetoothDevice");
        this.f13556a = bluetoothDevice;
    }

    public final String a() {
        String address = this.f13556a.getAddress();
        e.C(address, "bluetoothDevice.address");
        return address;
    }
}
