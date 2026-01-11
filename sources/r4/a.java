package r4;

import a.b;
import com.github.mikephil.charting.BuildConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import t4.k;

public final class a implements k {

    /* renamed from: c  reason: collision with root package name */
    public static final String f10565c = b.r0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d  reason: collision with root package name */
    public static final Set<q4.b> f10566d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new q4.b[]{new q4.b("proto"), new q4.b("json")})));

    /* renamed from: e  reason: collision with root package name */
    public static final a f10567e;

    /* renamed from: a  reason: collision with root package name */
    public final String f10568a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10569b;

    static {
        String r02 = b.r0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String r03 = b.r0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f10567e = new a(r02, r03);
    }

    public a(String str, String str2) {
        this.f10568a = str;
        this.f10569b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public final byte[] b() {
        String str = this.f10569b;
        if (str == null && this.f10568a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f10568a;
        objArr[2] = "\\";
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
