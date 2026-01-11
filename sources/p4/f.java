package p4;

import androidx.fragment.app.o;
import h4.g;
import h4.h;
import h4.i;
import h4.j;
import l4.a;
import org.slf4j.helpers.MessageFormatter;

public final class f extends j {

    /* renamed from: c  reason: collision with root package name */
    public final f f9682c;

    /* renamed from: d  reason: collision with root package name */
    public final a f9683d;

    /* renamed from: e  reason: collision with root package name */
    public int f9684e;

    /* renamed from: f  reason: collision with root package name */
    public String f9685f;
    public Object g;

    /* renamed from: h  reason: collision with root package name */
    public f f9686h = null;

    public f(f fVar, a aVar, int i, int i10) {
        this.f9682c = fVar;
        this.f9683d = aVar;
        this.f5834a = i;
        this.f9684e = i10;
        this.f5835b = -1;
    }

    public final String a() {
        return this.f9685f;
    }

    public final f e(int i) {
        a aVar;
        f fVar = this.f9686h;
        if (fVar == null) {
            a aVar2 = this.f9683d;
            if (aVar2 == null) {
                aVar = null;
            } else {
                aVar = aVar2.a();
            }
            fVar = new f(this, aVar, 1, i);
            this.f9686h = fVar;
        } else {
            fVar.g(1, i);
        }
        return fVar;
    }

    public final boolean f() {
        int i = this.f5835b + 1;
        this.f5835b = i;
        return i != this.f9684e;
    }

    public final void g(int i, int i10) {
        this.f5834a = i;
        this.f9684e = i10;
        this.f5835b = -1;
        this.f9685f = null;
        this.g = null;
        a aVar = this.f9683d;
        if (aVar != null) {
            aVar.f7773b = null;
            aVar.f7774c = null;
            aVar.f7775d = null;
        }
    }

    public final void h(String str) throws i {
        this.f9685f = str;
        a aVar = this.f9683d;
        if (aVar != null && aVar.b(str)) {
            String c10 = o.c("Duplicate field '", str, "'");
            Object obj = aVar.f7772a;
            h4.f fVar = null;
            if (obj instanceof h) {
                fVar = ((h) obj).a();
            }
            throw new g(c10, fVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i = this.f5834a;
        if (i == 0) {
            sb2.append("/");
        } else if (i == 1) {
            sb2.append('[');
            int i10 = this.f5835b;
            if (i10 < 0) {
                i10 = 0;
            }
            sb2.append(i10);
            sb2.append(']');
        } else if (i == 2) {
            sb2.append(MessageFormatter.DELIM_START);
            if (this.f9685f != null) {
                sb2.append('\"');
                k4.a.a(sb2, this.f9685f);
                sb2.append('\"');
            } else {
                sb2.append('?');
            }
            sb2.append(MessageFormatter.DELIM_STOP);
        }
        return sb2.toString();
    }
}
