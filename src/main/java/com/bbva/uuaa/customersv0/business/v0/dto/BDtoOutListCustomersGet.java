package com.bbva.uuaa.customersv0.business.v0.dto;

import com.bbva.uuaa.customersv0.facade.v0.dto.DtoOutListCardsGet;
import java.util.Date;
import java.util.List;

public class BDtoOutListCustomersGet {

  private String responseCode;

  private String responseMessage;

  private String id;

  private String exclusionReasonCode;

  private Long dni;

  private String name;

  private String lastName;

  private Date dateOfBirth;

  private String accountNumber;

  private List<DtoOutListCardsGet> cards;

}
