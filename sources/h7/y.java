package h7;

import com.github.mikephil.charting.BuildConfig;
import i7.d1;
import i7.i;
import i7.r0;
import i7.x;
import i7.y0;
import i7.z;
import java.util.Objects;

public final class y extends x<y, b> implements r0 {
    /* access modifiers changed from: private */
    public static final y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile y0<y> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = BuildConfig.FLAVOR;
    private i value_ = i.f6271b;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5897a;

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
                f5897a = r0
                i7.x$f r1 = i7.x.f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5897a     // Catch:{ NoSuchFieldError -> 0x001d }
                i7.x$f r1 = i7.x.f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5897a     // Catch:{ NoSuchFieldError -> 0x0028 }
                i7.x$f r1 = i7.x.f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5897a     // Catch:{ NoSuchFieldError -> 0x0033 }
                i7.x$f r1 = i7.x.f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5897a     // Catch:{ NoSuchFieldError -> 0x003e }
                i7.x$f r1 = i7.x.f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5897a     // Catch:{ NoSuchFieldError -> 0x0049 }
                i7.x$f r1 = i7.x.f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5897a     // Catch:{ NoSuchFieldError -> 0x0054 }
                i7.x$f r1 = i7.x.f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h7.y.a.<clinit>():void");
        }
    }

    public static final class b extends x.a<y, b> implements r0 {
        public b() {
            super(y.DEFAULT_INSTANCE);
        }
    }

    public enum c implements z.a {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
        public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
        public static final int REMOTE_VALUE = 4;
        public static final int SYMMETRIC_VALUE = 1;
        public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
        private static final z.b<c> internalValueMap = null;
        private final int value;

        public class a implements z.b<c> {
        }

        public static final class b implements z.c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5898a = null;

            static {
                f5898a = new b();
            }

            public final boolean a(int i) {
                return c.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a();
        }

        private c(int i) {
            this.value = i;
        }

        public static c forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        public static z.b<c> internalGetValueMap() {
            return internalValueMap;
        }

        public static z.c internalGetVerifier() {
            return b.f5898a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        x.v(y.class, yVar);
    }

    public static y A() {
        return DEFAULT_INSTANCE;
    }

    public static b E() {
        return (b) DEFAULT_INSTANCE.n();
    }

    public static void x(y yVar, String str) {
        Objects.requireNonNull(yVar);
        Objects.requireNonNull(str);
        yVar.typeUrl_ = str;
    }

    public static void y(y yVar, i iVar) {
        Objects.requireNonNull(yVar);
        Objects.requireNonNull(iVar);
        yVar.value_ = iVar;
    }

    public static void z(y yVar, c cVar) {
        Objects.requireNonNull(yVar);
        yVar.keyMaterialType_ = cVar.getNumber();
    }

    public final c B() {
        c forNumber = c.forNumber(this.keyMaterialType_);
        return forNumber == null ? c.UNRECOGNIZED : forNumber;
    }

    public final String C() {
        return this.typeUrl_;
    }

    public final i D() {
        return this.value_;
    }

    public final Object o(x.f fVar) {
        switch (a.f5897a[fVar.ordinal()]) {
            case 1:
                return new y();
            case 2:
                return new b();
            case 3:
                return new d1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0<y> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (y.class) {
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
