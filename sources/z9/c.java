package z9;

import c3.k;
import di.b;
import ge.d0;
import java.nio.ByteBuffer;
import java.util.UUID;
import l6.b1;
import md.m;
import nd.f;
import org.slf4j.Logger;
import pd.d;
import rd.e;
import rd.i;
import xd.p;
import yi.a;

@e(c = "io.nodle.sdk.core.nvm.nasm.OpBleGattKt$BLE_READ$1", f = "OpBleGatt.kt", l = {73}, m = "invokeSuspend")
public final class c extends i implements p<d0, d<? super Long>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14179a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f14180b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ UUID f14181c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ UUID f14182s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f14183t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f14184u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar, UUID uuid, UUID uuid2, ByteBuffer byteBuffer, a aVar, d<? super c> dVar) {
        super(2, dVar);
        this.f14180b = bVar;
        this.f14181c = uuid;
        this.f14182s = uuid2;
        this.f14183t = byteBuffer;
        this.f14184u = aVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new c(this.f14180b, this.f14181c, this.f14182s, this.f14183t, this.f14184u, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        long j10;
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f14179a;
        if (i == 0) {
            b1.w(obj);
            b bVar = this.f14180b;
            UUID uuid = this.f14181c;
            e6.e.C(uuid, "service");
            UUID uuid2 = this.f14182s;
            e6.e.C(uuid2, "characteristic");
            this.f14179a = 1;
            obj = bVar.d(uuid, uuid2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        byte[] bArr = (byte[]) obj;
        if (bArr.length > this.f14183t.capacity()) {
            Logger logger = yi.b.f13676a;
            StringBuilder q10 = a.b.q("BLE_READ: truncated data read=");
            q10.append(bArr.length);
            q10.append(" allocated=");
            q10.append(this.f14183t.capacity());
            logger.debug(q10.toString());
            ByteBuffer byteBuffer = this.f14183t;
            byteBuffer.put(f.P(bArr, ad.c.C0(0, byteBuffer.capacity())));
            j10 = k.m(this.f14184u, (long) this.f14183t.capacity());
        } else {
            this.f14183t.put(bArr);
            j10 = k.m(this.f14184u, (long) bArr.length);
        }
        return new Long(j10);
    }
}
