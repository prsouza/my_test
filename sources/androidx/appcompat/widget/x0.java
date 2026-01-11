package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.mikephil.charting.BuildConfig;
import io.nodle.cash.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import r0.c;

public final class x0 extends c implements View.OnClickListener {
    public static final /* synthetic */ int N = 0;
    public final SearchView A;
    public final SearchableInfo B;
    public final Context C;
    public final WeakHashMap<String, Drawable.ConstantState> D;
    public final int E;
    public int F = 1;
    public ColorStateList G;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int M = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1416a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1417b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1418c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1419d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1420e;

        public a(View view) {
            this.f1416a = (TextView) view.findViewById(16908308);
            this.f1417b = (TextView) view.findViewById(16908309);
            this.f1418c = (ImageView) view.findViewById(16908295);
            this.f1419d = (ImageView) view.findViewById(16908296);
            this.f1420e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public x0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.A = searchView;
        this.B = searchableInfo;
        this.E = searchView.getSuggestionCommitIconResId();
        this.C = context;
        this.D = weakHashMap;
    }

    public static String i(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.View r18, android.database.Cursor r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            java.lang.Object r0 = r18.getTag()
            r3 = r0
            androidx.appcompat.widget.x0$a r3 = (androidx.appcompat.widget.x0.a) r3
            int r0 = r1.M
            r4 = -1
            r5 = 0
            if (r0 == r4) goto L_0x0017
            int r0 = r2.getInt(r0)
            r4 = r0
            goto L_0x0018
        L_0x0017:
            r4 = r5
        L_0x0018:
            android.widget.TextView r0 = r3.f1416a
            r6 = 8
            if (r0 == 0) goto L_0x0036
            int r0 = r1.H
            java.lang.String r0 = i(r2, r0)
            android.widget.TextView r7 = r3.f1416a
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0033
            r7.setVisibility(r6)
            goto L_0x0036
        L_0x0033:
            r7.setVisibility(r5)
        L_0x0036:
            android.widget.TextView r0 = r3.f1417b
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x00bf
            int r0 = r1.J
            java.lang.String r0 = i(r2, r0)
            if (r0 == 0) goto L_0x0086
            android.content.res.ColorStateList r9 = r1.G
            if (r9 != 0) goto L_0x0067
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.Context r10 = r1.C
            android.content.res.Resources$Theme r10 = r10.getTheme()
            r11 = 2130904155(0x7f03045b, float:1.7415148E38)
            r10.resolveAttribute(r11, r9, r8)
            android.content.Context r10 = r1.C
            android.content.res.Resources r10 = r10.getResources()
            int r9 = r9.resourceId
            android.content.res.ColorStateList r9 = r10.getColorStateList(r9)
            r1.G = r9
        L_0x0067:
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r11 = 0
            r12 = 0
            r13 = 0
            android.content.res.ColorStateList r14 = r1.G
            r16 = 0
            r10 = r15
            r6 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            int r0 = r0.length()
            r10 = 33
            r9.setSpan(r6, r5, r0, r10)
            goto L_0x008c
        L_0x0086:
            int r0 = r1.I
            java.lang.String r9 = i(r2, r0)
        L_0x008c:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x009f
            android.widget.TextView r0 = r3.f1416a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r5)
            android.widget.TextView r0 = r3.f1416a
            r0.setMaxLines(r7)
            goto L_0x00ab
        L_0x009f:
            android.widget.TextView r0 = r3.f1416a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r8)
            android.widget.TextView r0 = r3.f1416a
            r0.setMaxLines(r8)
        L_0x00ab:
            android.widget.TextView r0 = r3.f1417b
            r0.setText(r9)
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            if (r6 == 0) goto L_0x00bc
            r6 = 8
            r0.setVisibility(r6)
            goto L_0x00bf
        L_0x00bc:
            r0.setVisibility(r5)
        L_0x00bf:
            android.widget.ImageView r6 = r3.f1418c
            if (r6 == 0) goto L_0x0161
            int r0 = r1.K
            r9 = -1
            if (r0 != r9) goto L_0x00cb
            r0 = 0
            goto L_0x015d
        L_0x00cb:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.g(r0)
            if (r0 == 0) goto L_0x00d7
            goto L_0x015d
        L_0x00d7:
            android.app.SearchableInfo r0 = r1.B
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r9 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r1.D
            boolean r10 = r10.containsKey(r9)
            if (r10 == 0) goto L_0x0100
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.D
            java.lang.Object r0 = r0.get(r9)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f5
            r0 = 0
            goto L_0x0150
        L_0x00f5:
            android.content.Context r9 = r1.C
            android.content.res.Resources r9 = r9.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r9)
            goto L_0x0150
        L_0x0100:
            java.lang.String r10 = "SuggestionsAdapter"
            android.content.Context r11 = r1.C
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            r12 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r12 = r11.getActivityInfo(r0, r12)     // Catch:{ NameNotFoundException -> 0x0138 }
            int r13 = r12.getIconResource()
            if (r13 != 0) goto L_0x0115
            goto L_0x0141
        L_0x0115:
            java.lang.String r14 = r0.getPackageName()
            android.content.pm.ApplicationInfo r12 = r12.applicationInfo
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r14, r13, r12)
            if (r11 != 0) goto L_0x0142
            java.lang.String r11 = "Invalid icon resource "
            java.lang.String r12 = " for "
            java.lang.StringBuilder r11 = a8.a.d(r11, r13, r12)
            java.lang.String r0 = r0.flattenToShortString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r10, r0)
            goto L_0x0141
        L_0x0138:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r10, r0)
        L_0x0141:
            r11 = 0
        L_0x0142:
            if (r11 != 0) goto L_0x0146
            r0 = 0
            goto L_0x014a
        L_0x0146:
            android.graphics.drawable.Drawable$ConstantState r0 = r11.getConstantState()
        L_0x014a:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r1.D
            r10.put(r9, r0)
            r0 = r11
        L_0x0150:
            if (r0 == 0) goto L_0x0153
            goto L_0x015d
        L_0x0153:
            android.content.Context r0 = r1.C
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x015d:
            r9 = 4
            r1.j(r6, r0, r9)
        L_0x0161:
            android.widget.ImageView r0 = r3.f1419d
            if (r0 == 0) goto L_0x0179
            int r6 = r1.L
            r9 = -1
            if (r6 != r9) goto L_0x016c
            r2 = 0
            goto L_0x0174
        L_0x016c:
            java.lang.String r2 = r2.getString(r6)
            android.graphics.drawable.Drawable r2 = r1.g(r2)
        L_0x0174:
            r6 = 8
            r1.j(r0, r2, r6)
        L_0x0179:
            int r0 = r1.F
            if (r0 == r7) goto L_0x018c
            if (r0 != r8) goto L_0x0184
            r0 = r4 & 1
            if (r0 == 0) goto L_0x0184
            goto L_0x018c
        L_0x0184:
            android.widget.ImageView r0 = r3.f1420e
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x01a1
        L_0x018c:
            android.widget.ImageView r0 = r3.f1420e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.f1420e
            android.widget.TextView r2 = r3.f1416a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f1420e
            r0.setOnClickListener(r1)
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x0.b(android.view.View, android.database.Cursor):void");
    }

    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.H = cursor.getColumnIndex("suggest_text_1");
                this.I = cursor.getColumnIndex("suggest_text_2");
                this.J = cursor.getColumnIndex("suggest_text_2_url");
                this.K = cursor.getColumnIndex("suggest_icon_1");
                this.L = cursor.getColumnIndex("suggest_icon_2");
                this.M = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    public final CharSequence d(Cursor cursor) {
        String i;
        String i10;
        if (cursor == null) {
            return null;
        }
        String i11 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (i11 != null) {
            return i11;
        }
        if (this.B.shouldRewriteQueryFromData() && (i10 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return i10;
        }
        if (!this.B.shouldRewriteQueryFromText() || (i = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return i;
    }

    public final View e(ViewGroup viewGroup) {
        View inflate = this.z.inflate(this.f10515x, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.E);
        return inflate;
    }

    public final Drawable f(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.C.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:33|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable g(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            r1 = 0
            if (r8 == 0) goto L_0x013b
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x013b
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0015
            goto L_0x013b
        L_0x0015:
            int r2 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.content.Context r4 = r7.C     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.D     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x0048
        L_0x0044:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
        L_0x0048:
            if (r4 == 0) goto L_0x004b
            return r4
        L_0x004b:
            android.content.Context r4 = r7.C     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.Object r5 = d0.a.f4256a     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable r2 = d0.a.b.b(r4, r2)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            if (r2 == 0) goto L_0x005e
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.D     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable$ConstantState r5 = r2.getConstantState()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r4.put(r3, r5)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
        L_0x005e:
            return r2
        L_0x005f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon resource not found: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.w(r0, r8)
            return r1
        L_0x0074:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r2 = r7.D
            java.lang.Object r2 = r2.get(r8)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x0080
            r2 = r1
            goto L_0x0084
        L_0x0080:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L_0x0084:
            if (r2 == 0) goto L_0x0087
            return r2
        L_0x0087:
            android.net.Uri r2 = android.net.Uri.parse(r8)
            java.lang.String r3 = "Error closing icon stream for "
            java.lang.String r4 = r2.getScheme()     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r5 = "android.resource"
            boolean r4 = r5.equals(r4)     // Catch:{ FileNotFoundException -> 0x010f }
            if (r4 == 0) goto L_0x00b6
            android.graphics.drawable.Drawable r1 = r7.f(r2)     // Catch:{ NotFoundException -> 0x009f }
            goto L_0x0130
        L_0x009f:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r5 = "Resource does not exist: "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010f }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010f }
            throw r3     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00b6:
            android.content.Context r4 = r7.C     // Catch:{ FileNotFoundException -> 0x010f }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x010f }
            java.io.InputStream r4 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            if (r4 == 0) goto L_0x00f8
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r1)     // Catch:{ all -> 0x00df }
            r4.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00dd
        L_0x00ca:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00dd:
            r1 = r5
            goto L_0x0130
        L_0x00df:
            r5 = move-exception
            r4.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00f7
        L_0x00e4:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00f7:
            throw r5     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00f8:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r5 = "Failed to open "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010f }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010f }
            throw r3     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x010f:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Icon not found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
        L_0x0130:
            if (r1 == 0) goto L_0x013b
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r7.D
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
            r0.put(r8, r2)
        L_0x013b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x0.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.z.inflate(this.f10516y, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f1416a.setText(e10.toString());
            }
            return inflate;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View e11 = e(viewGroup);
            ((a) e11.getTag()).f1416a.setText(e10.toString());
            return e11;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        Uri build = fragment.build();
        return this.C.getContentResolver().query(build, (String[]) null, suggestSelection, strArr, (String) null);
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void j(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f10506c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f10506c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.A.r((CharSequence) tag);
        }
    }
}
