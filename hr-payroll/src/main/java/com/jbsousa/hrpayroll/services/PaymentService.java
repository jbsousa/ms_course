package com.jbsousa.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbsousa.hrpayroll.entities.Payment;
import com.jbsousa.hrpayroll.entities.Worker;
import com.jbsousa.hrpayroll.feignclients.WorkFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkFeignClient workFeignClient;
	
	public Payment getPayment(long workerId, int days) {

		Worker worker = workFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
	
}
