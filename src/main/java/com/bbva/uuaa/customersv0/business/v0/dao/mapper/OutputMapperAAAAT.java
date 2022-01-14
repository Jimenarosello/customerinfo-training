package com.bbva.uuaa.customersv0.business.v0.dao.mapper;

import com.bbva.jee.arq.spring.core.host.IMapper;
import com.bbva.uuaa.customersv0.business.v0.dao.model.aaaat001_1.ResponseTransactionAaaat001_1;
import com.bbva.uuaa.customersv0.business.v0.dto.BDtoOutCardsGet;
import com.bbva.uuaa.customersv0.business.v0.dto.BDtoOutListCustomersGet;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OutputMapperAAAAT implements IMapper<ResponseTransactionAaaat001_1, List<BDtoOutListCustomersGet>> {

    @Override
    public List<BDtoOutListCustomersGet> map(ResponseTransactionAaaat001_1 response) {
        BDtoOutListCustomersGet bDtoOutListCustomersGet = new BDtoOutListCustomersGet();

        bDtoOutListCustomersGet.setResponseCode(response.getCodigoRetorno());
        bDtoOutListCustomersGet.setResponseMessage(response.getCodigoAviso());

        bDtoOutListCustomersGet.setId(response.getCustomer().getId().toString());
        bDtoOutListCustomersGet.setExclusionReasonCode("");
        bDtoOutListCustomersGet.setDni(Long.valueOf(response.getCustomer().getDni()));
        bDtoOutListCustomersGet.setName(response.getCustomer().getName());
        bDtoOutListCustomersGet.setLastName(response.getCustomer().getLastname());
        bDtoOutListCustomersGet.setDateOfBirth(response.getCustomer().getDateOfBirth());
        bDtoOutListCustomersGet.setAccountNumber(response.getCustomer().getAccountNumber());
        bDtoOutListCustomersGet.setCards(response.getCustomer().getCards().stream().map(it -> {
            BDtoOutCardsGet card = new BDtoOutCardsGet();
            card.setCardHolder(it.getType().getCardHolder().longValue());
            card.setCardNumber(it.getType().getCardNumber());
            card.setExpirationDate(it.getType().getExpirationDate());
            card.setPurchaseLimit(it.getType().getPurchaseLimit().longValue());
            card.setType(it.getType().getType());
            return card;
        }).collect(Collectors.toList()));

        return Collections.singletonList(bDtoOutListCustomersGet);
    }
}
