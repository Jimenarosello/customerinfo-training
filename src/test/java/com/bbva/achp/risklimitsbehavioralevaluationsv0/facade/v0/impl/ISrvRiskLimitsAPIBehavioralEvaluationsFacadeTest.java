package com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0.impl;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.IRiskLimitsListBehavioralEvaluationsV0Business;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsGet;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsLastPayrollIncomeGet;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsRiskSegmentGet;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0.ISrvRiskLimitsAPIBehavioralEvaluationsV0;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0.dto.DtoOutListBehavioralEvaluationsGet;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ISrvRiskLimitsAPIBehavioralEvaluationsFacadeTest {

    @InjectMocks
    private ISrvRiskLimitsAPIBehavioralEvaluationsV0 facade = new SrvRiskLimitsAPIBehavioralEvaluationsV0();

    @Mock
    private IRiskLimitsListBehavioralEvaluationsV0Business business;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        BDtoOutListBehavioralEvaluationsGet okResponse = mock(BDtoOutListBehavioralEvaluationsGet.class);
        when(okResponse.getId()).thenReturn("OK");
        when(okResponse.getExclusionReasonCode()).thenReturn("exclusion reason code");
        when(okResponse.getRiskGroup()).thenReturn("risk group");
        when(okResponse.getLastSalaryAccreditation()).thenReturn(BigDecimal.valueOf(123));
        when(okResponse.getTotalMonthsPayroll()).thenReturn(BigDecimal.valueOf(12));
        when(okResponse.getPayrollCompanyCode()).thenReturn("company code");
        when(okResponse.getNumberTotalAccreditations()).thenReturn(BigDecimal.valueOf(12));

        BDtoOutListBehavioralEvaluationsLastPayrollIncomeGet lastPayrollIncomeGet = mock(BDtoOutListBehavioralEvaluationsLastPayrollIncomeGet.class);
        when(lastPayrollIncomeGet.getCurrency()).thenReturn("ars");
        when(lastPayrollIncomeGet.getAmount()).thenReturn(BigDecimal.valueOf(123));
        when(okResponse.getLastPayrollIncome()).thenReturn(lastPayrollIncomeGet);

        BDtoOutListBehavioralEvaluationsRiskSegmentGet riskSegmentGet = mock(BDtoOutListBehavioralEvaluationsRiskSegmentGet.class);
        when(riskSegmentGet.getId()).thenReturn("risk segment");
        when(okResponse.getRiskSegment()).thenReturn(riskSegmentGet);

        when(business.riskLimitsListBehavioralEvaluationsV0("OK")).thenReturn(Collections.singletonList(okResponse));
        when(business.riskLimitsListBehavioralEvaluationsV0("NOT_FOUND")).thenReturn(Collections.emptyList());
    }

    @Test
    public void givenExistentIDWhenGetCustomerInfoThenReturnData() {
        ServiceResponse<List<DtoOutListBehavioralEvaluationsGet>> response = facade.riskLimitsListBehavioralEvaluationsV0("OK");

        assertEquals("OK", response.getData().get(0).getId());
        assertEquals("exclusion reason code", response.getData().get(0).getExclusionReasonCode());
        assertEquals("risk group", response.getData().get(0).getRiskGroup());
        assertEquals(BigDecimal.valueOf(123), response.getData().get(0).getLastSalaryAccreditation());
        assertEquals(BigDecimal.valueOf(12), response.getData().get(0).getTotalMonthsPayroll());
        assertEquals("company code", response.getData().get(0).getPayrollCompanyCode());
        assertEquals(BigDecimal.valueOf(12), response.getData().get(0).getNumberTotalAccreditations());
        assertEquals("ars", response.getData().get(0).getLastPayrollIncome().getCurrency());
        assertEquals(BigDecimal.valueOf(123), response.getData().get(0).getLastPayrollIncome().getAmount());
        assertEquals("risk segment", response.getData().get(0).getRiskSegment().getId());

        assertEquals(HttpStatus.OK.value(), response.getHttpStatus(HttpMethod.GET));
    }

    @Test
    public void givenNonExistentIDWhenGetCustomerInfoThenReturnError() {
        ServiceResponse<List<DtoOutListBehavioralEvaluationsGet>> response = facade.riskLimitsListBehavioralEvaluationsV0("NOT_FOUND");

        assertNull(response);
    }

}
