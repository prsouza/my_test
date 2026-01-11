package ua;

import java.util.List;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;

@e(c = "io.nodle.cash.data.repository.TransactionRepository", f = "TransactionRepository.kt", l = {290, 292, 294}, m = "saveTransactions")
public final class k extends c {

    /* renamed from: a  reason: collision with root package name */
    public f f11848a;

    /* renamed from: b  reason: collision with root package name */
    public List f11849b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f11850c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ f f11851s;

    /* renamed from: t  reason: collision with root package name */
    public int f11852t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(f fVar, d<? super k> dVar) {
        super(dVar);
        this.f11851s = fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f11850c = obj;
        this.f11852t |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        return f.b(this.f11851s, (List) null, this);
    }
}
