package nb;

import android.text.Editable;
import android.text.TextWatcher;
import io.nodle.cash.ui.viewmodel.WalletBackupViewModel;
import java.util.HashMap;

public final class c implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f8940a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8941b;

    public c(b bVar, int i) {
        this.f8940a = bVar;
        this.f8941b = i;
    }

    public final void afterTextChanged(Editable editable) {
        HashMap<Integer, String> hashMap;
        WalletBackupViewModel walletBackupViewModel = this.f8940a.f8938a;
        if (walletBackupViewModel != null && (hashMap = walletBackupViewModel.f6831y) != null) {
            hashMap.put(Integer.valueOf(this.f8941b), String.valueOf(editable));
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }
}
