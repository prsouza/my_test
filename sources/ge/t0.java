package ge;

import a.a;
import org.slf4j.helpers.MessageFormatter;

public final class t0 implements b1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5448a;

    public t0(boolean z) {
        this.f5448a = z;
    }

    public final boolean a() {
        return this.f5448a;
    }

    public final o1 g() {
        return null;
    }

    public final String toString() {
        StringBuilder d10 = a.d("Empty{");
        d10.append(this.f5448a ? "Active" : "New");
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
