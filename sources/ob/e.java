package ob;

import android.widget.SeekBar;
import bb.a;
import tb.c;

public final class e implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f9405a;

    public e(h hVar) {
        this.f9405a = hVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        a aVar;
        e6.e.D(seekBar, "seekBar");
        h hVar = this.f9405a;
        hVar.f9411b = i;
        c cVar = hVar.f9410a;
        if (cVar != null && (aVar = cVar.f11473w) != null) {
            cVar.j(aVar, i);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        e6.e.D(seekBar, "seekBar");
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        e6.e.D(seekBar, "seekBar");
    }
}
