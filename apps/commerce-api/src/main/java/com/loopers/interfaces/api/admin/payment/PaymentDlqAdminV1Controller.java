package com.loopers.interfaces.api.admin.payment;

import com.loopers.domain.payment.PaymentDlqModel;
import com.loopers.domain.payment.PaymentDlqService;
import com.loopers.interfaces.api.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api-admin/v1/payment-dlq")
public class PaymentDlqAdminV1Controller {

    private final PaymentDlqService paymentDlqService;

    @GetMapping
    public ApiResponse<List<PaymentDlqAdminV1Dto.DlqEntry>> getDlqEntries() {
        List<PaymentDlqModel> entries = paymentDlqService.findAll();
        List<PaymentDlqAdminV1Dto.DlqEntry> result = entries.stream()
            .map(PaymentDlqAdminV1Dto.DlqEntry::from)
            .toList();
        return ApiResponse.success(result);
    }
}
