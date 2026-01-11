package vd;

import e6.e;
import ee.d;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedReader f12462a;

    /* renamed from: vd.a$a  reason: collision with other inner class name */
    public static final class C0240a implements Iterator<String>, zd.a {

        /* renamed from: a  reason: collision with root package name */
        public String f12463a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f12464b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f12465c;

        public C0240a(a aVar) {
            this.f12465c = aVar;
        }

        public final boolean hasNext() {
            if (this.f12463a == null && !this.f12464b) {
                String readLine = this.f12465c.f12462a.readLine();
                this.f12463a = readLine;
                if (readLine == null) {
                    this.f12464b = true;
                }
            }
            if (this.f12463a != null) {
                return true;
            }
            return false;
        }

        public final Object next() {
            if (hasNext()) {
                String str = this.f12463a;
                this.f12463a = null;
                e.B(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(BufferedReader bufferedReader) {
        this.f12462a = bufferedReader;
    }

    public final Iterator<String> iterator() {
        return new C0240a(this);
    }
}
