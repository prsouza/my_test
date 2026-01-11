package ag;

import java.io.IOException;

public final class i0 implements d, q1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f407a;

    /* renamed from: b  reason: collision with root package name */
    public x f408b;

    public i0(x xVar, int i) {
        this.f407a = i;
        if (i != 1) {
            this.f408b = xVar;
        } else {
            this.f408b = xVar;
        }
    }

    public final s d() {
        switch (this.f407a) {
            case 0:
                try {
                    return e();
                } catch (IOException e10) {
                    throw new r(e10.getMessage(), e10);
                }
            default:
                try {
                    return e();
                } catch (IOException e11) {
                    throw new r(e11.getMessage(), e11);
                }
        }
    }

    public final s e() {
        switch (this.f407a) {
            case 0:
                return new h0(this.f408b.c());
            default:
                return new n1(this.f408b.c());
        }
    }
}
