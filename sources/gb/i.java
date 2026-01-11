package gb;

import androidx.fragment.app.m;
import c3.k;
import e6.e;
import java.util.Objects;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f5330a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5331b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5332c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5333d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5334e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5335f;
    public final boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5336h;
    public final h i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f5337j;

    /* renamed from: k  reason: collision with root package name */
    public final Integer f5338k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5339l;

    public i() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (h) null, (Integer) null, (Integer) null, (String) null, 4095, (k) null);
    }

    public i(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z10, h hVar, Integer num, Integer num2, String str7) {
        e.D(str4, "amount");
        e.D(hVar, "payLimitError");
        this.f5330a = str;
        this.f5331b = str2;
        this.f5332c = str3;
        this.f5333d = str4;
        this.f5334e = str5;
        this.f5335f = str6;
        this.g = z;
        this.f5336h = z10;
        this.i = hVar;
        this.f5337j = num;
        this.f5338k = num2;
        this.f5339l = str7;
    }

    public static i a(i iVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z10, h hVar, Integer num, Integer num2, String str7, int i10) {
        i iVar2 = iVar;
        int i11 = i10;
        String str8 = (i11 & 1) != 0 ? iVar2.f5330a : str;
        String str9 = (i11 & 2) != 0 ? iVar2.f5331b : str2;
        String str10 = (i11 & 4) != 0 ? iVar2.f5332c : str3;
        String str11 = (i11 & 8) != 0 ? iVar2.f5333d : str4;
        String str12 = (i11 & 16) != 0 ? iVar2.f5334e : str5;
        String str13 = (i11 & 32) != 0 ? iVar2.f5335f : str6;
        boolean z11 = (i11 & 64) != 0 ? iVar2.g : z;
        boolean z12 = (i11 & 128) != 0 ? iVar2.f5336h : z10;
        h hVar2 = (i11 & 256) != 0 ? iVar2.i : hVar;
        Integer num3 = (i11 & 512) != 0 ? iVar2.f5337j : num;
        Integer num4 = (i11 & 1024) != 0 ? iVar2.f5338k : num2;
        String str14 = (i11 & 2048) != 0 ? iVar2.f5339l : str7;
        Objects.requireNonNull(iVar);
        e.D(str11, "amount");
        e.D(hVar2, "payLimitError");
        return new i(str8, str9, str10, str11, str12, str13, z11, z12, hVar2, num3, num4, str14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return e.r(this.f5330a, iVar.f5330a) && e.r(this.f5331b, iVar.f5331b) && e.r(this.f5332c, iVar.f5332c) && e.r(this.f5333d, iVar.f5333d) && e.r(this.f5334e, iVar.f5334e) && e.r(this.f5335f, iVar.f5335f) && this.g == iVar.g && this.f5336h == iVar.f5336h && this.i == iVar.i && e.r(this.f5337j, iVar.f5337j) && e.r(this.f5338k, iVar.f5338k) && e.r(this.f5339l, iVar.f5339l);
    }

    public final int hashCode() {
        String str = this.f5330a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5331b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5332c;
        int a10 = m.a(this.f5333d, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f5334e;
        int hashCode3 = (a10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5335f;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z = this.g;
        boolean z10 = true;
        if (z) {
            z = true;
        }
        int i11 = (hashCode4 + (z ? 1 : 0)) * 31;
        boolean z11 = this.f5336h;
        if (!z11) {
            z10 = z11;
        }
        int hashCode5 = (this.i.hashCode() + ((i11 + (z10 ? 1 : 0)) * 31)) * 31;
        Integer num = this.f5337j;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5338k;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.f5339l;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode7 + i10;
    }

    public final String toString() {
        String str = this.f5330a;
        String str2 = this.f5331b;
        String str3 = this.f5332c;
        String str4 = this.f5333d;
        String str5 = this.f5334e;
        String str6 = this.f5335f;
        boolean z = this.g;
        boolean z10 = this.f5336h;
        h hVar = this.i;
        Integer num = this.f5337j;
        Integer num2 = this.f5338k;
        String str7 = this.f5339l;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PayUiState(nodleBalance=");
        sb2.append(str);
        sb2.append(", fromAddress=");
        sb2.append(str2);
        sb2.append(", toAddress=");
        h1.e.b(sb2, str3, ", amount=", str4, ", fees=");
        h1.e.b(sb2, str5, ", totalAmount=", str6, ", isPayEnabled=");
        sb2.append(z);
        sb2.append(", showFeeProgress=");
        sb2.append(z10);
        sb2.append(", payLimitError=");
        sb2.append(hVar);
        sb2.append(", addressError=");
        sb2.append(num);
        sb2.append(", transferError=");
        sb2.append(num2);
        sb2.append(", transferErrorMessage=");
        sb2.append(str7);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ i(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z10, h hVar, Integer num, Integer num2, String str7, int i10, k kVar) {
        this((String) null, (String) null, (String) null, "0", (String) null, (String) null, false, false, h.NONE, (Integer) null, (Integer) null, (String) null);
    }
}
