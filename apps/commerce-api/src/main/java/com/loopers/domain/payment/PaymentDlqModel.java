package com.loopers.domain.payment;

import com.loopers.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment_dlq")
public class PaymentDlqModel extends BaseEntity {

    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Column(name = "reason", nullable = false, length = 255)
    private String reason;

    @Enumerated(EnumType.STRING)
    @Column(name = "attempt_status")
    private PaymentAttemptStatus attemptStatus;

    protected PaymentDlqModel() {
    }

    public PaymentDlqModel(Long orderId, String reason, PaymentAttemptStatus attemptStatus) {
        this.orderId = orderId;
        this.reason = reason;
        this.attemptStatus = attemptStatus;
    }

    public Long getOrderId() { return orderId; }
    public String getReason() { return reason; }
    public PaymentAttemptStatus getAttemptStatus() { return attemptStatus; }
}
