package gov.cms.fqhc_pricer;

import java.io.Serializable;
import org.kie.api.definition.type.*;

public class LineCalculationHelper implements Serializable {

	static final long serialVersionUID = 1L;

	@Description("This object holds parameters derived at the line level")
	private Double baseRate;
	private Double addonFactor;
	private Double gftBaseRate;
	private Double adjFactor;
	private Integer line;
	private Double roundPpsAmount;
	private Double baseCoinsuranceAmount;

	public LineCalculationHelper() {
	}

	public LineCalculationHelper(Double baseRate, Double addonFactor, Double gftBaseRate, Double adjFactor, Integer line, Double roundPpsAmount, Double baseCoinsuranceAmount) {
		this.baseRate = baseRate;
		this.addonFactor = addonFactor;
		this.gftBaseRate = gftBaseRate;
		this.adjFactor = adjFactor;
		this.line = line;
		this.roundPpsAmount = roundPpsAmount;
		this.baseCoinsuranceAmount = baseCoinsuranceAmount;
	}

	public Double getBaseRate() {
		return this.baseRate;
	}

	public void setBaseRate(Double baseRate) {
		this.baseRate = baseRate;
	}

	public Double getAddonFactor() {
		return this.addonFactor;
	}

	public void setAddonFactor(Double addonFactor) {
		this.addonFactor = addonFactor;
	}

	public Double getGftBaseRate() {
		return this.gftBaseRate;
	}

	public void setGftBaseRate(Double gftBaseRate) {
		this.gftBaseRate = gftBaseRate;
	}

	public Double getAdjFactor() {
		return this.adjFactor;
	}

	public void setAdjFactor(Double adjFactor) {
		this.adjFactor = adjFactor;
	}

	public Integer getLine() {
		return this.line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	public Double getRoundPpsAmount() {
		return this.roundPpsAmount;
	}

	public void setRoundPpsAmount(Double roundPpsAmount) {
		this.roundPpsAmount = roundPpsAmount;
	}

	public Double getBaseCoinsuranceAmount() {
		return baseCoinsuranceAmount;
	}

	public void setBaseCoinsuranceAmount(Double baseCoinsuranceAmount) {
		this.baseCoinsuranceAmount = baseCoinsuranceAmount;
	}

}