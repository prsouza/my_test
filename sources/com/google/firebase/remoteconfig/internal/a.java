package com.google.firebase.remoteconfig.internal;

import b9.d;
import b9.g;
import c9.e;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.remoteconfig.internal.b;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import r8.b;
import s8.f;

public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final long f4232j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4233k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    public final f f4234a;

    /* renamed from: b  reason: collision with root package name */
    public final b<o7.a> f4235b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f4236c;

    /* renamed from: d  reason: collision with root package name */
    public final Clock f4237d;

    /* renamed from: e  reason: collision with root package name */
    public final Random f4238e;

    /* renamed from: f  reason: collision with root package name */
    public final e f4239f;
    public final ConfigFetchHttpClient g;

    /* renamed from: h  reason: collision with root package name */
    public final b f4240h;
    public final Map<String, String> i;

    /* renamed from: com.google.firebase.remoteconfig.internal.a$a  reason: collision with other inner class name */
    public static class C0053a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4241a;

        /* renamed from: b  reason: collision with root package name */
        public final c9.f f4242b;

        /* renamed from: c  reason: collision with root package name */
        public final String f4243c;

        public C0053a(int i, c9.f fVar, String str) {
            this.f4241a = i;
            this.f4242b = fVar;
            this.f4243c = str;
        }
    }

    public a(f fVar, b<o7.a> bVar, Executor executor, Clock clock, Random random, e eVar, ConfigFetchHttpClient configFetchHttpClient, b bVar2, Map<String, String> map) {
        this.f4234a = fVar;
        this.f4235b = bVar;
        this.f4236c = executor;
        this.f4237d = clock;
        this.f4238e = random;
        this.f4239f = eVar;
        this.g = configFetchHttpClient;
        this.f4240h = bVar2;
        this.i = map;
    }

    public final C0053a a(String str, String str2, Date date) throws b9.e {
        String str3;
        boolean z = false;
        try {
            C0053a fetch = this.g.fetch(this.g.b(), str, str2, b(), this.f4240h.f4246a.getString("last_fetch_etag", (String) null), this.i, date);
            String str4 = fetch.f4243c;
            if (str4 != null) {
                b bVar = this.f4240h;
                synchronized (bVar.f4247b) {
                    bVar.f4246a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f4240h.b(0, b.f4245e);
            return fetch;
        } catch (g e10) {
            int i10 = e10.f2920a;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                int i11 = this.f4240h.a().f4249a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f4233k;
                long millis = timeUnit.toMillis((long) iArr[Math.min(i11, iArr.length) - 1]);
                this.f4240h.b(i11, new Date(date.getTime() + (millis / 2) + ((long) this.f4238e.nextInt((int) millis))));
            }
            b.a a10 = this.f4240h.a();
            int i12 = e10.f2920a;
            if (a10.f4249a > 1 || i12 == 429) {
                z = true;
            }
            if (!z) {
                if (i12 == 401) {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                } else if (i12 == 403) {
                    str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                } else if (i12 == 429) {
                    throw new d("The throttled response from the server was not handled correctly by the FRC SDK.");
                } else if (i12 != 500) {
                    switch (i12) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
                throw new g(e10.f2920a, a8.a.c("Fetch failed: ", str3), e10);
            }
            a10.f4250b.getTime();
            throw new b9.f();
        }
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        o7.a aVar = this.f4235b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry entry : aVar.e().entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
}
