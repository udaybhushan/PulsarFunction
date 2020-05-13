package com.example.demo.mapper;

import java.math.BigDecimal;

public class Settlement {
	private String settlementType;
	private String id ;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private BigDecimal payinAmountInUSD;
	private BigDecimal payoutAmountInUSD;
	private BigDecimal settlementAmountInUSD;
	private BigDecimal totalAmountInUSD;

	public String getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	public BigDecimal getPayinAmountInUSD() {
		return payinAmountInUSD;
	}

	public void setPayinAmountInUSD(BigDecimal payinAmountInUSD) {
		this.payinAmountInUSD = payinAmountInUSD;
	}

	public BigDecimal getPayoutAmountInUSD() {
		return payoutAmountInUSD;
	}

	public void setPayoutAmountInUSD(BigDecimal payoutAmountInUSD) {
		this.payoutAmountInUSD = payoutAmountInUSD;
	}

	public BigDecimal getSettlementAmountInUSD() {
		return settlementAmountInUSD;
	}

	public void setSettlementAmountInUSD(BigDecimal settlementAmountInUSD) {
		this.settlementAmountInUSD = settlementAmountInUSD;
	}

	public BigDecimal getTotalAmountInUSD() {
		return totalAmountInUSD;
	}

	public void setTotalAmountInUSD(BigDecimal totalAmountInUSD) {
		this.totalAmountInUSD = totalAmountInUSD;
	}

}
