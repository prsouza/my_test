package bj;

import e6.e;

public final class b extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super("invalid sx: " + str);
        e.D(str, "msg");
    }
}
