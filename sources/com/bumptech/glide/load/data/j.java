package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import c4.c;
import c4.f;
import com.bumptech.glide.load.data.d;
import g3.e;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import m3.g;

public final class j implements d<InputStream> {

    /* renamed from: u  reason: collision with root package name */
    public static final a f3570u = new a();

    /* renamed from: a  reason: collision with root package name */
    public final g f3571a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3572b;

    /* renamed from: c  reason: collision with root package name */
    public HttpURLConnection f3573c;

    /* renamed from: s  reason: collision with root package name */
    public InputStream f3574s;

    /* renamed from: t  reason: collision with root package name */
    public volatile boolean f3575t;

    public static class a {
    }

    public j(g gVar, int i) {
        this.f3571a = gVar;
        this.f3572b = i;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    public final Class<InputStream> a() {
        return InputStream.class;
    }

    public final void b() {
        InputStream inputStream = this.f3574s;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f3573c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f3573c = null;
    }

    public final void cancel() {
        this.f3575t = true;
    }

    public final InputStream d(URL url, int i, URL url2, Map<String, String> map) throws e {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new e("In re-direct loop", -1, (Throwable) null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            boolean z = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry next : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                httpURLConnection.setConnectTimeout(this.f3572b);
                httpURLConnection.setReadTimeout(this.f3572b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f3573c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f3574s = this.f3573c.getInputStream();
                    if (this.f3575t) {
                        return null;
                    }
                    int c10 = c(this.f3573c);
                    int i10 = c10 / 100;
                    if (i10 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f3573c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f3574s = new c(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.f3574s = httpURLConnection2.getInputStream();
                            }
                            return this.f3574s;
                        } catch (IOException e10) {
                            throw new e("Failed to obtain InputStream", c(httpURLConnection2), e10);
                        }
                    } else {
                        if (i10 == 3) {
                            z = true;
                        }
                        if (z) {
                            String headerField = this.f3573c.getHeaderField("Location");
                            if (!TextUtils.isEmpty(headerField)) {
                                try {
                                    URL url3 = new URL(url, headerField);
                                    b();
                                    return d(url3, i + 1, url, map);
                                } catch (MalformedURLException e11) {
                                    throw new e(a8.a.c("Bad redirect url: ", headerField), c10, e11);
                                }
                            } else {
                                throw new e("Received empty or null redirect url", c10, (Throwable) null);
                            }
                        } else if (c10 == -1) {
                            throw new e("Http request failed", c10, (Throwable) null);
                        } else {
                            try {
                                throw new e(this.f3573c.getResponseMessage(), c10, (Throwable) null);
                            } catch (IOException e12) {
                                throw new e("Failed to get a response message", c10, e12);
                            }
                        }
                    }
                } catch (IOException e13) {
                    throw new e("Failed to connect or obtain data", c(this.f3573c), e13);
                }
            } catch (IOException e14) {
                throw new e("URL.openConnection threw", 0, e14);
            }
        } else {
            throw new e("Too many (> 5) redirects!", -1, (Throwable) null);
        }
    }

    public final g3.a e() {
        return g3.a.REMOTE;
    }

    public final void f(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        int i = f.f3234b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.d(d(this.f3571a.d(), 0, (URL) null, this.f3571a.f8404b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
            }
            aVar.c(e10);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder d10 = a.a.d("Finished http url fetcher fetch in ");
                d10.append(f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", d10.toString());
            }
            throw th2;
        }
    }
}
