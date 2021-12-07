package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.impl;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.IAchptDao;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1.RequestTransactionAchpt001_1;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsGet;
import com.bbva.jee.arq.spring.core.host.ServicioTransacciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AchptDao implements IAchptDao {

    @Autowired
    private ServicioTransacciones servicioTransacciones;

    @Override
    public List<BDtoOutListBehavioralEvaluationsGet> getCustomerInfo(String customerId) {
        return servicioTransacciones.invoke(RequestTransactionAchpt001_1.class, customerId);
    }
}