package com.loopers.infrastructure.payment;

import com.loopers.domain.payment.PaymentDlqModel;
import com.loopers.domain.payment.PaymentDlqRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PaymentDlqRepositoryImpl implements PaymentDlqRepository {

    private final PaymentDlqJpaRepository jpaRepository;

    @Override
    public PaymentDlqModel save(PaymentDlqModel dlq) {
        return jpaRepository.save(dlq);
    }

    @Override
    public List<PaymentDlqModel> findAll() {
        return jpaRepository.findAll();
    }
}
