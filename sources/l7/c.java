package l7;

import android.text.TextUtils;
import com.github.mikephil.charting.BuildConfig;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o7.a;
import r8.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b<a> f8122a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8123b = "frc";

    /* renamed from: c  reason: collision with root package name */
    public Integer f8124c = null;

    public c(b bVar) {
        this.f8122a = bVar;
    }

    public final List<a.c> a() {
        return this.f8122a.get().f(this.f8123b);
    }

    public final void b(Collection<a.c> collection) {
        for (a.c cVar : collection) {
            this.f8122a.get().a(cVar.f9354b);
        }
    }

    public final void c(List<Map<String, String>> list) throws a {
        String str;
        if (this.f8122a.get() != null) {
            ArrayList arrayList = new ArrayList();
            for (Map next : list) {
                String[] strArr = b.g;
                ArrayList arrayList2 = new ArrayList();
                String[] strArr2 = b.g;
                for (int i = 0; i < 5; i++) {
                    String str2 = strArr2[i];
                    if (!next.containsKey(str2)) {
                        arrayList2.add(str2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    try {
                        arrayList.add(new b((String) next.get("experimentId"), (String) next.get("variantId"), next.containsKey("triggerEvent") ? (String) next.get("triggerEvent") : BuildConfig.FLAVOR, b.f8115h.parse((String) next.get("experimentStartTime")), Long.parseLong((String) next.get("triggerTimeoutMillis")), Long.parseLong((String) next.get("timeToLiveMillis"))));
                    } catch (ParseException e10) {
                        throw new a("Could not process experiment: parsing experiment start time failed.", e10);
                    } catch (NumberFormatException e11) {
                        throw new a("Could not process experiment: one of the durations could not be converted into a long.", e11);
                    }
                } else {
                    throw new a(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList2}));
                }
            }
            if (!arrayList.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(((b) it.next()).f8116a);
                }
                List<a.c> a10 = a();
                HashSet hashSet2 = new HashSet();
                for (a.c cVar : a10) {
                    hashSet2.add(cVar.f9354b);
                }
                ArrayList arrayList3 = new ArrayList();
                for (a.c next2 : a10) {
                    if (!hashSet.contains(next2.f9354b)) {
                        arrayList3.add(next2);
                    }
                }
                b(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    b bVar = (b) it2.next();
                    if (!hashSet2.contains(bVar.f8116a)) {
                        arrayList4.add(bVar);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(a());
                if (this.f8124c == null) {
                    this.f8124c = Integer.valueOf(this.f8122a.get().h(this.f8123b));
                }
                int intValue = this.f8124c.intValue();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    b bVar2 = (b) it3.next();
                    while (true) {
                        str = null;
                        if (arrayDeque.size() < intValue) {
                            break;
                        }
                        this.f8122a.get().a(((a.c) arrayDeque.pollFirst()).f9354b);
                    }
                    String str3 = this.f8123b;
                    Objects.requireNonNull(bVar2);
                    a.c cVar2 = new a.c();
                    cVar2.f9353a = str3;
                    cVar2.f9363m = bVar2.f8119d.getTime();
                    cVar2.f9354b = bVar2.f8116a;
                    cVar2.f9355c = bVar2.f8117b;
                    if (!TextUtils.isEmpty(bVar2.f8118c)) {
                        str = bVar2.f8118c;
                    }
                    cVar2.f9356d = str;
                    cVar2.f9357e = bVar2.f8120e;
                    cVar2.f9360j = bVar2.f8121f;
                    this.f8122a.get().c(cVar2);
                    arrayDeque.offer(cVar2);
                }
            } else if (this.f8122a.get() != null) {
                b(a());
            } else {
                throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
        } else {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
