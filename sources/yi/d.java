package yi;

import j2.a;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import rg.b;

public final class d {

    public static final class a extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f13682b = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            byte[] bArr = (byte[]) obj2;
            e6.e.D(aVar, "vm");
            e6.e.D(bArr, "args");
            c3.k.x(aVar, bArr);
            return md.m.f8555a;
        }
    }

    public static final class a0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final a0 f13683b = new a0();

        public a0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 12);
            return md.m.f8555a;
        }
    }

    public static final class a1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final a1 f13684b = new a1();

        public a1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, c3.k.k(aVar) - ah.v.e(aVar, (byte[]) obj2, aVar, "$this$SUB", aVar));
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class a2 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final a2 f13685b = new a2();

        public a2() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            byte[] bArr = (byte[]) obj2;
            e6.e.D(aVar, "vm");
            e6.e.D(bArr, "args");
            c3.k.x(aVar, bArr);
            return md.m.f8555a;
        }
    }

    public static final class b extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final b f13686b = new b();

        public b() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 5);
            return md.m.f8555a;
        }
    }

    public static final class b0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final b0 f13687b = new b0();

        public b0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, c3.k.k(aVar) == ah.v.e(aVar, (byte[]) obj2, aVar, "$this$EQ", aVar) ? 1 : 0);
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class b1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final b1 f13688b = new b1();

        public b1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            long j10 = e6.e.j(aVar, c3.k.k(aVar));
            e6.e.n(aVar, j10, 1);
            if (j10 <= aVar.f13671d) {
                b.a(aVar, wi.d.OP_JMP);
            }
            aVar.f13671d = j10;
            b.b(aVar, b.f13681f);
            return md.m.f8555a;
        }
    }

    public static final class c implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f13689a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ xd.p f13690b;

        public c(int i, xd.p pVar) {
            this.f13689a = i;
            this.f13690b = pVar;
        }

        public final void a(a aVar) {
            byte[] bArr = aVar.f13674h;
            int i = (int) aVar.f13671d;
            byte[] P = nd.f.P(bArr, ad.c.C0(i, this.f13689a + i));
            if (!(P.length == 0)) {
                Logger logger = b.f13676a;
                StringBuilder q10 = a.b.q("~> with args: ");
                q10.append(nd.f.M(P, a.C0121a.f7014b));
                logger.debug(q10.toString());
            }
            aVar.f13671d += (long) this.f13689a;
            this.f13690b.invoke(aVar, P);
        }
    }

    public static final class c0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final c0 f13691b = new c0();

        public c0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 5);
            return md.m.f8555a;
        }
    }

    public static final class c1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final c1 f13692b = new c1();

        public c1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            c3.k.m(aVar, (long) e6.e.v(aVar, c3.k.k(aVar), 4).getInt());
            b.b(aVar, ((long) 4) * b.f13679d);
            return md.m.f8555a;
        }
    }

    /* renamed from: yi.d$d  reason: collision with other inner class name */
    public static final class C0263d extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final C0263d f13693b = new C0263d();

        public C0263d() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, ah.v.e(aVar, (byte[]) obj2, aVar, "$this$OR", aVar) | c3.k.k(aVar));
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class d0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final d0 f13694b = new d0();

        public d0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 13);
            return md.m.f8555a;
        }
    }

    public static final class d1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final d1 f13695b = new d1();

        public d1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 13);
            return md.m.f8555a;
        }
    }

    public static final class e extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final e f13696b = new e();

        public e() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            byte[] bArr = (byte[]) obj2;
            e6.e.D(aVar, "vm");
            e6.e.D(bArr, "args");
            c3.k.x(aVar, bArr);
            return md.m.f8555a;
        }
    }

    public static final class e0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final e0 f13697b = new e0();

        public e0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            long j10 = 0;
            if (ah.v.e(aVar, (byte[]) obj2, aVar, "$this$ISZERO", aVar) == 0) {
                j10 = 1;
            }
            c3.k.m(aVar, j10);
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class e1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final e1 f13698b = new e1();

        public e1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            long j10 = e6.e.j(aVar, c3.k.k(aVar));
            e6.e.n(aVar, j10, 1);
            if ((1 & c3.k.k(aVar)) != 0) {
                if (j10 <= aVar.f13671d) {
                    b.a(aVar, wi.d.OP_JMP);
                }
                aVar.f13671d = j10;
                b.b(aVar, b.g);
            }
            return md.m.f8555a;
        }
    }

    public static final class f extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final f f13699b = new f();

        public f() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 6);
            return md.m.f8555a;
        }
    }

    public static final class f0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final f0 f13700b = new f0();

        public f0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 6);
            return md.m.f8555a;
        }
    }

    public static final class f1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final f1 f13701b = new f1();

        public f1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            e6.e.w(aVar);
            return md.m.f8555a;
        }
    }

    public static final class g extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final g f13702b = new g();

        public g() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, ah.v.e(aVar, (byte[]) obj2, aVar, "$this$XOR", aVar) ^ c3.k.k(aVar));
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class g0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final g0 f13703b = new g0();

        public g0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 14);
            return md.m.f8555a;
        }
    }

    public static final class g1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final g1 f13704b = new g1();

        public g1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 14);
            return md.m.f8555a;
        }
    }

    public static final class h extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final h f13705b = new h();

        public h() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            byte[] bArr = (byte[]) obj2;
            e6.e.D(aVar, "vm");
            e6.e.D(bArr, "args");
            c3.k.x(aVar, bArr);
            return md.m.f8555a;
        }
    }

    public static final class h0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final h0 f13706b = new h0();

        public h0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            aVar.f13671d = -1;
            return md.m.f8555a;
        }
    }

    public static final class h1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final h1 f13707b = new h1();

        public h1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            ByteBuffer u10 = e6.e.u(aVar, 32);
            byte[] o4 = e6.e.o(aVar);
            u10.put(new tg.e().digest(o4));
            long j10 = b.f13680e;
            Long.signum(j10);
            b.b(aVar, (j10 * ((long) o4.length)) + ((long) 30));
            return md.m.f8555a;
        }
    }

    public static final class i extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final i f13708b = new i();

        public i() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, c3.k.k(aVar) * ah.v.e(aVar, (byte[]) obj2, aVar, "$this$MUL", aVar));
            b.b(aVar, b.f13680e);
            return md.m.f8555a;
        }
    }

    public static final class i0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final i0 f13709b = new i0();

        public i0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 7);
            return md.m.f8555a;
        }
    }

    public static final class i1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final i1 f13710b = new i1();

        public i1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            byte[] bArr = (byte[]) obj2;
            e6.e.D(aVar, "vm");
            e6.e.D(bArr, "args");
            c3.k.x(aVar, bArr);
            return md.m.f8555a;
        }
    }

    public static final class j extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final j f13711b = new j();

        public j() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, ~ah.v.e(aVar, (byte[]) obj2, aVar, "$this$NOT", aVar));
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class j0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final j0 f13712b = new j0();

        public j0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 15);
            return md.m.f8555a;
        }
    }

    public static final class j1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final j1 f13713b = new j1();

        public j1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 15);
            return md.m.f8555a;
        }
    }

    public static final class k extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final k f13714b = new k();

        public k() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            c3.k.k(aVar);
            return md.m.f8555a;
        }
    }

    public static final class k0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final k0 f13715b = new k0();

        public k0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.y(aVar, ah.v.e(aVar, (byte[]) obj2, aVar, "$this$M_STORE8", aVar), 1).put((byte) ((int) (c3.k.k(aVar) & 255)));
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class k1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final k1 f13716b = new k1();

        public k1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            ByteBuffer u10 = e6.e.u(aVar, 64);
            byte[] p10 = e6.e.p(aVar, 32);
            byte[] o4 = e6.e.o(aVar);
            b.a aVar2 = new b.a();
            qg.d dVar = new qg.d(p10);
            aVar2.reset();
            aVar2.write(o4, 0, o4.length);
            u10.put(aVar2.a(dVar));
            long j10 = b.f13680e;
            Long.signum(j10);
            b.b(aVar, (j10 * ((long) o4.length)) + ((long) 200));
            return md.m.f8555a;
        }
    }

    public static final class l extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final l f13717b = new l();

        public l() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 7);
            return md.m.f8555a;
        }
    }

    public static final class l0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final l0 f13718b = new l0();

        public l0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 8);
            return md.m.f8555a;
        }
    }

    public static final class l1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final l1 f13719b = new l1();

        public l1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            byte[] bArr = (byte[]) obj2;
            e6.e.D(aVar, "vm");
            e6.e.D(bArr, "args");
            c3.k.x(aVar, bArr);
            return md.m.f8555a;
        }
    }

    public static final class m extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final m f13720b = new m();

        public m() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, (c3.k.k(aVar) >> ((int) (((long) 64) - (ah.v.e(aVar, (byte[]) obj2, aVar, "$this$BYTE", aVar) * ((long) 8))))) & 255);
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class m0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final m0 f13721b = new m0();

        public m0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 16);
            return md.m.f8555a;
        }
    }

    public static final class m1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final m1 f13722b = new m1();

        public m1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 16);
            return md.m.f8555a;
        }
    }

    public static final class n extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final n f13723b = new n();

        public n() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 1);
            return md.m.f8555a;
        }
    }

    public static final class n0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final n0 f13724b = new n0();

        public n0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.y(aVar, ah.v.e(aVar, (byte[]) obj2, aVar, "$this$M_STORE16", aVar), 2).putShort((short) ((int) (c3.k.k(aVar) & 65535)));
            b.b(aVar, ((long) 2) * b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class n1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final n1 f13725b = new n1();

        public n1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            byte[] p10 = e6.e.p(aVar, 64);
            byte[] p11 = e6.e.p(aVar, 32);
            byte[] o4 = e6.e.o(aVar);
            b.a aVar2 = new b.a();
            qg.e eVar = new qg.e(p11);
            aVar2.reset();
            aVar2.write(o4, 0, o4.length);
            c3.k.m(aVar, aVar2.c(eVar, p10) ? 1 : 0);
            long j10 = b.f13680e;
            Long.signum(j10);
            b.b(aVar, (j10 * ((long) o4.length)) + ((long) 200));
            return md.m.f8555a;
        }
    }

    public static final class o extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final o f13726b = new o();

        public o() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 8);
            return md.m.f8555a;
        }
    }

    public static final class o0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final o0 f13727b = new o0();

        public o0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 9);
            return md.m.f8555a;
        }
    }

    public static final class o1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final o1 f13728b = new o1();

        public o1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            String str;
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            Logger logger = b.f13676a;
            StringBuilder q10 = a.b.q("~> NOP: ");
            if (aVar.f13672e.size() > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(String.valueOf(aVar.f13672e.peek().longValue()));
                sb2.append("(");
                Long peek = aVar.f13672e.peek();
                e6.e.C(peek, "stack.peek()");
                sb2.append(j2.a.b(peek.longValue()));
                sb2.append(")");
                str = sb2.toString();
            } else {
                str = "-";
            }
            q10.append(str);
            logger.debug(q10.toString());
            b.b(aVar, 0);
            return md.m.f8555a;
        }
    }

    public static final class p extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final p f13729b = new p();

        public p() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, c3.k.k(aVar) << ((int) ah.v.e(aVar, (byte[]) obj2, aVar, "$this$SHL", aVar)));
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class p0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final p0 f13730b = new p0();

        public p0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            long e10 = ah.v.e(aVar, (byte[]) obj2, aVar, "$this$DIV", aVar);
            if (e10 != 0) {
                c3.k.m(aVar, c3.k.k(aVar) / e10);
                b.b(aVar, b.f13680e);
                return md.m.f8555a;
            }
            throw new wi.c(wi.a.ArithmeticException, "division by zero");
        }
    }

    public static final class p1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final p1 f13731b = new p1();

        public p1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 1);
            return md.m.f8555a;
        }
    }

    public static final class q extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final q f13732b = new q();

        public q() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 2);
            return md.m.f8555a;
        }
    }

    public static final class q0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final q0 f13733b = new q0();

        public q0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.y(aVar, ah.v.e(aVar, (byte[]) obj2, aVar, "$this$M_STORE32", aVar), 4).putInt((int) (c3.k.k(aVar) & 4294967295L));
            b.b(aVar, ((long) 4) * b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class q1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final q1 f13734b = new q1();

        public q1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            c3.k.m(aVar, System.currentTimeMillis());
            return md.m.f8555a;
        }
    }

    public static final class r extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final r f13735b = new r();

        public r() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 9);
            return md.m.f8555a;
        }
    }

    public static final class r0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final r0 f13736b = new r0();

        public r0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 10);
            return md.m.f8555a;
        }
    }

    public static final class r1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final r1 f13737b = new r1();

        public r1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            byte[] bArr = (byte[]) obj2;
            e6.e.D(aVar, "vm");
            e6.e.D(bArr, "args");
            c3.k.x(aVar, bArr);
            return md.m.f8555a;
        }
    }

    public static final class s extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final s f13738b = new s();

        public s() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, c3.k.k(aVar) >> ((int) ah.v.e(aVar, (byte[]) obj2, aVar, "$this$SHR", aVar)));
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class s0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final s0 f13739b = new s0();

        public s0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            OutputStream outputStream = aVar.i;
            if (outputStream != null) {
                outputStream.write(((int) c3.k.k(aVar)) & 255);
            }
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class s1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final s1 f13740b = new s1();

        public s1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 2);
            return md.m.f8555a;
        }
    }

    public static final class t extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final t f13741b = new t();

        public t() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, c3.k.k(aVar) + ah.v.e(aVar, (byte[]) obj2, aVar, "$this$ADD", aVar));
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class t0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final t0 f13742b = new t0();

        public t0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            e6.e.w(aVar);
            return md.m.f8555a;
        }
    }

    public static final class t1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final t1 f13743b = new t1();

        public t1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, c3.k.k(aVar) % ah.v.e(aVar, (byte[]) obj2, aVar, "$this$MOD", aVar));
            b.b(aVar, b.f13680e);
            return md.m.f8555a;
        }
    }

    public static final class u extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final u f13744b = new u();

        public u() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 10);
            return md.m.f8555a;
        }
    }

    public static final class u0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final u0 f13745b = new u0();

        public u0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 11);
            return md.m.f8555a;
        }
    }

    public static final class u1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final u1 f13746b = new u1();

        public u1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            byte[] bArr = (byte[]) obj2;
            e6.e.D(aVar, "vm");
            e6.e.D(bArr, "args");
            c3.k.x(aVar, bArr);
            return md.m.f8555a;
        }
    }

    public static final class v extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final v f13747b = new v();

        public v() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, c3.k.k(aVar) < ah.v.e(aVar, (byte[]) obj2, aVar, "$this$LT", aVar) ? 1 : 0);
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class v0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final v0 f13748b = new v0();

        public v0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            byte[] o4 = e6.e.o(aVar);
            OutputStream outputStream = aVar.i;
            if (outputStream != null) {
                outputStream.write(o4);
            }
            b.b(aVar, b.f13679d * ((long) Math.ceil(((double) o4.length) / ((double) 8))));
            return md.m.f8555a;
        }
    }

    public static final class v1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final v1 f13749b = new v1();

        public v1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 3);
            return md.m.f8555a;
        }
    }

    public static final class w extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final w f13750b = new w();

        public w() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 3);
            return md.m.f8555a;
        }
    }

    public static final class w0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final w0 f13751b = new w0();

        public w0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            c3.k.m(aVar, (long) e6.e.v(aVar, c3.k.k(aVar), 1).get());
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class w1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final w1 f13752b = new w1();

        public w1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            long e10 = ah.v.e(aVar, (byte[]) obj2, aVar, "$this$EXP", aVar);
            c3.k.m(aVar, (long) Math.pow((double) c3.k.k(aVar), (double) e10));
            b.b(aVar, b.f13680e * e10);
            return md.m.f8555a;
        }
    }

    public static final class x extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final x f13753b = new x();

        public x() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 11);
            return md.m.f8555a;
        }
    }

    public static final class x0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final x0 f13754b = new x0();

        public x0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 12);
            return md.m.f8555a;
        }
    }

    public static final class x1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final x1 f13755b = new x1();

        public x1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            byte[] bArr = (byte[]) obj2;
            e6.e.D(aVar, "vm");
            e6.e.D(bArr, "args");
            c3.k.x(aVar, bArr);
            return md.m.f8555a;
        }
    }

    public static final class y extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final y f13756b = new y();

        public y() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, c3.k.k(aVar) > ah.v.e(aVar, (byte[]) obj2, aVar, "$this$GT", aVar) ? 1 : 0);
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class y0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final y0 f13757b = new y0();

        public y0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            c3.k.m(aVar, aVar.f13671d);
            return md.m.f8555a;
        }
    }

    public static final class y1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final y1 f13758b = new y1();

        public y1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.y(aVar, (byte[]) obj2, aVar, 4);
            return md.m.f8555a;
        }
    }

    public static final class z extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final z f13759b = new z();

        public z() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            aa.b.j(aVar, (byte[]) obj2, aVar, 4);
            return md.m.f8555a;
        }
    }

    public static final class z0 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final z0 f13760b = new z0();

        public z0() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            e6.e.D(aVar, "vm");
            e6.e.D((byte[]) obj2, "<anonymous parameter 1>");
            c3.k.m(aVar, (long) e6.e.v(aVar, c3.k.k(aVar), 2).getShort());
            b.b(aVar, ((long) 2) * b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final class z1 extends yd.h implements xd.p<a, byte[], md.m> {

        /* renamed from: b  reason: collision with root package name */
        public static final z1 f13761b = new z1();

        public z1() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) obj;
            c3.k.m(aVar, ah.v.e(aVar, (byte[]) obj2, aVar, "$this$AND", aVar) & c3.k.k(aVar));
            b.b(aVar, b.f13679d);
            return md.m.f8555a;
        }
    }

    public static final Map<Integer, c> a() {
        HashMap hashMap = new HashMap();
        b(hashMap, 0, c(0, h0.f13706b));
        b(hashMap, 254, c(0, o1.f13728b));
        b(hashMap, 1, c(0, t.f13741b));
        b(hashMap, 2, c(0, a1.f13684b));
        b(hashMap, 3, c(0, i.f13708b));
        b(hashMap, 4, c(0, p0.f13730b));
        b(hashMap, 5, c(0, t1.f13743b));
        b(hashMap, 6, c(0, w1.f13752b));
        b(hashMap, 16, c(0, z1.f13761b));
        b(hashMap, 17, c(0, C0263d.f13693b));
        b(hashMap, 18, c(0, g.f13702b));
        b(hashMap, 19, c(0, j.f13711b));
        b(hashMap, 20, c(0, m.f13720b));
        b(hashMap, 21, c(0, p.f13729b));
        b(hashMap, 22, c(0, s.f13738b));
        b(hashMap, 23, c(0, v.f13747b));
        b(hashMap, 24, c(0, y.f13756b));
        b(hashMap, 25, c(0, b0.f13687b));
        b(hashMap, 26, c(0, e0.f13697b));
        b(hashMap, 32, c(0, k0.f13715b));
        b(hashMap, 33, c(0, n0.f13724b));
        b(hashMap, 34, c(0, q0.f13733b));
        b(hashMap, 35, c(0, t0.f13742b));
        b(hashMap, 36, c(0, w0.f13751b));
        b(hashMap, 37, c(0, z0.f13760b));
        b(hashMap, 38, c(0, c1.f13692b));
        b(hashMap, 39, c(0, f1.f13701b));
        b(hashMap, 55, c(0, i1.f13710b));
        b(hashMap, 56, c(1, l1.f13719b));
        b(hashMap, 57, c(2, r1.f13737b));
        b(hashMap, 58, c(3, u1.f13746b));
        b(hashMap, 59, c(4, x1.f13755b));
        b(hashMap, 60, c(5, a2.f13685b));
        b(hashMap, 61, c(6, a.f13682b));
        b(hashMap, 62, c(7, e.f13696b));
        b(hashMap, 63, c(8, h.f13705b));
        b(hashMap, 54, c(0, k.f13714b));
        b(hashMap, 64, c(0, n.f13723b));
        b(hashMap, 65, c(0, q.f13732b));
        b(hashMap, 66, c(0, w.f13750b));
        b(hashMap, 67, c(0, z.f13759b));
        b(hashMap, 68, c(0, c0.f13691b));
        b(hashMap, 69, c(0, f0.f13700b));
        b(hashMap, 70, c(0, i0.f13709b));
        b(hashMap, 71, c(0, l0.f13718b));
        b(hashMap, 72, c(0, o0.f13727b));
        b(hashMap, 73, c(0, r0.f13736b));
        b(hashMap, 74, c(0, u0.f13745b));
        b(hashMap, 75, c(0, x0.f13754b));
        b(hashMap, 76, c(0, d1.f13695b));
        b(hashMap, 77, c(0, g1.f13704b));
        b(hashMap, 78, c(0, j1.f13713b));
        b(hashMap, 79, c(0, m1.f13722b));
        b(hashMap, 80, c(0, p1.f13731b));
        b(hashMap, 81, c(0, s1.f13740b));
        b(hashMap, 82, c(0, v1.f13749b));
        b(hashMap, 83, c(0, y1.f13758b));
        b(hashMap, 84, c(0, b.f13686b));
        b(hashMap, 85, c(0, f.f13699b));
        b(hashMap, 86, c(0, l.f13717b));
        b(hashMap, 87, c(0, o.f13726b));
        b(hashMap, 88, c(0, r.f13735b));
        b(hashMap, 89, c(0, u.f13744b));
        b(hashMap, 90, c(0, x.f13753b));
        b(hashMap, 91, c(0, a0.f13683b));
        b(hashMap, 92, c(0, d0.f13694b));
        b(hashMap, 93, c(0, g0.f13703b));
        b(hashMap, 94, c(0, j0.f13712b));
        b(hashMap, 95, c(0, m0.f13721b));
        b(hashMap, 96, c(0, s0.f13739b));
        b(hashMap, 97, c(0, v0.f13748b));
        b(hashMap, 106, c(0, y0.f13757b));
        b(hashMap, 27, c(0, b1.f13688b));
        b(hashMap, 28, c(0, e1.f13698b));
        b(hashMap, 112, c(0, h1.f13707b));
        b(hashMap, 113, c(0, k1.f13716b));
        b(hashMap, 114, c(0, n1.f13725b));
        b(hashMap, 107, c(0, q1.f13734b));
        return hashMap;
    }

    public static final <T, U> Map<T, U> b(Map<T, U> map, T t10, U u10) {
        e6.e.D(t10, "e");
        e6.e.D(u10, "f");
        map.put(t10, u10);
        return map;
    }

    public static final c c(int i10, xd.p<? super a, ? super byte[], md.m> pVar) {
        return new c(i10, pVar);
    }
}
