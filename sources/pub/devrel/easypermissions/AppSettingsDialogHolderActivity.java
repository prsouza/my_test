package pub.devrel.easypermissions;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.app.c;
import b9.m;
import java.util.Objects;

public class AppSettingsDialogHolderActivity extends c implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public b f10073b;

    /* renamed from: c  reason: collision with root package name */
    public int f10074c;

    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        setResult(i10, intent);
        finish();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), (String) null));
            data.addFlags(this.f10074c);
            startActivityForResult(data, 7534);
        } else if (i == -2) {
            setResult(0);
            finish();
        } else {
            throw new IllegalStateException(m.b("Unknown button type: ", i));
        }
    }

    public final void onCreate(Bundle bundle) {
        b.a aVar;
        super.onCreate(bundle);
        ei.b bVar = (ei.b) getIntent().getParcelableExtra("extra_app_settings");
        Objects.requireNonNull(bVar);
        this.f10074c = bVar.f4847v;
        int i = bVar.f4841a;
        if (i != -1) {
            aVar = new b.a(this, i);
        } else {
            aVar = new b.a(this);
        }
        AlertController.b bVar2 = aVar.f861a;
        bVar2.f851k = false;
        bVar2.f846d = bVar.f4843c;
        bVar2.f848f = bVar.f4842b;
        bVar2.g = bVar.f4844s;
        bVar2.f849h = this;
        bVar2.i = bVar.f4845t;
        bVar2.f850j = this;
        b a10 = aVar.a();
        a10.show();
        this.f10073b = a10;
    }

    public final void onDestroy() {
        super.onDestroy();
        b bVar = this.f10073b;
        if (bVar != null && bVar.isShowing()) {
            this.f10073b.dismiss();
        }
    }
}
