package com.example.demo.mapper;

public enum SettlementType {
	USD_TO("CS"), SETTLEMENT_TO("settlement"), SERVICE_PROVIDER_TO("serviceProvider"), SETLMT_EQUAL_PCCY_TO("stmlEqul");
	private String a;
	private SettlementType(String a) {
		this.a = a;
	}
	
	
	public String getA() {
		return a;
	}

	public static final String TYPE_USD_TO = "USD_TO";
	public static final String TYPE_SETTLEMENT_TO = "SETTLEMENT_TO";
	public static final String TYPE_SERVICE_PROVIDER_TO = "SERVICE_PROVIDER_TO";
	public static final String TYPE_SETLMT_EQUAL_PCCY_TO = "SETLMT_EQUAL_PCCY_TO";
}
