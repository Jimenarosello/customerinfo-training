package com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0.dto.DtoOutListBehavioralEvaluationsGet;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import java.util.List;

public interface ISrvRiskLimitsAPIBehavioralEvaluationsV0 {

  ServiceResponse<List<DtoOutListBehavioralEvaluationsGet>> riskLimitsListBehavioralEvaluationsV0(String customerid);
}
