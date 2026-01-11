package io.nodle.cash.ui.viewmodel;

import ah.v;
import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import io.nodle.cash.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ub.f;

public final class WalletBackupViewModel extends b implements z {
    public final j0<String> A;
    public final j0<String> B;
    public final j0<String> C;
    public final j0<Integer> D;
    public final j0<a> E;
    public final LiveData<String> F;
    public final LiveData<String> G;
    public final LiveData<String> H;
    public final LiveData<Integer> I;
    public final LiveData<a> J;

    /* renamed from: s  reason: collision with root package name */
    public final String f6825s = "WalletBackupViewModel";

    /* renamed from: t  reason: collision with root package name */
    public final Application f6826t;

    /* renamed from: u  reason: collision with root package name */
    public List<String> f6827u;

    /* renamed from: v  reason: collision with root package name */
    public int f6828v;

    /* renamed from: w  reason: collision with root package name */
    public final int f6829w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f6830x;

    /* renamed from: y  reason: collision with root package name */
    public HashMap<Integer, String> f6831y;
    public tb.a z;

    public enum a {
        NONE,
        GOTO_INFO,
        GOTO_PHRASE,
        GOTO_VERIFY,
        FINISH
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WalletBackupViewModel(Application application) {
        super(application);
        e.D(application, "application");
        this.f6826t = application;
        this.f6827u = f.d(v.J(application, qa.e.MNEMONIC));
        this.f6828v = -1;
        this.f6829w = 3;
        this.f6830x = new int[3];
        this.f6831y = new HashMap<>();
        j0<String> j0Var = new j0<>(BuildConfig.FLAVOR);
        this.A = j0Var;
        j0<String> j0Var2 = new j0<>(BuildConfig.FLAVOR);
        this.B = j0Var2;
        j0<String> j0Var3 = new j0<>(application.getString(R.string.next));
        this.C = j0Var3;
        j0<Integer> j0Var4 = new j0<>(8);
        this.D = j0Var4;
        j0<a> j0Var5 = new j0<>(a.NONE);
        this.E = j0Var5;
        this.F = j0Var;
        this.G = j0Var2;
        this.H = j0Var3;
        this.I = j0Var4;
        this.J = j0Var5;
    }

    @l0(r.b.ON_CREATE)
    private final void onCreate() {
        String string = this.f6826t.getString(R.string.titleBackup);
        e.C(string, "app.getString(R.string.titleBackup)");
        String string2 = this.f6826t.getString(R.string.backupMessage);
        e.C(string2, "app.getString(R.string.backupMessage)");
        this.z = new tb.a(string, string2, true);
        this.E.j(a.GOTO_INFO);
    }

    public final void i(a aVar) {
        e.D(aVar, "action");
        this.E.j(aVar);
    }

    public final void j() {
        if (this.f6828v != this.f6827u.size() - 1) {
            int i = this.f6828v + 1;
            this.f6828v = i;
            this.A.j(this.f6827u.get(i));
            j0<String> j0Var = this.B;
            String string = this.f6826t.getString(R.string.wordCount);
            e.C(string, "app.getString(R.string.wordCount)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f6828v + 1), Integer.valueOf(this.f6827u.size())}, 2));
            e.C(format, "format(format, *args)");
            j0Var.j(format);
            if (this.f6828v == this.f6827u.size() - 1) {
                this.C.j(this.f6826t.getString(R.string.done));
                return;
            }
            return;
        }
        i(a.GOTO_VERIFY);
    }
}
