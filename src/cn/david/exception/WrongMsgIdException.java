package cn.david.exception;

public class WrongMsgIdException extends RuntimeException {

	public WrongMsgIdException() {
	}

	public WrongMsgIdException(String arg0) {
		super(arg0);
	}

	public WrongMsgIdException(Throwable arg0) {
		super(arg0);
	}

	public WrongMsgIdException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public WrongMsgIdException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
