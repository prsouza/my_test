package cb;

import io.nodle.cash.R;
import md.e;

public enum a {
    NODLE_SCAN("nodle.channel.SCAN"),
    TRANSACTION("nodle.channel.TRANSACT"),
    GENERAL("nodle.channel.GENERAL");
    

    /* renamed from: id  reason: collision with root package name */
    private final String f3317id;

    /* renamed from: cb.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0036a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3318a = null;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.NODLE_SCAN.ordinal()] = 1;
            iArr[a.TRANSACTION.ordinal()] = 2;
            iArr[a.GENERAL.ordinal()] = 3;
            f3318a = iArr;
        }
    }

    private a(String str) {
        this.f3317id = str;
    }

    public final int channelName() {
        int i = C0036a.f3318a[ordinal()];
        if (i == 1) {
            return R.string.channelScan;
        }
        if (i == 2) {
            return R.string.channelTransact;
        }
        if (i == 3) {
            return R.string.channelGeneral;
        }
        throw new e();
    }

    public final int description() {
        int i = C0036a.f3318a[ordinal()];
        if (i == 1) {
            return R.string.channelScanDesc;
        }
        if (i == 2) {
            return R.string.channelTransactDesc;
        }
        if (i == 3) {
            return R.string.channelGeneralDesc;
        }
        throw new e();
    }

    public final String getId() {
        return this.f3317id;
    }
}
