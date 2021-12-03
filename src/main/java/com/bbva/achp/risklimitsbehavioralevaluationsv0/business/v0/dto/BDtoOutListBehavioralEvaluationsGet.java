package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dto;

import java.math.BigDecimal;

public class BDtoOutListBehavioralEvaluationsGet {

  private String id;

  private String exclusionReasonCode;

  private String riskGroup;

  private BigDecimal lastSalaryAccreditation;

  private BigDecimal totalMonthsPayroll;

  private String payrollCompanyCode;

  private BigDecimal numberTotalAccreditations;

  private BDtoOutListBehavioralEvaluationsLastPayrollIncomeGet lastPayrollIncome;

  private BDtoOutListBehavioralEvaluationsRiskSegmentGet riskSegment;

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

  public BDtoOutListBehavioralEvaluationsLastPayrollIncomeGet getLastPayrollIncome() {
    return this.lastPayrollIncome;
  }

  public void setLastPayrollIncome(BDtoOutListBehavioralEvaluationsLastPayrollIncomeGet lastPayrollIncome) {
    this.lastPayrollIncome = lastPayrollIncome;
  }

  public BDtoOutListBehavioralEvaluationsRiskSegmentGet getRiskSegment() {
    return this.riskSegment;
  }

  public void setRiskSegment(BDtoOutListBehavioralEvaluationsRiskSegmentGet riskSegment) {
    this.riskSegment = riskSegment;
  }

  public BigDecimal getRiskScore() {
    return this.riskScore;
  }

  public void setRiskScore(BigDecimal riskScore) {
    this.riskScore = riskScore;
  }
}
