package g0;

import a.a;
import android.graphics.Insets;
import android.graphics.Rect;
import org.slf4j.helpers.MessageFormatter;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f5202e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f5203a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5204b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5205c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5206d;

    public b(int i, int i10, int i11, int i12) {
        this.f5203a = i;
        this.f5204b = i10;
        this.f5205c = i11;
        this.f5206d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f5203a, bVar2.f5203a), Math.max(bVar.f5204b, bVar2.f5204b), Math.max(bVar.f5205c, bVar2.f5205c), Math.max(bVar.f5206d, bVar2.f5206d));
    }

    public static b b(int i, int i10, int i11, int i12) {
        if (i == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f5202e;
        }
        return new b(i, i10, i11, i12);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return Insets.of(this.f5203a, this.f5204b, this.f5205c, this.f5206d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5206d == bVar.f5206d && this.f5203a == bVar.f5203a && this.f5205c == bVar.f5205c && this.f5204b == bVar.f5204b;
    }

    public final int hashCode() {
        return (((((this.f5203a * 31) + this.f5204b) * 31) + this.f5205c) * 31) + this.f5206d;
    }

    public final String toString() {
        StringBuilder d10 = a.d("Insets{left=");
        d10.append(this.f5203a);
        d10.append(", top=");
        d10.append(this.f5204b);
        d10.append(", right=");
        d10.append(this.f5205c);
        d10.append(", bottom=");
        d10.append(this.f5206d);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
