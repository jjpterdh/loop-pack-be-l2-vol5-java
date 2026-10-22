package com.loopers.infrastructure.payment;

import com.loopers.domain.payment.PaymentDlqModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDlqJpaRepository extends JpaRepository<PaymentDlqModel, Long> {
}
