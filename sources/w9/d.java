package w9;

import di.b;
import e6.e;
import ge.g;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;
import md.m;
import xd.p;
import yd.h;
import yi.a;
import z9.c;

public final class d extends h implements p<a, byte[], m> {

    /* renamed from: b  reason: collision with root package name */
    public static final d f12615b = new d();

    public d() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        e.D(aVar, "vm");
        e.D((byte[]) obj2, "$noName_1");
        b m10 = a.b.m(aVar);
        wi.d dVar = wi.d.OP_BLE_READ;
        yi.b.a(aVar, dVar);
        long l10 = a.b.l(aVar, dVar);
        try {
            byte[] o4 = e.o(aVar);
            Charset charset = fe.a.f5086b;
            UUID fromString = UUID.fromString(new String(o4, charset));
            try {
                UUID fromString2 = UUID.fromString(new String(e.o(aVar), charset));
                ByteBuffer x10 = e.x(aVar);
                if (((long) x10.capacity()) <= l10) {
                    try {
                        g.c(new c(m10, fromString, fromString2, x10, aVar, (pd.d<? super c>) null));
                        return m.f8555a;
                    } catch (IllegalStateException e10) {
                        throw new wi.c(wi.a.BleError, e.a0("wrong ble state: ", e10.getMessage()));
                    }
                } else {
                    throw new wi.c(wi.a.InvalidOperand, "exceeding maximum value for ble read");
                }
            } catch (IllegalArgumentException unused) {
                throw new wi.c(wi.a.InvalidOperand, "string operand does not conform to an UUID");
            }
        } catch (IllegalArgumentException unused2) {
            throw new wi.c(wi.a.InvalidOperand, "string operand does not conform to an UUID");
        }
    }
}
