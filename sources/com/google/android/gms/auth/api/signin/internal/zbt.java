package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.UidVerifier;

public final class zbt extends zbo {
    private final Context zba;

    public zbt(Context context) {
        this.zba = context;
    }

    private final void zbd() {
        if (!UidVerifier.isGooglePlayServicesUid(this.zba, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Calling UID ");
            sb2.append(callingUid);
            sb2.append(" is not Google Play services.");
            throw new SecurityException(sb2.toString());
        }
    }

    public final void zbb() {
        zbd();
        zbn.zbc(this.zba).zbd();
    }

    public final void zbc() {
        zbd();
        Storage instance = Storage.getInstance(this.zba);
        GoogleSignInAccount savedDefaultGoogleSignInAccount = instance.getSavedDefaultGoogleSignInAccount();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (savedDefaultGoogleSignInAccount != null) {
            googleSignInOptions = instance.getSavedDefaultGoogleSignInOptions();
        }
        GoogleSignInClient client = GoogleSignIn.getClient(this.zba, googleSignInOptions);
        if (savedDefaultGoogleSignInAccount != null) {
            client.revokeAccess();
        } else {
            client.signOut();
        }
    }
}
