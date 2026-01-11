package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zad<T> extends zac {
    public final TaskCompletionSource<T> zaa;

    public zad(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.zaa = taskCompletionSource;
    }

    public abstract void zac(zabq<?> zabq) throws RemoteException;

    public final void zad(Status status) {
        this.zaa.trySetException(new ApiException(status));
    }

    public final void zae(Exception exc) {
        this.zaa.trySetException(exc);
    }

    public final void zaf(zabq<?> zabq) throws DeadObjectException {
        try {
            zac(zabq);
        } catch (DeadObjectException e10) {
            zad(zai.zah(e10));
            throw e10;
        } catch (RemoteException e11) {
            zad(zai.zah(e11));
        } catch (RuntimeException e12) {
            this.zaa.trySetException(e12);
        }
    }

    public void zag(zaad zaad, boolean z) {
    }
}
