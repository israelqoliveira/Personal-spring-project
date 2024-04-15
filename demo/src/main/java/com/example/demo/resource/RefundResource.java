package com.example.demo.resource;

import com.example.demo.entity.Refund;
import com.example.demo.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Ref;
import java.util.List;

// Classe controladora - get and post
@RestController
@RequestMapping(path = "refund")
public class RefundResource {
    private final RefundService refundService;

    public RefundResource(RefundService refundService) {
        this.refundService = refundService;
    }

    @PostMapping
    public void createRefund(@RequestBody CreateRefundRequest request) {
        refundService.createRefund(request.getAmount());
    }

    @GetMapping
    public List<Refund> refund() {
        return refundService.getAll();
    }
}
