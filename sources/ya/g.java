package ya;

public enum g {
    APP_STARTED("app started"),
    ONBOARD_STARTED("onboarding started"),
    NODLE_ACKNOWLEDGE("about network acknowledged"),
    WALLET_CREATE("wallet creation initiated"),
    WALLET_IMPORT("wallet import initiated"),
    SEED_ENTERED("wallet seed entered"),
    SEED_CONFIRMED("wallet seed confirmed"),
    WALLET_SETUP_DONE("wallet setup finished"),
    LOCATION_PERMISSION_REQUEST("location info sheet opened"),
    LOCATION_PERMISSION_REQUEST_DIALOG("location dialog opened"),
    BLE_PERMISSION_REQUEST("ble info sheet opened"),
    BLE_PERMISSION_REQUEST_DIALOG("ble dialog opened"),
    LOCATION_ENABLE_REQUEST("enable location info sheet opened"),
    BLE_ENABLE_REQUEST("enable ble info sheet opened"),
    LOCATION_ENABLE_REQUEST_DIALOG("enable location dialog opened"),
    LOCATION_PERMISSION_GRANTED("location allowed"),
    BLE_PERMISSION_GRANTED("ble allowed"),
    LOCATION_ENABLED("location enabled"),
    BLE_ENABLED("ble enabled");
    

    /* renamed from: id  reason: collision with root package name */
    private final String f13576id;

    private g(String str) {
        this.f13576id = str;
    }

    public final String getId() {
        return this.f13576id;
    }
}
