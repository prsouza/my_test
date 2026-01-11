package x2;

import a.a;
import io.sentry.cache.EnvelopeCache;

public enum c {
    JSON(EnvelopeCache.SUFFIX_CURRENT_SESSION_FILE),
    ZIP(".zip");
    
    public final String extension;

    private c(String str) {
        this.extension = str;
    }

    public static c forFile(String str) {
        for (c cVar : values()) {
            if (str.endsWith(cVar.extension)) {
                return cVar;
            }
        }
        a3.c.b("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        StringBuilder d10 = a.d(".temp");
        d10.append(this.extension);
        return d10.toString();
    }

    public String toString() {
        return this.extension;
    }
}
