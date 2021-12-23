package com.bbva.uuaa.customersv0.business.v0.impl;

import com.bbva.uuaa.customersv0.business.v0.ICustomersV0Business;
import com.bbva.uuaa.customersv0.business.v0.dto.BDtoOutListCustomersGet;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomersV0Business implements ICustomersV0Business {

  private static final Log Log = LogFactory.getLog(CustomersV0Business.class);

  @Override
  public List<BDtoOutListCustomersGet> customersV0(final String dni) {

    final List<BDtoOutListCustomersGet> output = null; // TODO

    Log.debug(String.format("Output: %s", String.valueOf(output)));
    return output;
  }
}
