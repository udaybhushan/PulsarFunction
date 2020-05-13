package com.example.demo;

import java.math.BigDecimal;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.mapper.DtoToEntityMapper;
import com.example.demo.mapper.PaymentSettlement;
import com.example.demo.mapper.PaymentSettlementDTO;
import com.example.demo.mapper.PaymentSettlementDTOMapper;
import com.example.demo.mapper.RemittanceTransactionVO;
import com.example.demo.mapper.Settlement;
import com.example.demo.mapper.SettlementType;

@SpringBootApplication
public class PulsarFunctionApplication {

	public static void main(String[] args) {

		// SpringApplication.run(PulsarFunctionApplication.class, args);

		RemittanceTransactionVO remittanceTransactionVO = new RemittanceTransactionVO();
		Settlement settlement = new Settlement();
		settlement.setSettlementType("setlmt_equal_pccy_to");
		settlement.setId("456");
		settlement.setPayinAmountInUSD(new BigDecimal(123));
		settlement.setPayoutAmountInUSD(new BigDecimal(123));
		settlement.setSettlementAmountInUSD(new BigDecimal(123));
		settlement.setTotalAmountInUSD(null);
		settlement.setSettlementAmountInUSD(new BigDecimal(123));
		remittanceTransactionVO.setSettlement(settlement);

		PaymentSettlementDTOMapper mapper1 = Mappers.getMapper(PaymentSettlementDTOMapper.class);
		DtoToEntityMapper mapper = Mappers.getMapper(DtoToEntityMapper.class);
		PaymentSettlementDTO paymentSettlementMapperForUsdTo = mapper1
				.paymentSettlementMapperForUsdTo(remittanceTransactionVO);
		System.out.println(paymentSettlementMapperForUsdTo.toString());
		PaymentSettlement maptoEntity = new PaymentSettlement();
		BeanUtils.copyProperties(paymentSettlementMapperForUsdTo, maptoEntity,"id");
		System.out.println(maptoEntity.toString());

		System.out.println(SettlementType.USD_TO.getA());
		/*
		 * String a = "abcdef"; System.out.println(a.toUpperCase());
		 */
	}
}
