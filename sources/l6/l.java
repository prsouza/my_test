package l6;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import t6.m;

public final class l extends j {
    public l(r rVar, m mVar) {
        super(rVar, mVar);
    }

    public final void b(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f7903b.f8004d.c(this.f7902a);
        r.g.e("onGetChunkFileDescriptor", new Object[0]);
        this.f7902a.b((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
