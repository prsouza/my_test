package ce;

import java.util.NoSuchElementException;
import nd.v;

public final class e extends v {

    /* renamed from: a  reason: collision with root package name */
    public final long f3442a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3443b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3444c;

    /* renamed from: s  reason: collision with root package name */
    public long f3445s;

    public e(long j10, long j11, long j12) {
        this.f3442a = j12;
        this.f3443b = j11;
        boolean z = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z = false;
        }
        this.f3444c = z;
        this.f3445s = !z ? j11 : j10;
    }

    public final long a() {
        long j10 = this.f3445s;
        if (j10 != this.f3443b) {
            this.f3445s = this.f3442a + j10;
        } else if (this.f3444c) {
            this.f3444c = false;
        } else {
            throw new NoSuchElementException();
        }
        return j10;
    }

    public final boolean hasNext() {
        return this.f3444c;
    }
}
