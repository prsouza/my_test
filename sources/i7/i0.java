package i7;

import androidx.activity.result.d;
import java.nio.charset.Charset;

public final class i0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6277b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final p0 f6278a;

    public class a implements p0 {
        public final o0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    public static class b implements p0 {

        /* renamed from: a  reason: collision with root package name */
        public p0[] f6279a;

        public b(p0... p0VarArr) {
            this.f6279a = p0VarArr;
        }

        public final o0 a(Class<?> cls) {
            for (p0 p0Var : this.f6279a) {
                if (p0Var.b(cls)) {
                    return p0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException(d.a(cls, a.a.d("No factory is available for message type: ")));
        }

        public final boolean b(Class<?> cls) {
            for (p0 b10 : this.f6279a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public i0() {
        p0 p0Var;
        p0[] p0VarArr = new p0[2];
        p0VarArr[0] = w.f6387a;
        try {
            p0Var = (p0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            p0Var = f6277b;
        }
        p0VarArr[1] = p0Var;
        b bVar = new b(p0VarArr);
        Charset charset = z.f6396a;
        this.f6278a = bVar;
    }
}
