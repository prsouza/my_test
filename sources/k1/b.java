package k1;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;

@Deprecated
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final KeyGenParameterSpec f7400a = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(new String[]{CodePackage.GCM}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
}
