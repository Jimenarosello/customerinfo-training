package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto;

import java.math.BigDecimal;

public class BDtoOutListBehavioralEvaluationsLastPayrollIncomeGet {

  private BigDecimal amount;

  private String currency;

  public BigDecimal getAmount() {
    return this.amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }
}
