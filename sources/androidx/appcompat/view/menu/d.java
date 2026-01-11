package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

public final class d extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public e f916a;

    /* renamed from: b  reason: collision with root package name */
    public int f917b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f918c;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f919s;

    /* renamed from: t  reason: collision with root package name */
    public final LayoutInflater f920t;

    /* renamed from: u  reason: collision with root package name */
    public final int f921u;

    public d(e eVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f919s = z;
        this.f920t = layoutInflater;
        this.f916a = eVar;
        this.f921u = i;
        b();
    }

    public final void b() {
        e eVar = this.f916a;
        g gVar = eVar.f942v;
        if (gVar != null) {
            eVar.j();
            ArrayList<g> arrayList = eVar.f930j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == gVar) {
                    this.f917b = i;
                    return;
                }
            }
        }
        this.f917b = -1;
    }

    /* renamed from: c */
    public final g getItem(int i) {
        ArrayList<g> arrayList;
        if (this.f919s) {
            e eVar = this.f916a;
            eVar.j();
            arrayList = eVar.f930j;
        } else {
            arrayList = this.f916a.m();
        }
        int i10 = this.f917b;
        if (i10 >= 0 && i >= i10) {
            i++;
        }
        return arrayList.get(i);
    }

    public final int getCount() {
        ArrayList<g> arrayList;
        if (this.f919s) {
            e eVar = this.f916a;
            eVar.j();
            arrayList = eVar.f930j;
        } else {
            arrayList = this.f916a.m();
        }
        if (this.f917b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f920t.inflate(this.f921u, viewGroup, false);
        }
        int i10 = getItem(i).f949b;
        int i11 = i - 1;
        int i12 = i11 >= 0 ? getItem(i11).f949b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f916a.n() && i10 != i12) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        j.a aVar = (j.a) view;
        if (this.f918c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
