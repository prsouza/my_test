package s9;

import e6.e;
import md.h;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f11022a;

    /* renamed from: b  reason: collision with root package name */
    public static final h f11023b = new h(a.f11024b);

    public static final class a extends yd.h implements xd.a<a> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f11024b = new a();

        public a() {
            super(0);
        }

        public final Object c() {
            return new a();
        }
    }

    static {
        Logger logger = LoggerFactory.getLogger("BleAdvertising");
        e.C(logger, "getLogger(\"BleAdvertising\")");
        f11022a = logger;
    }
}
