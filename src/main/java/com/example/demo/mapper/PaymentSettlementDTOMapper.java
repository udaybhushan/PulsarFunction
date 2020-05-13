package com.example.demo.mapper;

import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface PaymentSettlementDTOMapper {

	@Mappings({
			@Mapping(source = "settlement.settlementType", target = "settlementType", qualifiedByName = "toUpperCase"),
			@Mapping(source = "settlement.payinAmountInUSD", target = "payIn"),
			@Mapping(source = "settlement.payoutAmountInUSD", target = "payOut"),
			@Mapping(source = "settlement.settlementAmountInUSD", target = "settlement"),
			@Mapping(expression = "java(new BigDecimal(0))", target = "settlementEqlProvider"),
			@Mapping(expression = "java(new BigDecimal(0))", target = "serviceProvider"),
			@Mapping(source = "settlement.totalAmountInUSD", target = "totalPayIn"),
			@Mapping(source = "settlement.id", target = "id")})
	public PaymentSettlementDTO paymentSettlementMapperForUsdTo(RemittanceTransactionVO vo);

	@Named("toUpperCase")
	default SettlementType defaultSettlementType(String settlementType) {
		return Optional.ofNullable(SettlementType.valueOf(settlementType.toUpperCase())).orElse(SettlementType.USD_TO);
	}

}