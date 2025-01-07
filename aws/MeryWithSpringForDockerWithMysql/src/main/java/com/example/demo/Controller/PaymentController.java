package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Payment;
import com.example.demo.Repository.PaymentRepository;
@RestController
@RequestMapping("/payments")
public class PaymentController {
	@Autowired
	private PaymentRepository paymentRepository;
	@PostMapping()
	public Payment addNewPayment(@RequestBody Payment payment) {
		return paymentRepository.save(payment);
	}
	@GetMapping
	public List<Payment> allPayments(){
		return paymentRepository.findAll();
	}

}