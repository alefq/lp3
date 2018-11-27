package afeltes.exceptions;

public class BookingException extends TradingException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1239877554583887525L;
	public static final Double MIN_HOURS = 0.5d;
	public static final Double MAX_HOURS = 100d;

	public BookingException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BookingException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BookingException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BookingException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
