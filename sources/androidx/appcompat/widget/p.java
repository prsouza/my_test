package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import io.nodle.cash.R;
import java.util.Objects;

public class p extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public final f f1362a;

    /* renamed from: b  reason: collision with root package name */
    public final q f1363b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1364c;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f1362a;
        if (fVar != null) {
            fVar.a();
        }
        q qVar = this.f1363b;
        if (qVar != null) {
            qVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1362a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1362a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        b1 b1Var;
        q qVar = this.f1363b;
        if (qVar == null || (b1Var = qVar.f1367b) == null) {
            return null;
        }
        return b1Var.f1175a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        b1 b1Var;
        q qVar = this.f1363b;
        if (qVar == null || (b1Var = qVar.f1367b) == null) {
            return null;
        }
        return b1Var.f1176b;
    }

    public final boolean hasOverlappingRendering() {
        if (!(!(this.f1363b.f1366a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1362a;
        if (fVar != null) {
            fVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f1362a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        q qVar = this.f1363b;
        if (qVar != null) {
            qVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        q qVar = this.f1363b;
        if (!(qVar == null || drawable == null || this.f1364c)) {
            Objects.requireNonNull(qVar);
            qVar.f1368c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        q qVar2 = this.f1363b;
        if (qVar2 != null) {
            qVar2.a();
            if (!this.f1364c) {
                q qVar3 = this.f1363b;
                if (qVar3.f1366a.getDrawable() != null) {
                    qVar3.f1366a.getDrawable().setLevel(qVar3.f1368c);
                }
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1364c = true;
    }

    public void setImageResource(int i) {
        this.f1363b.c(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        q qVar = this.f1363b;
        if (qVar != null) {
            qVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1362a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1362a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        q qVar = this.f1363b;
        if (qVar != null) {
            qVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1363b;
        if (qVar != null) {
            qVar.e(mode);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        this.f1364c = false;
        y0.a(this, getContext());
        f fVar = new f(this);
        this.f1362a = fVar;
        fVar.d(attributeSet, i);
        q qVar = new q(this);
        this.f1363b = qVar;
        qVar.b(attributeSet, i);
    }
}
