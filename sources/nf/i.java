package nf;

import com.github.mikephil.charting.BuildConfig;
import e6.e;
import fe.k;
import java.io.IOException;
import java.net.ProtocolException;
import p002if.w;

public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f9022d = new a();

    /* renamed from: a  reason: collision with root package name */
    public final w f9023a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9024b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9025c;

    public static final class a {
        public final i a(String str) throws IOException {
            w wVar;
            String str2;
            e.D(str, "statusLine");
            int i = 9;
            if (k.d1(str, "HTTP/1.", false)) {
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(a8.a.c("Unexpected status line: ", str));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    wVar = w.HTTP_1_0;
                } else if (charAt == 1) {
                    wVar = w.HTTP_1_1;
                } else {
                    throw new ProtocolException(a8.a.c("Unexpected status line: ", str));
                }
            } else if (k.d1(str, "ICY ", false)) {
                wVar = w.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException(a8.a.c("Unexpected status line: ", str));
            }
            int i10 = i + 3;
            if (str.length() >= i10) {
                try {
                    String substring = str.substring(i, i10);
                    e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i10) {
                        str2 = BuildConfig.FLAVOR;
                    } else if (str.charAt(i10) == ' ') {
                        str2 = str.substring(i + 4);
                        e.C(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(a8.a.c("Unexpected status line: ", str));
                    }
                    return new i(wVar, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(a8.a.c("Unexpected status line: ", str));
                }
            } else {
                throw new ProtocolException(a8.a.c("Unexpected status line: ", str));
            }
        }
    }

    public i(w wVar, int i, String str) {
        e.D(wVar, "protocol");
        this.f9023a = wVar;
        this.f9024b = i;
        this.f9025c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f9023a == w.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f9024b);
        sb2.append(' ');
        sb2.append(this.f9025c);
        String sb3 = sb2.toString();
        e.C(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
