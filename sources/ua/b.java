package ua;

import java.util.List;
import je.f;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.data.repository.NotificationRepository$fetchNotifications$2", f = "NotificationRepository.kt", l = {25, 27}, m = "invokeSuspend")
public final class b extends i implements p<f<? super e<List<? extends bb.b>>>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11761a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f11762b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f11763c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar, d<? super b> dVar2) {
        super(2, dVar2);
        this.f11763c = dVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f11763c, dVar);
        bVar.f11762b = obj;
        return bVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((f) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: je.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            qd.a r0 = qd.a.COROUTINE_SUSPENDED
            int r1 = r12.f11761a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 == r3) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            l6.b1.w(r13)
            goto L_0x0093
        L_0x0011:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0019:
            java.lang.Object r1 = r12.f11762b
            je.f r1 = (je.f) r1
            l6.b1.w(r13)
            goto L_0x0038
        L_0x0021:
            l6.b1.w(r13)
            java.lang.Object r13 = r12.f11762b
            r1 = r13
            je.f r1 = (je.f) r1
            ua.d r13 = r12.f11763c
            ra.a r13 = r13.f11770b
            r12.f11762b = r1
            r12.f11761a = r3
            java.lang.Object r13 = r13.c(r12)
            if (r13 != r0) goto L_0x0038
            return r0
        L_0x0038:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = nd.g.S0(r13)
            r3.<init>(r4)
            java.util.Iterator r13 = r13.iterator()
        L_0x0047:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x006a
            java.lang.Object r4 = r13.next()
            sa.a r4 = (sa.a) r4
            java.lang.String r5 = "<this>"
            e6.e.D(r4, r5)
            bb.b r5 = new bb.b
            int r7 = r4.f11031a
            java.lang.String r8 = r4.f11032b
            long r9 = r4.f11033c
            boolean r11 = r4.f11035e
            r6 = r5
            r6.<init>(r7, r8, r9, r11)
            r3.add(r5)
            goto L_0x0047
        L_0x006a:
            ua.d r13 = r12.f11763c
            java.lang.String r13 = r13.f11769a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "fetchNotifications "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r13, r4)
            ua.e$b r13 = new ua.e$b
            r13.<init>(r3)
            r3 = 0
            r12.f11762b = r3
            r12.f11761a = r2
            java.lang.Object r13 = r1.a(r13, r12)
            if (r13 != r0) goto L_0x0093
            return r0
        L_0x0093:
            md.m r13 = md.m.f8555a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ua.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
