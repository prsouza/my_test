package i7;

public final class d1 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f6248a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6249b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f6250c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6251d;

    public d1(q0 q0Var, String str, Object[] objArr) {
        this.f6248a = q0Var;
        this.f6249b = str;
        this.f6250c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f6251d = charAt;
            return;
        }
        char c10 = charAt & 8191;
        int i = 1;
        int i10 = 13;
        while (true) {
            int i11 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c10 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i = i11;
            } else {
                this.f6251d = c10 | (charAt2 << i10);
                return;
            }
        }
    }

    public final boolean a() {
        return (this.f6251d & 2) == 2;
    }

    public final a1 b() {
        return (this.f6251d & 1) == 1 ? a1.PROTO2 : a1.PROTO3;
    }

    public final q0 c() {
        return this.f6248a;
    }
}
