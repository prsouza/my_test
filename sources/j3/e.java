package j3;

public final class e implements a<byte[]> {
    public final String a() {
        return "ByteArrayPool";
    }

    public final int b(Object obj) {
        return ((byte[]) obj).length;
    }

    public final int c() {
        return 1;
    }

    public final Object newArray(int i) {
        return new byte[i];
    }
}
