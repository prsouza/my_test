package yd;

import de.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.a;
import nd.x;
import xd.c;
import xd.e;
import xd.f;
import xd.g;
import xd.h;
import xd.i;
import xd.j;
import xd.k;
import xd.l;
import xd.m;
import xd.n;
import xd.o;
import xd.p;
import xd.q;
import xd.r;
import xd.s;
import xd.t;
import xd.u;
import xd.v;
import xd.w;

public final class d implements b<Object>, c {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<? extends a<?>>, Integer> f13611b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, String> f13612c;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f13613a;

    static {
        int i = 0;
        List o02 = a.b.o0(xd.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, xd.b.class, c.class, xd.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(nd.g.S0(o02));
        for (Object next : o02) {
            int i10 = i + 1;
            if (i >= 0) {
                arrayList.add(new md.f((Class) next, Integer.valueOf(i)));
                i = i10;
            } else {
                a.b.N0();
                throw null;
            }
        }
        f13611b = x.v0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        e6.e.C(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            e6.e.C(str, "kotlinName");
            sb2.append(fe.o.C1(str));
            sb2.append("CompanionObject");
            String sb3 = sb2.toString();
            hashMap3.put(sb3, str + ".Companion");
        }
        for (Map.Entry next2 : f13611b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(aa.b.P(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), fe.o.C1((String) entry.getValue()));
        }
        f13612c = linkedHashMap;
    }

    public d(Class<?> cls) {
        e6.e.D(cls, "jClass");
        this.f13613a = cls;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String a() {
        String str;
        Class<?> cls = this.f13613a;
        e6.e.D(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return fe.o.B1(simpleName, enclosingMethod.getName() + '$');
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor != null) {
                    return fe.o.B1(simpleName, enclosingConstructor.getName() + '$');
                }
                int l12 = fe.o.l1(simpleName, '$', 0, false, 6);
                if (l12 == -1) {
                    return simpleName;
                }
                String substring = simpleName.substring(l12 + 1, simpleName.length());
                e6.e.C(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) f13612c.get(componentType.getName())) != null) {
                    str2 = a8.a.c(str, "Array");
                }
                if (str2 == null) {
                    return "Array";
                }
            } else {
                String str3 = (String) f13612c.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
        }
        return str2;
    }

    public final Class<?> b() {
        return this.f13613a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && e6.e.r(aa.b.H(this), aa.b.H((b) obj));
    }

    public final int hashCode() {
        return aa.b.H(this).hashCode();
    }

    public final String toString() {
        return this.f13613a.toString() + " (Kotlin reflection is not available)";
    }
}
