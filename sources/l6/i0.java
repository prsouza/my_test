package l6;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import o6.w;
import t6.f;

public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final w f7895a;

    public i0(w wVar) {
        this.f7895a = wVar;
    }

    public final InputStream a(int i, String str, String str2, int i10) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) f.a(((v2) this.f7895a.zza()).e(i, str, str2, i10));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new t0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i10)}), i);
        } catch (ExecutionException e10) {
            throw new t0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i10)}), e10, i);
        } catch (InterruptedException e11) {
            throw new t0("Extractor was interrupted while waiting for chunk file.", e11, i);
        }
    }
}
