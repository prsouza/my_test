package o6;

import java.util.Objects;

public final class y implements z, w {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f9350c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile z f9351a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f9352b = f9350c;

    public y(z zVar) {
        this.f9351a = zVar;
    }

    public static w a(z zVar) {
        if (zVar instanceof w) {
            return (w) zVar;
        }
        Objects.requireNonNull(zVar);
        return new y(zVar);
    }

    public static z b(z zVar) {
        if (zVar instanceof y) {
            return zVar;
        }
        return new y(zVar);
    }

    public final Object zza() {
        Object obj = this.f9352b;
        Object obj2 = f9350c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f9352b;
                if (obj == obj2) {
                    obj = this.f9351a.zza();
                    Object obj3 = this.f9352b;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            String valueOf = String.valueOf(obj3);
                            String valueOf2 = String.valueOf(obj);
                            StringBuilder sb2 = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                            sb2.append("Scoped provider was invoked recursively returning different results: ");
                            sb2.append(valueOf);
                            sb2.append(" & ");
                            sb2.append(valueOf2);
                            sb2.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb2.toString());
                        }
                    }
                    this.f9352b = obj;
                    this.f9351a = null;
                }
            }
        }
        return obj;
    }
}
