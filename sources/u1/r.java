package u1;

import androidx.work.OverwritingInputMerger;
import androidx.work.impl.workers.DiagnosticsWorker;
import u1.w;

public final class r extends w {

    public static final class a extends w.a<a, r> {
        public a() {
            super(DiagnosticsWorker.class);
            this.f11660b.f4296d = OverwritingInputMerger.class.getName();
        }

        public final w b() {
            return new r(this);
        }

        public final w.a c() {
            return this;
        }
    }

    public r(a aVar) {
        super(aVar.f11659a, aVar.f11660b, aVar.f11661c);
    }
}
