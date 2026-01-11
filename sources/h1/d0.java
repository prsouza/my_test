package h1;

import a5.d;
import a5.m;
import ab.i;
import ah.v;
import android.app.Activity;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import androidx.fragment.app.a0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import b5.b;
import bb.g;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.a;
import e6.e;
import ei.c;
import ge.o0;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.EstimateActivity;
import io.nodle.cash.ui.view.activity.HomeActivityV2;
import io.nodle.cash.ui.view.activity.OptionsActivity;
import io.nodle.cash.ui.view.activity.comm.NotificationsActivity;
import io.nodle.cash.ui.view.activity.onboard.ImportAccountActivity;
import io.nodle.cash.ui.view.activity.onboard.OnboardActivity;
import io.nodle.cash.ui.view.activity.transact.HistoryActivityV2;
import io.nodle.cash.ui.view.activity.transact.TransactActivity;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import io.nodle.cash.ui.viewmodel.OnboardViewModel;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import m3.u;
import pb.j;
import pb.o;
import pd.f;
import q.a;
import qb.k;
import sb.p;
import t6.q;

public final /* synthetic */ class d0 implements a, b.a, Continuation, SuccessContinuation, OnCompleteListener, k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5670a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5671b;

    public /* synthetic */ d0(Object obj, int i) {
        this.f5670a = i;
        this.f5671b = obj;
    }

    public final Object a() {
        return Integer.valueOf(((d) this.f5671b).j());
    }

    public final Object apply(Object obj) {
        l1.a aVar = (l1.a) obj;
        ((e0) this.f5671b).l();
        return null;
    }

    public final void d(Object obj) {
        int i;
        String[] strArr;
        q qVar;
        int i10 = -1;
        switch (this.f5670a) {
            case 6:
                HomeActivityV2 homeActivityV2 = (HomeActivityV2) this.f5671b;
                HomeViewModelV2.a aVar = (HomeViewModelV2.a) obj;
                int i11 = HomeActivityV2.H;
                Class<HistoryActivityV2> cls = HistoryActivityV2.class;
                e.D(homeActivityV2, "this$0");
                Log.d(homeActivityV2.f6710y, "Activity Action: " + aVar);
                if (aVar == null) {
                    i = -1;
                } else {
                    i = HomeActivityV2.a.f6711a[aVar.ordinal()];
                }
                String str = null;
                switch (i) {
                    case 1:
                        j.a aVar2 = j.F;
                        j.a aVar3 = j.F;
                        homeActivityV2.l(j.G);
                        e.C(aVar, "it");
                        homeActivityV2.n(aVar);
                        return;
                    case 2:
                        Objects.requireNonNull(k.f10366y);
                        homeActivityV2.l(k.A);
                        e.C(aVar, "it");
                        homeActivityV2.n(aVar);
                        return;
                    case 3:
                        homeActivityV2.startActivity(new Intent(homeActivityV2, NotificationsActivity.class));
                        return;
                    case 4:
                        homeActivityV2.startActivity(new Intent(homeActivityV2, OptionsActivity.class));
                        return;
                    case 5:
                        if (Boolean.parseBoolean(v.K("enable_transaction"))) {
                            homeActivityV2.startActivity(new Intent(homeActivityV2, TransactActivity.class));
                            return;
                        } else {
                            Toast.makeText(homeActivityV2, R.string.tempDisable, 1).show();
                            return;
                        }
                    case 6:
                        p.a aVar4 = p.f11089b;
                        p pVar = new p();
                        homeActivityV2.B = pVar;
                        a0 supportFragmentManager = homeActivityV2.getSupportFragmentManager();
                        p.a aVar5 = p.f11089b;
                        pVar.show(supportFragmentManager, p.f11090c);
                        return;
                    case 7:
                        p pVar2 = homeActivityV2.B;
                        if (pVar2 != null) {
                            pVar2.dismiss();
                            return;
                        }
                        return;
                    case 8:
                        HomeViewModelV2 homeViewModelV2 = homeActivityV2.z;
                        String str2 = homeViewModelV2 != null ? homeViewModelV2.f6771y : null;
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", str2);
                        intent.setType("text/plain");
                        homeActivityV2.startActivity(Intent.createChooser(intent, (CharSequence) null));
                        return;
                    case 9:
                        g gVar = g.REWARD;
                        Intent intent2 = new Intent(homeActivityV2, cls);
                        intent2.putExtra("EXTRA_TRANS_TYPE", gVar.ordinal());
                        homeActivityV2.startActivity(intent2);
                        return;
                    case 10:
                        g gVar2 = g.TRANSFER;
                        Intent intent3 = new Intent(homeActivityV2, cls);
                        intent3.putExtra("EXTRA_TRANS_TYPE", gVar2.ordinal());
                        homeActivityV2.startActivity(intent3);
                        return;
                    case 11:
                        String str3 = homeActivityV2.f6710y;
                        ab.k kVar = ab.k.f279a;
                        i iVar = ab.k.f282d;
                        Log.d(str3, "onNoticeSheetAction : " + (iVar != null ? iVar.f275d : null));
                        i iVar2 = ab.k.f282d;
                        if (iVar2 != null && iVar2.f275d != ab.j.NONE) {
                            i iVar3 = ab.k.f282d;
                            ab.j jVar = iVar3 != null ? iVar3.f275d : null;
                            if (jVar != null) {
                                i10 = HomeActivityV2.a.f6712b[jVar.ordinal()];
                            }
                            if (i10 == 1) {
                                Log.d(homeActivityV2.f6710y, "getLocationPermissions ");
                                c.c(homeActivityV2, homeActivityV2.getString(R.string.locPermissionTitle), ab.j.LOCATION_PERMISSION.ordinal(), (String[]) Arrays.copyOf(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2));
                                return;
                            } else if (i10 == 2) {
                                Log.d(homeActivityV2.f6710y, "getBluetoothPermissions ");
                                int ordinal = ab.j.BLUETOOTH_PERMISSION.ordinal();
                                if (Build.VERSION.SDK_INT >= 31) {
                                    strArr = new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"};
                                } else {
                                    strArr = new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"};
                                }
                                c.c(homeActivityV2, homeActivityV2.getString(R.string.blePermissionTitle), ordinal, (String[]) Arrays.copyOf(strArr, strArr.length));
                                return;
                            } else if (i10 == 3) {
                                j0 j0Var = new j0(Boolean.FALSE);
                                LocationRequest fastestInterval = LocationRequest.create().setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY).setInterval(30000).setFastestInterval(5000);
                                e.C(fastestInterval, "create()\n               ….setFastestInterval(5000)");
                                LocationSettingsRequest.Builder alwaysShow = new LocationSettingsRequest.Builder().addLocationRequest(fastestInterval).setAlwaysShow(true);
                                e.C(alwaysShow, "Builder()\n              …     .setAlwaysShow(true)");
                                Task<LocationSettingsResponse> checkLocationSettings = LocationServices.getSettingsClient((Activity) homeActivityV2).checkLocationSettings(alwaysShow.build());
                                e.C(checkLocationSettings, "getSettingsClient(activi…tings(reqBuilder.build())");
                                checkLocationSettings.addOnSuccessListener(new m(j0Var, 3));
                                checkLocationSettings.addOnFailureListener(new a5.q(homeActivityV2));
                                ge.g.b(c3.k.j(o0.f5433a), (f) null, new xa.b(homeActivityV2, j0Var, (pd.d<? super xa.b>) null), 3);
                                j0Var.e(homeActivityV2, new a5.q(homeActivityV2));
                                return;
                            } else if (i10 == 4) {
                                j0 j0Var2 = new j0(Boolean.FALSE);
                                if (ad.c.O(homeActivityV2)) {
                                    try {
                                        Object systemService = homeActivityV2.getSystemService("bluetooth");
                                        if (systemService != null) {
                                            ((BluetoothManager) systemService).getAdapter().enable();
                                            ge.g.b(c3.k.j(o0.f5433a), (f) null, new xa.a(homeActivityV2, j0Var2, (pd.d<? super xa.a>) null), 3);
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
                                        }
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                }
                                j0Var2.e(homeActivityV2, new x8.p(homeActivityV2));
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 12:
                        HomeViewModelV2 homeViewModelV22 = homeActivityV2.z;
                        if (homeViewModelV22 != null) {
                            str = homeViewModelV22.Q;
                        }
                        e.S(homeActivityV2, str);
                        return;
                    case 13:
                        Log.d(homeActivityV2.f6710y, "show AppReview start");
                        Context applicationContext = homeActivityV2.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = homeActivityV2;
                        }
                        q6.d dVar = new q6.d(new q6.g(applicationContext));
                        q6.g gVar3 = dVar.f10314a;
                        u uVar = q6.g.f10321c;
                        uVar.e("requestInAppReview (%s)", gVar3.f10323b);
                        if (gVar3.f10322a == null) {
                            uVar.c("Play Store app is either not installed or not the official version", new Object[0]);
                            l6.a aVar6 = new l6.a();
                            qVar = new q();
                            qVar.e(aVar6);
                        } else {
                            t6.m mVar = new t6.m();
                            gVar3.f10322a.b(new q6.e(gVar3, mVar, mVar), mVar);
                            qVar = mVar.f11420a;
                        }
                        e.C(qVar, "manager.requestReviewFlow()");
                        qVar.a(new d8.b(dVar, homeActivityV2));
                        return;
                    case 14:
                        o oVar = homeActivityV2.A;
                        if (oVar != null) {
                            oVar.dismiss();
                            return;
                        }
                        return;
                    case 15:
                        homeActivityV2.startActivity(new Intent(homeActivityV2, EstimateActivity.class));
                        return;
                    default:
                        return;
                }
            default:
                OnboardActivity onboardActivity = (OnboardActivity) this.f5671b;
                OnboardViewModel.a aVar7 = (OnboardViewModel.a) obj;
                int i12 = OnboardActivity.C;
                e.D(onboardActivity, "this$0");
                Log.d(onboardActivity.f6733y, "Activity Action: " + aVar7);
                if (aVar7 != null) {
                    i10 = OnboardActivity.a.f6734a[aVar7.ordinal()];
                }
                if (i10 == 1) {
                    onboardActivity.A = new mb.b();
                    androidx.fragment.app.a aVar8 = new androidx.fragment.app.a(onboardActivity.getSupportFragmentManager());
                    aVar8.f1919b = R.anim.enter_right;
                    aVar8.f1920c = R.anim.exit_left;
                    aVar8.f1921d = 0;
                    aVar8.f1922e = 0;
                    mb.b bVar = onboardActivity.A;
                    e.B(bVar);
                    aVar8.f(R.id.containerLayout, bVar);
                    aVar8.h();
                    return;
                } else if (i10 == 2) {
                    androidx.fragment.app.a aVar9 = new androidx.fragment.app.a(onboardActivity.getSupportFragmentManager());
                    mb.b bVar2 = onboardActivity.A;
                    e.B(bVar2);
                    aVar9.m(bVar2);
                    aVar9.h();
                    onboardActivity.startActivityForResult(new Intent(onboardActivity, ImportAccountActivity.class), 100);
                    return;
                } else if (i10 == 3) {
                    Log.d(onboardActivity.f6733y, "onOnboardComplete");
                    onboardActivity.startActivity(new Intent(onboardActivity, HomeActivityV2.class));
                    onboardActivity.finish();
                    return;
                } else {
                    return;
                }
        }
    }

    public final void onComplete(Task task) {
        String str = (String) this.f5671b;
        int i = cb.c.f3327a;
        e.D(str, "$it");
        e.D(task, "task");
        if (task.isSuccessful()) {
            androidx.fragment.app.m.g("Subscribed to ", str, "c");
        } else {
            androidx.fragment.app.m.g("Failed to Subscribe to ", str, "c");
        }
    }

    public final Object then(Task task) {
        ExecutorService executorService = x7.o0.f12956a;
        ((CountDownLatch) this.f5671b).countDown();
        return null;
    }

    public final Task then(Object obj) {
        switch (this.f5670a) {
            case 3:
                b9.c cVar = (b9.c) this.f5671b;
                Void voidR = (Void) obj;
                Task<c9.f> b10 = cVar.f2915d.b();
                Task<c9.f> b11 = cVar.f2916e.b();
                return Tasks.whenAllComplete((Task<?>[]) new Task[]{b10, b11}).continueWithTask(cVar.f2914c, new b9.a(cVar, b10, b11));
            default:
                c9.f fVar = (c9.f) obj;
                int[] iArr = com.google.firebase.remoteconfig.internal.a.f4233k;
                return Tasks.forResult((a.C0053a) this.f5671b);
        }
    }
}
