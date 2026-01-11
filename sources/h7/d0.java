package h7;

import com.github.mikephil.charting.BuildConfig;
import i7.c1;
import i7.d1;
import i7.r0;
import i7.x;
import i7.y0;
import i7.z;
import java.util.Objects;

public final class d0 extends x<d0, b> implements r0 {
    /* access modifiers changed from: private */
    public static final d0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile y0<d0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private z.d<c> keyInfo_ = c1.f6241s;
    private int primaryKeyId_;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5868a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                i7.x$f[] r0 = i7.x.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5868a = r0
                i7.x$f r1 = i7.x.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5868a     // Catch:{ NoSuchFieldError -> 0x001d }
                i7.x$f r1 = i7.x.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5868a     // Catch:{ NoSuchFieldError -> 0x0028 }
                i7.x$f r1 = i7.x.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5868a     // Catch:{ NoSuchFieldError -> 0x0033 }
                i7.x$f r1 = i7.x.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5868a     // Catch:{ NoSuchFieldError -> 0x003e }
                i7.x$f r1 = i7.x.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5868a     // Catch:{ NoSuchFieldError -> 0x0049 }
                i7.x$f r1 = i7.x.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5868a     // Catch:{ NoSuchFieldError -> 0x0054 }
                i7.x$f r1 = i7.x.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h7.d0.a.<clinit>():void");
        }
    }

    public static final class b extends x.a<d0, b> implements r0 {
        public b() {
            super(d0.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends x<c, a> implements r0 {
        /* access modifiers changed from: private */
        public static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile y0<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = BuildConfig.FLAVOR;

        public static final class a extends x.a<c, a> implements r0 {
            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            x.v(c.class, cVar);
        }

        public static void A(c cVar, int i) {
            cVar.keyId_ = i;
        }

        public static a C() {
            return (a) DEFAULT_INSTANCE.n();
        }

        public static void x(c cVar, String str) {
            Objects.requireNonNull(cVar);
            Objects.requireNonNull(str);
            cVar.typeUrl_ = str;
        }

        public static void y(c cVar, i0 i0Var) {
            Objects.requireNonNull(cVar);
            cVar.outputPrefixType_ = i0Var.getNumber();
        }

        public static void z(c cVar, z zVar) {
            Objects.requireNonNull(cVar);
            cVar.status_ = zVar.getNumber();
        }

        public final int B() {
            return this.keyId_;
        }

        public final Object o(x.f fVar) {
            switch (a.f5868a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a();
                case 3:
                    return new d1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    y0<c> y0Var = PARSER;
                    if (y0Var == null) {
                        synchronized (c.class) {
                            try {
                                y0Var = PARSER;
                                if (y0Var == null) {
                                    y0Var = new x.b<>(DEFAULT_INSTANCE);
                                    PARSER = y0Var;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return y0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        x.v(d0.class, d0Var);
    }

    public static b A() {
        return (b) DEFAULT_INSTANCE.n();
    }

    public static void x(d0 d0Var, int i) {
        d0Var.primaryKeyId_ = i;
    }

    public static void y(d0 d0Var, c cVar) {
        Objects.requireNonNull(d0Var);
        if (!d0Var.keyInfo_.p0()) {
            z.d<c> dVar = d0Var.keyInfo_;
            int size = dVar.size();
            d0Var.keyInfo_ = dVar.B(size == 0 ? 10 : size * 2);
        }
        d0Var.keyInfo_.add(cVar);
    }

    public final Object o(x.f fVar) {
        switch (a.f5868a[fVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new b();
            case 3:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<d0> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (d0.class) {
                        try {
                            y0Var = PARSER;
                            if (y0Var == null) {
                                y0Var = new x.b<>(DEFAULT_INSTANCE);
                                PARSER = y0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return y0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final c z() {
        return this.keyInfo_.get(0);
    }
}
