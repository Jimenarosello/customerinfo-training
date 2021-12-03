package com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0.impl;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.IRiskLimitsListBehavioralEvaluationsV0Business;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto.BDtoOutListBehavioralEvaluationsGet;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0.ISrvRiskLimitsAPIBehavioralEvaluationsV0;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0.dto.DtoOutListBehavioralEvaluationsGet;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0.mapper.ListBehavioralEvaluationsGetMapper;
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
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SN(registryID = "SNAR20210087", logicalID = "risk-limits")
@VN(vnn = "v0")
@Path("/v0")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SrvRiskLimitsAPIBehavioralEvaluationsV0 implements ISrvRiskLimitsAPIBehavioralEvaluationsV0 {
  @Autowired private IRiskLimitsListBehavioralEvaluationsV0Business riskLimitsListBehavioralEvaluationsV0;

  @Override
  @GET
  @Path("/behavioral-evaluations")
  @SMC(registryID = "SMGG20211896", logicalID = "riskLimitsListBehavioralEvaluationsV0", forcedCatalog = "gabiCatalog")
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public ServiceResponse<List<DtoOutListBehavioralEvaluationsGet>> riskLimitsListBehavioralEvaluationsV0(@QueryParam("customerid") String customerid) {

    final List<BDtoOutListBehavioralEvaluationsGet> internalResponse = riskLimitsListBehavioralEvaluationsV0.riskLimitsListBehavioralEvaluationsV0(customerid);

    ListBehavioralEvaluationsGetMapper mapper = Mappers.getMapper(ListBehavioralEvaluationsGetMapper.class);
    List<DtoOutListBehavioralEvaluationsGet> response = mapper.bDtoOutListListBehavioralEvaluationsGetToDtoOutListListBehavioralEvaluationsGet(internalResponse);
    ServiceResponseBuilder<List<DtoOutListBehavioralEvaluationsGet>> builder = ServiceResponseOK.data(response);
    return builder.build();
  }
}
