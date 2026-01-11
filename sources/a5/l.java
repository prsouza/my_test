package a5;

import a5.a0;
import android.database.Cursor;
import android.util.Log;
import androidx.fragment.app.a;
import androidx.lifecycle.k0;
import b5.b;
import c3.k;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.WalletBackupActivity;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;
import java.io.File;
import java.util.Objects;
import nb.a;
import nb.b;
import nb.d;
import x4.c;
import x7.b0;
import x7.l0;
import x8.p0;
import x8.r0;
import z4.o;

public final /* synthetic */ class l implements a0.a, Continuation, k0, b.a, OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f103a;

    public /* synthetic */ l(Object obj) {
        this.f103a = obj;
    }

    public Object a() {
        ((o) this.f103a).i.e();
        return null;
    }

    public Object apply(Object obj) {
        a0 a0Var = (a0) this.f103a;
        Cursor cursor = (Cursor) obj;
        Objects.requireNonNull(a0Var);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            a0Var.f((long) i, c.a.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public void d(Object obj) {
        int i;
        WalletBackupActivity walletBackupActivity = (WalletBackupActivity) this.f103a;
        WalletBackupViewModel.a aVar = (WalletBackupViewModel.a) obj;
        int i10 = WalletBackupActivity.f6722y;
        e.D(walletBackupActivity, "this$0");
        String str = walletBackupActivity.f6723v;
        Log.d(str, "Activity Action: " + aVar);
        if (aVar == null) {
            i = -1;
        } else {
            i = WalletBackupActivity.a.f6726a[aVar.ordinal()];
        }
        if (i == 1) {
            aVar.toString();
            Log.d(walletBackupActivity.f6723v, "load intro");
            a aVar2 = new a(walletBackupActivity.getSupportFragmentManager());
            a.C0167a aVar3 = nb.a.f8935b;
            aVar2.f(R.id.fragmentContainerLayout, new nb.a());
            aVar2.d();
        } else if (i == 2) {
            String obj2 = aVar.toString();
            Log.d(walletBackupActivity.f6723v, "load phrase");
            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(walletBackupActivity.getSupportFragmentManager());
            d.a aVar5 = d.f8942c;
            aVar4.e(R.id.fragmentContainerLayout, new d(), (String) null, 1);
            aVar4.c(obj2);
            aVar4.d();
        } else if (i == 3) {
            String obj3 = aVar.toString();
            Log.d(walletBackupActivity.f6723v, "load backup verify");
            androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(walletBackupActivity.getSupportFragmentManager());
            b.a aVar7 = nb.b.f8937c;
            aVar6.e(R.id.fragmentContainerLayout, new nb.b(), (String) null, 1);
            aVar6.c(obj3);
            aVar6.d();
        } else if (i == 4) {
            walletBackupActivity.finish();
        }
    }

    public void onComplete(Task task) {
        int i = p0.f13113b;
        ((r0.a) this.f103a).a();
    }

    public Object then(Task task) {
        boolean z;
        Objects.requireNonNull((l0) this.f103a);
        if (task.isSuccessful()) {
            b0 b0Var = (b0) task.getResult();
            k kVar = k.E;
            StringBuilder d10 = a.a.d("Crashlytics report successfully enqueued to DataTransport: ");
            d10.append(b0Var.c());
            kVar.e0(d10.toString());
            File b10 = b0Var.b();
            if (b10.delete()) {
                StringBuilder d11 = a.a.d("Deleted report file: ");
                d11.append(b10.getPath());
                kVar.e0(d11.toString());
            } else {
                StringBuilder d12 = a.a.d("Crashlytics could not delete report file: ");
                d12.append(b10.getPath());
                kVar.d1(d12.toString(), (Throwable) null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
