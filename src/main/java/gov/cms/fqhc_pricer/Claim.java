package gov.cms.fqhc_pricer;

import java.io.Serializable;
import java.util.Date;
import org.kie.api.definition.type.*;

public class Claim implements Serializable {

	static final long serialVersionUID = 1L;

	private String providerNumber;
	private String carrier;
	private String locality;
	@Description("MA-PLAN-AMT")
	private Double maPlanAmount;
	@Description("SRVC-FROM-DATE")
	private Date serviceFromDate;
	private Date serviceThroughDate;
	private Double totalClaimPayment;
	private Double totalMedicareReimbursement;
	private String claimReturnCode;
	private Double totalClaimCoinsurance;

	public Claim() {
	}

	public String getProviderNumber() {
		return this.providerNumber;
	}

	public void setProviderNumber(String providerNumber) {
		this.providerNumber = providerNumber;
	}

	public String getCarrier() {
		return this.carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getLocality() {
		return this.locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public Double getMaPlanAmount() {
		return this.maPlanAmount;
	}

	public void setMaPlanAmount(Double maPlanAmount) {
		this.maPlanAmount = maPlanAmount;
	}

	public Date getServiceFromDate() {
		return this.serviceFromDate;
	}

	public void setServiceFromDate(Date serviceFromDate) {
		this.serviceFromDate = serviceFromDate;
	}

	public Date getServiceThroughDate() {
		return this.serviceThroughDate;
	}

	public void setServiceThroughDate(Date serviceThroughDate) {
		this.serviceThroughDate = serviceThroughDate;
	}

	public Double getTotalClaimPayment() {
		return this.totalClaimPayment;
	}

	public void setTotalClaimPayment(Double totalClaimPayment) {
		this.totalClaimPayment = totalClaimPayment;
	}

	public Double getTotalMedicareReimbursement() {
		return this.totalMedicareReimbursement;
	}

	public void setTotalMedicareReimbursement(
			Double totalMedicareReimbursement) {
		this.totalMedicareReimbursement = totalMedicareReimbursement;
	}

	public String getClaimReturnCode() {
		return this.claimReturnCode;
	}

	public void setClaimReturnCode(String claimReturnCode) {
		this.claimReturnCode = claimReturnCode;
	}

	public Double getTotalClaimCoinsurance() {
		return this.totalClaimCoinsurance;
	}

	public void setTotalClaimCoinsurance(Double totalClaimCoinsurance) {
		this.totalClaimCoinsurance = totalClaimCoinsurance;
	}

	public Claim(String providerNumber, String carrier,
			String locality, Double maPlanAmount,
			Date serviceFromDate, Date serviceThroughDate,
			Double totalClaimPayment,
			Double totalMedicareReimbursement,
			String claimReturnCode,
			Double totalClaimCoinsurance) {
		this.providerNumber = providerNumber;
		this.carrier = carrier;
		this.locality = locality;
		this.maPlanAmount = maPlanAmount;
		this.serviceFromDate = serviceFromDate;
		this.serviceThroughDate = serviceThroughDate;
		this.totalClaimPayment = totalClaimPayment;
		this.totalMedicareReimbursement = totalMedicareReimbursement;
		this.claimReturnCode = claimReturnCode;
		this.totalClaimCoinsurance = totalClaimCoinsurance;
	}

}