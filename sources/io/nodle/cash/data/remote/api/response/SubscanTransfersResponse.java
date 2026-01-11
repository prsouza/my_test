package io.nodle.cash.data.remote.api.response;

import java.util.List;

public final class SubscanTransfersResponse {
    private final int code;
    private final Data data;

    public static final class Data {
        private final long count;
        private final List<TransferApiModel> transfers;

        public Data(long j10, List<TransferApiModel> list) {
            this.count = j10;
            this.transfers = list;
        }

        public final long getCount() {
            return this.count;
        }

        public final List<TransferApiModel> getTransfers() {
            return this.transfers;
        }
    }

    public SubscanTransfersResponse(int i, Data data2) {
        this.code = i;
        this.data = data2;
    }

    public final int getCode() {
        return this.code;
    }

    public final Data getData() {
        return this.data;
    }
}
