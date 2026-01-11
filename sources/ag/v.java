package ag;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public final class v implements Enumeration {

    /* renamed from: a  reason: collision with root package name */
    public int f454a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f455b;

    public v(w wVar) {
        this.f455b = wVar;
    }

    public final boolean hasMoreElements() {
        return this.f454a < this.f455b.f458a.length;
    }

    public final Object nextElement() {
        int i = this.f454a;
        d[] dVarArr = this.f455b.f458a;
        if (i < dVarArr.length) {
            this.f454a = i + 1;
            return dVarArr[i];
        }
        throw new NoSuchElementException("ASN1Set Enumeration");
    }
}
