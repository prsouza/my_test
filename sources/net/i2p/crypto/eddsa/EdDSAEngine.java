package net.i2p.crypto.eddsa;

import ah.v;
import cf.b;
import cf.c;
import df.d;
import df.e;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Objects;
import sun.security.x509.X509Key;

public final class EdDSAEngine extends Signature {

    /* renamed from: h  reason: collision with root package name */
    public static final a f8986h = new a();

    /* renamed from: a  reason: collision with root package name */
    public MessageDigest f8987a;

    /* renamed from: b  reason: collision with root package name */
    public ByteArrayOutputStream f8988b;

    /* renamed from: c  reason: collision with root package name */
    public cf.a f8989c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8990d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f8991e;

    /* renamed from: f  reason: collision with root package name */
    public int f8992f;
    public int g;

    public static class a implements AlgorithmParameterSpec {
    }

    public EdDSAEngine() {
        super("NONEwithEdDSA");
    }

    public final void a(b bVar) {
        int i = bVar.f3451u.f5112a.f4465a.f4479u;
        int i10 = i / 8;
        this.f8987a.update(bVar.f3447b, i10, (i / 4) - i10);
    }

    public final void b() {
        MessageDigest messageDigest = this.f8987a;
        if (messageDigest != null) {
            messageDigest.reset();
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f8988b;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.reset();
        }
        this.f8990d = false;
        this.f8991e = null;
    }

    public final byte[] c() throws SignatureException {
        int i;
        int i10;
        byte[] bArr;
        df.b bVar = this.f8989c.a().f5112a;
        v vVar = this.f8989c.a().f5114c;
        byte[] bArr2 = ((b) this.f8989c).f3448c;
        if (this.f8990d) {
            bArr = this.f8991e;
            if (bArr != null) {
                i10 = this.f8992f;
                i = this.g;
            } else {
                throw new SignatureException("update() not called first");
            }
        } else {
            ByteArrayOutputStream byteArrayOutputStream = this.f8988b;
            if (byteArrayOutputStream == null) {
                bArr = new byte[0];
            } else {
                bArr = byteArrayOutputStream.toByteArray();
            }
            i = bArr.length;
            i10 = 0;
        }
        this.f8987a.update(bArr, i10, i);
        byte[] i02 = vVar.i0(this.f8987a.digest());
        byte[] n10 = this.f8989c.a().f5115s.k(i02).n();
        this.f8987a.update(n10);
        this.f8987a.update(((b) this.f8989c).f3450t);
        this.f8987a.update(bArr, i10, i);
        byte[] i03 = vVar.i0(this.f8987a.digest());
        long b10 = (long) (ef.b.b(i03, 0) & 2097151);
        long c10 = (ef.b.c(i03, 2) >> 5) & 2097151;
        long c11 = (ef.b.c(i03, 7) >> 7) & 2097151;
        long c12 = (ef.b.c(i03, 10) >> 4) & 2097151;
        long c13 = (ef.b.c(i03, 15) >> 6) & 2097151;
        int b11 = ef.b.b(i03, 21) & 2097151;
        long c14 = (ef.b.c(i03, 23) >> 5) & 2097151;
        long j10 = (long) b11;
        long b12 = (long) ((ef.b.b(i03, 26) >> 2) & 2097151);
        long c15 = ef.b.c(i03, 28) >> 7;
        long j11 = b12;
        long b13 = (long) (ef.b.b(bArr2, 0) & 2097151);
        long c16 = (ef.b.c(bArr2, 2) >> 5) & 2097151;
        long b14 = (long) ((ef.b.b(i03, 18) >> 3) & 2097151);
        long b15 = (long) ((ef.b.b(bArr2, 5) >> 2) & 2097151);
        long c17 = (ef.b.c(bArr2, 7) >> 7) & 2097151;
        long c18 = (ef.b.c(bArr2, 10) >> 4) & 2097151;
        long b16 = (long) ((ef.b.b(i03, 13) >> 1) & 2097151);
        long b17 = (long) ((ef.b.b(bArr2, 13) >> 1) & 2097151);
        long c19 = (ef.b.c(bArr2, 15) >> 6) & 2097151;
        long j12 = b17;
        long b18 = (long) ((ef.b.b(bArr2, 18) >> 3) & 2097151);
        long c20 = (ef.b.c(bArr2, 23) >> 5) & 2097151;
        long b19 = (long) (ef.b.b(bArr2, 21) & 2097151);
        long b20 = (long) ((ef.b.b(bArr2, 26) >> 2) & 2097151);
        long c21 = ef.b.c(bArr2, 28) >> 7;
        long b21 = (long) ((ef.b.b(i03, 5) >> 2) & 2097151);
        long b22 = (long) (ef.b.b(i02, 0) & 2097151);
        long j13 = b20;
        long b23 = (long) ((ef.b.b(i02, 5) >> 2) & 2097151);
        long b24 = (long) ((ef.b.b(i02, 13) >> 1) & 2097151);
        long b25 = (long) ((ef.b.b(i02, 18) >> 3) & 2097151);
        long b26 = (long) (ef.b.b(i02, 21) & 2097151);
        long c22 = (ef.b.c(i02, 23) >> 5) & 2097151;
        long j14 = b26;
        long b27 = (long) ((ef.b.b(i02, 26) >> 2) & 2097151);
        long j15 = (b10 * b13) + b22;
        long c23 = (c10 * b13) + (b10 * c16) + ((ef.b.c(i02, 2) >> 5) & 2097151);
        long j16 = (b21 * b13) + (c10 * c16) + (b10 * b15) + b23;
        long c24 = (c11 * b13) + (b21 * c16) + (c10 * b15) + (b10 * c17) + ((ef.b.c(i02, 7) >> 7) & 2097151);
        long c25 = (c12 * b13) + (c11 * c16) + (b21 * b15) + (c10 * c17) + (b10 * c18) + ((ef.b.c(i02, 10) >> 4) & 2097151);
        long j17 = (b16 * b13) + (c12 * c16) + (c11 * b15) + (b21 * c17) + (c10 * c18) + (b10 * j12) + b24;
        long c26 = (c13 * b13) + (b16 * c16) + (c12 * b15) + (c11 * c17) + (b21 * c18) + (c10 * j12) + (b10 * c19) + ((ef.b.c(i02, 15) >> 6) & 2097151);
        long j18 = (b14 * b13) + (c13 * c16) + (b16 * b15) + (c12 * c17) + (c11 * c18) + (b21 * j12) + (c10 * c19) + (b10 * b18) + b25;
        long j19 = (j10 * b13) + (b14 * c16) + (c13 * b15) + (b16 * c17) + (c12 * c18) + (c11 * j12) + (b21 * c19) + (c10 * b18) + (b10 * b19) + j14;
        long j20 = (c14 * b13) + (j10 * c16) + (b14 * b15) + (c13 * c17) + (b16 * c18) + (c12 * j12) + (c11 * c19) + (b21 * b18) + (c10 * b19) + (b10 * c20) + c22;
        long j21 = (j11 * b13) + (c14 * c16) + (j10 * b15) + (b14 * c17) + (c13 * c18) + (b16 * j12) + (c12 * c19) + (c11 * b18) + (b21 * b19) + (c10 * c20) + (b10 * j13) + b27;
        long j22 = b21 * c20;
        long j23 = b13 * c15;
        long c27 = j23 + (j11 * c16) + (c14 * b15) + (j10 * c17) + (b14 * c18) + (c13 * j12) + (b16 * c19) + (c12 * b18) + (c11 * b19) + j22 + (c10 * j13) + (b10 * c21) + (ef.b.c(i02, 28) >> 7);
        long j24 = c16 * c15;
        long j25 = j24 + (j11 * b15) + (c14 * c17) + (j10 * c18) + (b14 * j12) + (c13 * c19) + (b16 * b18) + (c12 * b19) + (c11 * c20) + (b21 * j13) + (c10 * c21);
        long j26 = (b15 * c15) + (j11 * c17) + (c14 * c18) + (j10 * j12) + (b14 * c19) + (c13 * b18) + (b16 * b19) + (c12 * c20) + (c11 * j13) + (b21 * c21);
        long j27 = c17 * c15;
        long j28 = j27 + (j11 * c18) + (c14 * j12) + (j10 * c19) + (b14 * b18) + (c13 * b19) + (b16 * c20) + (c12 * j13) + (c11 * c21);
        long j29 = c18 * c15;
        long j30 = j29 + (j11 * j12) + (c14 * c19) + (j10 * b18) + (b14 * b19) + (c13 * c20) + (b16 * j13) + (c12 * c21);
        long j31 = (c15 * j12) + (j11 * c19) + (c14 * b18) + (j10 * b19) + (b14 * c20) + (c13 * j13) + (b16 * c21);
        long j32 = c19 * c15;
        long j33 = (c15 * b18) + (j11 * b19) + (c14 * c20) + (j10 * j13) + (b14 * c21);
        long j34 = (c15 * b19) + (j11 * c20) + (c14 * j13) + (j10 * c21);
        long j35 = (c20 * c15) + (j11 * j13) + (c14 * c21);
        long j36 = c15 * j13;
        long j37 = c15 * c21;
        long j38 = (j15 + 1048576) >> 21;
        long j39 = c23 + j38;
        long j40 = j15 - (j38 << 21);
        long j41 = (j16 + 1048576) >> 21;
        long j42 = c24 + j41;
        long j43 = j16 - (j41 << 21);
        long j44 = (c25 + 1048576) >> 21;
        long j45 = j17 + j44;
        long j46 = c25 - (j44 << 21);
        long j47 = (c26 + 1048576) >> 21;
        long j48 = j18 + j47;
        long j49 = c26 - (j47 << 21);
        long j50 = (j19 + 1048576) >> 21;
        long j51 = j20 + j50;
        long j52 = j19 - (j50 << 21);
        long j53 = (j21 + 1048576) >> 21;
        long j54 = c27 + j53;
        long j55 = j21 - (j53 << 21);
        long j56 = (j25 + 1048576) >> 21;
        long j57 = j26 + j56;
        long j58 = j25 - (j56 << 21);
        long j59 = (j28 + 1048576) >> 21;
        long j60 = j30 + j59;
        long j61 = j28 - (j59 << 21);
        long j62 = (j31 + 1048576) >> 21;
        long j63 = j32 + (j11 * b18) + (c14 * b19) + (j10 * c20) + (b14 * j13) + (c13 * c21) + j62;
        long j64 = j31 - (j62 << 21);
        long j65 = (j33 + 1048576) >> 21;
        long j66 = j34 + j65;
        long j67 = j33 - (j65 << 21);
        long j68 = (j35 + 1048576) >> 21;
        long j69 = j36 + (j11 * c21) + j68;
        long j70 = j35 - (j68 << 21);
        long j71 = (j37 + 1048576) >> 21;
        long j72 = (j39 + 1048576) >> 21;
        long j73 = j43 + j72;
        long j74 = j39 - (j72 << 21);
        long j75 = (j42 + 1048576) >> 21;
        long j76 = j46 + j75;
        long j77 = j42 - (j75 << 21);
        long j78 = (j45 + 1048576) >> 21;
        long j79 = j49 + j78;
        long j80 = j45 - (j78 << 21);
        long j81 = (j48 + 1048576) >> 21;
        long j82 = j52 + j81;
        long j83 = j48 - (j81 << 21);
        long j84 = (j51 + 1048576) >> 21;
        long j85 = j55 + j84;
        long j86 = j51 - (j84 << 21);
        long j87 = (j54 + 1048576) >> 21;
        long j88 = j58 + j87;
        long j89 = j54 - (j87 << 21);
        long j90 = (j57 + 1048576) >> 21;
        long j91 = j61 + j90;
        long j92 = j57 - (j90 << 21);
        long j93 = (j60 + 1048576) >> 21;
        long j94 = j64 + j93;
        long j95 = j60 - (j93 << 21);
        long j96 = (j63 + 1048576) >> 21;
        long j97 = j67 + j96;
        long j98 = j63 - (j96 << 21);
        long j99 = (j66 + 1048576) >> 21;
        long j100 = j70 + j99;
        long j101 = j66 - (j99 << 21);
        long j102 = (j69 + 1048576) >> 21;
        long j103 = (j37 - (j71 << 21)) + j102;
        long j104 = j69 - (j102 << 21);
        long j105 = j94 - (j71 * 683901);
        long j106 = (j103 * 654183) + (j71 * 470296) + j88;
        long j107 = ((j71 * 654183) + j92) - (j103 * 997805);
        long j108 = (j103 * 136657) + (j91 - (j71 * 997805));
        long j109 = ((j71 * 136657) + j95) - (j103 * 683901);
        long j110 = (j104 * 136657) + j107;
        long j111 = j108 - (j104 * 683901);
        long j112 = (j100 * 470296) + (j104 * 666643) + j86;
        long j113 = (j100 * 654183) + (j104 * 470296) + (j103 * 666643) + j85;
        long j114 = ((j104 * 654183) + ((j103 * 470296) + ((j71 * 666643) + j89))) - (j100 * 997805);
        long j115 = (j101 * 654183) + j112;
        long j116 = j113 - (j101 * 997805);
        long j117 = (j101 * 136657) + j114;
        long j118 = ((j100 * 136657) + (j106 - (j104 * 997805))) - (j101 * 683901);
        long j119 = (j97 * 666643) + j79;
        long j120 = (j97 * 654183) + (j101 * 470296) + (j100 * 666643) + j82;
        long j121 = j115 - (j97 * 997805);
        long j122 = (j97 * 136657) + j116;
        long j123 = j117 - (j97 * 683901);
        long j124 = (j119 + 1048576) >> 21;
        long j125 = (j97 * 470296) + (j101 * 666643) + j83 + j124;
        long j126 = j119 - (j124 << 21);
        long j127 = (j120 + 1048576) >> 21;
        long j128 = j121 + j127;
        long j129 = j120 - (j127 << 21);
        long j130 = (j122 + 1048576) >> 21;
        long j131 = j123 + j130;
        long j132 = j122 - (j130 << 21);
        long j133 = (j118 + 1048576) >> 21;
        long j134 = (j110 - (j100 * 683901)) + j133;
        long j135 = j118 - (j133 << 21);
        long j136 = (j111 + 1048576) >> 21;
        long j137 = j109 + j136;
        long j138 = j111 - (j136 << 21);
        long j139 = (j105 + 1048576) >> 21;
        long j140 = j98 + j139;
        long j141 = j105 - (j139 << 21);
        long j142 = (j125 + 1048576) >> 21;
        long j143 = j129 + j142;
        long j144 = j125 - (j142 << 21);
        long j145 = (j128 + 1048576) >> 21;
        long j146 = j132 + j145;
        long j147 = j128 - (j145 << 21);
        long j148 = (j131 + 1048576) >> 21;
        long j149 = j135 + j148;
        long j150 = j131 - (j148 << 21);
        long j151 = (j134 + 1048576) >> 21;
        long j152 = j138 + j151;
        long j153 = j134 - (j151 << 21);
        long j154 = (j137 + 1048576) >> 21;
        long j155 = j141 + j154;
        long j156 = j137 - (j154 << 21);
        long j157 = (j140 * 470296) + j126;
        long j158 = (j140 * 654183) + j144;
        long j159 = j146 - (j140 * 683901);
        long j160 = (j155 * 654183) + j157;
        long j161 = ((j140 * 136657) + j147) - (j155 * 683901);
        long j162 = (j156 * 654183) + (j155 * 470296) + (j140 * 666643) + j80;
        long j163 = (j156 * 136657) + (j158 - (j155 * 997805));
        long j164 = ((j155 * 136657) + (j143 - (j140 * 997805))) - (j156 * 683901);
        long j165 = (j152 * 654183) + (j156 * 470296) + (j155 * 666643) + j76;
        long j166 = j162 - (j152 * 997805);
        long j167 = (j152 * 136657) + (j160 - (j156 * 997805));
        long j168 = j163 - (j152 * 683901);
        long j169 = (j153 * 470296) + (j152 * 666643) + j73;
        long j170 = (j153 * 654183) + (j152 * 470296) + (j156 * 666643) + j77;
        long j171 = (j153 * 136657) + j166;
        long j172 = j167 - (j153 * 683901);
        long j173 = (j149 * 666643) + j40;
        long j174 = (j149 * 654183) + j169;
        long j175 = (j149 * 136657) + (j165 - (j153 * 997805));
        long j176 = (j173 + 1048576) >> 21;
        long j177 = (j149 * 470296) + (j153 * 666643) + j74 + j176;
        long j178 = j173 - (j176 << 21);
        long j179 = (j174 + 1048576) >> 21;
        long j180 = (j170 - (j149 * 997805)) + j179;
        long j181 = j174 - (j179 << 21);
        long j182 = (j175 + 1048576) >> 21;
        long j183 = (j171 - (j149 * 683901)) + j182;
        long j184 = j175 - (j182 << 21);
        long j185 = (j172 + 1048576) >> 21;
        long j186 = j168 + j185;
        long j187 = j172 - (j185 << 21);
        long j188 = (j164 + 1048576) >> 21;
        long j189 = j161 + j188;
        long j190 = j164 - (j188 << 21);
        long j191 = (j159 + 1048576) >> 21;
        long j192 = j150 + j191;
        long j193 = j159 - (j191 << 21);
        long j194 = (j177 + 1048576) >> 21;
        long j195 = j181 + j194;
        long j196 = j177 - (j194 << 21);
        long j197 = (j180 + 1048576) >> 21;
        long j198 = j184 + j197;
        long j199 = j180 - (j197 << 21);
        long j200 = (j183 + 1048576) >> 21;
        long j201 = j187 + j200;
        long j202 = j183 - (j200 << 21);
        long j203 = (j186 + 1048576) >> 21;
        long j204 = j190 + j203;
        long j205 = j186 - (j203 << 21);
        long j206 = (j189 + 1048576) >> 21;
        long j207 = j193 + j206;
        long j208 = j189 - (j206 << 21);
        long j209 = (j192 + 1048576) >> 21;
        long j210 = (j209 * 666643) + j178;
        long j211 = (j209 * 654183) + j195;
        long j212 = (j209 * 136657) + j198;
        long j213 = j210 >> 21;
        long j214 = (j209 * 470296) + j196 + j213;
        long j215 = j210 - (j213 << 21);
        long j216 = j214 >> 21;
        long j217 = j211 + j216;
        long j218 = j214 - (j216 << 21);
        long j219 = j217 >> 21;
        long j220 = (j199 - (j209 * 997805)) + j219;
        long j221 = j217 - (j219 << 21);
        long j222 = j220 >> 21;
        long j223 = j212 + j222;
        long j224 = j220 - (j222 << 21);
        long j225 = j223 >> 21;
        long j226 = (j202 - (j209 * 683901)) + j225;
        long j227 = j223 - (j225 << 21);
        long j228 = j226 >> 21;
        long j229 = j201 + j228;
        long j230 = j226 - (j228 << 21);
        long j231 = j229 >> 21;
        long j232 = j205 + j231;
        long j233 = j229 - (j231 << 21);
        long j234 = j232 >> 21;
        long j235 = j204 + j234;
        long j236 = j232 - (j234 << 21);
        long j237 = j235 >> 21;
        long j238 = j208 + j237;
        long j239 = j235 - (j237 << 21);
        long j240 = j238 >> 21;
        long j241 = j207 + j240;
        long j242 = j238 - (j240 << 21);
        long j243 = j241 >> 21;
        long j244 = (j192 - (j209 << 21)) + j243;
        long j245 = j241 - (j243 << 21);
        long j246 = j244 >> 21;
        long j247 = (666643 * j246) + j215;
        long j248 = j247 >> 21;
        long j249 = (470296 * j246) + j218 + j248;
        long j250 = j247 - (j248 << 21);
        long j251 = j249 >> 21;
        long j252 = (654183 * j246) + j221 + j251;
        long j253 = j249 - (j251 << 21);
        long j254 = j252 >> 21;
        long j255 = (j224 - (997805 * j246)) + j254;
        long j256 = j252 - (j254 << 21);
        long j257 = j255 >> 21;
        long j258 = (136657 * j246) + j227 + j257;
        long j259 = j255 - (j257 << 21);
        long j260 = j258 >> 21;
        long j261 = (j230 - (j246 * 683901)) + j260;
        long j262 = j258 - (j260 << 21);
        long j263 = j261 >> 21;
        long j264 = j233 + j263;
        long j265 = j261 - (j263 << 21);
        long j266 = j264 >> 21;
        long j267 = j236 + j266;
        long j268 = j264 - (j266 << 21);
        long j269 = j267 >> 21;
        long j270 = j239 + j269;
        long j271 = j267 - (j269 << 21);
        long j272 = j270 >> 21;
        long j273 = j242 + j272;
        long j274 = j270 - (j272 << 21);
        long j275 = j273 >> 21;
        long j276 = j245 + j275;
        long j277 = j273 - (j275 << 21);
        long j278 = j276 >> 21;
        long j279 = (j244 - (j246 << 21)) + j278;
        long j280 = j276 - (j278 << 21);
        byte[] bArr3 = {(byte) ((int) j250), (byte) ((int) (j250 >> 8)), (byte) ((int) ((j250 >> 16) | (j253 << 5))), (byte) ((int) (j253 >> 3)), (byte) ((int) (j253 >> 11)), (byte) ((int) ((j253 >> 19) | (j256 << 2))), (byte) ((int) (j256 >> 6)), (byte) ((int) ((j256 >> 14) | (j259 << 7))), (byte) ((int) (j259 >> 1)), (byte) ((int) (j259 >> 9)), (byte) ((int) ((j259 >> 17) | (j262 << 4))), (byte) ((int) (j262 >> 4)), (byte) ((int) (j262 >> 12)), (byte) ((int) ((j262 >> 20) | (j265 << 1))), (byte) ((int) (j265 >> 7)), (byte) ((int) ((j265 >> 15) | (j268 << 6))), (byte) ((int) (j268 >> 2)), (byte) ((int) (j268 >> 10)), (byte) ((int) ((j268 >> 18) | (j271 << 3))), (byte) ((int) (j271 >> 5)), (byte) ((int) (j271 >> 13)), (byte) ((int) j274), (byte) ((int) (j274 >> 8)), (byte) ((int) ((j274 >> 16) | (j277 << 5))), (byte) ((int) (j277 >> 3)), (byte) ((int) (j277 >> 11)), (byte) ((int) ((j277 >> 19) | (j280 << 2))), (byte) ((int) (j280 >> 6)), (byte) ((int) ((j280 >> 14) | (j279 << 7))), (byte) ((int) (j279 >> 1)), (byte) ((int) (j279 >> 9)), (byte) ((int) (j279 >> 17))};
        ByteBuffer allocate = ByteBuffer.allocate(bVar.f4465a.f4479u / 4);
        allocate.put(n10).put(bArr3);
        return allocate.array();
    }

    public final boolean d(byte[] bArr) throws SignatureException {
        int i;
        int i10;
        byte[] bArr2;
        int i11 = this.f8989c.a().f5112a.f4465a.f4479u;
        int i12 = i11 / 4;
        if (bArr.length == i12) {
            int i13 = i11 / 8;
            this.f8987a.update(bArr, 0, i13);
            this.f8987a.update(((c) this.f8989c).f3454c);
            if (this.f8990d) {
                bArr2 = this.f8991e;
                if (bArr2 != null) {
                    i10 = this.f8992f;
                    i = this.g;
                } else {
                    throw new SignatureException("update() not called first");
                }
            } else {
                ByteArrayOutputStream byteArrayOutputStream = this.f8988b;
                if (byteArrayOutputStream == null) {
                    bArr2 = new byte[0];
                } else {
                    bArr2 = byteArrayOutputStream.toByteArray();
                }
                i = bArr2.length;
                i10 = 0;
            }
            this.f8987a.update(bArr2, i10, i);
            byte[] i02 = this.f8989c.a().f5114c.i0(this.f8987a.digest());
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i13, i12);
            e eVar = this.f8989c.a().f5115s;
            c cVar = (c) this.f8989c;
            e eVar2 = cVar.f3453b;
            if (eVar2 == null) {
                e eVar3 = cVar.f3452a;
                e.b bVar = eVar3.f4484b;
                e.b bVar2 = e.b.P3;
                if (bVar == bVar2) {
                    e a10 = eVar3.f4483a.a(bVar2);
                    e o4 = eVar3.o();
                    if (a10.f4484b != bVar2) {
                        throw new UnsupportedOperationException();
                    } else if (o4.f4484b == e.b.CACHED) {
                        d a11 = a10.f4486s.a(a10.f4485c);
                        d g8 = a10.f4486s.g(a10.f4485c);
                        d d10 = a11.d(o4.f4486s);
                        d d11 = g8.d(o4.f4485c);
                        d d12 = o4.f4488u.d(a10.f4488u);
                        d d13 = a10.f4487t.d(o4.f4487t);
                        d a12 = d13.a(d13);
                        eVar2 = e.f(a10.f4483a, d10.g(d11), d10.a(d11), a12.g(d12), a12.a(d12)).r(e.b.P3PrecomputedDouble);
                        cVar.f3453b = eVar2;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            Objects.requireNonNull(eVar);
            byte[] m10 = e.m(i02);
            byte[] m11 = e.m(copyOfRange);
            e a13 = eVar.f4483a.a(e.b.P2);
            int i14 = 255;
            while (i14 >= 0 && m10[i14] == 0 && m11[i14] == 0) {
                i14--;
            }
            while (i14 >= 0) {
                e c10 = a13.c();
                if (m10[i14] > 0) {
                    c10 = c10.q().d(eVar2.f4490w[m10[i14] / 2]);
                } else if (m10[i14] < 0) {
                    c10 = c10.q().e(eVar2.f4490w[(-m10[i14]) / 2]);
                }
                if (m11[i14] > 0) {
                    c10 = c10.q().d(eVar.f4490w[m11[i14] / 2]);
                } else if (m11[i14] < 0) {
                    c10 = c10.q().e(eVar.f4490w[(-m11[i14]) / 2]);
                }
                a13 = c10.p();
                i14--;
            }
            byte[] n10 = a13.n();
            for (int i15 = 0; i15 < n10.length; i15++) {
                if (n10[i15] != bArr[i15]) {
                    return false;
                }
            }
            return true;
        }
        throw new SignatureException("signature length is wrong");
    }

    public final Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public final void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        b();
        if (privateKey instanceof b) {
            b bVar = (b) privateKey;
            this.f8989c = bVar;
            if (this.f8987a == null) {
                try {
                    this.f8987a = MessageDigest.getInstance(bVar.a().f5113b);
                } catch (NoSuchAlgorithmException unused) {
                    throw new InvalidKeyException(android.support.v4.media.a.e(a.a.d("cannot get required digest "), this.f8989c.a().f5113b, " for private key."));
                }
            } else if (!bVar.a().f5113b.equals(this.f8987a.getAlgorithm())) {
                throw new InvalidKeyException("Key hash algorithm does not match chosen digest");
            }
            a(bVar);
            return;
        }
        StringBuilder d10 = a.a.d("cannot identify EdDSA private key: ");
        d10.append(privateKey.getClass());
        throw new InvalidKeyException(d10.toString());
    }

    public final void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        b();
        if (publicKey instanceof c) {
            c cVar = (c) publicKey;
            this.f8989c = cVar;
            MessageDigest messageDigest = this.f8987a;
            if (messageDigest == null) {
                try {
                    this.f8987a = MessageDigest.getInstance(cVar.f3455s.f5113b);
                } catch (NoSuchAlgorithmException unused) {
                    throw new InvalidKeyException(android.support.v4.media.a.e(a.a.d("cannot get required digest "), this.f8989c.a().f5113b, " for private key."));
                }
            } else if (!cVar.f3455s.f5113b.equals(messageDigest.getAlgorithm())) {
                throw new InvalidKeyException("Key hash algorithm does not match chosen digest");
            }
        } else if (publicKey instanceof X509Key) {
            try {
                engineInitVerify(new c(new X509EncodedKeySpec(publicKey.getEncoded())));
            } catch (InvalidKeySpecException unused2) {
                StringBuilder d10 = a.a.d("cannot handle X.509 EdDSA public key: ");
                d10.append(publicKey.getAlgorithm());
                throw new InvalidKeyException(d10.toString());
            }
        } else {
            StringBuilder d11 = a.a.d("cannot identify EdDSA public key: ");
            d11.append(publicKey.getClass());
            throw new InvalidKeyException(d11.toString());
        }
    }

    public final void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (!algorithmParameterSpec.equals(f8986h)) {
            super.engineSetParameter(algorithmParameterSpec);
        } else if (this.f8991e != null || ((byteArrayOutputStream = this.f8988b) != null && byteArrayOutputStream.size() > 0)) {
            throw new InvalidAlgorithmParameterException("update() already called");
        } else {
            this.f8990d = true;
        }
    }

    public final byte[] engineSign() throws SignatureException {
        try {
            return c();
        } finally {
            b();
            a((b) this.f8989c);
        }
    }

    public final void engineUpdate(byte b10) throws SignatureException {
        if (!this.f8990d) {
            if (this.f8988b == null) {
                this.f8988b = new ByteArrayOutputStream(256);
            }
            this.f8988b.write(b10);
            return;
        }
        throw new SignatureException("unsupported in one-shot mode");
    }

    public final boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            return d(bArr);
        } finally {
            b();
        }
    }

    public final void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public final void engineUpdate(byte[] bArr, int i, int i10) throws SignatureException {
        if (!this.f8990d) {
            if (this.f8988b == null) {
                this.f8988b = new ByteArrayOutputStream(256);
            }
            this.f8988b.write(bArr, i, i10);
        } else if (this.f8991e == null) {
            this.f8991e = bArr;
            this.f8992f = i;
            this.g = i10;
        } else {
            throw new SignatureException("update() already called");
        }
    }
}
