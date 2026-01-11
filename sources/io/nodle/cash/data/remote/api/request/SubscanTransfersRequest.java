package io.nodle.cash.data.remote.api.request;

public final class SubscanTransfersRequest {
    private final String address;
    private final int page;
    private final int row;

    public SubscanTransfersRequest(int i, int i10, String str) {
        this.row = i;
        this.page = i10;
        this.address = str;
    }
}
