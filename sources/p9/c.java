package p9;

import a.b;
import g9.e;
import i2.a0;
import i2.j;
import i2.z;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class c extends z<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f9732b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<DateFormat> f9733a;

    public class a implements a0 {
        public final <T> z<T> create(j jVar, x9.a<T> aVar) {
            if (aVar.f13148a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f9733a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (e.f5283a >= 9) {
            arrayList.add(b.r(2, 2));
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<java.text.DateFormat>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = r9.a.b(r3, new java.text.ParsePosition(0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object read(aa.a r3) {
        /*
            r2 = this;
            int r0 = r3.A0()
            r1 = 9
            if (r0 != r1) goto L_0x000d
            r3.x0()
            r3 = 0
            goto L_0x0034
        L_0x000d:
            java.lang.String r3 = r3.y0()
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r2.f9733a     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0018:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch:{ all -> 0x003c }
            java.util.Date r3 = r1.parse(r3)     // Catch:{ ParseException -> 0x0018 }
            goto L_0x0033
        L_0x0029:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x0035 }
            r1 = 0
            r0.<init>(r1)     // Catch:{ ParseException -> 0x0035 }
            java.util.Date r3 = r9.a.b(r3, r0)     // Catch:{ ParseException -> 0x0035 }
        L_0x0033:
            monitor-exit(r2)
        L_0x0034:
            return r3
        L_0x0035:
            r0 = move-exception
            i2.x r1 = new i2.x     // Catch:{ all -> 0x003c }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x003c }
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.c.read(aa.a):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.text.DateFormat>, java.util.ArrayList] */
    public final void write(aa.c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                cVar.f0();
            } else {
                cVar.S(((DateFormat) this.f9733a.get(0)).format(date));
            }
        }
    }
}
