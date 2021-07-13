package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Taxpayers;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Taxpayers>	 list 			= new ArrayList<Taxpayers>();
		List<Individual> listIndividual = new ArrayList<Individual>();
		List<Company>	 listCompany	= new ArrayList<Company>();
		
		System.out.print("Enter the number of taxpayers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Taxpayer #" + i + " data: ");
			
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if(type == 'i') {
				
				System.out.print("Helth expenses: ");
				double helthExpenses = sc.nextDouble();
				
				Individual individual = new Individual(name, annualIncome, helthExpenses);
				list.add(individual);
				listIndividual.add(individual);
				
			}
			
			else if(type == 'c') {
				
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				Company company = new Company(name, annualIncome, numberOfEmployees);
				list.add(company);
				listCompany.add(company);
				
			}
			
		}
		
		System.out.println();
	
		double sum = 0.0;
		
		System.out.println("Lista geral: ");
		for(Taxpayers tax: list) {
			System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.taxesPaid()));
			
		}
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		
		System.out.println("Lista de Pessoas física: ");
		for(Individual tax: listIndividual) {
			System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.taxesPaid()));
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Lista de Pessoas Jurídica: ");
		for(Company tax: listCompany) {
			System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.taxesPaid()));
		}
		
		System.out.println();
		System.out.println();
		
		// calc of total taxes
		for(Taxpayers tax: list) {
			sum += tax.taxesPaid();
		}
		
		System.out.printf("TOTAL TAXES: %.2f\n", sum);
		
		sc.close();

	}

}
