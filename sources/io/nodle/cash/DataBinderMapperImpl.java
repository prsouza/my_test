package io.nodle.cash;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.databinding.e;
import androidx.fragment.app.m;
import com.google.android.gms.maps.R;
import java.util.ArrayList;
import java.util.List;
import va.a0;
import va.a1;
import va.b;
import va.c1;
import va.d0;
import va.d1;
import va.f;
import va.f0;
import va.f1;
import va.h;
import va.h0;
import va.h1;
import va.j;
import va.j0;
import va.j1;
import va.l;
import va.l0;
import va.l1;
import va.n;
import va.o0;
import va.o1;
import va.q;
import va.q0;
import va.s;
import va.s0;
import va.u;
import va.u0;
import va.w;
import va.w0;
import va.y;

public class DataBinderMapperImpl extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f6681a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(31);
        f6681a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_estimate, 1);
        sparseIntArray.put(R.layout.activity_history_v2, 2);
        sparseIntArray.put(R.layout.activity_home_v2, 3);
        sparseIntArray.put(R.layout.activity_notifications, 4);
        sparseIntArray.put(R.layout.activity_onboard, 5);
        sparseIntArray.put(R.layout.activity_options, 6);
        sparseIntArray.put(R.layout.activity_wallet_backup, 7);
        sparseIntArray.put(R.layout.fragment_backup, 8);
        sparseIntArray.put(R.layout.fragment_backup_phrase, 9);
        sparseIntArray.put(R.layout.fragment_backup_verify, 10);
        sparseIntArray.put(R.layout.fragment_current, 11);
        sparseIntArray.put(R.layout.fragment_flash, 12);
        sparseIntArray.put(R.layout.fragment_info, 13);
        sparseIntArray.put(R.layout.fragment_logout, 14);
        sparseIntArray.put(R.layout.fragment_map, 15);
        sparseIntArray.put(R.layout.fragment_notif_detail, 16);
        sparseIntArray.put(R.layout.fragment_onboard, 17);
        sparseIntArray.put(R.layout.fragment_options, 18);
        sparseIntArray.put(R.layout.fragment_sheet_history_detail, 19);
        sparseIntArray.put(R.layout.fragment_sheet_home, 20);
        sparseIntArray.put(R.layout.fragment_sheet_notice, 21);
        sparseIntArray.put(R.layout.fragment_sheet_receive, 22);
        sparseIntArray.put(R.layout.fragment_simulator, 23);
        sparseIntArray.put(R.layout.layout_history_summary, 24);
        sparseIntArray.put(R.layout.notice_announce, 25);
        sparseIntArray.put(R.layout.notice_call_action, 26);
        sparseIntArray.put(R.layout.notice_info, 27);
        sparseIntArray.put(R.layout.toolbar_estimate, 28);
        sparseIntArray.put(R.layout.toolbar_history_v2, 29);
        sparseIntArray.put(R.layout.toolbar_home_v2, 30);
        sparseIntArray.put(R.layout.toolbar_options, 31);
    }

    public final List<d> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public final ViewDataBinding b(e eVar, View view, int i) {
        int i10 = f6681a.get(i);
        if (i10 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i10) {
                case 1:
                    if ("layout/activity_estimate_0".equals(tag)) {
                        return new b(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for activity_estimate is invalid. Received: ", tag));
                case 2:
                    if ("layout/activity_history_v2_0".equals(tag)) {
                        return new va.d(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for activity_history_v2 is invalid. Received: ", tag));
                case 3:
                    if ("layout/activity_home_v2_0".equals(tag)) {
                        return new f(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for activity_home_v2 is invalid. Received: ", tag));
                case 4:
                    if ("layout/activity_notifications_0".equals(tag)) {
                        return new h(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for activity_notifications is invalid. Received: ", tag));
                case 5:
                    if ("layout/activity_onboard_0".equals(tag)) {
                        return new j(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for activity_onboard is invalid. Received: ", tag));
                case 6:
                    if ("layout/activity_options_0".equals(tag)) {
                        return new l(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for activity_options is invalid. Received: ", tag));
                case 7:
                    if ("layout/activity_wallet_backup_0".equals(tag)) {
                        return new n(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for activity_wallet_backup is invalid. Received: ", tag));
                case 8:
                    if ("layout/fragment_backup_0".equals(tag)) {
                        return new q(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_backup is invalid. Received: ", tag));
                case 9:
                    if ("layout/fragment_backup_phrase_0".equals(tag)) {
                        return new s(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_backup_phrase is invalid. Received: ", tag));
                case 10:
                    if ("layout/fragment_backup_verify_0".equals(tag)) {
                        return new u(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_backup_verify is invalid. Received: ", tag));
                case 11:
                    if ("layout/fragment_current_0".equals(tag)) {
                        return new w(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_current is invalid. Received: ", tag));
                case 12:
                    if ("layout/fragment_flash_0".equals(tag)) {
                        return new y(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_flash is invalid. Received: ", tag));
                case 13:
                    if ("layout/fragment_info_0".equals(tag)) {
                        return new a0(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_info is invalid. Received: ", tag));
                case 14:
                    if ("layout/fragment_logout_0".equals(tag)) {
                        return new d0(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_logout is invalid. Received: ", tag));
                case 15:
                    if ("layout/fragment_map_0".equals(tag)) {
                        return new f0(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_map is invalid. Received: ", tag));
                case 16:
                    if ("layout/fragment_notif_detail_0".equals(tag)) {
                        return new h0(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_notif_detail is invalid. Received: ", tag));
                case 17:
                    if ("layout/fragment_onboard_0".equals(tag)) {
                        return new j0(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_onboard is invalid. Received: ", tag));
                case 18:
                    if ("layout/fragment_options_0".equals(tag)) {
                        return new l0(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_options is invalid. Received: ", tag));
                case 19:
                    if ("layout/fragment_sheet_history_detail_0".equals(tag)) {
                        return new o0(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_sheet_history_detail is invalid. Received: ", tag));
                case 20:
                    if ("layout/fragment_sheet_home_0".equals(tag)) {
                        return new q0(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_sheet_home is invalid. Received: ", tag));
                case 21:
                    if ("layout/fragment_sheet_notice_0".equals(tag)) {
                        return new s0(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_sheet_notice is invalid. Received: ", tag));
                case 22:
                    if ("layout/fragment_sheet_receive_0".equals(tag)) {
                        return new u0(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_sheet_receive is invalid. Received: ", tag));
                case 23:
                    if ("layout/fragment_simulator_0".equals(tag)) {
                        return new w0(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for fragment_simulator is invalid. Received: ", tag));
                case 24:
                    if ("layout/layout_history_summary_0".equals(tag)) {
                        return new a1(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for layout_history_summary is invalid. Received: ", tag));
                case R.styleable.MapAttrs_zOrderOnTop:
                    if ("layout/notice_announce_0".equals(tag)) {
                        return new c1(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for notice_announce is invalid. Received: ", tag));
                case 26:
                    if ("layout/notice_call_action_0".equals(tag)) {
                        return new d1(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for notice_call_action is invalid. Received: ", tag));
                case 27:
                    if ("layout/notice_info_0".equals(tag)) {
                        return new f1(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for notice_info is invalid. Received: ", tag));
                case 28:
                    if ("layout/toolbar_estimate_0".equals(tag)) {
                        return new h1(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for toolbar_estimate is invalid. Received: ", tag));
                case 29:
                    if ("layout/toolbar_history_v2_0".equals(tag)) {
                        return new j1(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for toolbar_history_v2 is invalid. Received: ", tag));
                case 30:
                    if ("layout/toolbar_home_v2_0".equals(tag)) {
                        return new l1(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for toolbar_home_v2 is invalid. Received: ", tag));
                case 31:
                    if ("layout/toolbar_options_0".equals(tag)) {
                        return new o1(eVar, view);
                    }
                    throw new IllegalArgumentException(m.c("The tag for toolbar_options is invalid. Received: ", tag));
                default:
                    return null;
            }
        } else {
            throw new RuntimeException("view must have a tag");
        }
    }

    public final ViewDataBinding c(e eVar, View[] viewArr, int i) {
        if (viewArr.length == 0 || f6681a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
