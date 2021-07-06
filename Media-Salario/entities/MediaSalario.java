package entities;

public class MediaSalario {
	
	private double salario;
	private int quantidadePessoa;
	private double mediaSalario;
	
	public MediaSalario() {
	}
	
	public MediaSalario(double salario, int quantidadePessoa) {
		this.salario = salario;
		this.quantidadePessoa = quantidadePessoa;
		mediaSalario = 0;

	}

	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario += salario;
	}


	public int getQuantidadePessoa() {
		return quantidadePessoa;
	}


	public void setQuantidadePessoa(int quantidadePessoa) {
		this.quantidadePessoa += quantidadePessoa;
	}


	public double getMediaSalario() {
		mediaSalario = salario / quantidadePessoa;
		if((mediaSalario == mediaSalario) == false) {
			return 0;
		}
		else {
			return mediaSalario;
		}
		
	}
	
	
	
}
