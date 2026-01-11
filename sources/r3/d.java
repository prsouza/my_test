package r3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import g3.h;
import g3.j;
import i3.w;
import java.io.IOException;
import java.util.List;

public final class d implements j<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10564a;

    public d(Context context) {
        this.f10564a = context.getApplicationContext();
    }

    public final boolean a(Object obj, h hVar) throws IOException {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    /* renamed from: c */
    public final w<Drawable> b(Uri uri, int i, int i10, h hVar) {
        Context context;
        int i11;
        String authority = uri.getAuthority();
        if (authority.equals(this.f10564a.getPackageName())) {
            context = this.f10564a;
        } else {
            try {
                context = this.f10564a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (authority.contains(this.f10564a.getPackageName())) {
                    context = this.f10564a;
                } else {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            i11 = context.getResources().getIdentifier(str2, str, authority2);
            if (i11 == 0) {
                i11 = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (i11 == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else if (pathSegments.size() == 1) {
            try {
                i11 = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e11);
            }
        } else {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
        }
        Drawable a10 = a.a(this.f10564a, context, i11, (Resources.Theme) null);
        if (a10 != null) {
            return new c(a10);
        }
        return null;
    }
}
