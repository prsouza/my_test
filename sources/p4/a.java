package p4;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f9653a;

    static {
        int[] iArr = new int[256];
        for (int i = 128; i < 256; i++) {
            iArr[i] = (i & 224) == 192 ? 1 : (i & 240) == 224 ? 2 : (i & 248) == 240 ? 3 : -1;
        }
        f9653a = iArr;
    }
}
