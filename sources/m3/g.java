package m3;

import android.net.Uri;
import android.text.TextUtils;
import g3.f;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;

public final class g implements f {

    /* renamed from: b  reason: collision with root package name */
    public final h f8404b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f8405c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8406d;

    /* renamed from: e  reason: collision with root package name */
    public String f8407e;

    /* renamed from: f  reason: collision with root package name */
    public URL f8408f;
    public volatile byte[] g;

    /* renamed from: h  reason: collision with root package name */
    public int f8409h;

    public g(URL url) {
        j jVar = h.f8410a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.f8405c = url;
        this.f8406d = null;
        Objects.requireNonNull(jVar, "Argument must not be null");
        this.f8404b = jVar;
    }

    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(f.f5231a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.f8406d;
        if (str != null) {
            return str;
        }
        URL url = this.f8405c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() throws MalformedURLException {
        if (this.f8408f == null) {
            if (TextUtils.isEmpty(this.f8407e)) {
                String str = this.f8406d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f8405c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f8407e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f8408f = new URL(this.f8407e);
        }
        return this.f8408f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!c().equals(gVar.c()) || !this.f8404b.equals(gVar.f8404b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f8409h == 0) {
            int hashCode = c().hashCode();
            this.f8409h = hashCode;
            this.f8409h = this.f8404b.hashCode() + (hashCode * 31);
        }
        return this.f8409h;
    }

    public final String toString() {
        return c();
    }

    public g(String str) {
        j jVar = h.f8410a;
        this.f8405c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f8406d = str;
            Objects.requireNonNull(jVar, "Argument must not be null");
            this.f8404b = jVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
