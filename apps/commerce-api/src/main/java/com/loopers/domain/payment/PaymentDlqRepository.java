package com.loopers.domain.payment;

import java.util.List;

public interface PaymentDlqRepository {
    PaymentDlqModel save(PaymentDlqModel dlq);

    List<PaymentDlqModel> findAll();
}
