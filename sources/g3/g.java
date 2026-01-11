package g3;

import android.text.TextUtils;
import java.security.MessageDigest;
import org.slf4j.helpers.MessageFormatter;

public final class g<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final b<Object> f5232e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f5233a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f5234b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5235c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f5236d;

    public class a implements b<Object> {
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t10, MessageDigest messageDigest);
    }

    public g(String str, T t10, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f5235c = str;
            this.f5233a = t10;
            this.f5234b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T> g<T> a(String str, T t10) {
        return new g<>(str, t10, f5232e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f5235c.equals(((g) obj).f5235c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5235c.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Option{key='");
        d10.append(this.f5235c);
        d10.append('\'');
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
