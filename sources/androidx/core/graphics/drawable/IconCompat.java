package androidx.core.graphics.drawable;

import a.a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f1642k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1643a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1644b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1645c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1646d;

    /* renamed from: e  reason: collision with root package name */
    public int f1647e;

    /* renamed from: f  reason: collision with root package name */
    public int f1648f;
    public ColorStateList g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1649h;
    public String i;

    /* renamed from: j  reason: collision with root package name */
    public String f1650j;

    public IconCompat() {
        this.f1643a = -1;
        this.f1645c = null;
        this.f1646d = null;
        this.f1647e = 0;
        this.f1648f = 0;
        this.g = null;
        this.f1649h = f1642k;
        this.i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = (float) min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i10) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1647e = i10;
            if (resources != null) {
                try {
                    iconCompat.f1644b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1644b = str;
            }
            iconCompat.f1650j = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    public static Resources e(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, LZ4Constants.HASH_TABLE_SIZE_64K);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e10);
            return null;
        }
    }

    public final int c() {
        int i10 = this.f1643a;
        if (i10 == -1) {
            int i11 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f1644b;
            if (i11 >= 28) {
                return icon.getResId();
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        } else if (i10 == 2) {
            return this.f1647e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    public final String d() {
        int i10 = this.f1643a;
        if (i10 == -1) {
            int i11 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f1644b;
            if (i11 >= 28) {
                return icon.getResPackage();
            }
            try {
                return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        } else if (i10 != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        } else if (TextUtils.isEmpty(this.f1650j)) {
            return ((String) this.f1644b).split(":", -1)[0];
        } else {
            return this.f1650j;
        }
    }

    public final int f() {
        int i10 = this.f1643a;
        if (i10 != -1) {
            return i10;
        }
        int i11 = Build.VERSION.SDK_INT;
        Icon icon = (Icon) this.f1644b;
        if (i11 >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e10);
            return -1;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e11);
            return -1;
        } catch (NoSuchMethodException e12) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e12);
            return -1;
        }
    }

    public final Uri g() {
        int i10 = this.f1643a;
        if (i10 == -1) {
            int i11 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.f1644b;
            if (i11 >= 28) {
                return icon.getUri();
            }
            try {
                return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        } else if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f1644b);
        } else {
            throw new IllegalStateException("called getUri() on " + this);
        }
    }

    public final InputStream h(Context context) {
        Uri g8 = g();
        String scheme = g8.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(g8);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + g8, e10);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1644b));
            } catch (FileNotFoundException e11) {
                Log.w("IconCompat", "Unable to load image from path: " + g8, e11);
                return null;
            }
        }
    }

    public final Drawable i(Context context) {
        Object obj;
        if (this.f1643a == 2 && (obj = this.f1644b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                } else {
                    String d10 = d();
                    int identifier = e(context, d10).getIdentifier(str4, str3, str5);
                    if (this.f1647e != identifier) {
                        Log.i("IconCompat", "Id has changed for " + d10 + " " + str);
                        this.f1647e = identifier;
                    }
                }
            }
        }
        return j(context).loadDrawable(context);
    }

    public final Icon j(Context context) {
        Icon icon;
        switch (this.f1643a) {
            case -1:
                return (Icon) this.f1644b;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f1644b);
                break;
            case 2:
                icon = Icon.createWithResource(d(), this.f1647e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f1644b, this.f1647e, this.f1648f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f1644b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(a((Bitmap) this.f1644b, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f1644b);
                    break;
                }
            case 6:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    icon = Icon.createWithAdaptiveBitmapContentUri(g());
                    break;
                } else if (context != null) {
                    InputStream h10 = h(context);
                    if (h10 != null) {
                        if (i10 < 26) {
                            icon = Icon.createWithBitmap(a(BitmapFactory.decodeStream(h10), false));
                            break;
                        } else {
                            icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(h10));
                            break;
                        }
                    } else {
                        StringBuilder d10 = a.d("Cannot load adaptive icon from uri: ");
                        d10.append(g());
                        throw new IllegalStateException(d10.toString());
                    }
                } else {
                    StringBuilder d11 = a.d("Context is required to resolve the file uri of the icon: ");
                    d11.append(g());
                    throw new IllegalArgumentException(d11.toString());
                }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f1649h;
        if (mode != f1642k) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    public final String toString() {
        String str;
        if (this.f1643a == -1) {
            return String.valueOf(this.f1644b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1643a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1643a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1644b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1644b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1650j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", new Object[]{Integer.valueOf(c())}));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1647e);
                if (this.f1648f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1648f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1644b);
                break;
        }
        if (this.g != null) {
            sb2.append(" tint=");
            sb2.append(this.g);
        }
        if (this.f1649h != f1642k) {
            sb2.append(" mode=");
            sb2.append(this.f1649h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f1645c = null;
        this.f1646d = null;
        this.f1647e = 0;
        this.f1648f = 0;
        this.g = null;
        this.f1649h = f1642k;
        this.i = null;
        this.f1643a = i10;
    }
}
