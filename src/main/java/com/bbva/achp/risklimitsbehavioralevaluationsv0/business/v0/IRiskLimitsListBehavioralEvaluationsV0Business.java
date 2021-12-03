package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsGet;
import java.util.List;

public interface IRiskLimitsListBehavioralEvaluationsV0Business {
  List<BDtoOutListBehavioralEvaluationsGet> riskLimitsListBehavioralEvaluationsV0(String customerid);
}
