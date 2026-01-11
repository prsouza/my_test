package l6;

import androidx.appcompat.widget.d;
import java.util.Arrays;

public final class h0 extends m2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f7876a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7877b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7878c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7879d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7880e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f7881f;

    public h0(String str, long j10, int i, boolean z, boolean z10, byte[] bArr) {
        this.f7876a = str;
        this.f7877b = j10;
        this.f7878c = i;
        this.f7879d = z;
        this.f7880e = z10;
        this.f7881f = bArr;
    }

    public final int a() {
        return this.f7878c;
    }

    public final long b() {
        return this.f7877b;
    }

    public final String c() {
        return this.f7876a;
    }

    public final boolean d() {
        return this.f7880e;
    }

    public final boolean e() {
        return this.f7879d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            String str = this.f7876a;
            if (str != null ? str.equals(m2Var.c()) : m2Var.c() == null) {
                if (this.f7877b == m2Var.b() && this.f7878c == m2Var.a() && this.f7879d == m2Var.e() && this.f7880e == m2Var.d()) {
                    if (Arrays.equals(this.f7881f, m2Var instanceof h0 ? ((h0) m2Var).f7881f : m2Var.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final byte[] f() {
        return this.f7881f;
    }

    public final int hashCode() {
        int i;
        String str = this.f7876a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        long j10 = this.f7877b;
        int i10 = 1237;
        int i11 = (((((((i ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f7878c) * 1000003) ^ (true != this.f7879d ? 1237 : 1231)) * 1000003;
        if (true == this.f7880e) {
            i10 = 1231;
        }
        return ((i11 ^ i10) * 1000003) ^ Arrays.hashCode(this.f7881f);
    }

    public final String toString() {
        String str = this.f7876a;
        long j10 = this.f7877b;
        int i = this.f7878c;
        boolean z = this.f7879d;
        boolean z10 = this.f7880e;
        String arrays = Arrays.toString(this.f7881f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb2.append("ZipEntry{name=");
        sb2.append(str);
        sb2.append(", size=");
        sb2.append(j10);
        sb2.append(", compressionMethod=");
        sb2.append(i);
        sb2.append(", isPartial=");
        sb2.append(z);
        sb2.append(", isEndOfArchive=");
        sb2.append(z10);
        return d.b(sb2, ", headerBytes=", arrays, "}");
    }
}
