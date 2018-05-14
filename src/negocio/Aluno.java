package negocio;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	private List<Curso> cursos;

	public Aluno(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
		this.cursos = new ArrayList<Curso>();
	}

	public Aluno(String nome, String cpf, String matricula, List<Curso> cursos) {
		super(nome, cpf, matricula);
		this.cursos = cursos;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		String result = super.toString();
		result += "Cursos: \n";
		for (Curso curso : cursos) {
			result += curso.toString() + "\n";
		}
		return result;
	}
}
