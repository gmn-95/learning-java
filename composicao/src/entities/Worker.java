package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String 		name;
	private WorkerLevel level;
	private Double		baseSalary;
	
	// associações Department e HourContract
	Department department;
	List<HourContract> contracts = new ArrayList<HourContract>(); // composição "tem-muitos", não se adiciona no construtor, apenas cria-se uma
																// lista vazia
	
	public Worker() {
	}

	public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department department) {

		this.name 		= name;
		this.level 		= workerLevel;
		this.baseSalary = baseSalary;
		this.department = department;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	// fazer associação ao contrato
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	// desfazer associação ao contrato
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	// calcular o valor que o trabalhador recebeu de acordo com os contratos
	// determinado por mês e ano
	public double income(int month, int year) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c: contracts) {
			cal.setTime(c.getDate());
			int c_month = 1 + cal.get(Calendar.MONTH);
			int c_year 	= cal.get(Calendar.YEAR);
			
			if(month == c_month && year == c_year) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
}
