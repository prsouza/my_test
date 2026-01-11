package p0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f9484a;

    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f9486a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f9487b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f9488c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f9486a = uri;
            this.f9487b = clipDescription;
            this.f9488c = uri2;
        }

        public final Object a() {
            return null;
        }

        public final Uri b() {
            return this.f9486a;
        }

        public final void c() {
        }

        public final Uri d() {
            return this.f9488c;
        }

        public final ClipDescription getDescription() {
            return this.f9487b;
        }
    }

    public interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f9484a = new a(uri, clipDescription, uri2);
        } else {
            this.f9484a = new b(uri, clipDescription, uri2);
        }
    }

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f9485a;

        public a(Object obj) {
            this.f9485a = (InputContentInfo) obj;
        }

        public final Object a() {
            return this.f9485a;
        }

        public final Uri b() {
            return this.f9485a.getContentUri();
        }

        public final void c() {
            this.f9485a.requestPermission();
        }

        public final Uri d() {
            return this.f9485a.getLinkUri();
        }

        public final ClipDescription getDescription() {
            return this.f9485a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f9485a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public f(c cVar) {
        this.f9484a = cVar;
    }
}
