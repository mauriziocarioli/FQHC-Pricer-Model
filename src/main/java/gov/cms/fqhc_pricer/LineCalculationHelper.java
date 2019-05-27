package gov.cms.fqhc_pricer;

import java.io.Serializable;
import org.kie.api.definition.type.*;

public class LineCalculationHelper implements Serializable {

	static final long serialVersionUID = 1L;

	@Description("This object holds parameters derived at the line level")
	private Double baserate;
	private Double addonfactor;
	private Double gftbaserate;

	private Double adjFactor;

	private Integer line;

	private Double roundPpsAmount;

	public LineCalculationHelper() {
	}

	public Double getBaserate() {
		return this.baserate;
	}

	public void setBaserate(Double baserate) {
		this.baserate = baserate;
	}

	public Double getAddonfactor() {
		return this.addonfactor;
	}

	public void setAddonfactor(Double addonfactor) {
		this.addonfactor = addonfactor;
	}

	public Double getGftbaserate() {
		return this.gftbaserate;
	}

	public void setGftbaserate(Double gftbaserate) {
		this.gftbaserate = gftbaserate;
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

	public LineCalculationHelper(Double baserate,
			Double addonfactor, Double gftbaserate,
			Double adjFactor, Integer line,
			Double roundPpsAmount) {
		this.baserate = baserate;
		this.addonfactor = addonfactor;
		this.gftbaserate = gftbaserate;
		this.adjFactor = adjFactor;
		this.line = line;
		this.roundPpsAmount = roundPpsAmount;
	}

}