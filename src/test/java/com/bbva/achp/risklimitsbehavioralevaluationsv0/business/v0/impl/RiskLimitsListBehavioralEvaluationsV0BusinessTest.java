package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.impl;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.IAchptDao;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsGet;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsLastPayrollIncomeGet;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsRiskSegmentGet;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RiskLimitsListBehavioralEvaluationsV0BusinessTest {

    @InjectMocks
    private RiskLimitsListBehavioralEvaluationsV0Business bSrv;

    @Mock
    private IAchptDao iAchptDao;

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


        when(iAchptDao.getCustomerInfo("OK")).thenReturn(Collections.singletonList(okResponse));
        when(iAchptDao.getCustomerInfo("EMPTY")).thenReturn(Collections.emptyList());
    }

    @Test
    public void givenExistentIDWhenGetCustomerInfoThenReturnData() {
        List<BDtoOutListBehavioralEvaluationsGet> response =  bSrv.riskLimitsListBehavioralEvaluationsV0("OK");

        assertEquals("OK", response.get(0).getId());
        assertEquals("exclusion reason code", response.get(0).getExclusionReasonCode());
        assertEquals("risk group", response.get(0).getRiskGroup());
        assertEquals(BigDecimal.valueOf(123), response.get(0).getLastSalaryAccreditation());
        assertEquals(BigDecimal.valueOf(12), response.get(0).getTotalMonthsPayroll());
        assertEquals("company code", response.get(0).getPayrollCompanyCode());
        assertEquals(BigDecimal.valueOf(12), response.get(0).getNumberTotalAccreditations());
        assertEquals("ars", response.get(0).getLastPayrollIncome().getCurrency());
        assertEquals(BigDecimal.valueOf(123), response.get(0).getLastPayrollIncome().getAmount());
        assertEquals("risk segment", response.get(0).getRiskSegment().getId());
    }

    @Test
    public void givenNonExistentIDWhenGetCustomerInfoThenReturnEmpty() {
        assertTrue(bSrv.riskLimitsListBehavioralEvaluationsV0("EMPTY").isEmpty());
    }
}
