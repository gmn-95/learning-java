package entities;

public abstract class Taxpayers {
	
	private String name;
	private Double annualIncome;
	
	public Taxpayers() {
	}

	public Taxpayers(String name, Double annualIncome) {
		this.name 			= name;
		this.annualIncome 	= annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double currentIncome) {
		this.annualIncome = currentIncome;
	}
	
	public abstract double taxesPaid();
	
	
}
