package fa;

public final class a implements CharSequence {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f5040a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5041b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5042c;

    /* renamed from: s  reason: collision with root package name */
    public final d f5043s;

    public a(CharSequence charSequence, int i, int i10, d dVar) {
        this.f5040a = charSequence;
        this.f5041b = i;
        this.f5042c = i10;
        this.f5043s = dVar;
    }

    public static CharSequence a(CharSequence charSequence, int i, int i10, d dVar) {
        int length = charSequence.length();
        if (i <= i10 && i >= 0 && i10 <= length) {
            return new a(charSequence, i, i10, dVar);
        }
        throw new StringIndexOutOfBoundsException();
    }

    public final char charAt(int i) {
        if (i >= 0) {
            int i10 = this.f5042c;
            int i11 = this.f5041b;
            if (i < i10 - i11) {
                return this.f5040a.charAt(i + i11);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final int length() {
        return this.f5042c - this.f5041b;
    }

    public final CharSequence subSequence(int i, int i10) {
        if (i == 0 && i10 == this.f5042c - this.f5041b) {
            return this;
        }
        CharSequence charSequence = this.f5040a;
        int i11 = this.f5041b;
        return a(charSequence, i + i11, i11 + i10, this.f5043s);
    }

    public final String toString() {
        return this.f5043s.toString(this);
    }
}
