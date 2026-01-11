package p002if;

import e6.e;

/* renamed from: if.e0  reason: invalid package */
public enum e0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public static final a Companion = null;
    private final String javaName;

    /* renamed from: if.e0$a */
    public static final class a {
        public final e0 a(String str) {
            e.D(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return e0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return e0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return e0.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return e0.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return e0.SSL_3_0;
            }
            throw new IllegalArgumentException(a8.a.c("Unexpected TLS version: ", str));
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a();
    }

    private e0(String str) {
        this.javaName = str;
    }

    public static final e0 forJavaName(String str) {
        return Companion.a(str);
    }

    /* renamed from: -deprecated_javaName  reason: not valid java name */
    public final String m11deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
