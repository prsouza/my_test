package be;

import e6.e;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends ae.a {
    public final int c(int i, int i10) {
        return ThreadLocalRandom.current().nextInt(i, i10);
    }

    public final Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        e.C(current, "current()");
        return current;
    }
}
