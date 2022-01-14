package com.bbva.uuaa.customersv0.business.v0.dao.impl;

import com.bbva.jee.arq.spring.core.host.ServicioTransacciones;
import com.bbva.uuaa.customersv0.business.v0.dao.IAaaatDao;
import com.bbva.uuaa.customersv0.business.v0.dao.model.aaaat001_1.RequestTransactionAaaat001_1;
import com.bbva.uuaa.customersv0.business.v0.dto.BDtoOutListCustomersGet;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

public class AaaatDao implements IAaaatDao {

    @Autowired
    private ServicioTransacciones servicioTransacciones;

    @Override
    public List<BDtoOutListCustomersGet> getCustomerInfo(String customerId) {
        List<BDtoOutListCustomersGet> response = servicioTransacciones.invoke(RequestTransactionAaaat001_1.class, customerId);

        if (response == null) {
            return Collections.emptyList();
        }

        return response;
    }
}
