package fe;

import e6.e;
import java.nio.charset.Charset;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5085a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f5086b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f5087c;

    /* renamed from: d  reason: collision with root package name */
    public static Charset f5088d;

    /* renamed from: e  reason: collision with root package name */
    public static Charset f5089e;

    static {
        Charset forName = Charset.forName("UTF-8");
        e.C(forName, "forName(\"UTF-8\")");
        f5086b = forName;
        e.C(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        e.C(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        e.C(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        Charset forName2 = Charset.forName("US-ASCII");
        e.C(forName2, "forName(\"US-ASCII\")");
        f5087c = forName2;
        e.C(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
