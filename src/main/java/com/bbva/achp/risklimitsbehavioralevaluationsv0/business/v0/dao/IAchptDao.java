package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsGet;

import java.util.List;

public interface IAchptDao {

    List<BDtoOutListBehavioralEvaluationsGet> getCustomerInfo(String customerId);
}
