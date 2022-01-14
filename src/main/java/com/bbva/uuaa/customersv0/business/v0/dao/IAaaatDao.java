package com.bbva.uuaa.customersv0.business.v0.dao;

import com.bbva.uuaa.customersv0.business.v0.dto.BDtoOutListCustomersGet;

import java.util.List;

public interface IAaaatDao {

    List<BDtoOutListCustomersGet> getCustomerInfo(String customerId);
}
