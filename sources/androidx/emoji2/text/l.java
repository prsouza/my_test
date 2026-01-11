package androidx.emoji2.text;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1751a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1752b;

    public /* synthetic */ l(Object obj, int i) {
        this.f1751a = i;
        this.f1752b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r4 = r0.d();
        r5 = r4.f7381e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r5 != 2) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r3 = r0.f1744d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0029, code lost:
        if (r5 != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5 = j0.i.f6985a;
        android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r3 = r0.f1743c;
        r5 = r0.f1741a;
        java.util.Objects.requireNonNull(r3);
        r1 = g0.e.f5210a.b(r5, new k0.l[]{r4}, 0);
        r2 = g0.l.e(r0.f1741a, r4.f7377a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r2 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r1 == null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
        r3 = new androidx.emoji2.text.o(r1, androidx.emoji2.text.n.a(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        android.os.Trace.endSection();
        r1 = r0.f1744d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2 = r0.f1747h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0068, code lost:
        if (r2 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006a, code lost:
        r2.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0075, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2 = j0.i.f6985a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0083, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0084, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r2 = j0.i.f6985a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x008a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a6, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r5 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00aa, code lost:
        monitor-enter(r0.f1744d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r3 = r0.f1747h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ad, code lost:
        if (r3 != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00af, code lost:
        r3.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b3, code lost:
        r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            int r0 = r6.f1751a
            r1 = 0
            r2 = 1
            r3 = 2
            switch(r0) {
                case 0: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x00bd
        L_0x000a:
            java.lang.Object r0 = r6.f1752b
            androidx.emoji2.text.j$b r0 = (androidx.emoji2.text.j.b) r0
            java.lang.Object r4 = r0.f1744d
            monitor-enter(r4)
            androidx.emoji2.text.d$h r5 = r0.f1747h     // Catch:{ all -> 0x00ba }
            if (r5 != 0) goto L_0x0018
            monitor-exit(r4)     // Catch:{ all -> 0x00ba }
            goto L_0x00b6
        L_0x0018:
            monitor-exit(r4)     // Catch:{ all -> 0x00ba }
            k0.l r4 = r0.d()     // Catch:{ all -> 0x00a7 }
            int r5 = r4.f7381e     // Catch:{ all -> 0x00a7 }
            if (r5 != r3) goto L_0x0029
            java.lang.Object r3 = r0.f1744d     // Catch:{ all -> 0x00a7 }
            monitor-enter(r3)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x0029:
            if (r5 != 0) goto L_0x008b
            java.lang.String r3 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r5 = j0.i.f6985a     // Catch:{ all -> 0x0084 }
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x0084 }
            androidx.emoji2.text.j$a r3 = r0.f1743c     // Catch:{ all -> 0x0084 }
            android.content.Context r5 = r0.f1741a     // Catch:{ all -> 0x0084 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0084 }
            k0.l[] r2 = new k0.l[r2]     // Catch:{ all -> 0x0084 }
            r2[r1] = r4     // Catch:{ all -> 0x0084 }
            g0.k r3 = g0.e.f5210a     // Catch:{ all -> 0x0084 }
            android.graphics.Typeface r1 = r3.b(r5, r2, r1)     // Catch:{ all -> 0x0084 }
            android.content.Context r2 = r0.f1741a     // Catch:{ all -> 0x0084 }
            android.net.Uri r3 = r4.f7377a     // Catch:{ all -> 0x0084 }
            java.nio.ByteBuffer r2 = g0.l.e(r2, r3)     // Catch:{ all -> 0x0084 }
            if (r2 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x0075 }
            androidx.emoji2.text.o r3 = new androidx.emoji2.text.o     // Catch:{ all -> 0x0075 }
            w0.b r2 = androidx.emoji2.text.n.a(r2)     // Catch:{ all -> 0x0075 }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x0075 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0084 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r0.f1744d     // Catch:{ all -> 0x00a7 }
            monitor-enter(r1)     // Catch:{ all -> 0x00a7 }
            androidx.emoji2.text.d$h r2 = r0.f1747h     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x006d
            r2.b(r3)     // Catch:{ all -> 0x0072 }
        L_0x006d:
            monitor-exit(r1)     // Catch:{ all -> 0x0072 }
            r0.b()     // Catch:{ all -> 0x00a7 }
            goto L_0x00b6
        L_0x0072:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0072 }
            throw r2     // Catch:{ all -> 0x00a7 }
        L_0x0075:
            r1 = move-exception
            int r2 = j0.i.f6985a     // Catch:{ all -> 0x0084 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x007c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "Unable to open file."
            r1.<init>(r2)     // Catch:{ all -> 0x0084 }
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            int r2 = j0.i.f6985a     // Catch:{ all -> 0x00a7 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00a7 }
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x008b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r2.<init>()     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "fetchFonts result is not OK. ("
            r2.append(r3)     // Catch:{ all -> 0x00a7 }
            r2.append(r5)     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a7 }
            r1.<init>(r2)     // Catch:{ all -> 0x00a7 }
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            java.lang.Object r2 = r0.f1744d
            monitor-enter(r2)
            androidx.emoji2.text.d$h r3 = r0.f1747h     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x00b2
            r3.a(r1)     // Catch:{ all -> 0x00b7 }
        L_0x00b2:
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            r0.b()
        L_0x00b6:
            return
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b7 }
            throw r0
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ba }
            throw r0
        L_0x00bd:
            java.lang.Object r0 = r6.f1752b
            pb.j r0 = (pb.j) r0
            pb.j$a r4 = pb.j.F
            java.lang.String r4 = "this$0"
            e6.e.D(r0, r4)
            android.content.Context r4 = r0.getContext()
            if (r4 == 0) goto L_0x00d5
            boolean r4 = ad.c.P(r4)
            if (r4 != r2) goto L_0x00d5
            r1 = r2
        L_0x00d5:
            if (r1 == 0) goto L_0x00e8
            com.google.android.gms.location.LocationRequest r1 = r0.f9849u
            if (r1 == 0) goto L_0x00e8
            com.google.android.gms.location.FusedLocationProviderClient r2 = r0.f9848t
            if (r2 == 0) goto L_0x00e8
            pb.j$b r4 = r0.B
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r2.requestLocationUpdates(r1, r4, r5)
        L_0x00e8:
            r1 = 2131231075(0x7f080163, float:1.807822E38)
            android.view.View r0 = r0.b(r1)
            io.nodle.map_marker.MarkerView r0 = (io.nodle.map_marker.MarkerView) r0
            if (r0 == 0) goto L_0x010d
            wb.c r0 = r0.f6847s
            if (r0 == 0) goto L_0x010d
            android.hardware.Sensor r1 = r0.f12648h
            if (r1 == 0) goto L_0x0102
            android.hardware.SensorManager r2 = r0.g
            if (r2 == 0) goto L_0x0102
            r2.registerListener(r0, r1, r3)
        L_0x0102:
            android.hardware.Sensor r1 = r0.i
            if (r1 == 0) goto L_0x010d
            android.hardware.SensorManager r2 = r0.g
            if (r2 == 0) goto L_0x010d
            r2.registerListener(r0, r1, r3)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.l.run():void");
    }
}
