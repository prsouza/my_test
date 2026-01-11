package te;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f11568a = new char[117];

    static {
        b bVar = new b();
        for (int i = 0; i <= 31; i++) {
            bVar.a(i, 'u');
        }
        bVar.a(8, 'b');
        bVar.a(9, 't');
        bVar.a(10, 'n');
        bVar.a(12, 'f');
        bVar.a(13, 'r');
        bVar.a(47, '/');
        bVar.a(34, '\"');
        bVar.a(92, '\\');
    }

    public final void a(int i, char c10) {
        if (c10 != 'u') {
            f11568a[c10] = (char) i;
        }
    }
}
