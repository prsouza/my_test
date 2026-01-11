package d2;

import h1.e0;
import h1.o;
import l1.e;

public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f4287a;

    /* renamed from: b  reason: collision with root package name */
    public final o f4288b;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        public final void e(e eVar, Object obj) {
            j jVar = (j) obj;
            String str = jVar.f4285a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            String str2 = jVar.f4286b;
            if (str2 == null) {
                eVar.D(2);
            } else {
                eVar.r(2, str2);
            }
        }
    }

    public l(e0 e0Var) {
        this.f4287a = e0Var;
        this.f4288b = new a(e0Var);
    }
}
