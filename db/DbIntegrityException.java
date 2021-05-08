package db;

public class DbIntegrityException extends RuntimeException{

	/**
	 * PREVENÇÃO DE EXCEÇÃO POR INTEGRIDADE
	 */
	private static final long serialVersionUID = 1L;
	
	public DbIntegrityException(String msg) {
		super(msg);
	}
}
