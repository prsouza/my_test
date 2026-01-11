package sa;

import ah.v;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.m;
import androidx.fragment.app.o;
import bb.g;
import d0.a;
import e6.e;
import io.nodle.cash.R;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import org.slf4j.Marker;

public final class b implements Serializable {
    public boolean A;
    public String B;
    public String C;

    /* renamed from: a  reason: collision with root package name */
    public String f11036a;

    /* renamed from: b  reason: collision with root package name */
    public String f11037b;

    /* renamed from: c  reason: collision with root package name */
    public BigInteger f11038c;

    /* renamed from: s  reason: collision with root package name */
    public BigInteger f11039s;

    /* renamed from: t  reason: collision with root package name */
    public String f11040t;

    /* renamed from: u  reason: collision with root package name */
    public String f11041u;

    /* renamed from: v  reason: collision with root package name */
    public long f11042v;

    /* renamed from: w  reason: collision with root package name */
    public String f11043w;

    /* renamed from: x  reason: collision with root package name */
    public String f11044x;

    /* renamed from: y  reason: collision with root package name */
    public long f11045y;
    public g z;

    public b(String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, String str3, String str4, long j10, String str5, String str6, long j11, g gVar, boolean z10) {
        e.D(bigInteger, "amount");
        e.D(str6, "extrinsicHash");
        e.D(gVar, "type");
        this.f11036a = str;
        this.f11037b = str2;
        this.f11038c = bigInteger;
        this.f11039s = bigInteger2;
        this.f11040t = str3;
        this.f11041u = str4;
        this.f11042v = j10;
        this.f11043w = str5;
        this.f11044x = str6;
        this.f11045y = j11;
        this.z = gVar;
        this.A = z10;
    }

    public final String a(Context context) {
        int i;
        String str;
        e.D(context, "cxt");
        if (c(context)) {
            Object obj = a.f4256a;
            i = a.c.a(context, R.color.greenV2);
            str = Marker.ANY_NON_NULL_MARKER;
        } else {
            Object obj2 = a.f4256a;
            i = a.c.a(context, R.color.textSecondaryV2);
            str = "-";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(str);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        SpannableStringBuilder append = spannableStringBuilder.append(" ");
        BigInteger bigInteger = this.f11038c;
        e.D(bigInteger, "rawNodle");
        DecimalFormat decimalFormat = new DecimalFormat("0");
        decimalFormat.setMaximumFractionDigits(11);
        decimalFormat.setMinimumFractionDigits(2);
        BigDecimal divide = new BigDecimal(bigInteger).divide(BigDecimal.TEN.pow(11));
        e.C(divide, "rawNodle.toBigDecimal().…pow(AMOUNT_MAX_DECIMALS))");
        String format = decimalFormat.format(divide);
        if (format == null) {
            format = "0.00";
        }
        String spannableStringBuilder2 = append.append(format).toString();
        e.C(spannableStringBuilder2, "SpannableStringBuilder()…)\n            .toString()");
        return spannableStringBuilder2;
    }

    public final String b() {
        long j10 = this.f11045y;
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), "MMM d yyyy, jj:mm");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(bestDateTimePattern, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        simpleDateFormat.applyLocalizedPattern(bestDateTimePattern);
        String format = simpleDateFormat.format(Long.valueOf(j10));
        e.C(format, "formatter.format(timeStampMillis)");
        return format;
    }

    public final boolean c(Context context) {
        e.D(context, "cxt");
        return e.r(this.f11037b, v.J(context, qa.e.NODLE_PUBLIC_KEY_4)) || e.r(this.f11037b, v.J(context, qa.e.NODLE_PUBLIC_KEY_5));
    }

    public final void d(String str) {
        e.D(str, "<set-?>");
        this.f11044x = str;
    }

    public final void e(g gVar) {
        e.D(gVar, "<set-?>");
        this.z = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return e.r(this.f11036a, bVar.f11036a) && e.r(this.f11037b, bVar.f11037b) && e.r(this.f11038c, bVar.f11038c) && e.r(this.f11039s, bVar.f11039s) && e.r(this.f11040t, bVar.f11040t) && e.r(this.f11041u, bVar.f11041u) && this.f11042v == bVar.f11042v && e.r(this.f11043w, bVar.f11043w) && e.r(this.f11044x, bVar.f11044x) && this.f11045y == bVar.f11045y && this.z == bVar.z && this.A == bVar.A;
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        String substring = str.substring(0, 5);
        e.C(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = str.substring(str.length() - 5);
        e.C(substring2, "this as java.lang.String).substring(startIndex)");
        return o.c(substring, "...", substring2);
    }

    public final int hashCode() {
        String str = this.f11036a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11037b;
        int hashCode2 = (this.f11038c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        BigInteger bigInteger = this.f11039s;
        int hashCode3 = (hashCode2 + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
        String str3 = this.f11040t;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11041u;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        long j10 = this.f11042v;
        int i10 = (((hashCode4 + hashCode5) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str5 = this.f11043w;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int a10 = m.a(this.f11044x, (i10 + i) * 31, 31);
        long j11 = this.f11045y;
        int hashCode6 = (this.z.hashCode() + ((a10 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31;
        boolean z10 = this.A;
        if (z10) {
            z10 = true;
        }
        return hashCode6 + (z10 ? 1 : 0);
    }

    public final String toString() {
        String str = this.f11036a;
        String str2 = this.f11037b;
        BigInteger bigInteger = this.f11038c;
        BigInteger bigInteger2 = this.f11039s;
        String str3 = this.f11040t;
        String str4 = this.f11041u;
        long j10 = this.f11042v;
        String str5 = this.f11043w;
        String str6 = this.f11044x;
        long j11 = this.f11045y;
        g gVar = this.z;
        boolean z10 = this.A;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transaction(from=");
        sb2.append(str);
        sb2.append(", to=");
        sb2.append(str2);
        sb2.append(", amount=");
        sb2.append(bigInteger);
        sb2.append(", fees=");
        sb2.append(bigInteger2);
        sb2.append(", purpose=");
        h1.e.b(sb2, str3, ", blockHash='", str4, "', blockNumber=");
        sb2.append(j10);
        sb2.append(", extrinsicIndex=");
        sb2.append(str5);
        sb2.append(", extrinsicHash='");
        sb2.append(str6);
        sb2.append("', timestamp=");
        sb2.append(j11);
        sb2.append(", type=");
        sb2.append(gVar);
        sb2.append(", isPending=");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b() {
        /*
            r17 = this;
            r0 = 0
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r0)
            java.lang.String r0 = "valueOf(this.toLong())"
            e6.e.C(r5, r0)
            bb.g r15 = bb.g.NONE
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = ""
            r9 = 0
            r11 = 0
            java.lang.String r12 = ""
            r13 = 0
            r16 = 0
            r2 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.b.<init>():void");
    }
}
