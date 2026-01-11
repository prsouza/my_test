package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import m3.u;
import o6.s;

public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            String packageName = getPackageName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 66);
            sb2.append("market://details?id=");
            sb2.append(packageName);
            sb2.append("&referrer=utm_source%3Dplay.core.missingsplits");
            try {
                startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(sb2.toString())).setPackage("com.android.vending"));
            } catch (ActivityNotFoundException e10) {
                String name = getClass().getName();
                int myUid = Process.myUid();
                int myPid = Process.myPid();
                StringBuilder sb3 = new StringBuilder(39);
                sb3.append("UID: [");
                sb3.append(myUid);
                sb3.append("]  PID: [");
                sb3.append(myPid);
                sb3.append("] ");
                String sb4 = sb3.toString();
                String concat = name.length() != 0 ? sb4.concat(name) : new String(sb4);
                Object[] objArr = {packageName};
                if (Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", u.i(concat, "Couldn't start missing splits activity for %s", objArr), e10);
                }
            }
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (s.b(this)) {
            String charSequence = getApplicationInfo().loadLabel(getPackageManager()).toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(charSequence).length() + 91);
            sb2.append("The app ");
            sb2.append(charSequence);
            sb2.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb2.toString()).setPositiveButton("Reinstall", this);
        } else {
            String charSequence2 = getApplicationInfo().loadLabel(getPackageManager()).toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(charSequence2).length() + 87);
            sb3.append("The app ");
            sb3.append(charSequence2);
            sb3.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb3.toString());
        }
        neutralButton.create().show();
    }
}
