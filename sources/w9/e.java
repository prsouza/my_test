package w9;

import di.b;
import ge.g;
import java.nio.charset.Charset;
import java.util.UUID;
import md.m;
import wi.c;
import wi.d;
import xd.p;
import yd.h;
import yi.a;

public final class e extends h implements p<a, byte[], m> {

    /* renamed from: b  reason: collision with root package name */
    public static final e f12616b = new e();

    public e() {
        super(2);
    }

    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        e6.e.D(aVar, "vm");
        e6.e.D((byte[]) obj2, "$noName_1");
        b m10 = a.b.m(aVar);
        d dVar = d.OP_BLE_WRITE;
        yi.b.a(aVar, dVar);
        long l10 = a.b.l(aVar, dVar);
        try {
            byte[] o4 = e6.e.o(aVar);
            Charset charset = fe.a.f5086b;
            UUID fromString = UUID.fromString(new String(o4, charset));
            try {
                UUID fromString2 = UUID.fromString(new String(e6.e.o(aVar), charset));
                byte[] o10 = e6.e.o(aVar);
                if (((long) o10.length) <= l10) {
                    try {
                        g.c(new z9.d(m10, fromString, fromString2, o10, aVar, (pd.d<? super z9.d>) null));
                        return m.f8555a;
                    } catch (IllegalStateException e10) {
                        throw new c(wi.a.BleError, e6.e.a0("wrong ble state: ", e10.getMessage()));
                    }
                } else {
                    throw new c(wi.a.InvalidOperand, "exceeding maximum value for ble write");
                }
            } catch (IllegalArgumentException unused) {
                throw new c(wi.a.InvalidOperand, "string operand does not conform to an UUID");
            }
        } catch (IllegalArgumentException unused2) {
            throw new c(wi.a.InvalidOperand, "string operand does not conform to an UUID");
        }
    }
}
