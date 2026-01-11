package h9;

import c.c;
import e6.e;
import io.nodle.sdk.NodleContext;
import io.nodle.sdk.core.SdkFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import je.h;
import nd.m;
import xb.b;
import yd.d;
import yd.v;
import ze.f;

public final class a implements SdkFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5900a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f5901b = ((d) v.a(a.class)).a();

    public final oi.a a(NodleContext nodleContext, String str, f fVar, h<b> hVar, String... strArr) {
        boolean z;
        NodleContext nodleContext2 = nodleContext;
        f fVar2 = fVar;
        String[] strArr2 = strArr;
        t9.b bVar = new t9.b(nodleContext2, fVar2);
        c cVar = new c(nodleContext2, fVar2, bVar);
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        e.D(strArr3, "tags");
        ArrayList arrayList = new ArrayList(strArr3.length);
        int length = strArr3.length;
        int i = 0;
        while (i < length) {
            String str2 = strArr3[i];
            i++;
            String lowerCase = str2.toLowerCase();
            e.C(lowerCase, "this as java.lang.String).toLowerCase()");
            arrayList.add(lowerCase);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str3 = (String) next;
            e.D(str3, "<this>");
            StringBuilder sb2 = new StringBuilder();
            int length2 = str3.length();
            int i10 = 0;
            while (true) {
                z = true;
                if (i10 >= length2) {
                    break;
                }
                int i11 = i10 + 1;
                char charAt = str3.charAt(i10);
                if (!('a' <= charAt && charAt < '{')) {
                    if (!(('0' <= charAt && charAt < ':') || charAt == '.' || charAt == '+' || charAt == '-')) {
                        z = false;
                    }
                }
                if (z) {
                    sb2.append(charAt);
                }
                i10 = i11;
            }
            String sb3 = sb2.toString();
            e.C(sb3, "filterTo(StringBuilder(), predicate).toString()");
            if (sb3.length() != str3.length()) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        List l12 = m.l1(arrayList2);
        ArrayList arrayList3 = (ArrayList) l12;
        arrayList3.add(e.a0("v:", ad.c.f(nodleContext.getGitSHA())));
        arrayList3.add(e.a0("p:", ad.c.f(nodleContext.getPhoneModel())));
        arrayList3.add(e.a0("o:", ad.c.f(nodleContext.getOsVersion())));
        arrayList3.add(e.a0("r:", ad.c.f(nodleContext.getOsRelease())));
        arrayList3.add(e.a0("l:", ad.c.f(nodleContext.getOsLevel())));
        return new oi.a(nodleContext, str, fVar, bVar, cVar, m.j1(l12), new ah.v(), new ba.a(), new aa.b(), hVar);
    }

    public final oi.a inMemorySdkCore(NodleContext nodleContext, String str, h<b> hVar, String... strArr) {
        e.D(nodleContext, "context");
        e.D(str, "devKey");
        e.D(hVar, "eventChannel");
        e.D(strArr, "tags");
        return a(nodleContext, str, new hf.f(((ac.a) nodleContext).f289a, true), hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final oi.a persistentSdkCore(NodleContext nodleContext, String str, h<b> hVar, String... strArr) {
        e.D(nodleContext, "context");
        e.D(str, "devKey");
        e.D(hVar, "eventChannel");
        e.D(strArr, "tags");
        return a(nodleContext, str, new hf.f(((ac.a) nodleContext).f289a, false), hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
