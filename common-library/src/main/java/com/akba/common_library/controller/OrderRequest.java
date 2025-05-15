package com.akba.common_library.controller;

public class OrderRequest {
    private String orderId;
    private String symbol;
    private int quantity;
    private double price;
    private String side; // BUY or SELL
    private String traderId;

    // Getters and setters

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getSide() { return side; }
    public void setSide(String side) { this.side = side; }

    public String getTraderId() { return traderId; }
    public void setTraderId(String traderId) { this.traderId = traderId; }
}