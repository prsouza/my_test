package o3;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import g3.b;
import g3.g;
import g3.h;
import g3.i;
import g3.j;
import i3.w;
import java.io.IOException;
import p3.l;
import p3.m;
import p3.r;

public abstract class a<T> implements j<ImageDecoder.Source, T> {

    /* renamed from: a  reason: collision with root package name */
    public final r f9304a = r.a();

    /* renamed from: o3.a$a  reason: collision with other inner class name */
    public class C0179a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f9305a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f9306b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f9307c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f9308d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ l f9309e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ i f9310f;

        /* renamed from: o3.a$a$a  reason: collision with other inner class name */
        public class C0180a implements ImageDecoder.OnPartialImageListener {
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C0179a(int i, int i10, boolean z, b bVar, l lVar, i iVar) {
            this.f9305a = i;
            this.f9306b = i10;
            this.f9307c = z;
            this.f9308d = bVar;
            this.f9309e = lVar;
            this.f9310f = iVar;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z = false;
            if (a.this.f9304a.b(this.f9305a, this.f9306b, this.f9307c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f9308d == b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0180a());
            Size size = imageInfo.getSize();
            int i = this.f9305a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i10 = this.f9306b;
            if (i10 == Integer.MIN_VALUE) {
                i10 = size.getHeight();
            }
            float b10 = this.f9309e.b(size.getWidth(), size.getHeight(), i, i10);
            int round = Math.round(((float) size.getWidth()) * b10);
            int round2 = Math.round(((float) size.getHeight()) * b10);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder d10 = a.a.d("Resizing from [");
                d10.append(size.getWidth());
                d10.append("x");
                d10.append(size.getHeight());
                d10.append("] to [");
                d10.append(round);
                d10.append("x");
                d10.append(round2);
                d10.append("] scaleFactor: ");
                d10.append(b10);
                Log.v("ImageDecoder", d10.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                if (this.f9310f == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i11 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, h hVar) throws IOException {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    public abstract w<T> c(ImageDecoder.Source source, int i, int i10, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;

    /* renamed from: d */
    public final w<T> b(ImageDecoder.Source source, int i, int i10, h hVar) throws IOException {
        b bVar = (b) hVar.c(m.f9605f);
        l lVar = (l) hVar.c(l.f9604f);
        g gVar = m.i;
        return c(source, i, i10, new C0179a(i, i10, hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue(), bVar, lVar, (i) hVar.c(m.g)));
    }
}
