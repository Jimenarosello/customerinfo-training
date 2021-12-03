package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.mapper;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1.RequestTransactionAchpt001_1;
import com.bbva.jee.arq.spring.core.host.IMapper;

public class InputMapperACHPT implements IMapper<String, RequestTransactionAchpt001_1> {

    @Override
    public RequestTransactionAchpt001_1 map(String customerId) {
        RequestTransactionAchpt001_1 request = new RequestTransactionAchpt001_1();
        request.setCustomerId(customerId);
        return request;
    }
}
