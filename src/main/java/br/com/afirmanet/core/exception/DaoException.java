package br.com.afirmanet.core.exception;

/**
 * <p>
 * Lan�ada para indicar um erro gen�rico em algum DAO.
 * </p>
 */
public class DaoException extends RuntimeException {

	private static final long serialVersionUID = 1072462595077880267L;

	/**
	 * <p>
	 * Constr�i uma DaoException sem mensagem detalhada.
	 * </p>
	 */
	public DaoException() {
		super();
	}

	/**
	 * <p>
	 * Constr�i uma DaoException com a mensagem detalhada especificada.
	 * </p>
	 * 
	 * @param message
	 *        Mensagem que ser� associada com a exce��o.
	 */
	public DaoException(String message) {
		super(message);
	}

	/**
	 * <p>
	 * Constr�i uma DaoException com a causa especificada e a mensagem detalhada
	 * <tt>(cause==null ? null : cause.toString())</tt>
	 * </p>
	 * 
	 * @param cause
	 *        O Throwable que causou o in�cio da exce��o. (Um valor <tt>null</tt> � permitido, e indica que a causa n�o
	 *        existe ou � desconhecida.)
	 */
	public DaoException(Throwable cause) {
		super(cause);
	}

	/**
	 * <p>
	 * Constr�i uma DaoException com a causa e mensagem detalhada especificadas.
	 * </p>
	 * <p>
	 * Observar que a mensagem associada com o throwable <code>cause</code> <i>n�o</i> � automaticamente incorporada na
	 * mensagem detalhada da DaoException.
	 * </p>
	 * 
	 * @param message
	 *        Mensagem que ser� associada com a exce��o.
	 * @param cause
	 *        O Throwable que causou o in�cio da exce��o. (Um valor <tt>null</tt> � permitido, e indica que a causa n�o
	 *        existe ou � desconhecida.)
	 */
	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

}