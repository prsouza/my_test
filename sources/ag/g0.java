package ag;

import java.io.IOException;

public final class g0 implements u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f397a;

    /* renamed from: b  reason: collision with root package name */
    public x f398b;

    public g0(x xVar, int i) {
        this.f397a = i;
        if (i != 1) {
            this.f398b = xVar;
        } else {
            this.f398b = xVar;
        }
    }

    public final s d() {
        switch (this.f397a) {
            case 0:
                try {
                    return e();
                } catch (IOException e10) {
                    throw new IllegalStateException(e10.getMessage());
                }
            default:
                try {
                    return e();
                } catch (IOException e11) {
                    throw new IllegalStateException(e11.getMessage());
                }
        }
    }

    public final s e() {
        switch (this.f397a) {
            case 0:
                return new f0(this.f398b.c());
            default:
                return new m1(this.f398b.c());
        }
    }
}
