package com.bbva.uuaa.customersv0.business.v0.dao.mapper;

import com.bbva.jee.arq.spring.core.host.IMapper;
import com.bbva.uuaa.customersv0.business.v0.dao.model.aaaat001_1.RequestTransactionAaaat001_1;

public class InputMapperAAAAT implements IMapper<String, RequestTransactionAaaat001_1> {

    @Override
    public RequestTransactionAaaat001_1 map(String customerId) {
        RequestTransactionAaaat001_1 request = new RequestTransactionAaaat001_1();
        request.setCustomerId(customerId);
        return request;
    }
}
