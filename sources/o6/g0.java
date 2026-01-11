package o6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import l6.j;
import l6.r;

public abstract class g0 extends b0 implements h0 {
    public g0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    public final boolean m(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) c0.a(parcel);
                j jVar = (j) this;
                jVar.f7903b.f8004d.c(jVar.f7902a);
                r.g.e("onStartDownload(%d)", Integer.valueOf(readInt));
                break;
            case 3:
                int readInt2 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) c0.a(parcel);
                j jVar2 = (j) this;
                jVar2.f7903b.f8004d.c(jVar2.f7902a);
                r.g.e("onCancelDownload(%d)", Integer.valueOf(readInt2));
                break;
            case 4:
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) c0.a(parcel);
                j jVar3 = (j) this;
                jVar3.f7903b.f8004d.c(jVar3.f7902a);
                r.g.e("onGetSession(%d)", Integer.valueOf(readInt3));
                break;
            case 5:
                d(parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 6:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) c0.a(parcel);
                Bundle bundle5 = (Bundle) c0.a(parcel);
                j jVar4 = (j) this;
                jVar4.f7903b.f8004d.c(jVar4.f7902a);
                r.g.e("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle4.getString("module_name"), bundle4.getString("slice_id"), Integer.valueOf(bundle4.getInt("chunk_number")), Integer.valueOf(bundle4.getInt("session_id")));
                break;
            case 7:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                zzd((Bundle) c0.a(parcel));
                break;
            case 8:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) c0.a(parcel);
                Bundle bundle7 = (Bundle) c0.a(parcel);
                j jVar5 = (j) this;
                jVar5.f7903b.f8004d.c(jVar5.f7902a);
                r.g.e("onNotifyModuleCompleted(%s, sessionId=%d)", bundle6.getString("module_name"), Integer.valueOf(bundle6.getInt("session_id")));
                break;
            case 10:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) c0.a(parcel);
                j jVar6 = (j) this;
                jVar6.f7903b.f8004d.c(jVar6.f7902a);
                r.g.e("onNotifySessionFailed(%d)", Integer.valueOf(((Bundle) c0.a(parcel)).getInt("session_id")));
                break;
            case 11:
                Parcelable.Creator creator8 = Bundle.CREATOR;
                i((Bundle) c0.a(parcel), (Bundle) c0.a(parcel));
                break;
            case 12:
                Parcelable.Creator creator9 = Bundle.CREATOR;
                b((Bundle) c0.a(parcel), (Bundle) c0.a(parcel));
                break;
            case 13:
                Parcelable.Creator creator10 = Bundle.CREATOR;
                Bundle bundle9 = (Bundle) c0.a(parcel);
                Bundle bundle10 = (Bundle) c0.a(parcel);
                j jVar7 = (j) this;
                jVar7.f7903b.f8004d.c(jVar7.f7902a);
                r.g.e("onRequestDownloadInfo()", new Object[0]);
                break;
            case 14:
                Parcelable.Creator creator11 = Bundle.CREATOR;
                Bundle bundle11 = (Bundle) c0.a(parcel);
                Bundle bundle12 = (Bundle) c0.a(parcel);
                j jVar8 = (j) this;
                jVar8.f7903b.f8004d.c(jVar8.f7902a);
                r.g.e("onRemoveModule()", new Object[0]);
                break;
            case 15:
                Parcelable.Creator creator12 = Bundle.CREATOR;
                Bundle bundle13 = (Bundle) c0.a(parcel);
                j jVar9 = (j) this;
                jVar9.f7903b.f8004d.c(jVar9.f7902a);
                r.g.e("onCancelDownloads()", new Object[0]);
                break;
            default:
                return false;
        }
        return true;
    }
}
