package exception;

public class SalarioInvalidoException extends Exception {

	public SalarioInvalidoException() {
		super("Salário não pode ser menor do que zero.");
	}
	
}
