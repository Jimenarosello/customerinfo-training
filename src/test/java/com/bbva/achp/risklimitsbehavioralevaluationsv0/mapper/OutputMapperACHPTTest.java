package com.bbva.achp.risklimitsbehavioralevaluationsv0.mapper;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.mapper.OutputMapperACHPT;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1.Lastpayrollincome;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1.ResponseTransactionAchpt001_1;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1.Risksegment;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsGet;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OutputMapperACHPTTest {

    private final OutputMapperACHPT outputMapperACHPT = new OutputMapperACHPT();

    @Test
    public void whenInputIsOKThenReturnCorrectRequestClass() {
        List<BDtoOutListBehavioralEvaluationsGet> response = outputMapperACHPT.map(getAsoResponse());

        Assert.assertNotNull(response);
        Assert.assertFalse(response.isEmpty());

        BDtoOutListBehavioralEvaluationsGet businessResponse = response.get(0);

        assertEquals("Id", businessResponse.getId());
        assertEquals("1", businessResponse.getExclusionReasonCode());
        assertEquals("risk group", businessResponse.getRiskGroup());
        assertEquals(BigDecimal.valueOf(1), businessResponse.getLastSalaryAccreditation());
        assertEquals(BigDecimal.valueOf(1), businessResponse.getTotalMonthsPayroll());
        assertEquals("PayrollCompanyCode", businessResponse.getPayrollCompanyCode());
        assertEquals(BigDecimal.valueOf(12), businessResponse.getNumberTotalAccreditations());
        assertEquals(BigDecimal.valueOf(10), businessResponse.getLastPayrollIncome().getAmount());
        assertEquals("ARS", businessResponse.getLastPayrollIncome().getCurrency());
        assertEquals("id", businessResponse.getRiskSegment().getId());
    }

    private ResponseTransactionAchpt001_1 getAsoResponse() {
        ResponseTransactionAchpt001_1 response = new ResponseTransactionAchpt001_1();

        response.setCodigoAviso("CodigoAviso");
        response.setDescripcionAviso("DescripcionAviso");
        response.setAplicacionAviso("AplicacionAviso");
        response.setCodigoRetorno("CodigoRetorno");
        response.setId("Id");
        response.setExclusionReasonCode(1);
        response.setRiskGroup("risk group");
        response.setLastAccreditationDate(1);
        response.setTotalMonthsPayroll(1);
        response.setPayrollCompanyCode("PayrollCompanyCode");
        response.setNumberTotalAccreditations(12);
        response.setRiskScore(BigDecimal.ONE);

        Risksegment risksegment = new Risksegment();
        risksegment.setId("id");
        response.setRiskSegment(risksegment);

        Lastpayrollincome lastpayrollincome = new Lastpayrollincome();
        lastpayrollincome.setAmount(BigDecimal.TEN);
        lastpayrollincome.setCurrency("ARS");
        response.setLastPayrollIncome(lastpayrollincome);

        return response;
    }

}
