package exception;

public class SalarioInvalidoException extends Exception {

	public SalarioInvalidoException() {
		super("Sal�rio n�o pode ser menor do que zero.");
	}
	
}
