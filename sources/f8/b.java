package f8;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final int f5014a = 1024;

    public final StackTraceElement[] e(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f5014a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i10 = i / 2;
        int i11 = i - i10;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i11);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i10, stackTraceElementArr2, i11, i10);
        return stackTraceElementArr2;
    }
}
