package i3;

import android.util.Log;
import com.github.mikephil.charting.BuildConfig;
import g3.f;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class r extends Exception {

    /* renamed from: u  reason: collision with root package name */
    public static final StackTraceElement[] f6141u = new StackTraceElement[0];

    /* renamed from: a  reason: collision with root package name */
    public final List<Throwable> f6142a;

    /* renamed from: b  reason: collision with root package name */
    public f f6143b;

    /* renamed from: c  reason: collision with root package name */
    public g3.a f6144c;

    /* renamed from: s  reason: collision with root package name */
    public Class<?> f6145s;

    /* renamed from: t  reason: collision with root package name */
    public String f6146t;

    public r(String str) {
        this(str, Collections.emptyList());
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            a aVar = (a) appendable;
            aVar.append((CharSequence) "Cause (");
            int i10 = i + 1;
            aVar.append((CharSequence) String.valueOf(i10));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th2 = list.get(i);
            if (th2 instanceof r) {
                ((r) th2).f(appendable);
            } else {
                d(th2, appendable);
            }
            i = i10;
        }
    }

    public static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void a(Throwable th2, List<Throwable> list) {
        if (th2 instanceof r) {
            for (Throwable a10 : ((r) th2).f6142a) {
                a(a10, list);
            }
            return;
        }
        list.add(th2);
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder d10 = a.a.d("Root cause (");
            int i10 = i + 1;
            d10.append(i10);
            d10.append(" of ");
            d10.append(size);
            d10.append(")");
            Log.i("Glide", d10.toString(), (Throwable) arrayList.get(i));
            i = i10;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f6142a, new a(appendable));
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f6146t);
        Class<?> cls = this.f6145s;
        String str3 = BuildConfig.FLAVOR;
        if (cls != null) {
            StringBuilder d10 = a.a.d(", ");
            d10.append(this.f6145s);
            str = d10.toString();
        } else {
            str = str3;
        }
        sb2.append(str);
        if (this.f6144c != null) {
            StringBuilder d11 = a.a.d(", ");
            d11.append(this.f6144c);
            str2 = d11.toString();
        } else {
            str2 = str3;
        }
        sb2.append(str2);
        if (this.f6143b != null) {
            StringBuilder d12 = a.a.d(", ");
            d12.append(this.f6143b);
            str3 = d12.toString();
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            sb2.append(10);
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public final void printStackTrace() {
        f(System.err);
    }

    public r(String str, List<Throwable> list) {
        this.f6146t = str;
        setStackTrace(f6141u);
        this.f6142a = list;
    }

    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }

    public static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        public final Appendable f6147a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6148b = true;

        public a(Appendable appendable) {
            this.f6147a = appendable;
        }

        public final Appendable append(char c10) throws IOException {
            boolean z = false;
            if (this.f6148b) {
                this.f6148b = false;
                this.f6147a.append("  ");
            }
            if (c10 == 10) {
                z = true;
            }
            this.f6148b = z;
            this.f6147a.append(c10);
            return this;
        }

        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public final Appendable append(CharSequence charSequence, int i, int i10) throws IOException {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            boolean z = false;
            if (this.f6148b) {
                this.f6148b = false;
                this.f6147a.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i10 - 1) == 10) {
                z = true;
            }
            this.f6148b = z;
            this.f6147a.append(charSequence, i, i10);
            return this;
        }
    }
}
