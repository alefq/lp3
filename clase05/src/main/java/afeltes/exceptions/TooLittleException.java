package afeltes.exceptions;

import py.edu.uca.lp3.clase02.Alumno;

public class TooLittleException extends TradingException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3509589430943507819L;
	public static final Double MIN_WEIGHT = 0.01;

	public TooLittleException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TooLittleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public TooLittleException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TooLittleException(String message) {
		super(message);
		setManager(new Alumno("Osvald", "Manager", 33));
	}

	public TooLittleException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
