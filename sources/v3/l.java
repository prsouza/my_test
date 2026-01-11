package v3;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.a0;
import com.bumptech.glide.e;
import com.bumptech.glide.j;
import ge.g0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p3.r;
import v3.k;
import v3.o;

public final class l implements Handler.Callback {
    public static final a g = new a();

    /* renamed from: a  reason: collision with root package name */
    public volatile j f12275a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<FragmentManager, k> f12276b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<a0, o> f12277c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f12278d;

    /* renamed from: e  reason: collision with root package name */
    public final b f12279e;

    /* renamed from: f  reason: collision with root package name */
    public final g f12280f;

    public class a implements b {
    }

    public interface b {
    }

    public l(b bVar, e eVar) {
        f fVar;
        new Bundle();
        this.f12279e = bVar == null ? g : bVar;
        this.f12278d = new Handler(Looper.getMainLooper(), this);
        if (!r.f9619h || !r.g) {
            new a.b
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0047: CONSTRUCTOR  (r2v5 ? I:a.b) =  call: a.b.<init>():void type: CONSTRUCTOR in method: v3.l.<init>(v3.l$b, com.bumptech.glide.e):void, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v5 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f12276b = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f12277c = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                v3.l$a r2 = g
            L_0x001b:
                r1.f12279e = r2
                android.os.Handler r2 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r2.<init>(r0, r1)
                r1.f12278d = r2
                boolean r2 = p3.r.f9619h
                if (r2 == 0) goto L_0x0045
                boolean r2 = p3.r.g
                if (r2 != 0) goto L_0x0031
                goto L_0x0045
            L_0x0031:
                java.lang.Class<com.bumptech.glide.c$d> r2 = com.bumptech.glide.c.d.class
                boolean r2 = r3.a(r2)
                if (r2 == 0) goto L_0x003f
                v3.f r2 = new v3.f
                r2.<init>()
                goto L_0x004a
            L_0x003f:
                jc.b r2 = new jc.b
                r2.<init>()
                goto L_0x004a
            L_0x0045:
                a.b r2 = new a.b
                r2.<init>()
            L_0x004a:
                r1.f12280f = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v3.l.<init>(v3.l$b, com.bumptech.glide.e):void");
        }

        public static Activity a(Context context) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                return a(((ContextWrapper) context).getBaseContext());
            }
            return null;
        }

        public final j b(Context context) {
            if (context != null) {
                if (c4.j.i() && !(context instanceof Application)) {
                    if (context instanceof androidx.fragment.app.r) {
                        return c((androidx.fragment.app.r) context);
                    }
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (c4.j.h()) {
                            return b(activity.getApplicationContext());
                        }
                        if (activity instanceof androidx.fragment.app.r) {
                            return c((androidx.fragment.app.r) activity);
                        }
                        if (!activity.isDestroyed()) {
                            this.f12280f.d();
                            FragmentManager fragmentManager = activity.getFragmentManager();
                            Activity a10 = a(activity);
                            boolean z = a10 == null || !a10.isFinishing();
                            k d10 = d(fragmentManager);
                            j jVar = d10.f12271s;
                            if (jVar != null) {
                                return jVar;
                            }
                            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(activity);
                            b bVar = this.f12279e;
                            a aVar = d10.f12268a;
                            k.a aVar2 = d10.f12269b;
                            Objects.requireNonNull((a) bVar);
                            j jVar2 = new j(b10, aVar, aVar2, activity);
                            if (z) {
                                jVar2.onStart();
                            }
                            d10.f12271s = jVar2;
                            return jVar2;
                        }
                        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                    } else if (context instanceof ContextWrapper) {
                        ContextWrapper contextWrapper = (ContextWrapper) context;
                        if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                            return b(contextWrapper.getBaseContext());
                        }
                    }
                }
                if (this.f12275a == null) {
                    synchronized (this) {
                        if (this.f12275a == null) {
                            com.bumptech.glide.b b11 = com.bumptech.glide.b.b(context.getApplicationContext());
                            b bVar2 = this.f12279e;
                            g0 g0Var = new g0();
                            g4.a aVar3 = new g4.a();
                            Context applicationContext = context.getApplicationContext();
                            Objects.requireNonNull((a) bVar2);
                            this.f12275a = new j(b11, g0Var, aVar3, applicationContext);
                        }
                    }
                }
                return this.f12275a;
            }
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }

        public final j c(androidx.fragment.app.r rVar) {
            if (c4.j.h()) {
                return b(rVar.getApplicationContext());
            }
            if (!rVar.isDestroyed()) {
                this.f12280f.d();
                a0 supportFragmentManager = rVar.getSupportFragmentManager();
                Activity a10 = a(rVar);
                boolean z = a10 == null || !a10.isFinishing();
                o e10 = e(supportFragmentManager);
                j jVar = e10.f12288t;
                if (jVar != null) {
                    return jVar;
                }
                com.bumptech.glide.b b10 = com.bumptech.glide.b.b(rVar);
                b bVar = this.f12279e;
                a aVar = e10.f12284a;
                o.a aVar2 = e10.f12285b;
                Objects.requireNonNull((a) bVar);
                j jVar2 = new j(b10, aVar, aVar2, rVar);
                if (z) {
                    jVar2.onStart();
                }
                e10.f12288t = jVar2;
                return jVar2;
            }
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Map<android.app.FragmentManager, v3.k>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Map<android.app.FragmentManager, v3.k>, java.util.HashMap] */
        public final k d(FragmentManager fragmentManager) {
            k kVar = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (kVar != null) {
                return kVar;
            }
            k kVar2 = (k) this.f12276b.get(fragmentManager);
            if (kVar2 != null) {
                return kVar2;
            }
            k kVar3 = new k();
            kVar3.f12273u = null;
            this.f12276b.put(fragmentManager, kVar3);
            fragmentManager.beginTransaction().add(kVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f12278d.obtainMessage(1, fragmentManager).sendToTarget();
            return kVar3;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<androidx.fragment.app.a0, v3.o>] */
        /* JADX WARNING: type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<androidx.fragment.app.a0, v3.o>] */
        public final o e(a0 a0Var) {
            o oVar = (o) a0Var.F("com.bumptech.glide.manager");
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = (o) this.f12277c.get(a0Var);
            if (oVar2 != null) {
                return oVar2;
            }
            o oVar3 = new o();
            oVar3.f12289u = null;
            this.f12277c.put(a0Var, oVar3);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(a0Var);
            aVar.e(0, oVar3, "com.bumptech.glide.manager", 1);
            aVar.h();
            this.f12278d.obtainMessage(2, a0Var).sendToTarget();
            return oVar3;
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [java.util.Map<android.app.FragmentManager, v3.k>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r0v7, types: [java.util.HashMap, java.util.Map<androidx.fragment.app.a0, v3.o>] */
        public final boolean handleMessage(Message message) {
            Object obj;
            Object obj2;
            Object obj3;
            int i = message.what;
            Object obj4 = null;
            boolean z = true;
            if (i == 1) {
                obj2 = (FragmentManager) message.obj;
                obj3 = this.f12276b.remove(obj2);
            } else if (i != 2) {
                z = false;
                obj = null;
                if (z && obj4 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
                }
                return z;
            } else {
                obj2 = (a0) message.obj;
                obj3 = this.f12277c.remove(obj2);
            }
            obj = obj2;
            obj4 = obj3;
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            return z;
        }
    }
