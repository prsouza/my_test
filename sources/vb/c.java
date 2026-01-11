package vb;

import a.b;
import io.nodle.cash.R;
import java.util.List;
import java.util.Random;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f12449a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final List<Integer> f12450b = b.o0(0, Integer.valueOf(R.string.first), Integer.valueOf(R.string.second), Integer.valueOf(R.string.third), Integer.valueOf(R.string.fourth), Integer.valueOf(R.string.fifth), Integer.valueOf(R.string.sixth), Integer.valueOf(R.string.seventh), Integer.valueOf(R.string.eighth), Integer.valueOf(R.string.ninth), Integer.valueOf(R.string.tenth), Integer.valueOf(R.string.eleventh), Integer.valueOf(R.string.twelve));

    /* renamed from: c  reason: collision with root package name */
    public static final List<Integer> f12451c = b.o0(0, Integer.valueOf(R.string.firstWord), Integer.valueOf(R.string.secondWord), Integer.valueOf(R.string.thirdWord), Integer.valueOf(R.string.fourthWord), Integer.valueOf(R.string.fifthWord), Integer.valueOf(R.string.sixthWord), Integer.valueOf(R.string.seventhWord), Integer.valueOf(R.string.eighthWord), Integer.valueOf(R.string.ninthWord), Integer.valueOf(R.string.tenthWord), Integer.valueOf(R.string.eleventhWord), Integer.valueOf(R.string.twelfthWord));

    public final int a(int i, int i10, int i11) {
        int nextInt = new Random().nextInt((i10 - i) + 1) + i;
        if (i11 == 0) {
            i11 = new Random().nextBoolean() ? -1 : 1;
        }
        return nextInt * i11;
    }

    public final Integer b(int i) {
        if (i > 0) {
            List<Integer> list = f12451c;
            if (i < list.size()) {
                return list.get(i);
            }
        }
        return null;
    }
}
