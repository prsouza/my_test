package l7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class b {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    public static final SimpleDateFormat f8115h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    public final String f8116a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8117b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8118c;

    /* renamed from: d  reason: collision with root package name */
    public final Date f8119d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8120e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8121f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f8116a = str;
        this.f8117b = str2;
        this.f8118c = str3;
        this.f8119d = date;
        this.f8120e = j10;
        this.f8121f = j11;
    }
}
