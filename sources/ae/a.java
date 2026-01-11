package ae;

import java.util.Random;

public abstract class a extends c {
    public final int a(int i) {
        return ((-i) >> 31) & (d().nextInt() >>> (32 - i));
    }

    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
