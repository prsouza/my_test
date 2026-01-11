package m0;

public class d<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f8364a;

    /* renamed from: b  reason: collision with root package name */
    public int f8365b;

    public d(int i) {
        if (i > 0) {
            this.f8364a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public boolean a(T t10) {
        int i;
        boolean z;
        int i10 = 0;
        while (true) {
            i = this.f8365b;
            if (i10 >= i) {
                z = false;
                break;
            } else if (this.f8364a[i10] == t10) {
                z = true;
                break;
            } else {
                i10++;
            }
        }
        if (!z) {
            Object[] objArr = this.f8364a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t10;
            this.f8365b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public T b() {
        int i = this.f8365b;
        if (i <= 0) {
            return null;
        }
        int i10 = i - 1;
        T[] tArr = this.f8364a;
        T t10 = tArr[i10];
        tArr[i10] = null;
        this.f8365b = i - 1;
        return t10;
    }
}
