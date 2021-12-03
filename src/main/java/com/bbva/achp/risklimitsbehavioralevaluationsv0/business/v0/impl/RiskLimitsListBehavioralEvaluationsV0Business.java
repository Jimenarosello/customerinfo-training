package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.impl;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.IRiskLimitsListBehavioralEvaluationsV0Business;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsGet;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class RiskLimitsListBehavioralEvaluationsV0Business implements IRiskLimitsListBehavioralEvaluationsV0Business {

  private static final Log Log = LogFactory.getLog(RiskLimitsListBehavioralEvaluationsV0Business.class);

  @Override
  public List<BDtoOutListBehavioralEvaluationsGet> riskLimitsListBehavioralEvaluationsV0(final String customerid) {

    final List<BDtoOutListBehavioralEvaluationsGet> output = null;

    Log.debug(String.format("Output: %s", String.valueOf(output)));
    return output;
  }
}
