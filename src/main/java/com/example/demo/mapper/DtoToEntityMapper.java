package com.example.demo.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DtoToEntityMapper {

	public PaymentSettlement maptoEntity(PaymentSettlementDTO paymentDTO);
}
