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

	@Override
	public String toString() {
		String result = "Administrativo:\n";
		result += super.toString();
		result += String.format("Salário: %.2f\n", this.getSalario());
		return result;
	}

	@Override
	public int compareTo(Administrativo o) {
		return super.compareTo(o);
	}

	@Override
	public int compareTo(Pessoa o) {
		if (o instanceof Administrativo) {
			Administrativo a = (Administrativo) o;
			if (this.salario == a.getSalario()) {
				return 0;
			} else if (this.salario > a.getSalario()) {
				return 1;
			} else {
				return -1;
			}
		}
		return -1;
	}
}
