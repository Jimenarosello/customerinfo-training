package com.bbva.achp.risklimitsbehavioralevaluationsv0.facade.v0.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.*;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "dtoOutListBehavioralEvaluationsGet", namespace = "com:bbva:achp:risklimitsbehavioralevaluationsv0:facade:v0:dto")
@XmlType(name = "dtoOutListBehavioralEvaluationsGet", namespace = "com:bbva:achp:risklimitsbehavioralevaluationsv0:facade:v0:dto")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DtoOutListBehavioralEvaluationsGet implements Serializable {

  public static final long serialVersionUID = 3277088120272000000L;

  @NotNull
  @JsonProperty("id")
  private String id;

  @NotNull
  @JsonProperty("exclusionReasonCode")
  private String exclusionReasonCode;

  @NotNull
  @JsonProperty("riskGroup")
  private String riskGroup;

  @NotNull
  @JsonProperty("lastSalaryAccreditation")
  private BigDecimal lastSalaryAccreditation;

  @NotNull
  @JsonProperty("totalMonthsPayroll")
  private BigDecimal totalMonthsPayroll;

  @NotNull
  @JsonProperty("payrollCompanyCode")
  private String payrollCompanyCode;

  @NotNull
  @JsonProperty("numberTotalAccreditations")
  private BigDecimal numberTotalAccreditations;

  @Valid
  @NotNull
  @JsonProperty("lastPayrollIncome")
  private DtoOutListBehavioralEvaluationsLastPayrollIncomeGet lastPayrollIncome;

  @Valid
  @NotNull
  @JsonProperty("riskSegment")
  private DtoOutListBehavioralEvaluationsRiskSegmentGet riskSegment;

  @NotNull
  @JsonProperty("riskScore")
  private BigDecimal riskScore;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getExclusionReasonCode() {
    return this.exclusionReasonCode;
  }

  public void setExclusionReasonCode(String exclusionReasonCode) {
    this.exclusionReasonCode = exclusionReasonCode;
  }

  public String getRiskGroup() {
    return this.riskGroup;
  }

  public void setRiskGroup(String riskGroup) {
    this.riskGroup = riskGroup;
  }

  public BigDecimal getLastSalaryAccreditation() {
    return this.lastSalaryAccreditation;
  }

  public void setLastSalaryAccreditation(BigDecimal lastSalaryAccreditation) {
    this.lastSalaryAccreditation = lastSalaryAccreditation;
  }

  public BigDecimal getTotalMonthsPayroll() {
    return this.totalMonthsPayroll;
  }

  public void setTotalMonthsPayroll(BigDecimal totalMonthsPayroll) {
    this.totalMonthsPayroll = totalMonthsPayroll;
  }

  public String getPayrollCompanyCode() {
    return this.payrollCompanyCode;
  }

  public void setPayrollCompanyCode(String payrollCompanyCode) {
    this.payrollCompanyCode = payrollCompanyCode;
  }

  public BigDecimal getNumberTotalAccreditations() {
    return this.numberTotalAccreditations;
  }

  public void setNumberTotalAccreditations(BigDecimal numberTotalAccreditations) {
    this.numberTotalAccreditations = numberTotalAccreditations;
  }

  public DtoOutListBehavioralEvaluationsLastPayrollIncomeGet getLastPayrollIncome() {
    return this.lastPayrollIncome;
  }

  public void setLastPayrollIncome(DtoOutListBehavioralEvaluationsLastPayrollIncomeGet lastPayrollIncome) {
    this.lastPayrollIncome = lastPayrollIncome;
  }

  public DtoOutListBehavioralEvaluationsRiskSegmentGet getRiskSegment() {
    return this.riskSegment;
  }

  public void setRiskSegment(DtoOutListBehavioralEvaluationsRiskSegmentGet riskSegment) {
    this.riskSegment = riskSegment;
  }

  public BigDecimal getRiskScore() {
    return this.riskScore;
  }

  public void setRiskScore(BigDecimal riskScore) {
    this.riskScore = riskScore;
  }
}
