package r4;

import aa.b;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.k0;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.google.android.material.tabs.TabLayout;
import d0.a;
import e6.e;
import io.nodle.cash.R;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import nd.g;
import qb.k;
import qb.m;
import qb.q;
import qb.r;
import qb.u;
import r4.d;
import s4.h;
import s4.n;
import va.x0;

public final /* synthetic */ class c implements k0, Sentry.OptionsConfiguration, ScopeCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f10571a;

    public /* synthetic */ c(Object obj) {
        this.f10571a = obj;
    }

    public final Object a(Object obj) {
        GZIPOutputStream gZIPOutputStream;
        InputStream gZIPInputStream;
        d dVar = (d) this.f10571a;
        d.a aVar = (d.a) obj;
        Objects.requireNonNull(dVar);
        b.L("Making request to: %s", aVar.f10578a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f10578a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.4"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f10580c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                dVar.f10572a.a(aVar.f10579b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                b.L("Status Code: %d", Integer.valueOf(responseCode));
                b.A("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                b.A("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new d.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new d.b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                    d.b bVar = new d.b(responseCode, (URL) null, ((h) n.a(new BufferedReader(new InputStreamReader(gZIPInputStream)))).f10926a);
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
                throw th;
                throw th;
            } catch (Throwable th4) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th4;
            }
        } catch (ConnectException | UnknownHostException e10) {
            b.E("CctTransportBackend", "Couldn't open connection, returning with 500", e10);
            return new d.b(500, (URL) null, 0);
        } catch (i8.b | IOException e11) {
            b.E("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
            return new d.b(400, (URL) null, 0);
        } catch (Throwable th5) {
            th4.addSuppressed(th5);
        }
    }

    public final void configure(SentryOptions sentryOptions) {
        sentryOptions.setDsn((String) this.f10571a);
    }

    public final void d(Object obj) {
        float f10;
        String str;
        k kVar = (k) this.f10571a;
        u uVar = (u) obj;
        k.a aVar = k.f10366y;
        Objects.requireNonNull(kVar);
        r rVar = uVar.f10395c.get(uVar.f10393a);
        x0 d10 = kVar.d();
        if (uVar.f10394b) {
            ShimmerFrameLayout shimmerFrameLayout = d10.f12435w;
            e.C(shimmerFrameLayout, "shimmerLayout");
            shimmerFrameLayout.setVisibility(0);
            LinearLayout linearLayout = d10.z;
            e.C(linearLayout, "totalAmountContainer");
            linearLayout.setVisibility(8);
            d10.f12433u.setOnChartValueSelectedListener((OnChartValueSelectedListener) null);
        } else {
            ShimmerFrameLayout shimmerFrameLayout2 = d10.f12435w;
            e.C(shimmerFrameLayout2, "shimmerLayout");
            shimmerFrameLayout2.setVisibility(8);
            LinearLayout linearLayout2 = d10.z;
            e.C(linearLayout2, "totalAmountContainer");
            linearLayout2.setVisibility(0);
            TextView textView = d10.A;
            vb.b bVar = kVar.f10370w;
            if (bVar != null) {
                textView.setText(bVar.c(rVar.f10391d));
                d10.B.setText(rVar.f10390c);
                d10.f12433u.setOnChartValueSelectedListener(new k.c(rVar));
            } else {
                e.c0("nodleFormatter");
                throw null;
            }
        }
        List<r> list = uVar.f10395c;
        if (kVar.d().f12436x.getTabCount() <= 0) {
            int i = 0;
            for (T next : list) {
                int i10 = i + 1;
                if (i >= 0) {
                    TabLayout.f j10 = kVar.d().f12436x.j();
                    int i11 = k.d.f10375a[((r) next).f10388a.ordinal()];
                    if (i11 == 1) {
                        str = kVar.getString(R.string.day);
                    } else if (i11 == 2) {
                        str = kVar.getString(R.string.week);
                    } else if (i11 == 3) {
                        str = kVar.getString(R.string.month);
                    } else if (i11 == 4) {
                        str = kVar.getString(R.string.year);
                    } else {
                        throw new md.e();
                    }
                    e.C(str, "when (period.periodType)…g.year)\n                }");
                    j10.b(str);
                    j10.c(str);
                    j10.f4044h = i;
                    TabLayout.h hVar = j10.g;
                    if (hVar != null) {
                        hVar.setId(i);
                    }
                    kVar.d().f12436x.b(j10);
                    i = i10;
                } else {
                    a.b.N0();
                    throw null;
                }
            }
            kVar.d().f12436x.a(new m(kVar));
        }
        BarChart barChart = kVar.d().f12433u;
        barChart.setDrawBarShadow(false);
        barChart.getDescription().setEnabled(false);
        barChart.getLegend().setEnabled(false);
        barChart.setFitBars(true);
        barChart.setDragEnabled(false);
        barChart.setScaleEnabled(false);
        barChart.setAutoScaleMinMaxEnabled(true);
        barChart.setDrawGridBackground(false);
        XAxis xAxis = barChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        Context context = barChart.getContext();
        Object obj2 = a.f4256a;
        xAxis.setAxisLineColor(a.c.a(context, R.color.separatorV2));
        xAxis.setDrawAxisLine(true);
        xAxis.setDrawGridLines(false);
        xAxis.setTextColor(a.c.a(barChart.getContext(), R.color.textSecondaryV2));
        xAxis.setLabelCount(rVar.f10392e.size());
        List<q> list2 = rVar.f10392e;
        ArrayList arrayList = new ArrayList(g.S0(list2));
        for (q qVar : list2) {
            arrayList.add(qVar.f10386c);
        }
        xAxis.setValueFormatter(new IndexAxisValueFormatter((Collection<String>) arrayList));
        YAxis axisLeft = barChart.getAxisLeft();
        axisLeft.setDrawLabels(false);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setAxisMinimum(0.0f);
        YAxis axisRight = barChart.getAxisRight();
        axisRight.setDrawLabels(false);
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawGridLines(false);
        axisRight.setAxisMinimum(0.0f);
        ub.e eVar = new ub.e(barChart, barChart.getAnimator(), barChart.getViewPortHandler());
        eVar.f11929b = barChart.getResources().getDimension(R.dimen.graph_bar_corner_radius);
        barChart.setRenderer(eVar);
        kVar.c();
        long j11 = kVar.f10367t;
        barChart.animateXY((int) j11, (int) (((double) j11) * 1.5d));
        kVar.d().f12430c.setOnClickListener(new qb.g(kVar));
        boolean z = uVar.f10394b;
        Iterator<T> it = rVar.f10392e.iterator();
        if (it.hasNext()) {
            BigInteger bigInteger = ((q) it.next()).f10387d;
            while (it.hasNext()) {
                BigInteger bigInteger2 = ((q) it.next()).f10387d;
                if (bigInteger.compareTo(bigInteger2) < 0) {
                    bigInteger = bigInteger2;
                }
            }
            float height = kVar.d().f12433u.getHeight() > 0 ? (float) kVar.d().f12433u.getHeight() : 1000.0f;
            Context requireContext = kVar.requireContext();
            e.C(requireContext, "requireContext()");
            Resources resources = requireContext.getResources();
            e.C(resources, "resources");
            float max = Math.max(bigInteger.floatValue() / height, 1.0f) * ((float) ((int) TypedValue.applyDimension(1, (float) 2, resources.getDisplayMetrics())));
            ri.a.f10801a.a("minValue on chart = " + max, new Object[0]);
            List<q> list3 = rVar.f10392e;
            ArrayList arrayList2 = new ArrayList(g.S0(list3));
            int i12 = 0;
            for (T next2 : list3) {
                int i13 = i12 + 1;
                if (i12 >= 0) {
                    q qVar2 = (q) next2;
                    if (!z) {
                        e.D(qVar2, "<this>");
                        if (!(System.currentTimeMillis() < qVar2.f10384a)) {
                            f10 = Math.max(qVar2.f10387d.floatValue(), max);
                            arrayList2.add(new BarEntry((float) i12, f10));
                            i12 = i13;
                        }
                    }
                    f10 = 0.0f;
                    arrayList2.add(new BarEntry((float) i12, f10));
                    i12 = i13;
                } else {
                    a.b.N0();
                    throw null;
                }
            }
            if (kVar.d().f12433u.getData() == null || ((BarData) kVar.d().f12433u.getData()).getDataSetCount() <= 0) {
                k.b bVar2 = new k.b(height, arrayList2);
                bVar2.setDrawIcons(false);
                bVar2.setDrawValues(false);
                Context context2 = kVar.getContext();
                if (context2 != null) {
                    Object obj3 = a.f4256a;
                    bVar2.setHighLightColor(a.c.a(context2, R.color.whiteV2));
                }
                bVar2.setHighLightAlpha(200);
                Context context3 = kVar.getContext();
                if (context3 != null) {
                    Object obj4 = a.f4256a;
                    bVar2.setGradientColor(a.c.a(context3, R.color.stat_graph_min), a.c.a(context3, R.color.stat_graph_max));
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(bVar2);
                BarData barData = new BarData((List<IBarDataSet>) arrayList3);
                barData.setValueTextSize(10.0f);
                kVar.d().f12433u.setData(barData);
                return;
            }
            IDataSet dataSetByIndex = ((BarData) kVar.d().f12433u.getData()).getDataSetByIndex(0);
            Objects.requireNonNull(dataSetByIndex, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
            ((BarDataSet) dataSetByIndex).setValues(arrayList2);
            kVar.d().f12433u.notifyDataSetChanged();
            return;
        }
        throw new NoSuchElementException();
    }

    public final void run(Scope scope) {
        ((AtomicReference) this.f10571a).set(scope.getUser());
    }
}
