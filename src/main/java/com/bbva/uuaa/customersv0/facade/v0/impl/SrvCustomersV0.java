package com.bbva.uuaa.customersv0.facade.v0.impl;

import com.bbva.uuaa.customersv0.business.v0.ICustomersV0Business;
import com.bbva.uuaa.customersv0.business.v0.dto.BDtoOutListCustomersGet;
import com.bbva.uuaa.customersv0.facade.v0.ICustomersV0;
import com.bbva.uuaa.customersv0.facade.v0.dto.DtoOutListCustomersGet;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse.ServiceResponseBuilder;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseOK;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.bbva.uuaa.customersv0.facade.v0.mapper.ListCustomersGetMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SN(registryID = "RRRRRRR", logicalID = "srvCustomersV0")
@VN(vnn = "v0")
@Path("/v0")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SrvCustomersV0 implements ICustomersV0 {
  @Autowired private ICustomersV0Business customersv0;

  @Override
  @GET
  @Path("/customers")
  @SMC(registryID = "rrrrr", logicalID = "customersV0", forcedCatalog = "gabiCatalog")
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public ServiceResponse<List<DtoOutListCustomersGet>> customersV0(@QueryParam("dni") String dni) {

    final List<BDtoOutListCustomersGet> internalResponse = customersv0.customersV0(dni);

    ListCustomersGetMapper mapper = Mappers.getMapper(ListCustomersGetMapper.class);
    List<DtoOutListCustomersGet> response = mapper.bDtoOutListListCustomersGetToDtoOutListListCustomersGet(internalResponse);
    ServiceResponseBuilder<List<DtoOutListCustomersGet>> builder = ServiceResponseOK.data(response);
    return builder.build();
  }
}
