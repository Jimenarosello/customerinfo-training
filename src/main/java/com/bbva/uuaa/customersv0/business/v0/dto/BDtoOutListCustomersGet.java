package com.bbva.uuaa.customersv0.business.v0.dto;

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

  private List<BDtoOutCardsGet> cards;

  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getExclusionReasonCode() {
    return exclusionReasonCode;
  }

  public void setExclusionReasonCode(String exclusionReasonCode) {
    this.exclusionReasonCode = exclusionReasonCode;
  }

  public Long getDni() {
    return dni;
  }

  public void setDni(Long dni) {
    this.dni = dni;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public List<BDtoOutCardsGet> getCards() {
    return cards;
  }

  public void setCards(List<BDtoOutCardsGet> cards) {
    this.cards = cards;
  }
}
