package com.google.android.gms.common.api.internal;

final class zabn implements Runnable {
    public final /* synthetic */ int zaa;
    public final /* synthetic */ zabq zab;

    public zabn(zabq zabq, int i) {
        this.zab = zabq;
        this.zaa = i;
    }

    public final void run() {
        this.zab.zaH(this.zaa);
    }
}
