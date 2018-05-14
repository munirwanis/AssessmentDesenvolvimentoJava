package negocio;

import exception.SalarioInvalidoException;

public class Administrativo extends Pessoa {
	double salario;
	
	public Administrativo(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
	}

	public Administrativo(String nome, String cpf, String matricula, double salario) throws SalarioInvalidoException {
		super(nome, cpf, matricula);
		this.setSalario(salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) throws SalarioInvalidoException {
		if (salario < 0) {
			throw new SalarioInvalidoException();
		}
		this.salario = salario;
	}
}
