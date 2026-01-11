package e6;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f4641a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4642b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f4641a;
            f10 += ((b) cVar).f4642b;
        }
        this.f4641a = cVar;
        this.f4642b = f10;
    }

    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f4641a.a(rectF) + this.f4642b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f4641a.equals(bVar.f4641a) || this.f4642b != bVar.f4642b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4641a, Float.valueOf(this.f4642b)});
    }
}
