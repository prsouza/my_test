package xa;

import e6.e;
import io.nodle.cash.R;
import java.io.Serializable;

public final class c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public b f13161a;

    /* renamed from: b  reason: collision with root package name */
    public int f13162b;

    /* renamed from: c  reason: collision with root package name */
    public a f13163c;

    public enum a {
        SUCCESS,
        FAILURE
    }

    public enum b {
        SHOW,
        UPDATE,
        HIDE
    }

    public c() {
    }

    public c(b bVar) {
        this.f13161a = bVar;
        this.f13162b = R.string.payInProgress;
    }

    public c(b bVar, int i, a aVar) {
        e.D(aVar, "result");
        this.f13161a = bVar;
        this.f13162b = i;
        this.f13163c = aVar;
    }
}
