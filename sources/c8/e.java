package c8;

import a8.c;
import android.util.Log;
import com.github.mikephil.charting.BuildConfig;
import e8.f;
import e8.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import k8.d;
import z7.a0;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f3261d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public static final int f3262e = 15;

    /* renamed from: f  reason: collision with root package name */
    public static final c f3263f = new c();
    public static final Comparator<? super File> g = c.f3259a;

    /* renamed from: h  reason: collision with root package name */
    public static final a f3264h = a.f3257a;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f3265a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final f f3266b;

    /* renamed from: c  reason: collision with root package name */
    public final i f3267c;

    public e(f fVar, i iVar) {
        this.f3266b = fVar;
        this.f3267c = iVar;
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[LZ4Constants.HASH_TABLE_SIZE_64K];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f3261d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        throw th;
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f3261d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public final void a(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    public final List<File> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f3266b.c());
        arrayList.addAll(this.f3266b.b());
        Comparator<? super File> comparator = g;
        Collections.sort(arrayList, comparator);
        List<File> d10 = this.f3266b.d();
        Collections.sort(d10, comparator);
        arrayList.addAll(d10);
        return arrayList;
    }

    public final SortedSet<String> c() {
        return new TreeSet(f.i(this.f3266b.f3269b.list())).descendingSet();
    }

    public final void d(a0.e.d dVar, String str, boolean z) {
        int i = ((f) this.f3267c).b().f4757a.f4765a;
        Objects.requireNonNull(f3263f);
        d dVar2 = c.f169a;
        Objects.requireNonNull(dVar2);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar2.a(dVar, stringWriter);
        } catch (IOException unused) {
        }
        try {
            f(this.f3266b.f(str, "event" + String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(this.f3265a.getAndIncrement())}) + (z ? "_" : BuildConfig.FLAVOR)), stringWriter.toString());
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        List<File> i10 = f.i(this.f3266b.e(str).listFiles(b.f3258a));
        Collections.sort(i10, d.f3260a);
        int size = i10.size();
        for (File file : i10) {
            if (size > i) {
                f.h(file);
                size--;
            } else {
                return;
            }
        }
    }
}
