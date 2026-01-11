package p3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import g3.h;
import g3.j;
import i3.w;
import java.io.IOException;

public final class a<DataType> implements j<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final j<DataType, Bitmap> f9570a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f9571b;

    public a(Resources resources, j<DataType, Bitmap> jVar) {
        this.f9571b = resources;
        this.f9570a = jVar;
    }

    public final boolean a(DataType datatype, h hVar) throws IOException {
        return this.f9570a.a(datatype, hVar);
    }

    public final w<BitmapDrawable> b(DataType datatype, int i, int i10, h hVar) throws IOException {
        return u.e(this.f9571b, this.f9570a.b(datatype, i, i10, hVar));
    }
}
