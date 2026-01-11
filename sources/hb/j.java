package hb;

import android.content.DialogInterface;
import android.content.Intent;
import e6.e;
import io.nodle.cash.ui.view.activity.LauncherActivity;

public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LauncherActivity f5921a;

    public /* synthetic */ j(LauncherActivity launcherActivity) {
        this.f5921a = launcherActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LauncherActivity launcherActivity = this.f5921a;
        int i10 = LauncherActivity.A;
        e.D(launcherActivity, "this$0");
        Intent intent = launcherActivity.getIntent();
        intent.putExtra("nodlepk", launcherActivity.k().f6793u);
        launcherActivity.setResult(-1, intent);
        launcherActivity.finish();
    }
}
