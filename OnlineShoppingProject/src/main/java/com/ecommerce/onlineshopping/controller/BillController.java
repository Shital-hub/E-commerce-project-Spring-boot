package com.ecommerce.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.model.Bill;
import com.ecommerce.onlineshopping.service.BillService;

@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private BillService billService;
	
	@PostMapping("/add")
	public ResponseEntity<Bill> addBill(@RequestBody Bill bill) {
		
		Bill bl = billService.addBillDetails(bill);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(bl);
		
	}
		
	@GetMapping("/get/{id}")
	public ResponseEntity<Bill> getBill(@PathVariable Integer id){
		
		Bill bill = billService.getBillDetail(id);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(bill);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Bill> updateBill(@RequestBody Bill bill ,@PathVariable Integer id){
		
		Bill updateBill = billService.updateBillDetail(bill, id);
		return ResponseEntity.status(HttpStatus.OK).body(updateBill);
		
		
	}
	
	

}
