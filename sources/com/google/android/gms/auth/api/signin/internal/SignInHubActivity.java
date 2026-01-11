package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.r;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import d1.a;
import d1.b;
import java.lang.reflect.Modifier;
import java.util.Objects;

@KeepName
public class SignInHubActivity extends r {
    private static boolean zba = false;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    /* access modifiers changed from: private */
    public int zbe;
    /* access modifiers changed from: private */
    public Intent zbf;

    /* JADX INFO: finally extract failed */
    private final void zbc() {
        a supportLoaderManager = getSupportLoaderManager();
        zbw zbw = new zbw(this, (zbv) null);
        b bVar = (b) supportLoaderManager;
        if (bVar.f4259b.f4271s) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            b.a c10 = bVar.f4259b.f4270c.c(0, null);
            if (c10 == null) {
                try {
                    bVar.f4259b.f4271s = true;
                    e1.b onCreateLoader = zbw.onCreateLoader(0, (Bundle) null);
                    if (onCreateLoader != null) {
                        if (onCreateLoader.getClass().isMemberClass()) {
                            if (!Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                            }
                        }
                        b.a aVar = new b.a(onCreateLoader);
                        bVar.f4259b.f4270c.g(0, aVar);
                        bVar.f4259b.f4271s = false;
                        aVar.m(bVar.f4258a, zbw);
                    } else {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                    }
                } catch (Throwable th2) {
                    bVar.f4259b.f4271s = false;
                    throw th2;
                }
            } else {
                c10.m(bVar.f4258a, zbw);
            }
            zba = false;
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    private final void zbd(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    private final void zbe(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            zbd(17);
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void onActivityResult(int i, int i10, Intent intent) {
        if (!this.zbb) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                    if (signInAccount != null && signInAccount.zba() != null) {
                        GoogleSignInAccount zba2 = signInAccount.zba();
                        zbn zbc2 = zbn.zbc(this);
                        GoogleSignInOptions zba3 = this.zbc.zba();
                        Objects.requireNonNull(zba2);
                        zbc2.zbe(zba3, zba2);
                        intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                        intent.putExtra("googleSignInAccount", zba2);
                        this.zbd = true;
                        this.zbe = i10;
                        this.zbf = intent;
                        zbc();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                        }
                        zbd(intExtra);
                        return;
                    }
                }
                zbd(8);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            Objects.requireNonNull(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.zbc = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.zbd = z;
                if (z) {
                    this.zbe = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    Objects.requireNonNull(intent2);
                    this.zbf = intent2;
                    zbc();
                }
            } else if (zba) {
                setResult(0);
                zbd(GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
            } else {
                zba = true;
                zbe(action);
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str = "Unknown action: ".concat(valueOf);
            } else {
                str = new String("Unknown action: ");
            }
            Log.e("AuthSignInClient", str);
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }
}
