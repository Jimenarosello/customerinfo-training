package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.mapper;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1.ResponseTransactionAchpt001_1;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsGet;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsLastPayrollIncomeGet;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsRiskSegmentGet;
import com.bbva.jee.arq.spring.core.host.IMapper;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class OutputMapperACHPT implements IMapper<ResponseTransactionAchpt001_1, List<BDtoOutListBehavioralEvaluationsGet>> {

    @Override
    public List<BDtoOutListBehavioralEvaluationsGet> map(ResponseTransactionAchpt001_1 response) {
        BDtoOutListBehavioralEvaluationsGet bDtoOutListBehavioralEvaluationsGet = new BDtoOutListBehavioralEvaluationsGet();

        bDtoOutListBehavioralEvaluationsGet.setId(response.getId());
        bDtoOutListBehavioralEvaluationsGet.setExclusionReasonCode(String.valueOf(response.getExclusionReasonCode()));
        bDtoOutListBehavioralEvaluationsGet.setRiskGroup(response.getRiskGroup());

        bDtoOutListBehavioralEvaluationsGet.setTotalMonthsPayroll(new BigDecimal(response.getTotalMonthsPayroll()));
        bDtoOutListBehavioralEvaluationsGet.setPayrollCompanyCode(response.getPayrollCompanyCode());
        bDtoOutListBehavioralEvaluationsGet.setNumberTotalAccreditations(new BigDecimal(response.getNumberTotalAccreditations()));
        bDtoOutListBehavioralEvaluationsGet.setRiskScore(response.getRiskScore());

        BDtoOutListBehavioralEvaluationsLastPayrollIncomeGet lastPayrollIncomeGet = new BDtoOutListBehavioralEvaluationsLastPayrollIncomeGet();
        lastPayrollIncomeGet.setAmount(response.getLastPayrollIncome().getAmount());
        lastPayrollIncomeGet.setCurrency(response.getLastPayrollIncome().getCurrency());
        bDtoOutListBehavioralEvaluationsGet.setLastPayrollIncome(lastPayrollIncomeGet);

        bDtoOutListBehavioralEvaluationsGet.setLastSalaryAccreditation(BigDecimal.valueOf(response.getLastAccreditationDate()));

        BDtoOutListBehavioralEvaluationsRiskSegmentGet riskSegmentGet = new BDtoOutListBehavioralEvaluationsRiskSegmentGet();
        riskSegmentGet.setId(response.getRiskSegment().getId());
        bDtoOutListBehavioralEvaluationsGet.setRiskSegment(riskSegmentGet);

        return Collections.singletonList(bDtoOutListBehavioralEvaluationsGet);
    }
}
