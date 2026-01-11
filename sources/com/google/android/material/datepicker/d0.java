package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicReference<c0> f3840a = new AtomicReference<>();

    public static long a(long j10) {
        Calendar e10 = e((Calendar) null);
        e10.setTimeInMillis(j10);
        return b(e10).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar e10 = e(calendar);
        Calendar e11 = e((Calendar) null);
        e11.set(e10.get(1), e10.get(2), e10.get(5));
        return e11;
    }

    public static TimeZone c() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        c0 c0Var = f3840a.get();
        if (c0Var == null) {
            c0Var = c0.f3837c;
        }
        TimeZone timeZone = c0Var.f3839b;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = c0Var.f3838a;
        if (l10 != null) {
            instance.setTimeInMillis(l10.longValue());
        }
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(c());
        return instance;
    }

    public static Calendar e(Calendar calendar) {
        Calendar instance = Calendar.getInstance(c());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
