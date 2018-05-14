package negocio;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String matricula;
	
	protected Pessoa(String nome, String cpf, String matricula) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s\nCPF: %s\nMatrícula: %s\n", this.getNome(), this.getCpf(), this.getMatricula());
	}
}
