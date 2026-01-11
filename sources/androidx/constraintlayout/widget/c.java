package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.R;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import net.jpountz.lz4.LZ4BlockOutputStream;
import net.jpountz.lz4.LZ4FrameOutputStream;
import org.xmlpull.v1.XmlPullParserException;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1510d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static SparseIntArray f1511e = new SparseIntArray();

    /* renamed from: f  reason: collision with root package name */
    public static SparseIntArray f1512f = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, a> f1513a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1514b = true;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, a> f1515c = new HashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1516a;

        /* renamed from: b  reason: collision with root package name */
        public final d f1517b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final C0010c f1518c = new C0010c();

        /* renamed from: d  reason: collision with root package name */
        public final b f1519d = new b();

        /* renamed from: e  reason: collision with root package name */
        public final e f1520e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, a> f1521f = new HashMap<>();

        /* renamed from: androidx.constraintlayout.widget.c$a$a  reason: collision with other inner class name */
        public static class C0009a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f1522a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f1523b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f1524c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f1525d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f1526e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f1527f = 0;
            public int[] g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f1528h = new String[5];
            public int i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f1529j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f1530k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f1531l = 0;

            public final void a(int i10, float f10) {
                int i11 = this.f1527f;
                int[] iArr = this.f1525d;
                if (i11 >= iArr.length) {
                    this.f1525d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1526e;
                    this.f1526e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1525d;
                int i12 = this.f1527f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1526e;
                this.f1527f = i12 + 1;
                fArr2[i12] = f10;
            }

            public final void b(int i10, int i11) {
                int i12 = this.f1524c;
                int[] iArr = this.f1522a;
                if (i12 >= iArr.length) {
                    this.f1522a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1523b;
                    this.f1523b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1522a;
                int i13 = this.f1524c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1523b;
                this.f1524c = i13 + 1;
                iArr4[i13] = i11;
            }

            public final void c(int i10, String str) {
                int i11 = this.i;
                int[] iArr = this.g;
                if (i11 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1528h;
                    this.f1528h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i12 = this.i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1528h;
                this.i = i12 + 1;
                strArr2[i12] = str;
            }

            public final void d(int i10, boolean z) {
                int i11 = this.f1531l;
                int[] iArr = this.f1529j;
                if (i11 >= iArr.length) {
                    this.f1529j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1530k;
                    this.f1530k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1529j;
                int i12 = this.f1531l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1530k;
                this.f1531l = i12 + 1;
                zArr2[i12] = z;
            }
        }

        public final void a(ConstraintLayout.b bVar) {
            b bVar2 = this.f1519d;
            bVar.f1454e = bVar2.f1545h;
            bVar.f1456f = bVar2.i;
            bVar.g = bVar2.f1548j;
            bVar.f1459h = bVar2.f1550k;
            bVar.i = bVar2.f1552l;
            bVar.f1462j = bVar2.f1554m;
            bVar.f1464k = bVar2.f1556n;
            bVar.f1466l = bVar2.f1558o;
            bVar.f1468m = bVar2.f1560p;
            bVar.f1470n = bVar2.f1561q;
            bVar.f1472o = bVar2.f1562r;
            bVar.f1479s = bVar2.f1563s;
            bVar.f1480t = bVar2.f1564t;
            bVar.f1481u = bVar2.f1565u;
            bVar.f1482v = bVar2.f1566v;
            bVar.leftMargin = bVar2.F;
            bVar.rightMargin = bVar2.G;
            bVar.topMargin = bVar2.H;
            bVar.bottomMargin = bVar2.I;
            bVar.A = bVar2.R;
            bVar.B = bVar2.Q;
            bVar.f1484x = bVar2.N;
            bVar.z = bVar2.P;
            bVar.E = bVar2.f1567w;
            bVar.F = bVar2.f1568x;
            bVar.f1474p = bVar2.z;
            bVar.f1476q = bVar2.A;
            bVar.f1478r = bVar2.B;
            bVar.G = bVar2.f1569y;
            bVar.T = bVar2.C;
            bVar.U = bVar2.D;
            bVar.I = bVar2.T;
            bVar.H = bVar2.U;
            bVar.K = bVar2.W;
            bVar.J = bVar2.V;
            bVar.W = bVar2.f1553l0;
            bVar.X = bVar2.f1555m0;
            bVar.L = bVar2.X;
            bVar.M = bVar2.Y;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f1534a0;
            bVar.N = bVar2.b0;
            bVar.O = bVar2.f1537c0;
            bVar.R = bVar2.f1539d0;
            bVar.S = bVar2.f1541e0;
            bVar.V = bVar2.E;
            bVar.f1450c = bVar2.f1542f;
            bVar.f1447a = bVar2.f1538d;
            bVar.f1449b = bVar2.f1540e;
            bVar.width = bVar2.f1535b;
            bVar.height = bVar2.f1536c;
            String str = bVar2.f1551k0;
            if (str != null) {
                bVar.Y = str;
            }
            bVar.Z = bVar2.f1559o0;
            bVar.setMarginStart(bVar2.K);
            bVar.setMarginEnd(this.f1519d.J);
            bVar.a();
        }

        public final void b(int i, ConstraintLayout.b bVar) {
            this.f1516a = i;
            b bVar2 = this.f1519d;
            bVar2.f1545h = bVar.f1454e;
            bVar2.i = bVar.f1456f;
            bVar2.f1548j = bVar.g;
            bVar2.f1550k = bVar.f1459h;
            bVar2.f1552l = bVar.i;
            bVar2.f1554m = bVar.f1462j;
            bVar2.f1556n = bVar.f1464k;
            bVar2.f1558o = bVar.f1466l;
            bVar2.f1560p = bVar.f1468m;
            bVar2.f1561q = bVar.f1470n;
            bVar2.f1562r = bVar.f1472o;
            bVar2.f1563s = bVar.f1479s;
            bVar2.f1564t = bVar.f1480t;
            bVar2.f1565u = bVar.f1481u;
            bVar2.f1566v = bVar.f1482v;
            bVar2.f1567w = bVar.E;
            bVar2.f1568x = bVar.F;
            bVar2.f1569y = bVar.G;
            bVar2.z = bVar.f1474p;
            bVar2.A = bVar.f1476q;
            bVar2.B = bVar.f1478r;
            bVar2.C = bVar.T;
            bVar2.D = bVar.U;
            bVar2.E = bVar.V;
            bVar2.f1542f = bVar.f1450c;
            bVar2.f1538d = bVar.f1447a;
            bVar2.f1540e = bVar.f1449b;
            bVar2.f1535b = bVar.width;
            bVar2.f1536c = bVar.height;
            bVar2.F = bVar.leftMargin;
            bVar2.G = bVar.rightMargin;
            bVar2.H = bVar.topMargin;
            bVar2.I = bVar.bottomMargin;
            bVar2.L = bVar.D;
            bVar2.T = bVar.I;
            bVar2.U = bVar.H;
            bVar2.W = bVar.K;
            bVar2.V = bVar.J;
            bVar2.f1553l0 = bVar.W;
            bVar2.f1555m0 = bVar.X;
            bVar2.X = bVar.L;
            bVar2.Y = bVar.M;
            bVar2.Z = bVar.P;
            bVar2.f1534a0 = bVar.Q;
            bVar2.b0 = bVar.N;
            bVar2.f1537c0 = bVar.O;
            bVar2.f1539d0 = bVar.R;
            bVar2.f1541e0 = bVar.S;
            bVar2.f1551k0 = bVar.Y;
            bVar2.N = bVar.f1484x;
            bVar2.P = bVar.z;
            bVar2.M = bVar.f1483w;
            bVar2.O = bVar.f1485y;
            bVar2.R = bVar.A;
            bVar2.Q = bVar.B;
            bVar2.S = bVar.C;
            bVar2.f1559o0 = bVar.Z;
            bVar2.J = bVar.getMarginEnd();
            this.f1519d.K = bVar.getMarginStart();
        }

        public final void c(int i, d.a aVar) {
            b(i, aVar);
            this.f1517b.f1581c = aVar.f1596r0;
            e eVar = this.f1520e;
            eVar.f1584a = aVar.f1599u0;
            eVar.f1585b = aVar.f1600v0;
            eVar.f1586c = aVar.f1601w0;
            eVar.f1587d = aVar.f1602x0;
            eVar.f1588e = aVar.f1603y0;
            eVar.f1589f = aVar.z0;
            eVar.g = aVar.A0;
            eVar.i = aVar.B0;
            eVar.f1591j = aVar.C0;
            eVar.f1592k = aVar.D0;
            eVar.f1594m = aVar.f1598t0;
            eVar.f1593l = aVar.f1597s0;
        }

        public final Object clone() throws CloneNotSupportedException {
            a aVar = new a();
            b bVar = aVar.f1519d;
            b bVar2 = this.f1519d;
            Objects.requireNonNull(bVar);
            bVar.f1533a = bVar2.f1533a;
            bVar.f1535b = bVar2.f1535b;
            bVar.f1536c = bVar2.f1536c;
            bVar.f1538d = bVar2.f1538d;
            bVar.f1540e = bVar2.f1540e;
            bVar.f1542f = bVar2.f1542f;
            bVar.g = bVar2.g;
            bVar.f1545h = bVar2.f1545h;
            bVar.i = bVar2.i;
            bVar.f1548j = bVar2.f1548j;
            bVar.f1550k = bVar2.f1550k;
            bVar.f1552l = bVar2.f1552l;
            bVar.f1554m = bVar2.f1554m;
            bVar.f1556n = bVar2.f1556n;
            bVar.f1558o = bVar2.f1558o;
            bVar.f1560p = bVar2.f1560p;
            bVar.f1561q = bVar2.f1561q;
            bVar.f1562r = bVar2.f1562r;
            bVar.f1563s = bVar2.f1563s;
            bVar.f1564t = bVar2.f1564t;
            bVar.f1565u = bVar2.f1565u;
            bVar.f1566v = bVar2.f1566v;
            bVar.f1567w = bVar2.f1567w;
            bVar.f1568x = bVar2.f1568x;
            bVar.f1569y = bVar2.f1569y;
            bVar.z = bVar2.z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.f1534a0 = bVar2.f1534a0;
            bVar.b0 = bVar2.b0;
            bVar.f1537c0 = bVar2.f1537c0;
            bVar.f1539d0 = bVar2.f1539d0;
            bVar.f1541e0 = bVar2.f1541e0;
            bVar.f1543f0 = bVar2.f1543f0;
            bVar.f1544g0 = bVar2.f1544g0;
            bVar.f1546h0 = bVar2.f1546h0;
            bVar.f1551k0 = bVar2.f1551k0;
            int[] iArr = bVar2.f1547i0;
            if (iArr == null || bVar2.f1549j0 != null) {
                bVar.f1547i0 = null;
            } else {
                bVar.f1547i0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f1549j0 = bVar2.f1549j0;
            bVar.f1553l0 = bVar2.f1553l0;
            bVar.f1555m0 = bVar2.f1555m0;
            bVar.f1557n0 = bVar2.f1557n0;
            bVar.f1559o0 = bVar2.f1559o0;
            C0010c cVar = aVar.f1518c;
            C0010c cVar2 = this.f1518c;
            Objects.requireNonNull(cVar);
            Objects.requireNonNull(cVar2);
            cVar.f1571a = cVar2.f1571a;
            cVar.f1573c = cVar2.f1573c;
            cVar.f1575e = cVar2.f1575e;
            cVar.f1574d = cVar2.f1574d;
            d dVar = aVar.f1517b;
            d dVar2 = this.f1517b;
            Objects.requireNonNull(dVar);
            Objects.requireNonNull(dVar2);
            dVar.f1579a = dVar2.f1579a;
            dVar.f1581c = dVar2.f1581c;
            dVar.f1582d = dVar2.f1582d;
            dVar.f1580b = dVar2.f1580b;
            e eVar = aVar.f1520e;
            e eVar2 = this.f1520e;
            Objects.requireNonNull(eVar);
            Objects.requireNonNull(eVar2);
            eVar.f1584a = eVar2.f1584a;
            eVar.f1585b = eVar2.f1585b;
            eVar.f1586c = eVar2.f1586c;
            eVar.f1587d = eVar2.f1587d;
            eVar.f1588e = eVar2.f1588e;
            eVar.f1589f = eVar2.f1589f;
            eVar.g = eVar2.g;
            eVar.f1590h = eVar2.f1590h;
            eVar.i = eVar2.i;
            eVar.f1591j = eVar2.f1591j;
            eVar.f1592k = eVar2.f1592k;
            eVar.f1593l = eVar2.f1593l;
            eVar.f1594m = eVar2.f1594m;
            aVar.f1516a = this.f1516a;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: p0  reason: collision with root package name */
        public static SparseIntArray f1532p0;
        public int A = 0;
        public float B = 0.0f;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        public int N = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        public int O = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        public int P = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        public int Q = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        public int R = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        public int S = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
        public float T = -1.0f;
        public float U = -1.0f;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1533a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f1534a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1535b;
        public int b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1536c;

        /* renamed from: c0  reason: collision with root package name */
        public int f1537c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1538d = -1;

        /* renamed from: d0  reason: collision with root package name */
        public float f1539d0 = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public int f1540e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public float f1541e0 = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1542f = -1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public int f1543f0 = -1;
        public boolean g = true;

        /* renamed from: g0  reason: collision with root package name */
        public int f1544g0 = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1545h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f1546h0 = -1;
        public int i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int[] f1547i0;

        /* renamed from: j  reason: collision with root package name */
        public int f1548j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public String f1549j0;

        /* renamed from: k  reason: collision with root package name */
        public int f1550k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public String f1551k0;

        /* renamed from: l  reason: collision with root package name */
        public int f1552l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public boolean f1553l0 = false;

        /* renamed from: m  reason: collision with root package name */
        public int f1554m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f1555m0 = false;

        /* renamed from: n  reason: collision with root package name */
        public int f1556n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f1557n0 = true;

        /* renamed from: o  reason: collision with root package name */
        public int f1558o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public int f1559o0 = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f1560p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f1561q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f1562r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f1563s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1564t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1565u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1566v = -1;

        /* renamed from: w  reason: collision with root package name */
        public float f1567w = 0.5f;

        /* renamed from: x  reason: collision with root package name */
        public float f1568x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public String f1569y = null;
        public int z = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1532p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            f1532p0.append(44, 25);
            f1532p0.append(46, 28);
            f1532p0.append(47, 29);
            f1532p0.append(52, 35);
            f1532p0.append(51, 34);
            f1532p0.append(24, 4);
            f1532p0.append(23, 3);
            f1532p0.append(19, 1);
            f1532p0.append(61, 6);
            f1532p0.append(62, 7);
            f1532p0.append(31, 17);
            f1532p0.append(32, 18);
            f1532p0.append(33, 19);
            f1532p0.append(15, 90);
            f1532p0.append(0, 26);
            f1532p0.append(48, 31);
            f1532p0.append(49, 32);
            f1532p0.append(30, 10);
            f1532p0.append(29, 9);
            f1532p0.append(66, 13);
            f1532p0.append(69, 16);
            f1532p0.append(67, 14);
            f1532p0.append(64, 11);
            f1532p0.append(68, 15);
            f1532p0.append(65, 12);
            f1532p0.append(55, 38);
            f1532p0.append(41, 37);
            f1532p0.append(40, 39);
            f1532p0.append(54, 40);
            f1532p0.append(39, 20);
            f1532p0.append(53, 36);
            f1532p0.append(28, 5);
            f1532p0.append(42, 91);
            f1532p0.append(50, 91);
            f1532p0.append(45, 91);
            f1532p0.append(22, 91);
            f1532p0.append(18, 91);
            f1532p0.append(3, 23);
            f1532p0.append(5, 27);
            f1532p0.append(7, 30);
            f1532p0.append(8, 8);
            f1532p0.append(4, 33);
            f1532p0.append(6, 2);
            f1532p0.append(1, 22);
            f1532p0.append(2, 21);
            f1532p0.append(56, 41);
            f1532p0.append(34, 42);
            f1532p0.append(17, 41);
            f1532p0.append(16, 42);
            f1532p0.append(71, 76);
            f1532p0.append(25, 61);
            f1532p0.append(27, 62);
            f1532p0.append(26, 63);
            f1532p0.append(60, 69);
            f1532p0.append(38, 70);
            f1532p0.append(12, 71);
            f1532p0.append(10, 72);
            f1532p0.append(11, 73);
            f1532p0.append(13, 74);
            f1532p0.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.c.f317j0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f1532p0.get(index);
                switch (i11) {
                    case 1:
                        this.f1560p = c.g(obtainStyledAttributes, index, this.f1560p);
                        break;
                    case 2:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 3:
                        this.f1558o = c.g(obtainStyledAttributes, index, this.f1558o);
                        break;
                    case 4:
                        this.f1556n = c.g(obtainStyledAttributes, index, this.f1556n);
                        break;
                    case 5:
                        this.f1569y = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 7:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 8:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 9:
                        this.f1566v = c.g(obtainStyledAttributes, index, this.f1566v);
                        break;
                    case 10:
                        this.f1565u = c.g(obtainStyledAttributes, index, this.f1565u);
                        break;
                    case 11:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 12:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 13:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 14:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 15:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 16:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 17:
                        this.f1538d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1538d);
                        break;
                    case 18:
                        this.f1540e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1540e);
                        break;
                    case 19:
                        this.f1542f = obtainStyledAttributes.getFloat(index, this.f1542f);
                        break;
                    case 20:
                        this.f1567w = obtainStyledAttributes.getFloat(index, this.f1567w);
                        break;
                    case 21:
                        this.f1536c = obtainStyledAttributes.getLayoutDimension(index, this.f1536c);
                        break;
                    case 22:
                        this.f1535b = obtainStyledAttributes.getLayoutDimension(index, this.f1535b);
                        break;
                    case 23:
                        this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 24:
                        this.f1545h = c.g(obtainStyledAttributes, index, this.f1545h);
                        break;
                    case R.styleable.MapAttrs_zOrderOnTop /*25*/:
                        this.i = c.g(obtainStyledAttributes, index, this.i);
                        break;
                    case 26:
                        this.E = obtainStyledAttributes.getInt(index, this.E);
                        break;
                    case 27:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 28:
                        this.f1548j = c.g(obtainStyledAttributes, index, this.f1548j);
                        break;
                    case 29:
                        this.f1550k = c.g(obtainStyledAttributes, index, this.f1550k);
                        break;
                    case 30:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 31:
                        this.f1563s = c.g(obtainStyledAttributes, index, this.f1563s);
                        break;
                    case LZ4BlockOutputStream.COMPRESSION_METHOD_LZ4 /*32*/:
                        this.f1564t = c.g(obtainStyledAttributes, index, this.f1564t);
                        break;
                    case 33:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 34:
                        this.f1554m = c.g(obtainStyledAttributes, index, this.f1554m);
                        break;
                    case 35:
                        this.f1552l = c.g(obtainStyledAttributes, index, this.f1552l);
                        break;
                    case 36:
                        this.f1568x = obtainStyledAttributes.getFloat(index, this.f1568x);
                        break;
                    case 37:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = obtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        c.h(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.h(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.z = c.g(obtainStyledAttributes, index, this.z);
                                break;
                            case 62:
                                this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                break;
                            case 63:
                                this.B = obtainStyledAttributes.getFloat(index, this.B);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1539d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /*70*/:
                                        this.f1541e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1543f0 = obtainStyledAttributes.getInt(index, this.f1543f0);
                                        break;
                                    case 73:
                                        this.f1544g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1544g0);
                                        break;
                                    case 74:
                                        this.f1549j0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1557n0 = obtainStyledAttributes.getBoolean(index, this.f1557n0);
                                        break;
                                    case 76:
                                        this.f1559o0 = obtainStyledAttributes.getInt(index, this.f1559o0);
                                        break;
                                    case 77:
                                        this.f1561q = c.g(obtainStyledAttributes, index, this.f1561q);
                                        break;
                                    case 78:
                                        this.f1562r = c.g(obtainStyledAttributes, index, this.f1562r);
                                        break;
                                    case 79:
                                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        break;
                                    case 80:
                                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        break;
                                    case 81:
                                        this.X = obtainStyledAttributes.getInt(index, this.X);
                                        break;
                                    case 82:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 83:
                                        this.f1534a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1534a0);
                                        break;
                                    case 84:
                                        this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                        break;
                                    case 85:
                                        this.f1537c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1537c0);
                                        break;
                                    case 86:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 87:
                                        this.f1553l0 = obtainStyledAttributes.getBoolean(index, this.f1553l0);
                                        break;
                                    case 88:
                                        this.f1555m0 = obtainStyledAttributes.getBoolean(index, this.f1555m0);
                                        break;
                                    case 89:
                                        this.f1551k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.g = obtainStyledAttributes.getBoolean(index, this.g);
                                        break;
                                    case 91:
                                        StringBuilder d10 = a.a.d("unused attribute 0x");
                                        d10.append(Integer.toHexString(index));
                                        d10.append("   ");
                                        d10.append(f1532p0.get(index));
                                        Log.w("ConstraintSet", d10.toString());
                                        break;
                                    default:
                                        StringBuilder d11 = a.a.d("Unknown attribute 0x");
                                        d11.append(Integer.toHexString(index));
                                        d11.append("   ");
                                        d11.append(f1532p0.get(index));
                                        Log.w("ConstraintSet", d11.toString());
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c  reason: collision with other inner class name */
    public static class C0010c {

        /* renamed from: k  reason: collision with root package name */
        public static SparseIntArray f1570k;

        /* renamed from: a  reason: collision with root package name */
        public int f1571a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f1572b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1573c = -1;

        /* renamed from: d  reason: collision with root package name */
        public float f1574d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public float f1575e = Float.NaN;

        /* renamed from: f  reason: collision with root package name */
        public float f1576f = Float.NaN;
        public int g = -1;

        /* renamed from: h  reason: collision with root package name */
        public String f1577h = null;
        public int i = -3;

        /* renamed from: j  reason: collision with root package name */
        public int f1578j = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1570k = sparseIntArray;
            sparseIntArray.append(3, 1);
            f1570k.append(5, 2);
            f1570k.append(9, 3);
            f1570k.append(2, 4);
            f1570k.append(1, 5);
            f1570k.append(0, 6);
            f1570k.append(4, 7);
            f1570k.append(8, 8);
            f1570k.append(7, 9);
            f1570k.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.c.f319k0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1570k.get(index)) {
                    case 1:
                        this.f1575e = obtainStyledAttributes.getFloat(index, this.f1575e);
                        break;
                    case 2:
                        this.f1573c = obtainStyledAttributes.getInt(index, this.f1573c);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            String str = u.a.f11622c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1571a = c.g(obtainStyledAttributes, index, this.f1571a);
                        break;
                    case 6:
                        this.f1572b = obtainStyledAttributes.getInteger(index, this.f1572b);
                        break;
                    case 7:
                        this.f1574d = obtainStyledAttributes.getFloat(index, this.f1574d);
                        break;
                    case 8:
                        this.g = obtainStyledAttributes.getInteger(index, this.g);
                        break;
                    case 9:
                        this.f1576f = obtainStyledAttributes.getFloat(index, this.f1576f);
                        break;
                    case 10:
                        int i11 = obtainStyledAttributes.peekValue(index).type;
                        if (i11 != 1) {
                            if (i11 != 3) {
                                this.i = obtainStyledAttributes.getInteger(index, this.f1578j);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f1577h = string;
                                if (string.indexOf("/") <= 0) {
                                    this.i = -1;
                                    break;
                                } else {
                                    this.f1578j = obtainStyledAttributes.getResourceId(index, -1);
                                    this.i = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f1578j = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.i = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f1579a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1580b = 0;

        /* renamed from: c  reason: collision with root package name */
        public float f1581c = 1.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1582d = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.c.f323m0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f1581c = obtainStyledAttributes.getFloat(index, this.f1581c);
                } else if (index == 0) {
                    int i10 = obtainStyledAttributes.getInt(index, this.f1579a);
                    this.f1579a = i10;
                    int[] iArr = c.f1510d;
                    this.f1579a = c.f1510d[i10];
                } else if (index == 4) {
                    this.f1580b = obtainStyledAttributes.getInt(index, this.f1580b);
                } else if (index == 3) {
                    this.f1582d = obtainStyledAttributes.getFloat(index, this.f1582d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: n  reason: collision with root package name */
        public static SparseIntArray f1583n;

        /* renamed from: a  reason: collision with root package name */
        public float f1584a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f1585b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1586c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1587d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1588e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1589f = Float.NaN;
        public float g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f1590h = -1;
        public float i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f1591j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f1592k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1593l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f1594m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1583n = sparseIntArray;
            sparseIntArray.append(6, 1);
            f1583n.append(7, 2);
            f1583n.append(8, 3);
            f1583n.append(4, 4);
            f1583n.append(5, 5);
            f1583n.append(0, 6);
            f1583n.append(1, 7);
            f1583n.append(2, 8);
            f1583n.append(3, 9);
            f1583n.append(9, 10);
            f1583n.append(10, 11);
            f1583n.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.c.f327o0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f1583n.get(index)) {
                    case 1:
                        this.f1584a = obtainStyledAttributes.getFloat(index, this.f1584a);
                        break;
                    case 2:
                        this.f1585b = obtainStyledAttributes.getFloat(index, this.f1585b);
                        break;
                    case 3:
                        this.f1586c = obtainStyledAttributes.getFloat(index, this.f1586c);
                        break;
                    case 4:
                        this.f1587d = obtainStyledAttributes.getFloat(index, this.f1587d);
                        break;
                    case 5:
                        this.f1588e = obtainStyledAttributes.getFloat(index, this.f1588e);
                        break;
                    case 6:
                        this.f1589f = obtainStyledAttributes.getDimension(index, this.f1589f);
                        break;
                    case 7:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 8:
                        this.i = obtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.f1591j = obtainStyledAttributes.getDimension(index, this.f1591j);
                        break;
                    case 10:
                        this.f1592k = obtainStyledAttributes.getDimension(index, this.f1592k);
                        break;
                    case 11:
                        this.f1593l = true;
                        this.f1594m = obtainStyledAttributes.getDimension(index, this.f1594m);
                        break;
                    case 12:
                        this.f1590h = c.g(obtainStyledAttributes, index, this.f1590h);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1511e.append(82, 25);
        f1511e.append(83, 26);
        f1511e.append(85, 29);
        f1511e.append(86, 30);
        f1511e.append(92, 36);
        f1511e.append(91, 35);
        f1511e.append(63, 4);
        f1511e.append(62, 3);
        f1511e.append(58, 1);
        f1511e.append(60, 91);
        f1511e.append(59, 92);
        f1511e.append(101, 6);
        f1511e.append(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY, 7);
        f1511e.append(70, 17);
        f1511e.append(71, 18);
        f1511e.append(72, 19);
        f1511e.append(54, 99);
        f1511e.append(0, 27);
        f1511e.append(87, 32);
        f1511e.append(88, 33);
        f1511e.append(69, 10);
        f1511e.append(68, 9);
        f1511e.append(106, 13);
        f1511e.append(109, 16);
        f1511e.append(107, 14);
        f1511e.append(LocationRequest.PRIORITY_LOW_POWER, 11);
        f1511e.append(108, 15);
        f1511e.append(LocationRequest.PRIORITY_NO_POWER, 12);
        f1511e.append(95, 40);
        f1511e.append(80, 39);
        f1511e.append(79, 41);
        f1511e.append(94, 42);
        f1511e.append(78, 20);
        f1511e.append(93, 37);
        f1511e.append(67, 5);
        f1511e.append(81, 87);
        f1511e.append(90, 87);
        f1511e.append(84, 87);
        f1511e.append(61, 87);
        f1511e.append(57, 87);
        f1511e.append(5, 24);
        f1511e.append(7, 28);
        f1511e.append(23, 31);
        f1511e.append(24, 8);
        f1511e.append(6, 34);
        f1511e.append(8, 2);
        f1511e.append(3, 23);
        f1511e.append(4, 21);
        f1511e.append(96, 95);
        f1511e.append(73, 96);
        f1511e.append(2, 22);
        f1511e.append(13, 43);
        f1511e.append(26, 44);
        f1511e.append(21, 45);
        f1511e.append(22, 46);
        f1511e.append(20, 60);
        f1511e.append(18, 47);
        f1511e.append(19, 48);
        f1511e.append(14, 49);
        f1511e.append(15, 50);
        f1511e.append(16, 51);
        f1511e.append(17, 52);
        f1511e.append(25, 53);
        f1511e.append(97, 54);
        f1511e.append(74, 55);
        f1511e.append(98, 56);
        f1511e.append(75, 57);
        f1511e.append(99, 58);
        f1511e.append(76, 59);
        f1511e.append(64, 61);
        f1511e.append(66, 62);
        f1511e.append(65, 63);
        f1511e.append(28, 64);
        f1511e.append(121, 65);
        f1511e.append(35, 66);
        f1511e.append(122, 67);
        f1511e.append(113, 79);
        f1511e.append(1, 38);
        f1511e.append(112, 68);
        f1511e.append(100, 69);
        f1511e.append(77, 70);
        f1511e.append(111, 97);
        f1511e.append(32, 71);
        f1511e.append(30, 72);
        f1511e.append(31, 73);
        f1511e.append(33, 74);
        f1511e.append(29, 75);
        f1511e.append(114, 76);
        f1511e.append(89, 77);
        f1511e.append(123, 78);
        f1511e.append(56, 80);
        f1511e.append(55, 81);
        f1511e.append(116, 82);
        f1511e.append(120, 83);
        f1511e.append(119, 84);
        f1511e.append(118, 85);
        f1511e.append(117, 86);
        f1512f.append(85, 6);
        f1512f.append(85, 7);
        f1512f.append(0, 27);
        f1512f.append(89, 13);
        f1512f.append(92, 16);
        f1512f.append(90, 14);
        f1512f.append(87, 11);
        f1512f.append(91, 15);
        f1512f.append(88, 12);
        f1512f.append(78, 40);
        f1512f.append(71, 39);
        f1512f.append(70, 41);
        f1512f.append(77, 42);
        f1512f.append(69, 20);
        f1512f.append(76, 37);
        f1512f.append(60, 5);
        f1512f.append(72, 87);
        f1512f.append(75, 87);
        f1512f.append(73, 87);
        f1512f.append(57, 87);
        f1512f.append(56, 87);
        f1512f.append(5, 24);
        f1512f.append(7, 28);
        f1512f.append(23, 31);
        f1512f.append(24, 8);
        f1512f.append(6, 34);
        f1512f.append(8, 2);
        f1512f.append(3, 23);
        f1512f.append(4, 21);
        f1512f.append(79, 95);
        f1512f.append(64, 96);
        f1512f.append(2, 22);
        f1512f.append(13, 43);
        f1512f.append(26, 44);
        f1512f.append(21, 45);
        f1512f.append(22, 46);
        f1512f.append(20, 60);
        f1512f.append(18, 47);
        f1512f.append(19, 48);
        f1512f.append(14, 49);
        f1512f.append(15, 50);
        f1512f.append(16, 51);
        f1512f.append(17, 52);
        f1512f.append(25, 53);
        f1512f.append(80, 54);
        f1512f.append(65, 55);
        f1512f.append(81, 56);
        f1512f.append(66, 57);
        f1512f.append(82, 58);
        f1512f.append(67, 59);
        f1512f.append(59, 62);
        f1512f.append(58, 63);
        f1512f.append(28, 64);
        f1512f.append(LocationRequest.PRIORITY_NO_POWER, 65);
        f1512f.append(34, 66);
        f1512f.append(106, 67);
        f1512f.append(96, 79);
        f1512f.append(1, 38);
        f1512f.append(97, 98);
        f1512f.append(95, 68);
        f1512f.append(83, 69);
        f1512f.append(68, 70);
        f1512f.append(32, 71);
        f1512f.append(30, 72);
        f1512f.append(31, 73);
        f1512f.append(33, 74);
        f1512f.append(29, 75);
        f1512f.append(98, 76);
        f1512f.append(74, 77);
        f1512f.append(107, 78);
        f1512f.append(55, 80);
        f1512f.append(54, 81);
        f1512f.append(100, 82);
        f1512f.append(LocationRequest.PRIORITY_LOW_POWER, 83);
        f1512f.append(103, 84);
        f1512f.append(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY, 85);
        f1512f.append(101, 86);
        f1512f.append(94, 97);
    }

    public static int g(TypedArray typedArray, int i, int i10) {
        int resourceId = typedArray.getResourceId(i, i10);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 21
            r3 = 23
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 0
            if (r0 == r1) goto L_0x006d
            r1 = -2
            if (r0 == r6) goto L_0x0029
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            if (r9 == r10) goto L_0x0027
            r10 = -3
            if (r9 == r10) goto L_0x0025
            if (r9 == r1) goto L_0x002d
            if (r9 == r5) goto L_0x002d
        L_0x0025:
            r4 = r7
            goto L_0x002f
        L_0x0027:
            r7 = r1
            goto L_0x002f
        L_0x0029:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L_0x002d:
            r4 = r7
            r7 = r9
        L_0x002f:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r9 == 0) goto L_0x0041
            androidx.constraintlayout.widget.ConstraintLayout$b r8 = (androidx.constraintlayout.widget.ConstraintLayout.b) r8
            if (r11 != 0) goto L_0x003c
            r8.width = r7
            r8.W = r4
            goto L_0x006c
        L_0x003c:
            r8.height = r7
            r8.X = r4
            goto L_0x006c
        L_0x0041:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.c.b
            if (r9 == 0) goto L_0x0053
            androidx.constraintlayout.widget.c$b r8 = (androidx.constraintlayout.widget.c.b) r8
            if (r11 != 0) goto L_0x004e
            r8.f1535b = r7
            r8.f1553l0 = r4
            goto L_0x006c
        L_0x004e:
            r8.f1536c = r7
            r8.f1555m0 = r4
            goto L_0x006c
        L_0x0053:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.c.a.C0009a
            if (r9 == 0) goto L_0x006c
            androidx.constraintlayout.widget.c$a$a r8 = (androidx.constraintlayout.widget.c.a.C0009a) r8
            if (r11 != 0) goto L_0x0064
            r8.b(r3, r7)
            r9 = 80
            r8.d(r9, r4)
            goto L_0x006c
        L_0x0064:
            r8.b(r2, r7)
            r9 = 81
            r8.d(r9, r4)
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L_0x0075
            goto L_0x0175
        L_0x0075:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L_0x0175
            int r0 = r0 + r5
            if (r10 >= r0) goto L_0x0175
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x0175
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00ca
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r10 == 0) goto L_0x00b5
            androidx.constraintlayout.widget.ConstraintLayout$b r8 = (androidx.constraintlayout.widget.ConstraintLayout.b) r8
            if (r11 != 0) goto L_0x00ae
            r8.width = r7
            goto L_0x00b0
        L_0x00ae:
            r8.height = r7
        L_0x00b0:
            i(r8, r9)
            goto L_0x0175
        L_0x00b5:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.c.b
            if (r10 == 0) goto L_0x00bf
            androidx.constraintlayout.widget.c$b r8 = (androidx.constraintlayout.widget.c.b) r8
            r8.f1569y = r9
            goto L_0x0175
        L_0x00bf:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.c.a.C0009a
            if (r10 == 0) goto L_0x0175
            androidx.constraintlayout.widget.c$a$a r8 = (androidx.constraintlayout.widget.c.a.C0009a) r8
            r8.c(r6, r9)
            goto L_0x0175
        L_0x00ca:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0118
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0175 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.b     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x00ea
            androidx.constraintlayout.widget.ConstraintLayout$b r8 = (androidx.constraintlayout.widget.ConstraintLayout.b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x00e4
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.H = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00e4:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.I = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00ea:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.c.b     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x00fe
            androidx.constraintlayout.widget.c$b r8 = (androidx.constraintlayout.widget.c.b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x00f8
            r8.f1535b = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.U = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00f8:
            r8.f1536c = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.T = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00fe:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.c.a.C0009a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x0175
            androidx.constraintlayout.widget.c$a$a r8 = (androidx.constraintlayout.widget.c.a.C0009a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x010f
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 39
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x010f:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 40
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0118:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0175
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0175 }
            float r9 = java.lang.Math.min(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.b     // Catch:{ NumberFormatException -> 0x0175 }
            r0 = 2
            if (r10 == 0) goto L_0x0146
            androidx.constraintlayout.widget.ConstraintLayout$b r8 = (androidx.constraintlayout.widget.ConstraintLayout.b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x013f
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.R = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.L = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x013f:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.S = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.M = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0146:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.c.b     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x015c
            androidx.constraintlayout.widget.c$b r8 = (androidx.constraintlayout.widget.c.b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x0155
            r8.f1535b = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f1539d0 = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.X = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0155:
            r8.f1536c = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f1541e0 = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.Y = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x015c:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.c.a.C0009a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r9 == 0) goto L_0x0175
            androidx.constraintlayout.widget.c$a$a r8 = (androidx.constraintlayout.widget.c.a.C0009a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x016d
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r9 = 54
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x016d:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r9 = 55
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x0175 }
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.h(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void i(ConstraintLayout.b bVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = 0;
            int i10 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i10 = i;
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        bVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet((c) null);
        constraintLayout.requestLayout();
    }

    public final void b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1515c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id2 = childAt.getId();
            if (!this.f1515c.containsKey(Integer.valueOf(id2))) {
                StringBuilder d10 = a.a.d("id unknown ");
                d10.append(x.a.b(childAt));
                Log.w("ConstraintSet", d10.toString());
            } else if (this.f1514b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1) {
                if (this.f1515c.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = this.f1515c.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f1519d.f1546h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f1519d.f1543f0);
                            barrier.setMargin(aVar.f1519d.f1544g0);
                            barrier.setAllowsGoneWidget(aVar.f1519d.f1557n0);
                            b bVar = aVar.f1519d;
                            int[] iArr = bVar.f1547i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f1549j0;
                                if (str != null) {
                                    bVar.f1547i0 = d(barrier, str);
                                    barrier.setReferencedIds(aVar.f1519d.f1547i0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.a(bVar2);
                        a.b(childAt, aVar.f1521f);
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f1517b;
                        if (dVar.f1580b == 0) {
                            childAt.setVisibility(dVar.f1579a);
                        }
                        childAt.setAlpha(aVar.f1517b.f1581c);
                        childAt.setRotation(aVar.f1520e.f1584a);
                        childAt.setRotationX(aVar.f1520e.f1585b);
                        childAt.setRotationY(aVar.f1520e.f1586c);
                        childAt.setScaleX(aVar.f1520e.f1587d);
                        childAt.setScaleY(aVar.f1520e.f1588e);
                        e eVar = aVar.f1520e;
                        if (eVar.f1590h != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f1520e.f1590h);
                            if (findViewById != null) {
                                float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                                float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - ((float) childAt.getLeft()));
                                    childAt.setPivotY(bottom - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f1589f)) {
                                childAt.setPivotX(aVar.f1520e.f1589f);
                            }
                            if (!Float.isNaN(aVar.f1520e.g)) {
                                childAt.setPivotY(aVar.f1520e.g);
                            }
                        }
                        childAt.setTranslationX(aVar.f1520e.i);
                        childAt.setTranslationY(aVar.f1520e.f1591j);
                        childAt.setTranslationZ(aVar.f1520e.f1592k);
                        e eVar2 = aVar.f1520e;
                        if (eVar2.f1593l) {
                            childAt.setElevation(eVar2.f1594m);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f1515c.get(num);
            if (aVar2 != null) {
                if (aVar2.f1519d.f1546h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f1519d;
                    int[] iArr2 = bVar3.f1547i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1549j0;
                        if (str2 != null) {
                            bVar3.f1547i0 = d(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f1519d.f1547i0);
                        }
                    }
                    barrier2.setType(aVar2.f1519d.f1543f0);
                    barrier2.setMargin(aVar2.f1519d.f1544g0);
                    ConstraintLayout.b bVar4 = new ConstraintLayout.b();
                    barrier2.k();
                    aVar2.a(bVar4);
                    constraintLayout.addView(barrier2, bVar4);
                }
                if (aVar2.f1519d.f1533a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVar5 = new ConstraintLayout.b();
                    aVar2.a(bVar5);
                    constraintLayout.addView(guideline, bVar5);
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = constraintLayout.getChildAt(i10);
            if (childAt2 instanceof b) {
                ((b) childAt2).g(constraintLayout);
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        c cVar = this;
        int childCount = constraintLayout.getChildCount();
        cVar.f1515c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!cVar.f1514b || id2 != -1) {
                if (!cVar.f1515c.containsKey(Integer.valueOf(id2))) {
                    cVar.f1515c.put(Integer.valueOf(id2), new a());
                }
                a aVar = cVar.f1515c.get(Integer.valueOf(id2));
                if (aVar != null) {
                    HashMap<String, a> hashMap = cVar.f1513a;
                    HashMap<String, a> hashMap2 = new HashMap<>();
                    Class<?> cls = childAt.getClass();
                    for (String next : hashMap.keySet()) {
                        a aVar2 = hashMap.get(next);
                        try {
                            if (next.equals("BackgroundColor")) {
                                hashMap2.put(next, new a(aVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } else {
                                try {
                                    hashMap2.put(next, new a(aVar2, cls.getMethod("getMap" + next, new Class[0]).invoke(childAt, new Object[0])));
                                } catch (NoSuchMethodException e10) {
                                    e = e10;
                                } catch (IllegalAccessException e11) {
                                    e = e11;
                                    e.printStackTrace();
                                } catch (InvocationTargetException e12) {
                                    e = e12;
                                    e.printStackTrace();
                                }
                            }
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            e.printStackTrace();
                        } catch (IllegalAccessException e14) {
                            e = e14;
                            e.printStackTrace();
                        } catch (InvocationTargetException e15) {
                            e = e15;
                            e.printStackTrace();
                        }
                    }
                    aVar.f1521f = hashMap2;
                    aVar.b(id2, bVar);
                    aVar.f1517b.f1579a = childAt.getVisibility();
                    aVar.f1517b.f1581c = childAt.getAlpha();
                    aVar.f1520e.f1584a = childAt.getRotation();
                    aVar.f1520e.f1585b = childAt.getRotationX();
                    aVar.f1520e.f1586c = childAt.getRotationY();
                    aVar.f1520e.f1587d = childAt.getScaleX();
                    aVar.f1520e.f1588e = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == Utils.DOUBLE_EPSILON && ((double) pivotY) == Utils.DOUBLE_EPSILON)) {
                        e eVar = aVar.f1520e;
                        eVar.f1589f = pivotX;
                        eVar.g = pivotY;
                    }
                    aVar.f1520e.i = childAt.getTranslationX();
                    aVar.f1520e.f1591j = childAt.getTranslationY();
                    aVar.f1520e.f1592k = childAt.getTranslationZ();
                    e eVar2 = aVar.f1520e;
                    if (eVar2.f1593l) {
                        eVar2.f1594m = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar.f1519d.f1557n0 = barrier.getAllowsGoneWidget();
                        aVar.f1519d.f1547i0 = barrier.getReferencedIds();
                        aVar.f1519d.f1543f0 = barrier.getType();
                        aVar.f1519d.f1544g0 = barrier.getMargin();
                    }
                }
                i++;
                cVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final int[] d(View view, String str) {
        int i;
        Object c10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length) {
            String trim = split[i10].trim();
            try {
                i = y.c.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c10 = ((ConstraintLayout) view.getParent()).c(trim)) != null && (c10 instanceof Integer)) {
                i = ((Integer) c10).intValue();
            }
            iArr[i11] = i;
            i10++;
            i11++;
        }
        return i11 != split.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public final a e(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? ad.c.f312g0 : ad.c.f309e0);
        int i = 3;
        int i10 = 1;
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            a.C0009a aVar2 = new a.C0009a();
            Objects.requireNonNull(aVar.f1518c);
            Objects.requireNonNull(aVar.f1519d);
            Objects.requireNonNull(aVar.f1517b);
            Objects.requireNonNull(aVar.f1520e);
            int i11 = 0;
            while (i11 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i11);
                switch (f1512f.get(index)) {
                    case 2:
                        aVar2.b(2, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.I));
                        break;
                    case 5:
                        aVar2.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        aVar2.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1519d.C));
                        break;
                    case 7:
                        aVar2.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1519d.D));
                        break;
                    case 8:
                        aVar2.b(8, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.J));
                        break;
                    case 11:
                        aVar2.b(11, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.P));
                        break;
                    case 12:
                        aVar2.b(12, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.Q));
                        break;
                    case 13:
                        aVar2.b(13, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.M));
                        break;
                    case 14:
                        aVar2.b(14, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.O));
                        break;
                    case 15:
                        aVar2.b(15, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.R));
                        break;
                    case 16:
                        aVar2.b(16, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.N));
                        break;
                    case 17:
                        aVar2.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1519d.f1538d));
                        break;
                    case 18:
                        aVar2.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1519d.f1540e));
                        break;
                    case 19:
                        aVar2.a(19, obtainStyledAttributes.getFloat(index, aVar.f1519d.f1542f));
                        break;
                    case 20:
                        aVar2.a(20, obtainStyledAttributes.getFloat(index, aVar.f1519d.f1567w));
                        break;
                    case 21:
                        aVar2.b(21, obtainStyledAttributes.getLayoutDimension(index, aVar.f1519d.f1536c));
                        break;
                    case 22:
                        aVar2.b(22, f1510d[obtainStyledAttributes.getInt(index, aVar.f1517b.f1579a)]);
                        break;
                    case 23:
                        aVar2.b(23, obtainStyledAttributes.getLayoutDimension(index, aVar.f1519d.f1535b));
                        break;
                    case 24:
                        aVar2.b(24, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.F));
                        break;
                    case 27:
                        aVar2.b(27, obtainStyledAttributes.getInt(index, aVar.f1519d.E));
                        break;
                    case 28:
                        aVar2.b(28, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.G));
                        break;
                    case 31:
                        aVar2.b(31, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.K));
                        break;
                    case 34:
                        aVar2.b(34, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.H));
                        break;
                    case 37:
                        aVar2.a(37, obtainStyledAttributes.getFloat(index, aVar.f1519d.f1568x));
                        break;
                    case 38:
                        int resourceId = obtainStyledAttributes.getResourceId(index, aVar.f1516a);
                        aVar.f1516a = resourceId;
                        aVar2.b(38, resourceId);
                        break;
                    case 39:
                        aVar2.a(39, obtainStyledAttributes.getFloat(index, aVar.f1519d.U));
                        break;
                    case 40:
                        aVar2.a(40, obtainStyledAttributes.getFloat(index, aVar.f1519d.T));
                        break;
                    case 41:
                        aVar2.b(41, obtainStyledAttributes.getInt(index, aVar.f1519d.V));
                        break;
                    case 42:
                        aVar2.b(42, obtainStyledAttributes.getInt(index, aVar.f1519d.W));
                        break;
                    case 43:
                        aVar2.a(43, obtainStyledAttributes.getFloat(index, aVar.f1517b.f1581c));
                        break;
                    case 44:
                        aVar2.d(44, true);
                        aVar2.a(44, obtainStyledAttributes.getDimension(index, aVar.f1520e.f1594m));
                        break;
                    case 45:
                        aVar2.a(45, obtainStyledAttributes.getFloat(index, aVar.f1520e.f1585b));
                        break;
                    case 46:
                        aVar2.a(46, obtainStyledAttributes.getFloat(index, aVar.f1520e.f1586c));
                        break;
                    case 47:
                        aVar2.a(47, obtainStyledAttributes.getFloat(index, aVar.f1520e.f1587d));
                        break;
                    case 48:
                        aVar2.a(48, obtainStyledAttributes.getFloat(index, aVar.f1520e.f1588e));
                        break;
                    case 49:
                        aVar2.a(49, obtainStyledAttributes.getDimension(index, aVar.f1520e.f1589f));
                        break;
                    case 50:
                        aVar2.a(50, obtainStyledAttributes.getDimension(index, aVar.f1520e.g));
                        break;
                    case 51:
                        aVar2.a(51, obtainStyledAttributes.getDimension(index, aVar.f1520e.i));
                        break;
                    case 52:
                        aVar2.a(52, obtainStyledAttributes.getDimension(index, aVar.f1520e.f1591j));
                        break;
                    case 53:
                        aVar2.a(53, obtainStyledAttributes.getDimension(index, aVar.f1520e.f1592k));
                        break;
                    case 54:
                        aVar2.b(54, obtainStyledAttributes.getInt(index, aVar.f1519d.X));
                        break;
                    case 55:
                        aVar2.b(55, obtainStyledAttributes.getInt(index, aVar.f1519d.Y));
                        break;
                    case 56:
                        aVar2.b(56, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.Z));
                        break;
                    case 57:
                        aVar2.b(57, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.f1534a0));
                        break;
                    case 58:
                        aVar2.b(58, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.b0));
                        break;
                    case 59:
                        aVar2.b(59, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.f1537c0));
                        break;
                    case 60:
                        aVar2.a(60, obtainStyledAttributes.getFloat(index, aVar.f1520e.f1584a));
                        break;
                    case 62:
                        aVar2.b(62, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.A));
                        break;
                    case 63:
                        aVar2.a(63, obtainStyledAttributes.getFloat(index, aVar.f1519d.B));
                        break;
                    case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                        aVar2.b(64, g(obtainStyledAttributes, index, aVar.f1518c.f1571a));
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            aVar2.c(65, u.a.f11622c[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        } else {
                            aVar2.c(65, obtainStyledAttributes.getString(index));
                            break;
                        }
                    case 66:
                        aVar2.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        aVar2.a(67, obtainStyledAttributes.getFloat(index, aVar.f1518c.f1575e));
                        break;
                    case 68:
                        aVar2.a(68, obtainStyledAttributes.getFloat(index, aVar.f1517b.f1582d));
                        break;
                    case 69:
                        aVar2.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case ModuleDescriptor.MODULE_VERSION /*70*/:
                        aVar2.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        aVar2.b(72, obtainStyledAttributes.getInt(index, aVar.f1519d.f1543f0));
                        break;
                    case 73:
                        aVar2.b(73, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.f1544g0));
                        break;
                    case 74:
                        aVar2.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        aVar2.d(75, obtainStyledAttributes.getBoolean(index, aVar.f1519d.f1557n0));
                        break;
                    case 76:
                        aVar2.b(76, obtainStyledAttributes.getInt(index, aVar.f1518c.f1573c));
                        break;
                    case 77:
                        aVar2.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        aVar2.b(78, obtainStyledAttributes.getInt(index, aVar.f1517b.f1580b));
                        break;
                    case 79:
                        aVar2.a(79, obtainStyledAttributes.getFloat(index, aVar.f1518c.f1574d));
                        break;
                    case 80:
                        aVar2.d(80, obtainStyledAttributes.getBoolean(index, aVar.f1519d.f1553l0));
                        break;
                    case 81:
                        aVar2.d(81, obtainStyledAttributes.getBoolean(index, aVar.f1519d.f1555m0));
                        break;
                    case 82:
                        aVar2.b(82, obtainStyledAttributes.getInteger(index, aVar.f1518c.f1572b));
                        break;
                    case 83:
                        aVar2.b(83, g(obtainStyledAttributes, index, aVar.f1520e.f1590h));
                        break;
                    case 84:
                        aVar2.b(84, obtainStyledAttributes.getInteger(index, aVar.f1518c.g));
                        break;
                    case 85:
                        aVar2.a(85, obtainStyledAttributes.getFloat(index, aVar.f1518c.f1576f));
                        break;
                    case 86:
                        int i12 = obtainStyledAttributes.peekValue(index).type;
                        if (i12 != i10) {
                            if (i12 != 3) {
                                C0010c cVar = aVar.f1518c;
                                cVar.i = obtainStyledAttributes.getInteger(index, cVar.f1578j);
                                aVar2.b(88, aVar.f1518c.i);
                                break;
                            } else {
                                aVar.f1518c.f1577h = obtainStyledAttributes.getString(index);
                                aVar2.c(90, aVar.f1518c.f1577h);
                                if (aVar.f1518c.f1577h.indexOf("/") <= 0) {
                                    aVar.f1518c.i = -1;
                                    aVar2.b(88, -1);
                                    break;
                                } else {
                                    aVar.f1518c.f1578j = obtainStyledAttributes.getResourceId(index, -1);
                                    aVar2.b(89, aVar.f1518c.f1578j);
                                    aVar.f1518c.i = -2;
                                    aVar2.b(88, -2);
                                    break;
                                }
                            }
                        } else {
                            aVar.f1518c.f1578j = obtainStyledAttributes.getResourceId(index, -1);
                            aVar2.b(89, aVar.f1518c.f1578j);
                            C0010c cVar2 = aVar.f1518c;
                            if (cVar2.f1578j == -1) {
                                break;
                            } else {
                                cVar2.i = -2;
                                aVar2.b(88, -2);
                                break;
                            }
                        }
                    case 87:
                        StringBuilder d10 = a.a.d("unused attribute 0x");
                        d10.append(Integer.toHexString(index));
                        d10.append("   ");
                        d10.append(f1511e.get(index));
                        Log.w("ConstraintSet", d10.toString());
                        break;
                    case 93:
                        aVar2.b(93, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.L));
                        break;
                    case 94:
                        aVar2.b(94, obtainStyledAttributes.getDimensionPixelSize(index, aVar.f1519d.S));
                        break;
                    case 95:
                        h(aVar2, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        h(aVar2, obtainStyledAttributes, index, i10);
                        break;
                    case 97:
                        aVar2.b(97, obtainStyledAttributes.getInt(index, aVar.f1519d.f1559o0));
                        break;
                    case 98:
                        int i13 = x.d.f12720e0;
                        if (obtainStyledAttributes.peekValue(index).type != i) {
                            aVar.f1516a = obtainStyledAttributes.getResourceId(index, aVar.f1516a);
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        aVar2.d(99, obtainStyledAttributes.getBoolean(index, aVar.f1519d.g));
                        break;
                    default:
                        StringBuilder d11 = a.a.d("Unknown attribute 0x");
                        d11.append(Integer.toHexString(index));
                        d11.append("   ");
                        d11.append(f1511e.get(index));
                        Log.w("ConstraintSet", d11.toString());
                        break;
                }
                i11++;
                i = 3;
                i10 = 1;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount2; i14++) {
                int index2 = obtainStyledAttributes.getIndex(i14);
                if (!(index2 == 1 || 23 == index2 || 24 == index2)) {
                    Objects.requireNonNull(aVar.f1518c);
                    Objects.requireNonNull(aVar.f1519d);
                    Objects.requireNonNull(aVar.f1517b);
                    Objects.requireNonNull(aVar.f1520e);
                }
                switch (f1511e.get(index2)) {
                    case 1:
                        b bVar = aVar.f1519d;
                        bVar.f1560p = g(obtainStyledAttributes, index2, bVar.f1560p);
                        break;
                    case 2:
                        b bVar2 = aVar.f1519d;
                        bVar2.I = obtainStyledAttributes.getDimensionPixelSize(index2, bVar2.I);
                        break;
                    case 3:
                        b bVar3 = aVar.f1519d;
                        bVar3.f1558o = g(obtainStyledAttributes, index2, bVar3.f1558o);
                        break;
                    case 4:
                        b bVar4 = aVar.f1519d;
                        bVar4.f1556n = g(obtainStyledAttributes, index2, bVar4.f1556n);
                        break;
                    case 5:
                        aVar.f1519d.f1569y = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        b bVar5 = aVar.f1519d;
                        bVar5.C = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar5.C);
                        break;
                    case 7:
                        b bVar6 = aVar.f1519d;
                        bVar6.D = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar6.D);
                        break;
                    case 8:
                        b bVar7 = aVar.f1519d;
                        bVar7.J = obtainStyledAttributes.getDimensionPixelSize(index2, bVar7.J);
                        break;
                    case 9:
                        b bVar8 = aVar.f1519d;
                        bVar8.f1566v = g(obtainStyledAttributes, index2, bVar8.f1566v);
                        break;
                    case 10:
                        b bVar9 = aVar.f1519d;
                        bVar9.f1565u = g(obtainStyledAttributes, index2, bVar9.f1565u);
                        break;
                    case 11:
                        b bVar10 = aVar.f1519d;
                        bVar10.P = obtainStyledAttributes.getDimensionPixelSize(index2, bVar10.P);
                        break;
                    case 12:
                        b bVar11 = aVar.f1519d;
                        bVar11.Q = obtainStyledAttributes.getDimensionPixelSize(index2, bVar11.Q);
                        break;
                    case 13:
                        b bVar12 = aVar.f1519d;
                        bVar12.M = obtainStyledAttributes.getDimensionPixelSize(index2, bVar12.M);
                        break;
                    case 14:
                        b bVar13 = aVar.f1519d;
                        bVar13.O = obtainStyledAttributes.getDimensionPixelSize(index2, bVar13.O);
                        break;
                    case 15:
                        b bVar14 = aVar.f1519d;
                        bVar14.R = obtainStyledAttributes.getDimensionPixelSize(index2, bVar14.R);
                        break;
                    case 16:
                        b bVar15 = aVar.f1519d;
                        bVar15.N = obtainStyledAttributes.getDimensionPixelSize(index2, bVar15.N);
                        break;
                    case 17:
                        b bVar16 = aVar.f1519d;
                        bVar16.f1538d = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar16.f1538d);
                        break;
                    case 18:
                        b bVar17 = aVar.f1519d;
                        bVar17.f1540e = obtainStyledAttributes.getDimensionPixelOffset(index2, bVar17.f1540e);
                        break;
                    case 19:
                        b bVar18 = aVar.f1519d;
                        bVar18.f1542f = obtainStyledAttributes.getFloat(index2, bVar18.f1542f);
                        break;
                    case 20:
                        b bVar19 = aVar.f1519d;
                        bVar19.f1567w = obtainStyledAttributes.getFloat(index2, bVar19.f1567w);
                        break;
                    case 21:
                        b bVar20 = aVar.f1519d;
                        bVar20.f1536c = obtainStyledAttributes.getLayoutDimension(index2, bVar20.f1536c);
                        break;
                    case 22:
                        d dVar = aVar.f1517b;
                        dVar.f1579a = obtainStyledAttributes.getInt(index2, dVar.f1579a);
                        d dVar2 = aVar.f1517b;
                        dVar2.f1579a = f1510d[dVar2.f1579a];
                        break;
                    case 23:
                        b bVar21 = aVar.f1519d;
                        bVar21.f1535b = obtainStyledAttributes.getLayoutDimension(index2, bVar21.f1535b);
                        break;
                    case 24:
                        b bVar22 = aVar.f1519d;
                        bVar22.F = obtainStyledAttributes.getDimensionPixelSize(index2, bVar22.F);
                        break;
                    case R.styleable.MapAttrs_zOrderOnTop /*25*/:
                        b bVar23 = aVar.f1519d;
                        bVar23.f1545h = g(obtainStyledAttributes, index2, bVar23.f1545h);
                        break;
                    case 26:
                        b bVar24 = aVar.f1519d;
                        bVar24.i = g(obtainStyledAttributes, index2, bVar24.i);
                        break;
                    case 27:
                        b bVar25 = aVar.f1519d;
                        bVar25.E = obtainStyledAttributes.getInt(index2, bVar25.E);
                        break;
                    case 28:
                        b bVar26 = aVar.f1519d;
                        bVar26.G = obtainStyledAttributes.getDimensionPixelSize(index2, bVar26.G);
                        break;
                    case 29:
                        b bVar27 = aVar.f1519d;
                        bVar27.f1548j = g(obtainStyledAttributes, index2, bVar27.f1548j);
                        break;
                    case 30:
                        b bVar28 = aVar.f1519d;
                        bVar28.f1550k = g(obtainStyledAttributes, index2, bVar28.f1550k);
                        break;
                    case 31:
                        b bVar29 = aVar.f1519d;
                        bVar29.K = obtainStyledAttributes.getDimensionPixelSize(index2, bVar29.K);
                        break;
                    case LZ4BlockOutputStream.COMPRESSION_METHOD_LZ4 /*32*/:
                        b bVar30 = aVar.f1519d;
                        bVar30.f1563s = g(obtainStyledAttributes, index2, bVar30.f1563s);
                        break;
                    case 33:
                        b bVar31 = aVar.f1519d;
                        bVar31.f1564t = g(obtainStyledAttributes, index2, bVar31.f1564t);
                        break;
                    case 34:
                        b bVar32 = aVar.f1519d;
                        bVar32.H = obtainStyledAttributes.getDimensionPixelSize(index2, bVar32.H);
                        break;
                    case 35:
                        b bVar33 = aVar.f1519d;
                        bVar33.f1554m = g(obtainStyledAttributes, index2, bVar33.f1554m);
                        break;
                    case 36:
                        b bVar34 = aVar.f1519d;
                        bVar34.f1552l = g(obtainStyledAttributes, index2, bVar34.f1552l);
                        break;
                    case 37:
                        b bVar35 = aVar.f1519d;
                        bVar35.f1568x = obtainStyledAttributes.getFloat(index2, bVar35.f1568x);
                        break;
                    case 38:
                        aVar.f1516a = obtainStyledAttributes.getResourceId(index2, aVar.f1516a);
                        break;
                    case 39:
                        b bVar36 = aVar.f1519d;
                        bVar36.U = obtainStyledAttributes.getFloat(index2, bVar36.U);
                        break;
                    case 40:
                        b bVar37 = aVar.f1519d;
                        bVar37.T = obtainStyledAttributes.getFloat(index2, bVar37.T);
                        break;
                    case 41:
                        b bVar38 = aVar.f1519d;
                        bVar38.V = obtainStyledAttributes.getInt(index2, bVar38.V);
                        break;
                    case 42:
                        b bVar39 = aVar.f1519d;
                        bVar39.W = obtainStyledAttributes.getInt(index2, bVar39.W);
                        break;
                    case 43:
                        d dVar3 = aVar.f1517b;
                        dVar3.f1581c = obtainStyledAttributes.getFloat(index2, dVar3.f1581c);
                        break;
                    case 44:
                        e eVar = aVar.f1520e;
                        eVar.f1593l = true;
                        eVar.f1594m = obtainStyledAttributes.getDimension(index2, eVar.f1594m);
                        break;
                    case 45:
                        e eVar2 = aVar.f1520e;
                        eVar2.f1585b = obtainStyledAttributes.getFloat(index2, eVar2.f1585b);
                        break;
                    case 46:
                        e eVar3 = aVar.f1520e;
                        eVar3.f1586c = obtainStyledAttributes.getFloat(index2, eVar3.f1586c);
                        break;
                    case 47:
                        e eVar4 = aVar.f1520e;
                        eVar4.f1587d = obtainStyledAttributes.getFloat(index2, eVar4.f1587d);
                        break;
                    case 48:
                        e eVar5 = aVar.f1520e;
                        eVar5.f1588e = obtainStyledAttributes.getFloat(index2, eVar5.f1588e);
                        break;
                    case 49:
                        e eVar6 = aVar.f1520e;
                        eVar6.f1589f = obtainStyledAttributes.getDimension(index2, eVar6.f1589f);
                        break;
                    case 50:
                        e eVar7 = aVar.f1520e;
                        eVar7.g = obtainStyledAttributes.getDimension(index2, eVar7.g);
                        break;
                    case 51:
                        e eVar8 = aVar.f1520e;
                        eVar8.i = obtainStyledAttributes.getDimension(index2, eVar8.i);
                        break;
                    case 52:
                        e eVar9 = aVar.f1520e;
                        eVar9.f1591j = obtainStyledAttributes.getDimension(index2, eVar9.f1591j);
                        break;
                    case 53:
                        e eVar10 = aVar.f1520e;
                        eVar10.f1592k = obtainStyledAttributes.getDimension(index2, eVar10.f1592k);
                        break;
                    case 54:
                        b bVar40 = aVar.f1519d;
                        bVar40.X = obtainStyledAttributes.getInt(index2, bVar40.X);
                        break;
                    case 55:
                        b bVar41 = aVar.f1519d;
                        bVar41.Y = obtainStyledAttributes.getInt(index2, bVar41.Y);
                        break;
                    case 56:
                        b bVar42 = aVar.f1519d;
                        bVar42.Z = obtainStyledAttributes.getDimensionPixelSize(index2, bVar42.Z);
                        break;
                    case 57:
                        b bVar43 = aVar.f1519d;
                        bVar43.f1534a0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar43.f1534a0);
                        break;
                    case 58:
                        b bVar44 = aVar.f1519d;
                        bVar44.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar44.b0);
                        break;
                    case 59:
                        b bVar45 = aVar.f1519d;
                        bVar45.f1537c0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar45.f1537c0);
                        break;
                    case 60:
                        e eVar11 = aVar.f1520e;
                        eVar11.f1584a = obtainStyledAttributes.getFloat(index2, eVar11.f1584a);
                        break;
                    case 61:
                        b bVar46 = aVar.f1519d;
                        bVar46.z = g(obtainStyledAttributes, index2, bVar46.z);
                        break;
                    case 62:
                        b bVar47 = aVar.f1519d;
                        bVar47.A = obtainStyledAttributes.getDimensionPixelSize(index2, bVar47.A);
                        break;
                    case 63:
                        b bVar48 = aVar.f1519d;
                        bVar48.B = obtainStyledAttributes.getFloat(index2, bVar48.B);
                        break;
                    case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                        C0010c cVar3 = aVar.f1518c;
                        cVar3.f1571a = g(obtainStyledAttributes, index2, cVar3.f1571a);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index2).type != 3) {
                            C0010c cVar4 = aVar.f1518c;
                            String str = u.a.f11622c[obtainStyledAttributes.getInteger(index2, 0)];
                            Objects.requireNonNull(cVar4);
                            break;
                        } else {
                            C0010c cVar5 = aVar.f1518c;
                            obtainStyledAttributes.getString(index2);
                            Objects.requireNonNull(cVar5);
                            break;
                        }
                    case 66:
                        C0010c cVar6 = aVar.f1518c;
                        obtainStyledAttributes.getInt(index2, 0);
                        Objects.requireNonNull(cVar6);
                        break;
                    case 67:
                        C0010c cVar7 = aVar.f1518c;
                        cVar7.f1575e = obtainStyledAttributes.getFloat(index2, cVar7.f1575e);
                        break;
                    case 68:
                        d dVar4 = aVar.f1517b;
                        dVar4.f1582d = obtainStyledAttributes.getFloat(index2, dVar4.f1582d);
                        break;
                    case 69:
                        aVar.f1519d.f1539d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /*70*/:
                        aVar.f1519d.f1541e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        b bVar49 = aVar.f1519d;
                        bVar49.f1543f0 = obtainStyledAttributes.getInt(index2, bVar49.f1543f0);
                        break;
                    case 73:
                        b bVar50 = aVar.f1519d;
                        bVar50.f1544g0 = obtainStyledAttributes.getDimensionPixelSize(index2, bVar50.f1544g0);
                        break;
                    case 74:
                        aVar.f1519d.f1549j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        b bVar51 = aVar.f1519d;
                        bVar51.f1557n0 = obtainStyledAttributes.getBoolean(index2, bVar51.f1557n0);
                        break;
                    case 76:
                        C0010c cVar8 = aVar.f1518c;
                        cVar8.f1573c = obtainStyledAttributes.getInt(index2, cVar8.f1573c);
                        break;
                    case 77:
                        aVar.f1519d.f1551k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        d dVar5 = aVar.f1517b;
                        dVar5.f1580b = obtainStyledAttributes.getInt(index2, dVar5.f1580b);
                        break;
                    case 79:
                        C0010c cVar9 = aVar.f1518c;
                        cVar9.f1574d = obtainStyledAttributes.getFloat(index2, cVar9.f1574d);
                        break;
                    case 80:
                        b bVar52 = aVar.f1519d;
                        bVar52.f1553l0 = obtainStyledAttributes.getBoolean(index2, bVar52.f1553l0);
                        break;
                    case 81:
                        b bVar53 = aVar.f1519d;
                        bVar53.f1555m0 = obtainStyledAttributes.getBoolean(index2, bVar53.f1555m0);
                        break;
                    case 82:
                        C0010c cVar10 = aVar.f1518c;
                        cVar10.f1572b = obtainStyledAttributes.getInteger(index2, cVar10.f1572b);
                        break;
                    case 83:
                        e eVar12 = aVar.f1520e;
                        eVar12.f1590h = g(obtainStyledAttributes, index2, eVar12.f1590h);
                        break;
                    case 84:
                        C0010c cVar11 = aVar.f1518c;
                        cVar11.g = obtainStyledAttributes.getInteger(index2, cVar11.g);
                        break;
                    case 85:
                        C0010c cVar12 = aVar.f1518c;
                        cVar12.f1576f = obtainStyledAttributes.getFloat(index2, cVar12.f1576f);
                        break;
                    case 86:
                        int i15 = obtainStyledAttributes.peekValue(index2).type;
                        if (i15 != 1) {
                            if (i15 != 3) {
                                C0010c cVar13 = aVar.f1518c;
                                cVar13.i = obtainStyledAttributes.getInteger(index2, cVar13.f1578j);
                                break;
                            } else {
                                aVar.f1518c.f1577h = obtainStyledAttributes.getString(index2);
                                if (aVar.f1518c.f1577h.indexOf("/") <= 0) {
                                    aVar.f1518c.i = -1;
                                    break;
                                } else {
                                    aVar.f1518c.f1578j = obtainStyledAttributes.getResourceId(index2, -1);
                                    aVar.f1518c.i = -2;
                                    break;
                                }
                            }
                        } else {
                            aVar.f1518c.f1578j = obtainStyledAttributes.getResourceId(index2, -1);
                            C0010c cVar14 = aVar.f1518c;
                            if (cVar14.f1578j == -1) {
                                break;
                            } else {
                                cVar14.i = -2;
                                break;
                            }
                        }
                    case 87:
                        StringBuilder d12 = a.a.d("unused attribute 0x");
                        d12.append(Integer.toHexString(index2));
                        d12.append("   ");
                        d12.append(f1511e.get(index2));
                        Log.w("ConstraintSet", d12.toString());
                        break;
                    case 91:
                        b bVar54 = aVar.f1519d;
                        bVar54.f1561q = g(obtainStyledAttributes, index2, bVar54.f1561q);
                        break;
                    case 92:
                        b bVar55 = aVar.f1519d;
                        bVar55.f1562r = g(obtainStyledAttributes, index2, bVar55.f1562r);
                        break;
                    case 93:
                        b bVar56 = aVar.f1519d;
                        bVar56.L = obtainStyledAttributes.getDimensionPixelSize(index2, bVar56.L);
                        break;
                    case 94:
                        b bVar57 = aVar.f1519d;
                        bVar57.S = obtainStyledAttributes.getDimensionPixelSize(index2, bVar57.S);
                        break;
                    case 95:
                        h(aVar.f1519d, obtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        h(aVar.f1519d, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        b bVar58 = aVar.f1519d;
                        bVar58.f1559o0 = obtainStyledAttributes.getInt(index2, bVar58.f1559o0);
                        break;
                    default:
                        StringBuilder d13 = a.a.d("Unknown attribute 0x");
                        d13.append(Integer.toHexString(index2));
                        d13.append("   ");
                        d13.append(f1511e.get(index2));
                        Log.w("ConstraintSet", d13.toString());
                        break;
                }
            }
            b bVar59 = aVar.f1519d;
            if (bVar59.f1549j0 != null) {
                bVar59.f1547i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public final void f(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a e10 = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        e10.f1519d.f1533a = true;
                    }
                    this.f1515c.put(Integer.valueOf(e10.f1516a), e10);
                }
            }
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        } catch (IOException e12) {
            e12.printStackTrace();
        }
    }
}
