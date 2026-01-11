package ua;

import je.f;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.data.repository.NotificationRepository$pushIsSeen$2", f = "NotificationRepository.kt", l = {39, 40}, m = "invokeSuspend")
public final class c extends i implements p<f<? super e<Object>>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11764a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f11765b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f11766c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ d f11767s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f11768t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(boolean z, d dVar, int i, d<? super c> dVar2) {
        super(2, dVar2);
        this.f11766c = z;
        this.f11767s = dVar;
        this.f11768t = i;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        c cVar = new c(this.f11766c, this.f11767s, this.f11768t, dVar);
        cVar.f11765b = obj;
        return cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: je.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r1 = r6.f11764a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            l6.b1.w(r7)
            goto L_0x004c
        L_0x0010:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0018:
            java.lang.Object r1 = r6.f11765b
            je.f r1 = (je.f) r1
            l6.b1.w(r7)
            goto L_0x003b
        L_0x0020:
            l6.b1.w(r7)
            java.lang.Object r7 = r6.f11765b
            r1 = r7
            je.f r1 = (je.f) r1
            boolean r7 = r6.f11766c
            ua.d r4 = r6.f11767s
            ra.a r4 = r4.f11770b
            int r5 = r6.f11768t
            r6.f11765b = r1
            r6.f11764a = r3
            java.lang.Object r7 = r4.a(r5, r7, r6)
            if (r7 != r0) goto L_0x003b
            return r0
        L_0x003b:
            ua.e$b r7 = new ua.e$b
            r3 = 0
            r7.<init>()
            r6.f11765b = r3
            r6.f11764a = r2
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 != r0) goto L_0x004c
            return r0
        L_0x004c:
            md.m r7 = md.m.f8555a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
