package y0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import b9.m;
import com.github.mikephil.charting.BuildConfig;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public final class a {
    public static final byte[] A = {73, 69, 78, 68};
    public static final byte[] B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};
    public static final String[] E = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] F = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] G = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final d H = new d("StripOffsets", 273, 3);
    public static final d[][] I;
    public static final d[] J = {new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashMap<Integer, d>[] K = new HashMap[10];
    public static final HashMap<String, d>[] L = new HashMap[10];
    public static final HashSet<String> M = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap<Integer, Integer> N = new HashMap<>();
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f13327m = Log.isLoggable("ExifInterface", 3);

    /* renamed from: n  reason: collision with root package name */
    public static final List<Integer> f13328n = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: o  reason: collision with root package name */
    public static final List<Integer> f13329o = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f13330p = {8, 8, 8};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f13331q = {8};

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f13332r = {-1, -40, -1};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f13333s = {102, 116, 121, 112};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f13334t = {109, 105, 102, 49};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f13335u = {104, 101, 105, 99};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f13336v = {79, 76, 89, 77, 80, 0};

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f13337w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f13338x = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f13339y = {101, 88, 73, 102};
    public static final byte[] z = {73, 72, 68, 82};

    /* renamed from: a  reason: collision with root package name */
    public FileDescriptor f13340a;

    /* renamed from: b  reason: collision with root package name */
    public AssetManager.AssetInputStream f13341b;

    /* renamed from: c  reason: collision with root package name */
    public int f13342c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, c>[] f13343d;

    /* renamed from: e  reason: collision with root package name */
    public Set<Integer> f13344e;

    /* renamed from: f  reason: collision with root package name */
    public ByteOrder f13345f = ByteOrder.BIG_ENDIAN;
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public int f13346h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f13347j;

    /* renamed from: k  reason: collision with root package name */
    public int f13348k;

    /* renamed from: l  reason: collision with root package name */
    public int f13349l;

    /* renamed from: y0.a$a  reason: collision with other inner class name */
    public class C0257a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        public long f13350a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f13351b;

        public C0257a(b bVar) {
            this.f13351b = bVar;
        }

        public final void close() throws IOException {
        }

        public final long getSize() throws IOException {
            return -1;
        }

        public final int readAt(long j10, byte[] bArr, int i, int i10) throws IOException {
            if (i10 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f13350a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f13351b.available())) {
                        return -1;
                    }
                    this.f13351b.c(j10);
                    this.f13350a = j10;
                }
                if (i10 > this.f13351b.available()) {
                    i10 = this.f13351b.available();
                }
                int read = this.f13351b.read(bArr, i, i10);
                if (read >= 0) {
                    this.f13350a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f13350a = -1;
            return -1;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f13358a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13359b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f13360c;

        public c(int i, int i10, byte[] bArr) {
            this(i, i10, -1, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + 0).getBytes(a.O);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            long[] jArr = {j10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.F[4] * 1)]);
            wrap.order(byteOrder);
            for (int i = 0; i < 1; i++) {
                wrap.putInt((int) jArr[i]);
            }
            return new c(4, 1, wrap.array());
        }

        public static c c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.F[5] * 1)]);
            wrap.order(byteOrder);
            for (int i = 0; i < 1; i++) {
                e eVar2 = eVarArr[i];
                wrap.putInt((int) eVar2.f13365a);
                wrap.putInt((int) eVar2.f13366b);
            }
            return new c(5, 1, wrap.array());
        }

        public static c d(int i, ByteOrder byteOrder) {
            int[] iArr = {i};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.F[3] * 1)]);
            wrap.order(byteOrder);
            for (int i10 = 0; i10 < 1; i10++) {
                wrap.putShort((short) iArr[i10]);
            }
            return new c(3, 1, wrap.array());
        }

        public final double e(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (h10 instanceof String) {
                return Double.parseDouble((String) h10);
            } else {
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof double[]) {
                    double[] dArr = (double[]) h10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof e[]) {
                    e[] eVarArr = (e[]) h10;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        return ((double) eVar.f13365a) / ((double) eVar.f13366b);
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public final int f(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (h10 instanceof String) {
                return Integer.parseInt((String) h10);
            } else {
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public final String g(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 == null) {
                return null;
            }
            if (h10 instanceof String) {
                return (String) h10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            if (h10 instanceof long[]) {
                long[] jArr = (long[]) h10;
                while (i < jArr.length) {
                    sb2.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h10 instanceof int[]) {
                int[] iArr = (int[]) h10;
                while (i < iArr.length) {
                    sb2.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h10 instanceof double[]) {
                double[] dArr = (double[]) h10;
                while (i < dArr.length) {
                    sb2.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(h10 instanceof e[])) {
                return null;
            } else {
                e[] eVarArr = (e[]) h10;
                while (i < eVarArr.length) {
                    sb2.append(eVarArr[i].f13365a);
                    sb2.append('/');
                    sb2.append(eVarArr[i].f13366b);
                    i++;
                    if (i != eVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:164:0x019e A[SYNTHETIC, Splitter:B:164:0x019e] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object h(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                y0.a$b r3 = new y0.a$b     // Catch:{ IOException -> 0x0188, all -> 0x0186 }
                byte[] r4 = r10.f13360c     // Catch:{ IOException -> 0x0188, all -> 0x0186 }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0188, all -> 0x0186 }
                r3.f13355b = r11     // Catch:{ IOException -> 0x0184 }
                int r11 = r10.f13358a     // Catch:{ IOException -> 0x0184 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0147;
                    case 2: goto L_0x00fc;
                    case 3: goto L_0x00e2;
                    case 4: goto L_0x00c8;
                    case 5: goto L_0x00a5;
                    case 6: goto L_0x0147;
                    case 7: goto L_0x00fc;
                    case 8: goto L_0x008b;
                    case 9: goto L_0x0071;
                    case 10: goto L_0x004c;
                    case 11: goto L_0x0031;
                    case 12: goto L_0x0017;
                    default: goto L_0x0015;
                }     // Catch:{ IOException -> 0x0184 }
            L_0x0015:
                goto L_0x017b
            L_0x0017:
                int r11 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x001b:
                int r4 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x0028
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x001b
            L_0x0028:
                r3.close()     // Catch:{ IOException -> 0x002c }
                goto L_0x0030
            L_0x002c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0030:
                return r11
            L_0x0031:
                int r11 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x0035:
                int r4 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x0043
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0184 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x0035
            L_0x0043:
                r3.close()     // Catch:{ IOException -> 0x0047 }
                goto L_0x004b
            L_0x0047:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004b:
                return r11
            L_0x004c:
                int r11 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                y0.a$e[] r11 = new y0.a.e[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x0050:
                int r4 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x0068
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0184 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0184 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0184 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0184 }
                y0.a$e r4 = new y0.a$e     // Catch:{ IOException -> 0x0184 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x0050
            L_0x0068:
                r3.close()     // Catch:{ IOException -> 0x006c }
                goto L_0x0070
            L_0x006c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0070:
                return r11
            L_0x0071:
                int r11 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x0075:
                int r4 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x0082
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x0075
            L_0x0082:
                r3.close()     // Catch:{ IOException -> 0x0086 }
                goto L_0x008a
            L_0x0086:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008a:
                return r11
            L_0x008b:
                int r11 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x008f:
                int r4 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x009c
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x008f
            L_0x009c:
                r3.close()     // Catch:{ IOException -> 0x00a0 }
                goto L_0x00a4
            L_0x00a0:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a4:
                return r11
            L_0x00a5:
                int r11 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                y0.a$e[] r11 = new y0.a.e[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x00a9:
                int r4 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x00bf
                long r6 = r3.a()     // Catch:{ IOException -> 0x0184 }
                long r8 = r3.a()     // Catch:{ IOException -> 0x0184 }
                y0.a$e r4 = new y0.a$e     // Catch:{ IOException -> 0x0184 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x00a9
            L_0x00bf:
                r3.close()     // Catch:{ IOException -> 0x00c3 }
                goto L_0x00c7
            L_0x00c3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c7:
                return r11
            L_0x00c8:
                int r11 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x00cc:
                int r4 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x00d9
                long r6 = r3.a()     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x00cc
            L_0x00d9:
                r3.close()     // Catch:{ IOException -> 0x00dd }
                goto L_0x00e1
            L_0x00dd:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e1:
                return r11
            L_0x00e2:
                int r11 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0184 }
            L_0x00e6:
                int r4 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x00f3
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0184 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0184 }
                int r5 = r5 + 1
                goto L_0x00e6
            L_0x00f3:
                r3.close()     // Catch:{ IOException -> 0x00f7 }
                goto L_0x00fb
            L_0x00f7:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fb:
                return r11
            L_0x00fc:
                int r11 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                byte[] r6 = y0.a.G     // Catch:{ IOException -> 0x0184 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0184 }
                if (r11 < r6) goto L_0x0119
                r11 = r5
            L_0x0104:
                byte[] r6 = y0.a.G     // Catch:{ IOException -> 0x0184 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0184 }
                if (r11 >= r7) goto L_0x0116
                byte[] r7 = r10.f13360c     // Catch:{ IOException -> 0x0184 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0184 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0184 }
                if (r7 == r8) goto L_0x0113
                r4 = r5
                goto L_0x0116
            L_0x0113:
                int r11 = r11 + 1
                goto L_0x0104
            L_0x0116:
                if (r4 == 0) goto L_0x0119
                int r5 = r6.length     // Catch:{ IOException -> 0x0184 }
            L_0x0119:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0184 }
                r11.<init>()     // Catch:{ IOException -> 0x0184 }
            L_0x011e:
                int r4 = r10.f13359b     // Catch:{ IOException -> 0x0184 }
                if (r5 >= r4) goto L_0x013a
                byte[] r4 = r10.f13360c     // Catch:{ IOException -> 0x0184 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0184 }
                if (r4 != 0) goto L_0x0129
                goto L_0x013a
            L_0x0129:
                r6 = 32
                if (r4 < r6) goto L_0x0132
                char r4 = (char) r4     // Catch:{ IOException -> 0x0184 }
                r11.append(r4)     // Catch:{ IOException -> 0x0184 }
                goto L_0x0137
            L_0x0132:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0184 }
            L_0x0137:
                int r5 = r5 + 1
                goto L_0x011e
            L_0x013a:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0184 }
                r3.close()     // Catch:{ IOException -> 0x0142 }
                goto L_0x0146
            L_0x0142:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0146:
                return r11
            L_0x0147:
                byte[] r11 = r10.f13360c     // Catch:{ IOException -> 0x0184 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0184 }
                if (r6 != r4) goto L_0x016b
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0184 }
                if (r6 < 0) goto L_0x016b
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0184 }
                if (r6 > r4) goto L_0x016b
                java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0184 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0184 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0184 }
                int r11 = r11 + 48
                char r11 = (char) r11     // Catch:{ IOException -> 0x0184 }
                r4[r5] = r11     // Catch:{ IOException -> 0x0184 }
                r6.<init>(r4)     // Catch:{ IOException -> 0x0184 }
                r3.close()     // Catch:{ IOException -> 0x0166 }
                goto L_0x016a
            L_0x0166:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x016a:
                return r6
            L_0x016b:
                java.lang.String r4 = new java.lang.String     // Catch:{ IOException -> 0x0184 }
                java.nio.charset.Charset r5 = y0.a.O     // Catch:{ IOException -> 0x0184 }
                r4.<init>(r11, r5)     // Catch:{ IOException -> 0x0184 }
                r3.close()     // Catch:{ IOException -> 0x0176 }
                goto L_0x017a
            L_0x0176:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x017a:
                return r4
            L_0x017b:
                r3.close()     // Catch:{ IOException -> 0x017f }
                goto L_0x0183
            L_0x017f:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0183:
                return r2
            L_0x0184:
                r11 = move-exception
                goto L_0x018a
            L_0x0186:
                r11 = move-exception
                goto L_0x019c
            L_0x0188:
                r11 = move-exception
                r3 = r2
            L_0x018a:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019a }
                if (r3 == 0) goto L_0x0199
                r3.close()     // Catch:{ IOException -> 0x0195 }
                goto L_0x0199
            L_0x0195:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0199:
                return r2
            L_0x019a:
                r11 = move-exception
                r2 = r3
            L_0x019c:
                if (r2 == 0) goto L_0x01a6
                r2.close()     // Catch:{ IOException -> 0x01a2 }
                goto L_0x01a6
            L_0x01a2:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01a6:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.a.c.h(java.nio.ByteOrder):java.lang.Object");
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("(");
            d10.append(a.E[this.f13358a]);
            d10.append(", data length:");
            return androidx.activity.result.d.c(d10, this.f13360c.length, ")");
        }

        public c(int i, int i10, long j10, byte[] bArr) {
            this.f13358a = i;
            this.f13359b = i10;
            this.f13360c = bArr;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f13365a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13366b;

        public e(long j10, long j11) {
            if (j11 == 0) {
                this.f13365a = 0;
                this.f13366b = 1;
                return;
            }
            this.f13365a = j10;
            this.f13366b = j11;
        }

        public final String toString() {
            return this.f13365a + "/" + this.f13366b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        "XMP ".getBytes(Charset.defaultCharset());
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256), new d("ImageLength", 257), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278), new d("StripByteCounts", 279), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        I = new d[][]{dVarArr, new d[]{new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962), new d("PixelYDimension", 40963), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720)}, new d[]{new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)}, new d[]{new d("InteroperabilityIndex", 1, 2)}, new d[]{new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256), new d("ThumbnailImageLength", 257), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278), new d("StripByteCounts", 279), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720)}, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        Charset forName = Charset.forName("US-ASCII");
        O = forName;
        P = "Exif\u0000\u0000".getBytes(forName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr2 = I;
            if (i10 < dVarArr2.length) {
                K[i10] = new HashMap<>();
                L[i10] = new HashMap<>();
                for (d dVar : dVarArr2[i10]) {
                    K[i10].put(Integer.valueOf(dVar.f13361a), dVar);
                    L[i10].put(dVar.f13362b, dVar);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = N;
                d[] dVarArr3 = J;
                hashMap.put(Integer.valueOf(dVarArr3[0].f13361a), 5);
                hashMap.put(Integer.valueOf(dVarArr3[1].f13361a), 1);
                hashMap.put(Integer.valueOf(dVarArr3[2].f13361a), 2);
                hashMap.put(Integer.valueOf(dVarArr3[3].f13361a), 3);
                hashMap.put(Integer.valueOf(dVarArr3[4].f13361a), 7);
                hashMap.put(Integer.valueOf(dVarArr3[5].f13361a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public a(InputStream inputStream) throws IOException {
        boolean z10;
        d[][] dVarArr = I;
        this.f13343d = new HashMap[dVarArr.length];
        this.f13344e = new HashSet(dVarArr.length);
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f13341b = (AssetManager.AssetInputStream) inputStream;
            this.f13340a = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                    z10 = true;
                } catch (Exception unused) {
                    if (f13327m) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z10 = false;
                }
                if (z10) {
                    this.f13341b = null;
                    this.f13340a = fileInputStream.getFD();
                }
            }
            this.f13341b = null;
            this.f13340a = null;
        }
        int i10 = 0;
        while (i10 < I.length) {
            try {
                this.f13343d[i10] = new HashMap<>();
                i10++;
            } catch (IOException e10) {
                boolean z11 = f13327m;
                if (z11) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                }
                a();
                if (!z11) {
                    return;
                }
            } catch (Throwable th2) {
                a();
                if (f13327m) {
                    r();
                }
                throw th2;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f13342c = h(bufferedInputStream);
        b bVar = new b((InputStream) bufferedInputStream);
        switch (this.f13342c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                l(bVar);
                break;
            case 4:
                g(bVar, 0, 0);
                break;
            case 7:
                i(bVar);
                break;
            case 9:
                k(bVar);
                break;
            case 10:
                m(bVar);
                break;
            case 12:
                f(bVar);
                break;
            case 13:
                j(bVar);
                break;
            case 14:
                n(bVar);
                break;
        }
        v(bVar);
        a();
        if (!f13327m) {
            return;
        }
        r();
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i10])}));
        }
        return sb2.toString();
    }

    public static long[] c(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = (long) iArr[i10];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public static boolean w(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        String d10 = d("DateTimeOriginal");
        if (d10 != null && d("DateTime") == null) {
            this.f13343d[0].put("DateTime", c.a(d10));
        }
        if (d("ImageWidth") == null) {
            this.f13343d[0].put("ImageWidth", c.b(0, this.f13345f));
        }
        if (d("ImageLength") == null) {
            this.f13343d[0].put("ImageLength", c.b(0, this.f13345f));
        }
        if (d("Orientation") == null) {
            this.f13343d[0].put("Orientation", c.b(0, this.f13345f));
        }
        if (d("LightSource") == null) {
            this.f13343d[1].put("LightSource", c.b(0, this.f13345f));
        }
    }

    public final String d(String str) {
        c e10 = e(str);
        if (e10 != null) {
            if (!M.contains(str)) {
                return e10.g(this.f13345f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = e10.f13358a;
                if (i10 == 5 || i10 == 10) {
                    e[] eVarArr = (e[]) e10.h(this.f13345f);
                    if (eVarArr == null || eVarArr.length != 3) {
                        StringBuilder d10 = a.a.d("Invalid GPS Timestamp array. array=");
                        d10.append(Arrays.toString(eVarArr));
                        Log.w("ExifInterface", d10.toString());
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) eVarArr[0].f13365a) / ((float) eVarArr[0].f13366b))), Integer.valueOf((int) (((float) eVarArr[1].f13365a) / ((float) eVarArr[1].f13366b))), Integer.valueOf((int) (((float) eVarArr[2].f13365a) / ((float) eVarArr[2].f13366b)))});
                }
                StringBuilder d11 = a.a.d("GPS Timestamp format is not rational. format=");
                d11.append(e10.f13358a);
                Log.w("ExifInterface", d11.toString());
                return null;
            }
            try {
                return Double.toString(e10.e(this.f13345f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f13327m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < I.length; i10++) {
            c cVar = this.f13343d[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void f(b bVar) throws IOException {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0257a(bVar));
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str3 = null;
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str3 != null) {
                this.f13343d[0].put("ImageWidth", c.d(Integer.parseInt(str3), this.f13345f));
            }
            if (str2 != null) {
                this.f13343d[0].put("ImageLength", c.d(Integer.parseInt(str2), this.f13345f));
            }
            if (str != null) {
                int i10 = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i10 = 6;
                } else if (parseInt == 180) {
                    i10 = 3;
                } else if (parseInt == 270) {
                    i10 = 8;
                }
                this.f13343d[0].put("Orientation", c.d(i10, this.f13345f));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    bVar.c((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (bVar.read(bArr) == 6) {
                        int i11 = parseInt2 + 6;
                        int i12 = parseInt3 - 6;
                        if (Arrays.equals(bArr, P)) {
                            byte[] bArr2 = new byte[i12];
                            if (bVar.read(bArr2) == i12) {
                                this.f13346h = i11;
                                t(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (f13327m) {
                Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str2 + ", rotation " + str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(y0.a.b r19, int r20, int r21) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = f13327m
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0022
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "getJpegAttributes starting with: "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0022:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f13355b = r4
            long r6 = (long) r2
            r1.c(r6)
            byte r4 = r19.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r4 != r7) goto L_0x01ba
            r8 = 1
            int r2 = r2 + r8
            byte r9 = r19.readByte()
            r10 = -40
            if (r9 != r10) goto L_0x01a3
            int r2 = r2 + r8
        L_0x003e:
            byte r4 = r19.readByte()
            if (r4 != r7) goto L_0x018a
            int r2 = r2 + r8
            byte r4 = r19.readByte()
            boolean r6 = f13327m
            if (r6 == 0) goto L_0x0063
            java.lang.String r7 = "Found JPEG segment indicator: "
            java.lang.StringBuilder r7 = a.a.d(r7)
            r9 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L_0x0063:
            int r2 = r2 + r8
            r7 = -39
            if (r4 == r7) goto L_0x0185
            r7 = -38
            if (r4 != r7) goto L_0x006e
            goto L_0x0185
        L_0x006e:
            int r7 = r19.readUnsignedShort()
            r9 = -2
            int r7 = r7 + r9
            int r2 = r2 + 2
            if (r6 == 0) goto L_0x009d
            java.lang.String r6 = "JPEG segment: "
            java.lang.StringBuilder r6 = a.a.d(r6)
            r10 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r6.append(r10)
            java.lang.String r10 = " (length: "
            r6.append(r10)
            int r10 = r7 + 2
            r6.append(r10)
            java.lang.String r10 = ")"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x009d:
            java.lang.String r6 = "Invalid length"
            if (r7 < 0) goto L_0x017f
            r10 = -31
            r11 = 0
            if (r4 == r10) goto L_0x011c
            if (r4 == r9) goto L_0x00f0
            switch(r4) {
                case -64: goto L_0x00b6;
                case -63: goto L_0x00b6;
                case -62: goto L_0x00b6;
                case -61: goto L_0x00b6;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            switch(r4) {
                case -59: goto L_0x00b6;
                case -58: goto L_0x00b6;
                case -57: goto L_0x00b6;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            switch(r4) {
                case -55: goto L_0x00b6;
                case -54: goto L_0x00b6;
                case -53: goto L_0x00b6;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            switch(r4) {
                case -51: goto L_0x00b6;
                case -50: goto L_0x00b6;
                case -49: goto L_0x00b6;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            goto L_0x0164
        L_0x00b6:
            int r4 = r1.skipBytes(r8)
            if (r4 != r8) goto L_0x00e8
            java.util.HashMap<java.lang.String, y0.a$c>[] r4 = r0.f13343d
            r4 = r4[r3]
            int r8 = r19.readUnsignedShort()
            long r8 = (long) r8
            java.nio.ByteOrder r10 = r0.f13345f
            y0.a$c r8 = y0.a.c.b(r8, r10)
            java.lang.String r9 = "ImageLength"
            r4.put(r9, r8)
            java.util.HashMap<java.lang.String, y0.a$c>[] r4 = r0.f13343d
            r4 = r4[r3]
            int r8 = r19.readUnsignedShort()
            long r8 = (long) r8
            java.nio.ByteOrder r10 = r0.f13345f
            y0.a$c r8 = y0.a.c.b(r8, r10)
            java.lang.String r9 = "ImageWidth"
            r4.put(r9, r8)
            int r7 = r7 + -5
            goto L_0x0164
        L_0x00e8:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        L_0x00f0:
            byte[] r4 = new byte[r7]
            int r9 = r1.read(r4)
            if (r9 != r7) goto L_0x0114
            java.lang.String r7 = "UserComment"
            java.lang.String r9 = r0.d(r7)
            if (r9 != 0) goto L_0x0112
            java.util.HashMap<java.lang.String, y0.a$c>[] r9 = r0.f13343d
            r8 = r9[r8]
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = O
            r9.<init>(r4, r10)
            y0.a$c r4 = y0.a.c.a(r9)
            r8.put(r7, r4)
        L_0x0112:
            r7 = r11
            goto L_0x0164
        L_0x0114:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x011c:
            byte[] r4 = new byte[r7]
            r1.readFully(r4)
            int r8 = r2 + r7
            byte[] r9 = P
            boolean r10 = w(r4, r9)
            if (r10 == 0) goto L_0x0138
            int r10 = r9.length
            int r2 = r2 + r10
            int r9 = r9.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r9, r7)
            r0.f13346h = r2
            r0.t(r4, r3)
            goto L_0x0162
        L_0x0138:
            byte[] r9 = Q
            boolean r10 = w(r4, r9)
            if (r10 == 0) goto L_0x0162
            int r10 = r9.length
            int r2 = r2 + r10
            int r9 = r9.length
            byte[] r4 = java.util.Arrays.copyOfRange(r4, r9, r7)
            java.lang.String r7 = "Xmp"
            java.lang.String r9 = r0.d(r7)
            if (r9 != 0) goto L_0x0162
            java.util.HashMap<java.lang.String, y0.a$c>[] r9 = r0.f13343d
            r9 = r9[r11]
            y0.a$c r10 = new y0.a$c
            r13 = 1
            int r14 = r4.length
            long r11 = (long) r2
            r15 = r11
            r12 = r10
            r17 = r4
            r12.<init>(r13, r14, r15, r17)
            r9.put(r7, r10)
        L_0x0162:
            r7 = 0
            r2 = r8
        L_0x0164:
            if (r7 < 0) goto L_0x0179
            int r4 = r1.skipBytes(r7)
            if (r4 != r7) goto L_0x0171
            int r2 = r2 + r7
            r7 = -1
            r8 = 1
            goto L_0x003e
        L_0x0171:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L_0x0179:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x017f:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x0185:
            java.nio.ByteOrder r2 = r0.f13345f
            r1.f13355b = r2
            return
        L_0x018a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid marker:"
            java.lang.StringBuilder r2 = a.a.d(r2)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01a3:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = a.a.d(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01ba:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = a.a.d(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.a.g(y0.a$b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cf, code lost:
        if (r8 == null) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0143 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8 A[Catch:{ all -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0111 A[SYNTHETIC, Splitter:B:99:0x0111] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(java.io.BufferedInputStream r18) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r18.reset()
            r4 = 0
            r0 = r4
        L_0x0013:
            byte[] r5 = f13332r
            int r6 = r5.length
            if (r0 >= r6) goto L_0x0023
            byte r6 = r3[r0]
            byte r5 = r5[r0]
            if (r6 == r5) goto L_0x0020
            r0 = r4
            goto L_0x0024
        L_0x0020:
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0023:
            r0 = 1
        L_0x0024:
            r5 = 4
            if (r0 == 0) goto L_0x0028
            return r5
        L_0x0028:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r6 = "FUJIFILMCCD-RAW"
            byte[] r0 = r6.getBytes(r0)
            r6 = r4
        L_0x0033:
            int r8 = r0.length
            if (r6 >= r8) goto L_0x0041
            byte r8 = r3[r6]
            byte r9 = r0[r6]
            if (r8 == r9) goto L_0x003e
            r0 = r4
            goto L_0x0042
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0041:
            r0 = 1
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            r0 = 9
            return r0
        L_0x0047:
            y0.a$b r8 = new y0.a$b     // Catch:{ Exception -> 0x00c2, all -> 0x00be }
            r8.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00c2, all -> 0x00be }
            int r0 = r8.readInt()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            long r9 = (long) r0     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r8.read(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r11 = f13333s     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r0 != 0) goto L_0x0060
            goto L_0x00d1
        L_0x0060:
            r11 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r13 = 16
            r15 = 8
            if (r0 != 0) goto L_0x0074
            long r9 = r8.readLong()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            goto L_0x00d1
        L_0x0074:
            r13 = r15
        L_0x0075:
            long r6 = (long) r2     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            r9 = r6
        L_0x007b:
            long r9 = r9 - r13
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0081
            goto L_0x00d1
        L_0x0081:
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r6 = 0
            r2 = r4
            r13 = r2
        L_0x0087:
            r14 = 4
            long r14 = r9 / r14
            int r14 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x00d1
            int r14 = r8.read(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == r5) goto L_0x0096
            goto L_0x00d1
        L_0x0096:
            int r14 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x009b
            goto L_0x00b7
        L_0x009b:
            byte[] r14 = f13334t     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00a5
            r2 = 1
            goto L_0x00ae
        L_0x00a5:
            byte[] r14 = f13335u     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r14 == 0) goto L_0x00ae
            r13 = 1
        L_0x00ae:
            if (r2 == 0) goto L_0x00b7
            if (r13 == 0) goto L_0x00b7
            r8.close()
            r0 = 1
            goto L_0x00d5
        L_0x00b7:
            long r6 = r6 + r11
            goto L_0x0087
        L_0x00b9:
            r0 = move-exception
            goto L_0x018d
        L_0x00bc:
            r0 = move-exception
            goto L_0x00c4
        L_0x00be:
            r0 = move-exception
            r6 = 0
            goto L_0x018c
        L_0x00c2:
            r0 = move-exception
            r8 = 0
        L_0x00c4:
            boolean r2 = f13327m     // Catch:{ all -> 0x018a }
            if (r2 == 0) goto L_0x00cf
            java.lang.String r2 = "ExifInterface"
            java.lang.String r6 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r6, r0)     // Catch:{ all -> 0x018a }
        L_0x00cf:
            if (r8 == 0) goto L_0x00d4
        L_0x00d1:
            r8.close()
        L_0x00d4:
            r0 = r4
        L_0x00d5:
            if (r0 == 0) goto L_0x00da
            r0 = 12
            return r0
        L_0x00da:
            y0.a$b r2 = new y0.a$b     // Catch:{ Exception -> 0x0106, all -> 0x00fe }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0106, all -> 0x00fe }
            java.nio.ByteOrder r0 = r1.s(r2)     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r1.f13345f = r0     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r2.f13355b = r0     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0107, all -> 0x00fb }
            r6 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r6) goto L_0x00f6
            r6 = 21330(0x5352, float:2.989E-41)
            if (r0 != r6) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r0 = r4
            goto L_0x00f7
        L_0x00f6:
            r0 = 1
        L_0x00f7:
            r2.close()
            goto L_0x010d
        L_0x00fb:
            r0 = move-exception
            r6 = r2
            goto L_0x0100
        L_0x00fe:
            r0 = move-exception
            r6 = 0
        L_0x0100:
            if (r6 == 0) goto L_0x0105
            r6.close()
        L_0x0105:
            throw r0
        L_0x0106:
            r2 = 0
        L_0x0107:
            if (r2 == 0) goto L_0x010c
            r2.close()
        L_0x010c:
            r0 = r4
        L_0x010d:
            if (r0 == 0) goto L_0x0111
            r0 = 7
            return r0
        L_0x0111:
            y0.a$b r2 = new y0.a$b     // Catch:{ Exception -> 0x013a, all -> 0x0132 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x013a, all -> 0x0132 }
            java.nio.ByteOrder r0 = r1.s(r2)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r1.f13345f = r0     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r2.f13355b = r0     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0130, all -> 0x012d }
            r6 = 85
            if (r0 != r6) goto L_0x0128
            r0 = 1
            goto L_0x0129
        L_0x0128:
            r0 = r4
        L_0x0129:
            r2.close()
            goto L_0x0141
        L_0x012d:
            r0 = move-exception
            r6 = r2
            goto L_0x0134
        L_0x0130:
            r6 = r2
            goto L_0x013b
        L_0x0132:
            r0 = move-exception
            r6 = 0
        L_0x0134:
            if (r6 == 0) goto L_0x0139
            r6.close()
        L_0x0139:
            throw r0
        L_0x013a:
            r6 = 0
        L_0x013b:
            if (r6 == 0) goto L_0x0140
            r6.close()
        L_0x0140:
            r0 = r4
        L_0x0141:
            if (r0 == 0) goto L_0x0146
            r0 = 10
            return r0
        L_0x0146:
            r0 = r4
        L_0x0147:
            byte[] r2 = f13338x
            int r6 = r2.length
            if (r0 >= r6) goto L_0x0157
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x0154
            r0 = r4
            goto L_0x0158
        L_0x0154:
            int r0 = r0 + 1
            goto L_0x0147
        L_0x0157:
            r0 = 1
        L_0x0158:
            if (r0 == 0) goto L_0x015d
            r0 = 13
            return r0
        L_0x015d:
            r0 = r4
        L_0x015e:
            byte[] r2 = B
            int r6 = r2.length
            if (r0 >= r6) goto L_0x016d
            byte r6 = r3[r0]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x016a
            goto L_0x017e
        L_0x016a:
            int r0 = r0 + 1
            goto L_0x015e
        L_0x016d:
            r0 = r4
        L_0x016e:
            byte[] r2 = C
            int r6 = r2.length
            if (r0 >= r6) goto L_0x0183
            byte[] r6 = B
            int r6 = r6.length
            int r6 = r6 + r0
            int r6 = r6 + r5
            byte r6 = r3[r6]
            byte r2 = r2[r0]
            if (r6 == r2) goto L_0x0180
        L_0x017e:
            r7 = r4
            goto L_0x0184
        L_0x0180:
            int r0 = r0 + 1
            goto L_0x016e
        L_0x0183:
            r7 = 1
        L_0x0184:
            if (r7 == 0) goto L_0x0189
            r0 = 14
            return r0
        L_0x0189:
            return r4
        L_0x018a:
            r0 = move-exception
            r6 = r8
        L_0x018c:
            r8 = r6
        L_0x018d:
            if (r8 == 0) goto L_0x0192
            r8.close()
        L_0x0192:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.a.h(java.io.BufferedInputStream):int");
    }

    public final void i(b bVar) throws IOException {
        l(bVar);
        c cVar = this.f13343d[1].get("MakerNote");
        if (cVar != null) {
            b bVar2 = new b(cVar.f13360c);
            bVar2.f13355b = this.f13345f;
            byte[] bArr = f13336v;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.c(0);
            byte[] bArr3 = f13337w;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.c(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.c(12);
            }
            u(bVar2, 6);
            c cVar2 = this.f13343d[7].get("PreviewImageStart");
            c cVar3 = this.f13343d[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                this.f13343d[5].put("JPEGInterchangeFormat", cVar2);
                this.f13343d[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f13343d[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.h(this.f13345f);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder d10 = a.a.d("Invalid aspect frame values. frame=");
                    d10.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", d10.toString());
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i10 = (iArr[2] - iArr[0]) + 1;
                    int i11 = (iArr[3] - iArr[1]) + 1;
                    if (i10 < i11) {
                        int i12 = i10 + i11;
                        i11 = i12 - i11;
                        i10 = i12 - i11;
                    }
                    c d11 = c.d(i10, this.f13345f);
                    c d12 = c.d(i11, this.f13345f);
                    this.f13343d[0].put("ImageWidth", d11);
                    this.f13343d[0].put("ImageLength", d12);
                }
            }
        }
    }

    public final void j(b bVar) throws IOException {
        if (f13327m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f13355b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f13338x;
        bVar.skipBytes(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i10 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i11 = i10 + 4;
                    if (i11 == 16) {
                        if (!Arrays.equals(bArr2, z)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, A)) {
                        if (Arrays.equals(bArr2, f13339y)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f13346h = i11;
                                    t(bArr3, 0);
                                    z();
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                        }
                        int i12 = readInt + 4;
                        bVar.skipBytes(i12);
                        length = i11 + i12;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void k(b bVar) throws IOException {
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        bVar.read(bArr);
        bVar.skipBytes(4);
        bVar.read(bArr2);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        g(bVar, i10, 5);
        bVar.c((long) i11);
        bVar.f13355b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (f13327m) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == H.f13361a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c d10 = c.d(readShort, this.f13345f);
                c d11 = c.d(readShort2, this.f13345f);
                this.f13343d[0].put("ImageLength", d10);
                this.f13343d[0].put("ImageWidth", d11);
                if (f13327m) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.skipBytes(readUnsignedShort2);
        }
    }

    public final void l(b bVar) throws IOException {
        c cVar;
        q(bVar, bVar.available());
        u(bVar, 0);
        y(bVar, 0);
        y(bVar, 5);
        y(bVar, 4);
        z();
        if (this.f13342c == 8 && (cVar = this.f13343d[1].get("MakerNote")) != null) {
            b bVar2 = new b(cVar.f13360c);
            bVar2.f13355b = this.f13345f;
            bVar2.c(6);
            u(bVar2, 9);
            c cVar2 = this.f13343d[9].get("ColorSpace");
            if (cVar2 != null) {
                this.f13343d[1].put("ColorSpace", cVar2);
            }
        }
    }

    public final void m(b bVar) throws IOException {
        l(bVar);
        if (this.f13343d[0].get("JpgFromRaw") != null) {
            g(bVar, this.f13349l, 5);
        }
        c cVar = this.f13343d[0].get("ISO");
        c cVar2 = this.f13343d[1].get("PhotographicSensitivity");
        if (cVar != null && cVar2 == null) {
            this.f13343d[1].put("PhotographicSensitivity", cVar);
        }
    }

    public final void n(b bVar) throws IOException {
        if (f13327m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f13355b = ByteOrder.LITTLE_ENDIAN;
        bVar.skipBytes(B.length);
        int readInt = bVar.readInt() + 8;
        int skipBytes = bVar.skipBytes(C.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) == 4) {
                    int readInt2 = bVar.readInt();
                    int i10 = skipBytes + 4 + 4;
                    if (Arrays.equals(D, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (bVar.read(bArr2) == readInt2) {
                            this.f13346h = i10;
                            t(bArr2, 0);
                            this.f13346h = i10;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i11 = i10 + readInt2;
                    if (i11 != readInt) {
                        if (i11 <= readInt) {
                            int skipBytes2 = bVar.skipBytes(readInt2);
                            if (skipBytes2 == readInt2) {
                                skipBytes = i10 + skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void o(b bVar, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f10 = cVar.f(this.f13345f);
            int f11 = cVar2.f(this.f13345f);
            if (this.f13342c == 7) {
                f10 += this.i;
            }
            int min = Math.min(f11, bVar.f13356c - f10);
            if (f10 > 0 && min > 0) {
                int i10 = this.f13346h + f10;
                if (this.f13341b == null && this.f13340a == null) {
                    bVar.c((long) i10);
                    bVar.readFully(new byte[min]);
                }
            }
            if (f13327m) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f10 + ", length: " + min);
            }
        }
    }

    public final boolean p(HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.f(this.f13345f) <= 512 && cVar2.f(this.f13345f) <= 512;
    }

    public final void q(b bVar, int i10) throws IOException {
        ByteOrder s10 = s(bVar);
        this.f13345f = s10;
        bVar.f13355b = s10;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i11 = this.f13342c;
        if (i11 == 7 || i11 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt < 8 || readInt >= i10) {
                throw new IOException(m.b("Invalid first Ifd offset: ", readInt));
            }
            int i12 = readInt - 8;
            if (i12 > 0 && bVar.skipBytes(i12) != i12) {
                throw new IOException(m.b("Couldn't jump to first Ifd: ", i12));
            }
            return;
        }
        StringBuilder d10 = a.a.d("Invalid start code: ");
        d10.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(d10.toString());
    }

    public final void r() {
        for (int i10 = 0; i10 < this.f13343d.length; i10++) {
            StringBuilder d10 = a8.a.d("The size of tag group[", i10, "]: ");
            d10.append(this.f13343d[i10].size());
            Log.d("ExifInterface", d10.toString());
            for (Map.Entry next : this.f13343d[i10].entrySet()) {
                c cVar = (c) next.getValue();
                StringBuilder d11 = a.a.d("tagName: ");
                d11.append((String) next.getKey());
                d11.append(", tagType: ");
                d11.append(cVar.toString());
                d11.append(", tagValue: '");
                d11.append(cVar.g(this.f13345f));
                d11.append("'");
                Log.d("ExifInterface", d11.toString());
            }
        }
    }

    public final ByteOrder s(b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f13327m) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f13327m) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder d10 = a.a.d("Invalid byte order: ");
            d10.append(Integer.toHexString(readShort));
            throw new IOException(d10.toString());
        }
    }

    public final void t(byte[] bArr, int i10) throws IOException {
        b bVar = new b(bArr);
        q(bVar, bArr.length);
        u(bVar, i10);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r6v27, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(y0.a.b r24, int r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.Set<java.lang.Integer> r3 = r0.f13344e
            int r4 = r1.f13357s
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f13357s
            int r3 = r3 + 2
            int r4 = r1.f13356c
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r24.readShort()
            boolean r4 = f13327m
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0038
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0038:
            int r4 = r1.f13357s
            int r6 = r3 * 12
            int r6 = r6 + r4
            int r4 = r1.f13356c
            if (r6 > r4) goto L_0x0427
            if (r3 > 0) goto L_0x0045
            goto L_0x0427
        L_0x0045:
            r4 = 0
            r6 = r4
        L_0x0047:
            r7 = 5
            if (r4 >= r3) goto L_0x039f
            int r8 = r24.readUnsignedShort()
            int r9 = r24.readUnsignedShort()
            int r12 = r24.readInt()
            int r10 = r1.f13357s
            long r10 = (long) r10
            r13 = 4
            long r10 = r10 + r13
            java.util.HashMap<java.lang.Integer, y0.a$d>[] r15 = K
            r15 = r15[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            java.lang.Object r13 = r15.get(r13)
            r15 = r13
            y0.a$d r15 = (y0.a.d) r15
            boolean r13 = f13327m
            r14 = 3
            if (r13 == 0) goto L_0x00a0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r25)
            r7[r6] = r18
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r18 = 1
            r7[r18] = r6
            if (r15 == 0) goto L_0x0085
            java.lang.String r6 = r15.f13362b
            goto L_0x0086
        L_0x0085:
            r6 = 0
        L_0x0086:
            r18 = 2
            r7[r18] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r7[r14] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r14 = 4
            r7[r14] = r6
            java.lang.String r6 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r6 = java.lang.String.format(r6, r7)
            android.util.Log.d(r5, r6)
        L_0x00a0:
            r6 = 7
            if (r15 != 0) goto L_0x00bd
            if (r13 == 0) goto L_0x00b9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x00b9:
            r18 = r3
            goto L_0x011c
        L_0x00bd:
            if (r9 <= 0) goto L_0x0153
            int[] r7 = F
            int r14 = r7.length
            if (r9 < r14) goto L_0x00c6
            goto L_0x0153
        L_0x00c6:
            int r14 = r15.f13363c
            if (r14 == r6) goto L_0x00f7
            if (r9 != r6) goto L_0x00cd
            goto L_0x00f7
        L_0x00cd:
            if (r14 == r9) goto L_0x00f7
            int r6 = r15.f13364d
            if (r6 != r9) goto L_0x00d4
            goto L_0x00f7
        L_0x00d4:
            r18 = r3
            r3 = 4
            if (r14 == r3) goto L_0x00db
            if (r6 != r3) goto L_0x00df
        L_0x00db:
            r3 = 3
            if (r9 != r3) goto L_0x00df
            goto L_0x00f9
        L_0x00df:
            r3 = 9
            if (r14 == r3) goto L_0x00e5
            if (r6 != r3) goto L_0x00ea
        L_0x00e5:
            r3 = 8
            if (r9 != r3) goto L_0x00ea
            goto L_0x00f9
        L_0x00ea:
            r3 = 12
            if (r14 == r3) goto L_0x00f0
            if (r6 != r3) goto L_0x00f5
        L_0x00f0:
            r3 = 11
            if (r9 != r3) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            r3 = 0
            goto L_0x00fa
        L_0x00f7:
            r18 = r3
        L_0x00f9:
            r3 = 1
        L_0x00fa:
            if (r3 != 0) goto L_0x011f
            if (r13 == 0) goto L_0x011c
            java.lang.String r3 = "Skip the tag entry since data format ("
            java.lang.StringBuilder r3 = a.a.d(r3)
            java.lang.String[] r6 = E
            r6 = r6[r9]
            r3.append(r6)
            java.lang.String r6 = ") is unexpected for tag: "
            r3.append(r6)
            java.lang.String r6 = r15.f13362b
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x011c:
            r19 = r4
            goto L_0x016d
        L_0x011f:
            r3 = 7
            r6 = r4
            if (r9 != r3) goto L_0x0124
            r9 = r14
        L_0x0124:
            long r3 = (long) r12
            r7 = r7[r9]
            r19 = r6
            long r6 = (long) r7
            long r3 = r3 * r6
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x013b
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0139
            goto L_0x013b
        L_0x0139:
            r6 = 1
            goto L_0x0170
        L_0x013b:
            if (r13 == 0) goto L_0x0151
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x0151:
            r6 = 0
            goto L_0x0170
        L_0x0153:
            r18 = r3
            r19 = r4
            if (r13 == 0) goto L_0x016d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x016d:
            r6 = 0
            r3 = 0
        L_0x0170:
            if (r6 != 0) goto L_0x0177
            r1.c(r10)
            goto L_0x023e
        L_0x0177:
            r6 = 4
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            java.lang.String r7 = "Compression"
            if (r6 <= 0) goto L_0x0241
            int r6 = r24.readInt()
            if (r13 == 0) goto L_0x019c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r16 = r9
            java.lang.String r9 = "seek to data offset: "
            r14.append(r9)
            r14.append(r6)
            java.lang.String r9 = r14.toString()
            android.util.Log.d(r5, r9)
            goto L_0x019e
        L_0x019c:
            r16 = r9
        L_0x019e:
            int r9 = r0.f13342c
            r14 = 7
            if (r9 != r14) goto L_0x01fc
            java.lang.String r9 = r15.f13362b
            java.lang.String r14 = "MakerNote"
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x01b0
            r0.i = r6
            goto L_0x01f8
        L_0x01b0:
            r9 = 6
            if (r2 != r9) goto L_0x01f8
            java.lang.String r9 = r15.f13362b
            java.lang.String r14 = "ThumbnailImage"
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x01f8
            r0.f13347j = r6
            r0.f13348k = r12
            java.nio.ByteOrder r9 = r0.f13345f
            r14 = 6
            y0.a$c r9 = y0.a.c.d(r14, r9)
            int r14 = r0.f13347j
            r20 = r10
            long r10 = (long) r14
            java.nio.ByteOrder r14 = r0.f13345f
            y0.a$c r10 = y0.a.c.b(r10, r14)
            int r11 = r0.f13348k
            r14 = r12
            long r11 = (long) r11
            java.nio.ByteOrder r2 = r0.f13345f
            y0.a$c r2 = y0.a.c.b(r11, r2)
            java.util.HashMap<java.lang.String, y0.a$c>[] r11 = r0.f13343d
            r12 = 4
            r11 = r11[r12]
            r11.put(r7, r9)
            java.util.HashMap<java.lang.String, y0.a$c>[] r9 = r0.f13343d
            r9 = r9[r12]
            java.lang.String r11 = "JPEGInterchangeFormat"
            r9.put(r11, r10)
            java.util.HashMap<java.lang.String, y0.a$c>[] r9 = r0.f13343d
            r9 = r9[r12]
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r9.put(r10, r2)
            goto L_0x020f
        L_0x01f8:
            r20 = r10
            r14 = r12
            goto L_0x020f
        L_0x01fc:
            r20 = r10
            r14 = r12
            r2 = 10
            if (r9 != r2) goto L_0x020f
            java.lang.String r2 = r15.f13362b
            java.lang.String r9 = "JpgFromRaw"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x020f
            r0.f13349l = r6
        L_0x020f:
            long r9 = (long) r6
            long r11 = r9 + r3
            int r2 = r1.f13356c
            r22 = r14
            r17 = r15
            long r14 = (long) r2
            int r2 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x0223
            r1.c(r9)
            r10 = r20
            goto L_0x0247
        L_0x0223:
            if (r13 == 0) goto L_0x0239
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x0239:
            r10 = r20
            r1.c(r10)
        L_0x023e:
            r2 = r5
            goto L_0x0394
        L_0x0241:
            r16 = r9
            r22 = r12
            r17 = r15
        L_0x0247:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = N
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r2.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r13 == 0) goto L_0x0271
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "nextIfdType: "
            r6.append(r8)
            r6.append(r2)
            java.lang.String r8 = " byteCount: "
            r6.append(r8)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x0271:
            if (r2 == 0) goto L_0x031e
            r3 = -1
            r6 = 3
            r9 = r16
            if (r9 == r6) goto L_0x0299
            r6 = 4
            if (r9 == r6) goto L_0x0294
            r6 = 8
            if (r9 == r6) goto L_0x028f
            r6 = 9
            if (r9 == r6) goto L_0x028a
            r6 = 13
            if (r9 == r6) goto L_0x028a
            goto L_0x029e
        L_0x028a:
            int r3 = r24.readInt()
            goto L_0x029d
        L_0x028f:
            short r3 = r24.readShort()
            goto L_0x029d
        L_0x0294:
            long r3 = r24.a()
            goto L_0x029e
        L_0x0299:
            int r3 = r24.readUnsignedShort()
        L_0x029d:
            long r3 = (long) r3
        L_0x029e:
            r6 = 2
            if (r13 == 0) goto L_0x02ba
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            r8 = 0
            r6[r8] = r7
            r8 = r17
            java.lang.String r7 = r8.f13362b
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L_0x02ba:
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0303
            int r6 = r1.f13356c
            long r6 = (long) r6
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0303
            java.util.Set<java.lang.Integer> r6 = r0.f13344e
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x02df
            r1.c(r3)
            int r2 = r2.intValue()
            r0.u(r1, r2)
            goto L_0x0319
        L_0x02df:
            if (r13 == 0) goto L_0x0319
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.d(r5, r2)
            goto L_0x0319
        L_0x0303:
            if (r13 == 0) goto L_0x0319
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x0319:
            r1.c(r10)
            goto L_0x023e
        L_0x031e:
            r9 = r16
            r8 = r17
            int r2 = r1.f13357s
            int r6 = r0.f13346h
            int r2 = r2 + r6
            int r3 = (int) r3
            byte[] r15 = new byte[r3]
            r1.readFully(r15)
            y0.a$c r3 = new y0.a$c
            long r13 = (long) r2
            r11 = r10
            r10 = r3
            r2 = r5
            r4 = r11
            r11 = r9
            r12 = r22
            r6 = r8
            r10.<init>(r11, r12, r13, r15)
            java.util.HashMap<java.lang.String, y0.a$c>[] r8 = r0.f13343d
            r8 = r8[r25]
            java.lang.String r9 = r6.f13362b
            r8.put(r9, r3)
            java.lang.String r8 = r6.f13362b
            java.lang.String r9 = "DNGVersion"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0351
            r8 = 3
            r0.f13342c = r8
        L_0x0351:
            java.lang.String r8 = r6.f13362b
            java.lang.String r9 = "Make"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0365
            java.lang.String r8 = r6.f13362b
            java.lang.String r9 = "Model"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x0373
        L_0x0365:
            java.nio.ByteOrder r8 = r0.f13345f
            java.lang.String r8 = r3.g(r8)
            java.lang.String r9 = "PENTAX"
            boolean r8 = r8.contains(r9)
            if (r8 != 0) goto L_0x0386
        L_0x0373:
            java.lang.String r6 = r6.f13362b
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x038a
            java.nio.ByteOrder r6 = r0.f13345f
            int r3 = r3.f(r6)
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r6) goto L_0x038a
        L_0x0386:
            r3 = 8
            r0.f13342c = r3
        L_0x038a:
            int r3 = r1.f13357s
            long r6 = (long) r3
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0394
            r1.c(r4)
        L_0x0394:
            int r4 = r19 + 1
            short r4 = (short) r4
            r6 = 0
            r5 = r2
            r3 = r18
            r2 = r25
            goto L_0x0047
        L_0x039f:
            r2 = r5
            int r3 = r1.f13357s
            int r3 = r3 + 4
            int r4 = r1.f13356c
            if (r3 > r4) goto L_0x0427
            int r3 = r24.readInt()
            boolean r4 = f13327m
            if (r4 == 0) goto L_0x03c3
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r8 = 0
            r5[r8] = r6
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            android.util.Log.d(r2, r5)
        L_0x03c3:
            long r5 = (long) r3
            r8 = 0
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0411
            int r8 = r1.f13356c
            if (r3 >= r8) goto L_0x0411
            java.util.Set<java.lang.Integer> r8 = r0.f13344e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r8 = r8.contains(r9)
            if (r8 != 0) goto L_0x03fa
            r1.c(r5)
            java.util.HashMap<java.lang.String, y0.a$c>[] r2 = r0.f13343d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03ec
            r0.u(r1, r3)
            goto L_0x0427
        L_0x03ec:
            java.util.HashMap<java.lang.String, y0.a$c>[] r2 = r0.f13343d
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0427
            r0.u(r1, r7)
            goto L_0x0427
        L_0x03fa:
            if (r4 == 0) goto L_0x0427
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
            goto L_0x0427
        L_0x0411:
            if (r4 == 0) goto L_0x0427
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L_0x0427:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.a.u(y0.a$b, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(y0.a.b r18) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.HashMap<java.lang.String, y0.a$c>[] r2 = r0.f13343d
            r3 = 4
            r2 = r2[r3]
            java.lang.String r3 = "Compression"
            java.lang.Object r3 = r2.get(r3)
            y0.a$c r3 = (y0.a.c) r3
            if (r3 == 0) goto L_0x0116
            java.nio.ByteOrder r4 = r0.f13345f
            int r3 = r3.f(r4)
            r4 = 1
            r5 = 6
            if (r3 == r4) goto L_0x0029
            if (r3 == r5) goto L_0x0024
            r6 = 7
            if (r3 == r6) goto L_0x0029
            goto L_0x0119
        L_0x0024:
            r0.o(r1, r2)
            goto L_0x0119
        L_0x0029:
            java.lang.String r3 = "BitsPerSample"
            java.lang.Object r3 = r2.get(r3)
            y0.a$c r3 = (y0.a.c) r3
            java.lang.String r6 = "ExifInterface"
            r7 = 0
            if (r3 == 0) goto L_0x0070
            java.nio.ByteOrder r8 = r0.f13345f
            java.lang.Object r3 = r3.h(r8)
            int[] r3 = (int[]) r3
            int[] r8 = f13330p
            boolean r9 = java.util.Arrays.equals(r8, r3)
            if (r9 == 0) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            int r9 = r0.f13342c
            r10 = 3
            if (r9 != r10) goto L_0x0070
            java.lang.String r9 = "PhotometricInterpretation"
            java.lang.Object r9 = r2.get(r9)
            y0.a$c r9 = (y0.a.c) r9
            if (r9 == 0) goto L_0x0070
            java.nio.ByteOrder r10 = r0.f13345f
            int r9 = r9.f(r10)
            if (r9 != r4) goto L_0x0066
            int[] r10 = f13331q
            boolean r10 = java.util.Arrays.equals(r3, r10)
            if (r10 != 0) goto L_0x006e
        L_0x0066:
            if (r9 != r5) goto L_0x0070
            boolean r3 = java.util.Arrays.equals(r3, r8)
            if (r3 == 0) goto L_0x0070
        L_0x006e:
            r3 = r4
            goto L_0x007a
        L_0x0070:
            boolean r3 = f13327m
            if (r3 == 0) goto L_0x0079
            java.lang.String r3 = "Unsupported data type value"
            android.util.Log.d(r6, r3)
        L_0x0079:
            r3 = r7
        L_0x007a:
            if (r3 == 0) goto L_0x0119
            java.lang.String r3 = "StripOffsets"
            java.lang.Object r3 = r2.get(r3)
            y0.a$c r3 = (y0.a.c) r3
            java.lang.String r5 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r5)
            y0.a$c r2 = (y0.a.c) r2
            if (r3 == 0) goto L_0x0119
            if (r2 == 0) goto L_0x0119
            java.nio.ByteOrder r5 = r0.f13345f
            java.lang.Object r3 = r3.h(r5)
            long[] r3 = c(r3)
            java.nio.ByteOrder r5 = r0.f13345f
            java.lang.Object r2 = r2.h(r5)
            long[] r2 = c(r2)
            if (r3 == 0) goto L_0x0110
            int r5 = r3.length
            if (r5 != 0) goto L_0x00ab
            goto L_0x0110
        L_0x00ab:
            if (r2 == 0) goto L_0x010a
            int r5 = r2.length
            if (r5 != 0) goto L_0x00b1
            goto L_0x010a
        L_0x00b1:
            int r5 = r3.length
            int r8 = r2.length
            if (r5 == r8) goto L_0x00bb
            java.lang.String r1 = "stripOffsets and stripByteCounts should have same length."
            android.util.Log.w(r6, r1)
            goto L_0x0119
        L_0x00bb:
            r8 = 0
            int r5 = r2.length
            r10 = r7
        L_0x00bf:
            if (r10 >= r5) goto L_0x00c7
            r11 = r2[r10]
            long r8 = r8 + r11
            int r10 = r10 + 1
            goto L_0x00bf
        L_0x00c7:
            int r5 = (int) r8
            byte[] r5 = new byte[r5]
            r0.g = r4
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x00cf:
            int r11 = r3.length
            if (r8 >= r11) goto L_0x0103
            r11 = r3[r8]
            int r11 = (int) r11
            r12 = r2[r8]
            int r12 = (int) r12
            int r13 = r3.length
            int r13 = r13 - r4
            if (r8 >= r13) goto L_0x00e9
            int r13 = r11 + r12
            long r13 = (long) r13
            int r15 = r8 + 1
            r15 = r3[r15]
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x00e9
            r0.g = r7
        L_0x00e9:
            int r11 = r11 - r9
            if (r11 >= 0) goto L_0x00f1
            java.lang.String r13 = "Invalid strip offset value"
            android.util.Log.d(r6, r13)
        L_0x00f1:
            long r13 = (long) r11
            r1.c(r13)
            int r9 = r9 + r11
            byte[] r11 = new byte[r12]
            r1.read(r11)
            int r9 = r9 + r12
            java.lang.System.arraycopy(r11, r7, r5, r10, r12)
            int r10 = r10 + r12
            int r8 = r8 + 1
            goto L_0x00cf
        L_0x0103:
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x0119
            r1 = r3[r7]
            goto L_0x0119
        L_0x010a:
            java.lang.String r1 = "stripByteCounts should not be null or have zero length."
            android.util.Log.w(r6, r1)
            goto L_0x0119
        L_0x0110:
            java.lang.String r1 = "stripOffsets should not be null or have zero length."
            android.util.Log.w(r6, r1)
            goto L_0x0119
        L_0x0116:
            r0.o(r1, r2)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.a.v(y0.a$b):void");
    }

    public final void x(int i10, int i11) throws IOException {
        if (!this.f13343d[i10].isEmpty() && !this.f13343d[i11].isEmpty()) {
            c cVar = this.f13343d[i10].get("ImageLength");
            c cVar2 = this.f13343d[i10].get("ImageWidth");
            c cVar3 = this.f13343d[i11].get("ImageLength");
            c cVar4 = this.f13343d[i11].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (f13327m) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int f10 = cVar.f(this.f13345f);
                int f11 = cVar2.f(this.f13345f);
                int f12 = cVar3.f(this.f13345f);
                int f13 = cVar4.f(this.f13345f);
                if (f10 < f12 && f11 < f13) {
                    HashMap<String, c>[] hashMapArr = this.f13343d;
                    HashMap<String, c> hashMap = hashMapArr[i10];
                    hashMapArr[i10] = hashMapArr[i11];
                    hashMapArr[i11] = hashMap;
                }
            } else if (f13327m) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f13327m) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void y(b bVar, int i10) throws IOException {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4 = this.f13343d[i10].get("DefaultCropSize");
        c cVar5 = this.f13343d[i10].get("SensorTopBorder");
        c cVar6 = this.f13343d[i10].get("SensorLeftBorder");
        c cVar7 = this.f13343d[i10].get("SensorBottomBorder");
        c cVar8 = this.f13343d[i10].get("SensorRightBorder");
        if (cVar4 != null) {
            if (cVar4.f13358a == 5) {
                e[] eVarArr = (e[]) cVar4.h(this.f13345f);
                if (eVarArr == null || eVarArr.length != 2) {
                    StringBuilder d10 = a.a.d("Invalid crop size values. cropSize=");
                    d10.append(Arrays.toString(eVarArr));
                    Log.w("ExifInterface", d10.toString());
                    return;
                }
                cVar3 = c.c(eVarArr[0], this.f13345f);
                cVar2 = c.c(eVarArr[1], this.f13345f);
            } else {
                int[] iArr = (int[]) cVar4.h(this.f13345f);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder d11 = a.a.d("Invalid crop size values. cropSize=");
                    d11.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", d11.toString());
                    return;
                }
                cVar3 = c.d(iArr[0], this.f13345f);
                cVar2 = c.d(iArr[1], this.f13345f);
            }
            this.f13343d[i10].put("ImageWidth", cVar3);
            this.f13343d[i10].put("ImageLength", cVar2);
        } else if (cVar5 == null || cVar6 == null || cVar7 == null || cVar8 == null) {
            c cVar9 = this.f13343d[i10].get("ImageLength");
            c cVar10 = this.f13343d[i10].get("ImageWidth");
            if ((cVar9 == null || cVar10 == null) && (cVar = this.f13343d[i10].get("JPEGInterchangeFormat")) != null) {
                g(bVar, cVar.f(this.f13345f), i10);
            }
        } else {
            int f10 = cVar5.f(this.f13345f);
            int f11 = cVar7.f(this.f13345f);
            int f12 = cVar8.f(this.f13345f);
            int f13 = cVar6.f(this.f13345f);
            if (f11 > f10 && f12 > f13) {
                c d12 = c.d(f11 - f10, this.f13345f);
                c d13 = c.d(f12 - f13, this.f13345f);
                this.f13343d[i10].put("ImageLength", d12);
                this.f13343d[i10].put("ImageWidth", d13);
            }
        }
    }

    public final void z() throws IOException {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        c cVar = this.f13343d[1].get("PixelXDimension");
        c cVar2 = this.f13343d[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            this.f13343d[0].put("ImageWidth", cVar);
            this.f13343d[0].put("ImageLength", cVar2);
        }
        if (this.f13343d[4].isEmpty() && p(this.f13343d[5])) {
            HashMap<String, c>[] hashMapArr = this.f13343d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!p(this.f13343d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    public static class b extends InputStream implements DataInput {

        /* renamed from: t  reason: collision with root package name */
        public static final ByteOrder f13352t = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: u  reason: collision with root package name */
        public static final ByteOrder f13353u = ByteOrder.BIG_ENDIAN;

        /* renamed from: a  reason: collision with root package name */
        public DataInputStream f13354a;

        /* renamed from: b  reason: collision with root package name */
        public ByteOrder f13355b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13356c;

        /* renamed from: s  reason: collision with root package name */
        public int f13357s;

        public b(InputStream inputStream) throws IOException {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f13355b = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f13354a = dataInputStream;
            int available = dataInputStream.available();
            this.f13356c = available;
            this.f13357s = 0;
            this.f13354a.mark(available);
            this.f13355b = byteOrder;
        }

        public final long a() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public final int available() throws IOException {
            return this.f13354a.available();
        }

        public final void c(long j10) throws IOException {
            int i = this.f13357s;
            if (((long) i) > j10) {
                this.f13357s = 0;
                this.f13354a.reset();
                this.f13354a.mark(this.f13356c);
            } else {
                j10 -= (long) i;
            }
            int i10 = (int) j10;
            if (skipBytes(i10) != i10) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public final int read() throws IOException {
            this.f13357s++;
            return this.f13354a.read();
        }

        public final boolean readBoolean() throws IOException {
            this.f13357s++;
            return this.f13354a.readBoolean();
        }

        public final byte readByte() throws IOException {
            int i = this.f13357s + 1;
            this.f13357s = i;
            if (i <= this.f13356c) {
                int read = this.f13354a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final char readChar() throws IOException {
            this.f13357s += 2;
            return this.f13354a.readChar();
        }

        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public final void readFully(byte[] bArr, int i, int i10) throws IOException {
            int i11 = this.f13357s + i10;
            this.f13357s = i11;
            if (i11 > this.f13356c) {
                throw new EOFException();
            } else if (this.f13354a.read(bArr, i, i10) != i10) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public final int readInt() throws IOException {
            int i = this.f13357s + 4;
            this.f13357s = i;
            if (i <= this.f13356c) {
                int read = this.f13354a.read();
                int read2 = this.f13354a.read();
                int read3 = this.f13354a.read();
                int read4 = this.f13354a.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f13355b;
                    if (byteOrder == f13352t) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f13353u) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder d10 = a.a.d("Invalid byte order: ");
                    d10.append(this.f13355b);
                    throw new IOException(d10.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public final long readLong() throws IOException {
            int i = this.f13357s + 8;
            this.f13357s = i;
            if (i <= this.f13356c) {
                int read = this.f13354a.read();
                int read2 = this.f13354a.read();
                int read3 = this.f13354a.read();
                int read4 = this.f13354a.read();
                int read5 = this.f13354a.read();
                int read6 = this.f13354a.read();
                int read7 = this.f13354a.read();
                int read8 = this.f13354a.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f13355b;
                    if (byteOrder == f13352t) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == f13353u) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder d10 = a.a.d("Invalid byte order: ");
                    d10.append(this.f13355b);
                    throw new IOException(d10.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final short readShort() throws IOException {
            int i = this.f13357s + 2;
            this.f13357s = i;
            if (i <= this.f13356c) {
                int read = this.f13354a.read();
                int read2 = this.f13354a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f13355b;
                    if (byteOrder == f13352t) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f13353u) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder d10 = a.a.d("Invalid byte order: ");
                    d10.append(this.f13355b);
                    throw new IOException(d10.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final String readUTF() throws IOException {
            this.f13357s += 2;
            return this.f13354a.readUTF();
        }

        public final int readUnsignedByte() throws IOException {
            this.f13357s++;
            return this.f13354a.readUnsignedByte();
        }

        public final int readUnsignedShort() throws IOException {
            int i = this.f13357s + 2;
            this.f13357s = i;
            if (i <= this.f13356c) {
                int read = this.f13354a.read();
                int read2 = this.f13354a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f13355b;
                    if (byteOrder == f13352t) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f13353u) {
                        return (read << 8) + read2;
                    }
                    StringBuilder d10 = a.a.d("Invalid byte order: ");
                    d10.append(this.f13355b);
                    throw new IOException(d10.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public final int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f13356c - this.f13357s);
            int i10 = 0;
            while (i10 < min) {
                i10 += this.f13354a.skipBytes(min - i10);
            }
            this.f13357s += i10;
            return i10;
        }

        public final int read(byte[] bArr, int i, int i10) throws IOException {
            int read = this.f13354a.read(bArr, i, i10);
            this.f13357s += read;
            return read;
        }

        public final void readFully(byte[] bArr) throws IOException {
            int length = this.f13357s + bArr.length;
            this.f13357s = length;
            if (length > this.f13356c) {
                throw new EOFException();
            } else if (this.f13354a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public b(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f13361a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13362b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13363c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13364d;

        public d(String str, int i, int i10) {
            this.f13362b = str;
            this.f13361a = i;
            this.f13363c = i10;
            this.f13364d = -1;
        }

        public d(String str, int i) {
            this.f13362b = str;
            this.f13361a = i;
            this.f13363c = 3;
            this.f13364d = 4;
        }
    }
}
