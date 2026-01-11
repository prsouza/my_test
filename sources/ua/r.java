package ua;

import java.util.ArrayList;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;

@e(c = "io.nodle.cash.data.repository.TransactionsRepository2", f = "TransactionsRepository2.kt", l = {157, 239}, m = "runRequest")
public final class r extends c {

    /* renamed from: a  reason: collision with root package name */
    public l f11904a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f11905b;

    /* renamed from: c  reason: collision with root package name */
    public ne.c f11906c;

    /* renamed from: s  reason: collision with root package name */
    public int f11907s;

    /* renamed from: t  reason: collision with root package name */
    public long f11908t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f11909u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ l f11910v;

    /* renamed from: w  reason: collision with root package name */
    public int f11911w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(l lVar, d<? super r> dVar) {
        super(dVar);
        this.f11910v = lVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f11909u = obj;
        this.f11911w |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        return l.b(this.f11910v, 0, 0, this);
    }
}
