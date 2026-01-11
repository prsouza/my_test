package h1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import l1.e;

public final class g implements l1.b, n {

    /* renamed from: a  reason: collision with root package name */
    public final l1.b f5706a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5707b;

    public static final class a implements l1.a {
        public final void close() throws IOException {
            throw null;
        }
    }

    public static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public final String f5708a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<Object> f5709b;
    }

    public final l1.b a() {
        return this.f5706a;
    }

    public final void close() {
        try {
            this.f5707b.close();
        } catch (IOException e10) {
            throw e10;
        }
    }

    public final String getDatabaseName() {
        return this.f5706a.getDatabaseName();
    }

    public final l1.a m0() {
        Objects.requireNonNull(this.f5707b);
        throw null;
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.f5706a.setWriteAheadLoggingEnabled(z);
    }
}
