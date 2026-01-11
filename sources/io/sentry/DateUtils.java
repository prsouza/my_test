package io.sentry;

import a8.a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class DateUtils {
    private static final String ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final String ISO_FORMAT_WITH_MILLIS = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final ThreadLocal<SimpleDateFormat> SDF_ISO_FORMAT_UTC = new ThreadLocal<SimpleDateFormat>() {
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO_FORMAT, Locale.ROOT);
            simpleDateFormat.setTimeZone(DateUtils.UTC_TIMEZONE);
            return simpleDateFormat;
        }
    };
    private static final ThreadLocal<SimpleDateFormat> SDF_ISO_FORMAT_WITH_MILLIS_UTC = new ThreadLocal<SimpleDateFormat>() {
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO_FORMAT_WITH_MILLIS, Locale.ROOT);
            simpleDateFormat.setTimeZone(DateUtils.UTC_TIMEZONE);
            return simpleDateFormat;
        }
    };
    private static final String UTC = "UTC";
    /* access modifiers changed from: private */
    public static final TimeZone UTC_TIMEZONE = TimeZone.getTimeZone(UTC);

    private DateUtils() {
    }

    public static Date getCurrentDateTime() {
        return Calendar.getInstance(UTC_TIMEZONE).getTime();
    }

    public static Date getDateTime(long j10) {
        Calendar instance = Calendar.getInstance(UTC_TIMEZONE);
        instance.setTimeInMillis(j10);
        return instance.getTime();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        return SDF_ISO_FORMAT_UTC.get().parse(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        throw new java.lang.IllegalArgumentException(a8.a.c("timestamp is not ISO format ", r2));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date getDateTime(java.lang.String r2) {
        /*
            java.lang.ThreadLocal<java.text.SimpleDateFormat> r0 = SDF_ISO_FORMAT_WITH_MILLIS_UTC     // Catch:{ ParseException -> 0x000d }
            java.lang.Object r0 = r0.get()     // Catch:{ ParseException -> 0x000d }
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0     // Catch:{ ParseException -> 0x000d }
            java.util.Date r2 = r0.parse(r2)     // Catch:{ ParseException -> 0x000d }
            return r2
        L_0x000d:
            java.lang.ThreadLocal<java.text.SimpleDateFormat> r0 = SDF_ISO_FORMAT_UTC     // Catch:{ ParseException -> 0x001a }
            java.lang.Object r0 = r0.get()     // Catch:{ ParseException -> 0x001a }
            java.text.SimpleDateFormat r0 = (java.text.SimpleDateFormat) r0     // Catch:{ ParseException -> 0x001a }
            java.util.Date r2 = r0.parse(r2)     // Catch:{ ParseException -> 0x001a }
            return r2
        L_0x001a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "timestamp is not ISO format "
            java.lang.String r2 = a8.a.c(r1, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.DateUtils.getDateTime(java.lang.String):java.util.Date");
    }

    public static Date getDateTimeWithMillisPrecision(String str) {
        try {
            return getDateTime(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(a.c("timestamp is not millis format ", str));
        }
    }

    public static String getTimestamp(Date date) {
        return SDF_ISO_FORMAT_WITH_MILLIS_UTC.get().format(date);
    }
}
