package com.example.demo.mapper;

import java.math.BigDecimal;


public class PaymentSettlementDTO {

	private SettlementType settlementType;
	private String id;
	private BigDecimal payIn;

	private BigDecimal payOut;

	private BigDecimal settlement;

	private BigDecimal settlementEqlProvider;

	private BigDecimal serviceProvider;

	private BigDecimal totalPayIn;

	public SettlementType getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(SettlementType settlementType) {
		this.settlementType = settlementType;
	}

	public BigDecimal getPayIn() {
		return payIn;
	}

	public void setPayIn(BigDecimal payIn) {
		this.payIn = payIn;
	}

	public BigDecimal getPayOut() {
		return payOut;
	}

	public void setPayOut(BigDecimal payOut) {
		this.payOut = payOut;
	}

	public BigDecimal getSettlement() {
		return settlement;
	}

	public void setSettlement(BigDecimal settlement) {
		this.settlement = settlement;
	}

	public BigDecimal getSettlementEqlProvider() {
		return settlementEqlProvider;
	}

	public void setSettlementEqlProvider(BigDecimal settlementEqlProvider) {
		this.settlementEqlProvider = settlementEqlProvider;
	}

	public BigDecimal getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(BigDecimal serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public BigDecimal getTotalPayIn() {
		return totalPayIn;
	}

	public void setTotalPayIn(BigDecimal totalPayIn) {
		this.totalPayIn = totalPayIn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PaymentSettlementDTO [settlementType=" + settlementType + ", id=" + id + ", payIn=" + payIn
				+ ", payOut=" + payOut + ", settlement=" + settlement + ", settlementEqlProvider="
				+ settlementEqlProvider + ", serviceProvider=" + serviceProvider + ", totalPayIn=" + totalPayIn + "]";
	}

	
}
