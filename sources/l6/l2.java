package l6;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import m3.u;

public final class l2 {

    /* renamed from: b  reason: collision with root package name */
    public static final u f7923b = new u("VerifySliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    public final a0 f7924a;

    public l2(a0 a0Var) {
        this.f7924a = a0Var;
    }

    public final void a(k2 k2Var) {
        File s10 = this.f7924a.s(k2Var.f2905b, k2Var.f7916c, k2Var.f7917d, k2Var.f7918e);
        if (s10.exists()) {
            try {
                File r10 = this.f7924a.r(k2Var.f2905b, k2Var.f7916c, k2Var.f7917d, k2Var.f7918e);
                if (r10.exists()) {
                    try {
                        if (b1.y(j2.a(s10, r10)).equals(k2Var.f7919f)) {
                            f7923b.e("Verification of slice %s of pack %s successful.", k2Var.f7918e, k2Var.f2905b);
                            File t10 = this.f7924a.t(k2Var.f2905b, k2Var.f7916c, k2Var.f7917d, k2Var.f7918e);
                            if (!t10.exists()) {
                                t10.mkdirs();
                            }
                            if (!s10.renameTo(t10)) {
                                throw new t0(String.format("Failed to move slice %s after verification.", new Object[]{k2Var.f7918e}), k2Var.f2904a);
                            }
                            return;
                        }
                        throw new t0(String.format("Verification failed for slice %s.", new Object[]{k2Var.f7918e}), k2Var.f2904a);
                    } catch (NoSuchAlgorithmException e10) {
                        throw new t0("SHA256 algorithm not supported.", e10, k2Var.f2904a);
                    } catch (IOException e11) {
                        throw new t0(String.format("Could not digest file during verification for slice %s.", new Object[]{k2Var.f7918e}), e11, k2Var.f2904a);
                    }
                } else {
                    throw new t0(String.format("Cannot find metadata files for slice %s.", new Object[]{k2Var.f7918e}), k2Var.f2904a);
                }
            } catch (IOException e12) {
                throw new t0(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{k2Var.f7918e}), e12, k2Var.f2904a);
            }
        } else {
            throw new t0(String.format("Cannot find unverified files for slice %s.", new Object[]{k2Var.f7918e}), k2Var.f2904a);
        }
    }
}
