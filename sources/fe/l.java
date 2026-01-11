package fe;

import e6.e;
import md.f;
import xd.p;
import yd.h;

public final class l extends h implements p<CharSequence, Integer, f<? extends Integer, ? extends Integer>> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ char[] f5104b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f5105c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(char[] cArr, boolean z) {
        super(2);
        this.f5104b = cArr;
        this.f5105c = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        e.D(charSequence, "$this$$receiver");
        int n12 = o.n1(charSequence, this.f5104b, intValue, this.f5105c);
        if (n12 < 0) {
            return null;
        }
        return new f(Integer.valueOf(n12), 1);
    }
}
