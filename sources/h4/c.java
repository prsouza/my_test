package h4;

import android.support.v4.media.b;
import h4.e;
import h4.h;
import java.util.concurrent.atomic.AtomicReference;
import n4.d;

public class c extends l {

    /* renamed from: v  reason: collision with root package name */
    public static final int f5815v = a.collectDefaults();

    /* renamed from: w  reason: collision with root package name */
    public static final int f5816w = h.a.collectDefaults();

    /* renamed from: x  reason: collision with root package name */
    public static final int f5817x = e.a.collectDefaults();

    /* renamed from: y  reason: collision with root package name */
    public static final k4.e f5818y = d.f8910a;

    /* renamed from: a  reason: collision with root package name */
    public final transient m4.a f5819a;

    /* renamed from: b  reason: collision with root package name */
    public int f5820b = f5815v;

    /* renamed from: c  reason: collision with root package name */
    public int f5821c = f5816w;

    /* renamed from: s  reason: collision with root package name */
    public int f5822s = f5817x;

    /* renamed from: t  reason: collision with root package name */
    public b f5823t;

    /* renamed from: u  reason: collision with root package name */
    public k4.e f5824u = f5818y;

    public enum a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        
        private final boolean _defaultState;

        private a(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int i = 0;
            for (a aVar : values()) {
                if (aVar.enabledByDefault()) {
                    i |= aVar.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    public c(b bVar) {
        System.currentTimeMillis();
        new AtomicReference(new a.b());
        long currentTimeMillis = System.currentTimeMillis();
        this.f5819a = new m4.a((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
        this.f5823t = bVar;
    }
}
