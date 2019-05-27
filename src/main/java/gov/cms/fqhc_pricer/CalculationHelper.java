package gov.cms.fqhc_pricer;

import java.io.Serializable;

public class CalculationHelper implements Serializable {

	static final long serialVersionUID = 1L;

	private Double gafs2017Rate;

	private Double gafs2018Rate;

	private Double gafs2018RevisedRate;

	private Double gafs2019Rate;

	public CalculationHelper() {
	}

	public CalculationHelper(Double gafs2017Rate, Double gafs2018Rate, Double gafs2018RevisedRate, Double gafs2019Rate) {
		this.gafs2017Rate = gafs2017Rate;
		this.gafs2018Rate = gafs2018Rate;
		this.gafs2018RevisedRate = gafs2018RevisedRate;
		this.gafs2019Rate = gafs2019Rate;
	}

	public Double getGafs2017Rate() {
		return this.gafs2017Rate;
	}

	public void setGafs2017Rate(Double gafs2017Rate) {
		this.gafs2017Rate = gafs2017Rate;
	}

	public Double getGafs2018Rate() {
		return this.gafs2018Rate;
	}

	public void setGafs2018Rate(Double gafs2018Rate) {
		this.gafs2018Rate = gafs2018Rate;
	}

	public Double getGafs2018RevisedRate() {
		return this.gafs2018RevisedRate;
	}

	public void setGafs2018RevisedRate(Double gafs2018RevisedRate) {
		this.gafs2018RevisedRate = gafs2018RevisedRate;
	}

	public Double getGafs2019Rate() {
		return this.gafs2019Rate;
	}

	public void setGafs2019Rate(Double gafs2019Rate) {
		this.gafs2019Rate = gafs2019Rate;
	}

}