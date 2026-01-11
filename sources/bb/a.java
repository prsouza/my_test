package bb;

import io.nodle.cash.R;
import md.e;

public enum a {
    NOW,
    WEEK,
    MONTH,
    YEAR;

    /* renamed from: bb.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0031a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2937a = null;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.NOW.ordinal()] = 1;
            iArr[a.WEEK.ordinal()] = 2;
            iArr[a.MONTH.ordinal()] = 3;
            iArr[a.YEAR.ordinal()] = 4;
            f2937a = iArr;
        }
    }

    public int dayCount() {
        int i = C0031a.f2937a[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 7;
        }
        if (i == 3) {
            return 30;
        }
        if (i == 4) {
            return 365;
        }
        throw new e();
    }

    public int labelId() {
        int i = C0031a.f2937a[ordinal()];
        if (i == 1) {
            return R.string.now;
        }
        if (i == 2) {
            return R.string.week;
        }
        if (i == 3) {
            return R.string.month;
        }
        if (i == 4) {
            return R.string.year;
        }
        throw new e();
    }

    public int titleTextId() {
        int i = C0031a.f2937a[ordinal()];
        if (i == 1) {
            return R.string.estimatedBalanceCurrent;
        }
        if (i == 2) {
            return R.string.estimatedBalanceWeek;
        }
        if (i == 3) {
            return R.string.estimatedBalanceMonth;
        }
        if (i == 4) {
            return R.string.estimatedBalanceYear;
        }
        throw new e();
    }
}
