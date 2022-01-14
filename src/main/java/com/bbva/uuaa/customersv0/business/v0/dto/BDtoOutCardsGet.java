package com.bbva.uuaa.customersv0.business.v0.dto;

import java.util.Date;

public class BDtoOutCardsGet {

  private String type;

  private Long cardHolder;

  private String cardNumber;

  private Long purchaseLimit;

  private Date expirationDate;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Long getCardHolder() {
    return cardHolder;
  }

  public void setCardHolder(Long cardHolder) {
    this.cardHolder = cardHolder;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public Long getPurchaseLimit() {
    return purchaseLimit;
  }

  public void setPurchaseLimit(Long purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
  }

  public Date getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }
}
