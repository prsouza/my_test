package j1;

import android.database.Cursor;
import androidx.fragment.app.m;
import androidx.fragment.app.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h1.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.slf4j.helpers.MessageFormatter;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f6991a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f6992b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b> f6993c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<C0120d> f6994d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f6995a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6996b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6997c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f6998d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6999e;

        /* renamed from: f  reason: collision with root package name */
        public final String f7000f;
        public final int g;

        public a(String str, String str2, boolean z, int i, String str3, int i10) {
            this.f6995a = str;
            this.f6996b = str2;
            this.f6998d = z;
            this.f6999e = i;
            int i11 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i11 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i11 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i11 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f6997c = i11;
            this.f7000f = str3;
            this.g = i10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0057 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean a(java.lang.String r6, java.lang.String r7) {
            /*
                r0 = 0
                if (r7 != 0) goto L_0x0004
                return r0
            L_0x0004:
                boolean r1 = r6.equals(r7)
                r2 = 1
                if (r1 == 0) goto L_0x000c
                return r2
            L_0x000c:
                int r1 = r6.length()
                if (r1 != 0) goto L_0x0013
                goto L_0x0042
            L_0x0013:
                r1 = r0
                r3 = r1
            L_0x0015:
                int r4 = r6.length()
                if (r1 >= r4) goto L_0x003e
                char r4 = r6.charAt(r1)
                r5 = 40
                if (r1 != 0) goto L_0x0026
                if (r4 == r5) goto L_0x0026
                goto L_0x0042
            L_0x0026:
                if (r4 != r5) goto L_0x002b
                int r3 = r3 + 1
                goto L_0x003b
            L_0x002b:
                r5 = 41
                if (r4 != r5) goto L_0x003b
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x003b
                int r4 = r6.length()
                int r4 = r4 - r2
                if (r1 == r4) goto L_0x003b
                goto L_0x0042
            L_0x003b:
                int r1 = r1 + 1
                goto L_0x0015
            L_0x003e:
                if (r3 != 0) goto L_0x0042
                r1 = r2
                goto L_0x0043
            L_0x0042:
                r1 = r0
            L_0x0043:
                if (r1 == 0) goto L_0x0057
                int r0 = r6.length()
                int r0 = r0 - r2
                java.lang.String r6 = r6.substring(r2, r0)
                java.lang.String r6 = r6.trim()
                boolean r6 = r6.equals(r7)
                return r6
            L_0x0057:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.d.a.a(java.lang.String, java.lang.String):boolean");
        }

        public final boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f6999e != aVar.f6999e || !this.f6995a.equals(aVar.f6995a) || this.f6998d != aVar.f6998d) {
                return false;
            }
            if (this.g == 1 && aVar.g == 2 && (str3 = this.f7000f) != null && !a(str3, aVar.f7000f)) {
                return false;
            }
            if (this.g == 2 && aVar.g == 1 && (str2 = aVar.f7000f) != null && !a(str2, this.f7000f)) {
                return false;
            }
            int i = this.g;
            if (i != 0 && i == aVar.g && ((str = this.f7000f) == null ? aVar.f7000f != null : !a(str, aVar.f7000f))) {
                return false;
            }
            if (this.f6997c == aVar.f6997c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.f6995a.hashCode() * 31) + this.f6997c) * 31) + (this.f6998d ? 1231 : 1237)) * 31) + this.f6999e;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("Column{name='");
            d10.append(this.f6995a);
            d10.append('\'');
            d10.append(", type='");
            d10.append(this.f6996b);
            d10.append('\'');
            d10.append(", affinity='");
            d10.append(this.f6997c);
            d10.append('\'');
            d10.append(", notNull=");
            d10.append(this.f6998d);
            d10.append(", primaryKeyPosition=");
            d10.append(this.f6999e);
            d10.append(", defaultValue='");
            d10.append(this.f7000f);
            d10.append('\'');
            d10.append(MessageFormatter.DELIM_STOP);
            return d10.toString();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f7001a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7002b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7003c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f7004d;

        /* renamed from: e  reason: collision with root package name */
        public final List<String> f7005e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f7001a = str;
            this.f7002b = str2;
            this.f7003c = str3;
            this.f7004d = Collections.unmodifiableList(list);
            this.f7005e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f7001a.equals(bVar.f7001a) && this.f7002b.equals(bVar.f7002b) && this.f7003c.equals(bVar.f7003c) && this.f7004d.equals(bVar.f7004d)) {
                return this.f7005e.equals(bVar.f7005e);
            }
            return false;
        }

        public final int hashCode() {
            int a10 = m.a(this.f7003c, m.a(this.f7002b, this.f7001a.hashCode() * 31, 31), 31);
            return this.f7005e.hashCode() + ((this.f7004d.hashCode() + a10) * 31);
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("ForeignKey{referenceTable='");
            d10.append(this.f7001a);
            d10.append('\'');
            d10.append(", onDelete='");
            d10.append(this.f7002b);
            d10.append('\'');
            d10.append(", onUpdate='");
            d10.append(this.f7003c);
            d10.append('\'');
            d10.append(", columnNames=");
            d10.append(this.f7004d);
            d10.append(", referenceColumnNames=");
            d10.append(this.f7005e);
            d10.append(MessageFormatter.DELIM_STOP);
            return d10.toString();
        }
    }

    public static class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        public final int f7006a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7007b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7008c;

        /* renamed from: s  reason: collision with root package name */
        public final String f7009s;

        public c(int i, int i10, String str, String str2) {
            this.f7006a = i;
            this.f7007b = i10;
            this.f7008c = str;
            this.f7009s = str2;
        }

        public final int compareTo(Object obj) {
            c cVar = (c) obj;
            int i = this.f7006a - cVar.f7006a;
            return i == 0 ? this.f7007b - cVar.f7007b : i;
        }
    }

    /* renamed from: j1.d$d  reason: collision with other inner class name */
    public static final class C0120d {

        /* renamed from: a  reason: collision with root package name */
        public final String f7010a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f7011b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f7012c;

        /* renamed from: d  reason: collision with root package name */
        public final List<String> f7013d;

        public C0120d(String str, boolean z, List<String> list, List<String> list2) {
            this.f7010a = str;
            this.f7011b = z;
            this.f7012c = list;
            this.f7013d = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), r.ASC.name()) : list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0120d)) {
                return false;
            }
            C0120d dVar = (C0120d) obj;
            if (this.f7011b != dVar.f7011b || !this.f7012c.equals(dVar.f7012c) || !this.f7013d.equals(dVar.f7013d)) {
                return false;
            }
            if (this.f7010a.startsWith("index_")) {
                return dVar.f7010a.startsWith("index_");
            }
            return this.f7010a.equals(dVar.f7010a);
        }

        public final int hashCode() {
            int i;
            if (this.f7010a.startsWith("index_")) {
                i = -1184239155;
            } else {
                i = this.f7010a.hashCode();
            }
            int hashCode = this.f7012c.hashCode();
            return this.f7013d.hashCode() + ((hashCode + (((i * 31) + (this.f7011b ? 1 : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("Index{name='");
            d10.append(this.f7010a);
            d10.append('\'');
            d10.append(", unique=");
            d10.append(this.f7011b);
            d10.append(", columns=");
            d10.append(this.f7012c);
            d10.append(", orders=");
            d10.append(this.f7013d);
            d10.append(MessageFormatter.DELIM_STOP);
            return d10.toString();
        }
    }

    public d(String str, Map<String, a> map, Set<b> set, Set<C0120d> set2) {
        Set<C0120d> set3;
        this.f6991a = str;
        this.f6992b = Collections.unmodifiableMap(map);
        this.f6993c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f6994d = set3;
    }

    /* JADX INFO: finally extract failed */
    public static d a(l1.a aVar, String str) {
        int i;
        int i10;
        List<c> list;
        int i11;
        String str2 = str;
        m1.a aVar2 = (m1.a) aVar;
        Cursor o02 = aVar2.o0(o.c("PRAGMA table_info(`", str2, "`)"));
        HashMap hashMap = new HashMap();
        try {
            if (o02.getColumnCount() > 0) {
                int columnIndex = o02.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                int columnIndex2 = o02.getColumnIndex("type");
                int columnIndex3 = o02.getColumnIndex("notnull");
                int columnIndex4 = o02.getColumnIndex("pk");
                int columnIndex5 = o02.getColumnIndex("dflt_value");
                while (o02.moveToNext()) {
                    String string = o02.getString(columnIndex);
                    int i12 = columnIndex;
                    a aVar3 = r12;
                    a aVar4 = new a(string, o02.getString(columnIndex2), o02.getInt(columnIndex3) != 0, o02.getInt(columnIndex4), o02.getString(columnIndex5), 2);
                    hashMap.put(string, aVar3);
                    columnIndex = i12;
                }
            }
            o02.close();
            HashSet hashSet = new HashSet();
            Cursor o03 = aVar2.o0("PRAGMA foreign_key_list(`" + str2 + "`)");
            try {
                int columnIndex6 = o03.getColumnIndex("id");
                int columnIndex7 = o03.getColumnIndex("seq");
                int columnIndex8 = o03.getColumnIndex("table");
                int columnIndex9 = o03.getColumnIndex("on_delete");
                int columnIndex10 = o03.getColumnIndex("on_update");
                List<c> b10 = b(o03);
                int count = o03.getCount();
                int i13 = 0;
                while (i13 < count) {
                    o03.moveToPosition(i13);
                    if (o03.getInt(columnIndex7) != 0) {
                        i = columnIndex6;
                        i11 = columnIndex7;
                        list = b10;
                        i10 = count;
                    } else {
                        int i14 = o03.getInt(columnIndex6);
                        i = columnIndex6;
                        ArrayList arrayList = new ArrayList();
                        i11 = columnIndex7;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) b10).iterator();
                        while (it.hasNext()) {
                            List<c> list2 = b10;
                            c cVar = (c) it.next();
                            int i15 = count;
                            if (cVar.f7006a == i14) {
                                arrayList.add(cVar.f7008c);
                                arrayList2.add(cVar.f7009s);
                            }
                            b10 = list2;
                            count = i15;
                        }
                        list = b10;
                        i10 = count;
                        hashSet.add(new b(o03.getString(columnIndex8), o03.getString(columnIndex9), o03.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i13++;
                    columnIndex6 = i;
                    columnIndex7 = i11;
                    b10 = list;
                    count = i10;
                }
                o03.close();
                Cursor o04 = aVar2.o0("PRAGMA index_list(`" + str2 + "`)");
                try {
                    int columnIndex11 = o04.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndex12 = o04.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                    int columnIndex13 = o04.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1) {
                        if (columnIndex13 != -1) {
                            HashSet hashSet3 = new HashSet();
                            while (o04.moveToNext()) {
                                if ("c".equals(o04.getString(columnIndex12))) {
                                    String string2 = o04.getString(columnIndex11);
                                    boolean z = true;
                                    if (o04.getInt(columnIndex13) != 1) {
                                        z = false;
                                    }
                                    C0120d c10 = c(aVar2, string2, z);
                                    if (c10 != null) {
                                        hashSet3.add(c10);
                                    }
                                }
                            }
                            o04.close();
                            hashSet2 = hashSet3;
                            return new d(str2, hashMap, hashSet, hashSet2);
                        }
                    }
                    return new d(str2, hashMap, hashSet, hashSet2);
                } finally {
                    o04.close();
                }
            } catch (Throwable th2) {
                o03.close();
                throw th2;
            }
        } catch (Throwable th3) {
            o02.close();
            throw th3;
        }
    }

    public static List<c> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static C0120d c(l1.a aVar, String str, boolean z) {
        Cursor o02 = ((m1.a) aVar).o0(o.c("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = o02.getColumnIndex("seqno");
            int columnIndex2 = o02.getColumnIndex("cid");
            int columnIndex3 = o02.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex4 = o02.getColumnIndex("desc");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                if (columnIndex4 != -1) {
                    TreeMap treeMap = new TreeMap();
                    TreeMap treeMap2 = new TreeMap();
                    while (o02.moveToNext()) {
                        if (o02.getInt(columnIndex2) >= 0) {
                            int i = o02.getInt(columnIndex);
                            String string = o02.getString(columnIndex3);
                            String str2 = o02.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                            treeMap.put(Integer.valueOf(i), string);
                            treeMap2.put(Integer.valueOf(i), str2);
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    ArrayList arrayList2 = new ArrayList(treeMap2.size());
                    arrayList2.addAll(treeMap2.values());
                    C0120d dVar = new C0120d(str, z, arrayList, arrayList2);
                    o02.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            o02.close();
        }
    }

    public final boolean equals(Object obj) {
        Set<C0120d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f6991a;
        if (str == null ? dVar.f6991a != null : !str.equals(dVar.f6991a)) {
            return false;
        }
        Map<String, a> map = this.f6992b;
        if (map == null ? dVar.f6992b != null : !map.equals(dVar.f6992b)) {
            return false;
        }
        Set<b> set2 = this.f6993c;
        if (set2 == null ? dVar.f6993c != null : !set2.equals(dVar.f6993c)) {
            return false;
        }
        Set<C0120d> set3 = this.f6994d;
        if (set3 == null || (set = dVar.f6994d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public final int hashCode() {
        String str = this.f6991a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f6992b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f6993c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("TableInfo{name='");
        d10.append(this.f6991a);
        d10.append('\'');
        d10.append(", columns=");
        d10.append(this.f6992b);
        d10.append(", foreignKeys=");
        d10.append(this.f6993c);
        d10.append(", indices=");
        d10.append(this.f6994d);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
