package com.example.demo.service;

import com.example.demo.entity.Refund;
import com.example.demo.repository.RefundRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RefundService {
    private final RefundRepository refundRepository;

    public RefundService(RefundRepository refundRepository) {
        this.refundRepository = refundRepository;
    }

    @Transactional
    public void createRefund(BigDecimal amount){
        var refund = new Refund();

        refund.setAmount(amount);
        refund.setStatus("created");

        refundRepository.save(refund);
    }

    @Transactional(readOnly = true)
    public List<Refund> getAll(){
        return refundRepository.findAll();
    }
}
