package r0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import b9.m;
import r0.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10504a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10505b = true;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f10506c = null;

    /* renamed from: s  reason: collision with root package name */
    public Context f10507s;

    /* renamed from: t  reason: collision with root package name */
    public int f10508t;

    /* renamed from: u  reason: collision with root package name */
    public C0205a f10509u;

    /* renamed from: v  reason: collision with root package name */
    public b f10510v;

    /* renamed from: w  reason: collision with root package name */
    public b f10511w;

    /* renamed from: r0.a$a  reason: collision with other inner class name */
    public class C0205a extends ContentObserver {
        public C0205a() {
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f10505b && (cursor = aVar.f10506c) != null && !cursor.isClosed()) {
                aVar.f10504a = aVar.f10506c.requery();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public final void onChanged() {
            a aVar = a.this;
            aVar.f10504a = true;
            aVar.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f10504a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
        this.f10507s = context;
        this.f10508t = -1;
        this.f10509u = new C0205a();
        this.f10510v = new b();
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f10506c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0205a aVar = this.f10509u;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f10510v;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f10506c = cursor;
            if (cursor != null) {
                C0205a aVar2 = this.f10509u;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f10510v;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f10508t = cursor.getColumnIndexOrThrow("_id");
                this.f10504a = true;
                notifyDataSetChanged();
            } else {
                this.f10508t = -1;
                this.f10504a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.f10504a || (cursor = this.f10506c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10504a) {
            return null;
        }
        this.f10506c.moveToPosition(i);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.z.inflate(cVar.f10516y, viewGroup, false);
        }
        b(view, this.f10506c);
        return view;
    }

    public final Filter getFilter() {
        if (this.f10511w == null) {
            this.f10511w = new b(this);
        }
        return this.f10511w;
    }

    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f10504a || (cursor = this.f10506c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f10506c;
    }

    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.f10504a || (cursor = this.f10506c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f10506c.getLong(this.f10508t);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f10504a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f10506c.moveToPosition(i)) {
            if (view == null) {
                view = e(viewGroup);
            }
            b(view, this.f10506c);
            return view;
        } else {
            throw new IllegalStateException(m.b("couldn't move cursor to position ", i));
        }
    }
}
