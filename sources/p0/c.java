package p0;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f9482a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f9482a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean performPrivateCommand(java.lang.String r12, android.os.Bundle r13) {
        /*
            r11 = this;
            p0.e r0 = r11.f9482a
            r1 = 0
            r2 = 1
            if (r13 != 0) goto L_0x0008
            goto L_0x0087
        L_0x0008:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r12)
            if (r3 == 0) goto L_0x0012
            r3 = r1
            goto L_0x001b
        L_0x0012:
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r3 = android.text.TextUtils.equals(r3, r12)
            if (r3 == 0) goto L_0x0087
            r3 = r2
        L_0x001b:
            r4 = 0
            if (r3 == 0) goto L_0x0021
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x0023
        L_0x0021:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x0023:
            android.os.Parcelable r5 = r13.getParcelable(r5)     // Catch:{ all -> 0x007f }
            android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x002e
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x0030
        L_0x002e:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x0030:
            android.os.Parcelable r6 = r13.getParcelable(r6)     // Catch:{ all -> 0x007d }
            android.net.Uri r6 = (android.net.Uri) r6     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x003b
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x003d
        L_0x003b:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x003d:
            android.os.Parcelable r7 = r13.getParcelable(r7)     // Catch:{ all -> 0x007d }
            android.content.ClipDescription r7 = (android.content.ClipDescription) r7     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0048
            java.lang.String r8 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x004a
        L_0x0048:
            java.lang.String r8 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x004a:
            android.os.Parcelable r8 = r13.getParcelable(r8)     // Catch:{ all -> 0x007d }
            android.net.Uri r8 = (android.net.Uri) r8     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0055
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0057
        L_0x0055:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0057:
            int r9 = r13.getInt(r9)     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0060
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x0062
        L_0x0060:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x0062:
            android.os.Parcelable r3 = r13.getParcelable(r3)     // Catch:{ all -> 0x007d }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x007d }
            if (r6 == 0) goto L_0x0077
            if (r7 == 0) goto L_0x0077
            p0.f r10 = new p0.f     // Catch:{ all -> 0x007d }
            r10.<init>(r6, r7, r8)     // Catch:{ all -> 0x007d }
            p0.d r0 = (p0.d) r0     // Catch:{ all -> 0x007d }
            boolean r1 = r0.a(r10, r9, r3)     // Catch:{ all -> 0x007d }
        L_0x0077:
            if (r5 == 0) goto L_0x0087
            r5.send(r1, r4)
            goto L_0x0087
        L_0x007d:
            r12 = move-exception
            goto L_0x0081
        L_0x007f:
            r12 = move-exception
            r5 = r4
        L_0x0081:
            if (r5 == 0) goto L_0x0086
            r5.send(r1, r4)
        L_0x0086:
            throw r12
        L_0x0087:
            if (r1 == 0) goto L_0x008a
            return r2
        L_0x008a:
            boolean r12 = super.performPrivateCommand(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.c.performPrivateCommand(java.lang.String, android.os.Bundle):boolean");
    }
}
