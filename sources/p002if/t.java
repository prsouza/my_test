package p002if;

import e6.e;
import fe.k;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: if.t  reason: invalid package */
public final class t {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f6579d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f6580e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: f  reason: collision with root package name */
    public static final a f6581f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f6582a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6583b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f6584c;

    /* renamed from: if.t$a */
    public static final class a {
        public final t a(String str) {
            e.D(str, "$this$toMediaType");
            Matcher matcher = t.f6579d.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                e.C(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                e.C(locale, "Locale.US");
                String lowerCase = group.toLowerCase(locale);
                e.C(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                e.C(group2, "typeSubtype.group(2)");
                e.C(group2.toLowerCase(locale), "(this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = t.f6580e.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (k.d1(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                e.C(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder d10 = a.a.d("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        e.C(substring, "(this as java.lang.String).substring(startIndex)");
                        d10.append(substring);
                        d10.append("\" for: \"");
                        d10.append(str);
                        d10.append('\"');
                        throw new IllegalArgumentException(d10.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new t(str, lowerCase, (String[]) array);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public final t b(String str) {
            e.D(str, "$this$toMediaTypeOrNull");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public t(String str, String str2, String[] strArr) {
        this.f6582a = str;
        this.f6583b = str2;
        this.f6584c = strArr;
    }

    public static final t b(String str) {
        return f6581f.a(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c A[SYNTHETIC, Splitter:B:11:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.charset.Charset a(java.nio.charset.Charset r6) {
        /*
            r5 = this;
            java.lang.String[] r0 = r5.f6584c
            java.lang.String r1 = "<this>"
            e6.e.D(r0, r1)
            ce.c r1 = new ce.c
            int r0 = r0.length
            int r0 = r0 + -1
            r2 = 0
            r1.<init>(r2, r0)
            r0 = 2
            ce.a r0 = ad.c.y0(r1, r0)
            int r1 = r0.f3430a
            int r2 = r0.f3431b
            int r0 = r0.f3432c
            if (r0 < 0) goto L_0x0020
            if (r1 > r2) goto L_0x0039
            goto L_0x0022
        L_0x0020:
            if (r1 < r2) goto L_0x0039
        L_0x0022:
            java.lang.String[] r3 = r5.f6584c
            r3 = r3[r1]
            java.lang.String r4 = "charset"
            boolean r3 = fe.k.Y0(r3, r4)
            if (r3 == 0) goto L_0x0035
            java.lang.String[] r0 = r5.f6584c
            int r1 = r1 + 1
            r0 = r0[r1]
            goto L_0x003a
        L_0x0035:
            if (r1 == r2) goto L_0x0039
            int r1 = r1 + r0
            goto L_0x0022
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x0040
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r0)     // Catch:{ IllegalArgumentException -> 0x0040 }
        L_0x0040:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p002if.t.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && e.r(((t) obj).f6582a, this.f6582a);
    }

    public final int hashCode() {
        return this.f6582a.hashCode();
    }

    public final String toString() {
        return this.f6582a;
    }
}
