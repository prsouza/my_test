package ag;

import java.io.InputStream;

public abstract class u1 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f452a;

    /* renamed from: b  reason: collision with root package name */
    public int f453b;

    public u1(InputStream inputStream, int i) {
        this.f452a = inputStream;
        this.f453b = i;
    }

    public final void a() {
        InputStream inputStream = this.f452a;
        if (inputStream instanceof r1) {
            r1 r1Var = (r1) inputStream;
            r1Var.f441u = true;
            r1Var.c();
        }
    }
}
