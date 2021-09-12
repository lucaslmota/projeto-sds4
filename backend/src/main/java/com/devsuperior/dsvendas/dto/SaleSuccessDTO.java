package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Long visitede;
	private Long deals;
	
	public SaleSuccessDTO() {}
	
	public SaleSuccessDTO(Seller seller, Long visitede, Long deals) {
		this.sellerName = seller.getName();
		this.visitede = visitede;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisitede() {
		return visitede;
	}

	public void setVisitede(Long visitede) {
		this.visitede = visitede;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
