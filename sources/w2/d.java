package w2;

import a3.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import b3.c;
import java.io.IOException;
import o2.l;
import o2.m;
import o2.p;
import r2.a;
import s2.b;

public final class d extends b {
    public final Rect A = new Rect();
    public final Rect B = new Rect();
    public a<ColorFilter, ColorFilter> C;
    public final p2.a z = new p2.a(3);

    public d(l lVar, e eVar) {
        super(lVar, eVar);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        Bitmap s10 = s();
        if (s10 != null) {
            rectF.set(0.0f, 0.0f, g.c() * ((float) s10.getWidth()), g.c() * ((float) s10.getHeight()));
            this.f12568m.mapRect(rectF);
        }
    }

    public final <T> void f(T t10, c cVar) {
        super.f(t10, cVar);
        if (t10 != p.C) {
            return;
        }
        if (cVar == null) {
            this.C = null;
        } else {
            this.C = new r2.p(cVar, null);
        }
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [r2.p, r2.a<android.graphics.ColorFilter, android.graphics.ColorFilter>] */
    public final void j(Canvas canvas, Matrix matrix, int i) {
        Bitmap s10 = s();
        if (s10 != null && !s10.isRecycled()) {
            float c10 = g.c();
            this.z.setAlpha(i);
            ? r72 = this.C;
            if (r72 != 0) {
                this.z.setColorFilter((ColorFilter) r72.f());
            }
            canvas.save();
            canvas.concat(matrix);
            this.A.set(0, 0, s10.getWidth(), s10.getHeight());
            this.B.set(0, 0, (int) (((float) s10.getWidth()) * c10), (int) (((float) s10.getHeight()) * c10));
            canvas.drawBitmap(s10, this.A, this.B, this.z);
            canvas.restore();
        }
    }

    public final Bitmap s() {
        b bVar;
        m mVar;
        String str = this.f12570o.g;
        l lVar = this.f12569n;
        if (lVar.getCallback() == null) {
            bVar = null;
        } else {
            b bVar2 = lVar.f9236y;
            if (bVar2 != null) {
                Drawable.Callback callback = lVar.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                if (!((context == null && bVar2.f10856a == null) || bVar2.f10856a.equals(context))) {
                    lVar.f9236y = null;
                }
            }
            if (lVar.f9236y == null) {
                lVar.f9236y = new b(lVar.getCallback(), lVar.z, lVar.A, lVar.f9228b.f9200d);
            }
            bVar = lVar.f9236y;
        }
        if (bVar == null || (mVar = bVar.f10859d.get(str)) == null) {
            return null;
        }
        Bitmap bitmap = mVar.f9268d;
        if (bitmap != null) {
            return bitmap;
        }
        o2.b bVar3 = bVar.f10858c;
        if (bVar3 != null) {
            Bitmap a10 = bVar3.a();
            if (a10 == null) {
                return a10;
            }
            bVar.a(str, a10);
            return a10;
        }
        String str2 = mVar.f9267c;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(bVar.f10857b)) {
                    Bitmap e10 = g.e(BitmapFactory.decodeStream(bVar.f10856a.getAssets().open(bVar.f10857b + str2), (Rect) null, options), mVar.f9265a, mVar.f9266b);
                    bVar.a(str, e10);
                    return e10;
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException e11) {
                a3.c.c("Unable to open asset.", e11);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                bVar.a(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e12) {
                a3.c.c("data URL did not have correct base64 format.", e12);
                return null;
            }
        }
    }
}
