package com.bbva.uuaa.customersv0.facade.v0;

import com.bbva.uuaa.customersv0.facade.v0.dto.DtoOutListCustomersGet;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;

import java.util.List;

public interface ICustomersV0 {

  ServiceResponse<List<DtoOutListCustomersGet>> customersV0(String customerid);
}
