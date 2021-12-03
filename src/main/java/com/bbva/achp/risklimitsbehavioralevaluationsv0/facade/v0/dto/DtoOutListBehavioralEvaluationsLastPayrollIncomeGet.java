package com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "dtoOutListBehavioralEvaluationsLastPayrollIncomeGet", namespace = "com:bbva:achp:risklimitsbehavioralevaluationsv0:facade:v0:dto")
@XmlType(name = "dtoOutListBehavioralEvaluationsLastPayrollIncomeGet", namespace = "com:bbva:achp:risklimitsbehavioralevaluationsv0:facade:v0:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DtoOutListBehavioralEvaluationsLastPayrollIncomeGet implements Serializable {

  public static final long serialVersionUID = 3277088120204000000L;

  @NotNull
  @JsonProperty("amount")
  private BigDecimal amount;

  @NotNull
  @JsonProperty("currency")
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
