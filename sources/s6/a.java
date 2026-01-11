package s6;

import android.content.Context;
import android.os.Process;

public final class a {
    static {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("UID: [");
        sb2.append(myUid);
        sb2.append("]  PID: [");
        sb2.append(myPid);
        sb2.append("] ");
        String sb3 = sb2.toString();
        if ("SplitInstallInfoProvider".length() != 0) {
            sb3.concat("SplitInstallInfoProvider");
        } else {
            new String(sb3);
        }
    }

    public a(Context context) {
        context.getPackageName();
    }
}
