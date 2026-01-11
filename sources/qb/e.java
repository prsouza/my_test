package qb;

import a.b;
import ce.f;
import com.github.mikephil.charting.BuildConfig;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import nd.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<s> f10354a = b.o0(s.DAY, s.WEEK, s.MONTH, s.YEAR);

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10355a;

        static {
            int[] iArr = new int[s.values().length];
            iArr[s.DAY.ordinal()] = 1;
            iArr[s.WEEK.ordinal()] = 2;
            iArr[s.MONTH.ordinal()] = 3;
            iArr[s.YEAR.ordinal()] = 4;
            f10355a = iArr;
        }
    }

    public final List<r> a() {
        Iterator<T> it;
        r rVar;
        List<s> list = this.f10354a;
        ArrayList arrayList = new ArrayList(g.S0(list));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            int i = a.f10355a[((s) it2.next()).ordinal()];
            if (i == 1) {
                it = it2;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMMM d", Locale.getDefault());
                Calendar instance = Calendar.getInstance();
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                Calendar calendar = (Calendar) instance.clone();
                calendar.add(6, 1);
                f fVar = new f(instance.getTimeInMillis(), calendar.getTimeInMillis());
                String format = simpleDateFormat2.format(instance.getTime());
                ArrayList arrayList2 = new ArrayList();
                while (instance.compareTo(calendar) < 0) {
                    String format2 = simpleDateFormat.format(instance.getTime());
                    long timeInMillis = instance.getTimeInMillis();
                    instance.add(11, 4);
                    long timeInMillis2 = instance.getTimeInMillis();
                    e6.e.C(format2, "label");
                    BigInteger bigInteger = BigInteger.ZERO;
                    e6.e.C(bigInteger, "ZERO");
                    arrayList2.add(new q(timeInMillis, timeInMillis2, format2, bigInteger));
                }
                s sVar = s.DAY;
                e6.e.C(format, "dateLabel");
                BigInteger bigInteger2 = BigInteger.ZERO;
                e6.e.C(bigInteger2, "ZERO");
                rVar = new r(sVar, fVar, format, bigInteger2, arrayList2);
            } else if (i == 2) {
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("E", Locale.getDefault());
                SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("E, MMMM d", Locale.getDefault());
                Calendar instance2 = Calendar.getInstance();
                instance2.set(12, 0);
                instance2.set(13, 0);
                instance2.set(14, 0);
                instance2.set(11, 24);
                Calendar calendar2 = (Calendar) instance2.clone();
                calendar2.add(6, -7);
                instance2.add(13, -1);
                it = it2;
                f fVar2 = new f(calendar2.getTimeInMillis(), instance2.getTimeInMillis());
                String format3 = String.format("%s - %s", Arrays.copyOf(new Object[]{simpleDateFormat4.format(calendar2.getTime()), simpleDateFormat4.format(instance2.getTime())}, 2));
                e6.e.C(format3, "format(this, *args)");
                ArrayList arrayList3 = new ArrayList();
                while (calendar2.compareTo(instance2) < 0) {
                    String format4 = simpleDateFormat3.format(calendar2.getTime());
                    long timeInMillis3 = calendar2.getTimeInMillis();
                    calendar2.add(6, 1);
                    long timeInMillis4 = calendar2.getTimeInMillis();
                    e6.e.C(format4, "label");
                    BigInteger bigInteger3 = BigInteger.ZERO;
                    e6.e.C(bigInteger3, "ZERO");
                    arrayList3.add(new q(timeInMillis3, timeInMillis4, format4, bigInteger3));
                }
                s sVar2 = s.WEEK;
                BigInteger bigInteger4 = BigInteger.ZERO;
                e6.e.C(bigInteger4, "ZERO");
                rVar = new r(sVar2, fVar2, format3, bigInteger4, arrayList3);
            } else if (i == 3) {
                SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("MMMM d", Locale.getDefault());
                Calendar instance3 = Calendar.getInstance();
                instance3.set(12, 0);
                instance3.set(13, 0);
                instance3.set(14, 0);
                instance3.set(11, 24);
                Calendar calendar3 = (Calendar) instance3.clone();
                calendar3.add(2, -1);
                instance3.add(13, -1);
                f fVar3 = new f(calendar3.getTimeInMillis(), instance3.getTimeInMillis());
                String format5 = String.format("%s - %s", Arrays.copyOf(new Object[]{simpleDateFormat5.format(calendar3.getTime()), simpleDateFormat5.format(instance3.getTime())}, 2));
                e6.e.C(format5, "format(this, *args)");
                ArrayList arrayList4 = new ArrayList();
                int i10 = 7 - ((instance3.get(6) - calendar3.get(6)) % 7);
                while (calendar3.compareTo(instance3) < 0) {
                    String valueOf = i10 % 7 == 0 ? String.valueOf(calendar3.get(5)) : BuildConfig.FLAVOR;
                    i10++;
                    long timeInMillis5 = calendar3.getTimeInMillis();
                    calendar3.add(6, 1);
                    long timeInMillis6 = calendar3.getTimeInMillis();
                    BigInteger bigInteger5 = BigInteger.ZERO;
                    e6.e.C(bigInteger5, "ZERO");
                    arrayList4.add(new q(timeInMillis5, timeInMillis6, valueOf, bigInteger5));
                }
                s sVar3 = s.MONTH;
                BigInteger bigInteger6 = BigInteger.ZERO;
                e6.e.C(bigInteger6, "ZERO");
                it = it2;
                rVar = new r(sVar3, fVar3, format5, bigInteger6, arrayList4);
            } else if (i == 4) {
                SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat("MMM", Locale.getDefault());
                SimpleDateFormat simpleDateFormat7 = new SimpleDateFormat("MMMM, yyyy", Locale.getDefault());
                Calendar instance4 = Calendar.getInstance();
                instance4.set(14, 0);
                instance4.set(13, 0);
                instance4.set(12, 0);
                instance4.set(11, 0);
                instance4.set(5, 1);
                int i11 = 2;
                instance4.add(2, 1);
                Calendar calendar4 = (Calendar) instance4.clone();
                calendar4.add(2, -12);
                instance4.add(13, -1);
                f fVar4 = new f(calendar4.getTimeInMillis(), instance4.getTimeInMillis());
                String format6 = String.format("%s - %s", Arrays.copyOf(new Object[]{simpleDateFormat7.format(calendar4.getTime()), simpleDateFormat7.format(instance4.getTime())}, 2));
                e6.e.C(format6, "format(this, *args)");
                ArrayList arrayList5 = new ArrayList();
                while (calendar4.compareTo(instance4) < 0) {
                    String format7 = simpleDateFormat6.format(calendar4.getTime());
                    long timeInMillis7 = calendar4.getTimeInMillis();
                    calendar4.add(i11, 1);
                    long timeInMillis8 = calendar4.getTimeInMillis();
                    e6.e.C(format7, "label");
                    BigInteger bigInteger7 = BigInteger.ZERO;
                    e6.e.C(bigInteger7, "ZERO");
                    arrayList5.add(new q(timeInMillis7, timeInMillis8, format7, bigInteger7));
                    i11 = 2;
                }
                s sVar4 = s.YEAR;
                BigInteger bigInteger8 = BigInteger.ZERO;
                e6.e.C(bigInteger8, "ZERO");
                rVar = new r(sVar4, fVar4, format6, bigInteger8, arrayList5);
                it = it2;
            } else {
                throw new md.e();
            }
            arrayList.add(rVar);
            it2 = it;
        }
        return arrayList;
    }
}
