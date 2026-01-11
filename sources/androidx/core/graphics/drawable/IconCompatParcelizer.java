package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Objects;
import r1.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1643a = aVar.k(iconCompat.f1643a, 1);
        byte[] bArr = iconCompat.f1645c;
        if (aVar.i(2)) {
            bArr = aVar.g();
        }
        iconCompat.f1645c = bArr;
        iconCompat.f1646d = aVar.m(iconCompat.f1646d, 3);
        iconCompat.f1647e = aVar.k(iconCompat.f1647e, 4);
        iconCompat.f1648f = aVar.k(iconCompat.f1648f, 5);
        iconCompat.g = (ColorStateList) aVar.m(iconCompat.g, 6);
        String str = iconCompat.i;
        if (aVar.i(7)) {
            str = aVar.n();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f1650j;
        if (aVar.i(8)) {
            str2 = aVar.n();
        }
        iconCompat.f1650j = str2;
        iconCompat.f1649h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1643a) {
            case -1:
                Parcelable parcelable = iconCompat.f1646d;
                if (parcelable != null) {
                    iconCompat.f1644b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1646d;
                if (parcelable2 == null) {
                    byte[] bArr2 = iconCompat.f1645c;
                    iconCompat.f1644b = bArr2;
                    iconCompat.f1643a = 3;
                    iconCompat.f1647e = 0;
                    iconCompat.f1648f = bArr2.length;
                    break;
                } else {
                    iconCompat.f1644b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1645c, Charset.forName("UTF-16"));
                iconCompat.f1644b = str3;
                if (iconCompat.f1643a == 2 && iconCompat.f1650j == null) {
                    iconCompat.f1650j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.f1644b = iconCompat.f1645c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.i = iconCompat.f1649h.name();
        switch (iconCompat.f1643a) {
            case -1:
                iconCompat.f1646d = (Parcelable) iconCompat.f1644b;
                break;
            case 1:
            case 5:
                iconCompat.f1646d = (Parcelable) iconCompat.f1644b;
                break;
            case 2:
                iconCompat.f1645c = ((String) iconCompat.f1644b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1645c = (byte[]) iconCompat.f1644b;
                break;
            case 4:
            case 6:
                iconCompat.f1645c = iconCompat.f1644b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1643a;
        if (-1 != i) {
            aVar.u(i, 1);
        }
        byte[] bArr = iconCompat.f1645c;
        if (bArr != null) {
            aVar.p(2);
            aVar.r(bArr);
        }
        Parcelable parcelable = iconCompat.f1646d;
        if (parcelable != null) {
            aVar.w(parcelable, 3);
        }
        int i10 = iconCompat.f1647e;
        if (i10 != 0) {
            aVar.u(i10, 4);
        }
        int i11 = iconCompat.f1648f;
        if (i11 != 0) {
            aVar.u(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.w(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.p(7);
            aVar.x(str);
        }
        String str2 = iconCompat.f1650j;
        if (str2 != null) {
            aVar.p(8);
            aVar.x(str2);
        }
    }
}
