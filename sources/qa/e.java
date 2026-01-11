package qa;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.R;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.slf4j.helpers.MessageFormatter;

public enum e {
    FIRST_LAUNCH(100),
    NOTIFICATION(200),
    SCAN_MODE(300),
    FIRST_IOT(400),
    USERNAME(500),
    NODLE_SDK_DEVKEY(600),
    MNEMONIC(700),
    DEVICE_CACHE(800),
    APP_ANALYTICS(900),
    WIFI_ONLY(1000),
    LAUNCH_COUNT(1100),
    LAST_REWARD_TIMESTAMP(1200),
    REFERRER_NAME(1300),
    REFERRER(1400),
    NODLE_PUBLIC_KEY_5(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED),
    NODLE_DOLLAR_PRICE(1600),
    REWARDS_PENDING_DEVICE_COUNT(1700),
    DEFER_PERMISSION_TIMESTAMP(1800),
    ANNOUNCEMENTS_SEEN(1900),
    NODLE_AMOUNT(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE),
    PACKET_COUNT(2100),
    PARTNER(2200),
    FCM_TOKEN(2300),
    UPDATES(2400),
    NODLE_PUBLIC_KEY_4(2500),
    IS_CACHED_SUBSCAN(2600),
    IS_CACHED_CIDT(2700),
    LAST_CACHED_TRANSACTION_TIME(2701),
    FIRST_CACHED_TRANSACTION_TIME(2702),
    APP_METADATA(2800);
    
    private final int key;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10337a = null;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.FIRST_LAUNCH.ordinal()] = 1;
            iArr[e.NOTIFICATION.ordinal()] = 2;
            iArr[e.SCAN_MODE.ordinal()] = 3;
            iArr[e.FIRST_IOT.ordinal()] = 4;
            iArr[e.USERNAME.ordinal()] = 5;
            iArr[e.NODLE_SDK_DEVKEY.ordinal()] = 6;
            iArr[e.MNEMONIC.ordinal()] = 7;
            iArr[e.DEVICE_CACHE.ordinal()] = 8;
            iArr[e.APP_ANALYTICS.ordinal()] = 9;
            iArr[e.WIFI_ONLY.ordinal()] = 10;
            iArr[e.LAUNCH_COUNT.ordinal()] = 11;
            iArr[e.LAST_REWARD_TIMESTAMP.ordinal()] = 12;
            iArr[e.REFERRER_NAME.ordinal()] = 13;
            iArr[e.REFERRER.ordinal()] = 14;
            iArr[e.NODLE_PUBLIC_KEY_5.ordinal()] = 15;
            iArr[e.NODLE_DOLLAR_PRICE.ordinal()] = 16;
            iArr[e.REWARDS_PENDING_DEVICE_COUNT.ordinal()] = 17;
            iArr[e.DEFER_PERMISSION_TIMESTAMP.ordinal()] = 18;
            iArr[e.ANNOUNCEMENTS_SEEN.ordinal()] = 19;
            iArr[e.NODLE_AMOUNT.ordinal()] = 20;
            iArr[e.PACKET_COUNT.ordinal()] = 21;
            iArr[e.PARTNER.ordinal()] = 22;
            iArr[e.FCM_TOKEN.ordinal()] = 23;
            iArr[e.UPDATES.ordinal()] = 24;
            iArr[e.NODLE_PUBLIC_KEY_4.ordinal()] = 25;
            iArr[e.IS_CACHED_SUBSCAN.ordinal()] = 26;
            iArr[e.IS_CACHED_CIDT.ordinal()] = 27;
            iArr[e.LAST_CACHED_TRANSACTION_TIME.ordinal()] = 28;
            iArr[e.FIRST_CACHED_TRANSACTION_TIME.ordinal()] = 29;
            iArr[e.APP_METADATA.ordinal()] = 30;
            f10337a = iArr;
        }
    }

    private e(int i) {
        this.key = i;
    }

    /* renamed from: default  reason: not valid java name */
    public Object m16default() {
        int i = a.f10337a[ordinal()];
        int i10 = MessageFormatter.DELIM_STR;
        switch (i) {
            case 1:
                i10 = Boolean.TRUE;
                break;
            case 2:
                i10 = 202;
                break;
            case 3:
                i10 = Integer.valueOf(bb.e.ECO.ordinal());
                break;
            case 4:
                i10 = Boolean.TRUE;
                break;
            case 5:
                i10 = BuildConfig.FLAVOR;
                break;
            case 6:
                i10 = BuildConfig.FLAVOR;
                break;
            case 7:
                i10 = BuildConfig.FLAVOR;
                break;
            case 8:
            case 30:
                break;
            case 9:
                i10 = 901;
                break;
            case 10:
                i10 = 1002;
                break;
            case 11:
                i10 = 0L;
                break;
            case 12:
                i10 = 0L;
                break;
            case 13:
                i10 = BuildConfig.FLAVOR;
                break;
            case 14:
                i10 = BuildConfig.FLAVOR;
                break;
            case 15:
                i10 = BuildConfig.FLAVOR;
                break;
            case 16:
                i10 = BigDecimal.ZERO;
                break;
            case 17:
                i10 = 0L;
                break;
            case 18:
                i10 = 0L;
                break;
            case 19:
                i10 = BuildConfig.FLAVOR;
                break;
            case 20:
                i10 = BigInteger.ZERO;
                break;
            case 21:
                i10 = 0L;
                break;
            case 22:
                i10 = BuildConfig.FLAVOR;
                break;
            case 23:
                i10 = BuildConfig.FLAVOR;
                break;
            case 24:
                i10 = Boolean.FALSE;
                break;
            case R.styleable.MapAttrs_zOrderOnTop:
                i10 = BuildConfig.FLAVOR;
                break;
            case 26:
                i10 = Boolean.FALSE;
                break;
            case 27:
                i10 = Boolean.FALSE;
                break;
            case 28:
                i10 = 0L;
                break;
            case 29:
                i10 = 0L;
                break;
            default:
                throw new md.e();
        }
        e6.e.C(i10, "when (this) {\n        FI…PP_METADATA -> \"{}\"\n    }");
        return i10;
    }

    public final int getKey() {
        return this.key;
    }
}
