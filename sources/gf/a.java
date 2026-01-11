package gf;

import aa.b;
import e6.e;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import xe.p;

public final class a implements p {

    /* renamed from: a  reason: collision with root package name */
    public List<Integer> f5478a;

    /* renamed from: b  reason: collision with root package name */
    public int f5479b;

    /* renamed from: c  reason: collision with root package name */
    public long f5480c;

    /* renamed from: d  reason: collision with root package name */
    public URI f5481d;

    /* renamed from: e  reason: collision with root package name */
    public b f5482e;

    /* renamed from: f  reason: collision with root package name */
    public List<b> f5483f;

    public a() {
        this((List) null, 0, 0, (URI) null, (b) null, 63);
    }

    public a(List<Integer> list, int i, long j10, URI uri, b bVar, int i10) {
        list = (i10 & 1) != 0 ? new ArrayList<>() : list;
        i = (i10 & 2) != 0 ? 0 : i;
        j10 = (i10 & 4) != 0 ? 0 : j10;
        uri = (i10 & 8) != 0 ? jc.b.h() : uri;
        if ((i10 & 16) != 0) {
            new b
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: CONSTRUCTOR  (r7v2 ? I:aa.b) =  call: aa.b.<init>():void type: CONSTRUCTOR in method: gf.a.<init>(java.util.List, int, long, java.net.URI, aa.b, int):void, dex: classes.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r0 = r8 & 1
                if (r0 == 0) goto L_0x0009
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
            L_0x0009:
                r0 = r8 & 2
                if (r0 == 0) goto L_0x000e
                r3 = 0
            L_0x000e:
                r0 = r8 & 4
                if (r0 == 0) goto L_0x0014
                r4 = 0
            L_0x0014:
                r0 = r8 & 8
                if (r0 == 0) goto L_0x001c
                java.net.URI r6 = jc.b.h()
            L_0x001c:
                r0 = r8 & 16
                if (r0 == 0) goto L_0x0025
                aa.b r7 = new aa.b
                r7.<init>()
            L_0x0025:
                r8 = r8 & 32
                if (r8 == 0) goto L_0x002f
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                goto L_0x0030
            L_0x002f:
                r8 = 0
            L_0x0030:
                java.lang.String r0 = "securityTargets"
                e6.e.D(r2, r0)
                java.lang.String r0 = "securitySource"
                e6.e.D(r6, r0)
                java.lang.String r0 = "securityContextParameters"
                e6.e.D(r7, r0)
                java.lang.String r0 = "securityResults"
                e6.e.D(r8, r0)
                r1.<init>()
                r1.f5478a = r2
                r1.f5479b = r3
                r1.f5480c = r4
                r1.f5481d = r6
                r1.f5482e = r7
                r1.f5483f = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.a.<init>(java.util.List, int, long, java.net.URI, aa.b, int):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return e.r(this.f5478a, aVar.f5478a) && this.f5479b == aVar.f5479b && this.f5480c == aVar.f5480c && e.r(this.f5481d, aVar.f5481d) && e.r(this.f5482e, aVar.f5482e) && e.r(this.f5483f, aVar.f5483f);
        }

        public final int hashCode() {
            List<Integer> list = this.f5478a;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            long j10 = this.f5480c;
            int i10 = ((((hashCode * 31) + this.f5479b) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            URI uri = this.f5481d;
            int hashCode2 = (i10 + (uri != null ? uri.hashCode() : 0)) * 31;
            b bVar = this.f5482e;
            int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            List<b> list2 = this.f5483f;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder q10 = a.b.q("AbstractSecurityBlockData(securityTargets=");
            q10.append(this.f5478a);
            q10.append(", securityContext=");
            q10.append(this.f5479b);
            q10.append(", securityBlockV7Flags=");
            q10.append(this.f5480c);
            q10.append(", securitySource=");
            q10.append(this.f5481d);
            q10.append(", securityContextParameters=");
            q10.append(this.f5482e);
            q10.append(", securityResults=");
            q10.append(this.f5483f);
            q10.append(")");
            return q10.toString();
        }
    }
