package com.bbva.uuaa.customersv0.facade.v0.mapper;

import com.bbva.uuaa.customersv0.business.v0.dto.BDtoOutListCustomersGet;
import com.bbva.uuaa.customersv0.facade.v0.dto.DtoOutListCustomersGet;
import java.util.List;

import org.mapstruct.Mapper;

@Mapper
public interface ListCustomersGetMapper {

  BDtoOutListCustomersGet dtoOutListCustomersGetToBDtoOutListCustomersGet(DtoOutListCustomersGet dtoOutListCustomersGet);

  DtoOutListCustomersGet bDtoOutListCustomersGetToDtoOutListCustomersGet(BDtoOutListCustomersGet bDtoOutListCustomersGet);

  List<BDtoOutListCustomersGet> dtoOutListListCustomersGetToBDtoOutListListCustomersGet(List<DtoOutListCustomersGet> dtoOutListListCustomersGet);

  List<DtoOutListCustomersGet> bDtoOutListListCustomersGetToDtoOutListListCustomersGet(List<BDtoOutListCustomersGet> bDtoOutListListCustomersGet);
}
