package com.google.gson.internal.bind.util;

import a.a;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);
    private static final String UTC_ID = "UTC";

    private static boolean checkOffset(String str, int i, char c10) {
        return i < str.length() && str.charAt(i) == c10;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb2, int i, int i10) {
        String num = Integer.toString(i);
        for (int length = i10 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b7 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date parse(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            int r3 = r0 + 4
            int r0 = parseInt(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r4 = 45
            boolean r5 = checkOffset(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = parseInt(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            boolean r6 = checkOffset(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = parseInt(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r7 = 84
            boolean r7 = checkOffset(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r11 = 2
            if (r7 == 0) goto L_0x00c1
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = parseInt(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r12 = 58
            boolean r13 = checkOffset(r1, r7, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r13 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r13 = r7 + 2
            int r7 = parseInt(r1, r7, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            boolean r12 = checkOffset(r1, r13, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r12 == 0) goto L_0x0070
            int r13 = r13 + 1
        L_0x0070:
            int r12 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r12 <= r13) goto L_0x00ba
            char r12 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r12 == r10) goto L_0x00ba
            if (r12 == r9) goto L_0x00ba
            if (r12 == r4) goto L_0x00ba
            int r12 = r13 + 2
            int r13 = parseInt(r1, r13, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r14 = 59
            if (r13 <= r14) goto L_0x0090
            r14 = 63
            if (r13 >= r14) goto L_0x0090
            r13 = 59
        L_0x0090:
            r14 = 46
            boolean r14 = checkOffset(r1, r12, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r14 == 0) goto L_0x00b7
            int r12 = r12 + 1
            int r14 = r12 + 1
            int r14 = indexOfNonDigit(r1, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            int r15 = r12 + 3
            int r15 = java.lang.Math.min(r14, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            int r16 = parseInt(r1, r12, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            int r15 = r15 - r12
            if (r15 == r8) goto L_0x00b3
            if (r15 == r11) goto L_0x00b0
            goto L_0x00b5
        L_0x00b0:
            int r16 = r16 * 10
            goto L_0x00b5
        L_0x00b3:
            int r16 = r16 * 100
        L_0x00b5:
            r12 = r14
            goto L_0x00ca
        L_0x00b7:
            r16 = 0
            goto L_0x00ca
        L_0x00ba:
            r11 = 0
            r16 = r11
            r11 = r7
            r7 = r6
            r6 = r13
            goto L_0x00c6
        L_0x00c1:
            r7 = 0
            r11 = 0
            r12 = 0
            r16 = r12
        L_0x00c6:
            r13 = 0
            r12 = r6
            r6 = r7
            r7 = r11
        L_0x00ca:
            r11 = r16
            int r14 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r14 <= r12) goto L_0x01b7
            char r14 = r1.charAt(r12)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r15 = 5
            if (r14 != r10) goto L_0x00de
            java.util.TimeZone r4 = TIMEZONE_UTC     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            int r12 = r12 + r8
            goto L_0x0186
        L_0x00de:
            if (r14 == r9) goto L_0x00ff
            if (r14 != r4) goto L_0x00e3
            goto L_0x00ff
        L_0x00e3:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r3.append(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
        L_0x00ff:
            java.lang.String r4 = r1.substring(r12)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r9 < r15) goto L_0x010a
            goto L_0x011b
        L_0x010a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r4 = "00"
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
        L_0x011b:
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            int r12 = r12 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r9 != 0) goto L_0x0184
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r9 == 0) goto L_0x0131
            goto L_0x0184
        L_0x0131:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r10 = "GMT"
            r9.append(r10)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r10 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            boolean r14 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r14 != 0) goto L_0x0182
            java.lang.String r14 = ":"
            java.lang.String r15 = ""
            java.lang.String r10 = r10.replace(r14, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            boolean r10 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            if (r10 == 0) goto L_0x015f
            goto L_0x0182
        L_0x015f:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r4 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
        L_0x0182:
            r4 = r9
            goto L_0x0186
        L_0x0184:
            java.util.TimeZone r4 = TIMEZONE_UTC     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
        L_0x0186:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r9.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r4 = 0
            r9.setLenient(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r9.set(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            int r3 = r3 - r8
            r0 = 2
            r9.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r0 = 5
            r9.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r0 = 11
            r9.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r0 = 12
            r9.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r0 = 13
            r9.set(r0, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r0 = 14
            r9.set(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            r2.setIndex(r12)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.util.Date r0 = r9.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            return r0
        L_0x01b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01c3, NumberFormatException -> 0x01c1, IllegalArgumentException -> 0x01bf }
        L_0x01bf:
            r0 = move-exception
            goto L_0x01c4
        L_0x01c1:
            r0 = move-exception
            goto L_0x01c4
        L_0x01c3:
            r0 = move-exception
        L_0x01c4:
            if (r1 != 0) goto L_0x01c8
            r1 = 0
            goto L_0x01dc
        L_0x01c8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01dc:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01e8
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0202
        L_0x01e8:
            java.lang.String r3 = "("
            java.lang.StringBuilder r3 = a.a.d(r3)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0202:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i, int i10) throws NumberFormatException {
        int i11;
        int i12;
        if (i < 0 || i10 > str.length() || i > i10) {
            throw new NumberFormatException(str);
        }
        if (i < i10) {
            i12 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i11 = -digit;
            } else {
                StringBuilder d10 = a.d("Invalid number: ");
                d10.append(str.substring(i, i10));
                throw new NumberFormatException(d10.toString());
            }
        } else {
            i11 = 0;
            i12 = i;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int digit2 = Character.digit(str.charAt(i12), 10);
            if (digit2 >= 0) {
                i11 = (i11 * 10) - digit2;
                i12 = i13;
            } else {
                StringBuilder d11 = a.d("Invalid number: ");
                d11.append(str.substring(i, i10));
                throw new NumberFormatException(d11.toString());
            }
        }
        return -i11;
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb2, gregorianCalendar.get(1), 4);
        char c10 = '-';
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        padInt(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        padInt(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(13), 2);
        if (z) {
            sb2.append('.');
            padInt(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            if (offset >= 0) {
                c10 = '+';
            }
            sb2.append(c10);
            padInt(sb2, abs, 2);
            sb2.append(':');
            padInt(sb2, abs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }
}
