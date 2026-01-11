package y8;

public final class a {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f13535p = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f13536a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13537b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13538c;

    /* renamed from: d  reason: collision with root package name */
    public final b f13539d;

    /* renamed from: e  reason: collision with root package name */
    public final c f13540e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13541f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13542h = 0;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final String f13543j;

    /* renamed from: k  reason: collision with root package name */
    public final long f13544k;

    /* renamed from: l  reason: collision with root package name */
    public final C0260a f13545l;

    /* renamed from: m  reason: collision with root package name */
    public final String f13546m;

    /* renamed from: n  reason: collision with root package name */
    public final long f13547n;

    /* renamed from: o  reason: collision with root package name */
    public final String f13548o;

    /* renamed from: y8.a$a  reason: collision with other inner class name */
    public enum C0260a implements l8.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        private C0260a(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum b implements l8.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        private b(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum c implements l8.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        private c(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    static {
        b bVar = b.UNKNOWN;
        c cVar = c.UNKNOWN_OS;
        C0260a aVar = C0260a.UNKNOWN_EVENT;
    }

    public a(long j10, String str, String str2, b bVar, c cVar, String str3, String str4, int i10, String str5, C0260a aVar, String str6, String str7) {
        this.f13536a = j10;
        this.f13537b = str;
        this.f13538c = str2;
        this.f13539d = bVar;
        this.f13540e = cVar;
        this.f13541f = str3;
        this.g = str4;
        this.i = i10;
        this.f13543j = str5;
        this.f13544k = 0;
        this.f13545l = aVar;
        this.f13546m = str6;
        this.f13547n = 0;
        this.f13548o = str7;
    }
}
