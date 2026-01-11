package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.e;
import com.google.android.gms.common.api.Api;
import i3.m;
import j3.c;
import j3.d;
import j3.h;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k3.g;
import k3.i;
import k3.j;
import l3.a;
import v3.l;
import w3.e;

public final class b implements ComponentCallbacks2 {

    /* renamed from: x  reason: collision with root package name */
    public static volatile b f3491x;

    /* renamed from: y  reason: collision with root package name */
    public static volatile boolean f3492y;

    /* renamed from: a  reason: collision with root package name */
    public final c f3493a;

    /* renamed from: b  reason: collision with root package name */
    public final i f3494b;

    /* renamed from: c  reason: collision with root package name */
    public final d f3495c;

    /* renamed from: s  reason: collision with root package name */
    public final h f3496s;

    /* renamed from: t  reason: collision with root package name */
    public final j3.b f3497t;

    /* renamed from: u  reason: collision with root package name */
    public final l f3498u;

    /* renamed from: v  reason: collision with root package name */
    public final v3.c f3499v;

    /* renamed from: w  reason: collision with root package name */
    public final List<j> f3500w = new ArrayList();

    public interface a {
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: p3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: p3.h} */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.util.List<x3.a$a<?>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.List<x3.a$a<?>>, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r27, i3.m r28, k3.i r29, j3.c r30, j3.b r31, v3.l r32, v3.c r33, int r34, com.bumptech.glide.b.a r35, java.util.Map<java.lang.Class<?>, com.bumptech.glide.k<?, ?>> r36, java.util.List<y3.e<java.lang.Object>> r37, com.bumptech.glide.e r38) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r30
            r4 = r31
            java.lang.Class<f3.a> r3 = f3.a.class
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            java.lang.Class<byte[]> r7 = byte[].class
            r26.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1.f3500w = r8
            com.bumptech.glide.f r8 = com.bumptech.glide.f.NORMAL
            r1.f3493a = r2
            r1.f3497t = r4
            r8 = r29
            r1.f3494b = r8
            r8 = r32
            r1.f3498u = r8
            r8 = r33
            r1.f3499v = r8
            android.content.res.Resources r8 = r27.getResources()
            com.bumptech.glide.h r9 = new com.bumptech.glide.h
            r9.<init>()
            r1.f3496s = r9
            p3.k r10 = new p3.k
            r10.<init>()
            x3.b r11 = r9.g
            monitor-enter(r11)
            java.lang.Object r12 = r11.f12764a     // Catch:{ all -> 0x03f8 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x03f8 }
            r12.add(r10)     // Catch:{ all -> 0x03f8 }
            monitor-exit(r11)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 27
            if (r10 < r11) goto L_0x0061
            p3.p r11 = new p3.p
            r11.<init>()
            x3.b r12 = r9.g
            monitor-enter(r12)
            java.lang.Object r13 = r12.f12764a     // Catch:{ all -> 0x005e }
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x005e }
            r13.add(r11)     // Catch:{ all -> 0x005e }
            monitor-exit(r12)
            goto L_0x0061
        L_0x005e:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x0061:
            java.util.List r11 = r9.e()
            t3.a r12 = new t3.a
            r12.<init>(r0, r11, r2, r4)
            p3.b0 r13 = new p3.b0
            p3.b0$g r14 = new p3.b0$g
            r14.<init>()
            r13.<init>(r2, r14)
            p3.m r14 = new p3.m
            java.util.List r15 = r9.e()
            android.util.DisplayMetrics r1 = r8.getDisplayMetrics()
            r14.<init>(r15, r1, r2, r4)
            java.lang.Class<com.bumptech.glide.c$b> r1 = com.bumptech.glide.c.b.class
            r15 = r38
            boolean r1 = r15.a(r1)
            if (r1 == 0) goto L_0x009c
            r1 = 28
            if (r10 < r1) goto L_0x009c
            p3.t r1 = new p3.t
            r1.<init>()
            p3.h r16 = new p3.h
            r16.<init>()
            r15 = r16
            goto L_0x00aa
        L_0x009c:
            p3.g r1 = new p3.g
            r1.<init>(r14)
            r29 = r1
            p3.y r1 = new p3.y
            r1.<init>(r14, r4)
            r15 = r29
        L_0x00aa:
            r16 = r7
            r3.d r7 = new r3.d
            r7.<init>(r0)
            r29 = r10
            m3.t$c r10 = new m3.t$c
            r10.<init>(r8)
            m3.t$d r0 = new m3.t$d
            r0.<init>(r8)
            r17 = r5
            m3.t$b r5 = new m3.t$b
            r5.<init>(r8)
            r32 = r0
            m3.t$a r0 = new m3.t$a
            r0.<init>(r8)
            r33 = r0
            p3.c r0 = new p3.c
            r0.<init>(r4)
            r18 = r6
            u3.a r6 = new u3.a
            r6.<init>()
            r19 = r6
            y.c r6 = new y.c
            r6.<init>()
            r20 = r6
            android.content.ContentResolver r6 = r27.getContentResolver()
            r21 = r6
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            r22 = r5
            m3.c r5 = new m3.c
            r5.<init>()
            r23 = r10
            x3.a r10 = r9.f3527b
            monitor-enter(r10)
            r24 = r7
            java.util.List<x3.a$a<?>> r7 = r10.f12761a     // Catch:{ all -> 0x03f3 }
            r25 = r3
            x3.a$a r3 = new x3.a$a     // Catch:{ all -> 0x03f3 }
            r3.<init>(r6, r5)     // Catch:{ all -> 0x03f3 }
            r7.add(r3)     // Catch:{ all -> 0x03f3 }
            monitor-exit(r10)
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            m3.u r5 = new m3.u
            r5.<init>((j3.b) r4)
            x3.a r6 = r9.f3527b
            monitor-enter(r6)
            java.util.List<x3.a$a<?>> r7 = r6.f12761a     // Catch:{ all -> 0x03ee }
            x3.a$a r10 = new x3.a$a     // Catch:{ all -> 0x03ee }
            r10.<init>(r3, r5)     // Catch:{ all -> 0x03ee }
            r7.add(r10)     // Catch:{ all -> 0x03ee }
            monitor-exit(r6)
            java.lang.String r3 = "Bitmap"
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            r9.d(r3, r5, r6, r15)
            java.lang.String r3 = "Bitmap"
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            r9.d(r3, r5, r6, r1)
            java.lang.String r3 = "Bitmap"
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            p3.v r7 = new p3.v
            r7.<init>(r14)
            r9.d(r3, r5, r6, r7)
            java.lang.String r3 = "Bitmap"
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            r9.d(r3, r5, r6, r13)
            java.lang.String r3 = "Bitmap"
            java.lang.Class<android.content.res.AssetFileDescriptor> r5 = android.content.res.AssetFileDescriptor.class
            java.lang.Class<android.graphics.Bitmap> r6 = android.graphics.Bitmap.class
            p3.b0 r7 = new p3.b0
            p3.b0$c r10 = new p3.b0$c
            r10.<init>()
            r7.<init>(r2, r10)
            r9.d(r3, r5, r6, r7)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            m3.w$a<?> r6 = m3.w.a.f8460a
            r9.c(r3, r5, r6)
            java.lang.String r3 = "Bitmap"
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.Bitmap> r7 = android.graphics.Bitmap.class
            p3.a0 r10 = new p3.a0
            r10.<init>()
            r9.d(r3, r5, r7, r10)
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            r9.a(r3, r0)
            java.lang.String r3 = "BitmapDrawable"
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r7 = android.graphics.drawable.BitmapDrawable.class
            p3.a r10 = new p3.a
            r10.<init>(r8, r15)
            r9.d(r3, r5, r7, r10)
            java.lang.String r3 = "BitmapDrawable"
            java.lang.Class<java.io.InputStream> r5 = java.io.InputStream.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r7 = android.graphics.drawable.BitmapDrawable.class
            p3.a r10 = new p3.a
            r10.<init>(r8, r1)
            r9.d(r3, r5, r7, r10)
            java.lang.String r1 = "BitmapDrawable"
            java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r5 = android.graphics.drawable.BitmapDrawable.class
            p3.a r7 = new p3.a
            r7.<init>(r8, r13)
            r9.d(r1, r3, r5, r7)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            p3.b r3 = new p3.b
            r3.<init>(r2, r0)
            r9.a(r1, r3)
            java.lang.String r0 = "Gif"
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            java.lang.Class<t3.c> r3 = t3.c.class
            t3.i r5 = new t3.i
            r5.<init>(r11, r12, r4)
            r9.d(r0, r1, r3, r5)
            java.lang.String r0 = "Gif"
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<t3.c> r3 = t3.c.class
            r9.d(r0, r1, r3, r12)
            java.lang.Class<t3.c> r0 = t3.c.class
            c3.k r1 = new c3.k
            r1.<init>()
            r9.a(r0, r1)
            r0 = r25
            r9.c(r0, r0, r6)
            java.lang.String r1 = "Bitmap"
            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
            t3.g r5 = new t3.g
            r5.<init>(r2)
            r9.d(r1, r0, r3, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            java.lang.String r3 = "legacy_append"
            r5 = r24
            r9.d(r3, r0, r1, r5)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            p3.x r3 = new p3.x
            r3.<init>(r5, r2)
            java.lang.String r5 = "legacy_append"
            r9.d(r5, r0, r1, r3)
            q3.a$a r0 = new q3.a$a
            r0.<init>()
            r9.g(r0)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            m3.d$b r3 = new m3.d$b
            r3.<init>()
            r9.c(r0, r1, r3)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            m3.f$e r3 = new m3.f$e
            r3.<init>()
            r9.c(r0, r1, r3)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            s3.a r3 = new s3.a
            r3.<init>()
            java.lang.String r5 = "legacy_append"
            r9.d(r5, r0, r1, r3)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            m3.f$b r3 = new m3.f$b
            r3.<init>()
            r9.c(r0, r1, r3)
            java.lang.Class<java.io.File> r0 = java.io.File.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r9.c(r0, r1, r6)
            com.bumptech.glide.load.data.k$a r0 = new com.bumptech.glide.load.data.k$a
            r0.<init>(r4)
            r9.g(r0)
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a
            r0.<init>()
            r9.g(r0)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r3 = r23
            r9.c(r0, r1, r3)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            r5 = r22
            r9.c(r0, r1, r5)
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r7 = r18
            r9.c(r7, r1, r3)
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            r9.c(r7, r1, r5)
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r3 = r32
            r9.c(r7, r1, r3)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            r5 = r33
            r9.c(r0, r1, r5)
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            r9.c(r7, r1, r5)
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r9.c(r0, r1, r3)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            m3.e$c r1 = new m3.e$c
            r1.<init>()
            r3 = r17
            r9.c(r3, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            m3.e$c r5 = new m3.e$c
            r5.<init>()
            r9.c(r0, r1, r5)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            m3.v$c r1 = new m3.v$c
            r1.<init>()
            r9.c(r3, r0, r1)
            java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
            m3.v$b r1 = new m3.v$b
            r1.<init>()
            r9.c(r3, r0, r1)
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
            m3.v$a r1 = new m3.v$a
            r1.<init>()
            r9.c(r3, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            m3.a$c r3 = new m3.a$c
            android.content.res.AssetManager r5 = r27.getAssets()
            r3.<init>(r5)
            r9.c(r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            m3.a$b r3 = new m3.a$b
            android.content.res.AssetManager r5 = r27.getAssets()
            r3.<init>(r5)
            r9.c(r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            n3.b$a r3 = new n3.b$a
            r5 = r27
            r3.<init>(r5)
            r9.c(r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            n3.c$a r3 = new n3.c$a
            r3.<init>(r5)
            r9.c(r0, r1, r3)
            r0 = 29
            r1 = r29
            if (r1 < r0) goto L_0x0304
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            n3.d$c r3 = new n3.d$c
            r3.<init>(r5)
            r9.c(r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            n3.d$b r3 = new n3.d$b
            r3.<init>(r5)
            r9.c(r0, r1, r3)
        L_0x0304:
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            m3.x$d r3 = new m3.x$d
            r7 = r21
            r3.<init>(r7)
            r9.c(r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.os.ParcelFileDescriptor> r1 = android.os.ParcelFileDescriptor.class
            m3.x$b r3 = new m3.x$b
            r3.<init>(r7)
            r9.c(r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.content.res.AssetFileDescriptor> r1 = android.content.res.AssetFileDescriptor.class
            m3.x$a r3 = new m3.x$a
            r3.<init>(r7)
            r9.c(r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            m3.y$a r3 = new m3.y$a
            r3.<init>()
            r9.c(r0, r1, r3)
            java.lang.Class<java.net.URL> r0 = java.net.URL.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            n3.e$a r3 = new n3.e$a
            r3.<init>()
            r9.c(r0, r1, r3)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<java.io.File> r1 = java.io.File.class
            m3.k$a r3 = new m3.k$a
            r3.<init>(r5)
            r9.c(r0, r1, r3)
            java.lang.Class<m3.g> r0 = m3.g.class
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            n3.a$a r3 = new n3.a$a
            r3.<init>()
            r9.c(r0, r1, r3)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            m3.b$a r1 = new m3.b$a
            r1.<init>()
            r3 = r16
            r9.c(r3, r0, r1)
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            m3.b$d r1 = new m3.b$d
            r1.<init>()
            r9.c(r3, r0, r1)
            java.lang.Class<android.net.Uri> r0 = android.net.Uri.class
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r9.c(r0, r1, r6)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r9.c(r0, r1, r6)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r3.e r6 = new r3.e
            r6.<init>()
            java.lang.String r7 = "legacy_append"
            r9.d(r7, r0, r1, r6)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            m3.u r6 = new m3.u
            r6.<init>((android.content.res.Resources) r8)
            r9.h(r0, r1, r6)
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            r1 = r19
            r9.h(r0, r3, r1)
            java.lang.Class<android.graphics.drawable.Drawable> r0 = android.graphics.drawable.Drawable.class
            u3.b r6 = new u3.b
            r7 = r20
            r6.<init>(r2, r1, r7)
            r9.h(r0, r3, r6)
            java.lang.Class<t3.c> r0 = t3.c.class
            r9.h(r0, r3, r7)
            p3.b0 r0 = new p3.b0
            p3.b0$d r1 = new p3.b0$d
            r1.<init>()
            r0.<init>(r2, r1)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            r9.b(r1, r2, r0)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r2 = android.graphics.drawable.BitmapDrawable.class
            p3.a r3 = new p3.a
            r3.<init>(r8, r0)
            r9.b(r1, r2, r3)
            z3.f r6 = new z3.f
            r6.<init>()
            com.bumptech.glide.d r0 = new com.bumptech.glide.d
            r2 = r0
            r3 = r27
            r4 = r31
            r5 = r9
            r7 = r35
            r8 = r36
            r9 = r37
            r10 = r28
            r11 = r38
            r12 = r34
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = r26
            r1.f3495c = r0
            return
        L_0x03ee:
            r0 = move-exception
            r1 = r26
            monitor-exit(r6)
            throw r0
        L_0x03f3:
            r0 = move-exception
            r1 = r26
            monitor-exit(r10)
            throw r0
        L_0x03f8:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.<init>(android.content.Context, i3.m, k3.i, j3.c, j3.b, v3.l, v3.c, int, com.bumptech.glide.b$a, java.util.Map, java.util.List, com.bumptech.glide.e):void");
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f3492y) {
            f3492y = true;
            c cVar = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String next : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                            arrayList.add(e.a(next));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + next);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                    Set<Class<?>> c10 = generatedAppGlideModule.c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        w3.c cVar2 = (w3.c) it.next();
                        if (c10.contains(cVar2.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar2);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        StringBuilder d10 = a.a.d("Discovered GlideModule from manifest: ");
                        d10.append(((w3.c) it2.next()).getClass());
                        Log.d("Glide", d10.toString());
                    }
                }
                cVar.f3512n = null;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((w3.c) it3.next()).a(applicationContext, cVar);
                }
                if (cVar.g == null) {
                    int a10 = l3.a.a();
                    if (!TextUtils.isEmpty("source")) {
                        cVar.g = new l3.a(new ThreadPoolExecutor(a10, a10, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0142a("source", false)));
                    } else {
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
                    }
                }
                if (cVar.f3507h == null) {
                    int i = l3.a.f7766c;
                    if (!TextUtils.isEmpty("disk-cache")) {
                        cVar.f3507h = new l3.a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0142a("disk-cache", true)));
                    } else {
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                    }
                }
                if (cVar.f3513o == null) {
                    int i10 = l3.a.a() >= 4 ? 2 : 1;
                    if (!TextUtils.isEmpty("animation")) {
                        cVar.f3513o = new l3.a(new ThreadPoolExecutor(i10, i10, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0142a("animation", true)));
                    } else {
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                }
                if (cVar.f3508j == null) {
                    cVar.f3508j = new j(new j.a(applicationContext));
                }
                if (cVar.f3509k == null) {
                    cVar.f3509k = new v3.e();
                }
                if (cVar.f3504d == null) {
                    int i11 = cVar.f3508j.f7418a;
                    if (i11 > 0) {
                        cVar.f3504d = new j3.i((long) i11);
                    } else {
                        cVar.f3504d = new d();
                    }
                }
                if (cVar.f3505e == null) {
                    cVar.f3505e = new h(cVar.f3508j.f7421d);
                }
                if (cVar.f3506f == null) {
                    cVar.f3506f = new k3.h((long) cVar.f3508j.f7419b);
                }
                if (cVar.i == null) {
                    cVar.i = new g(applicationContext);
                }
                if (cVar.f3503c == null) {
                    cVar.f3503c = new m(cVar.f3506f, cVar.i, cVar.f3507h, cVar.g, new l3.a(new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, l3.a.f7765b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.C0142a("source-unlimited", false))), cVar.f3513o);
                }
                List<y3.e<Object>> list = cVar.f3514p;
                if (list == null) {
                    cVar.f3514p = Collections.emptyList();
                } else {
                    cVar.f3514p = Collections.unmodifiableList(list);
                }
                e.a aVar = cVar.f3502b;
                Objects.requireNonNull(aVar);
                e eVar = new e(aVar);
                b bVar = new b(applicationContext, cVar.f3503c, cVar.f3506f, cVar.f3504d, cVar.f3505e, new l(cVar.f3512n, eVar), cVar.f3509k, cVar.f3510l, cVar.f3511m, cVar.f3501a, cVar.f3514p, eVar);
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    w3.c cVar3 = (w3.c) it4.next();
                    try {
                        cVar3.b(applicationContext, bVar, bVar.f3496s);
                    } catch (AbstractMethodError e10) {
                        StringBuilder d11 = a.a.d("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                        d11.append(cVar3.getClass().getName());
                        throw new IllegalStateException(d11.toString(), e10);
                    }
                }
                applicationContext.registerComponentCallbacks(bVar);
                f3491x = bVar;
                f3492y = false;
            } catch (PackageManager.NameNotFoundException e11) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e11);
            }
        } else {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
    }

    public static b b(Context context) {
        if (f3491x == null) {
            Context applicationContext = context.getApplicationContext();
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (InstantiationException e10) {
                c(e10);
                throw null;
            } catch (IllegalAccessException e11) {
                c(e11);
                throw null;
            } catch (NoSuchMethodException e12) {
                c(e12);
                throw null;
            } catch (InvocationTargetException e13) {
                c(e13);
                throw null;
            }
            synchronized (b.class) {
                if (f3491x == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f3491x;
    }

    public static void c(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static j e(Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f3498u.b(context);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<com.bumptech.glide.j>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List<com.bumptech.glide.j>, java.util.ArrayList] */
    public final void d(j jVar) {
        synchronized (this.f3500w) {
            if (this.f3500w.contains(jVar)) {
                this.f3500w.remove(jVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        c4.j.a();
        ((c4.g) this.f3494b).e(0);
        this.f3493a.b();
        this.f3497t.b();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<com.bumptech.glide.j>, java.util.ArrayList] */
    public final void onTrimMemory(int i) {
        long j10;
        c4.j.a();
        synchronized (this.f3500w) {
            Iterator it = this.f3500w.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull((j) it.next());
            }
        }
        k3.h hVar = (k3.h) this.f3494b;
        Objects.requireNonNull(hVar);
        if (i >= 40) {
            hVar.e(0);
        } else if (i >= 20 || i == 15) {
            synchronized (hVar) {
                j10 = hVar.f3236b;
            }
            hVar.e(j10 / 2);
        }
        this.f3493a.a(i);
        this.f3497t.a(i);
    }
}
