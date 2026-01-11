package n0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.github.mikephil.charting.BuildConfig;
import java.util.Locale;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f8779a;

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f8780a;

        public a(ClipData clipData, int i) {
            this.f8780a = new ContentInfo.Builder(clipData, i);
        }

        public final c a() {
            return new c(new d(this.f8780a.build()));
        }

        public final void b(Uri uri) {
            this.f8780a.setLinkUri(uri);
        }

        public final void c(int i) {
            this.f8780a.setFlags(i);
        }

        public final void setExtras(Bundle bundle) {
            this.f8780a.setExtras(bundle);
        }
    }

    public interface b {
        c a();

        void b(Uri uri);

        void c(int i);

        void setExtras(Bundle bundle);
    }

    /* renamed from: n0.c$c  reason: collision with other inner class name */
    public static final class C0162c implements b {

        /* renamed from: a  reason: collision with root package name */
        public ClipData f8781a;

        /* renamed from: b  reason: collision with root package name */
        public int f8782b;

        /* renamed from: c  reason: collision with root package name */
        public int f8783c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f8784d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f8785e;

        public C0162c(ClipData clipData, int i) {
            this.f8781a = clipData;
            this.f8782b = i;
        }

        public final c a() {
            return new c(new f(this));
        }

        public final void b(Uri uri) {
            this.f8784d = uri;
        }

        public final void c(int i) {
            this.f8783c = i;
        }

        public final void setExtras(Bundle bundle) {
            this.f8785e = bundle;
        }
    }

    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f8786a;

        public d(ContentInfo contentInfo) {
            Objects.requireNonNull(contentInfo);
            this.f8786a = contentInfo;
        }

        public final ClipData a() {
            return this.f8786a.getClip();
        }

        public final int b() {
            return this.f8786a.getFlags();
        }

        public final ContentInfo c() {
            return this.f8786a;
        }

        public final int d() {
            return this.f8786a.getSource();
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("ContentInfoCompat{");
            d10.append(this.f8786a);
            d10.append("}");
            return d10.toString();
        }
    }

    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f8787a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8788b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8789c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f8790d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f8791e;

        public f(C0162c cVar) {
            ClipData clipData = cVar.f8781a;
            Objects.requireNonNull(clipData);
            this.f8787a = clipData;
            int i = cVar.f8782b;
            if (i < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{"source", 0, 5}));
            } else if (i <= 5) {
                this.f8788b = i;
                int i10 = cVar.f8783c;
                if ((i10 & 1) == i10) {
                    this.f8789c = i10;
                    this.f8790d = cVar.f8784d;
                    this.f8791e = cVar.f8785e;
                    return;
                }
                StringBuilder d10 = a.a.d("Requested flags 0x");
                d10.append(Integer.toHexString(i10));
                d10.append(", but only 0x");
                d10.append(Integer.toHexString(1));
                d10.append(" are allowed");
                throw new IllegalArgumentException(d10.toString());
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{"source", 0, 5}));
            }
        }

        public final ClipData a() {
            return this.f8787a;
        }

        public final int b() {
            return this.f8789c;
        }

        public final ContentInfo c() {
            return null;
        }

        public final int d() {
            return this.f8788b;
        }

        public final String toString() {
            String str;
            String str2;
            StringBuilder d10 = a.a.d("ContentInfoCompat{clip=");
            d10.append(this.f8787a.getDescription());
            d10.append(", source=");
            int i = this.f8788b;
            d10.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            d10.append(", flags=");
            int i10 = this.f8789c;
            if ((i10 & 1) != 0) {
                str = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                str = String.valueOf(i10);
            }
            d10.append(str);
            Uri uri = this.f8790d;
            String str3 = BuildConfig.FLAVOR;
            if (uri == null) {
                str2 = str3;
            } else {
                StringBuilder d11 = a.a.d(", hasLinkUri(");
                d11.append(this.f8790d.toString().length());
                d11.append(")");
                str2 = d11.toString();
            }
            d10.append(str2);
            if (this.f8791e != null) {
                str3 = ", hasExtras";
            }
            return android.support.v4.media.a.e(d10, str3, "}");
        }
    }

    public c(e eVar) {
        this.f8779a = eVar;
    }

    public final String toString() {
        return this.f8779a.toString();
    }
}
