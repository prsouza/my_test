package g9;

import a.b;
import af.d;
import c3.k;
import e6.e;
import i2.q;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import md.m;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import si.a;
import xe.f;
import xe.h;
import xe.i;

public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5273a;

    public /* synthetic */ c() {
        this.f5273a = LoggerFactory.getLogger("AdministrativeAgent");
    }

    public /* synthetic */ c(Type type) {
        this.f5273a = type;
    }

    public final Object a() {
        Type type = (Type) this.f5273a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder q10 = b.q("Invalid EnumSet type: ");
            q10.append(((Type) this.f5273a).toString());
            throw new q(q10.toString());
        }
        StringBuilder q11 = b.q("Invalid EnumSet type: ");
        q11.append(((Type) this.f5273a).toString());
        throw new q(q11.toString());
    }

    /* JADX INFO: finally extract failed */
    public final Object b(si.c cVar, a aVar, af.a aVar2, d dVar, pd.d dVar2) {
        Throwable th2;
        T t10;
        boolean z;
        a aVar3 = aVar;
        af.a aVar4 = aVar2;
        d dVar3 = dVar;
        if (ad.c.o(aVar3.f11148a, h.AdministrativeRecordPayload)) {
            StringBuilder q10 = b.q("bundle:");
            q10.append(jc.b.e(aVar));
            q10.append(", ");
            q10.append("status=");
            q10.append(aVar4);
            q10.append(", ");
            q10.append("reason=");
            q10.append(dVar3);
            q10.append(" - do not respond to adm record");
            ((Logger) this.f5273a).debug(q10.toString());
            return m.f8555a;
        }
        StringBuilder q11 = b.q("bundle:");
        q11.append(jc.b.e(aVar));
        q11.append(", ");
        q11.append("status=");
        q11.append(aVar4);
        q11.append(", ");
        q11.append("reason=");
        q11.append(dVar3);
        q11.append(" - sending a status record");
        ((Logger) this.f5273a).debug(q11.toString());
        f fVar = aVar3.f11148a;
        long currentTimeMillis = System.currentTimeMillis();
        e.D(fVar, "bundle");
        e.D(aVar4, "assertion");
        e.D(dVar3, "reason");
        af.c cVar2 = new af.c(0, 0, 0, 0, (List) null, 0, (URI) null, 0, 0, 0, 1023);
        int i = aVar4.f349a;
        if (i == 0) {
            cVar2.f353a = currentTimeMillis;
        } else if (i == 1) {
            cVar2.f354b = currentTimeMillis;
        } else if (i == 2) {
            cVar2.f355c = currentTimeMillis;
        } else if (i == 3) {
            cVar2.f356d = currentTimeMillis;
        } else {
            Iterator<T> it = cVar2.f357e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (((af.b) t10).f350a == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            af.b bVar = (af.b) t10;
            if (bVar != null) {
                bVar.f351b = true;
                bVar.f352c = currentTimeMillis;
            } else {
                cVar2.f357e.add(new af.b(i, true, currentTimeMillis));
            }
        }
        cVar2.f358f = dVar3.f365a;
        xe.q qVar = fVar.f13195a;
        cVar2.f359h = qVar.g;
        URI uri = qVar.f13222e;
        e.D(uri, "src");
        cVar2.g = uri;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            p4.c b10 = new p4.b().b(new ui.a(byteArrayOutputStream));
            try {
                b10.G0(2);
                b10.D0(1);
                k.v(b10, cVar2);
                b10.A0();
                ad.c.z(b10, (Throwable) null);
                ad.c.z(byteArrayOutputStream, (Throwable) null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                e.C(byteArray, "ByteArrayOutputStream().…t\n        }.toByteArray()");
                xe.q qVar2 = new xe.q(0, 0, (i) null, (URI) null, (URI) null, (URI) null, 0, 0, 0, 2047);
                e.D(h.AdministrativeRecordPayload, "flags");
                qVar2.f13219b |= 2;
                qVar2.f13222e = ((c.c) cVar).g();
                URI uri2 = aVar3.f11148a.f13195a.f13223f;
                e.D(uri2, "uri");
                qVar2.f13221d = uri2;
                qVar2.g = System.currentTimeMillis();
                qVar2.i = 3600000;
                f I = k.I(qVar2);
                b.u(I, aa.b.i(byteArray), true);
                Object f10 = ((jd.b) cVar).f(I, dVar2);
                if (f10 == qd.a.COROUTINE_SUSPENDED) {
                    return f10;
                }
                return m.f8555a;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                ad.c.z(b10, th2);
                throw th4;
            }
        } catch (Throwable th5) {
            Throwable th6 = th5;
            try {
                throw th6;
            } catch (Throwable th7) {
                Throwable th8 = th7;
                ad.c.z(byteArrayOutputStream, th6);
                throw th8;
            }
        }
    }
}
