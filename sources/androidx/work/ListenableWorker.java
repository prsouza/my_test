package androidx.work;

import android.content.Context;
import androidx.annotation.Keep;
import f2.c;
import org.slf4j.helpers.MessageFormatter;
import u1.h;

public abstract class ListenableWorker {

    /* renamed from: a  reason: collision with root package name */
    public Context f2624a;

    /* renamed from: b  reason: collision with root package name */
    public WorkerParameters f2625b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f2626c;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2627s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2628t;

    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f2624a = context;
            this.f2625b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public z6.a<h> a() {
        c cVar = new c();
        cVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return cVar;
    }

    public boolean b() {
        return this.f2628t;
    }

    public void e() {
    }

    public abstract z6.a<a> f();

    public final void g() {
        this.f2626c = true;
        e();
    }

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        public static final class C0023a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final b f2629a = b.f2650c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0023a.class != obj.getClass()) {
                    return false;
                }
                return this.f2629a.equals(((C0023a) obj).f2629a);
            }

            public final int hashCode() {
                return this.f2629a.hashCode() + (C0023a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder d10 = a.a.d("Failure {mOutputData=");
                d10.append(this.f2629a);
                d10.append(MessageFormatter.DELIM_STOP);
                return d10.toString();
            }
        }

        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final b f2630a;

            public c() {
                this.f2630a = b.f2650c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f2630a.equals(((c) obj).f2630a);
            }

            public final int hashCode() {
                return this.f2630a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                StringBuilder d10 = a.a.d("Success {mOutputData=");
                d10.append(this.f2630a);
                d10.append(MessageFormatter.DELIM_STOP);
                return d10.toString();
            }

            public c(b bVar) {
                this.f2630a = bVar;
            }
        }
    }
}
