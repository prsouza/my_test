package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@KeepForSdk
public final class DynamiteModule {
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    public static final VersionPolicy zza = new zzl();
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static final ThreadLocal<zzn> zzf = new ThreadLocal<>();
    private static final ThreadLocal<Long> zzg = new zzd();
    private static final VersionPolicy.IVersions zzh = new zze();
    private static zzq zzj;
    private static zzr zzk;
    private final Context zzi;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzp) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th2, zzp zzp) {
            super(str, th2);
        }
    }

    public interface VersionPolicy {

        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        public static class SelectionResult {
            @KeepForSdk
            public int localVersion = 0;
            @KeepForSdk
            public int remoteVersion = 0;
            @KeepForSdk
            public int selection = 0;
        }

        @KeepForSdk
        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzi = context;
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".");
            sb2.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb3.append("Module descriptor id '");
            sb3.append(valueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        String str2;
        int i;
        Boolean bool;
        DynamiteModule dynamiteModule;
        IObjectWrapper iObjectWrapper;
        zzr zzr;
        Boolean valueOf;
        IObjectWrapper iObjectWrapper2;
        Context context2 = context;
        VersionPolicy versionPolicy2 = versionPolicy;
        String str3 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal<zzn> threadLocal = zzf;
        zzn zzn = threadLocal.get();
        zzn zzn2 = new zzn((zzm) null);
        threadLocal.set(zzn2);
        ThreadLocal<Long> threadLocal2 = zzg;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectModule = versionPolicy2.selectModule(context2, str3, zzh);
            int i10 = selectModule.localVersion;
            int i11 = selectModule.remoteVersion;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb2.append("Considering local module ");
            sb2.append(str3);
            sb2.append(":");
            sb2.append(i10);
            sb2.append(" and remote module ");
            sb2.append(str3);
            sb2.append(":");
            sb2.append(i11);
            Log.i("DynamiteModule", sb2.toString());
            int i12 = selectModule.selection;
            if (i12 != 0) {
                if (i12 == -1) {
                    if (selectModule.localVersion != 0) {
                        i12 = -1;
                    }
                }
                if (!(i12 == 1 && selectModule.remoteVersion == 0)) {
                    if (i12 == -1) {
                        DynamiteModule zzc2 = zzc(context2, str3);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = zzn2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zzn);
                        return zzc2;
                    } else if (i12 == 1) {
                        try {
                            int i13 = selectModule.remoteVersion;
                            try {
                                synchronized (cls) {
                                    bool = zzb;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str3);
                                        sb3.append(", version >= ");
                                        sb3.append(i13);
                                        Log.i("DynamiteModule", sb3.toString());
                                        synchronized (cls) {
                                            zzr = zzk;
                                        }
                                        if (zzr != null) {
                                            zzn zzn3 = threadLocal.get();
                                            if (zzn3 == null || zzn3.zza == null) {
                                                throw new LoadingException("No result cursor", (zzp) null);
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = zzn3.zza;
                                            ObjectWrapper.wrap(null);
                                            synchronized (cls) {
                                                valueOf = Boolean.valueOf(zze >= 2);
                                            }
                                            if (valueOf.booleanValue()) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                iObjectWrapper2 = zzr.zzf(ObjectWrapper.wrap(applicationContext), str3, i13, ObjectWrapper.wrap(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                iObjectWrapper2 = zzr.zze(ObjectWrapper.wrap(applicationContext), str3, i13, ObjectWrapper.wrap(cursor2));
                                            }
                                            Context context3 = (Context) ObjectWrapper.unwrap(iObjectWrapper2);
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new LoadingException("Failed to get module context", (zzp) null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", (zzp) null);
                                        }
                                    } else {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                                        sb4.append("Selected remote version of ");
                                        sb4.append(str3);
                                        sb4.append(", version >= ");
                                        sb4.append(i13);
                                        Log.i("DynamiteModule", sb4.toString());
                                        zzq zzf2 = zzf(context);
                                        if (zzf2 != null) {
                                            int zze2 = zzf2.zze();
                                            if (zze2 >= 3) {
                                                zzn zzn4 = threadLocal.get();
                                                if (zzn4 != null) {
                                                    iObjectWrapper = zzf2.zzi(ObjectWrapper.wrap(context), str3, i13, ObjectWrapper.wrap(zzn4.zza));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", (zzp) null);
                                                }
                                            } else if (zze2 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                iObjectWrapper = zzf2.zzj(ObjectWrapper.wrap(context), str3, i13);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                iObjectWrapper = zzf2.zzh(ObjectWrapper.wrap(context), str3, i13);
                                            }
                                            if (ObjectWrapper.unwrap(iObjectWrapper) != null) {
                                                dynamiteModule = new DynamiteModule((Context) ObjectWrapper.unwrap(iObjectWrapper));
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", (zzp) null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", (zzp) null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = zzn2.zza;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(zzn);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", (zzp) null);
                            } catch (RemoteException e10) {
                                throw new LoadingException("Failed to load remote module.", e10, (zzp) null);
                            } catch (LoadingException e11) {
                                throw e11;
                            } catch (Throwable th2) {
                                CrashUtils.addDynamiteErrorToDropBox(context2, th2);
                                throw new LoadingException("Failed to load remote module.", th2, (zzp) null);
                            }
                        } catch (LoadingException e12) {
                            String valueOf2 = String.valueOf(e12.getMessage());
                            if (valueOf2.length() != 0) {
                                str2 = "Failed to load remote module: ".concat(valueOf2);
                            } else {
                                str2 = new String("Failed to load remote module: ");
                            }
                            Log.w("DynamiteModule", str2);
                            int i14 = selectModule.localVersion;
                            if (i14 != 0) {
                                if (versionPolicy.selectModule(context2, str3, new zzo(i14, 0)).selection == -1) {
                                    DynamiteModule zzc3 = zzc(context2, str3);
                                    if (i != 0) {
                                        zzg.set(Long.valueOf(longValue));
                                    }
                                    return zzc3;
                                }
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e12, (zzp) null);
                        }
                    } else {
                        StringBuilder sb5 = new StringBuilder(47);
                        sb5.append("VersionPolicy returned invalid code:");
                        sb5.append(i12);
                        throw new LoadingException(sb5.toString(), (zzp) null);
                    }
                }
            }
            int i15 = selectModule.localVersion;
            int i16 = selectModule.remoteVersion;
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 92);
            sb6.append("No acceptable module ");
            sb6.append(str3);
            sb6.append(" found. Local version is ");
            sb6.append(i15);
            sb6.append(" and remote version is ");
            sb6.append(i16);
            sb6.append(".");
            throw new LoadingException(sb6.toString(), (zzp) null);
        } finally {
            if (longValue == 0) {
                zzg.remove();
            } else {
                zzg.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = zzn2.zza;
            if (cursor4 != null) {
                cursor4.close();
            }
            zzf.set(zzn);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x003a=Splitter:B:18:0x003a, B:24:0x004a=Splitter:B:24:0x004a, B:43:0x008e=Splitter:B:43:0x008e} */
    public static int zza(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.Boolean r1 = zzb     // Catch:{ all -> 0x01c4 }
            r2 = 0
            if (r1 != 0) goto L_0x00d2
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r3 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Class r1 = r1.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.String r3 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Class r3 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            monitor-enter(r3)     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Object r4 = r1.get(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x003d
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a6 }
            if (r4 != r1) goto L_0x0037
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x0037:
            zzd(r4)     // Catch:{ LoadingException -> 0x003a }
        L_0x003a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x003d:
            boolean r4 = zzd     // Catch:{ all -> 0x00a6 }
            if (r4 != 0) goto L_0x009b
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a6 }
            boolean r5 = r4.equals(r2)     // Catch:{ all -> 0x00a6 }
            if (r5 == 0) goto L_0x004a
            goto L_0x009b
        L_0x004a:
            int r5 = zzb(r9, r10, r11)     // Catch:{ LoadingException -> 0x0091 }
            java.lang.String r6 = zzc     // Catch:{ LoadingException -> 0x0091 }
            if (r6 == 0) goto L_0x008e
            boolean r6 = r6.isEmpty()     // Catch:{ LoadingException -> 0x0091 }
            if (r6 == 0) goto L_0x0059
            goto L_0x008e
        L_0x0059:
            java.lang.ClassLoader r6 = com.google.android.gms.dynamite.zzb.zza()     // Catch:{ LoadingException -> 0x0091 }
            if (r6 == 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x0091 }
            r7 = 29
            if (r6 < r7) goto L_0x0075
            dalvik.system.DelegateLastClassLoader r6 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x0091 }
            java.lang.String r7 = zzc     // Catch:{ LoadingException -> 0x0091 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ LoadingException -> 0x0091 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0091 }
            r6.<init>(r7, r8)     // Catch:{ LoadingException -> 0x0091 }
            goto L_0x0083
        L_0x0075:
            com.google.android.gms.dynamite.zzc r6 = new com.google.android.gms.dynamite.zzc     // Catch:{ LoadingException -> 0x0091 }
            java.lang.String r7 = zzc     // Catch:{ LoadingException -> 0x0091 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ LoadingException -> 0x0091 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0091 }
            r6.<init>(r7, r8)     // Catch:{ LoadingException -> 0x0091 }
        L_0x0083:
            zzd(r6)     // Catch:{ LoadingException -> 0x0091 }
            r1.set(r2, r6)     // Catch:{ LoadingException -> 0x0091 }
            zzb = r4     // Catch:{ LoadingException -> 0x0091 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c4 }
            return r5
        L_0x008e:
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c4 }
            return r5
        L_0x0091:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a6 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x009b:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a6 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a6 }
        L_0x00a4:
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            goto L_0x00d0
        L_0x00a6:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            goto L_0x00ae
        L_0x00ab:
            r1 = move-exception
            goto L_0x00ae
        L_0x00ad:
            r1 = move-exception
        L_0x00ae:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01c4 }
            int r4 = r1.length()     // Catch:{ all -> 0x01c4 }
            int r4 = r4 + 30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
            r5.<init>(r4)     // Catch:{ all -> 0x01c4 }
            java.lang.String r4 = "Failed to load module via V2: "
            r5.append(r4)     // Catch:{ all -> 0x01c4 }
            r5.append(r1)     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01c4 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x01c4 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01c4 }
        L_0x00d0:
            zzb = r1     // Catch:{ all -> 0x01c4 }
        L_0x00d2:
            monitor-exit(r0)     // Catch:{ all -> 0x01c4 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01c7 }
            r1 = 0
            if (r0 == 0) goto L_0x0100
            int r9 = zzb(r9, r10, r11)     // Catch:{ LoadingException -> 0x00df }
            return r9
        L_0x00df:
            r10 = move-exception
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x01c7 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01c7 }
            int r2 = r10.length()     // Catch:{ all -> 0x01c7 }
            if (r2 == 0) goto L_0x00f7
            java.lang.String r10 = r0.concat(r10)     // Catch:{ all -> 0x01c7 }
            goto L_0x00fc
        L_0x00f7:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x01c7 }
            r10.<init>(r0)     // Catch:{ all -> 0x01c7 }
        L_0x00fc:
            android.util.Log.w(r11, r10)     // Catch:{ all -> 0x01c7 }
            return r1
        L_0x0100:
            com.google.android.gms.dynamite.zzq r3 = zzf(r9)     // Catch:{ all -> 0x01c7 }
            if (r3 != 0) goto L_0x0108
            goto L_0x01bb
        L_0x0108:
            int r0 = r3.zze()     // Catch:{ RemoteException -> 0x0195 }
            r4 = 3
            if (r0 < r4) goto L_0x0170
            java.lang.ThreadLocal<com.google.android.gms.dynamite.zzn> r0 = zzf     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0195 }
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch:{ RemoteException -> 0x0195 }
            if (r0 == 0) goto L_0x0123
            android.database.Cursor r0 = r0.zza     // Catch:{ RemoteException -> 0x0195 }
            if (r0 == 0) goto L_0x0123
            int r1 = r0.getInt(r1)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01bb
        L_0x0123:
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x0195 }
            java.lang.ThreadLocal<java.lang.Long> r0 = zzg     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0195 }
            long r7 = r0.longValue()     // Catch:{ RemoteException -> 0x0195 }
            r5 = r10
            r6 = r11
            com.google.android.gms.dynamic.IObjectWrapper r10 = r3.zzk(r4, r5, r6, r7)     // Catch:{ RemoteException -> 0x0195 }
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)     // Catch:{ RemoteException -> 0x0195 }
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ RemoteException -> 0x0195 }
            if (r10 == 0) goto L_0x015d
            boolean r11 = r10.moveToFirst()     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r11 != 0) goto L_0x0148
            goto L_0x015d
        L_0x0148:
            int r11 = r10.getInt(r1)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r11 <= 0) goto L_0x0155
            boolean r0 = zze(r10)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r0 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r2 = r10
        L_0x0156:
            if (r2 == 0) goto L_0x015b
            r2.close()     // Catch:{ all -> 0x01c7 }
        L_0x015b:
            r1 = r11
            goto L_0x01bb
        L_0x015d:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r0)     // Catch:{ RemoteException -> 0x016d, all -> 0x016a }
            if (r10 == 0) goto L_0x01bb
            r10.close()     // Catch:{ all -> 0x01c7 }
            goto L_0x01bb
        L_0x016a:
            r11 = move-exception
            r2 = r10
            goto L_0x01be
        L_0x016d:
            r11 = move-exception
            r2 = r10
            goto L_0x0197
        L_0x0170:
            r4 = 2
            if (r0 != r4) goto L_0x0183
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x0195 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x0195 }
            int r1 = r3.zzg(r0, r10, r11)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01bb
        L_0x0183:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x0195 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x0195 }
            int r1 = r3.zzf(r0, r10, r11)     // Catch:{ RemoteException -> 0x0195 }
            goto L_0x01bb
        L_0x0193:
            r11 = r10
            goto L_0x01be
        L_0x0195:
            r10 = move-exception
            r11 = r10
        L_0x0197:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01bc }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01bc }
            int r3 = r11.length()     // Catch:{ all -> 0x01bc }
            if (r3 == 0) goto L_0x01ae
            java.lang.String r11 = r0.concat(r11)     // Catch:{ all -> 0x01bc }
            goto L_0x01b3
        L_0x01ae:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x01bc }
            r11.<init>(r0)     // Catch:{ all -> 0x01bc }
        L_0x01b3:
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x01bc }
            if (r2 == 0) goto L_0x01bb
            r2.close()     // Catch:{ all -> 0x01c7 }
        L_0x01bb:
            return r1
        L_0x01bc:
            r10 = move-exception
            goto L_0x0193
        L_0x01be:
            if (r2 == 0) goto L_0x01c3
            r2.close()     // Catch:{ all -> 0x01c7 }
        L_0x01c3:
            throw r11     // Catch:{ all -> 0x01c7 }
        L_0x01c4:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c4 }
            throw r10     // Catch:{ all -> 0x01c7 }
        L_0x01c7:
            r10 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r9, r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = zzg     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r12.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            if (r10 == 0) goto L_0x00a0
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009e }
            if (r11 == 0) goto L_0x00a0
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009e }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009e }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            zzc = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            zze = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = r11
        L_0x007f:
            zzd = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = zze(r10)     // Catch:{ Exception -> 0x009e }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x008e:
            if (r11 != 0) goto L_0x0096
            if (r10 == 0) goto L_0x0095
            r10.close()
        L_0x0095:
            return r12
        L_0x0096:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009e }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009e }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            r11 = move-exception
            goto L_0x00b5
        L_0x00a0:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009e }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009e }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009e }
            throw r11     // Catch:{ Exception -> 0x009e }
        L_0x00af:
            r10 = move-exception
            r11 = r10
            goto L_0x00c4
        L_0x00b2:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b5:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00c2 }
            if (r12 == 0) goto L_0x00ba
            throw r11     // Catch:{ all -> 0x00c2 }
        L_0x00ba:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r11, r0)     // Catch:{ all -> 0x00c2 }
            throw r12     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r11 = move-exception
            r0 = r10
        L_0x00c4:
            if (r0 == 0) goto L_0x00c9
            r0.close()
        L_0x00c9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Selected local version of ".concat(valueOf);
        } else {
            str2 = new String("Selected local version of ");
        }
        Log.i("DynamiteModule", str2);
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzr;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzr = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzr = (zzr) queryLocalInterface;
                } else {
                    zzr = new zzr(iBinder);
                }
            }
            zzk = zzr;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10, (zzp) null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zzn = zzf.get();
        if (zzn == null || zzn.zza != null) {
            return false;
        }
        zzn.zza = cursor;
        return true;
    }

    private static zzq zzf(Context context) {
        zzq zzq;
        synchronized (DynamiteModule.class) {
            zzq zzq2 = zzj;
            if (zzq2 != null) {
                return zzq2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzq = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzq = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzq != null) {
                    zzj = zzq;
                    return zzq;
                }
            } catch (Exception e10) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    @KeepForSdk
    public Context getModuleContext() {
        return this.zzi;
    }

    @KeepForSdk
    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzi.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e10, (zzp) null);
        }
    }
}
