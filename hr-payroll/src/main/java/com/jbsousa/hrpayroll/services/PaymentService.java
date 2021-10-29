package com.jbsousa.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.jbsousa.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workId, int days) {
		return new Payment("Bob", 200.0, days);
	}
	
}
