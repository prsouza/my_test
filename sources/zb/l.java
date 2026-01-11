package zb;

import com.github.mikephil.charting.BuildConfig;

public enum l {
    LOOSE {
        public Object a(m mVar) {
            int n10 = mVar.n();
            int i = mVar.f14340b;
            int i10 = mVar.f14342d;
            if (n10 <= i - i10 && n10 > 0) {
                String str = new String(mVar.f14339a, i10, n10, t.f14377a);
                mVar.f14342d += n10;
                return str;
            } else if (n10 == 0) {
                return BuildConfig.FLAVOR;
            } else {
                if (n10 > i) {
                    return new String(mVar.g(n10), t.f14377a);
                }
                mVar.m(n10);
                throw u.b();
            }
        }
    },
    STRICT {
        public Object a(m mVar) {
            return mVar.q();
        }
    };

    /* 'enum' modifier removed */
    public static class c extends l {
        public c(String str, int i) {
            super(str, i);
        }

        public Object a(m mVar) {
            return mVar.f();
        }
    }

    public abstract Object a(m mVar);
}
