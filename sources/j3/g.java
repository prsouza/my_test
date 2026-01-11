package j3;

public final class g implements a<int[]> {
    public final String a() {
        return "IntegerArrayPool";
    }

    public final int b(Object obj) {
        return ((int[]) obj).length;
    }

    public final int c() {
        return 4;
    }

    public final Object newArray(int i) {
        return new int[i];
    }
}
