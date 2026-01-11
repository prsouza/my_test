package bb;

import io.nodle.cash.R;

public enum e {
    ECO,
    EXPERT,
    LUDICROUS;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2944a = null;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.ECO.ordinal()] = 1;
            iArr[e.EXPERT.ordinal()] = 2;
            iArr[e.LUDICROUS.ordinal()] = 3;
            f2944a = iArr;
        }
    }

    public long getScanDuration() {
        int i = a.f2944a[ordinal()];
        if (i == 1) {
            return 600000;
        }
        if (i == 2) {
            return 1200000;
        }
        if (i == 3) {
            return 0;
        }
        throw new md.e();
    }

    public int getScanModeIcon() {
        int i = a.f2944a[ordinal()];
        if (i == 1) {
            return R.drawable.ic_mode_eco;
        }
        if (i == 2) {
            return R.drawable.ic_mode_expert;
        }
        if (i == 3) {
            return R.drawable.ic_mode_ludicrous;
        }
        throw new md.e();
    }
}
