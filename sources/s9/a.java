package s9;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import e6.e;

public final class a extends AdvertiseCallback {
    public final void onStartFailure(int i) {
        super.onStartFailure(i);
        b.f11022a.info(e.a0("[!] advertising failed to start: ", Integer.valueOf(i)));
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        e.D(advertiseSettings, "settingsInEffect");
        super.onStartSuccess(advertiseSettings);
        b.f11022a.info("[+] advertising started");
    }
}
