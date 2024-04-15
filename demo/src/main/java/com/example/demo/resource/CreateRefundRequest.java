package com.example.demo.resource;

import java.math.BigDecimal;

public class CreateRefundRequest {
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
