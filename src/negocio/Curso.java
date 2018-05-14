package negocio;

public class Curso {
	private String nome;
	private int qtdHoras;
	
	public Curso(String nome, int qtdHoras) {
		super();
		this.nome = nome;
		this.qtdHoras = qtdHoras;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdHoras() {
		return qtdHoras;
	}
	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	@Override
	public String toString() {
		return String.format("Nome: %s\nQuantidade de horas: %d\n", this.nome, this.qtdHoras);
	}
}
