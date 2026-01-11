package io.nodle.cash.data.remote.api.response;

import com.google.gson.annotations.SerializedName;
import e6.e;

public final class TransferApiModel {
    private final String amount;
    @SerializedName("block_num")
    private final long blockNumber;
    private final long blockTimestamp;
    private final String fee;
    private final String from;
    private final String hash;
    private final boolean success;
    private final String to;

    public TransferApiModel(String str, String str2, String str3, boolean z, String str4, String str5, long j10, long j11) {
        e.D(str, "amount");
        e.D(str2, "fee");
        e.D(str3, "from");
        e.D(str4, "to");
        e.D(str5, "hash");
        this.amount = str;
        this.fee = str2;
        this.from = str3;
        this.success = z;
        this.to = str4;
        this.hash = str5;
        this.blockTimestamp = j10;
        this.blockNumber = j11;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final long getBlockNumber() {
        return this.blockNumber;
    }

    public final long getBlockTimestamp() {
        return this.blockTimestamp;
    }

    public final String getFee() {
        return this.fee;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getHash() {
        return this.hash;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getTo() {
        return this.to;
    }
}
