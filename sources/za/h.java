package za;

import ah.v;
import android.content.Context;
import io.nodle.cash.data.remote.api.SubstrateApi;
import io.nodle.cash.data.remote.api.SubstrateApiKt;
import java.math.BigInteger;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;
import ki.z;
import l6.b1;
import nd.o;
import net.jpountz.lz4.LZ4FrameOutputStream;
import p002if.b0;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f14215a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static BigInteger f14216b;

    /* renamed from: c  reason: collision with root package name */
    public static String f14217c;

    /* renamed from: d  reason: collision with root package name */
    public static kc.a f14218d;

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper", f = "SubstrateHelper.kt", l = {195, 202, 203, 204}, m = "buildTransferExtrinsic")
    public static final class a extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public Object f14219a;

        /* renamed from: b  reason: collision with root package name */
        public Object f14220b;

        /* renamed from: c  reason: collision with root package name */
        public Object f14221c;

        /* renamed from: s  reason: collision with root package name */
        public Object f14222s;

        /* renamed from: t  reason: collision with root package name */
        public Object f14223t;

        /* renamed from: u  reason: collision with root package name */
        public Object f14224u;

        /* renamed from: v  reason: collision with root package name */
        public Object f14225v;

        /* renamed from: w  reason: collision with root package name */
        public BigInteger f14226w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f14227x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ h f14228y;
        public int z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, pd.d<? super a> dVar) {
            super(dVar);
            this.f14228y = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f14227x = obj;
            this.z |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f14228y.a((Context) null, (List<String>) null, (String) null, (BigInteger) null, this);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper", f = "SubstrateHelper.kt", l = {364}, m = "getGenesisHash")
    public static final class b extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f14229a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f14230b;

        /* renamed from: c  reason: collision with root package name */
        public int f14231c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h hVar, pd.d<? super b> dVar) {
            super(dVar);
            this.f14230b = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f14229a = obj;
            this.f14231c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            h hVar = this.f14230b;
            h hVar2 = h.f14215a;
            return hVar.c((Context) null, this);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper$getGenesisHash$result$1", f = "SubstrateHelper.kt", l = {366}, m = "invokeSuspend")
    public static final class c extends rd.i implements xd.l<pd.d<? super z<b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f14232a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f14233b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, pd.d<? super c> dVar) {
            super(1, dVar);
            this.f14233b = context;
        }

        public final pd.d<md.m> create(pd.d<?> dVar) {
            return new c(this.f14233b, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f14232a;
            if (i == 0) {
                b1.w(obj);
                SubstrateApi b10 = ta.f.f11451a.b(this.f14233b);
                String K = v.K("nodle_mainnet_public_url");
                p002if.z genesisHashRequestBody = SubstrateApiKt.getGenesisHashRequestBody();
                this.f14232a = 1;
                obj = b10.requestSubstrate(K, genesisHashRequestBody, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object k(Object obj) {
            return ((c) create((pd.d) obj)).invokeSuspend(md.m.f8555a);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper", f = "SubstrateHelper.kt", l = {333}, m = "getNonce")
    public static final class d extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f14234a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f14235b;

        /* renamed from: c  reason: collision with root package name */
        public int f14236c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(h hVar, pd.d<? super d> dVar) {
            super(dVar);
            this.f14235b = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f14234a = obj;
            this.f14236c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            h hVar = this.f14235b;
            h hVar2 = h.f14215a;
            return hVar.f((Context) null, (String) null, this);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper$getNonce$result$1", f = "SubstrateHelper.kt", l = {335}, m = "invokeSuspend")
    public static final class e extends rd.i implements xd.l<pd.d<? super z<b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f14237a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f14238b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f14239c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Context context, String str, pd.d<? super e> dVar) {
            super(1, dVar);
            this.f14238b = context;
            this.f14239c = str;
        }

        public final pd.d<md.m> create(pd.d<?> dVar) {
            return new e(this.f14238b, this.f14239c, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f14237a;
            if (i == 0) {
                b1.w(obj);
                SubstrateApi b10 = ta.f.f11451a.b(this.f14238b);
                String K = v.K("nodle_mainnet_public_url");
                p002if.z nonceRequestBody = SubstrateApiKt.getNonceRequestBody(this.f14239c);
                this.f14237a = 1;
                obj = b10.requestSubstrate(K, nonceRequestBody, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object k(Object obj) {
            return ((e) create((pd.d) obj)).invokeSuspend(md.m.f8555a);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper", f = "SubstrateHelper.kt", l = {180}, m = "getRuntimeSnapshot")
    public static final class f extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public h f14240a;

        /* renamed from: b  reason: collision with root package name */
        public Context f14241b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f14242c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ h f14243s;

        /* renamed from: t  reason: collision with root package name */
        public int f14244t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(h hVar, pd.d<? super f> dVar) {
            super(dVar);
            this.f14243s = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f14242c = obj;
            this.f14244t |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            h hVar = this.f14243s;
            h hVar2 = h.f14215a;
            return hVar.h((Context) null, this);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper", f = "SubstrateHelper.kt", l = {389}, m = "getRuntimeVersion")
    public static final class g extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f14245a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f14246b;

        /* renamed from: c  reason: collision with root package name */
        public int f14247c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(h hVar, pd.d<? super g> dVar) {
            super(dVar);
            this.f14246b = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f14245a = obj;
            this.f14247c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            h hVar = this.f14246b;
            h hVar2 = h.f14215a;
            return hVar.i((Context) null, this);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper$getRuntimeVersion$result$1", f = "SubstrateHelper.kt", l = {391}, m = "invokeSuspend")
    /* renamed from: za.h$h  reason: collision with other inner class name */
    public static final class C0284h extends rd.i implements xd.l<pd.d<? super z<b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f14248a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f14249b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0284h(Context context, pd.d<? super C0284h> dVar) {
            super(1, dVar);
            this.f14249b = context;
        }

        public final pd.d<md.m> create(pd.d<?> dVar) {
            return new C0284h(this.f14249b, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f14248a;
            if (i == 0) {
                b1.w(obj);
                SubstrateApi b10 = ta.f.f11451a.b(this.f14249b);
                String K = v.K("nodle_mainnet_public_url");
                p002if.z runtimeVersionRequestBody = SubstrateApiKt.getRuntimeVersionRequestBody();
                this.f14248a = 1;
                obj = b10.requestSubstrate(K, runtimeVersionRequestBody, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object k(Object obj) {
            return ((C0284h) create((pd.d) obj)).invokeSuspend(md.m.f8555a);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper", f = "SubstrateHelper.kt", l = {279}, m = "getStateMetadata")
    public static final class i extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f14250a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f14251b;

        /* renamed from: c  reason: collision with root package name */
        public int f14252c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(h hVar, pd.d<? super i> dVar) {
            super(dVar);
            this.f14251b = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f14250a = obj;
            this.f14252c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            h hVar = this.f14251b;
            h hVar2 = h.f14215a;
            return hVar.j((Context) null, this);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper$getStateMetadata$result$1", f = "SubstrateHelper.kt", l = {281}, m = "invokeSuspend")
    public static final class j extends rd.i implements xd.l<pd.d<? super z<b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f14253a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f14254b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(Context context, pd.d<? super j> dVar) {
            super(1, dVar);
            this.f14254b = context;
        }

        public final pd.d<md.m> create(pd.d<?> dVar) {
            return new j(this.f14254b, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f14253a;
            if (i == 0) {
                b1.w(obj);
                SubstrateApi b10 = ta.f.f11451a.b(this.f14254b);
                String K = v.K("nodle_mainnet_public_url");
                p002if.z metadataRequestBody = SubstrateApiKt.getMetadataRequestBody();
                this.f14253a = 1;
                obj = b10.requestSubstrate(K, metadataRequestBody, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object k(Object obj) {
            return ((j) create((pd.d) obj)).invokeSuspend(md.m.f8555a);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper", f = "SubstrateHelper.kt", l = {228}, m = "submitExtrinsicForFees")
    public static final class k extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f14255a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f14256b;

        /* renamed from: c  reason: collision with root package name */
        public int f14257c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(h hVar, pd.d<? super k> dVar) {
            super(dVar);
            this.f14256b = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f14255a = obj;
            this.f14257c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f14256b.k((Context) null, (String) null, this);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper$submitExtrinsicForFees$result$1", f = "SubstrateHelper.kt", l = {230}, m = "invokeSuspend")
    public static final class l extends rd.i implements xd.l<pd.d<? super z<b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f14258a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f14259b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f14260c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(Context context, String str, pd.d<? super l> dVar) {
            super(1, dVar);
            this.f14259b = context;
            this.f14260c = str;
        }

        public final pd.d<md.m> create(pd.d<?> dVar) {
            return new l(this.f14259b, this.f14260c, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f14258a;
            if (i == 0) {
                b1.w(obj);
                SubstrateApi b10 = ta.f.f11451a.b(this.f14259b);
                String K = v.K("nodle_mainnet_public_url");
                p002if.z paymentQueryInfoRequestBody = SubstrateApiKt.getPaymentQueryInfoRequestBody(this.f14260c);
                this.f14258a = 1;
                obj = b10.requestSubstrate(K, paymentQueryInfoRequestBody, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object k(Object obj) {
            return ((l) create((pd.d) obj)).invokeSuspend(md.m.f8555a);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper", f = "SubstrateHelper.kt", l = {255}, m = "submitExtrinsicForTransfer")
    public static final class m extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f14261a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h f14262b;

        /* renamed from: c  reason: collision with root package name */
        public int f14263c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(h hVar, pd.d<? super m> dVar) {
            super(dVar);
            this.f14262b = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f14261a = obj;
            this.f14263c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f14262b.l((Context) null, (String) null, this);
        }
    }

    @rd.e(c = "io.nodle.cash.domain.helper.SubstrateHelper$submitExtrinsicForTransfer$result$1", f = "SubstrateHelper.kt", l = {257}, m = "invokeSuspend")
    public static final class n extends rd.i implements xd.l<pd.d<? super z<b0>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f14264a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f14265b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f14266c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(Context context, String str, pd.d<? super n> dVar) {
            super(1, dVar);
            this.f14265b = context;
            this.f14266c = str;
        }

        public final pd.d<md.m> create(pd.d<?> dVar) {
            return new n(this.f14265b, this.f14266c, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f14264a;
            if (i == 0) {
                b1.w(obj);
                SubstrateApi b10 = ta.f.f11451a.b(this.f14265b);
                String K = v.K("nodle_mainnet_public_url");
                p002if.z submitExtrinsicRequestBody = SubstrateApiKt.getSubmitExtrinsicRequestBody(this.f14266c);
                this.f14264a = 1;
                obj = b10.requestSubstrate(K, submitExtrinsicRequestBody, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        public final Object k(Object obj) {
            return ((n) create((pd.d) obj)).invokeSuspend(md.m.f8555a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x010d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x013c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x015e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(android.content.Context r24, java.util.List<java.lang.String> r25, java.lang.String r26, java.math.BigInteger r27, pd.d<? super java.lang.String> r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r28
            boolean r3 = r2 instanceof za.h.a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            za.h$a r3 = (za.h.a) r3
            int r4 = r3.z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.z = r4
            goto L_0x001e
        L_0x0019:
            za.h$a r3 = new za.h$a
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f14227x
            qd.a r4 = qd.a.COROUTINE_SUSPENDED
            int r5 = r3.z
            r6 = 0
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L_0x00be
            if (r5 == r10) goto L_0x00a6
            if (r5 == r9) goto L_0x0085
            if (r5 == r8) goto L_0x0062
            if (r5 != r7) goto L_0x005a
            java.lang.Object r1 = r3.f14225v
            hd.a r1 = (hd.a) r1
            java.lang.Object r4 = r3.f14224u
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            java.lang.Object r5 = r3.f14223t
            fc.a r5 = (fc.a) r5
            java.lang.Object r6 = r3.f14222s
            kc.a r6 = (kc.a) r6
            java.lang.Object r7 = r3.f14221c
            fc.a r7 = (fc.a) r7
            java.lang.Object r8 = r3.f14220b
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            java.lang.Object r3 = r3.f14219a
            java.lang.String r3 = (java.lang.String) r3
            l6.b1.w(r2)
            r17 = r1
            r16 = r4
            r15 = r5
            r14 = r6
            goto L_0x0169
        L_0x005a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0062:
            java.math.BigInteger r1 = r3.f14226w
            java.lang.Object r5 = r3.f14225v
            fc.a r5 = (fc.a) r5
            java.lang.Object r8 = r3.f14224u
            kc.a r8 = (kc.a) r8
            java.lang.Object r10 = r3.f14223t
            fc.a r10 = (fc.a) r10
            java.lang.Object r11 = r3.f14222s
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            java.lang.Object r12 = r3.f14221c
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r3.f14220b
            android.content.Context r13 = (android.content.Context) r13
            java.lang.Object r14 = r3.f14219a
            za.h r14 = (za.h) r14
            l6.b1.w(r2)
            goto L_0x0144
        L_0x0085:
            java.lang.Object r1 = r3.f14225v
            fc.a r1 = (fc.a) r1
            java.lang.Object r5 = r3.f14224u
            kc.a r5 = (kc.a) r5
            java.lang.Object r10 = r3.f14223t
            fc.a r10 = (fc.a) r10
            java.lang.Object r11 = r3.f14222s
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            java.lang.Object r12 = r3.f14221c
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r3.f14220b
            android.content.Context r13 = (android.content.Context) r13
            java.lang.Object r14 = r3.f14219a
            za.h r14 = (za.h) r14
            l6.b1.w(r2)
            goto L_0x0115
        L_0x00a6:
            java.lang.Object r1 = r3.f14223t
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.lang.Object r5 = r3.f14222s
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r3.f14221c
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r3.f14220b
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r12 = r3.f14219a
            za.h r12 = (za.h) r12
            l6.b1.w(r2)
            goto L_0x00e5
        L_0x00be:
            l6.b1.w(r2)
            r3.f14219a = r0
            r3.f14220b = r1
            r2 = r25
            r3.f14221c = r2
            r5 = r26
            r3.f14222s = r5
            r11 = r27
            r3.f14223t = r11
            r3.z = r10
            java.lang.Object r10 = r0.h(r1, r3)
            if (r10 != r4) goto L_0x00da
            return r4
        L_0x00da:
            r12 = r0
            r21 = r11
            r11 = r1
            r1 = r21
            r22 = r10
            r10 = r2
            r2 = r22
        L_0x00e5:
            kc.a r2 = (kc.a) r2
            fc.a r10 = r12.d(r10)
            gd.a r13 = gd.a.f5360c
            byte[] r13 = r10.a()
            r14 = 37
            java.lang.String r13 = gd.a.b(r13, r14)
            r3.f14219a = r12
            r3.f14220b = r11
            r3.f14221c = r5
            r3.f14222s = r1
            r3.f14223t = r10
            r3.f14224u = r2
            r3.f14225v = r10
            r3.z = r9
            java.lang.Object r13 = r12.f(r11, r13, r3)
            if (r13 != r4) goto L_0x010e
            return r4
        L_0x010e:
            r14 = r12
            r12 = r5
            r5 = r2
            r2 = r13
            r13 = r11
            r11 = r1
            r1 = r10
        L_0x0115:
            java.lang.Number r2 = (java.lang.Number) r2
            long r15 = r2.longValue()
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r15)
            java.lang.String r15 = "valueOf(this)"
            e6.e.C(r2, r15)
            r3.f14219a = r14
            r3.f14220b = r13
            r3.f14221c = r12
            r3.f14222s = r11
            r3.f14223t = r10
            r3.f14224u = r5
            r3.f14225v = r1
            r3.f14226w = r2
            r3.z = r8
            java.lang.Object r8 = r14.i(r13, r3)
            if (r8 != r4) goto L_0x013d
            return r4
        L_0x013d:
            r21 = r5
            r5 = r1
            r1 = r2
            r2 = r8
            r8 = r21
        L_0x0144:
            hd.a r2 = (hd.a) r2
            r3.f14219a = r12
            r3.f14220b = r11
            r3.f14221c = r10
            r3.f14222s = r8
            r3.f14223t = r5
            r3.f14224u = r1
            r3.f14225v = r2
            r3.f14226w = r6
            r3.z = r7
            java.lang.Object r3 = r14.c(r13, r3)
            if (r3 != r4) goto L_0x015f
            return r4
        L_0x015f:
            r16 = r1
            r17 = r2
            r2 = r3
            r15 = r5
            r14 = r8
            r7 = r10
            r8 = r11
            r3 = r12
        L_0x0169:
            java.lang.String r2 = (java.lang.String) r2
            byte[] r18 = jc.b.r(r2)
            dc.c$a r1 = new dc.c$a
            dc.b r2 = dc.b.ED25519
            r1.<init>(r2)
            byte[] r2 = r7.a()
            java.lang.String r4 = "addressId"
            e6.e.D(r2, r4)
            rc.c$a r4 = new rc.c$a
            java.lang.String r5 = "Id"
            r4.<init>(r5, r2)
            yc.b r2 = new yc.b
            r13 = r2
            r19 = r1
            r20 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            md.f[] r1 = new md.f[r9]     // Catch:{ Exception -> 0x01bd }
            java.lang.String r4 = "dest"
            rc.c$a r6 = new rc.c$a     // Catch:{ Exception -> 0x01bd }
            gd.a r7 = gd.a.f5360c     // Catch:{ Exception -> 0x01bd }
            byte[] r3 = gd.a.a(r3)     // Catch:{ Exception -> 0x01bd }
            r6.<init>(r5, r3)     // Catch:{ Exception -> 0x01bd }
            md.f r3 = new md.f     // Catch:{ Exception -> 0x01bd }
            r3.<init>(r4, r6)     // Catch:{ Exception -> 0x01bd }
            r4 = 0
            r1[r4] = r3     // Catch:{ Exception -> 0x01bd }
            java.lang.String r3 = "value"
            md.f r4 = new md.f     // Catch:{ Exception -> 0x01bd }
            r4.<init>(r3, r8)     // Catch:{ Exception -> 0x01bd }
            r3 = 1
            r1[r3] = r4     // Catch:{ Exception -> 0x01bd }
            java.util.Map r1 = nd.x.u0(r1)     // Catch:{ Exception -> 0x01bd }
            r2.c(r1)     // Catch:{ Exception -> 0x01bd }
            java.lang.String r1 = yc.b.a(r2)     // Catch:{ Exception -> 0x01bd }
            return r1
        L_0x01bd:
            za.b r1 = new za.b
            java.lang.String r2 = "1008"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: za.h.a(android.content.Context, java.util.List, java.lang.String, java.math.BigInteger, pd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0445 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x049e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final oc.b b(android.content.Context r18, dd.a<?> r19) {
        /*
            r17 = this;
            r1 = r19
            S r0 = r1.f4448c
            boolean r0 = r0 instanceof cd.k
            r2 = 0
            if (r0 == 0) goto L_0x060d
            java.lang.String r0 = "substrate_default_v14.json"
            r3 = 0
            android.content.res.AssetManager r4 = r18.getAssets()     // Catch:{ IOException -> 0x003a }
            java.io.InputStream r0 = r4.open(r0)     // Catch:{ IOException -> 0x003a }
            java.lang.String r4 = "cxt.assets.open(fileName)"
            e6.e.C(r0, r4)     // Catch:{ IOException -> 0x003a }
            int r4 = r0.available()     // Catch:{ IOException -> 0x003a }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x003a }
            r0.read(r4)     // Catch:{ IOException -> 0x003a }
            r0.close()     // Catch:{ IOException -> 0x003a }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x003a }
            java.nio.charset.Charset r5 = fe.a.f5086b     // Catch:{ IOException -> 0x003a }
            r0.<init>(r4, r5)     // Catch:{ IOException -> 0x003a }
            com.google.gson.Gson r4 = new com.google.gson.Gson     // Catch:{ IOException -> 0x003a }
            r4.<init>()     // Catch:{ IOException -> 0x003a }
            java.lang.Class<lc.c> r5 = lc.c.class
            java.lang.Object r0 = r4.fromJson((java.lang.String) r0, r5)     // Catch:{ IOException -> 0x003a }
            lc.c r0 = (lc.c) r0     // Catch:{ IOException -> 0x003a }
            goto L_0x003f
        L_0x003a:
            r0 = move-exception
            r0.printStackTrace()
            r0 = r3
        L_0x003f:
            cd.k r4 = cd.k.f3382u
            java.util.Objects.requireNonNull(r4)
            dd.c r5 = cd.k.f3379c
            de.h[] r6 = cd.k.f3378b
            r6 = r6[r2]
            dd.b r4 = r5.a(r4, r6)
            java.lang.Object r1 = r1.a(r4)
            dd.a r1 = (dd.a) r1
            oc.a r4 = oc.a.f9413b
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r4.k(r5)
            r4 = 4
            r6 = 1
            xc.a r7 = new xc.a
            xc.f[] r4 = new xc.f[r4]
            xc.b r8 = xc.b.f13166a
            r4[r2] = r8
            xc.d r8 = xc.d.f13168a
            r4[r6] = r8
            xc.e r8 = xc.e.f13169a
            r9 = 2
            r4[r9] = r8
            xc.c r8 = xc.c.f13167a
            r10 = 3
            r4[r10] = r8
            java.util.List r4 = a.b.o0(r4)
            r7.<init>(r4)
            java.lang.String r4 = "lookup"
            e6.e.D(r1, r4)
            java.util.Map r4 = nd.x.y0(r5)
            cd.b r5 = cd.b.f3339s
            java.util.Objects.requireNonNull(r5)
            dd.c r8 = cd.b.f3338c
            de.h[] r10 = cd.b.f3337b
            r10 = r10[r2]
            dd.b r5 = r8.a(r5, r10)
            java.lang.Object r1 = r1.a(r5)
            java.util.List r1 = (java.util.List) r1
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r8 = r1.iterator()
        L_0x00a4:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0106
            java.lang.Object r10 = r8.next()
            dd.a r10 = (dd.a) r10
            cd.i r11 = cd.i.f3372t
            dd.b r11 = r11.e()
            java.lang.Object r10 = r10.a(r11)
            dd.a r10 = (dd.a) r10
            cd.j r11 = cd.j.f3377u
            java.util.Objects.requireNonNull(r11)
            dd.c r12 = cd.j.f3374c
            de.h[] r13 = cd.j.f3373b
            r13 = r13[r2]
            dd.b r11 = r12.a(r11, r13)
            java.lang.Object r10 = r10.a(r11)
            r11 = r10
            java.util.List r11 = (java.util.List) r11
            boolean r10 = r11.isEmpty()
            if (r10 == 0) goto L_0x00da
            r10 = r3
            goto L_0x00e5
        L_0x00da:
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 62
            java.lang.String r12 = "."
            java.lang.String r10 = nd.m.b1(r11, r12, r13, r14, r15, r16)
        L_0x00e5:
            java.lang.Object r11 = r5.get(r10)
            if (r11 != 0) goto L_0x00f3
            boolean r12 = r5.containsKey(r10)
            if (r12 != 0) goto L_0x00f3
            r12 = r6
            goto L_0x00f4
        L_0x00f3:
            r12 = r2
        L_0x00f4:
            if (r12 == 0) goto L_0x00fb
            yd.s r11 = new yd.s
            r11.<init>()
        L_0x00fb:
            yd.s r11 = (yd.s) r11
            int r12 = r11.f13620a
            int r12 = r12 + r6
            r11.f13620a = r12
            r5.put(r10, r11)
            goto L_0x00a4
        L_0x0106:
            java.util.Set r8 = r5.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x010e:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0134
            java.lang.Object r10 = r8.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            boolean r11 = r10 instanceof zd.a
            if (r11 != 0) goto L_0x012e
            java.lang.Object r11 = r10.getValue()
            yd.s r11 = (yd.s) r11
            int r11 = r11.f13620a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.setValue(r11)
            goto L_0x010e
        L_0x012e:
            java.lang.String r0 = "kotlin.collections.MutableMap.MutableEntry"
            yd.x.c(r10, r0)
            throw r3
        L_0x0134:
            boolean r8 = r5 instanceof zd.a
            if (r8 != 0) goto L_0x0606
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0145:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0170
            java.lang.Object r10 = r5.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 != r6) goto L_0x0165
            r10 = r6
            goto L_0x0166
        L_0x0165:
            r10 = r2
        L_0x0166:
            if (r10 == 0) goto L_0x0169
            goto L_0x016a
        L_0x0169:
            r11 = r3
        L_0x016a:
            if (r11 == 0) goto L_0x0145
            r8.add(r11)
            goto L_0x0145
        L_0x0170:
            wc.a$b r5 = new wc.a$b
            r5.<init>(r1, r7, r8, r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0179:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x044a
            java.lang.Object r4 = r1.next()
            dd.a r4 = (dd.a) r4
            wc.a r7 = wc.a.f12652a
            java.util.Map<java.lang.String, qc.d> r8 = r5.f12660d
            java.lang.String r10 = r7.a(r4, r5)
            cd.i r11 = cd.i.f3372t
            dd.b r11 = r11.e()
            java.lang.Object r11 = r4.a(r11)
            dd.a r11 = (dd.a) r11
            cd.j r12 = cd.j.f3377u
            java.util.Objects.requireNonNull(r12)
            dd.c r13 = cd.j.f3376t
            de.h[] r14 = cd.j.f3373b
            r14 = r14[r9]
            dd.b r12 = r13.a(r12, r14)
            java.lang.Object r11 = r11.a(r12)
            boolean r12 = r11 instanceof dd.a
            if (r12 == 0) goto L_0x0397
            dd.a r11 = (dd.a) r11
            S r8 = r11.f4448c
            boolean r12 = r8 instanceof cd.r
            if (r12 == 0) goto L_0x01cd
            cd.r r8 = cd.r.f3409s
            dd.b r8 = r8.d()
            java.lang.Object r8 = r11.a(r8)
            java.util.List r8 = (java.util.List) r8
            wc.a$a r8 = r7.b(r5, r8, r6)
            qc.a r7 = r7.d(r10, r8)
            goto L_0x0238
        L_0x01cd:
            boolean r7 = r8 instanceof cd.o
            if (r7 == 0) goto L_0x020b
            rc.d r7 = new rc.d
            cd.o r8 = cd.o.f3400t
            java.util.Objects.requireNonNull(r8)
            dd.c r12 = cd.o.f3398c
            de.h[] r13 = cd.o.f3397b
            r14 = r13[r2]
            dd.b r12 = r12.a(r8, r14)
            java.lang.Object r12 = r11.a(r12)
            md.l r12 = (md.l) r12
            int r12 = r12.f8554a
            java.util.Map<java.lang.String, qc.d> r14 = r5.f12660d
            dd.c r15 = cd.o.f3399s
            r13 = r13[r6]
            dd.b r8 = r15.a(r8, r13)
            java.lang.Object r8 = r11.a(r8)
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            java.lang.String r8 = r8.toString()
            java.lang.String r11 = "def[TypeDefArray.type].toString()"
            e6.e.C(r8, r11)
            qc.d r8 = aa.b.J(r14, r8)
            r7.<init>(r10, r12, r8)
            goto L_0x0238
        L_0x020b:
            boolean r7 = r8 instanceof cd.u
            if (r7 == 0) goto L_0x023b
            rc.i r7 = new rc.i
            java.util.Map<java.lang.String, qc.d> r8 = r5.f12660d
            cd.u r12 = cd.u.f3418s
            java.util.Objects.requireNonNull(r12)
            dd.c r13 = cd.u.f3417c
            de.h[] r14 = cd.u.f3416b
            r14 = r14[r2]
            dd.b r12 = r13.a(r12, r14)
            java.lang.Object r11 = r11.a(r12)
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "def[TypeDefSequence.type].toString()"
            e6.e.C(r11, r12)
            qc.d r8 = aa.b.J(r8, r11)
            r7.<init>(r10, r8)
        L_0x0238:
            r3 = r9
            goto L_0x0406
        L_0x023b:
            boolean r7 = r8 instanceof cd.v
            if (r7 == 0) goto L_0x0321
            cd.v r7 = cd.v.f3421s
            java.util.Objects.requireNonNull(r7)
            dd.c r8 = cd.v.f3420c
            de.h[] r12 = cd.v.f3419b
            r12 = r12[r2]
            dd.b r7 = r8.a(r7, r12)
            java.lang.Object r7 = r11.a(r7)
            java.util.List r7 = (java.util.List) r7
            int r8 = nd.g.S0(r7)
            int r8 = aa.b.P(r8)
            r11 = 16
            if (r8 >= r11) goto L_0x0261
            r8 = r11
        L_0x0261:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x026a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x031b
            java.lang.Object r8 = r7.next()
            dd.a r8 = (dd.a) r8
            cd.w r12 = cd.w.f3426u
            java.util.Objects.requireNonNull(r12)
            dd.c r13 = cd.w.f3425t
            de.h[] r14 = cd.w.f3422b
            r15 = r14[r9]
            dd.b r15 = r13.a(r12, r15)
            java.lang.Object r15 = r8.a(r15)
            md.j r15 = (md.j) r15
            byte r15 = r15.f8550a
            r15 = r15 & 255(0xff, float:3.57E-43)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            dd.c r3 = cd.w.f3424s
            r2 = r14[r6]
            dd.b r2 = r3.a(r12, r2)
            java.lang.Object r2 = r8.a(r2)
            java.util.List r2 = (java.util.List) r2
            r3 = r14[r9]
            dd.b r3 = r13.a(r12, r3)
            java.lang.Object r3 = r8.a(r3)
            md.j r3 = (md.j) r3
            byte r3 = r3.f8550a
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            wc.a r13 = wc.a.f12652a
            r9 = 0
            wc.a$a r2 = r13.b(r5, r2, r9)
            int r9 = r2.a()
            if (r9 == 0) goto L_0x02f8
            if (r9 == r6) goto L_0x02ce
            qc.a r2 = r13.d(r3, r2)
            qc.d r3 = new qc.d
            r3.<init>(r2)
            goto L_0x02ff
        L_0x02ce:
            boolean r9 = r2 instanceof wc.a.C0244a.C0245a
            if (r9 == 0) goto L_0x02e2
            qc.d r9 = new qc.d
            rc.g r13 = new rc.g
            wc.a$a$a r2 = (wc.a.C0244a.C0245a) r2
            java.util.LinkedHashMap<java.lang.String, qc.d> r2 = r2.f12654b
            r13.<init>(r3, r2)
            r9.<init>(r13)
            r3 = r9
            goto L_0x02ff
        L_0x02e2:
            boolean r3 = r2 instanceof wc.a.C0244a.b
            if (r3 == 0) goto L_0x02f2
            wc.a$a$b r2 = (wc.a.C0244a.b) r2
            java.util.List<qc.d> r2 = r2.f12656b
            java.lang.Object r2 = nd.m.X0(r2)
            r3 = r2
            qc.d r3 = (qc.d) r3
            goto L_0x02ff
        L_0x02f2:
            md.e r0 = new md.e
            r0.<init>()
            throw r0
        L_0x02f8:
            qc.d r3 = new qc.d
            tc.n r2 = tc.n.f11562c
            r3.<init>(r2)
        L_0x02ff:
            rc.c$a r2 = new rc.c$a
            dd.c r9 = cd.w.f3423c
            r13 = 0
            r14 = r14[r13]
            dd.b r9 = r9.a(r12, r14)
            java.lang.Object r8 = r8.a(r9)
            java.lang.String r8 = (java.lang.String) r8
            r2.<init>(r8, r3)
            r11.put(r15, r2)
            r2 = 0
            r3 = 0
            r9 = 2
            goto L_0x026a
        L_0x031b:
            rc.c r2 = new rc.c
            r2.<init>((java.lang.String) r10, (java.util.Map<java.lang.Integer, rc.c.a<qc.d>>) r11)
            goto L_0x032a
        L_0x0321:
            boolean r2 = r8 instanceof cd.q
            if (r2 == 0) goto L_0x032c
            vc.b r2 = new vc.b
            r2.<init>(r10)
        L_0x032a:
            r7 = r2
            goto L_0x0391
        L_0x032c:
            boolean r2 = r8 instanceof cd.p
            if (r2 == 0) goto L_0x0394
            r2 = 2
            java.math.BigInteger[] r3 = new java.math.BigInteger[r2]
            cd.p r2 = cd.p.f3404t
            java.util.Objects.requireNonNull(r2)
            dd.c r7 = cd.p.f3402c
            de.h[] r8 = cd.p.f3401b
            r9 = 0
            r12 = r8[r9]
            dd.b r7 = r7.a(r2, r12)
            java.lang.Object r7 = r11.a(r7)
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            r3[r9] = r7
            dd.c r7 = cd.p.f3403s
            r8 = r8[r6]
            dd.b r2 = r7.a(r2, r8)
            java.lang.Object r2 = r11.a(r2)
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            r3[r6] = r2
            java.util.List r2 = a.b.o0(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r7 = nd.g.S0(r2)
            r3.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L_0x036c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x038b
            java.lang.Object r7 = r2.next()
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            java.util.Map<java.lang.String, qc.d> r8 = r5.f12660d
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "it.toString()"
            e6.e.C(r7, r9)
            qc.d r7 = aa.b.J(r8, r7)
            r3.add(r7)
            goto L_0x036c
        L_0x038b:
            rc.h r2 = new rc.h
            r2.<init>(r10, r3)
            goto L_0x032a
        L_0x0391:
            r3 = 2
            goto L_0x0406
        L_0x0394:
            r3 = 2
            goto L_0x0405
        L_0x0397:
            boolean r2 = r11 instanceof cd.t
            if (r2 == 0) goto L_0x03d3
            cd.t r11 = (cd.t) r11
            int[] r2 = wc.b.f12661a
            int r3 = r11.ordinal()
            r2 = r2[r3]
            if (r2 == r6) goto L_0x03c5
            r3 = 2
            if (r2 == r3) goto L_0x03b8
            rc.a r7 = new rc.a
            java.lang.String r2 = r11.getLocalName()
            qc.d r2 = aa.b.J(r8, r2)
            r7.<init>(r10, r2)
            goto L_0x0406
        L_0x03b8:
            rc.a r7 = new rc.a
            qc.d r2 = new qc.d
            vc.c r8 = tc.b.f11532a
            r2.<init>(r8)
            r7.<init>(r10, r2)
            goto L_0x0406
        L_0x03c5:
            r3 = 2
            rc.a r7 = new rc.a
            qc.d r2 = new qc.d
            vc.c r8 = tc.b.f11532a
            r2.<init>(r8)
            r7.<init>(r10, r2)
            goto L_0x0406
        L_0x03d3:
            r3 = 2
            boolean r2 = r11 instanceof java.util.List
            if (r2 == 0) goto L_0x0405
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            int r7 = nd.g.S0(r11)
            r2.<init>(r7)
            java.util.Iterator r7 = r11.iterator()
        L_0x03e7:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x03ff
            java.lang.Object r8 = r7.next()
            java.util.Map<java.lang.String, qc.d> r9 = r5.f12660d
            java.lang.String r8 = java.lang.String.valueOf(r8)
            qc.d r8 = aa.b.J(r9, r8)
            r2.add(r8)
            goto L_0x03e7
        L_0x03ff:
            rc.h r7 = new rc.h
            r7.<init>(r10, r2)
            goto L_0x0406
        L_0x0405:
            r7 = 0
        L_0x0406:
            if (r7 == 0) goto L_0x0445
            java.util.Map<java.lang.String, qc.d> r2 = r5.f12660d
            aa.b.s0(r2, r7)
            cd.i r2 = cd.i.f3372t
            dd.b r2 = r2.d()
            java.lang.Object r2 = r4.a(r2)
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "type[PortableType.id].toString()"
            e6.e.C(r2, r4)
            java.lang.String r4 = r7.f10398a
            boolean r4 = e6.e.r(r2, r4)
            r4 = r4 ^ r6
            if (r4 == 0) goto L_0x0445
            java.util.Map<java.lang.String, qc.d> r4 = r5.f12660d
            java.lang.String r7 = r7.f10398a
            java.lang.String r8 = "$this$alias"
            e6.e.D(r4, r8)
            java.lang.String r8 = "original"
            e6.e.D(r7, r8)
            qc.d r7 = aa.b.J(r4, r7)
            rc.a r8 = new rc.a
            r8.<init>(r2, r7)
            aa.b.s0(r4, r8)
        L_0x0445:
            r9 = r3
            r2 = 0
            r3 = 0
            goto L_0x0179
        L_0x044a:
            java.util.List<dd.a<cd.i>> r1 = r5.f12657a
            java.util.Iterator r1 = r1.iterator()
        L_0x0450:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0472
            java.lang.Object r2 = r1.next()
            dd.a r2 = (dd.a) r2
            wc.a r3 = wc.a.f12652a
            java.lang.String r3 = r3.a(r2, r5)
            xc.f r4 = r5.f12658b
            java.util.Map<java.lang.String, qc.d> r6 = r5.f12660d
            qc.a r2 = r4.a(r2, r3, r6)
            if (r2 == 0) goto L_0x0450
            java.util.Map<java.lang.String, qc.d> r3 = r5.f12660d
            aa.b.s0(r3, r2)
            goto L_0x0450
        L_0x0472:
            java.util.Map<java.lang.String, qc.d> r1 = r5.f12660d
            lc.a r2 = lc.a.f8218a
            e6.e.B(r0)
            mc.b$a r3 = mc.b.f8534c
            mc.b r3 = new mc.b
            java.util.List<mc.a> r4 = mc.b.f8533b
            r3.<init>(r4)
            java.lang.String r4 = "typePreset"
            e6.e.D(r1, r4)
            java.util.Map r1 = nd.x.y0(r1)
            lc.a$a r4 = new lc.a$a
            java.util.Map r0 = r0.getTypes()
            r4.<init>(r0, r3, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.f8219a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x049e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05f5
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<java.lang.String, java.lang.Object> r3 = r4.f8219a
            java.lang.Object r3 = r3.get(r1)
            java.util.Map<java.lang.String, qc.d> r5 = r4.f8221c
            boolean r6 = r3 instanceof java.lang.String
            if (r6 == 0) goto L_0x04e7
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            mc.b r7 = r4.f8220b
            lc.b r8 = new lc.b
            r8.<init>(r4)
            qc.a r7 = r7.a(r1, r6, r8)
            if (r7 == 0) goto L_0x04c8
            goto L_0x05ec
        L_0x04c8:
            boolean r3 = e6.e.r(r3, r1)
            if (r3 == 0) goto L_0x04dc
            java.util.Map<java.lang.String, qc.d> r3 = r4.f8221c
            java.lang.Object r1 = r3.get(r1)
            qc.d r1 = (qc.d) r1
            if (r1 == 0) goto L_0x05eb
            qc.a<?, ?> r7 = r1.f10406b
            goto L_0x05ec
        L_0x04dc:
            rc.a r7 = new rc.a
            qc.d r3 = aa.b.J(r5, r6)
            r7.<init>(r1, r3)
            goto L_0x05ec
        L_0x04e7:
            boolean r5 = r3 instanceof java.util.Map
            if (r5 == 0) goto L_0x05eb
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>"
            java.util.Objects.requireNonNull(r3, r5)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r5 = "type"
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r6 = "struct"
            boolean r6 = e6.e.r(r5, r6)
            java.lang.String r7 = "type_mapping"
            if (r6 == 0) goto L_0x0518
            java.lang.Object r3 = r3.get(r7)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<kotlin.String>>"
            java.util.Objects.requireNonNull(r3, r5)
            java.util.List r3 = (java.util.List) r3
            java.util.LinkedHashMap r3 = r2.a(r4, r3)
            rc.g r7 = new rc.g
            r7.<init>(r1, r3)
            goto L_0x05ec
        L_0x0518:
            java.lang.String r6 = "enum"
            boolean r6 = e6.e.r(r5, r6)
            java.lang.String r8 = "value_list"
            if (r6 == 0) goto L_0x057f
            java.lang.Object r5 = r3.get(r8)
            boolean r6 = r5 instanceof java.util.List
            if (r6 != 0) goto L_0x052b
            r5 = 0
        L_0x052b:
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r3 = r3.get(r7)
            boolean r6 = r3 instanceof java.util.List
            if (r6 != 0) goto L_0x0536
            r3 = 0
        L_0x0536:
            java.util.List r3 = (java.util.List) r3
            if (r5 == 0) goto L_0x0541
            rc.b r7 = new rc.b
            r7.<init>(r1, r5)
            goto L_0x05ec
        L_0x0541:
            if (r3 == 0) goto L_0x05eb
            java.util.LinkedHashMap r3 = r2.a(r4, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r3.size()
            r5.<init>(r6)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0558:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0579
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            qc.d r6 = (qc.d) r6
            rc.c$a r8 = new rc.c$a
            r8.<init>(r7, r6)
            r5.add(r8)
            goto L_0x0558
        L_0x0579:
            rc.c r7 = new rc.c
            r7.<init>((java.lang.String) r1, (java.util.List<rc.c.a<qc.d>>) r5)
            goto L_0x05ec
        L_0x057f:
            java.lang.String r6 = "set"
            boolean r5 = e6.e.r(r5, r6)
            if (r5 == 0) goto L_0x05eb
            java.lang.String r5 = "value_type"
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            java.util.Objects.requireNonNull(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.get(r8)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Double>"
            java.util.Objects.requireNonNull(r3, r6)
            java.util.Map r3 = (java.util.Map) r3
            qc.d r5 = lc.a.b(r2, r4, r5)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            int r7 = r3.size()
            int r7 = aa.b.P(r7)
            r6.<init>(r7)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x05b8:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x05e0
            java.lang.Object r7 = r3.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            double r9 = r7.doubleValue()
            java.math.BigInteger r7 = new java.math.BigInteger
            int r9 = (int) r9
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r7.<init>(r9)
            r6.put(r8, r7)
            goto L_0x05b8
        L_0x05e0:
            rc.f r7 = new rc.f
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r6)
            r7.<init>(r1, r5, r3)
            goto L_0x05ec
        L_0x05eb:
            r7 = 0
        L_0x05ec:
            if (r7 == 0) goto L_0x049e
            java.util.Map<java.lang.String, qc.d> r1 = r4.f8221c
            aa.b.s0(r1, r7)
            goto L_0x049e
        L_0x05f5:
            java.util.Map<java.lang.String, qc.d> r0 = r4.f8221c
            oc.b r1 = new oc.b
            mc.b$a r2 = mc.b.f8534c
            mc.b r2 = new mc.b
            java.util.List<mc.a> r3 = mc.b.f8533b
            r2.<init>(r3)
            r1.<init>(r0, r2)
            return r1
        L_0x0606:
            java.lang.String r0 = "kotlin.collections.MutableMap"
            yd.x.c(r5, r0)
            r1 = 0
            throw r1
        L_0x060d:
            ri.a$a r0 = ri.a.f10801a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Unsupported runtime metadata schema."
            r0.b(r2, r1)
            za.b r0 = new za.b
            java.lang.String r1 = "Cannot construct TypeRegistry - Unsupported runtime metadata schema."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: za.h.b(android.content.Context, dd.a):oc.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[SYNTHETIC, Splitter:B:17:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(android.content.Context r6, pd.d<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof za.h.b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            za.h$b r0 = (za.h.b) r0
            int r1 = r0.f14231c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14231c = r1
            goto L_0x0018
        L_0x0013:
            za.h$b r0 = new za.h$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f14229a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f14231c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            l6.b1.w(r7)
            goto L_0x0043
        L_0x0028:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0030:
            l6.b1.w(r7)
            ta.f r7 = ta.f.f11451a
            za.h$c r2 = new za.h$c
            r2.<init>(r6, r3)
            r0.f14231c = r4
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            ta.e r7 = (ta.e) r7
            boolean r6 = r7 instanceof ta.h
            java.lang.String r0 = "1002"
            if (r6 == 0) goto L_0x006e
            ta.h r7 = (ta.h) r7     // Catch:{ Exception -> 0x0068 }
            T r6 = r7.f11461b     // Catch:{ Exception -> 0x0068 }
            if.b0 r6 = (p002if.b0) r6     // Catch:{ Exception -> 0x0068 }
            if (r6 == 0) goto L_0x0057
            java.lang.String r3 = r6.f()     // Catch:{ Exception -> 0x0068 }
        L_0x0057:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0068 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r7 = "result"
            java.lang.String r6 = r6.getString(r7)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r7 = "JSONObject(resultStr).getString(\"result\")"
            e6.e.C(r6, r7)     // Catch:{ Exception -> 0x0068 }
            return r6
        L_0x0068:
            za.b r6 = new za.b
            r6.<init>(r0)
            throw r6
        L_0x006e:
            boolean r6 = r7 instanceof ta.b
            r1 = 0
            if (r6 != 0) goto L_0x0094
            boolean r6 = r7 instanceof ta.a
            if (r6 == 0) goto L_0x008e
            ri.a$a r6 = ri.a.f10801a
            ta.a r7 = (ta.a) r7
            java.lang.String r7 = r7.f11446b
            java.lang.String r2 = "Error in substrate genesisHash: "
            java.lang.String r7 = a8.a.c(r2, r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.b(r7, r1)
            za.b r6 = new za.b
            r6.<init>(r0)
            throw r6
        L_0x008e:
            md.e r6 = new md.e
            r6.<init>()
            throw r6
        L_0x0094:
            ri.a$a r6 = ri.a.f10801a
            ta.b r7 = (ta.b) r7
            java.lang.String r7 = r7.f11449c
            java.lang.String r2 = "Failure in substrate genesisHash: "
            java.lang.String r7 = a8.a.c(r2, r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.b(r7, r1)
            za.b r6 = new za.b
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: za.h.c(android.content.Context, pd.d):java.lang.Object");
    }

    public final fc.a d(List<String> list) {
        e6.e.D(list, "mnemonics");
        String b10 = ub.f.b(list);
        e6.e.D(b10, "mnemonicWords");
        byte[] bArr = c3.k.m0(b10).f5928b;
        e6.e.D(bArr, "entropy");
        pg.a aVar = new pg.a(new mg.j());
        int i10 = aVar.f10057b;
        byte[] bArr2 = new byte[i10];
        String normalize = Normalizer.normalize("mnemonic", Normalizer.Form.NFKD);
        e6.e.C(normalize, "normalize(\"$SEED_PREFIX$…}\", Normalizer.Form.NFKD)");
        byte[] bytes = normalize.getBytes(fe.a.f5086b);
        e6.e.C(bytes, "(this as java.lang.String).getBytes(charset)");
        int i11 = aVar.f10057b;
        int i12 = ((i11 + 64) - 1) / i11;
        int i13 = 4;
        byte[] bArr3 = new byte[4];
        byte[] bArr4 = new byte[(i12 * i11)];
        aVar.b(new qg.f(bArr));
        int i14 = 0;
        int i15 = 1;
        while (true) {
            int i16 = 3;
            if (i15 > i12) {
                break;
            }
            while (true) {
                byte b11 = (byte) (bArr3[i16] + 1);
                bArr3[i16] = b11;
                if (b11 != 0) {
                    break;
                }
                i16--;
            }
            aVar.d(bytes, bytes.length);
            aVar.d(bArr3, i13);
            aVar.a(bArr2);
            System.arraycopy(bArr2, 0, bArr4, i14, i10);
            for (int i17 = 1; i17 < 2048; i17++) {
                aVar.d(bArr2, i10);
                aVar.a(bArr2);
                for (int i18 = 0; i18 != i10; i18++) {
                    int i19 = i14 + i18;
                    bArr4[i19] = (byte) (bArr2[i18] ^ bArr4[i19]);
                }
            }
            i14 += i11;
            i15++;
            i13 = 4;
        }
        byte[] bArr5 = new byte[64];
        System.arraycopy(bArr4, 0, bArr5, 0, 64);
        byte[] H = nd.d.H(bArr5, 0, 64);
        dc.b bVar = dc.b.ED25519;
        byte[] copyOf = Arrays.copyOf(H, 32);
        e6.e.C(copyOf, "copyOf(this, newSize)");
        o oVar = o.f8966a;
        e6.e.D(bVar, "encryptionType");
        int i20 = gc.g.f5357a[bVar.ordinal()];
        if (i20 == 1) {
            return y.c.y(v.f619v, copyOf, oVar);
        }
        if (i20 == 2) {
            return y.c.y(gc.b.f5348b, copyOf, oVar);
        }
        if (i20 == 3) {
            return y.c.y(gc.a.f5347b, copyOf, oVar);
        }
        throw new md.e();
    }

    public final String e(String str) {
        e6.e.D(str, "addr");
        gd.a aVar = gd.a.f5360c;
        return gd.a.b(gd.a.a(str), 37);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[SYNTHETIC, Splitter:B:17:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(android.content.Context r6, java.lang.String r7, pd.d<? super java.lang.Long> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof za.h.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            za.h$d r0 = (za.h.d) r0
            int r1 = r0.f14236c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14236c = r1
            goto L_0x0018
        L_0x0013:
            za.h$d r0 = new za.h$d
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f14234a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f14236c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            l6.b1.w(r8)
            goto L_0x0043
        L_0x0028:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0030:
            l6.b1.w(r8)
            ta.f r8 = ta.f.f11451a
            za.h$e r2 = new za.h$e
            r2.<init>(r6, r7, r4)
            r0.f14236c = r3
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L_0x0043
            return r1
        L_0x0043:
            ta.e r8 = (ta.e) r8
            boolean r6 = r8 instanceof ta.h
            java.lang.String r7 = "1007"
            r0 = 0
            if (r6 == 0) goto L_0x008d
            ta.h r8 = (ta.h) r8     // Catch:{ Exception -> 0x0081 }
            T r6 = r8.f11461b     // Catch:{ Exception -> 0x0081 }
            if.b0 r6 = (p002if.b0) r6     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x0058
            java.lang.String r4 = r6.f()     // Catch:{ Exception -> 0x0081 }
        L_0x0058:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0081 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r8 = "result"
            long r1 = r6.getLong(r8)     // Catch:{ Exception -> 0x0081 }
            java.lang.Long r4 = new java.lang.Long     // Catch:{ Exception -> 0x0081 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0081 }
            ri.a$a r6 = ri.a.f10801a     // Catch:{ Exception -> 0x0081 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0081 }
            r8.<init>()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r1 = "getNonce: "
            r8.append(r1)     // Catch:{ Exception -> 0x0081 }
            r8.append(r4)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0081 }
            r6.a(r8, r0)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0095
        L_0x0081:
            r6 = move-exception
            ri.a$a r8 = ri.a.f10801a
            r8.c(r6)
            za.b r6 = new za.b
            r6.<init>(r7)
            throw r6
        L_0x008d:
            boolean r6 = r8 instanceof ta.b
            if (r6 != 0) goto L_0x00af
            boolean r6 = r8 instanceof ta.a
            if (r6 != 0) goto L_0x0096
        L_0x0095:
            return r4
        L_0x0096:
            ri.a$a r6 = ri.a.f10801a
            ta.a r8 = (ta.a) r8
            java.lang.Throwable r1 = r8.f11445a
            java.lang.String r8 = r8.f11446b
            java.lang.String r2 = "Error in substrate nonce: "
            java.lang.String r8 = a8.a.c(r2, r8)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r6.d(r1, r8, r0)
            za.b r6 = new za.b
            r6.<init>(r7)
            throw r6
        L_0x00af:
            ri.a$a r6 = ri.a.f10801a
            r1 = r8
            ta.b r1 = (ta.b) r1
            java.lang.String r1 = r1.f11449c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failure in substrate nonce: errorResponse = {"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = ".errorResponse},\n message = "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r6.b(r8, r0)
            za.b r6 = new za.b
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: za.h.f(android.content.Context, java.lang.String, pd.d):java.lang.Object");
    }

    public final String g(List<String> list, byte b10) {
        e6.e.D(list, "mnemonics");
        gd.a aVar = gd.a.f5360c;
        return gd.a.b(d(list).a(), (short) b10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087 A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e A[Catch:{ Exception -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(android.content.Context r8, pd.d<? super kc.a> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof za.h.f
            if (r0 == 0) goto L_0x0013
            r0 = r9
            za.h$f r0 = (za.h.f) r0
            int r1 = r0.f14244t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14244t = r1
            goto L_0x0018
        L_0x0013:
            za.h$f r0 = new za.h$f
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f14242c
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f14244t
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            android.content.Context r8 = r0.f14241b
            za.h r0 = r0.f14240a
            l6.b1.w(r9)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            l6.b1.w(r9)
            r0.f14240a = r7     // Catch:{ Exception -> 0x00c8 }
            r0.f14241b = r8     // Catch:{ Exception -> 0x00c8 }
            r0.f14244t = r3     // Catch:{ Exception -> 0x00c8 }
            java.lang.Object r9 = r7.j(r8, r0)     // Catch:{ Exception -> 0x00c8 }
            if (r9 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r7
        L_0x0044:
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00c8 }
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00c8 }
            r1.<init>()     // Catch:{ Exception -> 0x00c8 }
            java.lang.Class<id.b> r2 = id.b.class
            java.lang.Object r9 = r1.fromJson((java.lang.String) r9, r2)     // Catch:{ Exception -> 0x00c8 }
            id.b r9 = (id.b) r9     // Catch:{ Exception -> 0x00c8 }
            r1 = 0
            if (r9 == 0) goto L_0x005b
            java.lang.Object r9 = r9.getResult()     // Catch:{ Exception -> 0x00c8 }
            goto L_0x005c
        L_0x005b:
            r9 = r1
        L_0x005c:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00c8 }
            ca.b r2 = new ca.b     // Catch:{ Exception -> 0x00c8 }
            byte[] r9 = jc.b.r(r9)     // Catch:{ Exception -> 0x00c8 }
            r2.<init>(r9)     // Catch:{ Exception -> 0x00c8 }
            zc.g r9 = zc.g.f14423s     // Catch:{ Exception -> 0x00c8 }
            dd.a r4 = r9.a(r2)     // Catch:{ Exception -> 0x00c8 }
            dd.c r5 = zc.g.f14422c     // Catch:{ Exception -> 0x00c8 }
            de.h[] r6 = zc.g.f14421b     // Catch:{ Exception -> 0x00c8 }
            r3 = r6[r3]     // Catch:{ Exception -> 0x00c8 }
            dd.b r9 = r5.a(r9, r3)     // Catch:{ Exception -> 0x00c8 }
            java.lang.Object r9 = r4.a(r9)     // Catch:{ Exception -> 0x00c8 }
            md.j r9 = (md.j) r9     // Catch:{ Exception -> 0x00c8 }
            byte r9 = r9.f8550a     // Catch:{ Exception -> 0x00c8 }
            r9 = r9 & 255(0xff, float:3.57E-43)
            r3 = 14
            if (r9 >= r3) goto L_0x008e
            zc.m r3 = zc.m.f14455t     // Catch:{ Exception -> 0x00c8 }
            dd.a r2 = r3.a(r2)     // Catch:{ Exception -> 0x00c8 }
            goto L_0x0094
        L_0x008e:
            cd.k r3 = cd.k.f3382u     // Catch:{ Exception -> 0x00c8 }
            dd.a r2 = r3.a(r2)     // Catch:{ Exception -> 0x00c8 }
        L_0x0094:
            zc.l r3 = new zc.l     // Catch:{ Exception -> 0x00c8 }
            r3.<init>(r9, r2, r1)     // Catch:{ Exception -> 0x00c8 }
            ri.a$a r9 = ri.a.f10801a     // Catch:{ Exception -> 0x00c8 }
            dd.a<?> r1 = r3.f14451b     // Catch:{ Exception -> 0x00c8 }
            S r1 = r1.f4448c     // Catch:{ Exception -> 0x00c8 }
            boolean r1 = r1 instanceof cd.k     // Catch:{ Exception -> 0x00c8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c8 }
            r2.<init>()     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r4 = "runtimeMetadata v14: "
            r2.append(r4)     // Catch:{ Exception -> 0x00c8 }
            r2.append(r1)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x00c8 }
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00c8 }
            r9.a(r1, r2)     // Catch:{ Exception -> 0x00c8 }
            dd.a<?> r9 = r3.f14451b     // Catch:{ Exception -> 0x00c8 }
            oc.b r8 = r0.b(r8, r9)     // Catch:{ Exception -> 0x00c8 }
            l6.s r9 = ad.c.w(r3, r8)     // Catch:{ Exception -> 0x00c8 }
            kc.a r0 = new kc.a     // Catch:{ Exception -> 0x00c8 }
            r0.<init>(r8, r9)     // Catch:{ Exception -> 0x00c8 }
            return r0
        L_0x00c8:
            r8 = move-exception
            ri.a$a r9 = ri.a.f10801a
            r9.c(r8)
            za.c r9 = new za.c
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: za.h.h(android.content.Context, pd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[SYNTHETIC, Splitter:B:17:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(android.content.Context r6, pd.d<? super hd.a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof za.h.g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            za.h$g r0 = (za.h.g) r0
            int r1 = r0.f14247c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14247c = r1
            goto L_0x0018
        L_0x0013:
            za.h$g r0 = new za.h$g
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f14245a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f14247c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            l6.b1.w(r7)
            goto L_0x0043
        L_0x0028:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0030:
            l6.b1.w(r7)
            ta.f r7 = ta.f.f11451a
            za.h$h r2 = new za.h$h
            r2.<init>(r6, r3)
            r0.f14247c = r4
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            ta.e r7 = (ta.e) r7
            boolean r6 = r7 instanceof ta.h
            java.lang.String r0 = "1003"
            if (r6 == 0) goto L_0x007a
            ta.h r7 = (ta.h) r7     // Catch:{ Exception -> 0x0074 }
            T r6 = r7.f11461b     // Catch:{ Exception -> 0x0074 }
            if.b0 r6 = (p002if.b0) r6     // Catch:{ Exception -> 0x0074 }
            if (r6 == 0) goto L_0x0057
            java.lang.String r3 = r6.f()     // Catch:{ Exception -> 0x0074 }
        L_0x0057:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0074 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r7 = "result"
            org.json.JSONObject r6 = r6.getJSONObject(r7)     // Catch:{ Exception -> 0x0074 }
            hd.a r7 = new hd.a     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "specVersion"
            int r1 = r6.getInt(r1)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r2 = "transactionVersion"
            int r6 = r6.getInt(r2)     // Catch:{ Exception -> 0x0074 }
            r7.<init>(r1, r6)     // Catch:{ Exception -> 0x0074 }
            return r7
        L_0x0074:
            za.b r6 = new za.b
            r6.<init>(r0)
            throw r6
        L_0x007a:
            boolean r6 = r7 instanceof ta.b
            r1 = 0
            if (r6 != 0) goto L_0x00a0
            boolean r6 = r7 instanceof ta.a
            if (r6 == 0) goto L_0x009a
            ri.a$a r6 = ri.a.f10801a
            ta.a r7 = (ta.a) r7
            java.lang.String r7 = r7.f11446b
            java.lang.String r2 = "Error in substrate: "
            java.lang.String r7 = a8.a.c(r2, r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.b(r7, r1)
            za.b r6 = new za.b
            r6.<init>(r0)
            throw r6
        L_0x009a:
            md.e r6 = new md.e
            r6.<init>()
            throw r6
        L_0x00a0:
            ri.a$a r6 = ri.a.f10801a
            ta.b r7 = (ta.b) r7
            java.lang.String r7 = r7.f11449c
            java.lang.String r2 = "Failure in substrate: "
            java.lang.String r7 = a8.a.c(r2, r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.b(r7, r1)
            za.b r6 = new za.b
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: za.h.i(android.content.Context, pd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[SYNTHETIC, Splitter:B:17:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(android.content.Context r6, pd.d<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof za.h.i
            if (r0 == 0) goto L_0x0013
            r0 = r7
            za.h$i r0 = (za.h.i) r0
            int r1 = r0.f14252c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14252c = r1
            goto L_0x0018
        L_0x0013:
            za.h$i r0 = new za.h$i
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f14250a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f14252c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            l6.b1.w(r7)
            goto L_0x0043
        L_0x0028:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0030:
            l6.b1.w(r7)
            ta.f r7 = ta.f.f11451a
            za.h$j r2 = new za.h$j
            r2.<init>(r6, r3)
            r0.f14252c = r4
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            ta.e r7 = (ta.e) r7
            boolean r6 = r7 instanceof ta.h
            java.lang.String r0 = "1011"
            if (r6 == 0) goto L_0x005e
            ta.h r7 = (ta.h) r7     // Catch:{ Exception -> 0x0058 }
            T r6 = r7.f11461b     // Catch:{ Exception -> 0x0058 }
            if.b0 r6 = (p002if.b0) r6     // Catch:{ Exception -> 0x0058 }
            if (r6 == 0) goto L_0x0057
            java.lang.String r3 = r6.f()     // Catch:{ Exception -> 0x0058 }
        L_0x0057:
            return r3
        L_0x0058:
            za.b r6 = new za.b
            r6.<init>(r0)
            throw r6
        L_0x005e:
            boolean r6 = r7 instanceof ta.b
            r1 = 0
            if (r6 != 0) goto L_0x0084
            boolean r6 = r7 instanceof ta.a
            if (r6 == 0) goto L_0x007e
            ri.a$a r6 = ri.a.f10801a
            ta.a r7 = (ta.a) r7
            java.lang.String r7 = r7.f11446b
            java.lang.String r2 = "Error in substrate metadata: "
            java.lang.String r7 = a8.a.c(r2, r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.b(r7, r1)
            za.b r6 = new za.b
            r6.<init>(r0)
            throw r6
        L_0x007e:
            md.e r6 = new md.e
            r6.<init>()
            throw r6
        L_0x0084:
            ri.a$a r6 = ri.a.f10801a
            ta.b r7 = (ta.b) r7
            java.lang.String r7 = r7.f11449c
            java.lang.String r2 = "Failure in substrate metadata: "
            java.lang.String r7 = a8.a.c(r2, r7)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.b(r7, r1)
            za.b r6 = new za.b
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: za.h.j(android.content.Context, pd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050 A[SYNTHETIC, Splitter:B:17:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(android.content.Context r8, java.lang.String r9, pd.d<? super java.math.BigInteger> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "joResult.getString(\"partialFee\")"
            java.lang.String r1 = "partialFee"
            boolean r2 = r10 instanceof za.h.k
            if (r2 == 0) goto L_0x0017
            r2 = r10
            za.h$k r2 = (za.h.k) r2
            int r3 = r2.f14257c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f14257c = r3
            goto L_0x001c
        L_0x0017:
            za.h$k r2 = new za.h$k
            r2.<init>(r7, r10)
        L_0x001c:
            java.lang.Object r10 = r2.f14255a
            qd.a r3 = qd.a.COROUTINE_SUSPENDED
            int r4 = r2.f14257c
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0034
            if (r4 != r6) goto L_0x002c
            l6.b1.w(r10)
            goto L_0x0047
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0034:
            l6.b1.w(r10)
            ta.f r10 = ta.f.f11451a
            za.h$l r4 = new za.h$l
            r4.<init>(r8, r9, r5)
            r2.f14257c = r6
            java.lang.Object r10 = r10.c(r4, r2)
            if (r10 != r3) goto L_0x0047
            return r3
        L_0x0047:
            ta.e r10 = (ta.e) r10
            boolean r8 = r10 instanceof ta.h
            r9 = 0
            java.lang.String r2 = "1001"
            if (r8 == 0) goto L_0x0091
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x008b }
            ta.h r10 = (ta.h) r10     // Catch:{ Exception -> 0x008b }
            T r10 = r10.f11461b     // Catch:{ Exception -> 0x008b }
            if.b0 r10 = (p002if.b0) r10     // Catch:{ Exception -> 0x008b }
            if (r10 == 0) goto L_0x005e
            java.lang.String r5 = r10.f()     // Catch:{ Exception -> 0x008b }
        L_0x005e:
            r8.<init>(r5)     // Catch:{ Exception -> 0x008b }
            java.lang.String r10 = "result"
            org.json.JSONObject r8 = r8.getJSONObject(r10)     // Catch:{ Exception -> 0x008b }
            java.lang.String r10 = r8.getString(r1)     // Catch:{ Exception -> 0x008b }
            e6.e.C(r10, r0)     // Catch:{ Exception -> 0x008b }
            int r10 = r10.length()     // Catch:{ Exception -> 0x008b }
            if (r10 <= 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r6 = r9
        L_0x0076:
            if (r6 == 0) goto L_0x0085
            java.lang.String r8 = r8.getString(r1)     // Catch:{ Exception -> 0x008b }
            e6.e.C(r8, r0)     // Catch:{ Exception -> 0x008b }
            java.math.BigInteger r9 = new java.math.BigInteger     // Catch:{ Exception -> 0x008b }
            r9.<init>(r8)     // Catch:{ Exception -> 0x008b }
            return r9
        L_0x0085:
            za.b r8 = new za.b     // Catch:{ Exception -> 0x008b }
            r8.<init>(r2)     // Catch:{ Exception -> 0x008b }
            throw r8     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            za.b r8 = new za.b
            r8.<init>(r2)
            throw r8
        L_0x0091:
            boolean r8 = r10 instanceof ta.b
            if (r8 != 0) goto L_0x00b6
            boolean r8 = r10 instanceof ta.a
            if (r8 == 0) goto L_0x00b0
            ri.a$a r8 = ri.a.f10801a
            ta.a r10 = (ta.a) r10
            java.lang.String r10 = r10.f11446b
            java.lang.String r0 = "Error in substrate fees: "
            java.lang.String r10 = a8.a.c(r0, r10)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r8.b(r10, r9)
            za.b r8 = new za.b
            r8.<init>(r2)
            throw r8
        L_0x00b0:
            md.e r8 = new md.e
            r8.<init>()
            throw r8
        L_0x00b6:
            ri.a$a r8 = ri.a.f10801a
            ta.b r10 = (ta.b) r10
            java.lang.String r10 = r10.f11449c
            java.lang.String r0 = "Failure in substrate fees: "
            java.lang.String r10 = a8.a.c(r0, r10)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r8.b(r10, r9)
            za.b r8 = new za.b
            r8.<init>(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: za.h.k(android.content.Context, java.lang.String, pd.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b A[SYNTHETIC, Splitter:B:17:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(android.content.Context r6, java.lang.String r7, pd.d<? super java.lang.String> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof za.h.m
            if (r0 == 0) goto L_0x0013
            r0 = r8
            za.h$m r0 = (za.h.m) r0
            int r1 = r0.f14263c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f14263c = r1
            goto L_0x0018
        L_0x0013:
            za.h$m r0 = new za.h$m
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f14261a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f14263c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            l6.b1.w(r8)
            goto L_0x0043
        L_0x0028:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0030:
            l6.b1.w(r8)
            ta.f r8 = ta.f.f11451a
            za.h$n r2 = new za.h$n
            r2.<init>(r6, r7, r3)
            r0.f14263c = r4
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L_0x0043
            return r1
        L_0x0043:
            ta.e r8 = (ta.e) r8
            boolean r6 = r8 instanceof ta.h
            java.lang.String r7 = "1009"
            if (r6 == 0) goto L_0x006e
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0068 }
            ta.h r8 = (ta.h) r8     // Catch:{ Exception -> 0x0068 }
            T r8 = r8.f11461b     // Catch:{ Exception -> 0x0068 }
            if.b0 r8 = (p002if.b0) r8     // Catch:{ Exception -> 0x0068 }
            if (r8 == 0) goto L_0x0059
            java.lang.String r3 = r8.f()     // Catch:{ Exception -> 0x0068 }
        L_0x0059:
            r6.<init>(r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r8 = "result"
            java.lang.String r6 = r6.getString(r8)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r8 = "JSONObject(result.respon…ng()).getString(\"result\")"
            e6.e.C(r6, r8)     // Catch:{ Exception -> 0x0068 }
            return r6
        L_0x0068:
            za.b r6 = new za.b
            r6.<init>(r7)
            throw r6
        L_0x006e:
            boolean r6 = r8 instanceof ta.b
            r0 = 0
            if (r6 != 0) goto L_0x0094
            boolean r6 = r8 instanceof ta.a
            if (r6 == 0) goto L_0x008e
            ri.a$a r6 = ri.a.f10801a
            ta.a r8 = (ta.a) r8
            java.lang.String r8 = r8.f11446b
            java.lang.String r1 = "Error in substrate metadata: "
            java.lang.String r8 = a8.a.c(r1, r8)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r6.b(r8, r0)
            za.b r6 = new za.b
            r6.<init>(r7)
            throw r6
        L_0x008e:
            md.e r6 = new md.e
            r6.<init>()
            throw r6
        L_0x0094:
            ri.a$a r6 = ri.a.f10801a
            ta.b r8 = (ta.b) r8
            java.lang.String r8 = r8.f11449c
            java.lang.String r1 = "Failure in substrate metadata: "
            java.lang.String r8 = a8.a.c(r1, r8)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r6.b(r8, r0)
            za.b r6 = new za.b
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: za.h.l(android.content.Context, java.lang.String, pd.d):java.lang.Object");
    }
}
