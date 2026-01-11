package com.google.android.gms.internal.measurement;

import a.a;
import androidx.fragment.app.o;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzil<MessageType extends zzil<MessageType, BuilderType>, BuilderType extends zzik<MessageType, BuilderType>> implements zzlj {
    public int zzb = 0;

    public static void zzbw(Iterable iterable, List list) {
        zzkk.zze(iterable);
        if (iterable instanceof zzkr) {
            List zzh = ((zzkr) iterable).zzh();
            zzkr zzkr = (zzkr) list;
            int size = list.size();
            for (Object next : zzh) {
                if (next == null) {
                    int size2 = zzkr.size();
                    StringBuilder d10 = a.d("Element at index ");
                    d10.append(size2 - size);
                    d10.append(" is null.");
                    String sb2 = d10.toString();
                    int size3 = zzkr.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            zzkr.remove(size3);
                        } else {
                            throw new NullPointerException(sb2);
                        }
                    }
                } else if (next instanceof zzjb) {
                    zzkr.zzi((zzjb) next);
                } else {
                    zzkr.add((String) next);
                }
            }
        } else if (!(iterable instanceof zzlq)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size();
                    StringBuilder d11 = a.d("Element at index ");
                    d11.append(size5 - size4);
                    d11.append(" is null.");
                    String sb3 = d11.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 >= size4) {
                            list.remove(size6);
                        } else {
                            throw new NullPointerException(sb3);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    public int zzbu() {
        throw null;
    }

    public final zzjb zzbv() {
        try {
            int zzbz = zzbz();
            zzjb zzjb = zzjb.zzb;
            byte[] bArr = new byte[zzbz];
            zzjj zzC = zzjj.zzC(bArr);
            zzbN(zzC);
            zzC.zzD();
            return new zziy(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(o.c("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public void zzbx(int i) {
        throw null;
    }

    public final byte[] zzby() {
        try {
            byte[] bArr = new byte[zzbz()];
            zzjj zzC = zzjj.zzC(bArr);
            zzbN(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(o.c("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
