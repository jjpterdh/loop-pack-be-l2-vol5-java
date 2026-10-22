package com.loopers.domain.payment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PaymentDlqService {

    private final PaymentDlqRepository paymentDlqRepository;

    @Transactional
    public PaymentDlqModel enqueue(Long orderId, String reason, PaymentAttemptStatus attemptStatus) {
        return paymentDlqRepository.save(new PaymentDlqModel(orderId, reason, attemptStatus));
    }

    @Transactional(readOnly = true)
    public List<PaymentDlqModel> findAll() {
        return paymentDlqRepository.findAll();
    }
}
