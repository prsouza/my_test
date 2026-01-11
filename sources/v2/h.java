package v2;

import a3.c;
import o2.l;
import org.slf4j.helpers.MessageFormatter;
import q2.b;
import q2.k;

public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f12206a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12207b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12208c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a forId(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i != 5) {
                return MERGE;
            }
            return EXCLUDE_INTERSECTIONS;
        }
    }

    public h(String str, a aVar, boolean z) {
        this.f12206a = str;
        this.f12207b = aVar;
        this.f12208c = z;
    }

    public final b a(l lVar, w2.b bVar) {
        if (lVar.C) {
            return new k(this);
        }
        c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("MergePaths{mode=");
        d10.append(this.f12207b);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
