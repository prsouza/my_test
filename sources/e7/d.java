package e7;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import jc.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f4751a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4752b;

    public d(Context context, String str) throws IOException {
        this.f4752b = str;
        this.f4751a = context.getApplicationContext().getSharedPreferences("APP_PREFS", 0);
    }

    public final byte[] a() throws IOException {
        try {
            String string = this.f4751a.getString(this.f4752b, (String) null);
            if (string != null) {
                return b.o(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.f4752b}));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.f4752b}));
        }
    }
}
