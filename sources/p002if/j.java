package p002if;

import androidx.fragment.app.m;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import e6.e;
import fe.o;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jf.c;
import nf.c;

/* renamed from: if.j  reason: invalid package */
public final class j {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f6528j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f6529k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f6530l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f6531m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n  reason: collision with root package name */
    public static final a f6532n = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f6533a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6534b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6535c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6536d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6537e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6538f;
    public final boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6539h;
    public final boolean i;

    /* renamed from: if.j$a */
    public static final class a {
        public final int a(String str, int i, int i10, boolean z) {
            while (i < i10) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != 9) || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i10;
        }

        public final long b(String str, int i) {
            String str2 = str;
            int i10 = i;
            int a10 = a(str2, 0, i10, false);
            Matcher matcher = j.f6531m.matcher(str2);
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            while (a10 < i10) {
                int a11 = a(str2, a10 + 1, i10, true);
                matcher.region(a10, a11);
                if (i12 == -1 && matcher.usePattern(j.f6531m).matches()) {
                    String group = matcher.group(1);
                    e.C(group, "matcher.group(1)");
                    i12 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    e.C(group2, "matcher.group(2)");
                    i15 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    e.C(group3, "matcher.group(3)");
                    i16 = Integer.parseInt(group3);
                } else if (i13 != -1 || !matcher.usePattern(j.f6530l).matches()) {
                    if (i14 == -1) {
                        Pattern pattern = j.f6529k;
                        if (matcher.usePattern(pattern).matches()) {
                            String group4 = matcher.group(1);
                            e.C(group4, "matcher.group(1)");
                            Locale locale = Locale.US;
                            e.C(locale, "Locale.US");
                            String lowerCase = group4.toLowerCase(locale);
                            e.C(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            String pattern2 = pattern.pattern();
                            e.C(pattern2, "MONTH_PATTERN.pattern()");
                            i14 = o.m1(pattern2, lowerCase, 0, false, 6) / 4;
                        }
                    }
                    if (i11 == -1 && matcher.usePattern(j.f6528j).matches()) {
                        String group5 = matcher.group(1);
                        e.C(group5, "matcher.group(1)");
                        i11 = Integer.parseInt(group5);
                    }
                } else {
                    String group6 = matcher.group(1);
                    e.C(group6, "matcher.group(1)");
                    i13 = Integer.parseInt(group6);
                }
                a10 = a(str2, a11 + 1, i10, false);
            }
            if (70 <= i11 && 99 >= i11) {
                i11 += 1900;
            }
            if (i11 >= 0 && 69 >= i11) {
                i11 += CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
            }
            if (i11 >= 1601) {
                if (i14 != -1) {
                    if (1 <= i13 && 31 >= i13) {
                        if (i12 >= 0 && 23 >= i12) {
                            if (i15 >= 0 && 59 >= i15) {
                                if (i16 >= 0 && 59 >= i16) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(c.f7254e);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i11);
                                    gregorianCalendar.set(2, i14 - 1);
                                    gregorianCalendar.set(5, i13);
                                    gregorianCalendar.set(11, i12);
                                    gregorianCalendar.set(12, i15);
                                    gregorianCalendar.set(13, i16);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public j(String str, String str2, long j10, String str3, String str4, boolean z, boolean z10, boolean z11, boolean z12) {
        this.f6533a = str;
        this.f6534b = str2;
        this.f6535c = j10;
        this.f6536d = str3;
        this.f6537e = str4;
        this.f6538f = z;
        this.g = z10;
        this.f6539h = z11;
        this.i = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            return e.r(jVar.f6533a, this.f6533a) && e.r(jVar.f6534b, this.f6534b) && jVar.f6535c == this.f6535c && e.r(jVar.f6536d, this.f6536d) && e.r(jVar.f6537e, this.f6537e) && jVar.f6538f == this.f6538f && jVar.g == this.g && jVar.f6539h == this.f6539h && jVar.i == this.i;
        }
    }

    public final int hashCode() {
        int a10 = m.a(this.f6534b, m.a(this.f6533a, 527, 31), 31);
        long j10 = this.f6535c;
        int i10 = 1231;
        int a11 = (((((m.a(this.f6537e, m.a(this.f6536d, (a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31) + (this.f6538f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.f6539h ? 1231 : 1237)) * 31;
        if (!this.i) {
            i10 = 1237;
        }
        return a11 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6533a);
        sb2.append('=');
        sb2.append(this.f6534b);
        if (this.f6539h) {
            if (this.f6535c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                Date date = new Date(this.f6535c);
                c.a aVar = nf.c.f9006a;
                String format = ((DateFormat) nf.c.f9006a.get()).format(date);
                e.C(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(format);
            }
        }
        if (!this.i) {
            sb2.append("; domain=");
            sb2.append(this.f6536d);
        }
        sb2.append("; path=");
        sb2.append(this.f6537e);
        if (this.f6538f) {
            sb2.append("; secure");
        }
        if (this.g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        e.C(sb3, "toString()");
        return sb3;
    }
}
