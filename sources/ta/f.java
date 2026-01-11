package ta;

import android.content.Context;
import com.google.gson.Gson;
import io.nodle.cash.data.remote.api.SubstrateApi;
import java.util.concurrent.TimeUnit;
import ki.a0;
import net.jpountz.lz4.LZ4FrameOutputStream;
import p002if.v;
import pd.d;
import rd.c;
import rd.e;
import xd.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f11451a = new f();

    @e(c = "io.nodle.cash.data.remote.RetrofitHelper", f = "RetrofitHelper.kt", l = {60}, m = "request")
    public static final class a<T> extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f11452a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f11453b;

        /* renamed from: c  reason: collision with root package name */
        public int f11454c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, d<? super a> dVar) {
            super(dVar);
            this.f11453b = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f11452a = obj;
            this.f11454c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f11453b.c((l) null, this);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<ki.f$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List<if.s>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.util.List<if.s>, java.util.ArrayList] */
    public final a0 a(Context context) {
        a0.b bVar = new a0.b();
        bVar.a();
        bVar.f7580d.add(new li.a(new Gson()));
        v.a aVar = new v.a();
        aVar.f6609c.add(new d(context));
        if (context != null) {
            aVar.f6609c.add(new e4.a(context));
        }
        e6.e.D(TimeUnit.SECONDS, "unit");
        aVar.f6622r = jf.c.b();
        aVar.f6623s = jf.c.b();
        aVar.f6624t = jf.c.b();
        bVar.f7578b = new v(aVar);
        return bVar.b();
    }

    public final SubstrateApi b(Context context) {
        Object b10 = a(context).b(SubstrateApi.class);
        e6.e.C(b10, "buildRetrofit(context).c…SubstrateApi::class.java)");
        return (SubstrateApi) b10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object c(xd.l<? super pd.d<? super ki.z<T>>, ? extends java.lang.Object> r6, pd.d<? super ta.e<? extends T>> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "f"
            boolean r1 = r7 instanceof ta.f.a
            if (r1 == 0) goto L_0x0015
            r1 = r7
            ta.f$a r1 = (ta.f.a) r1
            int r2 = r1.f11454c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f11454c = r2
            goto L_0x001a
        L_0x0015:
            ta.f$a r1 = new ta.f$a
            r1.<init>(r5, r7)
        L_0x001a:
            java.lang.Object r7 = r1.f11452a
            qd.a r2 = qd.a.COROUTINE_SUSPENDED
            int r3 = r1.f11454c
            r4 = 1
            if (r3 == 0) goto L_0x0031
            if (r3 != r4) goto L_0x0029
            l6.b1.w(r7)     // Catch:{ all -> 0x00ad }
            goto L_0x0042
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            l6.b1.w(r7)
            java.lang.String r7 = "REQUEST firing ..."
            android.util.Log.d(r0, r7)     // Catch:{ all -> 0x00ad }
            r1.f11454c = r4     // Catch:{ all -> 0x00ad }
            java.lang.Object r7 = r6.k(r1)     // Catch:{ all -> 0x00ad }
            if (r7 != r2) goto L_0x0042
            return r2
        L_0x0042:
            ki.z r7 = (ki.z) r7     // Catch:{ all -> 0x00ad }
            if.a0 r6 = r7.f7732a     // Catch:{ all -> 0x00ad }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r1.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = "RESPONSE Raw: "
            r1.append(r2)     // Catch:{ all -> 0x00ad }
            r1.append(r6)     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x00ad }
            android.util.Log.d(r0, r6)     // Catch:{ all -> 0x00ad }
            boolean r6 = r7.a()     // Catch:{ all -> 0x00ad }
            if (r6 == 0) goto L_0x006c
            ta.h r6 = new ta.h     // Catch:{ all -> 0x00ad }
            if.a0 r1 = r7.f7732a     // Catch:{ all -> 0x00ad }
            int r1 = r1.f6455s     // Catch:{ all -> 0x00ad }
            T r7 = r7.f7733b     // Catch:{ all -> 0x00ad }
            r6.<init>(r1, r7)     // Catch:{ all -> 0x00ad }
            goto L_0x00ac
        L_0x006c:
            if.a0 r6 = r7.f7732a     // Catch:{ all -> 0x00ad }
            int r1 = r6.f6455s     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = r6.f6454c     // Catch:{ all -> 0x00ad }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r2.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "RESPONSE Failure: "
            r2.append(r3)     // Catch:{ all -> 0x00ad }
            r2.append(r1)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = " - "
            r2.append(r1)     // Catch:{ all -> 0x00ad }
            r2.append(r6)     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00ad }
            android.util.Log.w(r0, r6)     // Catch:{ all -> 0x00ad }
            ta.b r6 = new ta.b     // Catch:{ all -> 0x00ad }
            if.a0 r1 = r7.f7732a     // Catch:{ all -> 0x00ad }
            int r2 = r1.f6455s     // Catch:{ all -> 0x00ad }
            if.b0 r7 = r7.f7734c     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = r1.f6454c     // Catch:{ all -> 0x00ad }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r3.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r4 = "FAIL: "
            r3.append(r4)     // Catch:{ all -> 0x00ad }
            r3.append(r1)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00ad }
            r6.<init>(r2, r7, r1)     // Catch:{ all -> 0x00ad }
        L_0x00ac:
            return r6
        L_0x00ad:
            r6 = move-exception
            boolean r7 = r6 instanceof ta.c
            if (r7 == 0) goto L_0x00b8
            java.lang.String r7 = "RESPONSE Error: No internet connection."
            android.util.Log.w(r0, r7)
            goto L_0x00c0
        L_0x00b8:
            java.lang.String r7 = "RESPONSE Error:"
            android.util.Log.w(r0, r7)
            r6.printStackTrace()
        L_0x00c0:
            ta.a r7 = new ta.a
            java.lang.String r0 = r6.getLocalizedMessage()
            java.lang.String r1 = "ERROR: "
            java.lang.String r0 = a8.a.c(r1, r0)
            r7.<init>(r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ta.f.c(xd.l, pd.d):java.lang.Object");
    }
}
