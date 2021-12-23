package com.bbva.uuaa.customersv0.business.v0;

import com.bbva.uuaa.customersv0.business.v0.dto.BDtoOutListCustomersGet;

import java.util.List;

public interface ICustomersV0Business {
  List<BDtoOutListCustomersGet> customersV0(String customerid);
}
