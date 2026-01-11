package x8;

import androidx.lifecycle.k0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import e6.e;
import io.nodle.cash.ui.view.activity.HomeActivityV2;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import java.util.ArrayDeque;
import java.util.Objects;

public final /* synthetic */ class p implements SuccessContinuation, k0, ScopeCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f13112a;

    public /* synthetic */ p(Object obj) {
        this.f13112a = obj;
    }

    public final void d(Object obj) {
        HomeActivityV2 homeActivityV2 = (HomeActivityV2) this.f13112a;
        Boolean bool = (Boolean) obj;
        int i = HomeActivityV2.H;
        e.D(homeActivityV2, "this$0");
        e.C(bool, "it");
        if (bool.booleanValue()) {
            homeActivityV2.m();
        }
    }

    public final void run(Scope scope) {
        scope.setTransaction((ITransaction) this.f13112a);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>>, s.g] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>>, s.g] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>>, s.g] */
    public final Task then(Object obj) {
        ArrayDeque arrayDeque;
        m0 m0Var = (m0) obj;
        a aVar = FirebaseMessaging.f4202m;
        Objects.requireNonNull(m0Var);
        j0 j0Var = new j0("S", (String) this.f13112a);
        k0 k0Var = m0Var.f13094h;
        synchronized (k0Var) {
            k0Var.f13076a.a(j0Var.f13072c);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (m0Var.f13092e) {
            try {
                String str = j0Var.f13072c;
                if (m0Var.f13092e.containsKey(str)) {
                    arrayDeque = (ArrayDeque) m0Var.f13092e.getOrDefault(str, null);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    m0Var.f13092e.put(str, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        Task task = taskCompletionSource.getTask();
        m0Var.f();
        return task;
    }
}
