package gov.cms.fqhc_pricer;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class Line implements Serializable {

	static final long serialVersionUID = 1L;

	private Integer line;
	private String hcpc;
	private String description;
	private String modifier;
	private Date serviceDate;
	private String revenueCode;
	private Integer totalUnits;
	private Integer coveredUnits;
	private Double coveredCharges;
	private String paymentIndicator;
	private String packagingFlag;
	private String paymentMethodFlag;
	private String lineItemActionFlag;
	private String compositeAdjFlag;
	private Double linePayment;
	private Double lineMedicareReimbursement;
	private Double lineCoinsurance;
	private Double lineAddonPayment;
	private String lineReturnCode;

	private int serviceYear;

	public Line() {
	}

	public String getHcpc() {
		return this.hcpc;
	}

	public void setHcpc(String hcpc) {
		this.hcpc = hcpc;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getRevenueCode() {
		return this.revenueCode;
	}

	public void setRevenueCode(String revenueCode) {
		this.revenueCode = revenueCode;
	}

	public Integer getTotalUnits() {
		return this.totalUnits;
	}

	public void setTotalUnits(Integer totalUnits) {
		this.totalUnits = totalUnits;
	}

	public Integer getCoveredUnits() {
		return this.coveredUnits;
	}

	public void setCoveredUnits(Integer coveredUnits) {
		this.coveredUnits = coveredUnits;
	}

	public Double getCoveredCharges() {
		return this.coveredCharges;
	}

	public void setCoveredCharges(Double coveredCharges) {
		this.coveredCharges = coveredCharges;
	}

	public String getPaymentIndicator() {
		return this.paymentIndicator;
	}

	public void setPaymentIndicator(String paymentIndicator) {
		this.paymentIndicator = paymentIndicator;
	}

	public String getPackagingFlag() {
		return this.packagingFlag;
	}

	public void setPackagingFlag(String packagingFlag) {
		this.packagingFlag = packagingFlag;
	}

	public String getPaymentMethodFlag() {
		return this.paymentMethodFlag;
	}

	public void setPaymentMethodFlag(String paymentMethodFlag) {
		this.paymentMethodFlag = paymentMethodFlag;
	}

	public String getLineItemActionFlag() {
		return this.lineItemActionFlag;
	}

	public void setLineItemActionFlag(String lineItemActionFlag) {
		this.lineItemActionFlag = lineItemActionFlag;
	}

	public String getCompositeAdjFlag() {
		return this.compositeAdjFlag;
	}

	public void setCompositeAdjFlag(String compositeAdjFlag) {
		this.compositeAdjFlag = compositeAdjFlag;
	}

	public Double getLinePayment() {
		return this.linePayment;
	}

	public void setLinePayment(Double linePayment) {
		this.linePayment = linePayment;
	}

	public Double getLineMedicareReimbursement() {
		return this.lineMedicareReimbursement;
	}

	public void setLineMedicareReimbursement(
			Double lineMedicareReimbursement) {
		this.lineMedicareReimbursement = lineMedicareReimbursement;
	}

	public Double getLineCoinsurance() {
		return this.lineCoinsurance;
	}

	public void setLineCoinsurance(Double lineCoinsurance) {
		this.lineCoinsurance = lineCoinsurance;
	}

	public Double getLineAddonPayment() {
		return this.lineAddonPayment;
	}

	public void setLineAddonPayment(Double lineAddonPayment) {
		this.lineAddonPayment = lineAddonPayment;
	}

	public String getLineReturnCode() {
		return this.lineReturnCode;
	}

	public void setLineReturnCode(String lineReturnCode) {
		this.lineReturnCode = lineReturnCode;
	}

	public Date getServiceDate() {
		return this.serviceDate;
	}

	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}

	public int getServiceYear() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.serviceDate);
		this.serviceYear = cal.get(Calendar.YEAR);
		return this.serviceYear;
	}

	public void setServiceYear(int serviceYear) {
		this.serviceYear = serviceYear;
	}

	public Integer getLine() {
		return this.line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	public Line(String hcpc, String description,
			String modifier, Date serviceDate,
			String revenueCode, Integer totalUnits,
			Integer coveredUnits, Double coveredCharges,
			String paymentIndicator, String packagingFlag,
			String paymentMethodFlag,
			String lineItemActionFlag,
			String compositeAdjFlag, Double linePayment,
			Double lineMedicareReimbursement,
			Double lineCoinsurance,
			Double lineAddonPayment, String lineReturnCode,
			int serviceYear, Integer line) {
		this.hcpc = hcpc;
		this.description = description;
		this.modifier = modifier;
		this.serviceDate = serviceDate;
		this.revenueCode = revenueCode;
		this.totalUnits = totalUnits;
		this.coveredUnits = coveredUnits;
		this.coveredCharges = coveredCharges;
		this.paymentIndicator = paymentIndicator;
		this.packagingFlag = packagingFlag;
		this.paymentMethodFlag = paymentMethodFlag;
		this.lineItemActionFlag = lineItemActionFlag;
		this.compositeAdjFlag = compositeAdjFlag;
		this.linePayment = linePayment;
		this.lineMedicareReimbursement = lineMedicareReimbursement;
		this.lineCoinsurance = lineCoinsurance;
		this.lineAddonPayment = lineAddonPayment;
		this.lineReturnCode = lineReturnCode;
		this.serviceYear = serviceYear;
		this.line = line;
	}

}