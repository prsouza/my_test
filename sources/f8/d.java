package f8;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f5015a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5016b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f5017c;

    /* renamed from: d  reason: collision with root package name */
    public final d f5018d;

    public d(Throwable th2, c cVar) {
        this.f5015a = th2.getLocalizedMessage();
        this.f5016b = th2.getClass().getName();
        this.f5017c = cVar.e(th2.getStackTrace());
        Throwable cause = th2.getCause();
        this.f5018d = cause != null ? new d(cause, cVar) : null;
    }
}
