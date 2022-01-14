package com.bbva.uuaa.customersv0.business.v0.impl;

import com.bbva.uuaa.customersv0.business.v0.ICustomersV0Business;
import com.bbva.uuaa.customersv0.business.v0.dao.IAaaatDao;
import com.bbva.uuaa.customersv0.business.v0.dto.BDtoOutListCustomersGet;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomersV0Business implements ICustomersV0Business {

  private static final Log Log = LogFactory.getLog(CustomersV0Business.class);

  @Autowired
  private IAaaatDao aaaatDao;

  @Override
  public List<BDtoOutListCustomersGet> customersV0(final String dni) {

    final List<BDtoOutListCustomersGet> output = aaaatDao.getCustomerInfo(dni);

    Log.debug(String.format("Output: %s", String.valueOf(output)));
    return output;
  }
}
