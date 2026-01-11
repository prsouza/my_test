package h7;

import i7.a0;
import i7.d1;
import i7.i;
import i7.p;
import i7.r0;
import i7.x;
import i7.y0;
import java.util.Objects;

public final class v extends x<v, b> implements r0 {
    /* access modifiers changed from: private */
    public static final v DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile y0<v> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private i keyValue_ = i.f6271b;
    private x params_;
    private int version_;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5894a;

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
                f5894a = r0
                i7.x$f r1 = i7.x.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5894a     // Catch:{ NoSuchFieldError -> 0x001d }
                i7.x$f r1 = i7.x.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5894a     // Catch:{ NoSuchFieldError -> 0x0028 }
                i7.x$f r1 = i7.x.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5894a     // Catch:{ NoSuchFieldError -> 0x0033 }
                i7.x$f r1 = i7.x.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5894a     // Catch:{ NoSuchFieldError -> 0x003e }
                i7.x$f r1 = i7.x.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5894a     // Catch:{ NoSuchFieldError -> 0x0049 }
                i7.x$f r1 = i7.x.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5894a     // Catch:{ NoSuchFieldError -> 0x0054 }
                i7.x$f r1 = i7.x.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h7.v.a.<clinit>():void");
        }
    }

    public static final class b extends x.a<v, b> implements r0 {
        public b() {
            super(v.DEFAULT_INSTANCE);
        }
    }

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        x.v(v.class, vVar);
    }

    public static v A() {
        return DEFAULT_INSTANCE;
    }

    public static b E() {
        return (b) DEFAULT_INSTANCE.n();
    }

    public static v F(i iVar, p pVar) throws a0 {
        return (v) x.s(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void x(v vVar) {
        vVar.version_ = 0;
    }

    public static void y(v vVar, x xVar) {
        Objects.requireNonNull(vVar);
        Objects.requireNonNull(xVar);
        vVar.params_ = xVar;
    }

    public static void z(v vVar, i iVar) {
        Objects.requireNonNull(vVar);
        vVar.keyValue_ = iVar;
    }

    public final i B() {
        return this.keyValue_;
    }

    public final x C() {
        x xVar = this.params_;
        return xVar == null ? x.x() : xVar;
    }

    public final int D() {
        return this.version_;
    }

    public final Object o(x.f fVar) {
        switch (a.f5894a[fVar.ordinal()]) {
            case 1:
                return new v();
            case 2:
                return new b();
            case 3:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<v> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (v.class) {
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
