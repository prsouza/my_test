package tb;

import ge.d0;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import md.m;
import pd.d;
import rd.e;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.HomeViewModelV2$monitorPermissions$2", f = "HomeViewModelV2.kt", l = {228, 247, 249, 254, 263, 272, 281, 298, 299}, m = "invokeSuspend")
public final class i extends rd.i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11493a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeViewModelV2 f11494b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(HomeViewModelV2 homeViewModelV2, d<? super i> dVar) {
        super(2, dVar);
        this.f11494b = homeViewModelV2;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new i(this.f11494b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: type inference failed for: r4v62, types: [je.h<java.lang.Boolean>, je.l] */
    /* JADX WARNING: type inference failed for: r4v74, types: [je.h<java.lang.Boolean>, je.l] */
    /* JADX WARNING: type inference failed for: r4v80, types: [je.h<java.lang.Boolean>, je.l] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01da, code lost:
        r4 = ab.f.f215a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e0, code lost:
        if (ab.f.f232t == ab.a.BLUETOOTH_PERMISSION) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ea, code lost:
        if (ad.c.a0(r2.f11494b.f6765s) == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01ec, code lost:
        r4 = ab.f.f215a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f2, code lost:
        if (ab.f.f232t == ab.a.ENABLE_LOCATION) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fc, code lost:
        if (ad.c.Z(r2.f11494b.f6765s) == false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01fe, code lost:
        r4 = ab.f.f215a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0204, code lost:
        if (ab.f.f232t != ab.a.ENABLE_BLUETOOTH) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0206, code lost:
        ab.f.f215a.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0213, code lost:
        if (ad.c.Q(r2.f11494b.f6765s) != false) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0215, code lost:
        r4 = ab.f.f215a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x021b, code lost:
        if (ab.f.f232t != ab.a.NONE) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x021d, code lost:
        android.util.Log.d(r2.f11494b.f6767u, "Permissions missing");
        r4 = r2.f11494b.E;
        r5 = java.lang.Boolean.FALSE;
        r4.k(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0237, code lost:
        if (ad.c.P(r2.f11494b.f6765s) == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0241, code lost:
        if (ad.c.a0(r2.f11494b.f6765s) == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0243, code lost:
        r4 = r2.f11494b.P;
        r5 = java.lang.Boolean.TRUE;
        r2.f11493a = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x024f, code lost:
        if (r4.a(r5, r2) != r1) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0251, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0252, code lost:
        r4 = r2.f11494b.P;
        r2.f11493a = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x025d, code lost:
        if (r4.a(r5, r2) != r1) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x025f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0268, code lost:
        if (ad.c.P(r2.f11494b.f6765s) != false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x026a, code lost:
        android.util.Log.d(r2.f11494b.f6767u, "Permissions hasLocationPermissions missing");
        r4 = ab.f.f215a;
        r4 = r2.f11494b.f6765s.getString(io.nodle.cash.R.string.locPermissionTitle);
        e6.e.C(r4, "context.getString(R.string.locPermissionTitle)");
        r5 = r2.f11494b.f6765s.getString(io.nodle.cash.R.string.locPermissionBtn);
        e6.e.C(r5, "context.getString(R.string.locPermissionBtn)");
        r6 = ab.a.LOCATION_PERMISSION;
        r2.f11493a = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x029e, code lost:
        if (ab.f.f215a.i(r4, r5, r6, true, false, r2) != r1) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a9, code lost:
        if (ad.c.O(r2.f11494b.f6765s) != false) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ab, code lost:
        android.util.Log.d(r2.f11494b.f6767u, "Permissions hasBluetoothPermissions missing");
        r4 = ab.f.f215a;
        r4 = r2.f11494b.f6765s.getString(io.nodle.cash.R.string.blePermissionTitle);
        e6.e.C(r4, "context.getString(R.string.blePermissionTitle)");
        r5 = r2.f11494b.f6765s.getString(io.nodle.cash.R.string.blePermissionBtn);
        e6.e.C(r5, "context.getString(R.string.blePermissionBtn)");
        r6 = ab.a.BLUETOOTH_PERMISSION;
        r2.f11493a = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02df, code lost:
        if (ab.f.f215a.i(r4, r5, r6, true, false, r2) != r1) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e1, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ea, code lost:
        if (ad.c.a0(r2.f11494b.f6765s) != false) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ec, code lost:
        android.util.Log.d(r2.f11494b.f6767u, "Permissions isLocationEnabled missing");
        r4 = ab.f.f215a;
        r4 = r2.f11494b.f6765s.getString(io.nodle.cash.R.string.locationAlert);
        e6.e.C(r4, "context.getString(R.string.locationAlert)");
        r5 = r2.f11494b.f6765s.getString(io.nodle.cash.R.string.locationAlertAction);
        e6.e.C(r5, "context.getString(R.string.locationAlertAction)");
        r6 = ab.a.ENABLE_LOCATION;
        r2.f11493a = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0320, code lost:
        if (ab.f.f215a.i(r4, r5, r6, true, false, r2) != r1) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0322, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r2.f11494b.f6769w == false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x032b, code lost:
        if (ad.c.Z(r2.f11494b.f6765s) != false) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x032d, code lost:
        android.util.Log.d(r2.f11494b.f6767u, "Permissions isBluetoothEnabled missing");
        r4 = ab.f.f215a;
        r4 = r2.f11494b.f6765s.getString(io.nodle.cash.R.string.bleAlert);
        e6.e.C(r4, "context.getString(R.string.bleAlert)");
        r5 = r2.f11494b.f6765s.getString(io.nodle.cash.R.string.bleAlertAction);
        e6.e.C(r5, "context.getString(R.string.bleAlertAction)");
        r6 = ab.a.ENABLE_BLUETOOTH;
        r2.f11493a = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0361, code lost:
        if (ab.f.f215a.i(r4, r5, r6, true, false, r2) != r1) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0363, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0364, code lost:
        r4 = ab.f.f215a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x036a, code lost:
        if (ab.f.f228p != ab.b.DISCOVER_DEVICES) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x036c, code lost:
        r4.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0379, code lost:
        if (ad.c.Q(r2.f11494b.f6765s) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        r2.f11493a = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0389, code lost:
        if (e6.e.r(r2.f11494b.E.d(), java.lang.Boolean.FALSE) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x038b, code lost:
        r4 = r2.f11494b;
        android.util.Log.d(r4.f6767u, "Permissions allPermGranted " + r4.E.d());
        r4 = r2.f11494b.E;
        r5 = java.lang.Boolean.TRUE;
        r4.k(r5);
        r4 = r2.f11494b.P;
        r2.f11493a = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03be, code lost:
        if (r4.a(r5, r2) != r1) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03c0, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03c1, code lost:
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03c4, code lost:
        r2 = ab.f.f215a;
        r3 = r8.f11494b.f6765s.getString(io.nodle.cash.R.string.introAlert);
        e6.e.C(r3, "context.getString(R.string.introAlert)");
        r4 = ab.b.DISCOVER_DEVICES;
        r8.f11493a = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03e3, code lost:
        if (r2.l(r3, r4, false, false, r8) != r1) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03e5, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03e6, code lost:
        r2 = r8;
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (c3.k.f0(2000, r2) != r1) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03ec, code lost:
        return md.m.f8555a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r4 = r2.f11494b;
        java.util.Objects.requireNonNull(r4);
        r6 = 0;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (ad.c.P(r4.f6765s) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r5 = r4.f6766t.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r5 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r5.f11922h != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r5 == 0) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        r4.f6766t.b(new ya.f.a(ya.g.LOCATION_PERMISSION_GRANTED, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null));
        r5 = r4.f6766t;
        r9 = r5.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        if (r9 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        r9 = ub.a.a(r9, false, false, false, true, false, false, 1919);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        r5.d(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r5 = r4.f6766t;
        r9 = r5.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        if (r9 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        r9 = ub.a.a(r9, false, false, false, false, false, false, 1919);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        r5.d(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        if (ad.c.a0(r4.f6765s) == false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        r5 = r4.f6766t.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        if (r5 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        if (r5.f11921f != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c2, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c3, code lost:
        if (r5 == 0) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
        r4.f6766t.b(new ya.f.a(ya.g.LOCATION_ENABLED, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null));
        r5 = r4.f6766t;
        r9 = r5.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        if (r9 == null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        r9 = ub.a.a(r9, false, false, true, false, false, false, 2015);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e6, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        r5.d(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f1, code lost:
        if (ad.c.P(r4.f6765s) == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f3, code lost:
        r5 = r4.f6766t;
        r9 = r5.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f9, code lost:
        if (r9 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fb, code lost:
        r9 = ub.a.a(r9, false, false, false, false, false, false, 2015);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0108, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0109, code lost:
        r5.d(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0112, code lost:
        if (ad.c.O(r4.f6765s) == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0114, code lost:
        r5 = r4.f6766t.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011a, code lost:
        if (r5 == null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011e, code lost:
        if (r5.f11919d != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0120, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0122, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0123, code lost:
        if (r5 == 0) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0125, code lost:
        r4.f6766t.b(new ya.f.a(ya.g.BLE_PERMISSION_GRANTED, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null));
        r5 = r4.f6766t;
        r9 = r5.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0137, code lost:
        if (r9 == null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0139, code lost:
        r9 = ub.a.a(r9, false, true, false, false, false, false, 2039);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0146, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0147, code lost:
        r5.d(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014b, code lost:
        r5 = r4.f6766t;
        r9 = r5.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0151, code lost:
        if (r9 == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0153, code lost:
        r9 = ub.a.a(r9, false, false, false, false, false, false, 2039);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0160, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0161, code lost:
        r5.d(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x016a, code lost:
        if (ad.c.Z(r4.f6765s) == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016c, code lost:
        r5 = r4.f6766t.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0172, code lost:
        if (r5 == null) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0176, code lost:
        if (r5.f11917b != false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0178, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0179, code lost:
        if (r6 == 0) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x017b, code lost:
        r4.f6766t.b(new ya.f.a(ya.g.BLE_ENABLED, (java.util.Map<java.lang.String, ? extends java.lang.Object>) null));
        r4 = r4.f6766t;
        r9 = r4.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018d, code lost:
        if (r9 == null) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x018f, code lost:
        r8 = ub.a.a(r9, true, false, false, false, false, false, 2045);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019b, code lost:
        r4.d(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a5, code lost:
        if (ad.c.O(r4.f6765s) == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a7, code lost:
        r4 = r4.f6766t;
        r9 = r4.getMetadata();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ad, code lost:
        if (r9 == null) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01af, code lost:
        r8 = ub.a.a(r9, false, false, false, false, false, false, 2045);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01bb, code lost:
        r4.d(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c6, code lost:
        if (ad.c.P(r2.f11494b.f6765s) == false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c8, code lost:
        r4 = ab.f.f215a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ce, code lost:
        if (ab.f.f232t == ab.a.LOCATION_PERMISSION) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d8, code lost:
        if (ad.c.O(r2.f11494b.f6765s) == false) goto L_0x01e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f11493a
            r3 = 1
            switch(r2) {
                case 0: goto L_0x002e;
                case 1: goto L_0x0029;
                case 2: goto L_0x0023;
                case 3: goto L_0x0023;
                case 4: goto L_0x001d;
                case 5: goto L_0x001d;
                case 6: goto L_0x001d;
                case 7: goto L_0x001d;
                case 8: goto L_0x0016;
                case 9: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0012:
            l6.b1.w(r18)
            goto L_0x003a
        L_0x0016:
            l6.b1.w(r18)
            r8 = r0
        L_0x001a:
            r9 = r3
            goto L_0x03c4
        L_0x001d:
            l6.b1.w(r18)
            r2 = r0
            goto L_0x0364
        L_0x0023:
            l6.b1.w(r18)
            r2 = r0
            goto L_0x0260
        L_0x0029:
            l6.b1.w(r18)
            r2 = r0
            goto L_0x004c
        L_0x002e:
            l6.b1.w(r18)
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r2 = r0.f11494b
            java.lang.String r2 = r2.f6767u
            java.lang.String r4 = "monitorPermissions"
            android.util.Log.d(r2, r4)
        L_0x003a:
            r2 = r0
        L_0x003b:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            boolean r4 = r4.f6769w
            if (r4 == 0) goto L_0x03ea
            r4 = 2000(0x7d0, double:9.88E-321)
            r2.f11493a = r3
            java.lang.Object r4 = c3.k.f0(r4, r2)
            if (r4 != r1) goto L_0x004c
            return r1
        L_0x004c:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            java.util.Objects.requireNonNull(r4)
            android.content.Context r5 = r4.f6765s
            boolean r5 = ad.c.P(r5)
            r6 = 0
            r7 = 2
            r8 = 0
            if (r5 == 0) goto L_0x0093
            ya.b r5 = r4.f6766t
            ub.a r5 = r5.getMetadata()
            if (r5 == 0) goto L_0x006a
            boolean r5 = r5.f11922h
            if (r5 != 0) goto L_0x006a
            r5 = r3
            goto L_0x006b
        L_0x006a:
            r5 = r6
        L_0x006b:
            if (r5 == 0) goto L_0x00ac
            ya.b r5 = r4.f6766t
            ya.f$a r9 = new ya.f$a
            ya.g r10 = ya.g.LOCATION_PERMISSION_GRANTED
            r9.<init>(r10, r8)
            r5.b(r9)
            ya.b r5 = r4.f6766t
            ub.a r9 = r5.getMetadata()
            if (r9 == 0) goto L_0x008e
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 1919(0x77f, float:2.689E-42)
            ub.a r9 = ub.a.a(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x008f
        L_0x008e:
            r9 = r8
        L_0x008f:
            r5.d(r9)
            goto L_0x00ac
        L_0x0093:
            ya.b r5 = r4.f6766t
            ub.a r9 = r5.getMetadata()
            if (r9 == 0) goto L_0x00a8
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 1919(0x77f, float:2.689E-42)
            ub.a r9 = ub.a.a(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00a9
        L_0x00a8:
            r9 = r8
        L_0x00a9:
            r5.d(r9)
        L_0x00ac:
            android.content.Context r5 = r4.f6765s
            boolean r5 = ad.c.a0(r5)
            if (r5 == 0) goto L_0x00eb
            ya.b r5 = r4.f6766t
            ub.a r5 = r5.getMetadata()
            if (r5 == 0) goto L_0x00c2
            boolean r5 = r5.f11921f
            if (r5 != 0) goto L_0x00c2
            r5 = r3
            goto L_0x00c3
        L_0x00c2:
            r5 = r6
        L_0x00c3:
            if (r5 == 0) goto L_0x010c
            ya.b r5 = r4.f6766t
            ya.f$a r9 = new ya.f$a
            ya.g r10 = ya.g.LOCATION_ENABLED
            r9.<init>(r10, r8)
            r5.b(r9)
            ya.b r5 = r4.f6766t
            ub.a r9 = r5.getMetadata()
            if (r9 == 0) goto L_0x00e6
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 2015(0x7df, float:2.824E-42)
            ub.a r9 = ub.a.a(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00e7
        L_0x00e6:
            r9 = r8
        L_0x00e7:
            r5.d(r9)
            goto L_0x010c
        L_0x00eb:
            android.content.Context r5 = r4.f6765s
            boolean r5 = ad.c.P(r5)
            if (r5 == 0) goto L_0x010c
            ya.b r5 = r4.f6766t
            ub.a r9 = r5.getMetadata()
            if (r9 == 0) goto L_0x0108
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 2015(0x7df, float:2.824E-42)
            ub.a r9 = ub.a.a(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0109
        L_0x0108:
            r9 = r8
        L_0x0109:
            r5.d(r9)
        L_0x010c:
            android.content.Context r5 = r4.f6765s
            boolean r5 = ad.c.O(r5)
            if (r5 == 0) goto L_0x014b
            ya.b r5 = r4.f6766t
            ub.a r5 = r5.getMetadata()
            if (r5 == 0) goto L_0x0122
            boolean r5 = r5.f11919d
            if (r5 != 0) goto L_0x0122
            r5 = r3
            goto L_0x0123
        L_0x0122:
            r5 = r6
        L_0x0123:
            if (r5 == 0) goto L_0x0164
            ya.b r5 = r4.f6766t
            ya.f$a r9 = new ya.f$a
            ya.g r10 = ya.g.BLE_PERMISSION_GRANTED
            r9.<init>(r10, r8)
            r5.b(r9)
            ya.b r5 = r4.f6766t
            ub.a r9 = r5.getMetadata()
            if (r9 == 0) goto L_0x0146
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 2039(0x7f7, float:2.857E-42)
            ub.a r9 = ub.a.a(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0147
        L_0x0146:
            r9 = r8
        L_0x0147:
            r5.d(r9)
            goto L_0x0164
        L_0x014b:
            ya.b r5 = r4.f6766t
            ub.a r9 = r5.getMetadata()
            if (r9 == 0) goto L_0x0160
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 2039(0x7f7, float:2.857E-42)
            ub.a r9 = ub.a.a(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0161
        L_0x0160:
            r9 = r8
        L_0x0161:
            r5.d(r9)
        L_0x0164:
            android.content.Context r5 = r4.f6765s
            boolean r5 = ad.c.Z(r5)
            if (r5 == 0) goto L_0x019f
            ya.b r5 = r4.f6766t
            ub.a r5 = r5.getMetadata()
            if (r5 == 0) goto L_0x0179
            boolean r5 = r5.f11917b
            if (r5 != 0) goto L_0x0179
            r6 = r3
        L_0x0179:
            if (r6 == 0) goto L_0x01be
            ya.b r5 = r4.f6766t
            ya.f$a r6 = new ya.f$a
            ya.g r9 = ya.g.BLE_ENABLED
            r6.<init>(r9, r8)
            r5.b(r6)
            ya.b r4 = r4.f6766t
            ub.a r9 = r4.getMetadata()
            if (r9 == 0) goto L_0x019b
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 2045(0x7fd, float:2.866E-42)
            ub.a r8 = ub.a.a(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x019b:
            r4.d(r8)
            goto L_0x01be
        L_0x019f:
            android.content.Context r5 = r4.f6765s
            boolean r5 = ad.c.O(r5)
            if (r5 == 0) goto L_0x01be
            ya.b r4 = r4.f6766t
            ub.a r9 = r4.getMetadata()
            if (r9 == 0) goto L_0x01bb
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 2045(0x7fd, float:2.866E-42)
            ub.a r8 = ub.a.a(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x01bb:
            r4.d(r8)
        L_0x01be:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.P(r4)
            if (r4 == 0) goto L_0x01d0
            ab.f r4 = ab.f.f215a
            ab.a r4 = ab.f.f232t
            ab.a r5 = ab.a.LOCATION_PERMISSION
            if (r4 == r5) goto L_0x0206
        L_0x01d0:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.O(r4)
            if (r4 == 0) goto L_0x01e2
            ab.f r4 = ab.f.f215a
            ab.a r4 = ab.f.f232t
            ab.a r5 = ab.a.BLUETOOTH_PERMISSION
            if (r4 == r5) goto L_0x0206
        L_0x01e2:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.a0(r4)
            if (r4 == 0) goto L_0x01f4
            ab.f r4 = ab.f.f215a
            ab.a r4 = ab.f.f232t
            ab.a r5 = ab.a.ENABLE_LOCATION
            if (r4 == r5) goto L_0x0206
        L_0x01f4:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.Z(r4)
            if (r4 == 0) goto L_0x020b
            ab.f r4 = ab.f.f215a
            ab.a r4 = ab.f.f232t
            ab.a r5 = ab.a.ENABLE_BLUETOOTH
            if (r4 != r5) goto L_0x020b
        L_0x0206:
            ab.f r4 = ab.f.f215a
            r4.e()
        L_0x020b:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.Q(r4)
            if (r4 != 0) goto L_0x0371
            ab.f r4 = ab.f.f215a
            ab.a r4 = ab.f.f232t
            ab.a r5 = ab.a.NONE
            if (r4 != r5) goto L_0x0371
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            java.lang.String r4 = r4.f6767u
            java.lang.String r5 = "Permissions missing"
            android.util.Log.d(r4, r5)
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            androidx.lifecycle.j0<java.lang.Boolean> r4 = r4.E
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.k(r5)
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.P(r4)
            if (r4 == 0) goto L_0x0252
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.a0(r4)
            if (r4 == 0) goto L_0x0252
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            je.h<java.lang.Boolean> r4 = r4.P
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r2.f11493a = r7
            java.lang.Object r4 = r4.a(r5, r2)
            if (r4 != r1) goto L_0x0260
            return r1
        L_0x0252:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            je.h<java.lang.Boolean> r4 = r4.P
            r6 = 3
            r2.f11493a = r6
            java.lang.Object r4 = r4.a(r5, r2)
            if (r4 != r1) goto L_0x0260
            return r1
        L_0x0260:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.P(r4)
            if (r4 != 0) goto L_0x02a1
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            java.lang.String r4 = r4.f6767u
            java.lang.String r5 = "Permissions hasLocationPermissions missing"
            android.util.Log.d(r4, r5)
            ab.f r4 = ab.f.f215a
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            r5 = 2131755214(0x7f1000ce, float:1.91413E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "context.getString(R.string.locPermissionTitle)"
            e6.e.C(r4, r5)
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r5 = r2.f11494b
            android.content.Context r5 = r5.f6765s
            r6 = 2131755212(0x7f1000cc, float:1.9141297E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "context.getString(R.string.locPermissionBtn)"
            e6.e.C(r5, r6)
            ab.a r6 = ab.a.LOCATION_PERMISSION
            r7 = 4
            r2.f11493a = r7
            java.lang.Object r4 = ab.f.f215a.i(r4, r5, r6, true, false, r2)
            if (r4 != r1) goto L_0x0364
            return r1
        L_0x02a1:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.O(r4)
            if (r4 != 0) goto L_0x02e2
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            java.lang.String r4 = r4.f6767u
            java.lang.String r5 = "Permissions hasBluetoothPermissions missing"
            android.util.Log.d(r4, r5)
            ab.f r4 = ab.f.f215a
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            r5 = 2131755071(0x7f10003f, float:1.914101E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "context.getString(R.string.blePermissionTitle)"
            e6.e.C(r4, r5)
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r5 = r2.f11494b
            android.content.Context r5 = r5.f6765s
            r6 = 2131755069(0x7f10003d, float:1.9141007E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "context.getString(R.string.blePermissionBtn)"
            e6.e.C(r5, r6)
            ab.a r6 = ab.a.BLUETOOTH_PERMISSION
            r7 = 5
            r2.f11493a = r7
            java.lang.Object r4 = ab.f.f215a.i(r4, r5, r6, true, false, r2)
            if (r4 != r1) goto L_0x0364
            return r1
        L_0x02e2:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.a0(r4)
            if (r4 != 0) goto L_0x0323
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            java.lang.String r4 = r4.f6767u
            java.lang.String r5 = "Permissions isLocationEnabled missing"
            android.util.Log.d(r4, r5)
            ab.f r4 = ab.f.f215a
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            r5 = 2131755215(0x7f1000cf, float:1.9141303E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "context.getString(R.string.locationAlert)"
            e6.e.C(r4, r5)
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r5 = r2.f11494b
            android.content.Context r5 = r5.f6765s
            r6 = 2131755216(0x7f1000d0, float:1.9141305E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "context.getString(R.string.locationAlertAction)"
            e6.e.C(r5, r6)
            ab.a r6 = ab.a.ENABLE_LOCATION
            r7 = 6
            r2.f11493a = r7
            java.lang.Object r4 = ab.f.f215a.i(r4, r5, r6, true, false, r2)
            if (r4 != r1) goto L_0x0364
            return r1
        L_0x0323:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.Z(r4)
            if (r4 != 0) goto L_0x0364
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            java.lang.String r4 = r4.f6767u
            java.lang.String r5 = "Permissions isBluetoothEnabled missing"
            android.util.Log.d(r4, r5)
            ab.f r4 = ab.f.f215a
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            r5 = 2131755063(0x7f100037, float:1.9140995E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "context.getString(R.string.bleAlert)"
            e6.e.C(r4, r5)
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r5 = r2.f11494b
            android.content.Context r5 = r5.f6765s
            r6 = 2131755064(0x7f100038, float:1.9140997E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "context.getString(R.string.bleAlertAction)"
            e6.e.C(r5, r6)
            ab.a r6 = ab.a.ENABLE_BLUETOOTH
            r7 = 7
            r2.f11493a = r7
            java.lang.Object r4 = ab.f.f215a.i(r4, r5, r6, true, false, r2)
            if (r4 != r1) goto L_0x0364
            return r1
        L_0x0364:
            ab.f r4 = ab.f.f215a
            ab.b r5 = ab.f.f228p
            ab.b r6 = ab.b.DISCOVER_DEVICES
            if (r5 != r6) goto L_0x003b
            r4.f()
            goto L_0x003b
        L_0x0371:
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            android.content.Context r4 = r4.f6765s
            boolean r4 = ad.c.Q(r4)
            if (r4 == 0) goto L_0x003b
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            androidx.lifecycle.j0<java.lang.Boolean> r4 = r4.E
            java.lang.Object r4 = r4.d()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r4 = e6.e.r(r4, r5)
            if (r4 == 0) goto L_0x003b
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            java.lang.String r5 = r4.f6767u
            androidx.lifecycle.j0<java.lang.Boolean> r4 = r4.E
            java.lang.Object r4 = r4.d()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Permissions allPermGranted "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.d(r5, r4)
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            androidx.lifecycle.j0<java.lang.Boolean> r4 = r4.E
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.k(r5)
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r4 = r2.f11494b
            je.h<java.lang.Boolean> r4 = r4.P
            r6 = 8
            r2.f11493a = r6
            java.lang.Object r4 = r4.a(r5, r2)
            if (r4 != r1) goto L_0x03c1
            return r1
        L_0x03c1:
            r8 = r2
            goto L_0x001a
        L_0x03c4:
            ab.f r2 = ab.f.f215a
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r3 = r8.f11494b
            android.content.Context r3 = r3.f6765s
            r4 = 2131755199(0x7f1000bf, float:1.914127E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "context.getString(R.string.introAlert)"
            e6.e.C(r3, r4)
            ab.b r4 = ab.b.DISCOVER_DEVICES
            r5 = 9
            r8.f11493a = r5
            r5 = 0
            r6 = 0
            r7 = r8
            java.lang.Object r2 = r2.l(r3, r4, r5, r6, r7)
            if (r2 != r1) goto L_0x03e6
            return r1
        L_0x03e6:
            r2 = r8
            r3 = r9
            goto L_0x003b
        L_0x03ea:
            md.m r1 = md.m.f8555a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
