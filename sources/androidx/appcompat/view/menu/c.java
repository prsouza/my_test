package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.Objects;

public final class c implements i, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Context f908a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f909b;

    /* renamed from: c  reason: collision with root package name */
    public e f910c;

    /* renamed from: s  reason: collision with root package name */
    public ExpandedMenuView f911s;

    /* renamed from: t  reason: collision with root package name */
    public i.a f912t;

    /* renamed from: u  reason: collision with root package name */
    public a f913u;

    public class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public int f914a = -1;

        public a() {
            b();
        }

        public final void b() {
            e eVar = c.this.f910c;
            g gVar = eVar.f942v;
            if (gVar != null) {
                eVar.j();
                ArrayList<g> arrayList = eVar.f930j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == gVar) {
                        this.f914a = i;
                        return;
                    }
                }
            }
            this.f914a = -1;
        }

        /* renamed from: c */
        public final g getItem(int i) {
            e eVar = c.this.f910c;
            eVar.j();
            ArrayList<g> arrayList = eVar.f930j;
            Objects.requireNonNull(c.this);
            int i10 = i + 0;
            int i11 = this.f914a;
            if (i11 >= 0 && i10 >= i11) {
                i10++;
            }
            return arrayList.get(i10);
        }

        public final int getCount() {
            e eVar = c.this.f910c;
            eVar.j();
            int size = eVar.f930j.size();
            Objects.requireNonNull(c.this);
            int i = size + 0;
            return this.f914a < 0 ? i : i - 1;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = c.this.f909b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((j.a) view).d(getItem(i));
            return view;
        }

        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context) {
        this.f908a = context;
        this.f909b = LayoutInflater.from(context);
    }

    public final void a(e eVar, boolean z) {
        i.a aVar = this.f912t;
        if (aVar != null) {
            aVar.a(eVar, z);
        }
    }

    public final ListAdapter b() {
        if (this.f913u == null) {
            this.f913u = new a();
        }
        return this.f913u;
    }

    public final boolean c(g gVar) {
        return false;
    }

    public final void e(Context context, e eVar) {
        if (this.f908a != null) {
            this.f908a = context;
            if (this.f909b == null) {
                this.f909b = LayoutInflater.from(context);
            }
        }
        this.f910c = eVar;
        a aVar = this.f913u;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final void f() {
        a aVar = this.f913u;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public final boolean h(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        f fVar = new f(lVar);
        b.a aVar = new b.a(lVar.f923a);
        c cVar = new c(aVar.f861a.f843a);
        fVar.f947c = cVar;
        cVar.f912t = fVar;
        fVar.f945a.b(cVar);
        ListAdapter b10 = fVar.f947c.b();
        AlertController.b bVar = aVar.f861a;
        bVar.f853m = b10;
        bVar.f854n = fVar;
        View view = lVar.f935o;
        if (view != null) {
            bVar.f847e = view;
        } else {
            bVar.f845c = lVar.f934n;
            bVar.f846d = lVar.f933m;
        }
        bVar.f852l = fVar;
        b a10 = aVar.a();
        fVar.f946b = a10;
        a10.setOnDismissListener(fVar);
        WindowManager.LayoutParams attributes = fVar.f946b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        fVar.f946b.show();
        i.a aVar2 = this.f912t;
        if (aVar2 == null) {
            return true;
        }
        aVar2.b(lVar);
        return true;
    }

    public final boolean i() {
        return false;
    }

    public final void j(i.a aVar) {
        this.f912t = aVar;
    }

    public final boolean k(g gVar) {
        return false;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
        this.f910c.t(this.f913u.getItem(i), this, 0);
    }
}
