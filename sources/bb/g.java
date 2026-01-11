package bb;

import io.nodle.cash.R;
import md.e;

public enum g {
    NONE,
    TRANSFER,
    REWARD;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2951a = null;

        static {
            int[] iArr = new int[g.values().length];
            iArr[g.NONE.ordinal()] = 1;
            iArr[g.TRANSFER.ordinal()] = 2;
            iArr[g.REWARD.ordinal()] = 3;
            f2951a = iArr;
        }
    }

    public int getEmptyPlaceholder() {
        int i = a.f2951a[ordinal()];
        if (i == 1) {
            return R.string.blank;
        }
        if (i == 2) {
            return R.string.noTransfersV2;
        }
        if (i == 3) {
            return R.string.noRewardsV2;
        }
        throw new e();
    }

    public int getListTitle() {
        int i = a.f2951a[ordinal()];
        if (i == 1) {
            return R.string.blank;
        }
        if (i == 2) {
            return R.string.titleTransfers;
        }
        if (i == 3) {
            return R.string.titleRewards;
        }
        throw new e();
    }

    public int getTitle() {
        int i = a.f2951a[ordinal()];
        if (i == 1) {
            return R.string.blank;
        }
        if (i == 2) {
            return R.string.titleTransfer;
        }
        if (i == 3) {
            return R.string.titleReward;
        }
        throw new e();
    }
}
