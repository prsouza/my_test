package rf;

import android.util.Log;
import b9.m;
import e6.e;
import fe.o;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final d f10773a = new d();

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord logRecord) {
        int i;
        int min;
        e.D(logRecord, "record");
        c cVar = c.f10772c;
        String loggerName = logRecord.getLoggerName();
        e.C(loggerName, "record.loggerName");
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        e.C(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = c.f10771b.get(loggerName);
        if (str == null) {
            int i10 = 23;
            int length = loggerName.length();
            if (23 > length) {
                i10 = length;
            }
            str = loggerName.substring(0, i10);
            e.C(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                StringBuilder c10 = m.c(message, "\n");
                c10.append(Log.getStackTraceString(thrown));
                message = c10.toString();
            }
            int length2 = message.length();
            int i11 = 0;
            while (i11 < length2) {
                int l12 = o.l1(message, 10, i11, false, 4);
                if (l12 == -1) {
                    l12 = length2;
                }
                while (true) {
                    min = Math.min(l12, i11 + 4000);
                    String substring = message.substring(i11, min);
                    e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= l12) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }
}
