package p002if;

import e6.e;
import java.io.IOException;

/* renamed from: if.w  reason: invalid package */
public enum w {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final a Companion = null;
    /* access modifiers changed from: private */
    public final String protocol;

    /* renamed from: if.w$a */
    public static final class a {
        public final w a(String str) throws IOException {
            e.D(str, "protocol");
            w wVar = w.HTTP_1_0;
            if (!e.r(str, wVar.protocol)) {
                wVar = w.HTTP_1_1;
                if (!e.r(str, wVar.protocol)) {
                    wVar = w.H2_PRIOR_KNOWLEDGE;
                    if (!e.r(str, wVar.protocol)) {
                        wVar = w.HTTP_2;
                        if (!e.r(str, wVar.protocol)) {
                            wVar = w.SPDY_3;
                            if (!e.r(str, wVar.protocol)) {
                                wVar = w.QUIC;
                                if (!e.r(str, wVar.protocol)) {
                                    throw new IOException(a8.a.c("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return wVar;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a();
    }

    private w(String str) {
        this.protocol = str;
    }

    public static final w get(String str) throws IOException {
        return Companion.a(str);
    }

    public String toString() {
        return this.protocol;
    }
}
