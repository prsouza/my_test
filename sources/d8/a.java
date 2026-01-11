package d8;

import a8.c;
import h1.b;
import q4.e;
import z7.a0;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final c f4354b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final String f4355c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d  reason: collision with root package name */
    public static final String f4356d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    public static final e<a0, byte[]> f4357e = b.f5656u;

    /* renamed from: a  reason: collision with root package name */
    public final c f4358a;

    public a(c cVar) {
        this.f4358a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb2.append(str.charAt(i));
            if (str2.length() > i) {
                sb2.append(str2.charAt(i));
            }
        }
        return sb2.toString();
    }
}
