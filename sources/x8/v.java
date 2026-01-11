package x8;

import a.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;
import x8.d;

public final class v implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final URL f13138a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Future<?> f13139b;

    /* renamed from: c  reason: collision with root package name */
    public Task<Bitmap> f13140c;

    public v(URL url) {
        this.f13138a = url;
    }

    public final Bitmap a() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            StringBuilder d10 = a.d("Starting download of: ");
            d10.append(this.f13138a);
            Log.i("FirebaseMessaging", d10.toString());
        }
        URLConnection openConnection = this.f13138a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] b10 = d.b(new d.a(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    StringBuilder d11 = a.d("Downloaded ");
                    d11.append(b10.length);
                    d11.append(" bytes from ");
                    d11.append(this.f13138a);
                    Log.v("FirebaseMessaging", d11.toString());
                }
                if (b10.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b10, 0, b10.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            StringBuilder d12 = a.d("Successfully downloaded image: ");
                            d12.append(this.f13138a);
                            Log.d("FirebaseMessaging", d12.toString());
                        }
                        return decodeByteArray;
                    }
                    StringBuilder d13 = a.d("Failed to decode image: ");
                    d13.append(this.f13138a);
                    throw new IOException(d13.toString());
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public final void close() {
        this.f13139b.cancel(true);
    }
}
