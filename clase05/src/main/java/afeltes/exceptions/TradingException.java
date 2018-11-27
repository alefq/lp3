package afeltes.exceptions;

import py.edu.uca.lp3.clase02.Persona;

public class TradingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 825120267397630372L;
	private Integer code;
	private Persona manager;
	
	public TradingException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TradingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public TradingException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public TradingException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public TradingException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Persona getManager() {
		return manager;
	}

	public void setManager(Persona manager) {
		this.manager = manager;
	}
	

	
	
}
