package com.akba.common_library.controller;

public class ExecutionReport {
    private String orderId;
    private String status; // e.g. NEW, PARTIALLY_FILLED, FILLED, REJECTED
    private int filledQuantity;
    private double executionPrice;
    private String executionId;
    private long timestamp;

    // Getters and setters

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getFilledQuantity() { return filledQuantity; }
    public void setFilledQuantity(int filledQuantity) { this.filledQuantity = filledQuantity; }

    public double getExecutionPrice() { return executionPrice; }
    public void setExecutionPrice(double executionPrice) { this.executionPrice = executionPrice; }

    public String getExecutionId() { return executionId; }
    public void setExecutionId(String executionId) { this.executionId = executionId; }

    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}