package x4;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f12788c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f12789a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12790b;

    public enum a implements l8.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        private a(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    static {
        a aVar = a.REASON_UNKNOWN;
    }

    public c(long j10, a aVar) {
        this.f12789a = j10;
        this.f12790b = aVar;
    }
}
