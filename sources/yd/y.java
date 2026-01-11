package yd;

import androidx.fragment.app.o;
import com.github.mikephil.charting.BuildConfig;
import de.c;
import de.i;
import de.j;
import de.k;
import e6.e;
import java.util.List;
import java.util.Objects;
import nd.m;
import org.slf4j.Marker;
import xd.l;

public final class y implements i {

    /* renamed from: a  reason: collision with root package name */
    public final c f13625a;

    /* renamed from: b  reason: collision with root package name */
    public final List<j> f13626b;

    /* renamed from: c  reason: collision with root package name */
    public final i f13627c = null;

    /* renamed from: d  reason: collision with root package name */
    public final int f13628d = 0;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13629a;

        static {
            int[] iArr = new int[k.values().length];
            iArr[k.INVARIANT.ordinal()] = 1;
            iArr[k.IN.ordinal()] = 2;
            iArr[k.OUT.ordinal()] = 3;
            f13629a = iArr;
        }
    }

    public static final class b extends h implements l<j, CharSequence> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ y f13630b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(y yVar) {
            super(1);
            this.f13630b = yVar;
        }

        public final Object k(Object obj) {
            String str;
            j jVar = (j) obj;
            e.D(jVar, "it");
            Objects.requireNonNull(this.f13630b);
            if (jVar.f4456a == null) {
                return Marker.ANY_MARKER;
            }
            i iVar = jVar.f4457b;
            y yVar = iVar instanceof y ? (y) iVar : null;
            if (yVar == null || (str = yVar.d(true)) == null) {
                str = String.valueOf(jVar.f4457b);
            }
            int i = a.f13629a[jVar.f4456a.ordinal()];
            if (i == 1) {
                return str;
            }
            if (i == 2) {
                return a8.a.c("in ", str);
            }
            if (i == 3) {
                return a8.a.c("out ", str);
            }
            throw new md.e();
        }
    }

    public y(c cVar, List list) {
        e.D(list, "arguments");
        this.f13625a = cVar;
        this.f13626b = list;
    }

    public final List<j> a() {
        return this.f13626b;
    }

    public final boolean b() {
        return (this.f13628d & 1) != 0;
    }

    public final c c() {
        return this.f13625a;
    }

    public final String d(boolean z) {
        String str;
        String str2;
        c cVar = this.f13625a;
        Class cls = null;
        de.b bVar = cVar instanceof de.b ? (de.b) cVar : null;
        if (bVar != null) {
            cls = aa.b.G(bVar);
        }
        if (cls == null) {
            str = this.f13625a.toString();
        } else if ((this.f13628d & 4) != 0) {
            str = "kotlin.Nothing";
        } else if (cls.isArray()) {
            if (e.r(cls, boolean[].class)) {
                str = "kotlin.BooleanArray";
            } else if (e.r(cls, char[].class)) {
                str = "kotlin.CharArray";
            } else if (e.r(cls, byte[].class)) {
                str = "kotlin.ByteArray";
            } else if (e.r(cls, short[].class)) {
                str = "kotlin.ShortArray";
            } else if (e.r(cls, int[].class)) {
                str = "kotlin.IntArray";
            } else if (e.r(cls, float[].class)) {
                str = "kotlin.FloatArray";
            } else if (e.r(cls, long[].class)) {
                str = "kotlin.LongArray";
            } else {
                str = e.r(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
            }
        } else if (!z || !cls.isPrimitive()) {
            str = cls.getName();
        } else {
            str = aa.b.H((de.b) this.f13625a).getName();
        }
        boolean isEmpty = this.f13626b.isEmpty();
        String str3 = BuildConfig.FLAVOR;
        if (isEmpty) {
            str2 = str3;
        } else {
            str2 = m.b1(this.f13626b, ", ", "<", ">", new b(this), 24);
        }
        if (b()) {
            str3 = "?";
        }
        String c10 = o.c(str, str2, str3);
        i iVar = this.f13627c;
        if (!(iVar instanceof y)) {
            return c10;
        }
        String d10 = ((y) iVar).d(true);
        if (e.r(d10, c10)) {
            return c10;
        }
        if (e.r(d10, c10 + '?')) {
            return c10 + '!';
        }
        return '(' + c10 + ".." + d10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            return e.r(this.f13625a, yVar.f13625a) && e.r(this.f13626b, yVar.f13626b) && e.r(this.f13627c, yVar.f13627c) && this.f13628d == yVar.f13628d;
        }
    }

    public final int hashCode() {
        int hashCode = this.f13626b.hashCode();
        return Integer.valueOf(this.f13628d).hashCode() + ((hashCode + (this.f13625a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return d(false) + " (Kotlin reflection is not available)";
    }
}
