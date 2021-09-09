package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	double sum;
	
	public SaleSumDTO() {
		
	}

	public SaleSumDTO(Seller seller, Double sum) {
		sellerName = seller.getName();
		this.sum = sum;
		
	}


	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	
	

}
