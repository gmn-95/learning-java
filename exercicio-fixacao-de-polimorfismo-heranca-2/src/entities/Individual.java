package entities;

public class Individual extends Taxpayers {

	private Double healthExpenses;

	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthExpenses) {

		super(name, annualIncome);
		this.healthExpenses = healthExpenses;

	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double taxesPaid() {

		double taxes = 0.0;

		if (getAnnualIncome() < 20000.00) {

			taxes = getHealthExpenses() != 0 ? (getAnnualIncome() * 0.15) - (getHealthExpenses() * 0.50)
					: getAnnualIncome() * 0.15;

		} else if (getAnnualIncome() >= 20000.00) {
			
			taxes = getHealthExpenses() != 0 ? (getAnnualIncome() * 0.25) - (getHealthExpenses() * 0.50)
					: getAnnualIncome() * 0.25;

		}

		taxes = taxes <= 0 ? taxes = 0.0 : taxes;

		return taxes;

	}

}
