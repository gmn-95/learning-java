package entities;

public class Company extends Taxpayers {

	private Integer numberOfEmployyes;

	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, Integer numberOfEmployyes) {

		super(name, annualIncome);
		this.numberOfEmployyes = numberOfEmployyes;

	}

	public Integer getNumberOfEmployyes() {
		return numberOfEmployyes;
	}

	public void setNumberOfEmployyes(Integer numberOfEmployyes) {
		this.numberOfEmployyes = numberOfEmployyes;
	}

	@Override
	public double taxesPaid() {

		double taxes = ((numberOfEmployyes >= 10) ? getAnnualIncome() * 0.14 : getAnnualIncome() * 0.16);

		taxes = taxes <= 0 ? taxes = 0.0 : taxes;

		return taxes;

	}

}
