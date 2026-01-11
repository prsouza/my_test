package yf;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
import wf.a;

public final class g extends c {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13649c = true;

    /* renamed from: d  reason: collision with root package name */
    public final a<Integer> f13650d;

    public g(int i, int i10) {
        super(0);
        this.f13650d = new a<>(Integer.valueOf(i), Integer.valueOf(i10));
    }

    public final boolean c(int i, Writer writer) throws IOException {
        boolean z = this.f13649c;
        a<Integer> aVar = this.f13650d;
        Integer valueOf = Integer.valueOf(i);
        Objects.requireNonNull(aVar);
        if (z != (valueOf != null && aVar.f12663a.compare(valueOf, aVar.f12666s) > -1 && aVar.f12663a.compare(valueOf, aVar.f12665c) < 1)) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
