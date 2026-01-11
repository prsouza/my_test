package i7;

import i7.i;
import java.util.NoSuchElementException;

public final class h extends i.a {

    /* renamed from: a  reason: collision with root package name */
    public int f6266a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f6267b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f6268c;

    public h(i iVar) {
        this.f6268c = iVar;
        this.f6267b = iVar.size();
    }

    public final byte a() {
        int i = this.f6266a;
        if (i < this.f6267b) {
            this.f6266a = i + 1;
            return this.f6268c.h(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f6266a < this.f6267b;
    }
}
