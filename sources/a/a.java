package a;

import com.google.android.gms.measurement.internal.zzgi;

public final /* synthetic */ class a {
    public static float a(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static long b(long j10, long j11, int i, long j12) {
        return Long.rotateLeft(j10 * j11, i) * j12;
    }

    public static StringBuffer c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return stringBuffer;
    }

    public static StringBuilder d(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static void e(zzgi zzgi, String str) {
        zzgi.zzaz().zzd().zza(str);
    }
}
