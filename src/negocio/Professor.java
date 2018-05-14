package negocio;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
	private double salario;
	private List<Curso> cursos;
	
	public Professor(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
		this.cursos = new ArrayList<Curso>();
	}
	
	public Professor(String nome, String cpf, String matricula, List<Curso> cursos) {
		super(nome, cpf, matricula);
		this.cursos = cursos;
		this.salario = this.calcularSalario();
	}

	private double calcularSalario() {
		double salario = 0;
		for (Curso curso : cursos) {
			salario += 50*curso.getQtdHoras();
		}
		return salario;
	}

	public double getSalario() {
		return salario;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
		this.salario = this.getSalario();
	}

	@Override
	public String toString() {
		String result = super.toString();
		result += String.format("Sal�rio: %.2f\n", this.salario);
		result += "Cursos: \n";
		for (Curso curso : cursos) {
			result += curso.toString() + "\n";
		}
		return result;
	}
	
	
}
