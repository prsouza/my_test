package yf;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f13632b = new ArrayList();

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List<yf.b>, java.util.ArrayList] */
    public a(b... bVarArr) {
        for (b bVar : bVarArr) {
            if (bVar != null) {
                this.f13632b.add(bVar);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<yf.b>, java.util.ArrayList] */
    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
        Iterator it = this.f13632b.iterator();
        while (it.hasNext()) {
            int a10 = ((b) it.next()).a(charSequence, i, writer);
            if (a10 != 0) {
                return a10;
            }
        }
        return 0;
    }
}
