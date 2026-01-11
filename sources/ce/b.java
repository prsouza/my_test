package ce;

import java.util.NoSuchElementException;
import nd.u;

public final class b extends u {

    /* renamed from: a  reason: collision with root package name */
    public final int f3433a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3434b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3435c;

    /* renamed from: s  reason: collision with root package name */
    public int f3436s;

    public b(int i, int i10, int i11) {
        this.f3433a = i11;
        this.f3434b = i10;
        boolean z = true;
        if (i11 <= 0 ? i < i10 : i > i10) {
            z = false;
        }
        this.f3435c = z;
        this.f3436s = !z ? i10 : i;
    }

    public final int a() {
        int i = this.f3436s;
        if (i != this.f3434b) {
            this.f3436s = this.f3433a + i;
        } else if (this.f3435c) {
            this.f3435c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public final boolean hasNext() {
        return this.f3435c;
    }
}
