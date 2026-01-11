package ri;

import e6.e;
import java.util.ArrayList;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0210a f10801a = new C0210a();

    /* renamed from: b  reason: collision with root package name */
    public static volatile b[] f10802b = new b[0];

    /* renamed from: ri.a$a  reason: collision with other inner class name */
    public static final class C0210a extends b {
        public final void a(String str, Object... objArr) {
            e.D(objArr, "args");
            for (b a10 : a.f10802b) {
                a10.a(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void b(String str, Object... objArr) {
            e.D(objArr, "args");
            for (b b10 : a.f10802b) {
                b10.b(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void c(Throwable th2) {
            for (b c10 : a.f10802b) {
                c10.c(th2);
            }
        }

        public final void d(Throwable th2, String str, Object... objArr) {
            e.D(objArr, "args");
            for (b d10 : a.f10802b) {
                d10.d(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final b e(String str) {
            b[] bVarArr = a.f10802b;
            int length = bVarArr.length;
            int i = 0;
            while (i < length) {
                b bVar = bVarArr[i];
                i++;
                bVar.f10803a.set(str);
            }
            return this;
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadLocal<String> f10803a = new ThreadLocal<>();

        public abstract void a(String str, Object... objArr);

        public abstract void b(String str, Object... objArr);

        public abstract void c(Throwable th2);

        public abstract void d(Throwable th2, String str, Object... objArr);
    }

    static {
        new ArrayList();
    }
}
