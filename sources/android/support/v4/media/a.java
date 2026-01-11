package android.support.v4.media;

import ag.n;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.internal.zzgi;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.a;
import java.util.HashMap;
import nh.o;

public final /* synthetic */ class a implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f727a = new a();

    public static long a(long j10, long j11, long j12, long j13) {
        return (j10 * j11) + j12 + j13;
    }

    public static String b(int i, String str, int i10) {
        StringBuilder sb2 = new StringBuilder(i);
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }

    public static String c(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.A());
        return sb2.toString();
    }

    public static String d(String str, long j10) {
        return str + j10;
    }

    public static String e(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static void f(int i, int i10, n nVar, HashMap hashMap, Integer num) {
        hashMap.put(num, new o(i, i10, nVar));
    }

    public static void g(zzgi zzgi, String str) {
        zzgi.zzaz().zzk().zza(str);
    }

    public Task then(Object obj) {
        a.C0053a aVar = (a.C0053a) obj;
        return Tasks.forResult(null);
    }
}
