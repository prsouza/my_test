package f8;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c[] f5012a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5013b = new b();

    public a(c... cVarArr) {
        this.f5012a = cVarArr;
    }

    public final StackTraceElement[] e(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (c cVar : this.f5012a) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = cVar.e(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? this.f5013b.e(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
