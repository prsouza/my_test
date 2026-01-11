package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final Date f4244d = new Date(-1);

    /* renamed from: e  reason: collision with root package name */
    public static final Date f4245e = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f4246a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4247b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Object f4248c = new Object();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4249a;

        /* renamed from: b  reason: collision with root package name */
        public Date f4250b;

        public a(int i, Date date) {
            this.f4249a = i;
            this.f4250b = date;
        }
    }

    public b(SharedPreferences sharedPreferences) {
        this.f4246a = sharedPreferences;
    }

    public final a a() {
        a aVar;
        synchronized (this.f4248c) {
            aVar = new a(this.f4246a.getInt("num_failed_fetches", 0), new Date(this.f4246a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    public final void b(int i, Date date) {
        synchronized (this.f4248c) {
            this.f4246a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
