package com.npci.api.models;

public record ReqPay(Head head, Meta meta, Txn txn, Payer payer) {}
