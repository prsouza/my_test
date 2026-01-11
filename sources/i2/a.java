package i2;

import a.b;
import aa.c;
import g9.e;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class a extends z<Date> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? extends Date> f5976a;

    /* renamed from: b  reason: collision with root package name */
    public final List<DateFormat> f5977b;

    public a(Class<? extends Date> cls, int i, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f5977b = arrayList;
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            this.f5976a = cls;
            Locale locale = Locale.US;
            arrayList.add(DateFormat.getDateTimeInstance(i, i10, locale));
            if (!Locale.getDefault().equals(locale)) {
                arrayList.add(DateFormat.getDateTimeInstance(i, i10));
            }
            if (e.f5283a >= 9) {
                arrayList.add(b.r(i, i10));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<java.text.DateFormat>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = r9.a.b(r4, new java.text.ParsePosition(0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object read(aa.a r4) {
        /*
            r3 = this;
            int r0 = r4.A0()
            r1 = 9
            if (r0 != r1) goto L_0x000d
            r4.x0()
            r4 = 0
            goto L_0x005a
        L_0x000d:
            java.lang.String r4 = r4.y0()
            java.util.List<java.text.DateFormat> r0 = r3.f5977b
            monitor-enter(r0)
            java.util.List<java.text.DateFormat> r1 = r3.f5977b     // Catch:{ all -> 0x0068 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0068 }
        L_0x001a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0068 }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0068 }
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch:{ all -> 0x0068 }
            java.util.Date r4 = r2.parse(r4)     // Catch:{ ParseException -> 0x001a }
            goto L_0x0035
        L_0x002b:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch:{ ParseException -> 0x0061 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ ParseException -> 0x0061 }
            java.util.Date r4 = r9.a.b(r4, r1)     // Catch:{ ParseException -> 0x0061 }
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            java.lang.Class<? extends java.util.Date> r0 = r3.f5976a
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L_0x003d
            goto L_0x005a
        L_0x003d:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r0 != r1) goto L_0x004c
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
        L_0x004a:
            r4 = r0
            goto L_0x005a
        L_0x004c:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r0 != r1) goto L_0x005b
            java.sql.Date r0 = new java.sql.Date
            long r1 = r4.getTime()
            r0.<init>(r1)
            goto L_0x004a
        L_0x005a:
            return r4
        L_0x005b:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x0061:
            r1 = move-exception
            i2.x r2 = new i2.x     // Catch:{ all -> 0x0068 }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x0068 }
            throw r2     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0068 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.a.read(aa.a):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.text.DateFormat>, java.util.ArrayList] */
    public final String toString() {
        StringBuilder sb2;
        String str;
        DateFormat dateFormat = (DateFormat) this.f5977b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb2 = b.q("DefaultDateTypeAdapter(");
            str = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb2 = b.q("DefaultDateTypeAdapter(");
            str = dateFormat.getClass().getSimpleName();
        }
        sb2.append(str);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<java.text.DateFormat>, java.util.ArrayList] */
    public final void write(c cVar, Object obj) {
        Date date = (Date) obj;
        if (date == null) {
            cVar.f0();
            return;
        }
        synchronized (this.f5977b) {
            cVar.S(((DateFormat) this.f5977b.get(0)).format(date));
        }
    }
}
