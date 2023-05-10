package com.ecommerce.onlineshopping.service;

import com.ecommerce.onlineshopping.model.Bill;

public interface BillService {
	
	//Add bill details
	
	public Bill addBillDetails(Bill bill);

	
	//Get Bill Details
	
	public Bill getBillDetail(Integer id);
	
	//Update Bill Details
	
	public Bill updateBillDetail(Bill bill,Integer id);
}
