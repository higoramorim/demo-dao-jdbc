package db;

public class DbException extends RuntimeException{

	/**
	 exceção personalizada
	 */
	private static final long serialVersionUID = 1L;

	public DbException(String msg) {
		super(msg);
	}
}
