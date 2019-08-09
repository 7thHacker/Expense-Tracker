package com.sevenththHacker.expensesTracker.exceptions;

public class NoExpensesFoundException extends Exception{

	private static final long serialVersionUID = -5470558029978046316L;

	public NoExpensesFoundException() {
		super();
	}
	
	public NoExpensesFoundException(String msg) {
		super(msg);
	}

}
