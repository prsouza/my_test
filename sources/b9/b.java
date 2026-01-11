package b9;

import io.sentry.ISerializer;
import io.sentry.SentryEnvelopeItem;
import io.sentry.UserFeedback;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2909a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2910b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2911c;

    public /* synthetic */ b(Object obj, Object obj2, int i) {
        this.f2909a = i;
        this.f2910b = obj;
        this.f2911c = obj2;
    }

    public final Object call() {
        switch (this.f2909a) {
            case 0:
                h hVar = (h) this.f2911c;
                com.google.firebase.remoteconfig.internal.b bVar = ((c) this.f2910b).i;
                synchronized (bVar.f4247b) {
                    bVar.f4246a.edit().putLong("fetch_timeout_in_seconds", hVar.f2921a).putLong("minimum_fetch_interval_in_seconds", hVar.f2922b).commit();
                }
                return null;
            default:
                return SentryEnvelopeItem.lambda$fromUserFeedback$6((ISerializer) this.f2910b, (UserFeedback) this.f2911c);
        }
    }
}
