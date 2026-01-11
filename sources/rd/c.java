package rd;

import e6.e;
import pd.d;
import pd.e;
import pd.f;

public abstract class c extends a {
    private final f _context;
    private transient d<Object> intercepted;

    public c(d<Object> dVar, f fVar) {
        super(dVar);
        this._context = fVar;
    }

    public f getContext() {
        f fVar = this._context;
        e.B(fVar);
        return fVar;
    }

    public final d<Object> intercepted() {
        d<Object> dVar = this.intercepted;
        if (dVar == null) {
            f context = getContext();
            int i = pd.e.f9878p;
            pd.e eVar = (pd.e) context.get(e.a.f9879a);
            if (eVar == null || (dVar = eVar.f0(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    public void releaseIntercepted() {
        d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            f context = getContext();
            int i = pd.e.f9878p;
            f.a aVar = context.get(e.a.f9879a);
            e6.e.B(aVar);
            ((pd.e) aVar).e(dVar);
        }
        this.intercepted = b.f10668a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
