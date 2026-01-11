package uf;

import e6.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import nd.b;
import nd.c;

public final class r extends b<i> implements RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    public static final a f11975c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final i[] f11976a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f11977b;

    public static final class a {
        public final void a(long j10, e eVar, int i, List<? extends i> list, int i10, int i11, List<Integer> list2) {
            int i12;
            int i13;
            int i14;
            long j11;
            long j12;
            int i15;
            e eVar2;
            e eVar3 = eVar;
            int i16 = i;
            List<? extends i> list3 = list;
            int i17 = i10;
            int i18 = i11;
            List<Integer> list4 = list2;
            if (i17 < i18) {
                int i19 = i17;
                while (i19 < i18) {
                    if (((i) list3.get(i19)).h() >= i16) {
                        i19++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                i iVar = (i) list.get(i10);
                i iVar2 = (i) list3.get(i18 - 1);
                if (i16 == iVar.h()) {
                    int intValue = list4.get(i17).intValue();
                    int i20 = i17 + 1;
                    i iVar3 = (i) list3.get(i20);
                    i12 = i20;
                    i13 = intValue;
                    iVar = iVar3;
                } else {
                    i12 = i17;
                    i13 = -1;
                }
                if (iVar.l(i16) != iVar2.l(i16)) {
                    int i21 = 1;
                    for (int i22 = i12 + 1; i22 < i18; i22++) {
                        if (((i) list3.get(i22 - 1)).l(i16) != ((i) list3.get(i22)).l(i16)) {
                            i21++;
                        }
                    }
                    long j13 = (long) 4;
                    long j14 = ((long) (i21 * 2)) + (eVar3.f11952b / j13) + j10 + ((long) 2);
                    eVar3.B0(i21);
                    eVar3.B0(i13);
                    for (int i23 = i12; i23 < i18; i23++) {
                        byte l10 = ((i) list3.get(i23)).l(i16);
                        if (i23 == i12 || l10 != ((i) list3.get(i23 - 1)).l(i16)) {
                            eVar3.B0(l10 & 255);
                        }
                    }
                    e eVar4 = new e();
                    while (i12 < i18) {
                        byte l11 = ((i) list3.get(i12)).l(i16);
                        int i24 = i12 + 1;
                        int i25 = i24;
                        while (true) {
                            if (i25 >= i18) {
                                i14 = i18;
                                break;
                            } else if (l11 != ((i) list3.get(i25)).l(i16)) {
                                i14 = i25;
                                break;
                            } else {
                                i25++;
                            }
                        }
                        if (i24 == i14 && i16 + 1 == ((i) list3.get(i12)).h()) {
                            eVar3.B0(list4.get(i12).intValue());
                            i15 = i14;
                            j12 = j13;
                            j11 = j14;
                            eVar2 = eVar4;
                        } else {
                            eVar3.B0(((int) ((eVar4.f11952b / j13) + j14)) * -1);
                            i15 = i14;
                            j11 = j14;
                            eVar2 = eVar4;
                            j12 = j13;
                            a(j14, eVar4, i16 + 1, list, i12, i15, list2);
                        }
                        eVar4 = eVar2;
                        i12 = i15;
                        j13 = j12;
                        j14 = j11;
                    }
                    eVar3.x0(eVar4);
                    return;
                }
                int min = Math.min(iVar.h(), iVar2.h());
                int i26 = i16;
                int i27 = 0;
                while (i26 < min && iVar.l(i26) == iVar2.l(i26)) {
                    i27++;
                    i26++;
                }
                long j15 = (long) 4;
                long j16 = j15;
                long j17 = (eVar3.f11952b / j15) + j10 + ((long) 2) + ((long) i27) + 1;
                eVar3.B0(-i27);
                eVar3.B0(i13);
                int i28 = i16 + i27;
                while (i16 < i28) {
                    eVar3.B0(iVar.l(i16) & 255);
                    i16++;
                }
                if (i12 + 1 == i18) {
                    if (i28 == ((i) list3.get(i12)).h()) {
                        eVar3.B0(list4.get(i12).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                e eVar5 = new e();
                eVar3.B0(((int) ((eVar5.f11952b / j16) + j17)) * -1);
                a(j17, eVar5, i28, list, i12, i11, list2);
                eVar3.x0(eVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final r b(i... iVarArr) {
            int i;
            int i10 = 0;
            if (iVarArr.length == 0) {
                return new r(new i[0], new int[]{0, -1});
            }
            ArrayList arrayList = new ArrayList(new c(iVarArr, false));
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(iVarArr.length);
            for (i iVar : iVarArr) {
                arrayList2.add(-1);
            }
            Object[] array = arrayList2.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Integer[] numArr = (Integer[]) array;
            Integer[] numArr2 = (Integer[]) Arrays.copyOf(numArr, numArr.length);
            e.D(numArr2, "elements");
            ArrayList arrayList3 = numArr2.length == 0 ? new ArrayList() : new ArrayList(new c(numArr2, true));
            int length = iVarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                i iVar2 = iVarArr[i11];
                int i13 = i12 + 1;
                int size = arrayList.size();
                int size2 = arrayList.size();
                if (size < 0) {
                    throw new IllegalArgumentException("fromIndex (" + 0 + ") is greater than toIndex (" + size + ").");
                } else if (size <= size2) {
                    int i14 = size - 1;
                    int i15 = 0;
                    while (true) {
                        if (i15 > i14) {
                            i = -(i15 + 1);
                            break;
                        }
                        i = (i15 + i14) >>> 1;
                        int n10 = jc.b.n((Comparable) arrayList.get(i), iVar2);
                        if (n10 >= 0) {
                            if (n10 <= 0) {
                                break;
                            }
                            i14 = i - 1;
                        } else {
                            i15 = i + 1;
                        }
                    }
                    arrayList3.set(i, Integer.valueOf(i12));
                    i11++;
                    i12 = i13;
                } else {
                    throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                }
            }
            if (((i) arrayList.get(0)).h() > 0) {
                int i16 = 0;
                while (i16 < arrayList.size()) {
                    i iVar3 = (i) arrayList.get(i16);
                    int i17 = i16 + 1;
                    int i18 = i17;
                    while (i18 < arrayList.size()) {
                        i iVar4 = (i) arrayList.get(i18);
                        Objects.requireNonNull(iVar4);
                        e.D(iVar3, "prefix");
                        if (!iVar4.p(iVar3, iVar3.h())) {
                            continue;
                            break;
                        }
                        if (!(iVar4.h() != iVar3.h())) {
                            throw new IllegalArgumentException(("duplicate option: " + iVar4).toString());
                        } else if (((Number) arrayList3.get(i18)).intValue() > ((Number) arrayList3.get(i16)).intValue()) {
                            arrayList.remove(i18);
                            arrayList3.remove(i18);
                        } else {
                            i18++;
                        }
                    }
                    i16 = i17;
                }
                e eVar = new e();
                a(0, eVar, 0, arrayList, 0, arrayList.size(), arrayList3);
                int[] iArr = new int[((int) (eVar.f11952b / ((long) 4)))];
                while (!eVar.J()) {
                    iArr[i10] = eVar.readInt();
                    i10++;
                }
                Object[] copyOf = Arrays.copyOf(iVarArr, iVarArr.length);
                e.C(copyOf, "java.util.Arrays.copyOf(this, size)");
                return new r((i[]) copyOf, iArr);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
        }
    }

    public r(i[] iVarArr, int[] iArr) {
        this.f11976a = iVarArr;
        this.f11977b = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof i) {
            return super.contains((i) obj);
        }
        return false;
    }

    public final int d() {
        return this.f11976a.length;
    }

    public final Object get(int i) {
        return this.f11976a[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof i) {
            return super.indexOf((i) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof i) {
            return super.lastIndexOf((i) obj);
        }
        return -1;
    }
}
