package ia;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import l6.b1;
import x6.a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f6400a = Logger.getLogger(a.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final c<String> f6401b = new C0107a();

    /* renamed from: ia.a$a  reason: collision with other inner class name */
    public class C0107a implements c<String> {
    }

    public static class b<T> extends d<T> {

        /* renamed from: d  reason: collision with root package name */
        public final c<T> f6402d;

        public b(String str, c cVar) {
            super(str, cVar);
            if (!str.endsWith("-bin")) {
                aa.b.v(cVar, "marshaller");
                this.f6402d = cVar;
                return;
            }
            throw new IllegalArgumentException(b1.q("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
    }

    public interface c<T> {
    }

    public static abstract class d<T> {

        /* renamed from: c  reason: collision with root package name */
        public static final BitSet f6403c;

        /* renamed from: a  reason: collision with root package name */
        public final String f6404a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f6405b;

        static {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
                bitSet.set(c10);
            }
            for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
                bitSet.set(c11);
            }
            f6403c = bitSet;
        }

        public d(String str, Object obj) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            aa.b.v(lowerCase, AppMeasurementSdk.ConditionalUserProperty.NAME);
            aa.b.q(!lowerCase.isEmpty(), "token must have at least 1 tchar");
            if (lowerCase.equals("connection")) {
                a.f6400a.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", new RuntimeException("exception to show backtrace"));
            }
            int i = 0;
            while (i < lowerCase.length()) {
                char charAt = lowerCase.charAt(i);
                if (f6403c.get(charAt)) {
                    i++;
                } else {
                    throw new IllegalArgumentException(b1.q("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
                }
            }
            this.f6404a = lowerCase;
            lowerCase.getBytes(u6.a.f11716a);
            this.f6405b = obj;
        }

        public static <T> d<T> a(String str, c<T> cVar) {
            return new b(str, cVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f6404a.equals(((d) obj).f6404a);
        }

        public final int hashCode() {
            return this.f6404a.hashCode();
        }

        public final String toString() {
            return android.support.v4.media.a.e(a.a.d("Key{name='"), this.f6404a, "'}");
        }
    }

    static {
        a.c cVar = x6.a.f12870a;
        if (cVar.f12879c != null) {
            cVar.a(cVar.f12878b);
        }
    }

    public final String toString() {
        return "Metadata(" + ')';
    }
}
