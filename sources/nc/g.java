package nc;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import fe.k;
import fe.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import mc.a;
import qc.d;
import rc.h;
import xd.l;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final g f8951a = new g();

    public final qc.a<?, ?> a(String str, String str2, l<? super String, d> lVar) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(str2, "typeDef");
        int i = 0;
        if (!k.d1(str2, "(", false)) {
            return null;
        }
        Pattern compile = Pattern.compile("\\s");
        e.C(compile, "compile(pattern)");
        String replaceAll = compile.matcher(str2).replaceAll(BuildConfig.FLAVOR);
        e.C(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        String u12 = o.u1(replaceAll, "(", ")");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i < u12.length()) {
            char charAt = u12.charAt(i);
            int i13 = i11 + 1;
            if (charAt != '(') {
                if (charAt != ')') {
                    if (charAt != ',') {
                        if (charAt != '<') {
                            if (charAt != '>') {
                                if (charAt != '[') {
                                    if (charAt != ']') {
                                    }
                                }
                            }
                        }
                    } else if (i12 == 0) {
                        String substring = u12.substring(i10, i11);
                        e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        arrayList.add(substring);
                        i10 = i13;
                    }
                    i++;
                    i11 = i13;
                }
                i12--;
                i++;
                i11 = i13;
            }
            i12++;
            i++;
            i11 = i13;
        }
        if (i10 < u12.length()) {
            String substring2 = u12.substring(i10, u12.length());
            e.C(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring2);
        }
        ArrayList arrayList2 = new ArrayList(nd.g.S0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(lVar.k(it.next()));
        }
        return new h(str, arrayList2);
    }
}
