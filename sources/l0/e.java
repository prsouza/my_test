package l0;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f7752a = new d((b) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f7753b = new d((b) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final d f7754c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f7755d;

    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7756a = new a();

        public final int a(CharSequence charSequence, int i) {
            int i10 = i + 0;
            int i11 = 2;
            for (int i12 = 0; i12 < i10 && i11 == 2; i12++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i12));
                d dVar = e.f7752a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i11 = 2;
                                break;
                        }
                    }
                    i11 = 0;
                }
                i11 = 1;
            }
            return i11;
        }
    }

    public interface b {
        int a(CharSequence charSequence, int i);
    }

    public static abstract class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public final b f7757a;

        public c(b bVar) {
            this.f7757a = bVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f7757a;
            if (bVar == null) {
                return a();
            }
            int a10 = bVar.a(charSequence, i);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return a();
            }
            return false;
        }
    }

    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7758b;

        public d(b bVar, boolean z) {
            super(bVar);
            this.f7758b = z;
        }

        public final boolean a() {
            return this.f7758b;
        }
    }

    static {
        a aVar = a.f7756a;
        f7754c = new d(aVar, false);
        f7755d = new d(aVar, true);
    }
}
