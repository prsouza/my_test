package p9;

import aa.c;
import i2.a0;
import i2.j;
import i2.x;
import i2.z;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class k extends z<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f9757b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f9758a = new SimpleDateFormat("MMM d, yyyy");

    public class a implements a0 {
        public final <T> z<T> create(j jVar, x9.a<T> aVar) {
            if (aVar.f13148a == Date.class) {
                return new k();
            }
            return null;
        }
    }

    public final Object read(aa.a aVar) {
        Date date;
        synchronized (this) {
            if (aVar.A0() == 9) {
                aVar.x0();
                date = null;
            } else {
                try {
                    date = new Date(this.f9758a.parse(aVar.y0()).getTime());
                } catch (ParseException e10) {
                    throw new x((Throwable) e10);
                }
            }
        }
        return date;
    }

    public final void write(c cVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            cVar.S(date == null ? null : this.f9758a.format(date));
        }
    }
}
