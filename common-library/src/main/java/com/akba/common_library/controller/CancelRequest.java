package com.akba.common_library.controller;

public class CancelRequest {
    private String orderId;
    private String reason;
    private String traderId;

    // Getters and setters

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public String getTraderId() { return traderId; }
    public void setTraderId(String traderId) { this.traderId = traderId; }
}