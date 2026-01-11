package l8;

import i8.b;
import i8.c;
import i8.g;
import java.io.IOException;

public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8144a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8145b = false;

    /* renamed from: c  reason: collision with root package name */
    public c f8146c;

    /* renamed from: d  reason: collision with root package name */
    public final f f8147d;

    public i(f fVar) {
        this.f8147d = fVar;
    }

    public final g b(String str) throws IOException {
        if (!this.f8144a) {
            this.f8144a = true;
            this.f8147d.b(this.f8146c, str, this.f8145b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    public final g d(boolean z) throws IOException {
        if (!this.f8144a) {
            this.f8144a = true;
            this.f8147d.d(this.f8146c, z ? 1 : 0, this.f8145b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }
}
