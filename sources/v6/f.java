package v6;

import java.util.NoSuchElementException;

public final class f extends k<Object> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12307a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12308b;

    public f(Object obj) {
        this.f12308b = obj;
    }

    public final boolean hasNext() {
        return !this.f12307a;
    }

    public final Object next() {
        if (!this.f12307a) {
            this.f12307a = true;
            return this.f12308b;
        }
        throw new NoSuchElementException();
    }
}
