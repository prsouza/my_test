package xf;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.api.Api;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Marker;
import yf.b;
import yf.d;
import yf.e;
import yf.f;
import yf.g;
import yf.h;
import yf.i;
import yf.j;
import yf.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final yf.a f13227a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("\"", "\\\"");
        hashMap.put("\\", "\\\\");
        Map<CharSequence, CharSequence> map = d.i;
        b[] bVarArr = {new f(Collections.unmodifiableMap(hashMap)), new f(map), new e(127)};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            b bVar = bVarArr[i];
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("'", "\\'");
        hashMap2.put("\"", "\\\"");
        hashMap2.put("\\", "\\\\");
        hashMap2.put("/", "\\/");
        b[] bVarArr2 = {new f(Collections.unmodifiableMap(hashMap2)), new f(map), new e(127)};
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < 3; i10++) {
            b bVar2 = bVarArr2[i10];
            if (bVar2 != null) {
                arrayList2.add(bVar2);
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("\"", "\\\"");
        hashMap3.put("\\", "\\\\");
        hashMap3.put("/", "\\/");
        b[] bVarArr3 = {new f(Collections.unmodifiableMap(hashMap3)), new f(map), new e(126)};
        ArrayList arrayList3 = new ArrayList();
        for (int i11 = 0; i11 < 3; i11++) {
            b bVar3 = bVarArr3[i11];
            if (bVar3 != null) {
                arrayList3.add(bVar3);
            }
        }
        HashMap hashMap4 = new HashMap();
        hashMap4.put("\u0000", BuildConfig.FLAVOR);
        hashMap4.put("\u0001", BuildConfig.FLAVOR);
        hashMap4.put("\u0002", BuildConfig.FLAVOR);
        hashMap4.put("\u0003", BuildConfig.FLAVOR);
        hashMap4.put("\u0004", BuildConfig.FLAVOR);
        hashMap4.put("\u0005", BuildConfig.FLAVOR);
        hashMap4.put("\u0006", BuildConfig.FLAVOR);
        hashMap4.put("\u0007", BuildConfig.FLAVOR);
        hashMap4.put("\b", BuildConfig.FLAVOR);
        hashMap4.put("\u000b", BuildConfig.FLAVOR);
        hashMap4.put("\f", BuildConfig.FLAVOR);
        hashMap4.put("\u000e", BuildConfig.FLAVOR);
        hashMap4.put("\u000f", BuildConfig.FLAVOR);
        hashMap4.put("\u0010", BuildConfig.FLAVOR);
        hashMap4.put("\u0011", BuildConfig.FLAVOR);
        hashMap4.put("\u0012", BuildConfig.FLAVOR);
        hashMap4.put("\u0013", BuildConfig.FLAVOR);
        hashMap4.put("\u0014", BuildConfig.FLAVOR);
        hashMap4.put("\u0015", BuildConfig.FLAVOR);
        hashMap4.put("\u0016", BuildConfig.FLAVOR);
        hashMap4.put("\u0017", BuildConfig.FLAVOR);
        hashMap4.put("\u0018", BuildConfig.FLAVOR);
        hashMap4.put("\u0019", BuildConfig.FLAVOR);
        hashMap4.put("\u001a", BuildConfig.FLAVOR);
        hashMap4.put("\u001b", BuildConfig.FLAVOR);
        hashMap4.put("\u001c", BuildConfig.FLAVOR);
        hashMap4.put("\u001d", BuildConfig.FLAVOR);
        hashMap4.put("\u001e", BuildConfig.FLAVOR);
        hashMap4.put("\u001f", BuildConfig.FLAVOR);
        hashMap4.put("￾", BuildConfig.FLAVOR);
        hashMap4.put("￿", BuildConfig.FLAVOR);
        Object obj = "'";
        Map<CharSequence, CharSequence> map2 = d.f13639e;
        Map<CharSequence, CharSequence> map3 = d.g;
        Object obj2 = "\\'";
        b[] bVarArr4 = {new f(map2), new f(map3), new f(Collections.unmodifiableMap(hashMap4)), new g(127, 132), new g(134, 159), new k()};
        ArrayList arrayList4 = new ArrayList();
        int i12 = 0;
        for (int i13 = 6; i12 < i13; i13 = 6) {
            b bVar4 = bVarArr4[i12];
            if (bVar4 != null) {
                arrayList4.add(bVar4);
            }
            i12++;
        }
        HashMap hashMap5 = new HashMap();
        hashMap5.put("\u0000", BuildConfig.FLAVOR);
        hashMap5.put("\u000b", "&#11;");
        hashMap5.put("\f", "&#12;");
        hashMap5.put("￾", BuildConfig.FLAVOR);
        hashMap5.put("￿", BuildConfig.FLAVOR);
        b[] bVarArr5 = {new f(map2), new f(map3), new f(Collections.unmodifiableMap(hashMap5)), new g(1, 8), new g(14, 31), new g(127, 132), new g(134, 159), new k()};
        ArrayList arrayList5 = new ArrayList();
        for (int i14 = 0; i14 < 8; i14++) {
            b bVar5 = bVarArr5[i14];
            if (bVar5 != null) {
                arrayList5.add(bVar5);
            }
        }
        Map<CharSequence, CharSequence> map4 = d.f13635a;
        b[] bVarArr6 = {new f(map2), new f(map4)};
        ArrayList arrayList6 = new ArrayList();
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            b bVar6 = bVarArr6[i15];
            if (bVar6 != null) {
                arrayList6.add(bVar6);
            }
            i15++;
        }
        b[] bVarArr7 = {new f(map2), new f(map4), new f(d.f13637c)};
        ArrayList arrayList7 = new ArrayList();
        for (int i17 = 0; i17 < 3; i17++) {
            b bVar7 = bVarArr7[i17];
            if (bVar7 != null) {
                arrayList7.add(bVar7);
            }
        }
        HashMap hashMap6 = new HashMap();
        hashMap6.put("|", "\\|");
        hashMap6.put("&", "\\&");
        hashMap6.put(";", "\\;");
        hashMap6.put("<", "\\<");
        hashMap6.put(">", "\\>");
        hashMap6.put("(", "\\(");
        hashMap6.put(")", "\\)");
        hashMap6.put("$", "\\$");
        hashMap6.put("`", "\\`");
        hashMap6.put("\\", "\\\\");
        hashMap6.put("\"", "\\\"");
        Object obj3 = obj;
        Object obj4 = obj2;
        hashMap6.put(obj3, obj4);
        hashMap6.put(" ", "\\ ");
        hashMap6.put("\t", "\\\t");
        hashMap6.put("\r\n", BuildConfig.FLAVOR);
        hashMap6.put("\n", BuildConfig.FLAVOR);
        hashMap6.put(Marker.ANY_MARKER, "\\*");
        hashMap6.put("?", "\\?");
        hashMap6.put("[", "\\[");
        hashMap6.put("#", "\\#");
        hashMap6.put("~", "\\~");
        hashMap6.put("=", "\\=");
        hashMap6.put("%", "\\%");
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap6);
        if (unmodifiableMap != null) {
            HashMap hashMap7 = new HashMap();
            BitSet bitSet = new BitSet();
            int i18 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i19 = 0;
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                hashMap7.put(((CharSequence) entry.getKey()).toString(), ((CharSequence) entry.getValue()).toString());
                bitSet.set(((CharSequence) entry.getKey()).charAt(0));
                int length = ((CharSequence) entry.getKey()).length();
                if (length < i18) {
                    i18 = length;
                }
                if (length > i19) {
                    i19 = length;
                }
            }
            HashMap hashMap8 = new HashMap();
            hashMap8.put("\\\\", "\\");
            hashMap8.put("\\\"", "\"");
            hashMap8.put(obj4, obj3);
            hashMap8.put("\\", BuildConfig.FLAVOR);
            f13227a = new yf.a(new i(), new j(), new f(d.f13642j), new f(Collections.unmodifiableMap(hashMap8)));
            Map<CharSequence, CharSequence> map5 = d.f13640f;
            Map<CharSequence, CharSequence> map6 = d.f13636b;
            b[] bVarArr8 = {new f(map5), new f(map6), new h(new h.a[0])};
            ArrayList arrayList8 = new ArrayList();
            for (int i20 = 0; i20 < 3; i20++) {
                b bVar8 = bVarArr8[i20];
                if (bVar8 != null) {
                    arrayList8.add(bVar8);
                }
            }
            b[] bVarArr9 = {new f(map5), new f(map6), new f(d.f13638d), new h(new h.a[0])};
            ArrayList arrayList9 = new ArrayList();
            for (int i21 = 0; i21 < 4; i21++) {
                b bVar9 = bVarArr9[i21];
                if (bVar9 != null) {
                    arrayList9.add(bVar9);
                }
            }
            f fVar = new f(map5);
            b[] bVarArr10 = {fVar, new f(d.f13641h), new h(new h.a[0])};
            ArrayList arrayList10 = new ArrayList();
            for (int i22 = 0; i22 < 3; i22++) {
                b bVar10 = bVarArr10[i22];
                if (bVar10 != null) {
                    arrayList10.add(bVar10);
                }
            }
            return;
        }
        throw new InvalidParameterException("lookupMap cannot be null");
    }
}
