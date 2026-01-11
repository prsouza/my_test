package p9;

import aa.c;
import i2.a0;
import i2.j;
import i2.x;
import i2.z;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class l extends z<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f9759b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f9760a = new SimpleDateFormat("hh:mm:ss a");

    public class a implements a0 {
        public final <T> z<T> create(j jVar, x9.a<T> aVar) {
            if (aVar.f13148a == Time.class) {
                return new l();
            }
            return null;
        }
    }

    public final Object read(aa.a aVar) {
        synchronized (this) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            try {
                Time time = new Time(this.f9760a.parse(aVar.y0()).getTime());
                return time;
            } catch (ParseException e10) {
                throw new x((Throwable) e10);
            }
        }
    }

    public final void write(c cVar, Object obj) {
        Time time = (Time) obj;
        synchronized (this) {
            cVar.S(time == null ? null : this.f9760a.format(time));
        }
    }
}
